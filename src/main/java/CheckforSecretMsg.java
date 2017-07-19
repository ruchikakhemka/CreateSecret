import java.util.HashMap;

/**
 * Created by Ruchika Ahuja on 07/19/2017.
 */
public class CheckforSecretMsg {

    public boolean secretStringsExists(HashMap<String,Integer> secretmap, HashMap<String,Integer> articlemap) {
        boolean result = false;
        try {
            for (String key : secretmap.keySet()) {
                if (articlemap.containsKey(key) && articlemap.get(key) >= secretmap.get(key)) {
                    result = true;
                } else {
                    return false;
                    //return result;
                }

            }
        }catch (NullPointerException ex)
        {
            ex.printStackTrace();
        }
        return result;
    }
}
