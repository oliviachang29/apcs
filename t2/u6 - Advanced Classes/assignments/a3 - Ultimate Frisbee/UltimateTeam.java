import java.util.ArrayList;

public class UltimateTeam {
	private ArrayList<UltimatePlayer> players;
	private ArrayList<Coach> coaches;

	public UltimateTeam(ArrayList<UltimatePlayer> p, ArrayList<Coach> c) {
		players = p;
		coaches = c;
	}

	public String getCutters() {
		String temp = "";
		for(UltimatePlayer p: players) {
			if (p.getPosition().equals("cutter")) {
				temp += p.toString() + "\n";
			}
		}
		return temp;
	}

	public String getHandlers() {
		String temp = "";
		for(UltimatePlayer p: players) {
			if (p.getPosition().equals("handler")) {
				temp += p.toString() + "\n";
			}
		}
		return temp;
	}

	public String toString() {
		String coaches_list = "COACHES\n";
		for(Coach c: coaches) {
			coaches_list += c.toString() + "\n";
		}

		String players_list = "PLAYERS\n";
		for(UltimatePlayer p: players) {
			players_list += p.toString() + "\n";
		}

		return coaches_list + "\n" + players_list;
	}
}