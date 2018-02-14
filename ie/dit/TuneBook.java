package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<Tune> tunes = new ArrayList<Tune>();
	
	
	TuneBook(String abc)
	{
		loadTuneBook();
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		
		for(String tune:tunes)
		{
			sb.append(tune + "\n ");
		}
	}
	
	public Tune findTune(String title)
	{
		for(String t:tunes)
        {
		
		}
	}
	
	
	public void loadTuneBook()
    {
		BufferedReader inputStream = null;

        try 
		{
            inputStream = new BufferedReader(new FileReader("hnj0.abc.txt"));
            
            String l;
            while ((l = inputStream.readLine()) != null) 
			{
               
				//adds each tune from text file into the array list
			   tunes.add(l);
			   
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) 
			{
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
	
	
	public static void main(String[] args)
	{
		TuneBook tb = new TuneBook("hnj0.abc.txt");
		System.out.println(tb);
		
		Tune t = tb.findTune("Scotsman over the border");
		t.play();
	}
	
}

