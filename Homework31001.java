package text2;
import java.util.Scanner;
public class Homework31001 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4位会员卡号：");
		//获取用户输入的会员卡号
		int cardNo = input.nextInt();
		int qianwei = cardNo/1000;//千位
		int baiwei = cardNo/100 %10;//百位
		int shiwei = cardNo/10 %10;//十位
		int gewei = cardNo%10;//个位
		//输出各个位数
		System.out.println("千位是："+qianwei+"\t百位是："+baiwei+"\t十位是："+shiwei+"\t个位是："+gewei);
		//用户级输入的数字求和
		int sum = qianwei+baiwei+shiwei+gewei;
		String str = "";
		//判断是否大于20
		str = sum>20?"恭喜你中奖了！奖品是Iphone20X":"未中奖，谢谢惠顾！！！";
		System.out.println("这位会员的卡号为："+cardNo+"，"+str);
	}

}
