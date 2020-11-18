package com.suncor.coding.design.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-18 15:58
 **/
public class Bags implements Articles {

    private String name;

    private List<Articles> bags;

    public Bags(String name) {
        this.name = name;
        this.bags = Lists.newArrayList();
    }

    public void add(Articles articles) {
        bags.add(articles);
    }

    public void remove(Articles articles) {
        bags.remove(articles);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }


    @Override
    public float calculation() {
        float total = 0F;
        for (Articles bag : bags) {
            total +=bag.calculation();
        }
        return total;
    }

    @Override
    public void show() {
        for (Articles bag : bags) {
            bag.show();
        }
    }

    public static void main(String[] args) {
        float s = 0;
        Bags BigBag, mediumBag, smallRedBag, smallWhiteBag;
        Goods sp;
        BigBag = new Bags("大袋子");
        mediumBag = new Bags("中袋子");
        smallRedBag = new Bags("红色小袋子");
        smallWhiteBag = new Bags("白色小袋子");
        sp = new Goods("婺源特产", 2, 7.9f);
        smallRedBag.add(sp);
        sp = new Goods("婺源地图", 1, 9.9f);
        smallRedBag.add(sp);
        sp = new Goods("韶关香菇", 2, 68);
        smallWhiteBag.add(sp);
        sp = new Goods("韶关红茶", 3, 180);
        smallWhiteBag.add(sp);
        sp = new Goods("景德镇瓷器", 1, 380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);
        sp = new Goods("李宁牌运动鞋", 1, 198);
        BigBag.add(sp);
        BigBag.add(smallWhiteBag);
        BigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        BigBag.show();
        s = BigBag.calculation();
        System.out.println("要支付的总价是：" + s + "元");
    }
}
