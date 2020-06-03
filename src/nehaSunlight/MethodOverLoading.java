package nehaSunlight;

class AddNumbers
{
static int add(int a, int b)
    {
        return a+b;
    }
static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    static double add(double a, double b, double c)
    {
        return a+b+c;
    }
}

class MethodOverLoading
{
    public static void main(String[] agrs)
    {
        System.out.println(AddNumbers.add(1, 2));
        System.out.println(AddNumbers.add(2, 3, 4));
        System.out.println(AddNumbers.add(22.5,33.1,44.2));
    }
}
