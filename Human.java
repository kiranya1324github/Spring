package com.edu;

public class Human {

	private Heart heartobj;// auto wire means byname and id in xml should be same
	
	private Heart getHeart() {
		return heartobj;
	}

	public void setHeart(Heart heart) {
		this.heartobj = heart;
	}
  
	public void HumanFunction() {
		if(heartobj!=null) {
			heartobj.pump();
			
		}
		else {
			System.out.println("Not Alive");
		}
	}
	
	
}
