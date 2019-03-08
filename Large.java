class Large
{
	public static void main(String[] args) 
	{
		int a[]={80,90,5,10,20,30,50,40};
		int max=0;
		for(int i=0;i<8;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("largest number ="+max);
	}
}