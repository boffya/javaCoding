package com.suncor.coding.demo;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.suncor.coding.util.FormatUtil;
import com.suncor.coding.util.RegexUtil;

import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-07-14 11:18
 **/
public class Demo {
    public static void main(String[] args) throws ParseException {
        Map<String, String> map = Maps.newHashMap();
        map.put("11", "1111");
        map.put("22", "2222");
        System.out.println(map);
        String url = "http://vcl.changhongit.com/join/rAG4bD1djO";
        System.out.println(url.substring(url.lastIndexOf("/") + 1));

        String str = "Hello\\World";
        System.out.println(str.substring(str.lastIndexOf("\\") + 1));
        System.out.println(str.substring(0, str.lastIndexOf("\\")));
        System.out.println(Math.ceil(1.1111 * 1000) / 1000);

//        String  abc= "1、运维人员前往现场，确认现场设备告警、仪表测量结果与动力环境监控系统告警一致；\\r\\n2、联系变电站运行值班人员，确认外部供电恢复时间；根据负载电流，计算整流设备（高频开关电源）蓄电池可持续供电时间；若停电时间过长，根据停电时间以及蓄电池可持续供电时间，进行该站点过路业务进行迂回，并为确保重要设备业务运行，根据相关序位表，下令对负载逐级关闭。\\r\\n3、根据调度指令，对负载逐级关闭,确保重要业务运行；\\r\\n4、市电恢复后，现场巡视并确认所有的设备的供电已经恢复，蓄电池进入浮充状态，上报地市调度值班员，确认动环系统市电停电故障已经恢复，等待15分钟至30分钟，确保设备运行正常，抢修工作结束。";
//        String res = RegexUtil.getMatcher("\\\\r\\\\n|\\\\n|\\\\r",abc);
//        System.out.println(res);
//        for (String s : Splitter.on("\\r\\n").trimResults().omitEmptyStrings().splitToList(abc)) {
//            System.out.println(s);
//        }

        Map<Date, String> data = Maps.newHashMap();
        Date a = FormatUtil.parseDate("2020-09-09 08:08:08", "yyyy-MM-dd HH:mm:ss");
        Date b = FormatUtil.parseDate("2020-09-09 08:08:08", "yyyy-MM-dd HH:mm:ss");
        data.put(a, "11111");
        data.put(b, "22222");
        System.out.println(data);
        System.out.println(data.get(a));
        System.out.println(data.get(b));
        System.out.println(a == b);
        System.out.println(a == a);
        System.out.println(a.equals(b));

        Integer str1 = 7;
        switch (str1) {
            case 1:
                str1 += 1;
            case 2:
                str1 += 1;
            case 3:
                str1 += 1;
                break;
            case 4:
                str1 += 1;
            case 5:
                str1 += 1;
                break;
//            default:
//                str1 += 1;
        }
        System.out.println(str1);
    }
}
