package com.wyt.chtwo;

import com.wyt.chtwo.util.SortTemplate;

/**
 * 插入排序
 * @author wang
 *
 */
public class Insertion extends SortTemplate {
	
	@Override
	public void sort(Comparable[] a){
		int N = a.length;
		for(int i = 1;i < N;i++){
			for(int j = i;j > 0;j-- ){
				if(less(a[j],a[j-1])){
					exch(a, j, j-1);
				}
				else{
					continue;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Comparable[] a = {3,2,5,7,2,8};
		Insertion insert = new Insertion();
		show(a, 10);
		insert.sort(a);
		System.out.println();
		show(a, 10);
	}
	
}
