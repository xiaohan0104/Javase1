import java.util.Scanner;
public class Xiti4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score;
        String sex;


        System.out.println("请输入您的分数");
        score =sc.nextInt();
        if(score>80){
            System.out.println("请输入您的性别");
            sex = sc.next();
            if(sex.equals("女")){
                System.out.println("进入女子决赛");
            }else{
                System.out.println("今日男子决赛");
            }
        }else {
            System.out.println("对不起，您已被淘汰");
        }

    }
}
