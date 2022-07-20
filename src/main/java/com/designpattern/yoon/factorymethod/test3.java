package com.designpattern.yoon.factorymethod;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class test3 {//5,6
	//1. 인접행렬 방법
	static Character[][] arr= {{'A','B','C','D','E','F'},
			{'G','H','I','J','K','L'},
			{'M','N','O','P','Q','R'},
			{'S','T','U','V','W','X'},
			{'Y','Z'}
	};
	//2. 객체 노드 방법
	static Map<String,Node> map = new LinkedHashMap<>();
	static int[] dp;
	public static void main(String[] args) {
		String input = "ababab";
		
		solution(input);
		
	}
	public static void makeNode() {
		map.put("A",new Node(0, 0));map.put("B",new Node(0, 1)); map.put("C",new Node( 0, 2)); map.put("D",new Node( 0, 3)); map.put("E",new Node( 0, 4)); map.put("F",new Node( 0, 5));
		map.put("G",new Node( 1, 0));map.put("H",new Node(1, 1)); map.put("I",new Node( 1, 2)); map.put("J", new Node(1, 3)); map.put("K",new Node( 1, 4)); map.put("L",new Node( 1, 5));
		map.put("M",new Node( 2, 0));map.put("N",new Node( 2, 1)); map.put("O",new Node( 2, 2)); map.put("P",new Node( 2, 3)); map.put("Q", new Node(2, 4)); map.put("R",new Node( 2, 5));
		map.put("S",new Node( 3, 0));map.put("T",new Node(3, 1)); map.put("U",new Node( 3, 2)); map.put("V",new Node( 3, 3)); map.put("W",new Node( 3, 4)); map.put("X",new Node( 3, 5));
		map.put("Y",new Node( 4, 0));map.put("Z",new Node(4, 1));
	}
	
	
	public static void solution(String str) {
		makeNode();
		
		String[] answer = str.toUpperCase().split("");
		dp = new int[str.length()];
		
		String left="";
		String right="";
		
		dp[0]=0;
		int leftCnt = 0;
		int rightCnt = 0;
		
		int max = Integer.MAX_VALUE;
		for(int i=0; i<answer.length; i++) {
				//H
				Node temp = map.get(answer[i]);
				//최근 왼쪽 누른키
				if(temp.getY()<=2) {
					if(left.equals("")) {
						left = answer[i];
					}else{
						Node pre = map.get(left);
						leftCnt+= Math.abs(pre.getX()-temp.getX())+Math.abs(pre.getY()-temp.getY());
						
					}
					
				//최근 오른쪽 누른키	
				}else if(temp.getY()>2){
					if(right.equals("")) {
						right = answer[i];
					}else {
						Node pre = map.get(right);
						rightCnt+= Math.abs(pre.getX()-temp.getX())+Math.abs(pre.getY()-temp.getY());
					}
				}
		}
		System.out.println(leftCnt+rightCnt);
	}
	
	
static class Node{
	int x;
	int y;
	
	public Node(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
}	
	
}
