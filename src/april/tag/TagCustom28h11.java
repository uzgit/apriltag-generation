package april.tag;

/** Tag family with 23 distinct codes.
    bits: 28,  minimum hamming: 11

    Max bits corrected       False positive rate
            0                  0.00000857 %
            1                  0.00024848 %
            2                  0.00348724 %
            3                  0.03155656 %
            4                  0.20698979 %
            5                  1.04906932 %

    Generation time: 347.882000 s

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
      10  0
      11  101
      12  105
      13  29
      14  14
      15  2
      16  2
      17  0
      18  0
      19  0
      20  0
      21  0
      22  0
      23  0
      24  0
      25  0
      26  0
      27  0
      28  0
**/
public class TagCustom28h11 extends TagFamily
{
	private static class ConstructCodes0 {
		private static long[] constructCodes() {
			return new long[] { 0x236655eL, 0x65ba4d5L, 0x562d8c2L, 0x50fea11L, 0x46a0cafL, 0xcb48b9dL, 0xb15e228L, 0xee832eeL, 0x86d8d1aL, 0xbcb3023L, 0xd01be9aL, 0xe625215L, 0xb28f85cL, 0xb9d1f82L, 0x5afa5bdL, 0xf5c96fbL, 0x3743685L, 0x4ae0312L, 0x8702824L, 0x1cbb750L, 0xaf298f7L, 0x913d414L, 0xf3a4666L };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[23];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 23);
		return codes;
	}

	public TagCustom28h11()
	{
		super(ImageLayout.Factory.createFromString("Custom", "xxxddddxxxxbbbbbbbbxxbwwwwwwbxdbwddddwbddbwdxxdwbddbwdxxdwbddbwddddwbdxbwwwwwwbxxbbbbbbbbxxxxddddxxx"), 11, constructCodes());
	}
}
