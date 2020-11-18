package com.suncor.coding.demo;

import lombok.Builder;
import lombok.Data;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-09-09 09:57
 **/
@Data
@Builder
public class DoubleItem {
    private String name;
    private Double num;
}
