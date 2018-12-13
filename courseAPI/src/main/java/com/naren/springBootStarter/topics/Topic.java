package com.naren.springBootStarter.topics;

public class Topic {

	private String name;
	private String desc;
	private String topic;
	
	public Topic(String name, String desc, String id) {
		super();
		this.name = name;
		this.desc = desc;
		this.topic = id;
	}
	public Topic() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getId() {
		return topic;
	}
	public void setId(String id) {
		this.topic = id;
	}
	
}
