package Homeworks;

public class MaximumFromArray {
   public static void main(String[] args) {
       //Find The maximum from the array
       int []salaries={90,999,121,32,45,667};
       int max_salary=Integer.MIN_VALUE;
       for (int i = 0; i < salaries.length; i++) {
           if(salaries[i]>max_salary){
               max_salary=salaries[i];
           }
int j=0;
           while (j<salaries.length){
               if(salaries[j]>max_salary){
                   max_salary=salaries[j];
               }
               j++;
           }
           System.out.println("The maximum salaries are--->"+max_salary);
       }
        System.out.println("The maximum salary is--->"+max_salary);
    }
}
