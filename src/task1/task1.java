package task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int interval = in.nextInt();
        //проверка
        if(length<=0 || interval<=0){
            return;
        }
        //проходка
        int elements = 1;
        do {
            System.out.print(elements);
            elements = (elements + interval - 2) % length + 1;
        }while (elements !=1);
    }
}
