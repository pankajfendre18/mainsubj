package com.aish;

interface AddNum{
	public int sum(int a, int b);
}
public class FIAdd {

	public static void main(String[] args) {
		AddNum ref = (a,b) -> a+b;
		int result = ref.sum(10, 5);
		System.out.println(result);
	}

}
