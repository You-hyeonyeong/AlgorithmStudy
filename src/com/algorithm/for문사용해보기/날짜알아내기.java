package com.algorithm.for문사용해보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

/**
 * Created by HYEON on 2019-01-23.
 */


public class 날짜알아내기 {
    public static void main(String[] args) throws IOException {

        int month, date;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        month = Integer.parseInt(st.nextToken());
        date = Integer.parseInt(st.nextToken());
        br.close();
        int [] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] daykor = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int total = date;
        for(int i =0; i<month-1; ++i){
            total += dayOfMonth[i];
        }
        System.out.println(daykor[total%7]);
    }
}

