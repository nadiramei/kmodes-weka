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

    public k_cluster (double instance, string[] k) {
        
    }
}
