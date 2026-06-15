package fst;

public class Activity2 {

	public static void main(String[] args) {
		int a1[] = {10,77,10,54,-11,10};
		int sum = 0;
		int fixednum = 30;
		
		for(int i=0; i<a1.length;i++) {
			if(a1[i]==10) {
				sum = sum + a1[i];
			}
		}
		System.out.print(sum == fixednum);

	}

}
