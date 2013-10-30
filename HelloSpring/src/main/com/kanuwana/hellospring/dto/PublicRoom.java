package main.com.kanuwana.hellospring.dto;

import java.util.List;

public class PublicRoom implements Room {

	protected String roomType;
	protected List<Resource> resources;
	protected boolean ready;
	protected Cleaner cleaner;
	
	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String type) {
		this.roomType = type;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public boolean IsReady() {
		return ready;
	}

	public void setReady(boolean isReady) {
		this.ready = isReady;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
}
