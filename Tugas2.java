/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author LENOVO
 */
public class Tugas2 {
    public static void main(String[] args) {
        byte[] a = new byte[5];
        try{
            System.in.read(a);
        } catch (java.io.IOException x){
            System.out.println(x.getMessage());
        }
        System.out.println("Hasil : " + (char) a[0] + (char) a[1] + (char) a[2]);
    }
}
