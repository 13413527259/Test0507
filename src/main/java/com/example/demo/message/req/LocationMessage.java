package com.example.demo.message.req;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LocationMessage extends Message{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String Location_X;
	private String Location_Y;
	private String Scale;
	private String Label;
	public LocationMessage() {
	}
	public LocationMessage(String toUserName, String fromUserName, Integer createTime, String msgType, Integer msgId,
			String location_X, String location_Y, String scale, String label) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		Location_X = location_X;
		Location_Y = location_Y;
		Scale = scale;
		Label = label;
	}
	public String getLocation_X() {
		return Location_X;
	}
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}
	public String getLocation_Y() {
		return Location_Y;
	}
	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	
	

}
