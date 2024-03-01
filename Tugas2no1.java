package belajarsendiri;

import java.util.Arrays;

public class Tugas2no1 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        double b [] = {1.2,2.2,2.3};
        float c [] = {2.4f,2.5f,2.6f,2.7f};
        char d [] = {'E','N','H','Y','P','E','N'};
        long e [] = {12,33,45,65};
        short f [] = {5,6,7,8};
        byte g [] = {1,2,3,4,5};
        boolean h [] = {true,false};
        
        System.out.println("For : ");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
            
        }
        System.out.println("For each : ");
        for(int i : a){
            System.out.println(i);
        }
        System.out.println("Kelas Array : ");
        System.out.println(Arrays.toString(b));
        
        System.out.println("While : ");
        int j = 0;
        while(j < c.length){
            System.out.println(c[j]);
            j++;
        }
        System.out.println("index : ");
        System.out.println(e[2]);
        
      
    }
    
}
