
public class Output 
{
public static void main(String args[])
{
	int[] myArray= {1,2,3,4,5};
	ChangeIt.doIt(myArray);
	int i=0,j=0;
			for(j=0;j<myArray.length;j++)
			{
			System.out.println(myArray[j]+" ");
			}
}	
}
class ChangeIt{
	static void doIt(int[]z)
	{
		z=null;
	}
}

