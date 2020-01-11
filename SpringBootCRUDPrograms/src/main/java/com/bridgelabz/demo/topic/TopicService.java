package com.bridgelabz.demo.topic;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Service for the CRUD Operations
 * Date		:07/01/2019
 *
 **********************************************************************************************/
@Service  // For implementing bussiness Logic
		  // Spring is gonna look at this..ok this is service, creates a new instance and register it
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();   // Converts To the List and sends back
		topicRepository.findAll() // Getting instances from the table
		.forEach(topics::add);    // Find all and forEach of them populating the topics list from an Array list
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).orElse(null);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);   // To save the topic into the database
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);   // To save the topic into the database
	}

	public void deleteTopic(String id) {
		 topicRepository.deleteById(id);
	}
}
