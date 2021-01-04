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
    static Integer k;

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
    static List<Integer> hamming = new ArrayList<>();
    static List<List<Integer>> hammingFin = new ArrayList<>();

    private static List<List<Integer>> hammingDist(){
        for (int i = 0; i < ind.size(); i ++){
            in = ind.get(i);
            cluster2 = cluster1.get(i);
            //System.out.println("cluster ke-" + (i + 1) + " pada indeks ke-" + in + "->" + cluster2);

            hamming = new ArrayList<>();
            for (int j = 0; j < result.size(); j++){
                instansi = result.get(j);
                //System.out.println("instansi " + j + ": " + instansi);

                ham = 0;
                for (int k = 0; k < instansi.size(); k++){
                    //System.out.println(instansi.get(k));
                    //System.out.println(cluster2.get(k) + "\n");
                    if(!instansi.get(k).equals(cluster2.get(k))){
                        ham++;
                    }
                    
                    //System.out.println(cluster1.get(k) + "\n");
                }
                hamming.add(ham);
                //System.out.println("hamming: " + ham +"\n" + "-----");
            }
            hammingFin.add(hamming);
            //System.out.println(hammingFin);
            
        }

        return hammingFin;
    }

    static List<Integer> apaan = new ArrayList<>();
    static List<Integer> aaa = new ArrayList<>();
    static int coba;
    private static List<Integer> assignCentroid(){
        for (int i = 0; i < hammingFin.size()-1; i++){
            for (int j = i + 1; j < hammingFin.size(); j++){
                apaan = hammingFin.get(i);
                aaa = hammingFin.get(j);
                //System.out.println(apaan + "\n" + aaa + "\n-----");
                /*
                for (int k = 0; k < apaan.size(); k++){
                    coba = apaan.get(k);
                    System.out.println(coba + "\n");
                }
                */
                
            }
        }
        return apaan; //????
    }
    /*
    private static int countModes() {
        return 2;
    }
    */
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("./golfweather.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                result.add(Arrays.asList(values));
            }

            System.out.println(result);

            System.out.println(nilaiK(3));
            System.out.println(hammingDist());
            //System.out.println(assignCentroid());

            //buat random utk k
            //String elCluster;
            
            //System.out.println(cluster + "\n");
           

            //buat hamming
            //for every rows in result
                //for every element in list
                    //if element != cluster element
                        //hamming++
            
            //}
            //for (int x = 0; x < cluster.size(); x++){
            //    elCluster = cluster.get(x);
            //    cl.add(elCluster);
                //System.out.println(elCluster + "+");
            //}
            
        }
    }
}

