import java.math.BigInteger;

public class ForAverageScore {
    public double averageScore;
    public int marks;
    public double result;

    public ForAverageScore(double averageScore, int marks) {
        this.averageScore = averageScore;
        this.marks = marks;
        result = MiddleMark(marks);
        Answer(marks, averageScore, result);
    }

    public double MiddleMark(int marks){
        double result = 0;
        int count = 0;
        while(marks>0){
            result += marks%10;
            marks = marks/10;
            count++;
        }
        result = result/count;
        System.out.println("Result:"+result);
        return result;
    }
    public void Answer(int marks, double averageScore, double result ){
        int five = 0;
        int count = 0;
        double sum = 0;
        while(marks>0){
            sum += marks%10;
            marks = marks/10;
            count++;
        }
        if(result>=averageScore){
            System.out.println("Вы достигли необходимого балла");
        }
        else {
            while (result < averageScore) {
                sum += 5;
                count++;
                five++;
                result = sum / count;
            }
            System.out.println("Вам нужно получить оценку 5 в количестве:" + five);
        }
    }
}
