package io.java.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//annotation means that whatever we return is gonna get converted to json automatically and sent back as HTTP Response
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring","Spring Framework","Spring Framework Description"),
				new Topic("java","Core Java","Core Java Description"),
				new Topic("javascript", "Javascript", "JavaScript Description")
				);
	}
}
