package com.sung.head.first.design.patterns.factory.abst.o3;

/**
 * Created by sungang on 2017/11/16.
 */
public interface Factory {


    Fruit getFruit(String fruitType);

    Vegetables getVegetables(String vegetablesType);

}
