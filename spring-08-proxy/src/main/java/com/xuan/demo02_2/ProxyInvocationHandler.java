package com.xuan.demo02_2;

import com.xuan.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//会用这个类自动生产代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
   private  Object target;
    public void setTarget(Object target) {
        this.target = target;
    }
    //生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //核心：本质利用反射实现！
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
    public void log(String str){
        System.out.println("执行了" +
                str+"方法");
    }

}
