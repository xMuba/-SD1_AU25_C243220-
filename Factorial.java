/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author moon
 */
import java.util.Scanner;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        long sum = 1;
        for(int i=2;i<=n;i++){
            sum *=i;
        }
        System.out.println(sum);
    }
    
}
