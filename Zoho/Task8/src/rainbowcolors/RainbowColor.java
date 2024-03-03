package rainbowcolors;

public enum RainbowColor
{
	
	VIOLET(1),
	INDIGO(2),
	BLUE(3),
	GREEN(4),
	YELLOW(5),
	ORANGE(6),
	RED(7);
	
	private final int colorCode;
	
	private RainbowColor(int colorCode)
	{
		this.colorCode = colorCode;
	}
	
	public int getColorCode()
	{
		return this.colorCode;
	}
}