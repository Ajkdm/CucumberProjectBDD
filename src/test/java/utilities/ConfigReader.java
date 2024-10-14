package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	private Properties prop;

	public Properties init_prop() 
	{
		prop=new Properties();
		FileInputStream file;
		try 
		{
			file = new FileInputStream("./Properties/Config.properties");
			prop.load(file);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return prop;
		
	}


}
