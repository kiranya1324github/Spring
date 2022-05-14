package com.edu;

public class TextEditor {

	private SpellCheck text;

	
	
	
	
	public SpellCheck getText() {
		return text;
	}
   public void setText(SpellCheck text) {
		this.text = text;
	}





	public void check() {
		if(text!=null) {
		 text.check();
		}else {
			System.out.println("spelling is not Check");
		}
		
		
	}
	

	
	
}
