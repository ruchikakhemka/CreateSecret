import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ruchika Ahuja on 07/19/2017.
 */
public class HashMapConversionUtility {

    HashMap<String,Integer> secretStrings = new HashMap<String,Integer>();
    HashMap<String,Integer> articleStrings = new HashMap<String,Integer>();
    Integer occurence = 1;

    public HashMap convertToHashMap(String [] array)

    {
        for(String s:array)
        {
            if(secretStrings.containsKey(s))
            {
                secretStrings.put(s,secretStrings.get(s)+1);
            }
            else
                secretStrings.put(s,occurence);
        }
      return secretStrings;
    }
    public HashMap convertToHashMap(ArrayList<String> arrayList)
    {
        for(String s:arrayList)
        {
            if(articleStrings.containsKey(s))
            {
                articleStrings.put(s,articleStrings.get(s)+1);
            }
            else
                articleStrings.put(s,occurence);
        }
        return articleStrings;
    }
}
