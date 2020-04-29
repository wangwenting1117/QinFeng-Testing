package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import io.appium.java_client.android.AndroidElement;
import pages.HomePage;
import pages.HomePage;
public class HomePageTest extends BaseTest{

	HomePage homePage;

	@Test
	//复制粘贴发送消息
	public void talk1() {	
		homePage=new HomePage(driver);
		homePage.talktoxitong();
	}
	@Test
	//复制粘贴发送消息
	public void talk2() {	
		homePage=new HomePage(driver);
		homePage.talktozhang();
	}
	@Test
	//复制粘贴发送消息
	public void talk3() {	
		homePage=new HomePage(driver);
		homePage.talktozhangyunlei();
	}
	@Test
	//分享消息
	public void talk4_share() {	
		homePage=new HomePage(driver);
		homePage.share();
	}
	@Test
	//创建二个人的群聊（普通聊天）
	public void talk_creatgroupchat1() {	
		homePage=new HomePage(driver);
		homePage.creat_groupchat1();
	}
	@Test
	//创建三个人的群聊
	public void talk_creatgroupchat2() {	
		homePage=new HomePage(driver);
		homePage.creat_groupchat2();
	}
	@Test
	//创建四个人的群聊
	public void talk_creatgroupchat3() {	
		homePage=new HomePage(driver);
		homePage.creat_groupchat3();
	}
	@Test
	//查看群成员
	public void group1() {	
		homePage=new HomePage(driver);
		homePage.groupmember();
	}
	
	@Test
	//收藏群聊
	public void group2() {	
		homePage=new HomePage(driver);
		homePage.collect();
	}

	@Test
	// 取消收藏群聊
	public void group3() {	
		homePage=new HomePage(driver);
		homePage.nocollect();
	}

	@Test
	// 重命名群聊
	public void group4() {	
		homePage=new HomePage(driver);
		homePage.rename();
	}
	
	@Test
	//收藏联系人
	public void liaison_col() {	
		homePage=new HomePage(driver);
		homePage.col_liaison();
	}
	@Test
	//取消收藏联系人
	public void noliaison_col() {	
		homePage=new HomePage(driver);
		homePage.nocol_liaison();
	}
	@Test
	//查看隐私条款
	public void mine1() {	
		homePage=new HomePage(driver);
		homePage.mine_private();
	}
	
	@Test
	//查看喧喧官网
	public void mine2() {	
		homePage=new HomePage(driver);
		homePage.mine_xuanim();
		}
	//关闭“关于”弹出框
		public void mine3() {	
			homePage=new HomePage(driver);
			homePage.mine_xuanim();
			}
	@Test
	//从聊天模块查看联系人资料
	public void talk_liaison() {	
		homePage=new HomePage(driver);
		homePage.ziliao();
		}
	@Test
	//同步最近消息
	public void talk_message() {	
		homePage=new HomePage(driver);
		homePage.lastmessage();
		}
	@Test
	//不勾选，注销登录状态并重新登录
	public void exit() {	
		homePage=new HomePage(driver);
		homePage.exit1();
		}
}
