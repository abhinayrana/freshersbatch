package com.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.messenger.db.Database;
import com.rest.messenger.model.Message;

public class MessageService {
	
	private  Map<Long, Message> messages= Database.getMessages();
			
			public MessageService()
			{
		         messages.put(1l,new Message(1, "Hello","Abhi"));
		         messages.put(2l,new Message(2, "Hi","Aman"));
			}

	
	public List<Message> getAllMessages()
	{
//		Message m1=new Message(1L, "Hello","Abhi");
//		Message m2=new Message(3L, "Hi","Rohit");
//		Message m3=new Message(2L, "Bye","Ankit");
//		
//		List<Message> list=new ArrayList<>();
//		list.add(m1);
//		list.add(m2);
//		list.add(m3);
//		return list; 
	   
		return new ArrayList<Message>(messages.values());
	    
	}
	
	public Message getMessage(long id)
	{
		return messages.get(id);
	}

	public Message addMessage(Message message)
	{
		MessageService ms = new MessageService();
		message.setId(messages.size()+1);
		//System.out.println(message.getId() + message.getAuthor() + message.getMessage());
		messages.put(message.getId(), message);
		//System.out.println(message.getAuthor()+message.getMessage());
		
//		 for (Map.Entry<Long,Message> entry : messages.entrySet())  
//		 {      System.out.println("Key = " + entry.getKey() + 
//	                             ", Value = " + entry.getValue().getAuthor()); 
//	    } 
		
		return message;
	}
	
	public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
	       messages.put(message.getId(), message);
	       return message;
	}

	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}

}
