package io.rjs.swtorcalculator.model;

public class AppConstants {
	public static final String[] DISCIPLINE_TYPES = {"Active", "Passive"};
	public static final int[] UTILITY_LEVELS = {14, 22, 30, 38, 46, 54, 62, 70};
	public static final String PLACEHOLDER_URL = "";

	public static PassiveDiscipline createPlaceholderUtilization() {
		PassiveDiscipline placeholder = new PassiveDiscipline();
		placeholder.setImageUrl(PLACEHOLDER_URL);

		return placeholder;
	}
}
