package main.com.kanuwana.hellospring.main;

import main.com.kanuwana.hellospring.dto.Room;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoomService {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		
		Room room = ( Room ) beanFactory.getBean("smokerRoom");
		
		System.out.println(room.isAvailable());
	}

}
