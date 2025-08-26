package ex_22082025;

public class Lab057 {
    public static void main(String[] args) {
        String name="Saurabh";
        String name2="Saurabh";
        //How many strings are created??
        //Answer --> 1 (Because both string values are equal
        //Scenario 2
        String name1="Saurabh";
        String name3="SaurabH";
        //How many strings created in SCP--->Ans-->2 (Because both string values are differ from each
        //Scenario 3
        String name4="Saurabh";
        String name5="Saurabh";
        String name9=new String("Saurabh");//Heap Area object
        //Two string created
        //scenario 4


        System.out.println(name);
    }
}
