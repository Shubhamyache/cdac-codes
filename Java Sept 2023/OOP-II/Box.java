class Box{
	private int height;
	private int width;
	private int depth;
	public Box(){}
	public Box(int height,int width,int depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public int volume()
	{
		return height*width*depth;
	}	
}