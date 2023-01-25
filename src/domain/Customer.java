package src.domain;

public class Customer {
    private int ID;
    private Boolean isNew;
    private double total;

    public Customer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000.0;
    }

    public Customer(int ID, Boolean isNew, double total) {
        setID(ID);
        setNew(isNew);
        setTotal(total);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if(ID > 0){
            this.ID = ID;
        }else{
            this.ID = 0;
        }
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        if (aNew != null){
            isNew = aNew;
        }else{
            isNew = true;
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {

        if(total < 0){
            this.total = 0;
        }else{
            this.total = total;
        }
    }

    public void displayCustomerInfo(){
        System.out.println("Клієнт(Customer) {" + "\n" +
                "   Номер клієнта : " + ID + "\n" +
                "   Статус клієнта : " + (isNew ? "новий" : "старий") + "\n" +
                "   Загальна сума замовлень(рік) : " + total + "\n" +
                "}");
    }

}
