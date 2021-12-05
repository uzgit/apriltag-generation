package april.tag;

/** Tag family with 18 distinct codes.
    bits: 24,  minimum hamming: 10

    Max bits corrected       False positive rate
            0                  0.00010729 %
            1                  0.00268221 %
            2                  0.03229380 %
            3                  0.24944544 %
            4                  1.38949156 %

    Generation time: 22.742000 s

    Hamming distance between pairs of codes (accounting for rotation):

       0  0
       1  0
       2  0
       3  0
       4  0
       5  0
       6  0
       7  0
       8  0
       9  0
      10  128
      11  0
      12  23
      13  0
      14  2
      15  0
      16  0
      17  0
      18  0
      19  0
      20  0
      21  0
      22  0
      23  0
      24  0
**/
public class TagCustom24h10 extends TagFamily
{
	private static class ConstructCodes0 {
		private static long[] constructCodes() {
			return new long[] { 0x35f18bL, 0xe302daL, 0xae1fb3L, 0x5b3102L, 0xeef308L, 0xdf4f58L, 0xe5476fL, 0x1719a5L, 0xe93754L, 0xa91928L, 0x6534e2L, 0xba0b46L, 0xd91f8fL, 0x76195bL, 0xa06d5aL, 0x33c932L, 0x287abeL, 0x60bb23L };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[18];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 18);
		return codes;
	}

	public TagCustom24h10()
	{
		super(ImageLayout.Factory.createFromString("Custom", "ddddddddbbbbbddbwwwbddbwxwbddbwwwbddbbbbbdddddddd"), 10, constructCodes());
	}
}

