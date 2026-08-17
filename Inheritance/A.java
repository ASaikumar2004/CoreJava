package Inheritance;

class A {
	int age;
	A(int age){
		this.age=age;
	}
}

class B extends A{
	B(){
     super(10);
}
}

