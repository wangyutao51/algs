package com.wyt.chtwo;

import com.wyt.chtwo.util.SortTemplate;

public class Select extends SortTemplate {

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

	public static void main(String[] args) {
		Comparable[] a = {1,4,2,3};
		System.out.print("排序前：");
		show(a, 5);
		Select select = new Select();
		select.sort(a);
		System.out.println();
		show(a, 5);
	}
}
