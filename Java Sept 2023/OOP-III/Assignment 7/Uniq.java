public class Uniq
{
    public boolean isUnique(int []arr){
	for(int i=0;i<5;i++)
	{
		for(int j=1;j<5;j++)
		{
			if(i!=j){
			if(arr[i]==arr[j])
				{
					return false;
				}
		}}
	
	}
	return true;
	}
}
