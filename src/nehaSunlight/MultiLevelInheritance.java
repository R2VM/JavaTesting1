package nehaSunlight;

class Emp1
{
    void getSalary1()
    {
        System.out.println("Viv Salary is £70000K");
    }

}

class Tester1 extends Emp1
{

void getHike1()
{
    System.out.println("Viv Salary Hike is £77777K");
}
        }

class HR1 extends Tester1
                {
                    void getBonus1()
                    {
                        System.out.println("Viv Emp gets Bonus £5555");
                    }

                }

class MultiLevellnheritance
{
    public static void main(String[] agrs)
    {
        HR1 h = new HR1();
        h.getSalary1();
        h.getBonus1();
        h.getHike1();

    }
}