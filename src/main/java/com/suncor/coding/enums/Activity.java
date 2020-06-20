package com.suncor.coding.enums;

public enum Activity {
    SITTING(1), LYING(2), STANDING(3), HOPPING(4),
    RUNNING(5), DODGING(6), JUMPING(7), FALLING(8), FLYING(9);

    Activity(Integer code) {
        this.code = code;
    }

    private Integer code;

    public static void main(String[] args) {
//        System.out.println(Enums.random(Activity.values()));
        for (int i = 0; i < 100; i++) {
            System.out.println(Enums.random(Activity.class));
        }
    }
}
