package assignment10;

import org.springframework.stereotype.Component;

public class Student {
    private String name;
    private int engMarks;
    private int hindiMarks;
    private int mathsMarks;

    public Student(String name, int engMarks, int hindiMarks, int mathsMarks) {
        this.name = name;
        this.engMarks = engMarks;
        this.hindiMarks = hindiMarks;
        this.mathsMarks = mathsMarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEngMarks(int engMarks) {
        this.engMarks = engMarks;
    }

    public int getEngMarks() {
        return engMarks;
    }

    public void setHindiMarks(int hindiMarks) {
        this.hindiMarks = hindiMarks;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public double calculateAvgMark() {
        return (engMarks + hindiMarks + mathsMarks) / 3.0;
    }
    public void showResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Marks: " + calculateAvgMark());
    }
}
