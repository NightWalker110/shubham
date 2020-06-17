import java.util.Scanner;
public class spall {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int x = s.nextInt();
		for(int i=0;i<x;i++) {
			if(i>=0 && i<10) {
				System.out.println(i+" "+"is Pallindrome");
			}
		else if(i>=10 && i<100){
				int finl = (i%10)*10+(i/10);
				if(finl == i)
				{
					System.out.println(i+" "+"is Pallindrome");
				}
			}
		else if(i>=100 && i<999) {
		int finl =  i%10*100+((i/10)%10)*10+(i/10)/10;
		s.close();
		if(finl == i)
		{
			System.out.println(i+" "+"is Pallindrome");
		}
		}
		else if(i>=1000 && i<=9999)
		{
			int finl = (i%10)*1000+((i/10)%10)*100+((i/10)%10)*10+((i/10)/10)/10;
			if(finl == i)
			{
				System.out.println(i+" "+"is Pallindrome");
			}
		}
		else if(i>=10000 && i<100000)
		{
			int finl = (i%10)*10000+((i/10)%10)*1000+(((i/10)/10)%10)*100+((((i/10)/10)/10)%10)*10+(((i/10)/10)/10)/10;
			if(finl == i)
			{
				System.out.println(i+" "+"is Pallindrome");
			}
		}
	}
	}
}