package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File_test {
	static  Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
		File fin=new File("d:\\tice");
		File[] wjjh=fin.listFiles();
		System.out.println(wjjh.length);
		for (File file2 : wjjh) {
			System.out.println(file2);
			if(file2.getName().endsWith("xlsx")) {
				
			}
			else if(file2.getName().endsWith("xlsx")){
				
			}
		}
		
	}
	public static void dwj(File wjm) throws Exception{
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i = 1; i <rows; i++) {
			XSSFRow row=sheet.getRow(i);
			String xuehao=row.getCell(3).getStringCellValue();
			if(xuehao.equals("学号")) {
				continue;
			}
			//System.out.println(xuehao);
			String zuo=row.getCell(19).getStringCellValue();
			//System.out.println(zuo);
			String you=row.getCell(20).getStringCellValue();
			//System.out.println(you);
			if(zuo!=null && you!=null) {
				PreparedStatement ydy_yuju=lianjie.prepareStatement(""
						+ "UPDATE sheet1 SET `左眼裸眼视力`=?,`右眼裸眼视力`=? WHERE `学号`=?");
					ydy_yuju.setString(1, zuo);
					ydy_yuju.setString(2, you);
					ydy_yuju.setString(3, xuehao);
			}
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动获得连接连接对象
			Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
			//通过连接对象获得语句对象
			Statement yuju=lianjie.createStatement();
			//获得预定义语句
			PreparedStatement ydy_yuju=lianjie.prepareStatement(""
					+ "UPDATE sheet1 SET `左眼裸眼视力`=?,`右眼裸眼视力`=? WHERE `学号`=?");
				ydy_yuju.setString(1, zuo);
				ydy_yuju.setString(2, you);
				ydy_yuju.setString(3, xuehao);
	}
	}
}
