package com.algorithm.for문사용해보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HYEON on 2019-01-22.
 */


public class N찍기 {
        public static void main(String[] args) throws NumberFormatException, IOException {


            long start = System.currentTimeMillis();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            for(int a=1; a<=n; a++){
                System.out.println(a);
            }

            long end = System.currentTimeMillis();
            System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
        }



        /*    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(reader.readLine());
            StringBuilder builder = new StringBuilder();
            for(int i=1 ; i<=N ; i++)
                builder.append(i).append("\n");
            System.out.println(builder.toString());*/

}
