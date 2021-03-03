package com.xuan.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        SeeHouse();
        host.rent();
        fare();
        System.out.println();

    }
    //看房
    public void SeeHouse(){
        System.out.println("中介带你看房!");
    }
    //收中介费
    public void fare()
    {
        System.out.println("中介收费！");
    }
}
