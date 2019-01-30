package com.liuqi.v6;

/**
 * 设计模式之外观模式（门面模式）
 * 外观模式：为子系统中的一组接口提供一个统一的入口。外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 *-----------------------------------------------------
 *这是一个外观类，为客户端服务
 */
public class HomeTheaterFacade {

    DvdPlayer dvd;
    Popcorn popcorn;
    Screen screen;
    Volume volume;

    public HomeTheaterFacade() {
        this.dvd = new DvdPlayer();
        this.popcorn = new Popcorn();
        this.screen = new Screen();
        this.volume = new Volume();
    }

    public void watchMovie(String movie){
        popcorn.cook();
        screen.on();
        volume.change();
        dvd.on();
        dvd.play(movie);
    }
}
