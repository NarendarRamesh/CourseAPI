package com.naren.springBootStarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring boot starter","spring description","Spring"),
new Topic("Hibernate ","hibernte description","Hibernate"),
new Topic("RESTful web services","RESTful web services description","WebServices")));

public List<Topic> getAllTopics()
{
	return topics;
}
public Topic getTopic(String topic)
{
	return topics.stream().filter(t -> t.getId().equals(topic)).findFirst().get();
}
public void addTopic(Topic topic) {
	topics.add(topic);	
}
public void updateTopic(String id, Topic topic) {
	// TODO Auto-generated method stub
//	topics.stream().filter(t -> t.getId().equals(topic)).findFirst().get();
	for(int i =0 ; i<topics.size();i++)
	{
		Topic t = topics.get(i);
		if(t.getId().equals(topic.getId()))
		{
			topics.set(i, topic);
		}
	}
}
public void deleteTopic(String id) {
	// TODO Auto-generated method stub
	topics.removeIf(t->t.getId().equals(id));
}
}
