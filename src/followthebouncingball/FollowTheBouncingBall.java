/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package followthebouncingball;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class FollowTheBouncingBall {

    static Scanner sc=new Scanner(System.in);
    static long width;
    static long height;
    static long p;
    static long q;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        width=sc.nextInt();
        height=sc.nextInt();
        p=width-sc.nextInt();
        q=sc.nextInt();
        
        long x;
        long y;
        x=0;
        long A=width*q;
        long B=p*q;
        long C=p*height;
        long gcf=GCF(A,GCF(B,C));
        A=A/gcf;
        B=B/gcf;
        C=C/gcf;
        for (x=0;x<C;x++) {
            if ((A*x+B)%C==0) {
                break;
            }
        }
        if (x<C) {
            y=(A*x+B)/C;
            long n=x+y-1;
            System.out.println(n);
        }
        else {
            System.out.println(0);
        }
    }
    
    static private long GCF(long a,long b) {
        a=abs(a);
        b=abs(b);
        if (a==1 || b==1) return 1;
        if (a==b) return a;
        if (a>b) {
            return GCF(a-b,b);
        } else {
            return GCF(b-a,a);
        }
    }
    
}
