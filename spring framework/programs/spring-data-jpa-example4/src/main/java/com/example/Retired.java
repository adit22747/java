package com.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class Retired extends User {
	@Override
	public String toString() {
		return "Retired [pension=" + pension + "]";
	}

	private int pension;

	public int getPension() {
		return pension;
	}

	public void setPension(int pension) {
		this.pension = pension;
	}

	public Retired(int id, String name, int pension) {
		super(id, name);
		this.pension = pension;
	}
	
	public Retired(String name, int pension) {
		super(name);
		this.pension = pension;
	}

	public Retired(int id, String name) {
		super(id, name);
	}

	public Retired() {
		super();
	}

}
