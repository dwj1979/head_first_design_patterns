package com.sung.head.first.design.patterns.strategy.o2;

/**
 * Created by sungang on 2017/11/16.
 */
public class AriTool implements ToolStrategy {

    @Override
    public void useTool() {
        System.out.println("飞机出行!");
    }
}
