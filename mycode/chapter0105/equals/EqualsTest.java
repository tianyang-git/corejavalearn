package equals;

public class EqualsTest
{
    public static void main(String[] args)
    {
        var alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var alice2 = alice1;
        var alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice2 == alice3: " + (alice2 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
        System.out.println("bob.toString()" + bob);

        var car1 = new Manager("Carl Crackers", 80000, 1987, 12, 15);
        var boss = new Manager("Carl Crackers", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString()" + boss);
        System.out.println("car1.equals(boss): " + car1.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice2.hashCode(): " + alice2.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("car1.hashCode(): " + car1.hashCode());
        System.out.println("boss.hashCode(): " + boss.hashCode());
    }
}