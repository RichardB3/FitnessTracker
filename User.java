import java.awt.*;

public class User {
	  private String name;
	  private int age;
	  private double weight;
	  private double height;
	  
	  public User(String name, int age, double weight, double height) {
		  this.name = name;
		  this.age = age;
		  this.weight = weight;
		  this.height = height;}
	  
	  /*Getters for the user attributes
	   * if the variables were to be called
	     elsewhere */
	  public String getname() {
		  return name;}
	  
	  public int getage() {
		  return age;}
	  
	  public double weight() {
		  return weight;}
	  
	  public double height() {
		  return height;}
	  
	  //Override
	  public String toString() {
		  return name;
	  }
}
