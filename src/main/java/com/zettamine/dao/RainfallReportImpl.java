package com.zettamine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.config.ConnectionFactory;
import com.zettamine.dto.AnnualRainfall;

public class RainfallReportImpl implements RainfallReport {
	private static Statement st ;
	private static Connection con;
	

	public RainfallReportImpl() {
		super();
		try {
		con = ConnectionFactory.getConection();
		st = con.createStatement();
		}catch(Exception ex){
			ex.printStackTrace();	
		}
	}


	@Override
	public List<AnnualRainfall> findMaximumRainfallCities() {
		
		String query = "select * from AnnualRainfall order by average_annual_rainfall desc";
		List<AnnualRainfall> list = new ArrayList<>();
		
		try {
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int pincode = rs.getInt(1);
				String city = rs.getString(2);
				double avgrain = rs.getDouble(3);
				
				AnnualRainfall ar = new  AnnualRainfall(pincode, city, avgrain);
				
				list.add(ar);
				
			}
			
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}


	@Override
	public int addAnnualRainfall(AnnualRainfall ar) {
		String query = "insert into AnnualRainfall values(" + ar.getCityPincode() +",'"+ar.getCityName() +"'," 
                +ar.getAverageAnnualRainfall() +")";
		int res=0;
		try {
				 res = st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

}
