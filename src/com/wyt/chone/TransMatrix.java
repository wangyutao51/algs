/**
 * 
 */
package com.wyt.chone;

import javax.sound.midi.Synthesizer;

/**
 * @author wang
 * 
 *         习题1.1.13 M*N矩阵转置
 *
 */
public class TransMatrix {

	public static void main(String[] args) {

		/**
		 * 编制测试样例
		 */
		String[][] twoDarray = { { "1", "2", "3" }, 
								 { "4", "5", "6" }, 
								 { "7", "8", "9" }, 
								 { "0", "-", "+" } };

		
		String[][] result = transMatrix(twoDarray);

		// 遍历转置后的矩阵
		for(int i = 0;i < result.length;i++){
			for(int j = 0;j < result[0].length;j++){
				
				System.out.print(result[i][j]);
				
				if((j + 1) % (result[0].length) == 0){
					System.out.println();
				}else
				{
					System.out.print(" ");
				}
			}
		}
	}

	/**
	 * 
	 * @param array 输入二维数组
	 * @return 返回转置后的二维数组
	 */
	private static String[][] transMatrix(String[][] array) {
		
		//计算行数
		int rows = array.length;
		//计算列数
		int cols = array[0].length;
		
		String[][] result = new String[cols][rows]; 
		
		//转置
		for (int i = 0; i < cols;i++){
			for(int j = 0;j < rows;j++){
				result[i][j] = array[j][i];

			}
		}
		
		return result;
	}
	
}
