package sample.test.inheritance;

public class InterfaceSample {

	public static void main(String[] args) {
    A a = new A();
    a.m1();
     System.out.println(I1.x);
}

}

interface I1{
	 int x = 10;
	 void m1();
}
interface I2{
	int x =5;
	void m1();
}
class A implements I1,I2{
	A(){
		System.out.println(" x ="+I2.x);
	}
	public void m1(){
		System.out.println("hello");
	}
}