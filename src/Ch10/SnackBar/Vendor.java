package Ch10.SnackBar;

public class Vendor {
    private int myStock;
    private int myPrice;
    private int myDeposit;
    private int myChange;
    private static int totalSales;

    Vendor(int price, int stock) {
        this.myPrice = price;
        this.myStock = stock;
        this.myDeposit = 0;
        this.myChange = 0;
    }

    public static int getTotalSales() {
        return totalSales;
    }

    void setStock() {
        this.myStock = 5;
    }

    int getStock() {
        return this.myStock;
    }

    void addMoney(int cents) {
        if (this.myStock != 0)
            this.myDeposit += cents;
    }

    int getDeposit() {
        return this.myDeposit;
    }

    boolean makeSale() {
        totalSales++;
        if (this.myStock != 0 && this.myDeposit >= this.myPrice) {
            --this.myStock;
            this.myChange = this.myDeposit - this.myPrice;
            this.myDeposit = 0;
            return true;
        } else {
            this.myChange = this.myDeposit;
            this.myDeposit = 0;
            return false;
        }
    }

    int getChange() {
        int temp = this.myChange;
        this.myChange = 0;
        return temp;
    }
}