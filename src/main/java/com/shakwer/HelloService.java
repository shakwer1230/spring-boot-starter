package com.shakwer;

/**
 * @
 * @Author:lvxiaoke
 * @Date: 2018/12/17
 * @
 */
public class HelloService {
    //消息内容
    private String msg;
    //是否显示消息内容
    private boolean show = true;

    public String sayHello()
    {
        return show ? "Hello，" + msg : "Hidden";
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
