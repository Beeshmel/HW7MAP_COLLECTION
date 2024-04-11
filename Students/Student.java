package Students;

public class Student {
    String fio;
    double averageGrade;


    public Student(String fio, double averageGrade){
        this.fio=fio;
        this.averageGrade=averageGrade;
    }

    public String getFio(Student student){
        return fio;
    }

    public String getAverageGrade(Student student){
        return String.format("%.2f",averageGrade);
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "ФИО студента " + fio +
                ", средний балл " + String.format("%.2f",averageGrade);
    }

}
