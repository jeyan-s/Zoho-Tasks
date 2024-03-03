package rainbowcoderunner;

import rainbowcolors.RainbowColor;

public class RainbowColorCodeRunner
{
	public static void main(String[] a)
	{
		RainbowColor[] colors = RainbowColor.values();
		for (RainbowColor color: colors)
		{
			System.out.println("Color code of " + color + " is " + color.getColorCode());
			System.out.println("Ordinal of " + color + " is " + color.ordinal());
			System.out.println();
		}
	}
}