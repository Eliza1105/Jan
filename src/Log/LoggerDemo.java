package Log;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo {
    private  final static Logger logger = Logger.getLogger(LoggerDemo.class.getName()); //singleton
    public static void main(String[] args) throws IOException { //мейн ответственен за исключение
        FileReader file = new FileReader("src/data/Hollidays.json");
        JSONTokener tokener = new JSONTokener(file);
        JSONArray holideys = new JSONArray(tokener);
        //System.out.println(holideys.get(0).toString());

        LogManager.getLogManager().reset();
        FileHandler fileHandler;
        fileHandler = new FileHandler("src/data/logFile.log");
        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        //Вывести в лог
        for (Object holiday : holideys){
            String s = ((JSONObject)holiday).getString("name");
            logger.severe(s);

        }
    }
}
