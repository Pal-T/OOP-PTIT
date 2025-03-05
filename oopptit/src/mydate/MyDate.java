/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mydate;

/**
 *
 * @author DELL
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        if(day>= 1 && day<= 31)
            this.day = day;
        else this.day = 1;
        if(month >=1 && month <= 12)
            this.month = month;
        else this.month = 1;
        if(year >=1)
            this.year = year;
        else this.year = 1;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>= 1 && day<= 31)
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >=1 && month <= 12)
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >=1)
            this.year = year;
    }

    @Override
    public String toString() {
        return "my date: " +day+"/"+month+"/"+year;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result  = prime * result +day;
        result  = prime * result + month;
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyDate other = (MyDate) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year)    {
            return false;
        }
        return true;
    }
    
    
    
    
}
