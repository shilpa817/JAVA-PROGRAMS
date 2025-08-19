/*package cseproject1;
abstract class shape{
	abstract void draw();
	void message() {
		System.out.println("message from shape");
	}
}
class rectangleshape extends shape{
	int length, breadth;
	rectangleshape(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void draw() {
		System.out.println("draw rectangle using length "+length+" & breadth "+breadth);
	}
}
public class samm {
	public static void main(String[]args) {
		rectangleshape o= new rectangleshape(6,8);
		o.draw();
		o.message();
	}
}
*/
package cseproject1;

interface s {
	void sound();
	void sleep();
	void eat();
}
class samm implements s{
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
		samm o=new samm();
		o.sound();
		o.sleep();
		o.eat();
	}

}