package com.suncor.coding;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootTest
class CodingApplicationTests {

    @Test
    void contextLoads() {

//        Double d = 0D;
//        d = 1/3 *3D;
//        System.out.println(d);
//        String.format("%02d","1");

        List<Integer> aaa = Lists.newArrayList();
        List<Integer> bbb = IntStream.rangeClosed(1,3).boxed().collect(Collectors.toList());
//        Integer[] aa =  IntStream.rangeClosed(1,3).boxed().toArray();
        Collections.sort(bbb, Collections.reverseOrder());
        System.out.println(bbb);


    }

}
