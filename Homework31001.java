package text2;
import java.util.Scanner;
public class Homework31001 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������4λ��Ա���ţ�");
		//��ȡ�û�����Ļ�Ա����
		int cardNo = input.nextInt();
		int qianwei = cardNo/1000;//ǧλ
		int baiwei = cardNo/100 %10;//��λ
		int shiwei = cardNo/10 %10;//ʮλ
		int gewei = cardNo%10;//��λ
		//�������λ��
		System.out.println("ǧλ�ǣ�"+qianwei+"\t��λ�ǣ�"+baiwei+"\tʮλ�ǣ�"+shiwei+"\t��λ�ǣ�"+gewei);
		//�û���������������
		int sum = qianwei+baiwei+shiwei+gewei;
		String str = "";
		//�ж��Ƿ����20
		str = sum>20?"��ϲ���н��ˣ���Ʒ��Iphone20X":"δ�н���лл�ݹˣ�����";
		System.out.println("��λ��Ա�Ŀ���Ϊ��"+cardNo+"��"+str);
	}

}
