package com.design_pattern.creational.factory_method.sword;

/**
 * 具体工厂。
 */
public class Caocao2 implements ISwordFactory {

    @Override
    public AbstractSword createSword() {
        return new BaxingSword();
    }
}
