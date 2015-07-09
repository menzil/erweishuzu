package test1;

public class First {

	public static void main(String[] args) {
		double avarage=0;
		int sum=0;
		int max=0;
		int[][] array = new int[4][2];
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++){
				array[i][j]=j+1;
			}
		}
		array[3][1]=151;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++){
				System.out.print(array[i][j]+" ");
				if(array[i][j]>max){
					max=array[i][j];
				}
				sum+=array[i][j];
				avarage=sum/(8.00);
			}
			System.out.println();
		}
		System.out.println("sum = "+sum+", sum = "+max+", avarage = "+avarage);

	}

}
