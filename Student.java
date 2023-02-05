
import java.util.List;

    public class Student {
        public String studentName;
        public String studentSurname;
        public double marksAverage;

        public Student(String name, String surname, double average) {
            this.studentName = name;
            this.studentSurname = surname;
            this.marksAverage = average;
        }

        public static double getAverageMark(List<? extends Number> listOfMarks) {
            double sumOfMarks = ((Number)listOfMarks.get(0)).doubleValue() + ((Number)listOfMarks.get(1)).doubleValue();
            double average = sumOfMarks / 2.0;
            return average;
        }

        public String toString() {
            return "Student{studentName='" + this.studentName + "', studentSurname='" + this.studentSurname + "', marksAverage=" + this.marksAverage + "}";
        }
    }


