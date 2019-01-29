package com.algorithm.for문사용해보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HYEON on 2019-01-23.
 */


public class 별찍기3 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String star = "*";

        for(int i = 0; i <= n; i++){ //줄띄기
            for (int j = 0; j < n-i; j++) System.out.print(star);
            System.out.println();
        }

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end - start) / 1000.0);
    }
}
