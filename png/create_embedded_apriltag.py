#!/usr/bin/python3

import cv2
import numpy
import sys
import re

bit_side_length = 7
empty_bits = 1

# get files and notify
filenames = sys.argv[1:]
num_tags = len(sys.argv) - 1

family_re = r"tag\d+_\d+"
tag_id_re = r"\d+\.png"

# figure out what to call the output file
family = re.findall(family_re, filenames[0])[0].replace("_", "h")
tag_ids = []
for filename in filenames:
    this_family = re.findall(family_re, filename)[0].replace("_", "h")
    assert this_family == family
    tag_id = str(int(re.findall(tag_id_re, filename)[0].replace(".png", "")))
    tag_ids.append(tag_id)

output_filename = family
for tag_id in tag_ids:
    output_filename += "_{}".format(tag_id)
output_filename += ".png"

print("Creating an embedded apriltag marker with {} files below (order largest to smallest):".format(num_tags))
for filename in filenames:
    print("\t" + filename)


# output pixels is divisable by bit_side_length, num_tags number of times
# output_pixels = (bit_side_length ** num_tags) 
output_pixels = 30 * (bit_side_length ** num_tags)

# calculate pixel sizes and offsets
current_pixel_size = output_pixels
current_offset = 0
pixel_sizes = []
offsets = []
flag = False
for i in range(num_tags):
    pixel_sizes.append(int(current_pixel_size))
    offsets.append(int(current_offset))

#    current_offset += int( current_pixel_size * 3.0 / 7.0 ) 
#    current_pixel_size = int(current_pixel_size / (bit_side_length / float(empty_bits))) 

    current_offset += current_pixel_size * 3 / 7

    if( flag ):
        current_offset += 1
    flag = not flag

    current_pixel_size = current_pixel_size / 7

print("pixel_sizes: {}".format(pixel_sizes))
print("offsets: {}".format(offsets))

# create a canvas
output = numpy.zeros(shape=(output_pixels, output_pixels, 3))

# paint the images into the canvas
for i in range(num_tags):
    print("Processing image {}".format(filenames[i]))

    current_image = cv2.imread(filenames[i])
    current_image = cv2.resize(current_image, dsize=(pixel_sizes[i], pixel_sizes[i]), interpolation=cv2.INTER_NEAREST)

    output[offsets[i]:offsets[i] + pixel_sizes[i], offsets[i]:offsets[i] + pixel_sizes[i], :] = current_image

# output
print("Saving output to {}".format(output_filename))
cv2.imwrite(output_filename, output)
