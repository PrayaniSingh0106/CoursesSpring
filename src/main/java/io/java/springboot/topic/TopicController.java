package io.java.springboot.topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//annotation means that whatever we return is gonna get converted to json automatically and sent back as HTTP Response
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopcis();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(String id) {

		return topicService.getTopic(id);
	}
}
