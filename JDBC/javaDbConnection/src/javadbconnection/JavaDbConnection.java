package javadbconnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaDbConnection {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaDbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        JavaDbConnection jdc = new JavaDbConnection();
       // jdc.dropTable();
        //jdc.createTable();
        //jdc.insertData();
        jdc.readData();
       // jdc.insertDataWithPs();
    }

    public Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college_management", "root", "root123");
        return con;
    }

    public void readData() {

        try ( Connection con = getConnection()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student_info ");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void dropTable() {
        try ( Connection con = getConnection()) {
            Statement stmt = con.createStatement();
            int rs = stmt.executeUpdate("drop table student_info ");
            System.out.println(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void createTable() {
        try ( Connection con = getConnection()) {
            Statement stmt = con.createStatement();
            String createTable = "create table student_info(\n"
                    + "rollnumber varchar(20) primary key,\n"
                    + "s_name varchar(100) ,\n"
                    + "address varchar(100),\n"
                    + "age smallint,\n"
                    + "gender varchar(10),\n"
                    + "dob date,\n"
                    + "class smallint\n"
                    + "\n"
                    + ");";
            int rs = stmt.executeUpdate(createTable);
            System.out.println(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertData() {
        try ( Connection con = getConnection()) {
            Statement stmt = con.createStatement();
            int rs = stmt.executeUpdate("insert into student_info values('abc123','hepsibah','hyderabad',22,'female','1999-12-01',17) ");
            System.out.println(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertDataWithPs() {
        try ( Connection con = getConnection()) {
            String s = "insert into student_info values(?,?,?,?,?,?,?) ";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, "123asd");
            ps.setString(2, "sweety");
            ps.setString(3, "nagaram");
            ps.setInt(4, 7);
            ps.setString(5, "female");
            ps.setString(6, "2000-01-12");
            ps.setInt(7, 2);
            int e = ps.executeUpdate();
            System.out.println(e);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
