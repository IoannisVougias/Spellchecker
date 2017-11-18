import java.util.Map;
import java.util.TreeMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * This class converts the txt dictionary to a Treemap 
 * @author Konstantinos
 *
 */
public class BuildDictionary {

/**
 * This method encodes the dictionary and after puts every word in a treemap
 * @param choice shows which of the two dictionaries the user will need.
 * @return the appropriate dictionary in a treemap 
 */
	public static Map<Integer, String>  buildDictionary(int choice) {

		Map<Integer, String> dictionary = new TreeMap<Integer, String>();
		

		try {
			BufferedReader reader;
			if (choice == 1) {
				reader = new BufferedReader(new InputStreamReader(new FileInputStream("Greek Dictionary.txt"),"UTF-8")); 
				/* Dictionary.txt should be on the same folder  */
			} else if (choice == 2) {
				reader = new BufferedReader(new InputStreamReader(new FileInputStream("English Dictionary.txt"),"UTF-8")); 
				/* Dictionary.txt should be on the same folder  */
			} else {
				return null;
			}

            String word;
            int key = 0;
            while ((word = reader.readLine()) != null) {
            	dictionary.put(key, word);
            	key++;
            }
        } catch (IOException ioe) {
           ioe.printStackTrace();
       	}

		return dictionary;
	}

}
