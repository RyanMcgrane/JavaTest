package ie.dit;

public abstract class Tune implements Player
{

	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	public void Player()
	{
		System.out.println("\n"+ notation);
	}
	
	public int getx()
	{
		return x;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAltTitle()
	{
		return altTitle;
	}
	
	public String getNotation()
	{
		return notation;
	}

	public String toString()
	{
		return "'" + x + ", " + title + ", " + altTitle + "'";
	}


}