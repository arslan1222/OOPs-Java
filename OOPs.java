public class OOPs {

    public static void main(String args[]){

        BankAcount myAccount = new BankAcount();
        myAccount.name = "Arslan";
        System.out.println(myAccount.name);

        myAccount.password = 12345678;
        System.out.println(myAccount.password);  // We can't access password bcz it is private

        // myAccount.setPswrd(12345678);
        // System.out.println(myAccount.password);





    }
}

class BankAcount{
    public String name;
    public int password;

    void setName(String name){
        name = name;
    }

    void setPswrd(int pswrd){
        password = pswrd;
    }


}

// class Student{
//     String name;
//     int rolNumber;
//     float percentage;

//     void setName(String newName){
//         name = newName;
//     }

//     void setRolnumber(int newRollnumber){
//         rollnumber = newRollnumber;
//     }

//     void calPercentage(float math, float phy, flaot cs){
//         percentage = (math, phy, cs) / 3;
//     }
    
// } 