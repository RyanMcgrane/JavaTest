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
		
		for(String tune: tunes)
		{
			 sb.append(word + ", ");
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
}

