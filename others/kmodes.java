import java.lang.reflect.Array;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class kmodes {

    public class ReadCSV {
        public void main(String[] args) {
            String fileName = "D:/car_attribut.csv";
            String delimiter = ";";
            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader(fileName));
                Splitter splitter = Splitter.on(delimiter);
                String s;
                List<String> kolom = null;
                while ((s = br.readLine()) != null) {
                    kolom = Lists.newArrayList(splitter.split(s));
                    for (String sk : kolom) {
                        System.out.print(sk.trim() + "\t");
                    }
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
    }

    // parameter
    // private int m_numClusters;
    public static List<List<String>> randomCluster(int k, List<List<String>> result) {
        System.out.println(result);
        List<List<String>> df = new ArrayList<>();

        List<List<String>> random_k = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            // buat random
            Random random = new Random();
            int indeks = random.nextInt(result.size());
            // System.out.println(indeks);
            List<String> cluster = result.get(indeks);
            random_k.add(result.get(indeks));
            // System.out.println("==============");
            // System.out.println(random_k);
        }
        System.out.println("================================================");
        System.out.println("hasil random = " + random_k);

        return df;

    }
    
    private static List<Integer> assignCentroid() {
        ArrayList<ArrayList<Integer>> centroid = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> Datacount = new ArrayList<Integer>();
        for (int i = 0; i < centroid.size(); i++) {
            Datacount.add(0);
        }

        for (int i = 0; i < centroid.get(0).size(); i++) {
            ArrayList<Integer> data_mut = new ArrayList<Integer>();
            for (int j = 0; j < centroid.size(); j++) {
                data_mut.add(centroid.get(j).get(i));
            }
            int index_min = data_mut.indexOf(Collections.min(data_mut));
            int count_data_min = Datacount.get(index_min) + 1;
            Datacount.set(index_min, count_data_min);
            data_mut.clear();
        }
        System.out.println(Datacount);
        return assignCentroid();
    }
    
    public k_cluster (double instance, string[] k) {
        
    }
}
