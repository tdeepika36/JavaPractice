package org.example;

class Report {
    boolean active;
    String message;
    Report(String message){
        this.message=message;
    }
    void turnOn()
    {
       active=true;
    }
    void turnOff(){
         active=false;
    }
    String getReport()
    {
        return getReport(false);
    }
    String getReport(boolean uppercase){
        if(active){
            if(uppercase)
                return message.toUpperCase();
            else
                return message;
        }
        else return " ";
    }
    void sendReport(){
        System.out.println(getReport(true));
    }
}
public class Alarm{
    public static void main(String args[]){
        Report obj=new Report("Temperature too High");
        obj.turnOn();
        obj.sendReport();
        PriorityAlarm sc=new PriorityAlarm("Temperature too low",6);
        int a=sc.setPriority();
        System.out.println(a);
    }
}

class PriorityAlarm extends Report{
    private final int priority;
    public PriorityAlarm(String message,int priority){
    super(message);
    this.priority=priority;
    }
    public int setPriority(){
        return priority;
    }
}
