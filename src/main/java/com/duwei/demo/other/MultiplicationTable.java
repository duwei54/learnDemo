package com.duwei.demo.other;

/**
 * 〈控制台输出乘法口诀〉<br>
 * @author duwei 2016-02-05
 */
public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d × %d = %2d  ",j,i,i*j);
			}
			System.out.print("\n");
		}
	}
}
