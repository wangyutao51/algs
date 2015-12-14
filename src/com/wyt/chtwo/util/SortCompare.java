package com.wyt.chtwo.util;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * 进行算法效率比较
 * @author wang
 *
 */
public class SortCompare {

	public static double time(String alg,Comparable[] a)
	{
		Stopwatch timer = new Stopwatch();
		if(alg.equals("Insertion")) Insertion.sort(a);
		if(alg.equals("Selection")) Selection.sort(a);
		
		return timer.elapsedTime();
	}
	
	public static double timeRandomInput(String alg,int N,int T){
		double total = 0.0;
		Double[] a = new Double[N];
		for(int t = 0; t < T;t++){
			for(int i = 0; i< N; i++){
				a[i] = StdRandom.uniform();
			}
			total += time(alg,a);
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		String alg1 = "Insertion";
		String alg2 = "Selection";
		int N = 1000;
		int T = 1000;
		double t1 = 0.0;
		double t2 = 0.0;
		for(int i = 0;i<10;i++){
			
			t1 += timeRandomInput(alg1, N, T);
		}
		
		for(int i = 0;i<10;i++){
			
			t2 += timeRandomInput(alg2, N, T);
		}
		System.out.println(t1);
		System.out.println(t2);
	}
}
