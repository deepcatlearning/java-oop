public class MyDate {
    
int year;
int month;
int day;
int objectNumber;

public MyDate()
{
year = 1900;
month = 1;
day = 1;
objectNumber = objectCounter();
}

public MyDate(int aYear, int aMonth ,int aDay)
{
this.year = aYear;
this.month = aMonth;
this.day = aDay;
objectNumber = objectCounter();
}

public static int objectCounter()
{




return 0;
}

public static String[] strMonths()
{
String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

return months;
}

int getObjectNumber()
{
return objectNumber;    
}

void setDate (int aYear, int aMonth, int aDay)
{
year = aYear;
month = aMonth;
day = aDay;
}

void setYear(int aYear)
{
year = aYear;
}

void setMonth(int aMonth)
{
month = aMonth;
}

void setDay(int aDay)
{
day = aDay;
}

int getYear()
{
return year;
}

int getMonth()
{
return month;
}

int getDay()
{
return day;
}

public String toString()
{
return day+" "+month+" "+year;
}

boolean isLeapYear(int year)
{
    if(year%4 != 0)
    {
        return false;//not leap year
    }
    else if(year%100 != 0)
    {
        return true;//leap year
    }
    else if(year%400 != 0)
    {
        return false;//not leap year
    }
    else
    {
        return true;//leap year
    }
}

MyDate nextDay()
{
if(month == 12 && day == 31)
{
year += 1;
month = 1;
day = 1;
}
else
{
    if(month == 4 || month == 6 || month == 9 || month == 11)
    {
        if(day == 30)
        {
            month += 1;
            day = 1;
        }
        else
        {
            day += 1;
        }

    }
    else if(month != 2)
        {
            if(day == 31)
            {
                month +=1;
                day = 1;
            }
            else
            {
                day += 1;
            }
        }
    else
    {
        if(isLeapYear(year) == true && day == 29)
        {
            month += 1;
            day = 1;
        }
        else if(isLeapYear(year) == false && day == 28)
        {
            month += 1;
            day = 1;
        }
        else
        {
            day += 1;
        } 
    }
}
return this;
}

MyDate previousDay()
{
    if(month == 1 && day == 1)
    {
        year -=1;
        month = 12;
        day = 31;
    }
    else
    {
        if(month == 5 || month == 7 || month == 10 || month == 12)
        {
            if(day == 1)
            {
                month -= 1;
                day = 30;
            }
            else
            {
                day -= 1;
            }
        }
        else if(month != 3)
        {
            if(day == 1)
            {
                month -= 1;
                day = 31;
            }
            else
            {
                day -= 1;
            }
        }
        else
        {
            if(isLeapYear(year) == true && day == 1)
            {
                month -= 1;
                day = 29;
            }
            else if(day == 1)
            {
                month -= 1;
                day = 28;
            }
            else
            {
                day -= 1;
            }
        }
    }
return this;
}

MyDate nextYear()
{
if(month == 2 && day == 29)
{
day = 28;
year += 1;
}
return this;
}

MyDate previousYear()
{
if(month == 2 && day == 29)
{
day = 28;
year -= 1;
}
return this;
}

MyDate nextMonth()
{
if(month == 2 && (day == 28 || day == 29))
{
    month += 1;
}
return this;
}

}//end
