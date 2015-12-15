package com.wyt.chtwo;

import com.wyt.chtwo.util.SortTemplate;

/**
 * 希尔排序，对于间隔为h的元素保证是递增的序列
 * @author wang
 *
 */
public class Shell extends SortTemplate {

	@Override
	public void sort(Comparable[] a){
		int N = a.length;
		int h = 1;
		while(h<N/3){
			h = 3*h +1;
		}
		
		while(h >= 1){
			for(int i = h;i < N;i++){
				for(int j = i;j >= h && less(a[j], a[j-h]);j -= h){
					exch(a, j, j-h);
					System.out.println();
					show(a,20);
				}
			}
			h = h/3;
		}
	}
	
	public static void main(String[] args) {
		Comparable[] a = {9,6,2,1,4,6,8,0,11,45,78,3,0,23};
		Shell shell = new Shell();
		show(a, 20);
		shell.sort(a);
		System.out.println();
		System.out.println("----------------");
		show(a, 20);
	}
}
