package homeworkweek6;
/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class InstantStaticVarMet1 {
    int a=10;
    String n ="Viral";
    static int b=20;
    static String m="Prime";

    public static void main(String[] args) {
        InstantStaticVarMet1 instantStaticVarMet1= new InstantStaticVarMet1();
        Test();
        instantStaticVarMet1.Test1();
    }
    public static void Test(){
        InstantStaticVarMet1 p = new InstantStaticVarMet1();
        System.out.println("Static Method :");
        System.out.println(p.a+" "+p.n+" "+b+ " "+m);
    }
    public void Test1(){
        InstantStaticVarMet1 q = new InstantStaticVarMet1();
        System.out.println("Instance Method : ");
        System.out.println(a+" "+n+" "+q.b+" "+q.m);
    }

}
