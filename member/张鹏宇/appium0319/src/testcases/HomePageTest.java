package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import io.appium.java_client.android.AndroidElement;
import pages.HomePage;
import pages.HomePage;
public class HomePageTest extends BaseTest{

	HomePage homePage;

	@Test
	//����ճ��������Ϣ
	public void talk1() {	
		homePage=new HomePage(driver);
		homePage.talktoxitong();
	}
	@Test
	//����ճ��������Ϣ
	public void talk2() {	
		homePage=new HomePage(driver);
		homePage.talktozhang();
	}
	@Test
	//����ճ��������Ϣ
	public void talk3() {	
		homePage=new HomePage(driver);
		homePage.talktozhangyunlei();
	}
	@Test
	//������Ϣ
	public void talk4_share() {	
		homePage=new HomePage(driver);
		homePage.share();
	}
	@Test
	//���������˵�Ⱥ�ģ���ͨ���죩
	public void talk_creatgroupchat1() {	
		homePage=new HomePage(driver);
		homePage.creat_groupchat1();
	}
	@Test
	//���������˵�Ⱥ��
	public void talk_creatgroupchat2() {	
		homePage=new HomePage(driver);
		homePage.creat_groupchat2();
	}
	@Test
	//�����ĸ��˵�Ⱥ��
	public void talk_creatgroupchat3() {	
		homePage=new HomePage(driver);
		homePage.creat_groupchat3();
	}
	@Test
	//�鿴Ⱥ��Ա
	public void group1() {	
		homePage=new HomePage(driver);
		homePage.groupmember();
	}
	
	@Test
	//�ղ�Ⱥ��
	public void group2() {	
		homePage=new HomePage(driver);
		homePage.collect();
	}

	@Test
	// ȡ���ղ�Ⱥ��
	public void group3() {	
		homePage=new HomePage(driver);
		homePage.nocollect();
	}

	@Test
	// ������Ⱥ��
	public void group4() {	
		homePage=new HomePage(driver);
		homePage.rename();
	}
	
	@Test
	//�ղ���ϵ��
	public void liaison_col() {	
		homePage=new HomePage(driver);
		homePage.col_liaison();
	}
	@Test
	//ȡ���ղ���ϵ��
	public void noliaison_col() {	
		homePage=new HomePage(driver);
		homePage.nocol_liaison();
	}
	@Test
	//�鿴��˽����
	public void mine1() {	
		homePage=new HomePage(driver);
		homePage.mine_private();
	}
	
	@Test
	//�鿴��������
	public void mine2() {	
		homePage=new HomePage(driver);
		homePage.mine_xuanim();
		}
	//�رա����ڡ�������
		public void mine3() {	
			homePage=new HomePage(driver);
			homePage.mine_xuanim();
			}
	@Test
	//������ģ��鿴��ϵ������
	public void talk_liaison() {	
		homePage=new HomePage(driver);
		homePage.ziliao();
		}
	@Test
	//ͬ�������Ϣ
	public void talk_message() {	
		homePage=new HomePage(driver);
		homePage.lastmessage();
		}
	@Test
	//����ѡ��ע����¼״̬�����µ�¼
	public void exit() {	
		homePage=new HomePage(driver);
		homePage.exit1();
		}
}
