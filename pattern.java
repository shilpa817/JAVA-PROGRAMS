package cseproject1;

public class pattern {

		public static void main(String[] args) {
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print((i-j)+1);
				}
				else {
					System.out.print((j-i)+1);
				}
				}
				System.out.println(" ");
			}
		}
	}
