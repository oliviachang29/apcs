public class TeamMember implements Comparable {
	private String fullName;
	private String idString;

	public TeamMember (String name, String id) {
		// convert to title case - not functional
		String tempName = "";

		for (int i = 0; i < name.length(); i++) {
			if (i == 0 || name.charAt(i - 1) == ' ' || name.charAt(i - 1) == '\t') {
				tempName += name.substring(i, i+1).toUpperCase();
			} else {
				tempName += name.substring(i, i+1).toLowerCase();
			}
		}

		// System.out.println(tempName);
		fullName = tempName;
		idString = id;
	}

	public String toString() {
		return fullName;
	}

	public String idString() {
		return idString;
	}

	public int compareTo(Object t) {
		TeamMember other = (TeamMember) t;
		if (idString.compareTo(other.idString) < 0) {
			return -1;
		} else if (idString.compareTo(other.idString) > 0) {
			return 1;
		}
		return 0;
	}
}