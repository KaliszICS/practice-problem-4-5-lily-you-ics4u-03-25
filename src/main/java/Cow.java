/**
 * This Cow class allows users to access the name, age and weight of a cow.
 * It also allows users to get the name, age and weight of the cow in a readable format
 * and compare the name, age and weight of two cows
 * @author Lily You
 * @version 2
 */

 import java.util.Objects;
public class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * Constructs a new Cow object with the variables name, age and weight
     * @param name String - the name of the cow
     * @param age int - the age of the cow
     * @param weight double - the weight of the cow
     */
    public Cow(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Returns the name of the cow
     * @return the name of the cow as a String
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns the age of the cow
     * @return the age of the cow as an integer
     */
    public int getAge(){
        return this.age;
    }

    /**
     * Returns the weight of the cow
     * @return the weight of the cow as a double
     */
    public double getWeight(){
        return this.weight;
    }

    /**
     * Gets the name, age and weight of a cow and returns it in a readable format
     * @return name, age and weight of a cow as a String in the format "name, age - weight" 
     */
    @Override
    public String toString(){
        return this.name + ", " + this.age + " - " + this.weight;
    }

    /**
     * Checks if two cows match by comparing their name, age and weight
     * @param o the object given to compare with
     * @return true if the cow has the same name, age and weight as this cow, otherwise return false
     */
    @Override
    public boolean equals(Object o){
        if(this == o){ //quickly checks if it's just the excat same object/reference
            return true;
        }
        if(o == null || getClass() != o.getClass()){ //if the object is null or if the object is from a different class
            return false;
        }
        Cow cow = (Cow)o;
        if(cow.getName().equals(this.name) && cow.getAge() == this.age && cow.getWeight() == this.weight){
            return true;
        }
        return false;
    }

   /**
     * Returns a hash code value based on the cow's name, age and weight
     * and ensures that equal cows have identical hash codes
     * @return a hash code that represents the cow as an integer
     */
    @Override
    public int hashCode(){
        return Objects.hash(name, age, weight);
    }
}
