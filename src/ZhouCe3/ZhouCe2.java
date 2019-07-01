package ZhouCe3;

public class ZhouCe2 {
    public static void main(String[] args) {
        ZhouCe2 hello = new ZhouCe2();
        double avg = hello.calcAvg();
        System.out.println("平均成绩为：" + avg);
    }
        public double calcAvg(){
            double java = 92.5;
            double php = 83.0;
            double avg = (java + php) / 2;
            return avg;
        }

    }

