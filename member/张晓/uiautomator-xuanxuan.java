package com.example.xuanxuan;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Test;

public class Demo {

    Instrumentation instrumentation;
    UiDevice uiDevice;

    @Before
    public void startup() throws RemoteException {
        instrumentation= InstrumentationRegistry.getInstrumentation();
        uiDevice=UiDevice.getInstance(instrumentation);
        uiDevice.pressHome();
        boolean status=uiDevice.isScreenOn();
        if(!status){
            uiDevice.wakeUp();
        }

    }
    @Test
    public void testChat1(){
        uiDevice.findObject(By.text("聊天\n" +
                "第 1 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("系统 所有人")).click();
        uiDevice.findObject(By.text("显示菜单")).click();
        uiDevice.findObject(By.text("同步最近的消息")).click();//同步最近的消息
    }
    @Test
    public void testChat2(){
        uiDevice.findObject(By.text("聊天\n" +
                "第 1 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("系统 所有人")).click();

        uiDevice.findObject(By.text("显示菜单")).click();
        uiDevice.findObject(By.text("重命名")).click();//重命名
    }
    @Test
    public void testChat3(){
        uiDevice.findObject(By.text("聊天\n" +
                "第 1 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("系统 所有人")).click();
        uiDevice.findObject(By.text("显示菜单")).click();
        uiDevice.findObject(By.text("重命名")).click();//重命名
        uiDevice.findObject(By.text("系统, 系统")).clear();
        uiDevice.findObject(By.text("系统, 系统")).setText("ceshi");
        uiDevice.findObject(By.text("重命名"));//重命名
    }
    @Test
    public void testChat4(){
        uiDevice.findObject(By.text("聊天\n" +
                "第 1 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("系统 所有人")).click();
        uiDevice.findObject(By.text("显示菜单")).click();
        uiDevice.findObject(By.text("收藏")).click();//收藏
        uiDevice.findObject(By.text("返回")).click();//查看是否有星标
        uiDevice.findObject(By.text("系统 所有人")).click();
        uiDevice.findObject(By.text("显示菜单")).click();
        uiDevice.findObject(By.text("取消收藏"));
        uiDevice.findObject(By.text("返回")).click();//星标已取消
    }
    @Test
    public void testGroup1(){
        uiDevice.findObject(By.text("讨论组\n" +
                "第 2 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("系统 所有人")).click();//与系统聊天
        uiDevice.findObject(By.clazz("android.widget.EditText")).setText("ceshi");
        uiDevice.findObject(By.text("发送")).click();//发送
    }
    @Test
    public void testGroup2(){
        uiDevice.findObject(By.text("讨论组\n" +
                "第 2 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("创建聊天")).click();//创建聊天
        uiDevice.findObject(By.text("Z zx01")).click();//Z zx01
        uiDevice.findObject(By.text("Z zx02")).click();//Z zx02
        uiDevice.findObject(By.clazz("android.widget.Button")).click();
        uiDevice.findObject(By.text("输入讨论组名称")).setText("ceshi");//输入讨论组名称
        uiDevice.findObject(By.text("创建")).click();//创建
    }
    @Test
    public void testContact(){
        uiDevice.findObject(By.text("联系人\n" +
                "第 3 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("A admin")).click();
        uiDevice.findObject(By.text("返回")).click();//返回
    }
    @Test
    public void testMy1(){
        uiDevice.findObject(By.text("我的\n" +
                "第 4 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("Z\n" +
                "zx01\n" +
                "  @zx01\n" +
                "http://192.168.1.8:11443")).click();//查看个人信息
        uiDevice.findObject(By.text("返回")).click();//返回
        uiDevice.findObject(By.text("显示菜单")).click();//显示菜单
        uiDevice.findObject(By.text("关于")).click();//关于
        uiDevice.findObject(By.text("http://xuan.im"));//http://xuan.im
    }
    @Test
    public void testMy2(){
        uiDevice.findObject(By.text("我的\n" +
                "第 4 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("显示菜单")).click();//显示菜单
        uiDevice.findObject(By.text("关于")).click();//关于
        uiDevice.findObject(By.text("隐私条款"));//隐私条款
    }
    @Test
    public void testMy3(){
        uiDevice.findObject(By.text("我的\n" +
                "第 4 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("显示菜单")).click();//显示菜单
        uiDevice.findObject(By.text("关于")).click();//关于
        uiDevice.findObject(By.text("关闭"));//关闭
    }
    @Test
    public void testMy4(){
        uiDevice.findObject(By.text("我的\n" +
                "第 4 个标签，共 4 个")).click();
        uiDevice.findObject(By.text("注销")).click();//注销
        uiDevice.findObject(By.text("取消")).click();//取消
        uiDevice.findObject(By.text("确认")).click();//确认
    }
}
