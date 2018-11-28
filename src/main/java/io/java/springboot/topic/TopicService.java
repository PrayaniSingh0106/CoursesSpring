package io.java.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//Business Service - Singleton in Spring. Other controllers are dependent on it and hence it's dependency is injected to other classes trhough spring
//First instance of all @Service annotated classes are made in the beginning so that dependency injection can happen with @Autowired in other classes
@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework Description"),
			new Topic("java","Core Java","Core Java Description"),
			new Topic("javascript", "Javascript", "JavaScript Description")
			);
	
	public List<Topic> getAllTopcis(){
		
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
