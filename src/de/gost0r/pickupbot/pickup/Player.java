package de.gost0r.pickupbot.pickup;

import java.util.ArrayList;
import java.util.List;

import de.gost0r.pickupbot.discord.DiscordUser;

public class Player {
	
	public static Database db;
	
	private DiscordUser user;
	private String urtauth;
	
	private GameMap votedMap = null;
	private int elo = 1000;
	private int eloChange = 0;
	
	private boolean banned;
	
	private boolean surrender = false;
	
	public Player(DiscordUser user, String urtauth) {
		this.user = user;
		this.setUrtauth(urtauth);
		playerList.add(this);
	}
	
	public void voteMap(GameMap map) {
		if (votedMap == null) {
			votedMap = map;
		}
	}
	
	public void voteSurrender() {
		surrender = true;
	}
	
	public void resetVotes() {
		votedMap = null;
		surrender = false;
	}
	

	public void addElo(int elochange) {
		this.elo += elochange;
		this.eloChange = elochange;
		
		// db update done by servermonitor
	}
	
	public GameMap getVotedMap() {
		return votedMap;
	}
	
	public boolean hasVotedSurrender() {
		return surrender;
	}

	public DiscordUser getDiscordUser() {
		return user;
	}

	public int getElo() {
		return elo;
	}

	public void setElo(int elo) {
		this.elo = elo;
	}

	public int getEloChange() {
		return eloChange;
	}

	public void setEloChange(int eloChange) {
		this.eloChange = eloChange;
	}
	
	public String getUrtauth() {
		return urtauth;
	}

	public void setUrtauth(String urtauth) {
		this.urtauth = urtauth;
	}

	public boolean isBanned() {
		return banned;
	}
	
	public PlayerRank getRank() {
		return getRank(elo);
	}
	
	private PlayerRank getRank(int elo) {
		if (elo > 1600) {
			return PlayerRank.DIAMOND;
		} else if (elo > 1350) {
			return PlayerRank.PLATINUM;
		} else if (elo > 1150) {
			return PlayerRank.GOLD;
		} else if (elo > 1000) {
			return PlayerRank.SILVER;
		} else if (elo > 850) {
			return PlayerRank.BRONZE;
		} else {
			return PlayerRank.WOOD;
		}
	}
	
	public boolean didChangeRank() {
		PlayerRank currentRank = getRank(elo);
		PlayerRank previousRank = getRank(elo-eloChange);
		return currentRank != previousRank;
	}

	private static List<Player> playerList = new ArrayList<Player>();
	public static Player get(String urtauth) {
		for (Player player : playerList) {
			if (player.getUrtauth().equals(urtauth))
				return player;
		}
		Player p = db.loadPlayer(urtauth); // can be valid or null
		return p;
	}

	public static Player get(DiscordUser user) {
		for (Player player : playerList) {
			if (player.getDiscordUser().equals(user))
				return player;
		}
		Player p = db.loadPlayer(user); // can be valid or null
		return p; 
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Player) {
			Player player = (Player) o;
			return player.getDiscordUser().equals(this.getDiscordUser()) && player.urtauth == this.urtauth;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.urtauth;
	}

	public static void remove(Player player) {
		if (playerList.contains(player)) {
			playerList.remove(player);
		}
	}
}
