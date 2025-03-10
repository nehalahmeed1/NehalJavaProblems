
public class FibonacciSeriesupto100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =0,b=1;
System.out.println(a);
System.out.println(b);
for(int i=1;i<=10;i++) {
	int c = a+b;
	if(c<1000) {
		a=b;
		b=c;
		System.out.println(c);
	}
}
	}

}
