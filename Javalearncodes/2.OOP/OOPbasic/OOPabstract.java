public class OOPabstract {
    public static void main(String[] args) {
        // TODO: 用抽象类给一个有工资收入和稿费收入的小伙伴算税:
        Income1[] incomes = new Income1[] { new BaseIncome1(3000), new SalaryIncome1(7500), new RoyaltyIncome1(12000) };
        double total = 0;
        // TODO:
        for (Income1 income:incomes){
            total = total + income.getTax();
        }
        System.out.println(total);
    }
}
//抽象类Income
 abstract class Income1 {
    protected double income;

    public  Income1(double income) {
        this.income = income;
    }
    abstract double getTax();


    // TODO

}
//BaseIncome
class BaseIncome1 extends Income1{

    public BaseIncome1(int income) {
        // TODO Auto-generated constructor stub
        super(income);
    }
    @Override
     double getTax() {

        return this.income  * 0.1;
    }
}

//SalaryIncome
class SalaryIncome1 extends Income1{

    // TODO

    public SalaryIncome1(int income) {
        // TODO Auto-generated constructor stub
        super(income);
    }
    @Override
   double getTax() {
        if (this.income<5000) {
            return 0.0;
        }
        return (this.income - 5000) * 0.2;
    }
}

//RoyaltyIncome
class RoyaltyIncome1 extends Income1{

    // TODO
    public RoyaltyIncome1(int income) {
        // TODO Auto-generated constructor stub
        super(income);
    }
    @Override
    double getTax() {
        return this.income*0.2;
    }
}



