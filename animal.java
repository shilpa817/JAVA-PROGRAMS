package cseproject1;
interface animal {
	void sound();
	void sleep();
	void eat();
}
class Dog implements animal{
	public void sound() {
		System.out.println("the dog sound like:bowwwwwww");
	}
	public void sleep() {
		System.out.println("the dog sleep peacefully");
	}
	public void eat() {
		System.out.println("the dog eating bones");
	}
	public static void main(String[] args) {
		Dog o=new Dog();
		o.sound();
		o.sleep();
		o.eat();
	}
}
