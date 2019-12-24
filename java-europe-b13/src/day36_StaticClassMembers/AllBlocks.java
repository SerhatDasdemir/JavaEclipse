package day36_StaticClassMembers;

public class AllBlocks {
	
	public AllBlocks(int x) {
		System.out.println("one arguments constructor");
		
	}
	public AllBlocks() {
		System.out.println("No Argument constructor");
		
						}
	
	static {
		System.out.println("First static init");
		
			}
	
	{
		System.out.println("First instance init");
	}
	{
		System.out.println("Second instance init");
	}
	
	static {
		System.out.println("second static init");
		
			}
}
