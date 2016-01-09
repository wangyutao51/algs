package com.wyt.chone;

import com.wyt.chtwo.util.SortTemplate;

public class MyBinaySearch extends SortTemplate{

	/**
	 * 使用选择排序将数组进行排序
	 */
	@Override
	public void sort(Comparable[] a){
		int N = a.length;
		for(int i = 0;i < N; i++){
			int min = i;
			for(int j = i+1; j < N;j++){
				if(less(a[j],a[min])){
					exch(a, j, min);
				}
			}
		}
	}
	
	/**
	 * 二分查找
	 * 如果查找到了相应元素，则直接返回该元素的序列值，如果没有则返回-1
	 * @param key 代查找元素
	 * @param a   已经经过排序的数组，生序排列
	 * @return
	 * 
	 */
	public static int rank(int key , int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			int mid = lo + (hi -lo)/2;
			
			if(key < a[mid]){
				hi = mid - 1;
			}else if(key > a[mid]){
				lo = mid + 1;
			}else{
				return mid;
			}
				
		}
		
		return -1;
	}
	
	/**
	 * 编写测试用例
	 * @param args
	 */
	public static void main(String[] args) {
		
		int key = 5;//待查找的元素
		
		Comparable[] a = {3,2,6,9,0,1,5,4,7,8,10};
		//此处必须规定数组的长度，否则会报空指针
		int[] b = new int[a.length];
		
		int length = a.length;
		System.out.println(length);
		
		MyBinaySearch mbs = new MyBinaySearch();
		mbs.sort(a);
		
		boolean isSort = isSorted(a);

		//判断
		if(isSort){
			System.out.println("待查找的数组已经完全排序");
		}else{
			System.out.println("当前数组还没有完全排序");
		}
		
		//将数组转换成int型的
		for(int i = 0; i < a.length; i++){
			b[i] = (int)a[i];
		}
			int result = mbs.rank(key, b);
			
		if(result != -1){
			System.out.println("元素:"+ key + "在数组中的位置是："+result);
		}
		else
		{
			System.out.println("元素："+key+"不存在");
		}
		
	}
}
