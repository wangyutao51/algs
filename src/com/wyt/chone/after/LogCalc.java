/**
 * 1.1.14练习
 */
package com.wyt.chone.after;

/**
 * @author wang
 *
 */
public class LogCalc {

	public static int BASE_NUMBER = 2;
	/**
	 * 计算不大于以2为底n的对数
	 * @param n
	 * @return
	 */
	public static int lg(int n) {
		
		int res = 0;
		
		if(n < 1)
		{
			return -1;
		}
		else if (n == 1) {
			return 0;
		}
		else
		{
			int temp = 1;
			for(int i = 0; i <= n; i++){
				temp = temp*2;
				if(temp > n){
					res =  i;
					break;
				}
				if(temp == n){
					res =  i+1;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(lg(17));
	}
}
