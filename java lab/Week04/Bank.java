import java.util.ArrayList;
import java.util.List;

public class Bank {
//1.variable
private ArrayList<BankAccount> accounts;
//2.constructor
public Bank()
{
  accounts = new ArrayList<BankAccount>();
}
//3.methods
//add an account to this bank
public void addAccount(BankAccount a)
{
  accounts.add(a);
}
//gets the sum of the balances of all accounts in this bank
public double getTotalBalance(){
//**************** YOUR CODE HERE****************
double totalBalance = 0;
for(BankAccount check : accounts)
{
  totalBalance += check.getBalance();
}
return totalBalance;
//*********************************************
}

	//counts the number of bank account whose balance is at least given value.
public int countBalanceAtLeast(double atLeast){
//**************** YOUR CODE HERE****************
int count = 0;
for(BankAccount least: accounts)
{
  if(least.getBalance() >= atLeast)
  {
    count++;
  }
}
return count;
//*********************************************
}
	
//finds a bank account with a given number
public BankAccount find(int accountNumber){
//**************** YOUR CODE HERE****************
for(BankAccount found : accounts)
{
  if(found.getAccountNumber() == accountNumber)
  {
    return found;
  }
}
return null;
//*********************************************
}


//gets the bank account with the largest balance.
public BankAccount getMax(){
//**************** YOUR CODE HERE****************
if(accounts.size() == 0)
  {
     return null;
  }

BankAccount biggestBoi = accounts.get(0);
for(BankAccount check : accounts)
{
  if(check.getBalance() > biggestBoi.getBalance())
  {
    biggestBoi = check;
  }
}
return biggestBoi;
//*********************************************
}
	
//gets the bank account with the minimum balance.
public BankAccount getMin()
{
//**************** YOUR CODE HERE****************
if(accounts.size() == 0)
  {
     return null;
  }
  
BankAccount smallestBoi = accounts.get(0);
for(BankAccount check : accounts)
{
  if(check.getBalance() < smallestBoi.getBalance())
  { 
    smallestBoi = check;
  }
}
return smallestBoi;
//*********************************************
}
//finds duplicate accounts by checking the account numbers in O(N) without using Set and Map
//return the list of all the accounts that are later found to be duplicate, if there is no duplicate simply return an empty list
public List<BankAccount> findDuplicate(){
//**************** YOUR CODE HERE****************
List<BankAccount> dupeList = new ArrayList<BankAccount>();
for(int i = 0; i < accounts.size(); i++)
   {
      for(int j = 1; j < i; j++)
         {
            BankAccount one = accounts.get(i);
            BankAccount two = accounts.get(j);

            if(one.getAccountNumber() == two.getAccountNumber())
              {
                 dupeList.add(one);
                 break;      
              }
          }
    
  }return dupeList;
//*********************************************
}
}
//{"6900", "1825.35"}
//{"6900", "71.25"}
//{"6900", "60.25"}
//{"1969", "1044.59"}
//{"1969", "1043.59"}