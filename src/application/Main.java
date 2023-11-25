package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(2, "Electronics");

        Seller seller = new Seller(23, "Alex", "alex@gmail.com", new Date(), 3000.0, obj);

        System.out.println(obj);
    }
}