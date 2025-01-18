
package Newp;
abstract class NewQ{
		public abstract void m1();
		public abstract void m2();
	}
abstract class SubTest extends NewQ{
	public void m1() {
		
	}
//	public void m2() {
//		
//	}
}
class SubSubTest extends NewQ{
	public void m2() {
		
	}
}