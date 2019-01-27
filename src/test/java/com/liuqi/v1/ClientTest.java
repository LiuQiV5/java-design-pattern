package com.liuqi.v1;

import org.junit.Test;

public class ClientTest {

    @Test
    public void clientV1Test(){

        //定义观察目标对像
        Subject subject = new AllyControlCenter("金庸群侠");

        //定义四个观察者对象
        Observer player1,player2,player3,player4;

        player1 = new Player("杨过");
        subject.join(player1);

        player2 = new Player("令狐冲");
        subject.join(player2);

        player3 = new Player("张无忌");
        subject.join(player3);

        player4 = new Player("段誉");
        subject.join(player4);

        player1.beAttacked(subject);

    }

}
