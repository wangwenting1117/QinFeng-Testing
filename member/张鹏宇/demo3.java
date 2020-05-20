package com.edu.xuanxuan;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.widget.Toast;


import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;

import org.junit.Before;
import org.junit.Test;

public class uiautomator_1{
    Instrumentation minstrumentation;
    UiDevice mDevice;
    @Before
    public void startUp()throws RemoteException {
        minstrumentation = InstrumentationRegistry.getInstrumentation();
        //获得连接设备
        mDevice=UiDevice.getInstance(minstrumentation);
        mDevice.pressHome();
        //判断是否锁屏
        boolean status=mDevice.isScreenOn();
        if (!status){
            mDevice.wakeUp();
        }
    }

    @Test
    //创建讨论组
    public void testCreat() throws InterruptedException {

        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
        mDevice.click(842, 98);
        Thread.sleep(300);
        mDevice.click(165, 275);
        Thread.sleep(300);
        mDevice.click(192, 906);
        Thread.sleep(2000);
        mDevice.click(849, 102);
        Thread.sleep(300);
        mDevice.findObject(new UiSelector().text("输入讨论组名称")).setText("111");
        Thread.sleep(300);
        mDevice.click(850, 100);
        Thread.sleep(300);
        mDevice.findObject(By.text("创建")).click();
        Thread.sleep(300);
        mDevice.click(55, 110);
        Thread.sleep(300);
    }

    @Test
    //查看讨论组成员
    public void test_list2 () throws InterruptedException {

        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
        mDevice.click(845,105);
        Thread.sleep(300);
        mDevice.click(640,200);
        Thread.sleep(300);
        mDevice.click(171,222);
        Thread.sleep(300);
        mDevice.click(51,107);
    }

    @Test
    //联系人资料
    public void test_list1 () throws InterruptedException {
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
        mDevice.click(845, 105);
        Thread.sleep(300);
        mDevice.click(650, 200);
    }

    @Test
    //查看“我的”
    public void  testMine() throws InterruptedException{
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
        mDevice.click(775,1533);
        Thread.sleep(300);
        mDevice.click(629,279);
        Thread.sleep(300);
        mDevice.click(55,110);
        Thread.sleep(300);
    }

    @Test
    //查看隐私条款
    public void testMine1() throws InterruptedException {
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
        mDevice.click(753,100);
        Thread.sleep(300);
        mDevice.click(600,1139);
        Thread.sleep(300);
        mDevice.click(659,1302);
        Thread.sleep(300);
    }
}
