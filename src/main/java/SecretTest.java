import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Ruchika Ahuja on 07/19/2017.
 */
public class SecretTest {

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String secretMessage = scan.nextLine();
        String filePath = "C://Users/Ruchika Ahuja/article.txt";
        String [] test = secretMessage.toLowerCase().split(" ");
        boolean status = false;
        HashMap<String,Integer> secretMap;
        HashMap<String,Integer> articleMap;
        ArrayList<String> temp_list  = new ArrayList<String>();
        HashMapConversionUtility util = new HashMapConversionUtility();
        CheckforSecretMsg result = new CheckforSecretMsg();
        secretMap = util.convertToHashMap(test);
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while((currentLine = reader.readLine()) != null)
            {

                temp_list.addAll(Arrays.asList(currentLine.toLowerCase().split(" ")));
            }
        }catch (IOException ex)
        {
            ex.printStackTrace();
        }
       /* for(String s:temp_list)
            System.out.print(s + " ");*/
        articleMap = util.convertToHashMap(temp_list);
        System.out.println(secretMap.keySet());
        System.out.println(secretMap.values());
        System.out.println(articleMap.keySet());
        System.out.println(articleMap.values());

        status = result.secretStringsExists(secretMap,articleMap);
        System.out.println(status);
    }
}
