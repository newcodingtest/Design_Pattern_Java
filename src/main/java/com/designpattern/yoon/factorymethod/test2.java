package com.designpattern.yoon.factorymethod;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class test2 {
	static Stack<String> stack =new Stack<String>();
	static Set<Long>set = new LinkedHashSet<>();
	public static void main(String[] args) {
		String s ="0110";
		int n = 4;
		
		System.out.println(	solution(s, n));
	}
	
	public static boolean solution(String input , long index) {
		addStack(input);
		peekAndCalculate();
		return set.contains(index);
	}
	
	public static void addStack(String input) {
		String[] arr = input.split("");
		for(String str : arr) {
			stack.add(str);
		}
		
	}
	public static void peekAndCalculate() {
		int cnt = 0;
		long sum = 0;
		String result = "";
		while(stack.size()>0) {
			String str = stack.pop();
			result+=str;
			calculate(result);
		}
	}
	
	//01, 10
	public static void calculate(String str) {
		if(str.length()==1) {
			set.add(Long.parseLong(str.split("")[0]));
		}else {
			StringBuilder sb = new StringBuilder();
			sb.append(str);
			
			String[] temp = str.split("");//110 = 6
			String[] reverse = sb.reverse().toString().split("");//011 = 3
			
			long sum= 0;
			int cnt = 1;
			for(int i=sb.length()-1; i>=0; i--) {
				long result = (long) Long.parseLong(temp[i])*cnt;
				sum+=result;
				set.add(sum);
				cnt=cnt*2;
			}
			
			sum= 0;
			cnt = 1;
			for(int i=sb.length()-1; i>=0; i--) {
				long result = (long) Long.parseLong(reverse[i])*cnt;
				sum+=result;
				set.add(sum);
				cnt=cnt*2;
			}// end for
			
		}//end else
	}//end calculate()
	
}
