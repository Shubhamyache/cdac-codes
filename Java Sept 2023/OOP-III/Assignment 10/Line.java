public class Line{
	private int start;
	private int end;
	
	public Line(){
		start = 0;
		end =0;
	}
	public Line(int s, int e){
		start = s;
		end = e;
	}
	public void display(){
		System.out.println("Start: "+start);
		System.out.println("end: "+end);

	}
}