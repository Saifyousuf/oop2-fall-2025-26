class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public void displayContact() {
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}

class Student {
    private String name;
    private int id;
    private Contact contact;

    public Student(String name, int id, Contact contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        contact.displayContact();
        System.out.println("-------------------");
    }
}


class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int size) {
        this.schoolName = schoolName;
        students = new Student[size];
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        }
    }

    public void showAllStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("----- Student List -----");
        for (int i = 0; i < count; i++) {
            students[i].displayStudent();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("Green Valley School", 3);

        Contact c1 = new Contact("01711111111", "a@gmail.com");
        Contact c2 = new Contact("01822222222", "b@gmail.com");
        Contact c3 = new Contact("01933333333", "c@gmail.com");

        Student s1 = new Student("Rahim", 101, c1);
        Student s2 = new Student("Karim", 102, c2);
        Student s3 = new Student("Nayeem", 103, c3);

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        school.showAllStudents();
    }
}
    