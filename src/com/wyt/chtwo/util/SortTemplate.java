package com.wyt.chtwo.util;

/**
 * 排序的模板
 * @author wang
 *
 */
public class SortTemplate {

	/**
	 * 该方法用来比较v，w的值。该方法不需要更改
	 * @param v
	 * @param w
	 * @return
	 */
	public static boolean less(Comparable v,Comparable w){
		/**
		 *Compares this object with the specified object for order.  Returns a
		 * negative（负） integer, zero, or a positive（正） integer as this object is less
		 * than, equal to, or greater than the specified object.
		 */
		return v.compareTo(w) < 0;
	}
	
	/**
	 * 该方法用来交换数组 a 中序号为 i 和 j的元素的值。该方法不需要更改
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/**
	 * 按照每行num个元素来打印数组元素。该方法不需要更改
	 * @param a
	 * @param num
	 */
	public static void show(Comparable[] a,int num){
		System.out.println("当前数组顺序为：");
		if(num > 0){
			for(int i = 0; i < a.length;i++ ){
				System.out.print(a[i]);
				
				if((i+1) % num == 0){
					System.out.println();
				}else{
					if(i != (a.length-1)){
						System.out.print(" ");
					}
				}
				
			}
		}else{
			System.out.println("每行显示的元素数必须大于0");
		}
	}
	
	/**
	 *该方法用来判断数组是否已经完全排序，该方法不需要更改
	 * @param a
	 * @return
	 */
	public static boolean isSorted(Comparable[] a){
		for(int i = 0;i < a.length;i++){
			if(less(a[i],a[i-1])){
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * 对数组a进行排序，需要根据实际情况自行实现
	 * @param a
	 */
	public void sort(Comparable[] a){
		
	}
	
}
