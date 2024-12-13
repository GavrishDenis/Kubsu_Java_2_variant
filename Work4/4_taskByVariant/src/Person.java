import java.util.ArrayList;

// Базовый класс Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d}", name, age);
    }
}

// Класс Student
class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("Student{%s, studentId='%s'}", super.toString(), studentId);
    }
}

// Класс Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("Teacher{%s, subject='%s'}", super.toString(), subject);
    }
}

// Класс Principal
class Principal extends Person {
    private String schoolLevel;

    public Principal(String name, int age, String schoolLevel) {
        super(name, age);
        this.schoolLevel = schoolLevel;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    @Override
    public String toString() {
        return String.format("Principal{%s, schoolLevel='%s'}", super.toString(), schoolLevel);
    }
}

// Класс School
class School {
    private ArrayList<Person> people;

    public School() {
        this.people = new ArrayList<>();
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public void removePerson(Person person) {
        this.people.remove(person);
    }

    public int countStudents() {
        return (int) people.stream().filter(p -> p instanceof Student).count();
    }

    public int countTeachers() {
        return (int) people.stream().filter(p -> p instanceof Teacher).count();
    }

    public int countPrincipals() {
        return (int) people.stream().filter(p -> p instanceof Principal).count();
    }

    public void printAllPeople() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Alice", 20, "S12345");
        Student student2 = new Student("Bob", 22, "S67890");

        Teacher teacher1 = new Teacher("Mr. Smith", 40, "Mathematics");
        Teacher teacher2 = new Teacher("Ms. Johnson", 35, "History");

        Principal principal = new Principal("Dr. Adams", 50, "High School");

        school.addPerson(student1);
        school.addPerson(student2);
        school.addPerson(teacher1);
        school.addPerson(teacher2);
        school.addPerson(principal);

        System.out.println("All people in the school:");
        school.printAllPeople();

        System.out.println("\nCount of Students: " + school.countStudents());
        System.out.println("Count of Teachers: " + school.countTeachers());
        System.out.println("Count of Principals: " + school.countPrincipals());
    }
}

