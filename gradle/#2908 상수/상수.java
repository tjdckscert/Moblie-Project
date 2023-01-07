import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 *
 * @author Seongchan
 */
public class Main {
    public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
  //  StringTokenizer st = new StringTokenizer(bf.readLine());
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    int sceond = sc.nextInt();
    int a;
    int b;
    int c;
    a= first%10;
    c=first/100;
    first = a *100 + first +c -a -c*100;
    a= sceond%10;
    c=sceond/100;
    sceond = a *100 + sceond +c -a -c*100;
        if (first>sceond) {
            
        System.out.println( first);
        }
        else System.out.println(sceond);
    
            
     
    //String[] menu = new String[number];
    
        /*if (test>0) {
            int number =1;
            while(true){
                test--;
                String i =bf.readLine(); //
                String[] list= i.split(" ");
                int a = Integer.parseInt(list[0]);
                int b = Integer.parseInt(list[1]);
                int c =a+b;
                bw.write("Case #"+number+": "+a+" + "+b+" = "+c+"\n");   //버퍼에 있는 값 전부 출력
                number++;
                if (test<=0) {
                    bw.flush();
                    bw.close();   //스트림을 닫음
                    break;
                }
            }*/
            
            
        }
    
}