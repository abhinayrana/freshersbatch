package com.assign;

public class News 
{

	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
	
	
	
	

}

------------------------------------------------------------------------------------------------------

package com.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestNews {

	public static void main(String[] args) 
	{
		List<News> list=new ArrayList<>();
		
		list.add(new News(121, "Raman", "Raghav", "The new budget is good for freshers"));
		list.add(new News(122, "Gagan", "Raghav", "India should give a befitting reply to pakistan"));
		list.add(new News(123, "Joti", "Prakash", "India is a strong contender to win the world cup"));
		list.add(new News(121, "Raman", "Shalini", "The budget was passed recently"));
		
		List<News> names11=list.stream()
				.filter(p->p.getCommentByUser().contains("budget"))
				.collect(Collectors.toList());
		long i=names11.stream().count();
		
		System.out.println("No. of times budget is repeating:- ");
		System.out.println(i);
		System.out.println("-------------------------------------------");
		System.out.println("newsId which has received maximum comments:- ");
		
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));

		

		long maxval=(Collections.max(map.values()));

		for(java.util.Map.Entry<Object, Long> entry:map.entrySet()) {

		if(entry.getValue()==maxval) {

		System.out.println(entry.getKey());

		}	
		
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("newsId which has received maximum comments:- ");
		
		Map<Object, Long> map1 = list.stream().collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()));
		long maxval1=(Collections.max(map1.values()));
		for(java.util.Map.Entry<Object, Long> entry1:map1.entrySet()) 
		{

			if(entry1.getValue()==maxval1) 
			{

			System.out.println(entry1.getKey());
			
			}	
			
	}
		
		System.out.println("-------------------------------------------");
		System.out.println("commentByUser wise number of comments:- ");
		
		Map<Object, Long> map2 = list.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		System.out.println(map2);
 }

		
		
}
