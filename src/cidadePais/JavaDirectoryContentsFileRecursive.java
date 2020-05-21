package cidadePais;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JavaDirectoryContentsFileRecursive {

    private static List<File> files = new ArrayList<>();
    
    public static void main(String[] args) {

        String dirName = "cidade_pais";

        File file = new File(dirName);
        
        List<File> myfiles = doListing(file);
        
        myfiles.forEach(System.out::println);
    }

    public static List<File> doListing(File dirName) {

        File[] fileList = dirName.listFiles();
        
        for (File file : fileList) {
        
            if (file.isFile()) {
            
                files.add(file);
            } else if (file.isDirectory()) {
            
                files.add(file);
                doListing(file);
            }
        }
        
        return files;
    }
}