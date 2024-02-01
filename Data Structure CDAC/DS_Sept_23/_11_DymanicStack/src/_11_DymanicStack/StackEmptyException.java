package _11_DymanicStack;

public class StackEmptyException extends Exception{
	String msg;
	public StackEmptyException()
	{
		msg="Stack Is Empty ";
	}
	public StackEmptyException(String str)
	{
		msg=str;
	}
	@Override
	public String getMessage()
	{
		return msg;
	}

}
