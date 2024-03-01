package belajarsendiri;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas2no3 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        int  c [][] = new int [4][4];
        System.out.println("masukkan angka : ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = tisa.nextInt();
            }
            
    }
        System.out.println(Arrays.deepToString(c));
            
    
}
}