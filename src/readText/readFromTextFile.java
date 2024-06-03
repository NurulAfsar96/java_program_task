package readText;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class readFromTextFile {


	public static void main(String[] args) {

	
		HashMap<String, Integer> wordsCount = new HashMap<>();
		
		
		try {
			File file = new File("javaFile.txt");
			Scanner sc =new Scanner(file);
			while(sc.hasNext()) {
				String word =sc.next().toLowerCase().replaceAll("[^a-z]", "");
				
				if(!word.isEmpty()) {
					wordsCount.put(word, wordsCount.getOrDefault(word, 0)+1);
				}
				
				
			}
			
			TreeMap<String, Integer> sortedWords =new TreeMap<>(wordsCount);
		
			System.out.println("\nWord counts:");
            for (String key : sortedWords.keySet()) {
                System.out.println(key + ": " + sortedWords.get(key));
                
                sc.close();
	}
		}
		catch(Exception e){
			System.out.print(e);
		}

}
}
