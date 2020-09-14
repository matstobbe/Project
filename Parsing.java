package parsing;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Parsing {
	
	public static String COMMA_DELIMITER = ",";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> records = new ArrayList<>();
		try(Scanner scanner = new Scanner(new File ("Sample.csv"));) {
			while (scanner.hasNextLine()) {
				records.add(getRecordFromLine(scanner.nextLine()));
			}
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		List<String>personsWithA = new ArrayList <String>();
		
		
	   for (int i = 0; 1 < records.size(); i++) {
		   List<String> localValues = records.get(i);
		   
       if (localValues.get(1).toLowerCase().contains("a")) {
    	   personsWithA.add(localValues.get(1));
    	   
       if (localValues.get(2).toLowerCase().contains("a")) {
    	   personsWithA.add(localValues.get(2));
      }
       
     }
       for (String b : personsWithA) {
    	   System.out.println(b);
       }
       List<String>personsWorkWith = new ArrayList <String>();
       List<List<String>> Working = new ArrayList<>();
       
       for (int y = 0; 1 < Working.size(); i++) {
		   List<String> localWorker = records.get(y);   
		   
       if (localValues.get(1).toLowerCase().contains("Android App")) {
    	   personsWorkWith.add(localWorker.get(1));
    	   
       if (localValues.get(2).toLowerCase().contains("Android App")) {
    	   personsWorkWith.add(localWorker.get(2));
       }
       
       }
       
	   }
	   
	   }
		
	}
    private static List<String> getRecordFromLine(String line){
    	List<String> values = new ArrayList<String>();
    	try (Scanner rowScanner = new Scanner(line)) {
    		rowScanner.useDelimiter(COMMA_DELIMITER);
    		while (rowScanner.hasNext());
    		values.add(rowScanner.next());
    	}
    	
    	System.out.println(values.get(1));
    	System.out.println(values.get(2));
    	
    	
    
    if(values.get(1).contains("a")) {
    	System.out.println("there was an A in the name");
    	
    	if (values.get(2).contains("a")){
    		System.out.println("there was An a in the name");
    	}
     }
     return values;
   }
    
    
    
    
    
}



