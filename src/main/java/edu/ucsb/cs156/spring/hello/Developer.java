package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

	// This class is not meant to be instantiated
	// so we make the constructor private

	private Developer() {
	}

	/**
	 * Get the name of the developer
	 */

	public static String getName() {
		// You may use just the name that is used on <https://bit.ly/cs156-f24-teams>
		// i.e. your first name, or your first and initial of last name

		return "Ajay";
	}

	/**
	 * Get the github id of the developer
	 * 
	 * @return github id of the developer
	 */

	public static String getGithubId() {
		return "ajayliu";
	}

	/**
	 * Get the developers team
	 * 
	 * @return developers team as a Java object
	 */

	public static Team getTeam() {
		Team team = new Team("f24-10");
		team.addMember("Ajay");
		team.addMember("Aneesh");
		team.addMember("Derrick");
		team.addMember("Justin");
		team.addMember("Peter");
		team.addMember("Rajvir");
		return team;
	}
}
