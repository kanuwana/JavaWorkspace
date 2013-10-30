package main.com.kanuwana.hellospring.dto;

public class SmokerRoom extends PublicRoom {

	private String smokingTimeStart;
	private String smokingTimeEnd;
	
	public String getSmokingTimeStart() {
		return smokingTimeStart;
	}
	public void setSmokingTimeStart(String smokingTimeStart) {
		this.smokingTimeStart = smokingTimeStart;
	}
	public String getSmokingTimeEnd() {
		return smokingTimeEnd;
	}
	public void setSmokingTimeEnd(String smokingTimeEnd) {
		this.smokingTimeEnd = smokingTimeEnd;
	}
}
