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
public class Tugas3 {
    public static void main(String[] args) {
        byte[] r = new byte[5];
        System.out.println("Input Bilangan Bulat : ");
        try{
            System.in.read(r);
        }
        catch (java.io.IOException z){};
        int P = Integer.valueOf(r[1]).intValue();
        String string = new String (r);
        System.out.println("Hasil : " + (P+2));
        System.out.println("String : "+string);
    }
}
