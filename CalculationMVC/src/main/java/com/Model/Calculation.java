package com.Model;

public class Calculation {

	private int no1;
	private int no2;
	private int sum;
	private int sub;
	private int mul;
	private int div;
	
	public Calculation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculation(int no1, int no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSub() {
		return sub;
	}
	public void setSub(int sub) {
		this.sub = sub;
	}
	public int getMul() {
		return mul;
	}
	public void setMul(int mul) {
		this.mul = mul;
	}
	public int getDiv() {
		return div;
	}
	public void setDiv(int div) {
		this.div = div;
	}
	
	
}
