package com.liuqi.v13;

import org.junit.Test;

public class ClientTest {

    @Test
    public void clientTestV1(){
        ActorController actorController =  new ActorController();
        Actor actor = actorController.construct(new DevilBuilder());
        System.out.println(actor.getSex());
        System.out.println(actor.getCostume());
        System.out.println(actor.getFace());
        System.out.println(actor.getHairstyle());
        System.out.println(actor.getType());
    }
}
