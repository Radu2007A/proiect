package Util;
import java.io.File;
public class CreationFolderIfNotExit {
    public static void createDirectoryIfNotExists(String filePath){
        File f = new File(filePath);
        f.mkdir();
    }
}
