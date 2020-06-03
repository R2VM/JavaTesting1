package nehaSunlight;


class Empy
{
    int id;
    String name;
    String designation;
    int age;
    Address1 address;    //Calling a Reference variable and making an Object out of it

    public Empy(int id, String name, String designation, int age, Address1 address)
    {
        this.id = id;
        this.name=name;
        this.designation = designation;
        this.age = age;
        this.address = address;
    }
    void getdetails()
    {
        System.out.println(id + "" + name + " " + designation + " " + age);
        System.out.println(address.houseNo+ "" + address.street+ "" + address.city+ "" + address.state+ "" + address.postcode);
    }


    public void main(String[]args)
    {
        Address1 a1 = new Address1(77,    "bergamot",    "london",   "LDUK",   "me16 9fx" );
        Empy e1 = new Empy(1234,    "Vivek",  " Director",   44, a1 );

                e1.getdetails();
    }
}

