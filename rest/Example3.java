package b6.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Example3 {

	public String example3() throws FileNotFoundException{
		Scanner sc = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\data.txt"));

		Map<Character, ArrayList<String>> wordMap = new HashMap<>();

       
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    char firstChar = word.charAt(0);

                    firstChar = Character.toLowerCase(firstChar);
                    wordMap.computeIfAbsent(firstChar, k -> new ArrayList<>()).add(word);
                	}
            	}
        	}
        
        return wordMap.toString();	
		}
	public String lineWordCount() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\data.txt"));

        Map<Integer, Integer> lineWordCountMap = new HashMap<>();
        int lineNumber = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split("\\s+");
            int wordCount = words.length;
            lineWordCountMap.put(++lineNumber, wordCount);
        }

        return lineWordCountMap.toString();
    
}
	public String example1() throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\id.txt"));
        Scanner sc2 = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\names.txt"));
        Scanner sc3 = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\salary.txt"));
        Scanner sc4 = new Scanner(new File("C:\\Sai Prashanth\\Training Softwares\\rest\\src\\main\\webapp\\exp.txt"));
      Map<Integer, Map<String, String>> mp = new HashMap<>();
        ArrayList<Emp> arr =  new ArrayList<Emp>();
        while(sc1.hasNext()) {
        	String f1 = sc1.nextLine();
        	String[] words1 = f1.split(",");
//        	mp1.put(Integer.parseInt(words1[0]), Integer.parseInt(words1[1]));
        	
        	String f2 = sc2.nextLine();
        	String[] words2 = f2.split(",");
        	
        	String f3 = sc3.nextLine();
        	String[] words3 = f3.split(",");
        	
        	String f4 = sc4.nextLine();
        	String[] words4 = f4.split(",");
        	Map<String, String> mp1 = new HashMap<>();
        	mp1.put("id", words1[1]);
        	mp1.put("name", words2[1]);
        	mp1.put("salary", words3[1]);
        	mp1.put("exp", words4[1]);
        	mp.put(Integer.parseInt(words1[0]), mp1);
        	Emp ob = new Emp(Integer.parseInt(words1[1]),words2[1],Integer.parseInt(words3[1]),Integer.parseInt(words4[1]));
        	arr.add(ob);
        }
        
        return mp.toString();
	}
}
