# Java Fundamentals – Complete Guide with Examples

This guide covers core Java programming concepts with clear explanations and real-world examples.

## Introduction to Java

- Java programs are made of classes. A class is like a blueprint.
- Every Java program starts in a `main` method.
- Use `System.out.println()` to print messages to the console.
- Use `//` for single-line comments and `/* */` for multi-line.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

## Variables

- Variables store data values.
- Java has primitive types: `int`, `double`, `boolean`, `char`.
- Use `var` for automatic type inference (Java 10+).
- `null` means a variable doesn't reference anything.
- Follow camelCase naming convention for variables.

```java
int age = 30;
double price = 19.99;
var name = "Alice"; // Java 10+
```

## Basic Math Operators

- Use `+`, `-`, `*`, `/`, `%` for arithmetic operations.
- Operator precedence: `*` and `/` run before `+` and `-`.
- Use `==`, `!=`, `<`, `>`, `<=`, `>=` for comparisons.

```java
int a = 10;
int b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1
System.out.println(a > b); // true
```

## Control Flow - if/else and switch

- Use `if/else` to make decisions.
- `switch` selects code to run based on a variable value.

```java
int grade = 90;
if (grade >= 90) {
    System.out.println("Excellent");
} else {
    System.out.println("Keep improving");
}

String day = "MONDAY";
switch (day) {
    case "MONDAY": System.out.println("Start of week"); break;
    case "FRIDAY": System.out.println("Weekend soon"); break;
}
```

## User Input with Scanner

- Use `Scanner` to get input from the user.
- You must import `java.util.Scanner`.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello " + name);
```




# Part II – Texts, Dates, & Methods

---

## ✍️ Text in Java

### `char` and `String`
- `char` holds a single Unicode character.
- `String` is a sequence of characters (immutable).

```java
char letter = 'A';
String word = "Java";
```

### Common String Methods
- `.length()`, `.charAt()`, `.equals()`, `.toLowerCase()`, `.toUpperCase()`, `.substring()`

```java
String name = "Alice";
System.out.println(name.length());       // 5
System.out.println(name.charAt(0));      // A
System.out.println(name.toUpperCase());  // ALICE
```

### Stack vs Heap
- **Stack**: stores method calls and local variables.
- **Heap**: stores objects (e.g., instances of String, arrays).
- `String name = "Java"` → stored in heap, reference in stack.

---

## 📄 Text Blocks and StringBuilder

### Text Blocks (Java 15+)
- Allow multi-line strings with better formatting.

```java
String html = """
    <html>
        <body>Hello</body>
    </html>
""";
```

### StringBuilder
- Mutable string operations.
- More efficient for repeated modifications.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // Hello World
```

### Common StringBuilder Methods
- `.append()`, `.insert()`, `.delete()`, `.reverse()`, `.toString()`

---

## 📅 Time and Date Concepts

### Key Concepts
- **Time Zones**: Adjust time based on location.
- **Y2K Bug**: Concern over `00` being interpreted as 1900.
- **Summer/Winter Time**: Daylight Saving changes.
- **Leap Year**: Every 4 years, adds Feb 29.
- **Leap Second**: Occasionally added to sync clocks with Earth’s rotation.

---

## ⏰ Time and Date APIs in Java

### `java.time` Package (Java 8+)
- Use `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`.

```java
import java.time.*;

LocalDate today = LocalDate.now();
LocalTime time = LocalTime.now();
LocalDateTime dt = LocalDateTime.of(today, time);

System.out.println(today);
System.out.println(time);
System.out.println(dt);
```

### Formatting Dates
```java
import java.time.format.DateTimeFormatter;

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
System.out.println(today.format(formatter)); // e.g., 27-05-2025
```

### Timestamps
```java
import java.time.Instant;
Instant timestamp = Instant.now();
System.out.println(timestamp); // Current time in UTC
```

---

## 🧩 Methods in Java

### Return Types
- `void`: no return.
- Others: must return a value of declared type.

```java
public static int add(int a, int b) {
    return a + b;
}
```

### Method Name, Body, Parameters
- Name should describe action.
- Body contains logic.
- Parameters are inputs.

```java
public static void greet(String name) {
    System.out.println("Hello, " + name);
}
```

---

## 🔁 Method Overloading and Recursion

### Overloading
- Same method name, different parameters.

```java
public static int multiply(int a, int b) { return a * b; }
public static double multiply(double a, double b) { return a * b; }
```

### Static Methods
- Belong to class, not instances.
- Call via `ClassName.method()` or directly if in same class.

---

## 🧪 Pass by Value and Reference

### Java is Pass-by-Value
- Even with objects, the **reference itself** is passed by value.

```java
public static void modify(int x) {
    x = 5;
}

int num = 10;
modify(num);
System.out.println(num); // Still 10
```

### Recursion
- A method that calls itself until a condition is met.

```java
public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

---



# Part III – Loops, Logical Expressions, Collections, and Regular Expressions

---

## 🔁 Statements and Loops

### Expressions, Statements, and Blocks
- **Expression**: A piece of code that returns a value (e.g., `2 + 3`)
- **Statement**: A complete unit of execution (e.g., `int a = 2 + 3;`)
- **Block**: A group of statements enclosed in `{}`

```java
int x = 5; // statement
{ 
  int y = x + 2; // block with one statement
}
```

### While Loop
- Repeats code while condition is true

```java
int i = 0;
while (i < 3) {
    System.out.println(i);
    i++;
}
// Output: 0 1 2
```

### Do-While Loop
- Executes once before checking condition

```java
int j = 0;
do {
    System.out.println(j);
    j++;
} while (j < 2);
// Output: 0 1
```

### For Loop
- Combines init, condition, and update in one line

```java
for (int k = 0; k < 3; k++) {
    System.out.println(k);
}
// Output: 0 1 2
```

### Break and Continue
- `break`: exits the loop early
- `continue`: skips current iteration

```java
for (int n = 0; n < 5; n++) {
    if (n == 3) break;
    System.out.println(n);
}
// Output: 0 1 2

