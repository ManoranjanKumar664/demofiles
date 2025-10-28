class person
{
    String name;
    person(String name)
    {
        this.name=name;
    }
    void show_name()
    {
        System.out.println(name);
    }
}

public class java02
{
    public static void main(String[] args) {
        person p1=new person("ranjan");
        p1.show_name();
    }
}