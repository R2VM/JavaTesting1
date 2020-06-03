package nehaSunlight;

class Emp
{
    void getSalary()
    {
        System.out.println("Salary is £70000K");
    }

}
class Tester extends Emp
{

void getHike()
{
    System.out.println("Salary Hike is £7000K");
}
        }
class HR extends Emp
                {
                    void getBonus()
                    {
                        System.out.println("Emp gets Bonus £7777");
                    }

                }
                class Heirarchiallnheritance
                {
                    public static void main(String[] agrs)
                    {
                        HR h = new HR();
                        h.getSalary();
                        h.getBonus();

                        Tester t = new Tester();
                        t.getSalary();
                        t.getHike();

                    }
                }