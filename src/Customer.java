public class Customer {
  public int ID = 1;
  public boolean isNew = true; 
  public double total = 100;

  public int getID(){
    return ID;
  }
  public void setID(int ID){
    this.ID = ID;
  }
  
  public boolean getisNew(){
    return isNew;
  }
  public void setisNew(boolean isNew){
    this.isNew = isNew;
  }
  
  public double gettotal(){
    return total;
  }
  public void settotal(double total){
    this.total = total;
  }
  
  public void displayCustomerInfo(){
    System.out.println("Customer ID is: " + ID);
    System.out.println("isNew: " + isNew);
    System.out.println("Total purchases are: " + total);
  }
}