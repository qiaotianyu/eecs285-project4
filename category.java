package eecs285.proj4.qiaotian;

import java.util.Vector;

public class category {


    final public Double budget;
    public Double balance;
    public Vector<String> transactions;
    public category(Double inbudget)
    {
        transactions=new Vector<String>();
        budget=inbudget;
        balance=inbudget;
    }

}
