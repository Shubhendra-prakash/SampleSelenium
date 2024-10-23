package Test;

/*public class JavaProgram {

	//public static void main(String[] args) {
		
		class Animal {
		    public void makeSound(String message) {
		        System.out.println("Generic animal sound:" + message);
		    }
		}

		class Dog extends Animal {
		    @Override
		    public void makeSound(String message) {
		        System.out.println("Bark");
		    }
		}
		public static void main(String[] args) {
         makeSound("Bark");
			
	}

}*/

public class JavaProgram {
    // Private attributes
    private String name;
    private int age;

    // Constructor
    public JavaProgram(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for accessing private attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods for modifying private attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
