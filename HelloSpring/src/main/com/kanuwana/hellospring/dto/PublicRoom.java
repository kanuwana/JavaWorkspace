package main.com.kanuwana.hellospring.dto;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import main.com.kanuwana.hellospring.event.RoomEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class PublicRoom implements Room, ApplicationEventPublisherAware{

	protected String roomType;
	protected List<Resource> resources;
	protected boolean ready;
	protected Manager manager;
	protected Cleaner cleaner;
	private ApplicationEventPublisher aep;
	
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

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean isReady) {
		this.ready = isReady;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	@Required
	@Autowired
	@Qualifier("smokerRoomRelated")
	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
	
	public Manager getManager() {
		return manager;
	}

	@javax.annotation.Resource
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@PostConstruct
	public void init()
	{
		System.out.println("Init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy method");
	}
	
	public void publishEvent()
	{
		RoomEvent re = new RoomEvent(this);
		aep.publishEvent(re);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.aep = publisher;
	}
}
