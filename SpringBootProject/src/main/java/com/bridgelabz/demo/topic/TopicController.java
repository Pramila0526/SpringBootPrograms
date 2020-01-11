package com.bridgelabz.demo.topic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopics(@PathVariable String id)
	{
		return topicService.getTopics(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/topics")
	public ResponseEntity<Object> addTopic(@RequestBody Topic topic)
	{
	 topicService.addTopic(topic);	
	 return new ResponseEntity<>("Created Successfully", HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/topics/{id}")
	public ResponseEntity<Object> updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
	 topicService.updateTopic(id,topic);	
	 return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/topics/{id}")
	public ResponseEntity<Object> deleteTopic(@PathVariable String id)
	{
	 topicService.deleteTopic(id);	
	 return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}
}
