/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one.to.n;

/**
 *
 * @author moon
 */
import java.util.Scanner;

public class OneToN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for(int i=1;i<=N;i++){
           System.out.println(i); 
        }
        
    }
    
}
