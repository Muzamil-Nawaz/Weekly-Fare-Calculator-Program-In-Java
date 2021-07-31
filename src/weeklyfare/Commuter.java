package weeklyfare;

import java.text.DecimalFormat;

public class Commuter implements Comparable{
    public int user;
    public double monFare;
    public double tueFare;
    public double wedFare;
    public double thuFare;
    public double friFare;
    public double satFare;
    public double sunFare;
    Commuter(){
        
    }
    //method for setting user value.
    public void setUser(int i){
        this.user = i;
    }
    //method for setting monday fare value.
    public void setMon(double m){
        this.monFare =m;
    }
    //method for setting tuesday fare value
    public void setTue(double m){
        this.tueFare =m;
    }
    //method for setting wednesday fare value
    public void setWed(double m){
        this.wedFare =m;
    }
    //method for setting thursday fare value
    public void setThu(double m){
        this.thuFare =m;
    }
    //method for setting friday fare value
    public void setFri(double m){
        this.friFare =m;
    }
    //method for setting saturday fare value
    public void setSat(double m){
        this.satFare =m;
    }
    //method for setting sunday fare value
    public void setSun(double m){
        this.sunFare =m;
    }
    //method for getting user fare value
    public int getUser(){
        return user;
    }
    //method for getting monday fare value
    public double getMon(){
        return monFare;
    }
    //method for getting tuesday fare value
    public double getTue(){
        return tueFare;
    }
    //method for getting wednesday fare value
    public double getWed(){
        return wedFare;
    }
    //method for getting thursday fare value
    public double getThu(){
        return thuFare;
    }
    //method for getting friday fare value
    public double getFri(){
        return friFare;
    }
    //method for getting satday fare value
    public double getSat(){
        return satFare;
    }
    //method for getting sunday fare value
    public double getSun(){
        return sunFare;
    }
    //method for getting sum of all fare from mon to sat.
    public double getSum(){
        return Math.round((monFare+tueFare+wedFare+thuFare+friFare+satFare)*100.0000)/100.0000;
    }
    //method for getting total week  fares.
    public double getTotalFare(){
        return Math.round((monFare+tueFare+wedFare+thuFare+friFare+satFare+sunFare)*100.0000)/100.0000;
    }
    // method for printing a object of commuter class.
    public String toString(){
        return "[Monday:"+monFare+",Tuesday:"+tueFare+",Wednesday:"+wedFare+",Thursday:"+thuFare+",Friday:"+friFare+",Saturday:"+satFare+",Sunday:"+sunFare+","+getTotalFare()+"]";
    }
    // method for sorting list.
    public int compareTo(Object t) {
        int compareTotal=(int)((Commuter)t).getTotalFare();
        return compareTotal-(int)this.getTotalFare();
    }
}
