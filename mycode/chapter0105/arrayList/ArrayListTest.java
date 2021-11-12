package arrayList;

import java.util.*;

public class ArrayListTest
{
   public static void main(String[] string)
   {
      // fill the staff array list with three Employee objects
      var staff = new ArrayList<Employee>();

      staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
      staff.add(new Employee("Harry Hacker", 80000, 1965, 10 ,11));
      staff.add(new Employee("Tony Tester", 40000, 1990, 9, 12));

      // raise everyone's salary by 5%
      for (Employee e : staff)
         e.raiseSalary(5);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                 + e.getHireDay());
   }
}