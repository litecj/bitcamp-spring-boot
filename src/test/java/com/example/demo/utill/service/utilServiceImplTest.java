package com.example.demo.utill.service;

import com.example.demo.util.service.LambdaUtils;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class utilServiceImplTest extends LambdaUtils {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 4; i++) {
            //result += (int)Math.floor((Math.random()*10000+1000));
            result += (int) (Math.random() * 10);
            //"-"+(int)(Math.random()*9000+1000)+"-"+(int)((Math.random()+1)*1000);
            //int Math.random(10000));
        }
        print.accept(result);
    }
}
