package primera;
import java.util.HashMap; // import the HashMap class

public class Format {

    static HashMap<String, String> trasnlateMap = new HashMap<>();

    private static void initMap(){
        trasnlateMap.put("%M", "lo");
        trasnlateMap.put("%W", "que");
        trasnlateMap.put("%e", "vaya");
        trasnlateMap.put("%Y", "aqui");
    }

    public static String formatter (String datetime, String format) {
        initMap();

        String[] array = format.split(" ");
        String res = "";


        // iterate over array to return the values that represent the given values in format
        for(int i = 0; i < array.length; i++) {
            System.out.print(trasnlateMap.get(array[i]) + " ");
            res += trasnlateMap.get(array[i]) + " " ;
        }
        return res;
    }
}
