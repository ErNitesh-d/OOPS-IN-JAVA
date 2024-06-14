/*
class Pen{
	String color;
	String type;
	int age=15;
	public void printDetail(){
		System.out.println(color+":"+type);
	}
}

class Student extends Pen{
	String name;
	int age=25;
//THIS AND SUPER 
	public void studDetail() {
		System.out.println("Age From Chils Class: "+ this.age);
		System.out.println("Age From Parent Class : "+ super.age);
	}

//Constructor Default
	Student(){
		System.out.println("Constructor Caleed automatically");
	}
//Constructor Parameterized
	Student(String name, int age){
		System.out.println("Parameterized constructor called ");
		this.name = name;
		this.age=age;
	}
	public void studDetail2() {
		System.out.println("Parameterized : "+ this.name);
		System.out.println("Parameterized: "+ this.age);
	}
	
//Copy Constructor
Student(Student s2){
	System.out.println("Copy constructor called ");
	this.name = s2.name;
	this.age=s2.age;
}
public void studDetail3() {
	System.out.println("copy Constructor  : "+ this.name);
	System.out.println("copy Constructor "+ this.age);
}
}

class MainClass{
	public static void main(String[] args){
	//Default Constructor
		Pen  p1=new Pen();
		p1.color="black";
		p1.type="gel";
		p1.printDetail();
		
		Student s1=new Student();
		s1.studDetail();
//Parameterized Constructor
		Student s2=new Student("Nitin",30);
		s2.studDetail2();
//Copy Constructor
		Student s3=new Student(s2);
		s3.studDetail3();
		

	}
}

//PACKGAES

package bank;
public class MainClass{
	public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "MR NITIN";
        
        // Print the account name to verify
        System.out.println("Account name: " + account1.name);
    }
} 

//ENCAPSULATION
import java.lang.Math;
class NumBean{
	private int Number;

  
   	public void setNumber(int Number)
	{
		this.Number = Number;
	}

	public int getNumber() {
		return this.Number;
	}
	public  void Printer(){
		
		System.out.println(this.Number);
	}

}


abstract class Animal{
	abstract void walk();

}

class Hourse extends Animal{
	public void walk(){
		System.out.println("Hourse walk on 4 lags");
	}
}

class Chiken extends Animal{
	public void walk(){
		System.out.println("Chiken walk on 2 lags");
		
	}
}

public class MainClass {
    public static void main(String[] args) {
		Chiken hourse = new Chiken();
		hourse.walk();
        

    }
}


interface Animaal{
	void walk();
	int eyes=2;;
}
class Hourse implements Animaal{
	public void walk() {
		System.out.println("Hourse method 'walk'" +eyes);
		System.out.println(eyes);
	}

}
class CHicken implements Animaal{
	public void walk() {
		System.out.println("CHicken method 'walk'"+eyes);
		System.out.println(eyes);
	}

}
public class MainClass {
    public static void main(String[] args) {
		
        CHicken c1=new CHicken();
		c1.walk();

		Hourse h1=new Hourse();
		h1.walk();

    }
}


interface Animaal{
	void walk();
	int eyes=2;;
}
interface Hourse {
	void eat();
}

class Example implements Hourse,Animaal{
	public void walk() {
		System.out.println("'walk'");
		
}
	public void eat() {
		System.out.println("Eating");
	}

}
class MainClass{
	public static void main(String[] args){

		Example animaal =new Example();
		animaal.walk();
		animaal.eat();
	}
}*/

class Student{
	String name;
	static  String School;

}
class MainClass{
	public static void main(String[] args){
		Student.School="HIGH SCHOOL";

		Student s1= new  Student();
		s1.name="NITIN KHATRI";
		System.out.println(Student.School);
		System.out.println(s1.name);
	}
}