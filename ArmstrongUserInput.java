package com.armstrong;

public class ArmstrongUserInput {

	public static void main(String[] args) {
		int n = 153;
		int temp1 = n;
		int len = 0;

		while (temp1 > 0) {
			temp1 = temp1 / 10; // 153=15.3 1.53 0.15
			len++; // len=len+1 1 2 3
		}
		int temp2 = n;
		int rem = 0;
		int armOp = 0;

		while (temp2 > 0) {
			rem = temp2 % 10; // 3 5 1

			int mult = 1;

			for (int i = 1; i <= len; i++) //
			{
				mult = mult * rem; // 3 3*3=9 9*3=27
									// 5 5*5=25 25*5=125
									// 1 1*1=1 1
			}

			armOp = armOp + mult; // 0+27=27 27+125=152 152+1=153
			temp2 = temp2 / 10; // 15.3 1.5 0.1
		}
		if (n == armOp) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not armstrong");
		}
	}
}
