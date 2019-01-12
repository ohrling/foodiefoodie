abstract class Mat {
	private String foodName;
	private String userName;
	
	public Mat(String foodName, String userName) {
		this.foodName = foodName;
		this.userName = userName;
		print();
	}		
	
	private void print() {
		System.out.println(userName + " gillar " + foodName + "!");
	}
}
