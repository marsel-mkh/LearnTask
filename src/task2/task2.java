package task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }
        try {
            Scanner cs = new Scanner(new File(args[0]));
            float xCenter = cs.nextFloat();
            float yCenter = cs.nextFloat();
            float r = cs.nextFloat();
            cs.close();

            Scanner ps = new Scanner(new File(args[1]));
            while (ps.hasNextFloat()) {
                float xPoint = ps.nextFloat();
                float yPoint = ps.nextFloat();

                float result = (float) Math.sqrt(Math.pow(xPoint - xCenter, 2) + Math.pow(yPoint - yCenter, 2));

                if (result == r) {
                    System.out.println("0 - точка лежит на окружности");
                } else if (result < r) {
                    System.out.println("1 - точка внутри");
                } else {
                    System.out.println("2 - точка снаружи");
                }
            }
            ps.close();

        } catch (FileNotFoundException e) {
            System.out.println();
        }
    }
}