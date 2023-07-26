package java_assign_interface;

public abstract  class ImplementAB implements InterfaceA ,InterfaceB{
	
	public void addition() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("addition is ="+c);
	}
	public void substraction() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("substraction is ="+c);
	}
	public void Exercise() {
		
		System.out.println("This is Exercise method ");
	
	}
    public void Eating() {
		
		System.out.println("This is Eating method ");
	
	}
	@Override
	public abstract void Sleeping();
	@Override
	public abstract void Working();
	@Override
	public abstract void multiplication();
	@Override
	public abstract void division();
}
