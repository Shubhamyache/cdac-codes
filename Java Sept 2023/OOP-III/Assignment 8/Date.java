 class Date
{
	private int dd,mm,yy;
	private static int count;
	public Date(){
		count++;
	}
	public Date(int dd,int mm,int yy)
	{
		count++;
		this.dd= dd;
		this.mm = mm;
		this.yy = yy;		
	}
	public void showDate(){
		System.out.println(dd+"/"+mm+"/"+yy);
		System.out.println("Count: "+count);

		
	}
	public void showDate(char ch){
		System.out.println(dd+""+ch+mm+""+ch+yy);
		System.out.println("Count: "+count);

	}
}