package homework3;
import java.util.Scanner;

public class c_2 {
    public static void main(String[] args){
        System.out.println("请输入一个整数");
        Scanner reader=new Scanner(System.in);
        int num;
        num=reader.nextInt();
        //a百位，b十位，c个位
        int a,b,c;
        a=num/100;
        b=num%100/10;
        c=num%10;
        if(100<=num&&num<=999){
            System.out.println("三位数字和为"+(a+b+c));
        }else{
            System.out.println("数字平方值为"+num*num+"\n"+"数字平方根值为"+Math.sqrt(num));
        }
        

    }
}
