
public class Darrays 
{

	private int[][] firstArray = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 }, { 4, 5, 6 }, { 5, 6, 7 }, { 6, 7, 8 }, { 7, 8, 9 } };

	public void twoDArrays() 
	{

		int[][] firstArray = new int[10][10];

		firstArray[1][0] = 2;

		for (int i = 0; i < firstArray.length; i++) 
		{
			for (int j = 0; j < firstArray.length; j++) 
			{

				System.out.print(firstArray[i][j]);

			}
			System.out.println();
		}

	}

	public void twoDArraysMoreColumns() 
	{

		for (int i = 0; i < firstArray.length; i++) 
		{
			for (int j = 0; j < firstArray[i].length; j++) 
			{

				System.out.print(firstArray[i][j]);

			}
			System.out.println();
		}

	}

	public void twoDArraysMoreRows() 
	{

		for (int k = 0; k < firstArray[k].length; k++) 
		{
			for (int l = 0; l < firstArray.length; l++) 
			{

				System.out.print(firstArray[l][k]);
			}
			System.out.println();
		}
	}

	public void whenTheIndexAndElementAreSame() 
	{
		int nums[] = { 1, 2, 45, 4, 5 };
		for (int i : nums) 
		{
			for (int j = 0; j < nums.length; ++j) 
			{
				if (nums[j] == i)
					System.out.println("i :" + i + " j :" + nums[j] + " i and j are the same");
			}
		}

	}

}
