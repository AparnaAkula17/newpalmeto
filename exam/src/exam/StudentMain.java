package exam;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	public Student(String name, int marks) 
	{
		super();
		this.name = name;
		this.marks = marks;
	}
	
}
public class StudentMain 
{
	public static void main(String[] args)
	{
		ArrayList<Student>list=new ArrayList<Student>();
		Student s1=new Student("Aparna",60);
		Student s2=new Student("Sijju",56);
		Student s3=new Student("Sweety",88);
		Student s4=new Student("Shyam",36);
		Student s5=new Student("Vamsi",90);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println("students who are passed:");
		Predicate<Student>p=s->s.marks>=40;
		Function<Student,String>f=stu->
		{
			int m=stu.marks;
			if(m>=80)
				return "Distinction";
			else if(m>=60 && m<=79)
				return "First Class";
			else if(m>=50 && m<60)
				return "Second class";
			else
				return "fail";
		};
		Consumer<Student>c=s->
		{
			System.out.print(s.name+"  ");
			System.out.println(f.apply(s));
		};
		for(Student s:list) 
		{
			if(p.test(s))
			{
				c.accept(s);
			}
			
		}
	}
}













