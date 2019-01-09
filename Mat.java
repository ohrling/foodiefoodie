abstract class Mat {
	private String name;
	
	public Mat(String name) {
		this.name = name;
		print();
	}		
	
	private void print() {
		System.out.println(name + " är gott!");
	}
}
