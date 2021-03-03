package com.xuan.demo02;

public class UserServiceproxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceproxy(){}
    @Override
    public void add() {
        System.out.println("使用了add方法");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
    //日志方法
    public void log(String msg){
        System.out.println("使用了" +
                msg+"方法");
    }
}
