package array;

public class RecurredNameException extends Exception {
	
	private String name;
	
	public RecurredNameException(String name, String message) {
		super(message);
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
