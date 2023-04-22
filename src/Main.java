/**
 * @author fazliberkordek
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        // n ^4 and n^5  demek 4 ve 5 in katları olacak demek. yani hem 4 ün hem de 5 in derecesi demek.
        /*for (int i = 1, j = 1; i < num && j < num; i *= 4, j *= 5) {

            System.out.println("i :"+ i + "j:" + j);
        }*/
        int i = 1,j=1;
        while (i<num && j<num){
            System.out.println("i :" + i + "j :" + j);
            i*=4;j*=5;
        }




    }


}
