package com.design_pattern.creational.factory_method.sword;

import java.util.List;

public class Mian {

    public static void main(String[] args) {
        ISwordFactory factory = new Caocao();
        AbstractSword sword = factory.createSword();
        System.out.println("曹操使用 " + sword.getName() + " 刺杀董卓！");


        factory = new Caocao2();
        sword = factory.createSword();
        System.out.println("曹操使用 " + sword.getName() + " 刺杀董卓！");
    }
}
