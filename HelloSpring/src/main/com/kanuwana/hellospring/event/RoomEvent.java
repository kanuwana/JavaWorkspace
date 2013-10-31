package main.com.kanuwana.hellospring.event;

import org.springframework.context.ApplicationEvent;

public class RoomEvent extends ApplicationEvent{

	public RoomEvent(Object source) {
		super(source);
	}

	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return "Room Event Occured";
	}
}
