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

    public Customer(int ID, Boolean isNew, double total) throws Exception {
        setID(ID);
        setNew(isNew);
        setTotal(total);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) throws Exception {
        if(ID > 0){
            this.ID = ID;
        }else{
            throw new Exception("ID повинен бути більше нуля");
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

    public void setTotal(double total) throws Exception{

        if(total < 0){
            throw new Exception("Сума повинна бути більше нуля");
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
