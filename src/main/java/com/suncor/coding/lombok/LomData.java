package com.suncor.coding.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-09-24 16:07
 **/
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "name",includeFieldNames = false)
public class LomData {

    @NonNull
    private Integer id;

    private String name;

    private Integer age;

    public LomData(@NonNull Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
