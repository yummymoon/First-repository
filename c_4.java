package homework3;

import java.util.Scanner;
public class c_4 {
    public static void main(String[] args) {
		System.out.print("输入一个整数：");
		Scanner reader=new Scanner(System.in);
		int num,all=0;
		num=reader.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				all+=i;
			}
		}if(all==num) {
			System.out.print(num+"是完全数");
		}else
		{System.out.println(num+"不是完全数");}
}
}
