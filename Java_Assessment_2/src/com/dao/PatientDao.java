package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.model.PatientModel;
import com.util.DBUtil;

public class PatientDao 
{
	Connection cn=null;
	public void addPatient(PatientModel p) {
        try {
            cn =new DBUtil().getConnectionData();
            String query = "INSERT INTO patient(name, mobile) VALUES(?, ?)";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, p.getName());
            ps.setString(2, p.getMobile());

            ps.executeUpdate();
            System.out.println("✅ Patient Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewPatients() {
        try {
            cn = new DBUtil().getConnectionData();
            String query = "SELECT * FROM patient";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("\n--- Patient List ---");
            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    " | Name: " + rs.getString("name") +
                    " | Mobile: " + rs.getString("mobile")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
