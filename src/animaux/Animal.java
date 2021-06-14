package animaux;

public abstract class Animal {

	private String name;

	protected Animal() {
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal{" + this.name + '}';
	}

}
