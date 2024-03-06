import java.util.Arrays;
class a_sum
{
	public static void main(String[]args)
	{
	Integer a[]=new Integer[]{5,44,555,2585};
	Integer b[]=new Integer[]{5,5,55,555};

	Integer c[]=new Integer[4]; 
	
	for(int i=0;i<c.length;i++)
	{
		c[i]=a[i]+b[i];
	}
		System.out.println("result array:"+Arrays.toString(c));
	}
}