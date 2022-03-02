public class GreatestNumverAmongThree {

    public static void main(String[] args) {
        Greatest ob1 = new Greatest();
        Greatest ob2 = new Greatest();
        Greatest ob3 = new Greatest();
        Greatest ob4 = new Greatest();
        
        ob1.in(35);
        ob2.in(23);
        ob3.in(45);
        ob4.calc(ob1, ob2, ob3);
        ob4.out();

    }
    
}
class Greatest
{
    int num;
    void in(int num1)
    {
        num = num1;
    }
    void calc(Greatest ob1, Greatest ob2, Greatest ob3)
    {
        if(ob1.num>ob2.num && ob1.num>ob3.num)
        {
            num = ob1.num;
        }
        else if(ob2.num>ob3.num && ob2.num>ob1.num)
        {
            num = ob2.num;
        }
        else
        {
            num = ob3.num;
        }
    }
    void out()
    {
        System.out.println(" The max number is :"+num);
    }
}