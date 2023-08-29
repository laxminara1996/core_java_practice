package in.lakshmi;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class DateConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Date dt = new Date();

 SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
 String format = sdf.format(dt);
 System.out.println(format);
//the problem is every time we have to convertion line of code like above ,to over come this use 8 version providing default classes
 
 
 //java.time.LocalDate,java.time.LocalTime,java.time.LocalDateTime,duration,period
 
 LocalDate ld =  LocalDate.of(2022,1,20);
 System.out.println(ld);
 
 LocalDate date = LocalDate.now();
 System.out.println(date);
 
 date = date.plusDays(2);
 System.out.println(date);
 date = date.plusMonths(2);
 System.out.println(date);
 date = date.plusYears(1);
 System.out.println(date);
 boolean leapYear = LocalDate.parse("2020-12-20").isLeapYear();
 System.out.println(leapYear);
 
 boolean before = (LocalDate.parse("2020-12-20")).isBefore(LocalDate.parse("2022-12-29"));
 System.out.println(before);
 LocalTime lt =  LocalTime.now();
 System.out.println(lt);
 lt = lt.plusHours(2);
 System.out.println(lt);
 LocalDateTime ldt = LocalDateTime.now();
 System.out.println(ldt);
 Period p = Period.between(LocalDate.parse("2021-11-23"), LocalDate.now());
 System.out.println(p);
 	Duration d =Duration.between(LocalTime.parse("16:00"), LocalTime.now());
 	System.out.println(d);
 



	}

}
