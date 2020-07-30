/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import javax.swing.JOptionPane;

/**
 *
 * @author N
 */
public class array_multi_dimensi {

    public static void main(String[] args) {

        System.out.println("Array 1 dimensi");
        int angka[] = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        System.out.println("Array 2 Dimensi untuk integer");
        int matriks[][] = {{2, 4},
                            {6, 8}};

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Array 2 Dimensi untuk String");
        String[][] data = {{"nana", "0021"}, {"nino", "0032", "jambi"}, {"chika", "0043"}};

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
        String cari = JOptionPane.showInputDialog("Cari data berdasarkan nama ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if(data[i][j].equals(cari))
                    JOptionPane.showMessageDialog(null, "data dengan nama "+ cari +" bernomer "+ data[i][j+1]);
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
