package com.jdbc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.PreparedStatement;

public class Shili {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i = 1; i <= rows; i++) {
			XSSFRow row=sheet.getRow(i);
			String xuehao=row.getCell(3).getStringCellValue();
			//System.out.println(xuehao);
			String zuo=row.getCell(15).getStringCellValue();
			//System.out.println(zuo);
			String you=row.getCell(16).getStringCellValue();
			//System.out.println(you);
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动获得连接连接对象
			Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
			//通过连接对象获得语句对象
			Statement yuju=lianjie.createStatement();
			//获得预定义语句
			java.sql.PreparedStatement ydy_yuju=lianjie.prepareStatement(""
					+ "UPDATE 18rj2 SET ``=?,``=? WHERE ``=?");
				ydy_yuju.setString(1, zuo);
				ydy_yuju.setString(2, you);
				ydy_yuju.setString(3, xuehao);
			//定义更新sql语句
			/*String sql="UPDATE 18rj2 SET `左眼裸眼视力`='"+zuo+"',`右眼裸眼视力`='"+you+"' WHERE `学号`= '"+xuehao+"'";
			System.out.println(sql);
			yuju.execute(sql);*/
		}
		

	}

}