for (int n = 0; n < 5; n++) {
    if (n == 3) continue;
    System.out.println(n);
}
// Output: 0 1 2 4
```

---

## 🔣 Logical Expressions

### Boolean Operators
- `&&` (AND), `||` (OR), `!` (NOT)

```java
boolean a = true;
boolean b = false;
System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a);     // false
```

### Precedence and Grouping
- Use parentheses `()` to control evaluation order

```java
boolean result = true || false && false;  // true (AND runs first)
boolean grouped = (true || false) && false; // false
```

### Truth Table (for `&&` and `||`)

| A     | B     | A && B | A \|\| B |
|-------|-------|--------|----------|
| true  | true  | true   | true     |
| true  | false | false  | true     |
| false | true  | false  | true     |
| false | false| false  | false    |

### Short-circuiting
- `false && ...` skips right side
- `true || ...` skips right side

---

## 🧮 Collections

## 🔢 One-Dimensional Arrays

#### What is it?
A fixed-size container for elements of the same type, stored in indexed order.

#### Common Use Case
- Storing student scores or product prices.

### Diagram

```
Index:    0    1    2
Array:  [10,  20,  30]
```

### Syntax & Example
```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[0]);        // Output: 10
System.out.println(numbers.length);    // Output: 3
```

---

## 🔲 Multi-Dimensional Arrays

### What is it?
An array where each element is itself an array, used to represent tables or matrices.

### Example
```java
int[][] matrix = {
    {1, 2},
    {3, 4}
};
System.out.println(matrix[1][0]);      // Output: 3
```

---

## 📦 ArrayList (java.util.ArrayList)

### What is it?
A resizable array implementation that allows dynamic addition/removal of elements.

### Methods Overview

| Method         | Description                                           |
|----------------|-------------------------------------------------------|
| `add(E e)`     | Adds element to the end of list                      |
| `get(int i)`   | Returns element at index `i`                         |
| `set(int i, E e)` | Replaces element at index `i`                     |
| `remove(int i)`| Removes element at index `i`                         |
| `size()`       | Returns current number of elements                  |
| `contains(E e)`| Checks if element exists                            |

### Example
```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");                      // ["Apple"]
fruits.add("Banana");                     // ["Apple", "Banana"]
System.out.println(fruits.get(1));        // Output: Banana
fruits.set(1, "Orange");                  // ["Apple", "Orange"]
fruits.remove(0);                         // ["Orange"]
System.out.println(fruits.contains("Orange")); // true
```

---

## 📋 List Interface & LinkedList

### What is it?
A doubly linked list; better than ArrayList for frequent insertions/removals.

### Key Methods

| Method            | Description                                           |
|-------------------|-------------------------------------------------------|
| `addFirst(E e)`   | Inserts at beginning                                 |
| `addLast(E e)`    | Inserts at end                                       |
| `removeFirst()`   | Removes first element                                |
| `getFirst()`      | Returns first element                                |

### Example
```java
LinkedList<String> tasks = new LinkedList<>();
tasks.add("Code");
tasks.addFirst("Eat");
System.out.println(tasks.getFirst());    // Output: Eat
tasks.removeFirst();                     // ["Code"]
```

---

## 🔘 Set Interface & HashSet

### What is it?
Stores unique values with no duplicates, no defined order.

### Key Methods

| Method         | Description                                         |
|----------------|-----------------------------------------------------|
| `add(E e)`     | Adds if not already present                        |
| `remove(E e)`  | Deletes element                                    |
| `contains(E e)`| Checks presence                                    |
| `size()`       | Returns element count                              |

### Example
```java
HashSet<Integer> ids = new HashSet<>();
ids.add(101);
ids.add(102);
ids.add(101);   // Ignored
System.out.println(ids.size());  // Output: 2
```

---

## 🌲 TreeSet

### What is it?
A `Set` that maintains sorted (natural order) elements.

### Additional Methods
- `first()` → returns smallest
- `last()` → returns largest

### Example
```java
TreeSet<String> names = new TreeSet<>();
names.add("Zoe");
names.add("Amy");
System.out.println(names); // Output: [Amy, Zoe]
```

---

## 🔗 LinkedHashSet

### What is it?
A `Set` that maintains insertion order.

### Example
```java
LinkedHashSet<String> playlist = new LinkedHashSet<>();
playlist.add("Song1");
playlist.add("Song2");
System.out.println(playlist); // Output: [Song1, Song2]
```

---

## 🗺️ HashMap

### What is it?
A map storing key-value pairs, unordered.

### Common Methods

| Method             | Description                                       |
|--------------------|---------------------------------------------------|
| `put(K, V)`        | Adds or updates entry                            |
| `get(K)`           | Returns value for key                            |
| `remove(K)`        | Removes key-value pair                           |
| `containsKey(K)`   | Checks if key exists                             |
| `keySet()`         | Returns all keys                                 |
| `values()`         | Returns all values                               |

### Example
```java
HashMap<String, Integer> scores = new HashMap<>();
scores.put("Math", 95);
scores.put("English", 88);
System.out.println(scores.get("Math")); // Output: 95
```

---

## 🌳 TreeMap

### What is it?
A sorted map based on keys.

### SortedMap-Specific Methods
- `firstKey()` – returns lowest key
- `lastKey()` – returns highest key

### Example
```java
TreeMap<String, String> dictionary = new TreeMap<>();
dictionary.put("b", "banana");
dictionary.put("a", "apple");
System.out.println(dictionary); // Output: {a=apple, b=banana}
```

---

## 🧵 Regular Expressions

### Why Use Them?
Validate patterns like phone numbers, emails, and form inputs.

### Common Characters

| Syntax   | Meaning               |
|----------|------------------------|
| `.`      | Any character         |
| `\d`    | Digit (0–9)           |
| `\w`    | Word character (a–zA–Z0–9_) |
| `\s`    | Whitespace            |
| `[a-z]`  | Any lowercase letter  |
| `^`      | Start of input        |
| `$`      | End of input          |

---

## 📐 Pattern and Matcher

```java
import java.util.regex.*;

