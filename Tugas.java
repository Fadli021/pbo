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

    

    public class Tugas {
    
        
    public static void main(String[] args) {
        int n = 0;
        try {
        n = System.in.read();
        }catch (java.io.IOException z){ 
        }
        System.out.println("Hasil : "+(char) n);
    }
    
}
