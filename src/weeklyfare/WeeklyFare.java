package weeklyfare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WeeklyFare {
    public static void main(String[] args){
        try{
            loadData();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void loadData() {
        try{ 
            // opening file for getting data as input. 
            File f = new File("G:\\Netbeans Project\\WeeklyFare\\src\\weeklyfare\\fare.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            /// making list of fares of all users.
            ArrayList<Commuter> list = new ArrayList<>();
        
            Commuter c = new Commuter();
            // retrieving file starts here
            while(s!=null){
                String [] arr =s.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    switch(i){
                        // setting data for user in list.
                        case 0:{
                            c.setUser(Integer.parseInt(arr[i]));
                            break;
                        }
                        // setting data for monday fare in list.
                        case 1:{
                            c.setMon(Double.parseDouble(arr[i]));
                            break;
                        }
                        // setting data for tuesday fare in list.
                        case 2:{
                            c.setTue(Double.parseDouble(arr[i]));
                            break;
                        }
                        // setting data for wednesday fare in list.
                        case 3:{
                            c.setWed(Double.parseDouble(arr[i]));
                            break;
                        }
                        // setting data for thursday fare in list.
                        case 4:{
                            c.setThu(Double.parseDouble(arr[i]));
                            break;
                        }
                        // setting data for friday fare in list.
                        case 5:
                            c.setFri(Double.parseDouble(arr[i]));
                            break;
                        // setting data for saturday fare in list.    
                        case 6:
                            c.setSat(Double.parseDouble(arr[i]));
                            break;          
                    }
                }
                // adding every user in list.
                list.add(c);
                c=new Commuter();
                s= br.readLine(); 
            } 
            br.close();
            // getting input for sunday fare.
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < list.size(); i++) {
                // range of suday fare.
                double range =(63.2-list.get(i).getSum());
                if(range >0)
                    System.out.print("Enter Sunday fare for user "+(i+1)+" in range(0 to 2.7"+":");
                else
                    System.out.print("Enter Sunday fare for user "+(i+1)+" in range(0 to 0("+":");
                double d = sc.nextDouble();
                // if input is greater than range of sunday fare exit program.
                if(d> range ){
                    System.out.println("Invalid Input");
                    System.exit(0);
                }
                list.get(i).setSun(d);
            }
            // sorting list in descending  order.
            Collections.sort(list);
            // making file for saving output.
            f = new File("output.txt");
            FileWriter fw = new FileWriter(f);
            // writing header in  output file.
            fw.write("User\tMon\tTue\tWed\tThu\tFri\tSat\tSun\tTotal");
            System.out.println("User\tMon\tTue\tWed\tThu\tFri\tSat\tSun\tTotal");
            /// printing list and saving contents of fare list in output file.
            for(Commuter c2: list){
                System.out.println(c2);
                fw.write(c2.toString()+"\n");
            }
            fw.close();
            // end of writing.
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}
