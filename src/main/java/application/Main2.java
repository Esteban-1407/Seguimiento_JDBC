package application;

import model.DatabaseConnection;
import model.Product;
import repository.Repository;
import repository.impl.ProductRepositorylmpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getInstance()){
            Repository<Product> repository = new ProductRepositorylmpl();
            System.out.println("~~~~ List Products for Database ~~~~");
            repository.list().stream().forEach(System.out::println);
            System.out.println("~~~~ Get by Id : 1 ~~~~");
            System.out.println(repository.byId(1).toString());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
