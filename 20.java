package projekt2;

class SelectionSort
{
	static void sort(int arr[])
	{
		int n=arr.length;
		
		for(int i=0; i<n-1; i++)
		{
			int indeksi_minimal=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[indeksi_minimal]) {
					indeksi_minimal=j;
				}
			}
			int temp=arr[indeksi_minimal];
			arr[indeksi_minimal]=arr[i];
			arr[i]=temp;
			 
			
		}
	}
	static void printoVargun(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n; ++i)
			System.out.print(arr[i]+ " ");
		System.out.println();
		
			
	}
	public static void main(String args[])
	{
		int vargu[]={27,13,-5,19,28,45,68,32};
		sort(vargu);
		System.out.println("Vargu i radhitur");
		printoVargun(vargu);
		}
	}
