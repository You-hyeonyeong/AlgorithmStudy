package com.algorithm.for문사용해보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HYEON on 2019-01-22.
 */


public class 기찍N {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int a = n;a !=0;a--) {
            sb.append(a).append("\n");
        }
        System.out.println(sb);

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end - start) / 1000.0);
    }
}
