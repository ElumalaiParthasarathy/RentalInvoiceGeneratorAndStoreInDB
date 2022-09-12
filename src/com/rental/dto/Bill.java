package com.rental.dto;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Bill {



	public void generateRecceipt(String name,String phone,int basic,String room,int ebBill) throws Throwable {

		UUID id = UUID.randomUUID();
		String uuid = id.toString();

		LocalDate dater =  LocalDate.now();
		int total;
		Tenent tenent = new Tenent(name,phone,room, basic, 200, 300,ebBill);
		total = tenent.getRoomRent()+tenent.getElectricityCharges()+tenent.getWaterBill()+tenent.getRoomMaintiance();


		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\eluma\\Desktop\\receipt.pdf"));
		document.open();
		document.add(new  
				Paragraph(
						"                                                               HOUSE RENT RECEIPT                                  "+
								"\nDate : "+dater+"                                                                            For Queries : 9080757981                              "
								+	"\nReceipt ID : "+uuid+"                                                                                                                         "
								+"\n==========================================================================\n "
								+ "Tenet Name : "+tenent.getTenetName()+"\nTenet phone number : "+tenent.getTenetPhone()+
								"\nTenet room number :"+tenent.getTenetRoomNo()+
								"\n=========================================================================="+
								"\nRent        =  "+tenent.getRoomRent()+
								"\nMaintance   =  "+tenent.getRoomMaintiance()+
								"\nWater Bill  =  "+tenent.getWaterBill()+
								"\nElectricity =  "+tenent.getElectricityCharges()+
								"\n---------------------------"+
								"\nTotal       =  "+total+
								"\n=========================================================================="
								+       "\nDeveloped and Desinged by : https://www.linkedin.com/in/elumalai-p-6a3240195/              "));
		document.close();

		System.out.println("The receipt ID is "+uuid);

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/rent","root","");


		String sql ="INSERT INTO uuid (UUID, Tenet_Name,Tenet_Phone,Tenet_Room,Rent,file)"+
				"VALUES(?,?,?,?,?,?)";

		PreparedStatement pd =  connection.prepareStatement(sql);
		pd.setString(1, uuid);
		pd.setString(2, tenent.getTenetName());
		pd.setString(3, tenent.getTenetPhone());
		pd.setString(4, tenent.getTenetRoomNo());
		pd.setInt(5, tenent.getRoomRent());
		File f = new File("C:\\Users\\eluma\\Desktop\\receipt.pdf");
		FileReader fileReader = new FileReader(f);
		FileInputStream fileInputStream = new FileInputStream(f);
		pd.setBinaryStream(6, (InputStream)fileInputStream, (int)f.length());
		int executeUpdate = pd.executeUpdate();
		if (executeUpdate>0) {
			System.out.println("Uploaded successfully");
		}else {
			System.out.println("Unable to upload");
		}

	}

	public static void main(String[] args) throws Throwable{

		PreparedStatement pd = null ;
		Connection connection = null;
		String exitCheck ;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("To generate new receipt type A.");
			System.out.println("To fecth Rent Payment history type B");
			System.out.println("To download receipt from Db type c");
			
			String check =sc.next().toUpperCase();
			

			switch (check) {

			case "A":
				System.out.println("Enter The tenet name :");
				String name = sc.next();
				System.out.println("Enter the tenet Phone number : ");
				String phone = sc.next();
				System.out.println("Enter the Room No from 'TR1,TR2,BR1,BR2' : ");
				String room=sc.next();
				System.out.println("ENter the basic rent amount : ");
				int basic = sc.nextInt();
				System.out.println("Enter the EB bill Amount : ");
				int ebBill=sc.nextInt();

				Bill bill = new Bill();
				bill.generateRecceipt(name, phone, basic,room,ebBill);

				break;

			case "B":

				System.out.println("Enter the receipt id to retrive details:");
				String id = sc.next();
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/rent","root","");
				pd =  connection.prepareStatement("select * from uuid where UUID=?");
				pd.setString(1, id);

				pd.execute();
				ResultSet resultSet = pd.getResultSet();
				while(resultSet.next()) {
					System.out.println("Tenet Name : "+resultSet.getString("Tenet_Name")+
							"\n Tenet Phone Number : "+resultSet.getString("Tenet_Phone")+
							"\n Tent Room Number : "+resultSet.getString("Tenet_Room")+
							"\n Date Rent paid : "+resultSet.getDate("Date") +
							"\n Rent : "+resultSet.getInt("Rent"));
				}

				break;
			case "C":
				System.out.println("Enter the Receipt ID to download : ");
				String uid = sc.next();
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/rent","root","");
				String SQL = "SELECT File FROM uuid WHERE UUID=?";
				pd=connection.prepareStatement(SQL);
				pd.setNString(1, uid);
				ResultSet rs = pd.executeQuery();

				File file = new File("C:\\Users\\eluma\\Desktop\\ReceiptFromDB.pdf");
				FileOutputStream fileOutputStream = new FileOutputStream(file);

				while(rs.next()) {
					InputStream inputStream = rs.getBinaryStream("File");
					byte[] buffer = new byte[1024];
					while(inputStream.read(buffer)>0) {
						fileOutputStream.write(buffer);
					}
				}
				System.out.println("Receipt Downloaded please check desktop file named ReceiptFromDB");
				break;
			}
			System.out.println("Do you want other activities type Yes/No");
			exitCheck=sc.next();
		}
		while(exitCheck.equalsIgnoreCase("yes"));
		System.out.println("THANK YOU");

		sc.close();

	}
}
