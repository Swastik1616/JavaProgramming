package learning;

public class a3dArray {
	public static void main (String[] agrs) {
		int a[][][] = new int [3][4][5];
		int i,j,k;
		
		//loop for adding elements in this 3D Array
		for(i=0;i<3;i++)
			for(j=0;j<4;j++)
				for(k=0;k<5;k++)
					a[i][j][k]= i+j+k;
		
		//loop for printing the 3D array
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				for(k=0;k<5;k++) 
			  System.out.print(a[i][j][k] + " ");
			  System.out.println();		
			}
			System.out.println();
		}
	}
	
}
