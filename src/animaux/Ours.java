package animaux;

public class Ours extends Animal {

	public Ours(String name) {
		super(name);
	}

	public Ours() {
		
	}
	
	@Override
	public String toString() {
		return "Ours [getName()=" + getName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
