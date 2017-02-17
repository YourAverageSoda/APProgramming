package Unit05;

/*
Author: Andy Zheng
Date Created: 2/8/17
*/
public class AccountMain {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.enterAccountInfo(1, "Pheobe", "allWeKnow");
        System.out.println("AC #: " +  ac.getAccountNumber() + "\nName: " + ac.getName() + "\nPassword: " + ac.getPassword());
        ac.changePassword();
        System.out.println("AC #: " +  ac.getAccountNumber() + "\nName: " + ac.getName() + "\nPassword: " + ac.getPassword());
        Savings sac = new Savings();
        sac.enterAccountInfo(2, "Ryan", "thisFeeling's", 31415926);
        System.out.println("SAC #: " +  sac.getAccountNumber() + "\nName: " + sac.getName() + "\nPassword: " + sac.getPassword() + "\nBalance: " + sac.balance);
        sac.deposit(11037);
        sac.withdraw(147);
        sac.earnInterest();
        sac.changePassword();
        System.out.println("SAC #: " +  sac.getAccountNumber() + "\nName: " + sac.getName() + "\nPassword: " + sac.getPassword() + "\nBalance: " + sac.balance);
        Checking cac = new Checking();
        cac.enterAccountInfo(3, "Halsey", "closer", 2142017);
        System.out.println("CAC #: " +  cac.getAccountNumber() + "\nName: " + cac.getName() + "\nPassword: " + cac.getPassword() + "\nBalance: " + cac.balance);
        cac.deposit(205);
        cac.withdraw(220);
        cac.writeCheck(11235.13);
        cac.earnInterest();
        cac.changePassword();
        System.out.println("CAC #: " +  cac.getAccountNumber() + "\nName: " + cac.getName() + "\nPassword: " + cac.getPassword() + "\nBalance: " + cac.balance + "\nCheck #: " + cac.checkLookUp(11235));
        
    }
}
