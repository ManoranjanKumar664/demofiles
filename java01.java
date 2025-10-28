class student
{
    private int a, b;
    student(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void doing()
    {
        int sum=a+b;
        System.out.println(sum);
    }
}

public class java01
{
    public static void main(String[] args) {
        student s1=new student(10, 20);
        s1.doing();
    }
}