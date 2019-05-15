package io.rjs.swtorcalculator.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PassiveDiscipline {
	protected final String type;

	protected String imageUrl;
	protected String name;
	protected int level;

	public PassiveDiscipline() {
		this.type = "Passive";
	}

	public PassiveDiscipline(String type) {
		this.type = type;
	}
}
