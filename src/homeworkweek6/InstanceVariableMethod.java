package homeworkweek6;
/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class InstanceVariableMethod {
    int a = 10;
    String name = "Viral";

    public static void main(String[] args) {
        InstanceVariableMethod instanceVariableMethod = new InstanceVariableMethod();
        System.out.println("Dynamic Method :");
        instanceVariableMethod.Test();
    }

    public void Test() {
        System.out.println(a + " " + name);
    }
}