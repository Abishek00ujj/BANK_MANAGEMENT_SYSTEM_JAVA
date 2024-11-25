import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<Integer,String> User=new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> Amount=new LinkedHashMap<>();
        int Id=12345;
        while(true) {
            System.out.println("Enter 1 to start/ 0 to end");
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 0) {
                break;
            }
            if (n == 1) {
                System.out.println("1.BANK LOGIN");
                System.out.println("2.USER LOGIN");
                System.out.println("........................................................");
                int l = sc.nextInt();
                sc.nextLine();
                if (l == 1) {
                    System.out.println("Enter your id: \n");
                    String id = sc.nextLine();
                    System.out.println("Enter your password: \n");
                    int pass = sc.nextInt();
                    System.out.println("........................................................");
                    sc.nextLine();
                    if (id.equals("admin") && pass == 1234) {
                        System.out.println("Welcome Admin!");
                        System.out.println("1.Add users");

                        System.out.println("........................................................");
                        int a = sc.nextInt();
                        sc.nextLine();
                        if (a == 1) {
                            System.out.println("Enter the user name:");
                            String name=sc.nextLine();
                            User.put(Id, name);
                            System.out.println("User is created successfully!");
                            System.out.println("Account number: "+Id);
                            System.out.println("Name: "+name);
                            Amount.put(Id,1000);
                            System.out.println("1000rs intial balance is added! ");
                            System.out.println("Thank you!");
                            System.out.println("........................................................");
                        }
                        else if(a==2)
                        {
                            System.out.println("Showing all users");
                            System.out.println("Account number         Name");
                            for(Map.Entry<Integer,String> e:User.entrySet())
                            {
                                System.out.println(e.getKey()+"   " +e.getValue());
                            }
                            System.out.println("........................................................");
                        }
                    } else {
                        System.out.println("Invalid login attempt");
                        System.out.println("........................................................");
                    }
                }
                else if(l==2)
                {
                    System.out.println("User Login!");
                    System.out.println("Enter your Account number:\n");
                    System.out.println("........................................................");
                    int accno=sc.nextInt();
                    sc.nextLine();
                    if(User.containsKey(accno))
                    {
                        System.out.println("Welcome "+User.get(accno));
                        System.out.println("Enter 1 to deposite amount!");
                        System.out.println("Enter 2 to withdraw");
                        System.out.println("Enter 3 to check balance");
                        System.out.println("Enter 4 to print history");
                        System.out.println("........................................................");
                        int x=sc.nextInt();
                        if(x==1)
                        {
                            System.out.println("enter the amount to be deposited!");
                            int x1=sc.nextInt();
                            sc.nextLine();
                            Amount.put(Id,x1);
                            System.out.println("Amount is deposited succuessfully!");
                            System.out.println("........................................................");
                        }
                        else if(x==2)
                        {
                            System.out.println("enter the amount to be Withdraw!");
                            int x1=sc.nextInt();
                            sc.nextLine();
                            int mx= Amount.get(Id);
                            if(x1>mx)
                            {
                                System.out.println("Insufficient balance!, Please try again with some other amount!");
                                System.out.println("Press 3 to check the balance!");
                            }
                            else {
                                Amount.put(Id,mx-x1);
                                System.out.println("Amount is Withdraw succuessfully!");
                                System.out.println("........................................................");
                            }

                        }
                        else  if(x==3)
                        {
                            System.out.println("Account Balance: "+ Amount.get(Id));
                            System.out.println("........................................................");
                        }
                        sc.nextLine();
                    }
                }
            }
        }

    }
}