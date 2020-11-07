
import java.util.Scanner;

class Student implements Comparable<Student> {

    private String RollNo;
    private String name;
    private int term;
    private double totalAvgFE;//điểm trung bình học tập
    private double extraActivities;//

    public Student() {
        RollNo = "No Roll";
        name = "No name";
        term = 0;
        totalAvgFE = -1;
        extraActivities = -1;
    }

    public Student(String RollNo, String name, int term, double totalAvgFE, double extraActivities) {
        this.RollNo = RollNo;
        this.name = name;
        this.term = term;
        this.totalAvgFE = totalAvgFE;
        this.extraActivities = extraActivities;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String RollNo) {
        this.RollNo = RollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getTotalAvgFE() {
        return totalAvgFE;
    }

    public void setTotalAvgFE(double totalAvgFE) {
        this.totalAvgFE = totalAvgFE;
    }

    public double getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(double extraActivities) {
        this.extraActivities = extraActivities;
    }

    @Override
    public String toString() {
        return String.format("%10s%20s%5d%5.0f%5.0f", RollNo, name, term, totalAvgFE, extraActivities);
    }

    @Override
    public int compareTo(Student o) {
        String name1 = name.substring(name.lastIndexOf(" "));
        String name2 = o.name.substring(o.name.lastIndexOf(" "));
        return name1.compareTo(name2);
    }

}
