package com.liuqi.v5;

import org.junit.Test;

public class clientTest {

    @Test
    public void clientTestV1(){
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();
        //向发送者注入命令对象
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
