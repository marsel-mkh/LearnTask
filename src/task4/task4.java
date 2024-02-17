package task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class task4 {
    private static void avg(List<Integer> list){
        int sum = 0;
        for (int i : list){
            sum += i;
        }
        int avg = Math.round((float) sum / list.size());
        int num = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (Math.abs(list.get(i) - avg) < Math.abs(num - avg))
                num = list.get(i);
        }
        int res = 0;
        for (int i : list){
            res += Math.abs(i - num);
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            List<Integer> l = new ArrayList<>();
            String str;
            while ((str = br.readLine()) != null) {
                l.add(Integer.parseInt(str));
            }
            avg(l);
        }
    }

}
