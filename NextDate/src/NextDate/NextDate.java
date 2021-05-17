package NextDate;
public class NextDate {
	//计算下一天时间

	public static String getNextDate(int year,int month,int day){
	String str;

	//年份必须在1812-2012内

	if(year < 1812 || year > 2012){
	return "年份必须为1812-2012中的一个整数";

	}

	//月份必须在1-12内

	if(month < 1 || month > 12){
	return "月份必须在1-12中的一个整数";

	}

	//日期必须在1-31内

	if(day < 1 || day > 31){
	return "日期必须为1-31中的一个整数";

	}

	//闰年

	if(leap(year)){
	if(month == 2){
	if(day<29){
	day++;

	}else{//day=29

	day = 1;

	month = 3;

	}

	str = "下一天是：" + year + "年" + month + "月" + day + "日";

	}else{
	str = getNormalNextDate(year,month,day);

	}

	}else{ //平年

	if(month ==2){
	if(day < 28){
	day++;

	}else {//day=28

	day = 1;

	month =3;

	}

	str = "下一天是：" + year + "年" + month + "月" + day + "日";

	}else{
	str = getNormalNextDate(year,month,day);

	}

	}

	return str;

	}

	public static boolean leap(int year){
	if(((year % 100 == 0) && (year % 400 ==0)) ||((year % 100 !=0) || (year % 4 ==0))){
	return true;

	}else{
	return false;

	}

	}

	public static String getNormalNextDate(int year,int month,int day){
	String str;

	switch(month){
	case 1:

	case 3:

	case 5:

	case 7:

	case 8:

	case 10:

	case 12:{
	if(month == 12 && day ==31){
	year++;

	month = 1;

	day = 1;

	}else if( day == 31){
	day = 1;

	month++;

	}else{
	day++;

	}

	}

	case 4:

	case 6:

	case 9:

	case 11:{
	if(day == 30){
	day = 1;

	month++;

	}else{
	day++;

	}

	}

	}

	str = "下一天是：" + year + "年" + month + "月" + day + "日";

	return str;

	}

	}

