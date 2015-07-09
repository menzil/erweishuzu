package test1;

public class Second {

	public static void main(String[] args) {
		int[][] array = new int[9][9];
		int m=1;
		for(int i=0;i<9;i++){
			for(int j=0;j<=i;j++){
				array[i][j]=(j+1)*(i+1);	
			}
		}
		for(int i=0;i<9;i++){
			for(int j=0;j<=i;j++){
				
				System.out.print(array[i][j]+",");
			}
			System.out.println();
		}

	}

}

/*	
 * 打印结果如下：
1,
2,4,
3,6,9,
4,8,12,16,
5,10,15,20,25,
6,12,18,24,30,36,
7,14,21,28,35,42,49,
8,16,24,32,40,48,56,64,
9,18,27,36,45,54,63,72,81,
 * */
