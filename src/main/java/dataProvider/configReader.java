package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader
{
    Properties pro;
    public configReader() throws IOException {
        File file =new File("/Users/vimalsingh/IdeaProjects/Selenium/config.property");
        FileInputStream fis =new FileInputStream(file);
        pro= new Properties();
        pro.load(fis);

        }

        public String getBrowser()
        {
        return pro.get("browser").toString();
        }

    public String getURL()
    {
        return pro.get("URL").toString();
    }

    }

