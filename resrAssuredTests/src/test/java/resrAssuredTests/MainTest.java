/**
 * @author abhishekkumar65
 *
 * 
 */
package resrAssuredTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.xml.sax.SAXException;

import com.sun.xml.txw2.Document;

/**
 * @author abhishekkumar65
 *
 */
public class MainTest {
    private  static Properties prop = new Properties();
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
prop = new Properties();
File file = new File("/Users/abhishekkumar65/Documents/RestFullProject/src/test/java/resrAssuredTests/TestDataFile.properties");
FileReader fr= new FileReader(file);
prop.load(fr);
String value = prop.getProperty("country");
System.out.println(value);
MainTest.getValueFromKey();
MainTest.getValueFromXml();
}
    
    public static void getValueFromKey() throws IOException
    {
        File file = new File("/Users/abhishekkumar65/Documents/RestFullProject/src/test/java/resrAssuredTests/TestDataFile.properties");
        FileReader fr = new FileReader(file);
        prop.load(fr);
        String value = prop.getProperty("country");
        System.out.println(value);
    }
    
    public static void getValueFromXml() throws InvalidPropertiesFormatException, IOException, ParserConfigurationException, SAXException {
        File xmlFile = new File("/Users/abhishekkumar65/Documents/RestFullProject/src/test/java/resrAssuredTests/testXmlFile.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document doc = builder.parse(xmlFile);
       //Attr value =  doc.getDocumentElement().getAttributes().getL;
       //System.out.println(value);
        
    }
    
}
