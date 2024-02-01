package Office.persons;

public class Address {
	
		public String area;
		public String city;
		public int pincode;
		
		public Address(){
			area = "No Area";
			city = "No city";
			pincode = 111;
		}
		public Address(String area, String city, int pincode){
			this.area = area;
			this.city = city;
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "Address [area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
		}
		
		
//		public void display(){
//			System.out.println("Area: "+area);
//			System.out.println("city: "+city);
//			System.out.println("pincode: "+pincode);
//		}
}


