package homework3;

public class c_3 {
    public static void main(String[] args){
        int b_horse,m_horse;
		for(b_horse=0;b_horse<=100;b_horse++) {
			for(m_horse=0;m_horse<=(100-b_horse);m_horse++) {
				if(b_horse*3+m_horse*2+(100-b_horse-m_horse)*0.5==100) {
					System.out.println("大马"+b_horse+"匹");
					System.out.println("中马"+m_horse+"匹");
					System.out.println("小马"+(100-b_horse-m_horse)+"匹"+"\n");
				}
			}
		}
    }
    
}
