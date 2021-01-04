import java.io.*;
import java.util.*;
import java.util.Random;

public class kModes {
    private final static String COMMA_DELIMITER = ",";

    private static int ham;
    private static List<List<String>> result = new ArrayList<>();
    private static List<String> cluster = new ArrayList<>();
    static int indeks;
    static List<Integer> ind = new ArrayList<>();
    static List<List<String>> cluster1 = new ArrayList<>();

    private static List<Integer> nilaiK (int k){
        for (int i = 0; i < k; i ++){
            Random random = new Random();
            indeks = random.nextInt(result.size());
            cluster = result.get(indeks);
            //System.out.println("indeks: " + indeks + "\n" + cluster + "\n");
            ind.add(indeks);
            cluster1.add(cluster);
            //System.out.println("cluster: " + cluster1);
        }
        return ind;
    } 

    static int in;
    static List<String> instansi = new ArrayList<>();
    static List<String> cluster2 = new ArrayList<>();
    
    private static int hammingDist(){
        for (int i = 0; i < ind.size(); i ++){
            in = ind.get(i);
            cluster2 = cluster1.get(i);
            System.out.println("cluster ke-" + (i + 1) + " pada indeks ke-" + in + "->" + cluster2);

            for (int j = 0; j < result.size(); j++){
                instansi = result.get(j);
                System.out.println("instansi " + j + ": " + instansi);

                for (int k = 0; k < instansi.size(); k++){
                    System.out.println(instansi.get(k));
                    System.out.println(cluster2.get(k)+"\n" + "-----");
                    //System.out.println(cluster1.get(k) + "\n");
                }
            }

            
            
        }

        /*
        for (int i = 0; i < result.size(); i++){
            List<String> instansi = result.get(i);
            System.out.println(instansi);
            System.out.println(cluster);
            for (int j = 0; j < ind.size(); j++){
                in = ind.get(j);
               // System.out.println(in);
            }
            
            List<String> instansi = result.get(i);
            System.out.println(instansi);
            System.out.println(cluster);
            
            ham = 0;
            for (int l = 0; l < instansi.size(); l++){
                //elemen = instansi.get(j);
                
                if(!instansi.get(j).equals(cluster.get(j))){
                    ham++;
                }
                
            }
            System.out.println(ham);
            System.out.println("-----");
            */
        return 2;
    }

    private static int assignCentroid(){
        return 1;
    }

    private static int countModes() {
        return 2;
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

