package com.assign;

public class Fruit {
	String name;
	int calories;
	int price; 
	String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
}

-------------------------------------------------------------------------------------------------------------------------


package com.assign;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestFruit
{
		public static void main(String[] args) 
		{
			List<Fruit> list=new ArrayList<>();
			
			list.add(new Fruit("apple", 150, 120, "red"));
			list.add(new Fruit("bannana", 80, 60, "yellow"));
			list.add(new Fruit("orange", 50, 200, "orange"));
			list.add(new Fruit("litchi", 90, 60, "red"));
			list.add(new Fruit("chikku", 40, 80, "brown"));
			list.add(new Fruit("guava", 80, 80, "green"));
			
		List<Fruit> list2=list.stream()
					.filter(p->p.getCalories()<100)
					.sorted(Comparator.comparing(Fruit::getCalories).reversed())
					.collect(Collectors.toList());
					
		list2.forEach(e->System.out.println("Fruit : "+e.getName()+"  calories: "+e.getCalories()));
		System.out.println("-----------------------------------------------------------");
		
       List<Fruit> list3=list.stream()
				
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
				
		list3.forEach(e->System.out.println(e.getName()+" color: "+e.getColor()));	
		System.out.println("-----------------------------------------------------------");
		
		
		List<Fruit> list4=list.stream()
		.filter(e->e.getColor()=="red")
		.sorted(Comparator.comparing(Fruit::getPrice))
        .collect(Collectors.toList());
		

        list4.forEach(e->System.out.println(e.getName()+" "+e.getColor()+" "+e.getPrice()));

		
		}
		
}
