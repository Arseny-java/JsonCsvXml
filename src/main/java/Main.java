import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, ParseException {
        File dataCsv = new File("D:\\JavaProjects\\JsonCsvXml\\data.csv");
        File jsonCsv = new File("D:\\JavaProjects\\JsonCsvXml\\data1.json");
        File dataXml = new File("D:\\JavaProjects\\JsonCsvXml\\data.xml");
        File jsonXml = new File("D:\\JavaProjects\\JsonCsvXml\\data2.json");
        File jsonParser = new File("D:\\JavaProjects\\JsonCsvXml\\data2.json");

        CsvJson.csvJson(dataCsv.getAbsolutePath(), jsonCsv.getAbsolutePath());
        XmlJson.xmlJson(dataXml.getAbsolutePath(),jsonXml.getAbsolutePath());
        JsonParser.jsonParser(jsonParser.getAbsolutePath());
    }
}
