package com.bridgelabz.demo.topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Service for the CRUD Operations
 * Date		:07/01/2019
 *
 **********************************************************************************************/
@Service  // For implementing bussiness Logic
		  // Spring is gonna look at this..ok this is service, creates a new instance and register it
public class TopicService {
	
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(

				new Topic("spring","Spring Framework","Spring Description"),
				new Topic("java","Core Java","Core Java Description"),
				new Topic("javaScript","JavaScript","Description")
				));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopics(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
