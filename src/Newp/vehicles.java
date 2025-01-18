package Newp;

abstract class vehicle {
public abstract int getnumbersofwheels();
}
class Bus extends vehicle{
	public int getnumbersofwheels(){
		return 6;
	}
}
class Auto extends vehicle{
	public int getnumbersofwheels() {
		return 3;
	}
}
public class vehicles{
	public static void main(String[] args) {
		Bus b=new Bus();
		System.out.println(b.getnumbersofwheels());
		Auto a=new Auto();
		System.out.println(		a.getnumbersofwheels());
	}
}