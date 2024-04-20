package working;

	class LaptopI5{
	
	public void processers() {
		System.out.println("Intel I5");
		System.out.println("Core 8");
		System.out.println("2.4Ghz");
	}
    public void Ram() {
		System.out.println("16GB");
	}
    public void ssd() {
		System.out.println("256GB");
	}
    public void battery() {
		System.out.println("1600 Power");
	}
   String laptopname="hp";
   String model = "12345";
   int version = 1425;
  public LaptopI5(String laptopname,String model,int version ) {
	this.laptopname=laptopname;
	this.model=model;
	this.version=version;
	
}
   
}
	class LaptopI7 extends LaptopI5{
		
		public LaptopI7(String laptopname, String model, int version) {
			super(laptopname, model, version);
			System.out.println(laptopname);
			System.out.println(model);
			System.out.println(version);
		}

		public void processers() {
			System.out.println("Intel I7");
			System.out.println("Core 16");
			System.out.println("2.8Ghz");
		}
		
		public void ssd() {
			System.out.println("512GB");	
			
		}
		
		
		
	}
	public class demo {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaptopI7 obj =new LaptopI7("dell", "3452", 9876);
		obj.processers();
		obj.ssd();
		obj.battery();
		obj.Ram();
	}

}
