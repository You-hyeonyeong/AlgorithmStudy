package com.algorithm.for문사용해보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HYEON on 2019-01-29.
 */


public class 합 { //1부터 n까지의 합 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int total=0;
        for (int i=0; i <= n; i++){
            total += i;
        }
        System.out.println(total);
    }
}
