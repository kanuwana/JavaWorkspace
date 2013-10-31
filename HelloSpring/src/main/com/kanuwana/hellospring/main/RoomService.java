package main.com.kanuwana.hellospring.main;

import main.com.kanuwana.hellospring.dto.PublicRoom;
import main.com.kanuwana.hellospring.dto.Room;
import main.com.kanuwana.hellospring.event.RoomEvent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
	
	public static void main(String[] args) {

		AbstractApplicationContext/*BeanFactory*/ context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		PublicRoom /*Room - for testing*/ room = ( PublicRoom ) context.getBean("smokerRoom");
		System.out.println(context.getMessage("geeting", new Object[] {"Sahan", "Good Morning"}, "Hi", null));//Also you can take a instace variable of messagesrouce and inject
		System.out.println("Manager is " + room.getManager().getName() + " and Cleaner is " + room.getCleaner().getName());
		room.publishEvent();
	}

}
