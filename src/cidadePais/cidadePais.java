package cidadePais;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class cidadePais {
    
    public static void main(String[] args) {
        
        String dirName = "/home/janbodnar/tmp/";
        
        List<File> files = (List<File>) FileUtils.listFiles(new File(dirName), null, true);
        
        files.forEach(System.out::println);
    }
}
		
		
		
		
		
		
		
		








