package ie.dit;

public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	
	public getx()
	{
		return x;
	}
	
	public getTitle()
	{
		return title;
	}
	
	public getAltTitle()
	{
		return altTitle;
	}
	
	public getNotation()
	{
		return notation;
	}

	public String toString()
	{
		return "'" + x + ", " + title + ", " + altTitle + "'";
	}


}