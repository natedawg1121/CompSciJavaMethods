package Labs.magpieLab.activity2;

public class Magpie2 {
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response;

		if (statement.contains("no") || statement.contains("No")) {
			response = "Why so negative?";
		} else if (statement.contains("Elliot") || statement.contains("elliot")) {
			response = "Yes, Elliot is the ruler of the observable Universe and all Domains thereof.";
		} else if (statement.contains("Jason") || statement.contains("jason")) {
			response = "Jason should have added the keywords himself so that he would get something cool said about him. But he didn't!";
		} else if (statement.contains("Sun") || statement.contains("sun")) {
			response = "The sun is very hot.";
		} else if (statement.contains("mother") || statement.contains("father") || statement.contains("sister") || statement.contains("brother")) {
			response = "Tell me more about your family.";
		} else if (statement.contains("dog") || statement.contains("cat")) {
	    	response = "Tell me more about your pets.";
	    } else if (statement.contains("Dr. Petach")) {
	    	response = "She sounds like a good teacher.";
	    } else if (statement.trim().length() == 0) {
	    	response = "Say something, please.";
	    } else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			 response = "The HORSE is a noble animal.";
		} else if (whichResponse == 5) {
			response = "You should go give Elliot Gorokhovsky five dollars.";
		}
		return response;
	}
}