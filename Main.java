class Main {
	public static void main(String[] args) {
		Mat[] buffe = {
			new HotDog("Lumi"),
			new Rotmos("Tommy"),
			new PulledPork("Anders")
		};
		for(Mat m: buffe){
			System.out.println(m);
		}
	}
}
