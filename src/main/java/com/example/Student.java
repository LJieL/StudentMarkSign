package com.example;

public class Student {
	private String name;
	private int cardid;
	private boolean sign ;//表示签到状态 默认为false
	
	public Student(String name, int cardid, boolean sign) {
		super();
		this.name = name;
		this.cardid = cardid;
		this.sign = sign;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", cardid=" + cardid + ", sign=" + sign + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public boolean isSign() {
		return sign;
	}
	public void setSign(boolean sign) {
		this.sign = sign;
	}
}
