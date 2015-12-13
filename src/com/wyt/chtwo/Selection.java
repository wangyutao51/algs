package com.wyt.chtwo;

/**
 * 学习排序算法，以数组为研究对象
 * @author wang
 *
 */
public class Selection {
	
	private static boolean less(Comparable v , Comparable w){
		int value = v.compareTo(w);
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	private static void myexch(int[] a,int i,int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i = 0;i < N;i++){
			int min = i;
			for(int j = i+1;j < N;j++){
				if(less(a[j],a[min])){
					min = j;
					exch(a,i,min);
				}
			}
		}
	}
	
	/**
	 * 选择排序，每次
	 * @param a
	 */
	public static void mySort(int[] a)
	{
		int N = a.length;
		for(int i = 0;i < N; i++){
			int min = i;
			for(int j = i+1;j < N; j++){
				if(a[j] < a[min]){
					min = j;
					myexch(a, i, min);
				}
			}
		}
		
	}
	
	private static void show(Comparable[] a){
		int N = a.length;
		for(int i = 0;i < N;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	private static void myShow(int[] a){
		int N = a.length;
		for(int i = 0;i < N;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,2,7,4,9,2};
		Comparable[] b = {"abc","cba","bac","aaa","abb"};
//		show(a);
		myShow(a);
		mySort(a);
		System.out.println();
		myShow(a);
		sort(b);
		System.out.println();
		show(b);
	}
}
