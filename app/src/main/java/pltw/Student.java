package pltw;

/*
 * Activity 4.9.7
 */
public class Student {
    private String name;

    private int id;

    private int grade;

    // Constructor
    Student(String inputName, int id, int grade) {
        name = inputName;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student id=" + id + " grade=" + grade + " name=\"" + name + "\"";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass())
            return false;

        return ((Student)obj).id == id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
