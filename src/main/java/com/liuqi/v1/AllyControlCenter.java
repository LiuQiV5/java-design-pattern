package com.liuqi.v1;

/**
 * 具体主题
 */
public class AllyControlCenter extends Subject{

    public AllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");

        for (Observer player : players) {
            if (!((Observer)player).getName().equalsIgnoreCase(name)) {
                ((Observer)player).help();
            }
        }

    }
}
