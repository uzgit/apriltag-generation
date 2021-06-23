#include <stdlib.h>
#include "tagCustom28h11.h"

static uint64_t codedata[23] = {
   0x000000000236655eUL,
   0x00000000065ba4d5UL,
   0x000000000562d8c2UL,
   0x00000000050fea11UL,
   0x00000000046a0cafUL,
   0x000000000cb48b9dUL,
   0x000000000b15e228UL,
   0x000000000ee832eeUL,
   0x00000000086d8d1aUL,
   0x000000000bcb3023UL,
   0x000000000d01be9aUL,
   0x000000000e625215UL,
   0x000000000b28f85cUL,
   0x000000000b9d1f82UL,
   0x0000000005afa5bdUL,
   0x000000000f5c96fbUL,
   0x0000000003743685UL,
   0x0000000004ae0312UL,
   0x0000000008702824UL,
   0x0000000001cbb750UL,
   0x000000000af298f7UL,
   0x000000000913d414UL,
   0x000000000f3a4666UL,
};
apriltag_family_t *tagCustom28h11_create()
{
   apriltag_family_t *tf = calloc(1, sizeof(apriltag_family_t));
   tf->name = strdup("tagCustom28h11");
   tf->h = 11;
   tf->ncodes = 23;
   tf->codes = codedata;
   tf->nbits = 28;
   tf->bit_x = calloc(28, sizeof(uint32_t));
   tf->bit_y = calloc(28, sizeof(uint32_t));
   tf->bit_x[0] = 1;
   tf->bit_y[0] = -2;
   tf->bit_x[1] = 2;
   tf->bit_y[1] = -2;
   tf->bit_x[2] = 3;
   tf->bit_y[2] = -2;
   tf->bit_x[3] = 4;
   tf->bit_y[3] = -2;
   tf->bit_x[4] = 1;
   tf->bit_y[4] = 1;
   tf->bit_x[5] = 2;
   tf->bit_y[5] = 1;
   tf->bit_x[6] = 3;
   tf->bit_y[6] = 1;
   tf->bit_x[7] = 7;
   tf->bit_y[7] = 1;
   tf->bit_x[8] = 7;
   tf->bit_y[8] = 2;
   tf->bit_x[9] = 7;
   tf->bit_y[9] = 3;
   tf->bit_x[10] = 7;
   tf->bit_y[10] = 4;
   tf->bit_x[11] = 4;
   tf->bit_y[11] = 1;
   tf->bit_x[12] = 4;
   tf->bit_y[12] = 2;
   tf->bit_x[13] = 4;
   tf->bit_y[13] = 3;
   tf->bit_x[14] = 4;
   tf->bit_y[14] = 7;
   tf->bit_x[15] = 3;
   tf->bit_y[15] = 7;
   tf->bit_x[16] = 2;
   tf->bit_y[16] = 7;
   tf->bit_x[17] = 1;
   tf->bit_y[17] = 7;
   tf->bit_x[18] = 4;
   tf->bit_y[18] = 4;
   tf->bit_x[19] = 3;
   tf->bit_y[19] = 4;
   tf->bit_x[20] = 2;
   tf->bit_y[20] = 4;
   tf->bit_x[21] = -2;
   tf->bit_y[21] = 4;
   tf->bit_x[22] = -2;
   tf->bit_y[22] = 3;
   tf->bit_x[23] = -2;
   tf->bit_y[23] = 2;
   tf->bit_x[24] = -2;
   tf->bit_y[24] = 1;
   tf->bit_x[25] = 1;
   tf->bit_y[25] = 4;
   tf->bit_x[26] = 1;
   tf->bit_y[26] = 3;
   tf->bit_x[27] = 1;
   tf->bit_y[27] = 2;
   tf->width_at_border = 6;
   tf->total_width = 10;
   tf->reversed_border = true;
   return tf;
}

void tagCustom28h11_destroy(apriltag_family_t *tf)
{
   free(tf->bit_x);
   free(tf->bit_y);
   free(tf->name);
   free(tf);
}
