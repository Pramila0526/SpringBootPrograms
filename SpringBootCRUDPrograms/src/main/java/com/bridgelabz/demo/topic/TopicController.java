 package com.bridgelabz.demo.topic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Contoller for the CRUD Operations
 * Date		:07/01/2019
 *
 **********************************************************************************************/
@RestController // The @RestController annotation in Spring MVC is nothing but a 
				// combination of @Controller and @ResponseBody annotation.

// The job of @Controller is to create a Map of model object and find a view but 
// @RestController simply return the object and object data is directly written into HTTP response as JSON or XML.

public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")  // @PathVariable maps the variable so
									//	we can map the URI variable to one of the method arguments
	public Topic getTopics(@PathVariable String id) // Read a resource
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/topics") // Create a new resource
	public void addTopic(@RequestBody Topic topic)   
	{
	 topicService.addTopic(topic);	
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/topics/{id}") // Update an existing resource
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
	 topicService.updateTopic(id,topic);	
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/topics/{id}") // Delete a resource
	public void deleteTopic(@PathVariable String id)
	{
	 topicService.deleteTopic(id);	
	}
}
