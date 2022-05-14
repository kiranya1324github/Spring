package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	MobileProcessor mp;

	public MobileProcessor getMp() {
		return mp;
	}

	public void setMp(MobileProcessor mp) {
		this.mp = mp;
	}
	void phConfig() {
		System.out.println("128 mp Camera,64 mb RAM,Dual core");
		mp.process();
	}
	

}
