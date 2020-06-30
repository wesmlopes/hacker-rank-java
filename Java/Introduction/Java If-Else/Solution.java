import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String resposta="";

        if(n%2==1){
            resposta = "Weird";
        }
        else {
            if(n >= 2 && n <=5) {
                resposta = "Not Weird";
            } else if (n >= 6 && n<= 20) {
                resposta = "Weird";
            } else {
                resposta = "Not Weird";
            }
        }
        System.out.println(resposta);
    }
}
