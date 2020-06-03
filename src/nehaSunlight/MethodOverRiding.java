package nehaSunlight;

class Bank {
    int emi() {
        return 0;
    }
}
    class Barclays extends Bank
    {
        int emi()
        {
            return 17;
        }
    }
        class HSBC extends Bank
        {
            int emi()
            {
                return 19;
            }
        }


 class MethodOverRiding
 {
     public static void main(String[] args)
     {
         Barclays b = new Barclays();
         System.out.println(b.emi());
         HSBC h = new HSBC();
         System.out.println(h.emi());
     }

}
