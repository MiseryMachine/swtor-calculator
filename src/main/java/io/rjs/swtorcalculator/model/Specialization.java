package io.rjs.swtorcalculator.model;


public class Specialization {
	private String name;
	private String specUrl;
	private String role;
	private String roleUrl;
	private String description;
	private ActiveDiscipline[] mainDisciplines = new ActiveDiscipline[4];
	private PassiveDiscipline[] disciplinePath = new PassiveDiscipline[27];
}
