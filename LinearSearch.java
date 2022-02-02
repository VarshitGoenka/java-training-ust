import java.util.Scanner;
class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		System.out.println("enter the array elements");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to be searched");
		int num=sc.nextInt();
		linearsearch(arr,size,num);
	}

	public static void linearsearch(int[] arr,int size,int num)
	{
		int count=-1;
		for(int i=0;i<size;i++)
		{
			if(num==arr[i])
			{
				System.out.println("the num: "+num+" is present at the index: "+i);
				count++;
			}
		}
		if(count==-1)
		{
			System.out.println("the number is not present");
		}
	}
}