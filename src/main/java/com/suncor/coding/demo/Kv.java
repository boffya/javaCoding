package com.suncor.coding.demo;

import com.google.common.collect.Lists;
import lombok.*;

import java.util.List;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-07-09 11:56
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kv {
    private String id;
    private Object obj;
    private List<Object> list =Lists.newArrayList();

    public Kv(String id, Object obj) {
        this.id = id;
        this.obj = obj;
    }
}
