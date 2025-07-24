public class Student {
    String name;
    int age;
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    void display() {
        System.out.println ("My name is " + this.name);
        System.out.println ("My age is " + this.age);
        System.out.println ("My rollNumber is " + this.rollNumber);
    }
    public static void main (String[] args) {
        Student obj1 = new Student("Barsha", 30, 2);
        Student obj2 = new Student("Manas", 33, 1);
        Student obj3 = new Student("Vamika", 1, 3);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}


