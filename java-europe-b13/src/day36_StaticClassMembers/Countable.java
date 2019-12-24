package day36_StaticClassMembers;

public class Countable {
	
	static int instanceCount = 0;//belong to class

	public int getInstanceCount() {
		return instanceCount;
	}

	public Countable() {
		
		instanceCount++;
	}
	
	

}
