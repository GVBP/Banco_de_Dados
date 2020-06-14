package com.catolicasc.N2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		String connectionUrl = "jdbc:sqlserver://localhost:1433;user=catolica;password=1234;databaseName=N2";
        String insertStringCategory = "INSERT INTO Category (CategoryID, CategoryName, Description) VALUES (?, ?, ?)";
        String insertStringProduct = "INSERT INTO Product (ProductID, ProductName, CategoryID, QuantityPerUnit, UnitPrice) VALUES (?, ?, ?, ?, ?)";
        
        try (
        		Connection con = DriverManager.getConnection(connectionUrl);
        		PreparedStatement stmtc = con.prepareStatement(insertStringCategory);
        		PreparedStatement stmtp = con.prepareStatement(insertStringProduct);
        	) {
        	Category c1 = new Category(1, "Smartphones", "Celular & Telefones > Smartphones");
        	stmtc.setInt(1, c1.getCategoryID());
        	stmtc.setString(2, c1.getCategoryName());
        	stmtc.setString(3, c1.getDescription());        	
        	stmtc.executeUpdate();
        	
        	Category c2 = new Category(2, "Monitores", "Compudatores > Monitores");
        	stmtc.setInt(1, c2.getCategoryID());
        	stmtc.setString(2, c2.getCategoryName());
        	stmtc.setString(3, c2.getDescription());        	
        	stmtc.executeUpdate();
        	
        	Product p1 = new Product(1, "iPhone 6S Cinza Espacial", 1, 50, 1899.90f);
        	stmtp.setInt(1, p1.getProductID());
        	stmtp.setString(2, p1.getProductName());
        	stmtp.setInt(3, p1.getCategoryID());
        	stmtp.setInt(4, p1.getQuantityPerUnit());
        	stmtp.setFloat(5, p1.getUnitPrice());
        	stmtp.executeUpdate();
        	
        	Product p2 = new Product(2, "Smartphone Samsung Galaxy A51", 1, 50, 2299.00f);
        	stmtp.setInt(1, p2.getProductID());
        	stmtp.setString(2, p2.getProductName());
        	stmtp.setInt(3, p2.getCategoryID());
        	stmtp.setInt(4, p2.getQuantityPerUnit());
        	stmtp.setFloat(5, p2.getUnitPrice());
        	stmtp.executeUpdate();
        	
        	Product p3 = new Product(3, "Monitor LG LED 25´ Ultrawide", 2, 20, 1199.90f);
        	stmtp.setInt(1, p3.getProductID());
        	stmtp.setString(2, p3.getProductName());
        	stmtp.setInt(3, p3.getCategoryID());
        	stmtp.setInt(4, p3.getQuantityPerUnit());
        	stmtp.setFloat(5, p3.getUnitPrice());
        	stmtp.executeUpdate();
        	
        	Product p4 = new Product(4, "Monitor LG LED 23.8´ Widescreen", 2, 20, 799.90f);
        	stmtp.setInt(1, p4.getProductID());
        	stmtp.setString(2, p4.getProductName());
        	stmtp.setInt(3, p4.getCategoryID());
        	stmtp.setInt(4, p4.getQuantityPerUnit());
        	stmtp.setFloat(5, p4.getUnitPrice());
        	stmtp.executeUpdate();

        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		Statement stmt = con.createStatement();
        	) {
        	
            String SQL = "SELECT * FROM Product p JOIN Category c ON (p.ProductID = c.CategoryID)";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
            	Product p = new Product();
            	p.setProductID(rs.getInt("ProductID"));
            	p.setProductName(rs.getString("ProductName"));
            	p.setCategoryID(rs.getInt("CategoryID"));
            	p.setQuantityPerUnit(rs.getInt("QuantityPerUnit"));
            	p.setUnitPrice(rs.getFloat("UnitPrice"));

            	System.out.println(p);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
	}
}