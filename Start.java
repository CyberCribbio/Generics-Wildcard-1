
import java.util.ArrayList;
        import java.util.List;

public class Start {
    public Start() {
    }

    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList();
        individualMarksListLisa.add(6.4);
        individualMarksListLisa.add(3.5);
        List<Integer> projectMarksListJeremy = new ArrayList();
        projectMarksListJeremy.add(5);
        projectMarksListJeremy.add(9);
        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);
        List<Student> listOfStudents = new ArrayList();
        listOfStudents.add(new Student("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAvg));
        System.out.println(listOfStudents.get(0));
        System.out.println(listOfStudents.get(1));
    }
}
