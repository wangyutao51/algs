package com.wyt.chone;

import java.io.File;
import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *  The <tt>BinarySearch</tt> class provides a static method for binary
 *  searching for an integer in a sorted array of integers.
 *  <p>
 *  The <em>rank</em> operations takes logarithmic time in the worst case.
 *  <p>
 *  For additional documentation, see <a href="http://algs4.cs.princeton.edu/11model">Section 1.1</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class BinaySearch {

    /**
     * This class should not be instantiated.
     */
    private BinaySearch() { }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param  a the array of integers, must be sorted in ascending order
     * @param  key the search key
     * @return index of key in array <tt>a</tt> if present; <tt>-1</tt> otherwise
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }


    /**
     * Reads in a sequence of integers from the whitelist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     */
    public static void main(String[] args) {

    	
    	File file = new File("/home/wang/javaworkspace/algsLearn/src/com/wyt/learn/largeW.txt");
    	
        // read the integers from a file
        In in = new In(file);
        int[] whitelist = in.readAllInts();
        
        System.out.println("Here");
        // sort the array
        Arrays.sort(whitelist);
        
    /*    for(int i = 0;i < whitelist.length;i++){
        	System.out.print(whitelist[i]+" ");
        	if(i % 10 == 0){
        		System.out.println();
        	}
        }*/

        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            System.out.println(key);
            if (BinaySearch.indexOf(whitelist, key) == -1)
//                StdOut.println(key);
            	StdOut.println(whitelist[key]);
        }
        
        System.out.println("初始导入");
        
    }
}

