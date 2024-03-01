package belajarsendiri;

import java.util.ArrayList;

public class Tugas2no5 {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList <Integer> ();
        System.out.println("Menambahkan : ");
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a);
        
        System.out.println("Mengakses index tertentu : ");
        System.out.println(a.get(1));
        
        System.out.println("Menggnti nilai : ");
        a.set(0,15);
        System.out.println(a);
        
        System.out.println("Menghapus nilai : ");
        a.remove(2);
        System.out.println(a);
        
        System.out.println("Membaca ukuran : ");
        System.out.println(a.size());
      
    }
    
}
