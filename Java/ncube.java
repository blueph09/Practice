//(Find the largest n such that n^3 < 12000) Use a while loop to find the largest n such that n^3 is less than 12000.

public class muba {
	public static void main(String[] args) {
		int i = 31;
		//int n = i*i*i;
		while (i >1) {
			i--;
			while (i*i*i > 12000) {
				i = i - 1;
				if (i*i*i < 12000) {
					System.out.println(i);
				}
				
			}	
		}
	}
}
