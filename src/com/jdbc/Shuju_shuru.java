package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shuju_shuru {
	static Connection lianjie = null;
	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获得连接连接对象
		lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
		File mulu = new File("d:\\tice");
		File[] files = mulu.listFiles();
		System.out.println("一共有" + files.length + "个文件");
		for (File file : files) {
			System.out.println(file);
			if (file.getName().endsWith("xls")) {
				read_and_write_to_xls(file);
			} else if (file.getName().endsWith("xlsx")) {
				read_and_write_to_xlsx(file);
			}
		}
	}

	private static void read_and_write_to_xlsx(File file) throws Exception {
		FileInputStream fin = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		for (int i = 1; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);
			String xuehao = row.getCell(3).getStringCellValue();
			if (xuehao.equals("学号")) {
				continue;
			}
			// System.out.println(xuehao);
			XSSFCell cell20=row.getCell(19);
			XSSFCell cell21=row.getCell(20);
			// System.out.println(zuo);
			
			// System.out.println(you);
			if (cell20 != null&&cell21 != null) {
				String zuo = cell20.getStringCellValue();
				String you = cell21.getStringCellValue();
				PreparedStatement ydy_yuju = lianjie
						.prepareStatement("" + "UPDATE sheet1 SET `左眼裸眼视力`=?,`右眼裸眼视力`=? WHERE `学号`=?");
				ydy_yuju.setString(1, zuo);
				ydy_yuju.setString(2, you);
				ydy_yuju.setString(3, xuehao);
				ydy_yuju.executeUpdate();
			}
		}
	}

	private static void read_and_write_to_xls(File file) throws Exception {
		FileInputStream fin = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fin);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		for (int i = 1; i < rows; i++) {
			HSSFRow row = sheet.getRow(i);
			String xuehao = row.getCell(3).getStringCellValue();
			if (xuehao.equals("学号")) {
				continue;
			}
			// System.out.println(xuehao);
			HSSFCell cell20=row.getCell(19);
			HSSFCell cell21=row.getCell(20);
			// System.out.println(zuo);
			// System.out.println(you);
			if (cell21 != null&&cell20 != null) {
				String zuo = cell20.getStringCellValue();
				String you = cell21.getStringCellValue();
				PreparedStatement ydy_yuju = lianjie.prepareStatement(
						"" + "UPDATE sheet1 SET `左眼裸眼视力`=?,`右眼裸眼视力`=? WHERE `学号`=?");
				ydy_yuju.setString(1, zuo);
				ydy_yuju.setString(2, you);
				ydy_yuju.setString(3, xuehao);
				ydy_yuju.executeUpdate();
			}
		}

	}
}
