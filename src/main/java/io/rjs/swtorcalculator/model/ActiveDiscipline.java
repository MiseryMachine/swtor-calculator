package io.rjs.swtorcalculator.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActiveDiscipline extends PassiveDiscipline {
	private String description;
	private String activation;
	private String resourceCost;
	private String cooldown;
	private String range;

	public ActiveDiscipline() {
		super("Active");
	}
}
