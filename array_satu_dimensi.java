/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author N
 */
public class array_satu_dimensi {
    public static void main(String[] args) {
        
        // deklarasi array cara pertama 
        int angka[] = new int[3];
        angka[0] = 10;
        angka[1] = 100;
        angka[2] = 1000;
        
        
        // Deklarasi array cara kedua
        String namaTeman[] = {"aku","kamu","kita","mereka"};
        
        // cara print array
        for(int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        for(int i=0; i<namaTeman.length; i++){
            System.out.println(namaTeman[i]);
        }
        int bilangan[]=new int[2];
        bilangan[0]=3;
        bilangan[1]=3;
        int jumlah = bilangan[0]-bilangan[1];
        System.out.println(jumlah);
    }
}
