package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int a = n;a !=0;a--) {
            sb.append(a).append("\n");
        }
        System.out.println(sb);


    }
}
