package cidadePais;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


import org.apache.commons.io.FileUtils;

public class cidadePais {
	
	static File file = new File("cidade_pais.txt");
	
	
	private static String userInput;


	private static List<String> content;


	private static String procura;
	
	private static boolean inFile;

    
    public static void main(String[] args) throws IOException  {
        

    	
    	
    	escreverFile();
    	
    	Listar();
    	
    	Procurar();
        
    }

	

	private static void escreverFile() throws IOException {
		// TODO Auto-generated method stub
		
		userInput = JOptionPane.showInputDialog(null, "Escreve cidade,pais");
		System.out.println(userInput);
		FileWriter mw = new FileWriter("cidade_pais.txt", true);
    	PrintWriter pw = new PrintWriter (mw);
	while(userInput != null && userInput.length() > 0) {
		
				mw.write(userInput + "\n" );
				escreverFile();
				
	}
	pw.close();	
}
		

	private static void Listar() throws IOException {
		// TODO Auto-generated method stub
		
		 JFrame frame = new JFrame("Listagem das cidade,pais: ");

		
		String path = "cidade_pais.txt";
		 
		  content = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
		 
		  System.out.println(content);
		  JOptionPane.showMessageDialog(frame, "Listagem das cidade,pais:  \n" + content);
 
	
	}
	
	
	
		
	private static void Procurar() throws IOException {
		// TODO Auto-generated method stub
		
		
		String ficheiro = "cidade_pais.txt";
		procura = JOptionPane.showInputDialog(null, "Escreve o pais que deseja procurar: ");
		
		
		String[] words = null;
		
		FileReader fr = new FileReader(ficheiro);  //Creation of File Reader object
	      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	      String s;     
	      int count=0;   //Intialize the word to zero
	     
	      
	      
	      
	      
	      while((s=br.readLine())!=null)   //Reading Content from the file
	      {
	        words=s.split(",");  //Split the word using space
	     //     for (String word : words) 
	     //     {
	                 if (words.equals(procura) == true)   //Search for the given word
	                 {
	                	 System.out.println(s);
	                	 
	                   count++;    //If Present increase the count by one
	                   
	                   JFrame frame = new JFrame("Listagem das cidades de '" + words + "': ");
	                	 JOptionPane.showMessageDialog(frame, "Listagem das cidades de '" + words + "':\n " + s);
	                 }
	          }
	    //  }
	    
	      
	         fr.close();
}	
}			
		
		








