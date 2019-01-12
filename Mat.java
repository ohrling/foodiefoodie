abstract class Mat {
	private String foodName;
	private String userName;
	
	public Mat(String foodName, String userName) {
		this.foodName = foodName;
		this.userName = userName;
	}		
	
	@Override
	public String toString() {
		return String.format(userName + " tycker om " + foodName + "!");
	}
}
