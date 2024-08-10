public class A{
	int a;
    A(int a_){
    	a=a_; 
    }
}
class B extends A{
	int b;
	
	B(int b_,int a_){
		super (a_);
		b=b_;
	}

void Disp()
{
	System.out.println("A :"+a+"B :"+b);
}

}
class HelloWorld  {
    public static void main(String[] args) {
        B b= new B(10,10);
        b.Disp();
    }
}