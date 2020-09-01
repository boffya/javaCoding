//package com.suncor.coding.demo;
//
//import com.google.common.collect.Maps;
//
//import java.util.Map;
//
///**
// * @program: coding
// * @description:
// * @author: sunc
// * @create: 2020-07-09 11:50
// **/
//public class Test1 {
//    public static void main(String[] args) {
//        Map<String,Object> map = Maps.newHashMap();
//        map.put("1",1);
//        map.put("2",2);
//        Map<String,Object> map3 = Maps.newHashMap();
//        map3.put("11",11);
//        map3.put("22",22);
//        Map<String,Object> map33 = Maps.newHashMap();
//        map33.put("111",111);
//        map33.put("222",222);
//        map3.put("33",map33);
//        map.put("3",map3);
//        map.put("4",4);
//        map.put("5",5);
//        map.put("6",6);
//        map.put("7",7);
//        Map<String,Object> map7 = Maps.newHashMap();
//        map7.put("77",77);
//        map.put("77",map7);
//        Kv kv  = generate(map,"map");
//        System.out.println(generate(map,"map"));
//    }
//    private static Kv generate(Map<String,Object> map,String name){
//        Kv kv =new Kv(name);
//        map.forEach((k,v)->{
//            Kv son = null;
//            if(v instanceof Map){
//                son = generate((Map) v,k);
//            }else {
//                son =new Kv(k,v);
//            }
//            kv.getList().add(son);
//        });
//        return kv;
//    }
//
//}
//
