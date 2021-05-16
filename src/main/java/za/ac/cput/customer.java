package za.ac.cput;

import java.util.Objects;

public class customer
{
    int customerId;
    String  customerName;
    String customerSurname;
    String customerAddress;

    public customer()
    {


    }

    public customer(int customerId,String  customerName, String customerSurname,String customerAddress)
    {
        this.customerId = customerId;
        this.customerSurname=customerName;
        this.customerSurname=customerSurname;
        this.customerAddress=customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }


}