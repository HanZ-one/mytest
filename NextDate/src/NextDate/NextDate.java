package NextDate;
public class NextDate {
	//������һ��ʱ��

	public static String getNextDate(int year,int month,int day){
	String str;

	//��ݱ�����1812-2012��

	if(year < 1812 || year > 2012){
	return "��ݱ���Ϊ1812-2012�е�һ������";

	}

	//�·ݱ�����1-12��

	if(month < 1 || month > 12){
	return "�·ݱ�����1-12�е�һ������";

	}

	//���ڱ�����1-31��

	if(day < 1 || day > 31){
	return "���ڱ���Ϊ1-31�е�һ������";

	}

	//����

	if(leap(year)){
	if(month == 2){
	if(day<29){
	day++;

	}else{//day=29

	day = 1;

	month = 3;

	}

	str = "��һ���ǣ�" + year + "��" + month + "��" + day + "��";

	}else{
	str = getNormalNextDate(year,month,day);

	}

	}else{ //ƽ��

	if(month ==2){
	if(day < 28){
	day++;

	}else {//day=28

	day = 1;

	month =3;

	}

	str = "��һ���ǣ�" + year + "��" + month + "��" + day + "��";

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

	str = "��һ���ǣ�" + year + "��" + month + "��" + day + "��";

	return str;

	}

	}

