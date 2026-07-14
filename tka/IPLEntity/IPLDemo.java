package com.tka.IPLEntity;

public class IPLDemo {
	private int jerseyNumber;
	private String playerName;
	private String teamName;
	private int totalRuns;
	public IPLDemo() {
		
	}
	public IPLDemo(int jerseyNumber, String playerName, String teamName, int totalRuns) {
		super();
		this.jerseyNumber = jerseyNumber;
		this.playerName = playerName;
		this.teamName = teamName;
		this.totalRuns = totalRuns;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	@Override
	public String toString() {
		return "IPLDemo [jerseyNumber=" + jerseyNumber + ", playerName=" + playerName + ", teamName=" + teamName
				+ ", totalRuns=" + totalRuns + "]";
	}
	
}
