package api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.*;

public class E520 {

	public static void main(String[] args) throws ParseException {
		System.out.println(System.currentTimeMillis());
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis());
		Date date3=new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy��MM��dd�� HH:mm:ss E");
		System.out.println(sdf.format(date1));
		
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		System.out.println("������"+year+"��"+month+"��"+date+"��"+hour+"ʱ"+minute+"��"+second+"��");
		
		calendar.add(Calendar.DATE, 100);
		year=calendar.get(Calendar.YEAR);
		month=calendar.get(Calendar.MONTH)+1;
		date=calendar.get(Calendar.DATE);
		hour=calendar.get(Calendar.HOUR);
		minute=calendar.get(Calendar.MINUTE);
		second=calendar.get(Calendar.SECOND);
		System.out.println("100�����:"+year+"��"+month+"��"+date+"��");
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		LocalDate localDate=LocalDate.now();
		Date date4=sdf1.parse(""+localDate.plusDays(100));
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy��M��d��");
		System.out.println("100�����:"+sdf2.format(date4));
		
		System.out.println("������"+Year.now()+"��");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM");
		Date date5=sdf3.parse(""+YearMonth.now());
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy��M��");
		System.out.println("��ǰ������:"+sdf4.format(date5));
		
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println("��ǰʱ��Ϊ��"+zoneId);
		
		Instant instant=Instant.now();
		System.out.println("��ȡUTCʱ���ĵ�ǰʱ�䣺"+instant);
	}
		
}
