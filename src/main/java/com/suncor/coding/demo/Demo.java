package com.suncor.coding.demo;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-07-14 11:18
 **/
public class Demo {
    public static void main(String[] args) {
        Map<String,String> map = Maps.newHashMap();
        map.put("11","1111");
        map.put("22","2222");
        System.out.println(map);
        String url = "http://vcl.changhongit.com/join/rAG4bD1djO";
        System.out.println(url.substring(url.lastIndexOf("/")+1));

        String str = "Hello\\World";
        System.out.println(str.substring(str.lastIndexOf("\\")+1));
        System.out.println(str.substring(0,str.lastIndexOf("\\")));
        System.out.println(Math.ceil(1.1111*1000)/1000);

    }
}
