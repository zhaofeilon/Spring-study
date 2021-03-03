package com.xuan.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//会用这个类自动生产代理类
public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }
//生成代理类重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
public Object getProxy(){
    return Proxy.newProxyInstance(this.getClass().getClassLoader(),
            rent.getClass().getInterfaces(),this);
}
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //核心：本质利用反射实现！
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }

    private void fare() {
        System.out.println("收中介费");
    }

    private void seeHouse() {
        System.out.println("带房客看房");
    }

}
