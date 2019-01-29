package com.algorithm.for문사용해보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HYEON on 2019-01-22.
 */


public class 구구단 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // StringBuilder sb = new StringBuilder();
        for (int a = 1; a <= 9; a++) {
            System.out.println(n + " * " + a + " = " + n * a);
        }

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end - start) / 1000.0);
    }
}
