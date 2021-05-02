package april.tag;

/** Tag family with 16 distinct codes.
    bits: 24,  minimum hamming: 10

    Max bits corrected       False positive rate
            0                  0.00009537 %
            1                  0.00238419 %
            2                  0.02870560 %
            3                  0.22172928 %
            4                  1.23510361 %

    Generation time: 10.685000 s

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
      10  82
      11  28
      12  10
      13  0
      14  0
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
			return new long[] { 0xc4f750L, 0xcc2b3dL, 0x5b3102L, 0x87a466L, 0xa9305bL, 0xb2a8ddL, 0x25e7adL, 0xd2c5e5L, 0x2f2d18L, 0x0e898fL, 0xf92614L, 0x12bb38L, 0xbd6efaL, 0xd4798bL, 0x815cbfL, 0x225809L };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[16];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 16);
		return codes;
	}

	public TagCustom24h10()
	{
		super(ImageLayout.Factory.createFromString("Custom", "ddddddddwwwwwddwbbbwddwbxbwddwbbbwddwwwwwdddddddd"), 10, constructCodes());
	}
}