String email = "user@example.com";
Pattern pattern = Pattern.compile("\w+@\w+\.com");
Matcher matcher = pattern.matcher(email);

if (matcher.matches()) {
    System.out.println("Valid email"); // Output: Valid email
}
```

---

## 💬 CharSequence Interface

- Allows pattern matching with any sequence of characters.
- Accepted by `Pattern.matcher(CharSequence)`.

```java
CharSequence text = "abc123";
Pattern p = Pattern.compile(".*123");
System.out.println(p.matcher(text).matches()); // Output: true
```

---




## Part IV - Algorithmic Thinking

### What is it?
The ability to solve problems efficiently by designing algorithms that are optimized for time and memory usage.

---

### Common Algorithms

#### Quicksort
- A fast, efficient sorting algorithm that divides an array into smaller parts and sorts them.
- Example:
  ```java
  int[] arr = {5, 2, 9, 1, 5, 6};
  Arrays.sort(arr); // Output: [1, 2, 5, 5, 6, 9]
  ```

#### Mergesort
- A divide-and-conquer sorting algorithm that splits the array into halves, sorts each half, and then merges them back together.
- Example:
  ```java
  int[] arr = {5, 2, 9, 1, 5, 6};
  Arrays.sort(arr); // Output: [1, 2, 5, 5, 6, 9]
  ```

#### O-notation
- Describes the efficiency of an algorithm in terms of time or space, showing how it scales with input size.
- Example:
    - **O(n)** – Linear time complexity.
    - **O(log n)** – Logarithmic time complexity.

---

## 🧠 Memory Management

### What is it?
Managing memory in a program to ensure that it uses resources efficiently, handling both allocation and deallocation of memory.

---

### Garbage Collection
- Automatically reclaims memory that is no longer in use by objects.
- Example: In Java, the JVM automatically removes objects that are no longer referenced.

### Types of Memory in Java

#### Heap
- Memory used to store objects.
- Example: Objects like `String` are stored in the heap.

#### Stack
- Memory used to store method calls and local variables.
- Example: Local variables inside a method are stored in the stack.

#### Method Area
- Stores class-level data such as methods and static variables.
- Example: The `main` method in Java is stored here.

#### Program Counter Register
- Keeps track of the current instruction to execute.
- Example: It ensures that the program executes sequentially.

#### Native Area
- Stores memory for native code (e.g., C or C++).
- Example: Using JNI (Java Native Interface) to call native methods.

---

## 🐞 Debugging

### What is it?
The process of finding and fixing errors in your program.

---

### Debugging with the IDE

#### Breakpoints
- Stops the program at a certain point to inspect variables or step through code.
- Example:
  ```java
  int x = 5;
  // Set breakpoint here to inspect value of x
  System.out.println(x);
  ```

#### Reading Variables
- Allows you to see the current values of variables.
- Example: Checking if `x = 5` during debugging.

#### Stepping Through the Program
- Lets you execute code one line at a time to observe its behavior.
- Example: Stepping over a line of code after setting a breakpoint.

---

### Debugging with CLI

#### Advanced Debugging
- Using commands in tools like `gdb` or `pdb` to troubleshoot.
- Example:
  ```bash
  gdb ./my_program
  ```

#### Changing Variables
- Modifying variable values during runtime to test different scenarios.
- Example:
  ```bash
  (gdb) set variable x=10
  ```

#### Evaluating Expressions
- Checking the result of expressions during debugging.
- Example: `print x + y` to see if the sum is correct.

---

## 🧳 OOP Basics

### What is it?
Object-Oriented Programming (OOP) organizes code into classes and objects to model real-world entities and behaviors.

---

### Objects
- Instances of classes that store data and methods.
- Example:
  ```java
  class Car {
      String model;
      int year;
  }
  Car car = new Car(); // Object of class Car
  ```

### Constructors
- Special methods to initialize objects when created.
- Example:
  ```java
  class Car {
      Car(String model) {
          this.model = model;
      }
  }
  Car myCar = new Car("Toyota");
  ```

### Getters and Setters
- Methods to get or set values of private fields.
- Example:
  ```java
  class Car {
      private String model;
      public String getModel() { return model; }
      public void setModel(String model) { this.model = model; }
  }
  ```

---

### Access Modifiers

#### Public
- Members are accessible from anywhere.
- Example: `public int speed;`

#### Private
- Members are accessible only within the same class.
- Example: `private String model;`

#### Protected
- Members are accessible within the same package or by subclasses.
- Example: `protected int speed;`

#### Default
- Members are accessible only within the same package.
- Example: `int speed;`

---

## 🚀 OOP Advanced

### Polymorphism

#### Runtime Polymorphism
- When a method in a subclass overrides a method in a superclass.
- Example:
  ```java
  class Animal {
      void sound() { System.out.println("Animal makes a sound"); }
  }
  class Dog extends Animal {
      void sound() { System.out.println("Bark"); }
  }
  Animal myDog = new Dog();
  myDog.sound(); // Output: Bark
  ```

#### Compile-time Polymorphism
- Occurs when methods have the same name but different parameters (overloading).
- Example:
  ```java
  class Calculator {
      int add(int a, int b) { return a + b; }
      double add(double a, double b) { return a + b; }
  }
  ```

---

### Anonymous Classes
- A class without a name, used for one-time use.
- Example:
  ```java
  Button b = new Button("Click") {
      public void actionPerformed() { System.out.println("Button clicked"); }
  };
  ```

### Sealed Classes
- Classes that restrict which other classes can extend them.
- Example:
  ```java
  sealed class Vehicle permits Car, Truck { }
  ```

---

### Record Classes
- Immutable classes that hold data, automatically providing common methods like `toString()`.
- Example:
  ```java
  record Person(String name, int age) { }
  ```

### Enums
- Fixed set of constants, usually for predefined values.
- Example:
  ```java
  enum Day { MONDAY, TUESDAY, WEDNESDAY }
  ```

---

### Design Patterns - Singleton & Factory

#### Singleton
- Ensures that a class has only one instance.
- Example:
  ```java
  class Singleton {
      private static Singleton instance;
      private Singleton() {}
      public static Singleton getInstance() {
          if (instance == null) {
              instance = new Singleton();
          }
          return instance;
      }
  }
  ```

#### Factory
- Creates objects without exposing instantiation logic.
- Example:
  ```java
  class CarFactory {
      public static Car createCar(String model) {
          return new Car(model);
      }
  }
  ```

---

### Type Casting

#### Casting of Primitive Types
- Convert one primitive type to another.
- Example:
  ```java
  int a = 5;
  double b = (double) a; // Widening
  ```

#### Widening / Narrowing
- **Widening** is converting to a larger type, and **narrowing** is converting to a smaller type.
- Example:
  ```java
  int a = 10;
  double b = a; // Widening
  int c = (int) b; // Narrowing
  ```

#### Wrapper Classes
- Wrapping primitive types into objects.
- Example:
  ```java
  Integer x = Integer.valueOf(5);
  ```

#### Autoboxing / Unboxing
- **Autoboxing** converts primitive types to their corresponding wrapper classes, and **unboxing** converts them back.
- Example:
  ```java
  int a = 5;
  Integer b = a; // Autoboxing
  int c = b; // Unboxing
  ```

---

### Casting of References

#### Upcasting / Downcasting
- **Upcasting** is casting a subclass to a superclass, and **downcasting** is casting a superclass to a subclass.
- Example:
  ```java
  Animal a = new Dog(); // Upcasting
  Dog d = (Dog) a; // Downcasting
  ```

#### ClassCastException
- An exception thrown when downcasting fails.
- Example:
  ```java
  Object obj = new Object();
  Dog d = (Dog) obj; // Throws ClassCastException
  ```

#### Safe Casting with `instanceof`
- Use `instanceof` to check if an object can be cast.
- Example:
  ```java
  if (obj instanceof Dog) {
      Dog d = (Dog) obj;
  }
  ```

#### Safe Casting with `class.isInstance()`
- `class.isInstance()` checks if an object can be safely cast to a class.
- Example:
  ```java
  if (Dog.class.isInstance(obj)) {
      Dog d = (Dog) obj;
  }
  ```

---


## 🧪 Testing

### Introduction to Testing

#### TDD: Test Driven Development
- **TDD** is a development process where you write tests before writing the actual code.
- Example: Writing tests first for a function that adds two numbers.

#### Errors in Software
- Errors are bugs or issues that cause the software to behave unexpectedly.
- Example: Null pointer exceptions, array out-of-bounds errors.

#### Manual QA and Automated Testing
- **Manual QA** involves human testers running tests on the software.
- **Automated testing** involves using tools to run predefined tests automatically.

#### JUnit
- **JUnit** is a framework for writing and running tests in Java.
- Example:
  ```java
  @Test
  public void testAddition() {
      assertEquals(5, add(2, 3));
  }
  ```

#### Assert Methods
- Methods that validate whether a condition is true in a test case.
- Example: `assertEquals(expected, actual)` checks if two values are equal.

---

### Stubbing & Mocking

#### Mockito
- **Mockito** is a popular library used for mocking in tests.
- Example:
  ```java
  @Mock
  List<String> mockedList;

  when(mockedList.size()).thenReturn(10);
  ```

---

### Advanced Mocking

#### Argument Captors
- **Argument captors** are used to capture arguments passed to mocked methods.
- Example:
  ```java
  ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
  verify(mockedList).add(captor.capture());
  ```

#### Dynamic Responses
- **Dynamic responses** allow mocks to respond differently based on inputs.
- Example:
  ```java
  when(mockedList.get(0)).thenReturn("First").thenReturn("Second");
  ```

#### Powermock
- **Powermock** allows mocking of static methods, constructors, and private methods.
- Example:
  ```java
  PowerMockito.mockStatic(SomeClass.class);
  ```

---

## 💻 Coding Standards

### Coding Standards

#### The Google Java Style Guide
- A set of guidelines for writing clean and readable Java code.
- Example: Naming conventions like `camelCase` for variables and methods.

#### Basic Rules and File Structure
- Organizing code into packages and ensuring consistent formatting.
- Example: Each class should be in its own file, named after the class.

#### Formatting
- Consistent indentation, spaces, and line breaks.
- Example: Use 4 spaces for indentation.

#### Naming
- Naming conventions for classes, methods, and variables.
- Example: Class names should be in `PascalCase`, methods in `camelCase`.

#### Programming Practices
- Best practices for writing efficient and maintainable code.
- Example: Avoiding hardcoding values, using constants instead.

#### Javadoc
- Use Javadoc comments to document classes and methods.
- Example:
  ```java
  /**
   * Adds two numbers.
   * @param a The first number.
   * @param b The second number.
   * @return The sum of a and b.
   */
  public int add(int a, int b) { return a + b; }
  ```

#### Lint tools / functions
- Tools that check your code for style and potential errors.
- Example: Checkstyle for Java.

#### What is a code linter
- A **linter** is a tool that helps enforce coding standards.
- Example: ESLint for JavaScript.

#### Lint functions built into your IDE
- IDEs like IntelliJ or Eclipse have built-in lint functions to check code quality.
- Example: Code suggestions and warnings shown while typing.

#### Checkstyle and other linters for Java
- **Checkstyle** is a tool for checking Java code against coding standards.
- Example: Ensuring proper indentation, naming conventions, and formatting.

---

## 📂 I/O

### Introduction to I/O Streams

#### Manipulating Files
- **I/O streams** allow reading from and writing to files.
- Example:
  ```java
  BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
  String line = reader.readLine();
  ```

---

### Introduction to NIO Buffers

#### Manipulating Paths
- **Paths** represent the location of files and directories in the file system.
- Example: `Paths.get("/home/user/file.txt")`

#### Manipulating Files and Directories with NIO
- NIO provides efficient file handling with buffers.
- Example: Using `Files.copy()` to copy a file.

#### Reading From and Writing to Files with NIO
- NIO allows for non-blocking file I/O.
- Example:
  ```java
  Path path = Paths.get("file.txt");
  Files.write(path, "Hello, world!".getBytes());
  ```

---

## 📚 Project/Workshop

## 📦 Libraries

### Basics and Structure of Libraries
- **Libraries** are collections of pre-written code that can be used in your projects.
- Example: Using a math library to calculate square roots.

### Using Libraries
- You can use libraries by importing them into your project.
- Example: `import java.util.ArrayList;`

### Self-development vs. using 3rd party libraries
- Weigh the pros and cons of writing your own code versus using existing libraries.
- Example: Writing your own sorting algorithm vs. using Java's `Collections.sort()`.

### Semantic Versioning and Update Strategies
- **Semantic Versioning** defines how version numbers indicate changes to a library.
- Example: `1.2.3` – Major.Minor.Patch

### Assessing a Library
- Check the library’s documentation, community support, and maintainability before using it.
- Example: Look for active development on GitHub and user reviews.

---

### Apache Commons and Apache POI

#### Using Packages
- **Packages** are groups of related classes and interfaces in Java.
- Example: `import org.apache.commons.lang3.StringUtils;`

#### Building our own libraries
- You can create your own libraries by grouping related functionality into packages.
- Example: Creating a utility library for string operations.

---

## 🛠 Basic Tools

### Maven

#### Introduction to Maven
- **Maven** is a build automation tool used for Java projects.
- Example: Managing dependencies and packaging your project.

#### Maven Components
- **POM (Project Object Model)** file, plugins, goals, and dependencies are the main components of Maven.
- Example: `pom.xml` defines project dependencies.

#### How Maven works?
- Maven works by reading the `pom.xml` file and downloading dependencies.
- Example: Using `mvn install` to build a project.

#### What Maven can do?
- Maven can automate build, testing, and deployment processes.
- Example: Running unit tests with `mvn test`.

#### Why use it?
- Maven simplifies project management by handling dependencies and builds.
- Example: Automatically downloading libraries like JUnit.

#### Structure/POM.XML file
- The `pom.xml` file defines project configuration, dependencies, and plugins.
- Example:
  ```xml
  <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
  </dependency>
  ```

#### Build Life Cycle
- Maven’s build lifecycle consists of phases like compile, test, and package.
- Example: Running `mvn clean install` to clean and build the project.

#### Maven Archetypes
- **Archetypes** are project templates in Maven that define project structures.
- Example: `mvn archetype:generate` to create a new project.

---

### Gradle

#### Introduction to Gradle
- **Gradle** is a build automation system similar to Maven but more flexible.
- Example: Using Gradle for multi-project builds.

#### About Gradle
- Gradle allows building, testing, and deploying Java applications with ease.
- Example: Using `gradle build` to compile and test your project.

#### Gradle installation
- Gradle can be installed using a package manager or manually.
- Example: `brew install gradle` on macOS.

#### Features of Gradle
- Gradle supports incremental builds, dependency management, and parallel execution.
- Example: Building only modified files to save time.

#### Gradle Core Concepts
- Gradle’s core concepts include tasks, dependencies, and plugins.
- Example: A build task like `build`, `test`, or `jar`.

#### Gradle Build File
- The **build.gradle** file defines dependencies, tasks, and plugins.
- Example:
  ```groovy
  dependencies {
      testImplementation 'junit:junit:4.12'
  }
  ```

#### Maven Vs Gradle Comparison
- **Gradle** is faster, more flexible, and has a more modern syntax compared to Maven.
- Example: Gradle uses Groovy for scripting while Maven uses XML.

---

### Tomcat

#### What is Apache Tomcat?
- **Apache Tomcat** is an open-source Java Servlet and JSP container.
- Example: Used for deploying web applications.

#### Basic Setup Steps - Components
- Set up **Tomcat** by downloading and configuring the server.
- Example: `bin/startup.sh` to start Tomcat.

#### Getting Started with Tomcat
- Install Tomcat and deploy your web applications to the `webapps` directory.
- Example: Deploying a `HelloWorld.war` file.

#### Alternatives to Tomcat
- Other alternatives to Tomcat include **Jetty** and **Wildfly**.
- Example: Using Jetty for lighter-weight web applications.

#### Tomcat Directory Structure
- The **Tomcat** directory structure includes `bin`, `webapps`, `logs`, and `conf`.
- Example: `webapps` is where your WAR files are stored.

---

## ⚠️ Exceptions

### Introduction to Exceptions

#### Code that throws exceptions
- **Exceptions** are thrown when an error occurs during program execution.
- Example:
  ```java
  throw new ArithmeticException("Division by zero");
  ```

#### Throwables and their hierarchies
- **Throwables** are the superclass of all errors and exceptions.
- Example: `Throwable -> Error -> Exception`.

---

### Introduction to Exception Mechanisms

#### How to Catch Exceptions?
- Use `try-catch` blocks to catch exceptions.
- Example:
  ```java
  try {
      int result = 10 / 0;
  } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
  }
  ```

#### Try, Catch and Finally Block
- **finally** ensures code runs regardless of whether an exception was thrown.
- Example:
  ```java
  try {
      // code
  } catch (Exception e) {
      // handle
  } finally {
      // cleanup code
  }
  ```

---

### Defining and Throwing Exceptions

#### Stacktraces
- **Stacktraces** help debug by showing where the exception occurred.
- Example: A stacktrace provides a method call history when an exception is thrown.

#### Conventions
- Use custom exception classes for application-specific errors.
- Example: `public class CustomException extends Exception {}`.

#### Best Practices to Follow
- Use exceptions for exceptional conditions and handle them gracefully.
- Example: Avoid using exceptions for control flow.

---


## 🧵 Threads in Java

### Introduction to Threads

#### Distinguishing Thread Types
- In Java, threads can be classified into **user threads** and **daemon threads**.
    - **User threads** are the normal threads that your application runs.
    - **Daemon threads** run in the background and do not prevent the JVM from exiting.
    - Example:
      ```java
      Thread userThread = new Thread(() -> { /* Task */ });
      userThread.setDaemon(true);  // This is a daemon thread
      ```

#### Thread Concurrency
- **Concurrency** refers to the ability to run multiple threads in parallel, improving the performance of multi-core processors.
- Java provides the `Thread` class and `Runnable` interface for implementing concurrency.
    - Example:
      ```java
      Thread thread = new Thread(() -> { System.out.println("Running in a thread!"); });
      thread.start();
      ```

#### Defining a Task with `Runnable`
- The `Runnable` interface represents a task that can be executed concurrently.
    - Example:
      ```java
      Runnable task = () -> { System.out.println("Running a task!"); };
      new Thread(task).start();
      ```

#### Creating a Thread
- You can create a thread by extending the `Thread` class or implementing the `Runnable` interface.
    - Example using `Thread`:
      ```java
      class MyThread extends Thread {
          public void run() {
              System.out.println("Thread running!");
          }
      }
      new MyThread().start();
      ```

#### Polling with Sleep
- The `Thread.sleep()` method makes the current thread pause for a specified amount of time.
    - Example:
      ```java
      try {
          Thread.sleep(1000); // Sleep for 1 second
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      ```

#### Creating Threads with the Concurrency API
- Java provides the **Concurrency API** (`Executor`, `ExecutorService`) for managing thread creation and execution.
    - Example:
      ```java
      ExecutorService executor = Executors.newFixedThreadPool(10);
      executor.submit(() -> { System.out.println("Executing a task!"); });
      executor.shutdown();
      ```

---

### Thread Executor

#### Submitting Task & Waiting for Results

- **submit()**: Submits a task for execution and returns a `Future` object.
    - Example:
      ```java
      ExecutorService executor = Executors.newSingleThreadExecutor();
      Future<Integer> result = executor.submit(() -> { return 123; });
      System.out.println(result.get()); // Waits for the result
      ```

- **execute()**: Executes a task, but does not return a result.
    - Example:
      ```java
      executor.execute(() -> { System.out.println("Task executed!"); });
      ```

- **isDone()**: Checks if the task has completed.
    - Example:
      ```java
      if (result.isDone()) {
          System.out.println("Task completed!");
      }
      ```

- **get()**: Retrieves the result of the task, blocking until it completes.
    - Example:
      ```java
      Integer taskResult = result.get();  // This will block until result is available
      ```

- **isCancelled()**: Checks if the task was cancelled before completion.
    - Example:
      ```java
      if (result.isCancelled()) {
          System.out.println("Task was cancelled!");
      }
      ```

#### Waiting for Tasks to Finish

- The `invokeAll()` method submits a collection of tasks and blocks until all tasks are completed.
    - Example:
      ```java
      List<Callable<Integer>> tasks = Arrays.asList(() -> 1, () -> 2);
      List<Future<Integer>> results = executor.invokeAll(tasks);
      ```

- **invokeAny()**: Submits a collection of tasks and returns the result of the first one to complete.
    - Example:
      ```java
      Integer result = executor.invokeAny(tasks); // Returns the first task result
      ```

---

### Callable and Scheduled Tasks

#### Callable
- A `Callable` is similar to `Runnable` but can return a result or throw an exception.
    - Example:
      ```java
      Callable<Integer> task = () -> { return 123; };
      Future<Integer> result = executor.submit(task);
      ```

#### Scheduling Tasks with `ScheduledExecutorService`
- The `ScheduledExecutorService` schedules tasks with a fixed delay or at fixed-rate intervals.
    - Example:
      ```java
      ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
      scheduler.scheduleAtFixedRate(() -> System.out.println("Running..."), 0, 1, TimeUnit.SECONDS);
      ```

---

### Writing Thread-Safe Code

#### Protecting Data with Atomic Classes
- **Atomic classes** (like `AtomicInteger`, `AtomicBoolean`) provide thread-safe operations without using synchronization.
    - Example:
      ```java
      AtomicInteger count = new AtomicInteger(0);
      count.incrementAndGet();  // Thread-safe increment
      ```

#### Synchronized Blocks and Methods
- **Synchronized** ensures that only one thread can access a block of code or method at a time.
    - Example:
      ```java
      synchronized (this) {
          // Critical section of code
      }
      ```

#### Lock Interface and ReentrantLock Class
- **Lock** provides more advanced locking mechanisms compared to `synchronized`.
    - Example:
      ```java
      ReentrantLock lock = new ReentrantLock();
      lock.lock();
      try {
          // Critical section
      } finally {
          lock.unlock();
      }
      ```

---

## ⚙️ Functional Programming

### Functional Interface

#### Supplier
- A **Supplier** represents a function that provides a result, but takes no input.
    - Example:
      ```java
      Supplier<String> supplier = () -> "Hello, World!";
      System.out.println(supplier.get());
      ```

#### Consumer
- A **Consumer** represents a function that accepts an argument and returns no result.
    - Example:
      ```java
      Consumer<String> consumer = (s) -> System.out.println(s);
      consumer.accept("Hello, Consumer!");
      ```

#### Predicate
- A **Predicate** represents a function that takes an argument and returns a boolean.
    - Example:
      ```java
      Predicate<Integer> isEven = (i) -> i % 2 == 0;
      System.out.println(isEven.test(4));  // Output: true
      ```

---

### Function, BiFunction, and More

#### Function
- A **Function** represents a function that takes one argument and produces a result.
    - Example:
      ```java
      Function<Integer, String> func = (i) -> "Number: " + i;
      System.out.println(func.apply(5));  // Output: Number: 5
      ```

#### BiFunction
- A **BiFunction** takes two arguments and produces a result.
    - Example:
      ```java
      BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
      System.out.println(sum.apply(2, 3));  // Output: 5
      ```

#### UnaryOperator and BinaryOperator
- **UnaryOperator** and **BinaryOperator** are specialized versions of **Function** for operations on a single operand and two operands, respectively.
    - Example:
      ```java
      UnaryOperator<Integer> doubleIt = (x) -> x * 2;
      System.out.println(doubleIt.apply(4));  // Output: 8
      ```

---

### Streams

#### Create Stream
- You can create a **Stream** from collections, arrays, or generating data.
    - Example:
      ```java
      List<String> list = Arrays.asList("a", "b", "c");
      Stream<String> stream = list.stream();
      ```

#### Parallel Stream
- **Parallel streams** can process elements concurrently, improving performance on multi-core processors.
    - Example:
      ```java
      List<String> list = Arrays.asList("a", "b", "c");
      list.parallelStream().forEach(System.out::println);
      ```

#### Infinite Stream
- An **infinite stream** can be generated using `Stream.iterate()` or `Stream.generate()`.
    - Example:
      ```java
      Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
      infiniteStream.limit(5).forEach(System.out::println);  // Output: 0, 2, 4, 6, 8
      ```

---

### Stream Operations

#### Intermediate Operations
- **Intermediate operations** like `map()`, `filter()`, and `distinct()` return a new stream and are lazy.
    - Example:
      ```java
      List<Integer> list = Arrays.asList(1, 2, 3, 4);
      list.stream().map(x -> x * 2).forEach(System.out::println);  // Output: 2, 4, 6, 8
      ```

#### Collecting Results
- The `collect()` method is used to accumulate elements into a collection.
    - Example:
      ```java
      List<String> result = list.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
      ```

---

## 🧑‍💻 Lambdas & Functional Interfaces

### Writing Simple Lambdas
- **Lambdas** are concise, anonymous functions used to implement functional interfaces.
    - Example:
      ```java
      Runnable task = () -> System.out.println("Hello from lambda!");
      task.run();
      ```

### Working with Variables in Lambdas
- **Lambda expressions** can access local variables, but only those that are **final** or **effectively final**.
    - Example:
      ```java
      final int factor = 2;
      Function<Integer, Integer> multiply = (x) -> x * factor;
      ```

### Double Colon Operator (Method Reference Operator)

#### Referring to Static Methods
- A method reference is used to refer to a method of a class or an instance.
    - Example:
      ```java
      static void print(String msg) {
          System.out.println(msg);
      }
      Consumer<String> printer = MethodReferenceExample::print;
      printer.accept("Hello, Method Reference!");
      ```

#### Referring to Constructors
- You can refer to a constructor using the `::` operator.
    - Example:
      ```java
      Supplier<MyClass> supplier = MyClass::new;
      MyClass obj = supplier.get();
      ```

#### Referring to Instance Methods
- You can also refer to instance methods of objects using method references.
    - Example:
      ```java
      MyClass obj = new MyClass();
      Consumer<String> printer = obj::print;
      ```

---


## 🧑‍💻 Java Module System and Localization

### Java Modules
- **Java Modules** (introduced in Java 9) allow you to group related classes and interfaces into a single unit, improving modularity and reusability.
- They help in managing dependencies and controlling access between different parts of the program.
- Example:
  ```java
  module my.module {
      exports com.myapp;
  }
  ```
- The `exports` keyword makes the `com.myapp` package accessible to other modules.

### Java Localization
- **Java Localization** allows you to create applications that can be adapted to different languages, regions, and cultural conventions.
- Java provides **`ResourceBundle`** for managing locale-specific data like messages and formatting.
- Example:
  ```java
  ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", Locale.US);
  System.out.println(bundle.getString("greeting")); // Output depends on the locale
  ```

---

## 🆕 New Features of Java

### Virtual Threads
- **Virtual Threads** (introduced in Java 19) are lightweight threads that aim to make it easier to write and manage concurrent code.
- Virtual threads provide better scalability and improved performance in I/O-bound applications by reducing the overhead of thread management.
- Example:
  ```java
  ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
  executor.submit(() -> System.out.println("Running in a virtual thread!"));
  ```

### Sequenced Collections
- **Sequenced Collections** are a new feature in Java that guarantees the order of elements in collections like `Set` and `Map`.
- These collections allow predictable iteration order, which was not guaranteed in traditional `Set` and `Map` implementations.
- Example:
  ```java
  SequencedSet<String> sequencedSet = new LinkedHashSet<>();
  sequencedSet.add("first");
  sequencedSet.add("second");
  ```

### Sequenced Set and Map
- **SequencedSet** and **SequencedMap** are the interfaces that represent ordered sets and maps, respectively.
- They maintain the order in which elements are added, unlike standard sets and maps.
- Example:
  ```java
  SequencedSet<String> set = new LinkedHashSet<>();
  set.add("apple");
  set.add("banana");
  for (String item : set) {
      System.out.println(item); // Output: apple, banana
  }
  ```

### Unnamed Classes and Variables
- **Unnamed Classes** are classes without names that are often used for quick implementations.
- **Unnamed Variables** are similar to unnamed classes, where you don't define a variable name explicitly.
- Example (Unnamed class):
  ```java
  Runnable task = new Runnable() {
      public void run() {
          System.out.println("Unnamed class!");
      }
  };
  new Thread(task).start();
  ```

---

## 🏎 Agile 2

### Agile (continued)
- Agile development emphasizes flexibility, customer collaboration, and iterative progress. It focuses on delivering small, working portions of the project frequently, ensuring that teams can adjust quickly to changes.
- Common practices include **Scrum**, **Kanban**, and **Extreme Programming (XP)**.
- Example:
    - **Scrum** has fixed-length sprints, typically 2-4 weeks, to deliver features iteratively.
    - **Kanban** focuses on continuous delivery with visual boards for managing tasks.

---

## 🤖 AI Ethics: Fairness, Bias, and Privacy

### Fairness, Bias, and Privacy in AI
- **Fairness** ensures that AI systems treat all individuals or groups equally, without discrimination.
- **Bias** in AI refers to the presence of systematic error due to skewed data, leading to unfair outcomes.
- **Privacy** addresses how AI systems handle sensitive personal data.
- Example: An AI model trained on biased data may result in unfair hiring practices if the model discriminates against certain demographic groups.

---

## 📚 Introduction to Machine Learning

### Regression and Classification using Java
- **Regression** is used for predicting continuous values. **Classification** is used for predicting categorical values.
- In Java, **Apache Spark**, **Weka**, and **Deeplearning4j** are popular libraries for implementing machine learning models.
- Example of **Linear Regression**:
  ```java
  // Pseudo code: Model to predict housing prices based on area
  LinearRegression model = new LinearRegression();
  model.fit(trainingData);
  double predictedPrice = model.predict(newData);
  ```

---

## 💬 Natural Language Processing (NLP): Building Chatbots and Sentiment Analysis

### Chatbots and Sentiment Analysis
- **Chatbots** use NLP to interact with users, often powered by deep learning models like **RNNs**, **LSTMs**, or **Transformer models**.
- **Sentiment analysis** is the process of determining whether a piece of text is positive, negative, or neutral.
- Example (Chatbot interaction in Java):
  ```java
  String userMessage = "I need help with my order";
  // Sentiment analysis: Determine if message is positive or negative
  String sentiment = SentimentAnalysis.predict(userMessage);  // Returns "Neutral"
  ```
- Example (Building a simple chatbot using NLP):
  ```java
  String[] responses = {"How can I assist you?", "Please specify your issue."};
  String userInput = "I'm having trouble with my order.";
  for (String response : responses) {
      System.out.println(response);
  }
  ```
