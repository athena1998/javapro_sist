package days27;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class Ex04 {
	public static void main(String[] args) {
		
		IntSupplier is = () -> (int) (Math.random()*100)+1;
		IntConsumer ic = i -> System.out.println(i + " ");
		IntPredicate p = i -> i%2 == 0;
		IntUnaryOperator op = i -> i/10*10;
		
		int[] arr = new int[10];
		makeRandomList(is, arr);
		System.out.println(Arrays.toString(arr));
		
		printEvenNum(p, ic, arr);
		
		int[] newArr = doSomething(op, arr);
		System.out.println(Arrays.toString(newArr));
		
		
		
	} // main

	private static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = op.applyAsInt(arr[i]);
			
		} // for i
		return newArr;
	}

	private static void printEvenNum(IntPredicate p, IntConsumer ic, int[] arr) {
		System.out.print("[");
		for (int i : arr) {
			if(p.test(i)) {
				ic.accept(i);
			}
		}
		System.out.println("]");
	}

	private static void makeRandomList(IntSupplier is, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = is.getAsInt();
		} // for i
		
	}

}
