package com.example.mydemo;
import android.app.Instrumentation;
import android.os.RemoteException;
import android.util.Log;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;

public class XuanxuanDemo {
    UiDevice mDevice;
    Instrumentation mInstrumentation;

    @Before
    public void startUp() throws RemoteException, UiObjectNotFoundException, InterruptedException {
        //先获取设备的连接
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        //创建对象UiDevice
        mDevice = UiDevice.getInstance(mInstrumentation);
        //点击Home键
        mDevice.pressHome();
        //判断是否锁屏
        boolean status = mDevice.isScreenOn();
        //如果被锁，唤醒
        if (!status) {
            mDevice.wakeUp();
        }
        mDevice.pressHome();
    }

    @Test
    public void TestXuanxuan() throws InterruptedException, UiObjectNotFoundException{
        //打开喧喧
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);

        /**----聊天界面----**/

        mDevice.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        //发送消息
        mDevice.click(336,537);//第三个联系人
        mDevice.findObject(By.clazz("android.widget.EditText")).click();//对话框
        Thread.sleep(2000);
        mDevice.findObject(By.clazz("android.widget.EditText")).setText("1111");//输入对话框
        mDevice.click(855,1552);//发送
        //收藏 取消收藏
        mDevice.click(845,105);//三点
        Thread.sleep(2000);
        mDevice.click(705,104);//收藏
        Thread.sleep(2000);
        mDevice.click(845,105);//三点
        Thread.sleep(2000);
        mDevice.click(676,116);//取消收藏
        //查看资料-收藏-取消收藏
        mDevice.click(845,105);//三点
        Thread.sleep(2000);
        mDevice.click(651,211);//查看资料
        Thread.sleep(2000);
        mDevice.click(856,102);//收藏
        Thread.sleep(2000);
        mDevice.click(856,102);//取消收藏
        Thread.sleep(2000);
        mDevice.click(58,104);//返回
        //同步最近的消息
        mDevice.click(845,105);//三点
        Thread.sleep(2000);
        mDevice.click(695,294);//同步最近的消息
        //发送图片
        mDevice.click(42,1560);//最下方的图片按钮
        Thread.sleep(2000);
        mDevice.click(148,1426);//照片
        Thread.sleep(2000);
        mDevice.click(142,362);//选择照片
        Thread.sleep(2000);
        mDevice.click(836,287);//查看自己的信息
        Thread.sleep(2000);
        mDevice.click(60,102);//返回
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);

        //新建讨论组
        mDevice.click(842,107);//右上角＋
        Thread.sleep(2000);
        mDevice.click(164,275);//选择1创建讨论组
        Thread.sleep(2000);
        mDevice.click(202,904);//选择5创建讨论组
        Thread.sleep(2000);
        mDevice.click(849,102);//右上角的√
        Thread.sleep(2000);
        mDevice.findObject(new UiSelector().text("输入讨论组名称")).setText("friend1");
        Thread.sleep(2000);
        mDevice.click(849,102);
        Thread.sleep(2000);
        mDevice.findObject(By.text("创建")).click();
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);

        /**----讨论组界面----**/

        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.click(148,243);//第一个聊天
        Thread.sleep(2000);
        //收藏 取消收藏
        mDevice.click(845,105);//三点
        Thread.sleep(2000);
        mDevice.click(705,104);//收藏
        Thread.sleep(2000);
        mDevice.click(845,105);//三点
        Thread.sleep(2000);
        mDevice.click(676,116);//取消收藏
        Thread.sleep(2000);
        //成员列表
        mDevice.click(845,105);//3点
        Thread.sleep(2000);
        mDevice.click(640,199);//成员列表
        Thread.sleep(2000);
        mDevice.click(167,224);//查看自己
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);
        mDevice.click(154,377);//查看第二个联系人
        Thread.sleep(2000);
        mDevice.click(849,96);//收藏
        Thread.sleep(2000);
        mDevice.click(849,96);//取消收藏
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);
        mDevice.click(142,502);//查看第三个联系人
        Thread.sleep(2000);
        mDevice.click(849,96);//收藏
        Thread.sleep(2000);
        mDevice.click(849,96);//取消收藏
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);
        mDevice.click(845,105);//3点
        Thread.sleep(2000);
        mDevice.click(626,311);//重命名
        Thread.sleep(2000);
        mDevice.click(641,970);//新的名字
        Thread.sleep(2000);
        mDevice.click(845,105);//3点
        Thread.sleep(2000);
        mDevice.click(635,373);//同步最近的消息
        Thread.sleep(2000);
        mDevice.click(836,287);//查看自己的信息
        Thread.sleep(2000);
        mDevice.click(60,102);//返回
        Thread.sleep(2000);
        mDevice.click(60,102);//返回
        Thread.sleep(2000);
        //新建讨论组
        mDevice.click(842,107);//右上角＋
        Thread.sleep(2000);
        mDevice.click(208,426);//选择1创建讨论组
        Thread.sleep(2000);
        mDevice.click(203,396);//选择2创建讨论组
        Thread.sleep(2000);
        mDevice.click(202,904);//选择4创建讨论组
        Thread.sleep(2000);
        mDevice.click(849,102);//右上角的√
        Thread.sleep(2000);
        mDevice.findObject(new UiSelector().text("输入讨论组名称")).setText("friend2");
        Thread.sleep(2000);
        mDevice.click(849,102);//点击输入框
        Thread.sleep(2000);
        mDevice.findObject(By.text("创建")).click();
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);

        /**----联系人界面----**/

        mDevice.click(556,1535);//联系人
        Thread.sleep(2000);
        mDevice.click(154,377);//查看第二个联系人
        Thread.sleep(2000);
        mDevice.click(849,96);//收藏
        Thread.sleep(2000);
        mDevice.click(849,96);//取消收藏
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);
        mDevice.click(142,502);//查看第三个联系人
        Thread.sleep(2000);
        mDevice.click(849,96);//收藏
        Thread.sleep(2000);
        mDevice.click(849,96);//取消收藏
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);
        mDevice.click(177,662);//查看第四个联系人
        Thread.sleep(2000);
        mDevice.click(849,96);//收藏
        Thread.sleep(2000);
        mDevice.click(849,96);//取消收藏
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);
        mDevice.click(177,812);//查看第五个联系人
        Thread.sleep(2000);
        mDevice.click(849,96);//收藏
        Thread.sleep(2000);
        mDevice.click(849,96);//取消收藏
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);

        /**----我的界面----**/

        mDevice.click(773,1547);//我的
        Thread.sleep(2000);
        mDevice.click(627,283);//查看自己的信息
        Thread.sleep(2000);
        mDevice.click(53,109);//返回
        Thread.sleep(2000);
        mDevice.click(845,105);//三点
        Thread.sleep(2000);
        mDevice.click(753,96);//关于
        Thread.sleep(2000);
        mDevice.click(600,1139);//隐私条款
        Thread.sleep(2000);
        mDevice.click(664,1298);//仅此一次
        Thread.sleep(2000);
        //点击返回键
        mDevice.pressBack();
        mDevice.click(396,943);//喧喧网站
        Thread.sleep(2000);
        mDevice.click(664,1298);//仅此一次
        Thread.sleep(2000);
        //点击返回键
        mDevice.pressBack();
        mDevice.click(749,1154);//关闭
        Thread.sleep(2000);
        mDevice.click(445,445);//注销
        Thread.sleep(6000);
        mDevice.click(733,1016);//确认
        Thread.sleep(2000);

    }
}