class Point{
	private int x;
	private int y;
	public Point(){}
	public Point(int a,int b){
		x = a;
		y = b;
	}
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	public void display(){
		System.out.println("["+x+","+y+"]");
	}
	
	
}