package homework3;

import java.util.*;
public class c_1 {
	public static void main(String[] args) {
		System.out.println("输入时间");
		int hour,minute,second;
		Scanner reader=new Scanner(System.in);
		hour=reader.nextInt();
		System.out.print(":");
		minute=reader.nextInt();
		System.out.print(":");
		second=reader.nextInt();
		if(0<=hour&&hour<24&&0<=minute&&minute<60&&0<=second&&second<60){
			System.out.println(hour+":"+minute+":"+second);
		}
		else
		{
			System.out.println("不合理的时间");
		}
		
	}

}
