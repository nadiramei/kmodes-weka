import java.io.*;
import java.util.*;
import java.util.Random;

public class kModes {
    private final static String COMMA_DELIMITER = ",";
    //private int k;
    //private static String elCluster;
    private static int ham;
    private static List<List<String>> result = new ArrayList<>();
    private static List<String> cluster = new ArrayList<>();
    static int indeks;

    private static int nilaiK (int k){
        for (int i = 0; i < k; i ++){
            Random random = new Random();
            indeks = random.nextInt(result.size());
            //System.out.println(indeks);
            cluster = result.get(indeks);
            System.out.println(indeks + "\n" + cluster + "\n" + "===");
        }
        return indeks;
        
    } 

    private static int hammingDist (){
        for (int i = 0; i < result.size(); i++){
            List<String> instansi = result.get(i); //new ArrayList<String[]>();
            System.out.println(instansi);
            //for (int j = 0; j < instansi.size(); j++){
            //    elemen = instansi.get(j);
                //System.out.println(elemen + "-");
           // }
            System.out.println(cluster);
            
            ham = 0;
            for (int j = 0; j < instansi.size(); j++){
                //elemen = instansi.get(j);
                
                if(!instansi.get(j).equals(cluster.get(j))){
                    ham++;
                }
                
            }
            System.out.println(ham);
            System.out.println("-----");
        }
        return ham;
    }
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("./golfweather.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                result.add(Arrays.asList(values));
            }

            System.out.println(result);

            System.out.println(nilaiK(2));
            System.out.println(hammingDist());

            //buat random utk k
            //String elCluster;
            
            //System.out.println(cluster + "\n");
           

            //buat hamming
            //for every rows in result
                //for every element in list
                    //if element != cluster element
                        //hamming++
            
            List<String> ins = new ArrayList<String>();
            List<String> cl = new ArrayList<String>();

            
            //}
            //for (int x = 0; x < cluster.size(); x++){
            //    elCluster = cluster.get(x);
            //    cl.add(elCluster);
                //System.out.println(elCluster + "+");
            //}
            
        }
    }
}

