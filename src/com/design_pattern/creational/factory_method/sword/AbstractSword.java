package com.design_pattern.creational.factory_method.sword;

/**
 * 抽象产品。
 */
public abstract class AbstractSword {

    private String name;

    public AbstractSword() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
