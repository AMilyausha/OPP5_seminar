import java.io.*;
public class Log {
 
    // String FILE_PATH = "./src/main/java/org/phonebook/";
    // String FILE_NAME_EXPORT = "log.csv";
    // String FILE_PATH_FULL = FILE_PATH+FILE_NAME_EXPORT;
    public void LogText(String log){
        Path path = Paths.get("C:\\Users\\user\\Desktop\\OPP_5_SEM\\log.csv");
        try {
            Files.write(path, log, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
  
   

