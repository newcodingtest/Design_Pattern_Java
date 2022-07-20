package com.designpattern.yoon.factorymethod;

import java.util.LinkedHashSet;
import java.util.Set;

public class test1 {
	static Set<Integer>s = new LinkedHashSet<>();
	static int[] answer;
	public static void main(String[] args) {
		int[] arr = {1,3,5};
		
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] input) {
		answer = input;
	
		for(int i=0; i<answer.length; i++) {
			int sum = 0;
			for(int j=i; j<answer.length; j++) {
				sum+=input[j];
				if(sum%2==1) {
				s.add(sum);
				}
			}
		}
		return s.size();
	}
}
