
public class Assignment1Q2 {
	public static void main (String[] args) {
		int min=100;
		int max=999;
		for(int i=min; i<max; i++) { 
			int check=0, d, temp=0;
			check=i;
			while (check>0) {
				d= check%10;
				temp=temp+ (d*d*d);
				check= check/10;
			}
			if (temp==i) {
				System.out.println(i +"" );
			}
		}
		
	}

}
