package homeworkweek6;
/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class InstanceStaticVarMethod {
    int a = 10;
    static String name = "Viral";

    public static void main(String[] args) {
        InstanceStaticVarMethod instanceStaticVarMethod = new InstanceStaticVarMethod();
        System.out.println("Instance Method :");
        Test1();
        System.out.println("Static Method :");
        instanceStaticVarMethod.Test();
    }

    public void Test() {
        InstanceStaticVarMethod i = new InstanceStaticVarMethod();
        System.out.println(a + " " + i.name);
    }

    public static void Test1() {
        InstanceStaticVarMethod j = new InstanceStaticVarMethod();
        System.out.println(j.a + " " + name);
    }
}
