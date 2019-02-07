package com.liuqi.v13;

/**
 * 游戏角色创建控制器：指挥者
 */
public class ActorController {

    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder actorBuilder) {
        Actor actor;
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        actorBuilder.buildHairstyle();
        actorBuilder.buildSex();
        actorBuilder.buildType();
        actor = actorBuilder.createActor();
        return actor;
    }
}
