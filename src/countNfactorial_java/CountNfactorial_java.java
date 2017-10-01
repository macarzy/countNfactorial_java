package countNfactorial_java;
import java.util.Scanner;

public class CountNfactorial_java {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		for(;;){
			int integer=0;
			int time=1;
			int a=1;
			int sum=1;
			int f = 10;
			System.out.print("Input ur integer:");
			Scanner scanner = new Scanner(System.in);
			integer = scanner.nextInt();
			
			for(a=1;a<=integer;a++){
				sum = sum * a;			
			}
			
			while (sum%f == 0){
				f=f*10;
				time++;
			}
		System.out.println("time:"+time );
		System.out.println("End!" );
		}
	}

}
