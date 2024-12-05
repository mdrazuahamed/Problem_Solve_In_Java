package org.example.problem;

public class MilitaryFormatTimeConversion {
    public String str;

    public static void main(String[] args) {
        MilitaryFormatTimeConversion militaryFormatTimeConversion = new MilitaryFormatTimeConversion();
        System.out.println(militaryFormatTimeConversion.convertMilitaryFormat("12:06:59PM"));
    }
    public String convertMilitaryFormat(String time) {
        if(time.substring(0,2).equals("12") && time.contains("AM")) {
            return "00"+time.substring(2,time.length()-2);
        }
        if(!time.substring(0,1).equals("12") && time.contains("PM")) {
            str = Integer.toString(Integer.parseInt(time.substring(0, 2)) + 12);
            return str + time.substring(2, time.length() - 2);
        }
        else
        return time.substring(0, time.length() - 2);
    }
}
