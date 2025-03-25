import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int n;
    static int [][] grid;
    static boolean [] visited;
    static int MIN_VALUE = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        grid = new int[n][n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[n];
        dp(0,0);

        System.out.println(MIN_VALUE);

    }
    static void dp(int depth, int idx){
        if(depth == n/2){
            calculate();
            return;
        }

        for(int i=idx; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                dp(depth+1, i+1);
                visited[i] = false;
            }
        }
    }

    static void calculate(){
        int start = 0;
        int link = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(visited[i] && visited[j]){
                    start += (grid[i][j] + grid[j][i]);
                } else if(!visited[i] && !visited[j]){
                    link += (grid[i][j] + grid[j][i]);
                }
            }
        }

        MIN_VALUE = Math.min(MIN_VALUE, Math.abs(start - link));
    }
}