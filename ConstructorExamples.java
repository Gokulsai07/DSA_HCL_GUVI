// // 1. Default Constructor & Object Initialization
// class Person {
//     String name;
//     int age;

//     // Default constructor
//     Person() {
//         name = "Unknown";
//         age = 0;
//     }

//     public String toString() {
//         return "Person [name=" + name + ", age=" + age + "]";
//     }
// }

// // 2. Parameterized Constructor
// class Car {
//     String model;
//     int year;

//     // Parameterized constructor
//     Car(String model, int year) {
//         this.model = model;
//         this.year = year;
//     }

//     public String toString() {
//         return "Car [model=" + model + ", year=" + year + "]";
//     }
// }

// // 3. Constructor Overloading
// class Book {
//     String title;
//     String author;

//     // Constructor with only title
//     Book(String title) {
//         this.title = title;
//     }

//     // Constructor with title and author
//     Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }

//     public String toString() {
//         return "Book [title=" + title + ", author=" + author + "]";
//     }
// }

// public class ConstructorExamples{
//     public static void main(String[] args) {
//         // Default Constructor Example
//         Person p1 = new Person();
//         System.out.println(p1);

//         // Parameterized Constructor Example
//         Car car = new Car("Tesla", 2023);
//         System.out.println(car);

//         // Constructor Overloading Example
//         Book book1 = new Book("Java Programming");
//         Book book2 = new Book("Python Basics", "John Doe");
//         System.out.println(book1);
//         System.out.println(book2);
//     }
// }
// 3. Constructor Overloading
class Book {
    String title;
    String author;

    // Constructor with only title
    Book(String title) {
        this.title = title;
    }

    // Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}

// 4. Copy Constructor
class Student {
    String name;
    int rollNo;

    // Normal constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
    }

    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }
}

public class ConstructorExamples {
    public static void main(String[] args) {
        // Constructor Overloading Example
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Python Basics", "John Doe");
        System.out.println("Book1: " + book1);
        System.out.println("Book2: " + book2);

        // Copy Constructor Example
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student(s1); // Copy constructor
        System.out.println("Original: " + s1);
        System.out.println("Copied: " + s2);
    }
}