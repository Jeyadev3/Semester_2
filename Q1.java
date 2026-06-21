package set1;

public class Q1 {
	public static void main(String[] args) {
	int n=4;
	for(int i=0;i<=n;i++) {
		for(int j=n;j>i;j--) {
			System.out.print(" ");}
		for(int k=1;k<i;k++) {
			System.out.print(k);}
		for(int l=i;l>0;l--){
			System.out.print(l);
		}
			
		System.out.println();}
	
	
	for(int i=n-1;i>0;i--) {
		for(int j=n;j>i;j--) {
			System.out.print(" ");}
		for(int k=1;k<i;k++) {
			System.out.print(k);}
		for(int l=i;l>0;l--){
			System.out.print(l);
		}
			
		System.out.println();}
	
	}

}
