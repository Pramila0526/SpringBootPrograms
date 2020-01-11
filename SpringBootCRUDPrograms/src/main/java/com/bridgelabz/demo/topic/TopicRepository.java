 package com.bridgelabz.demo.topic;
import org.springframework.data.repository.CrudRepository;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Repository for the CRUD Operations
 * Date		:07/01/2019
 *
 **********************************************************************************************/
public interface TopicRepository extends CrudRepository<Topic, String> {
	
	// getAllTopics()
	// getTopics(Sting id)
	// updateTopic(Topic t)
	// deleteTopic(String id)
}
