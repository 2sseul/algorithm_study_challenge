import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n;
    static int [] arr;
    static int [] cal;
    static int MAX_VALUE = Integer.MIN_VALUE;
    static int MIN_VALUE = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        cal = new int[4];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            cal[i] = Integer.parseInt(st.nextToken());
        }

        dp(1,arr[0]);

        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);


    }
    static void dp(int depth, int result){
        if(depth == n){
            MAX_VALUE = Math.max(result,MAX_VALUE);
            MIN_VALUE = Math.min(result,MIN_VALUE);
            return;
        }

        for(int i=0; i<4; i++){
            if(cal[i] > 0){
                cal[i] --;

                if(i==0){
                    dp(depth+1, result + arr[depth]);
                }else if(i==1){
                    dp(depth+1, result - arr[depth]);
                }else if(i==2){
                    dp(depth+1, result * arr[depth]);
                }else{
                    if(result>0){
                        dp(depth+1, result / arr[depth]);
                    }else{
                        dp(depth+1, Math.abs(result) / -arr[depth]);
                    }
                }
                cal[i] ++;
            }
        }
    }
}