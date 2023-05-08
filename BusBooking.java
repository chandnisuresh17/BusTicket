package BusApp;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.Stream;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;;


interface  BusI {
    public void showBooking();
    public void showBuses();
    public void getBoardingDestination();
    public void getDate();
    List<String> busName = new ArrayList<>();
    List<Integer> busCost = new ArrayList<>();
    Stream<Integer> S = busCost.stream();

    // String[] bus={"A1 travels","Kallada"};
    int[] prices = {2354,1547};
    // Map<String,Integer> buses = new HashMap<>();
    // static Map <String,Integer> busSelected = new HashMap<>();
}
class Bus1 implements BusI{
    Scanner sc = new Scanner(System.in);
    String name;
    Date date;
    String age;
    String selectedBus1;
    String boarding;
    String destination;
    public void showBuses(){
        System.out.println("Available buses:");
        for(int i =0;i<bus.Name;i++){
            System.out.println((i+1)+ ")" +bus[i]+ "price:" + prices[i]);
        }
    }


    public void showBooking(){
        System.out.println("Passenger:" +this.name);
        System.out.println("Date:" +this.date);
        System.out.println("Age:" +this.age);
        System.out.println("Bus selected:" +this.selectedBus1);
        System.out.println("Boarding Station:" +this.boarding);
        System.out.println("Destination:" +this.destination);
        

    }

        public void getDate(){
            System.out.println("Date:");
            try{
                this.date = new Date(sc.next());
            }
            catch(Exception e){
                System.out.println("invalid date");
                return;
            }
        }


        @Override
        public void getBoardingDestination() {
            System.out.println("Enter Boarding Station");
            this.boarding=sc.next();
            System.out.println("Enter Destination");
            this.destination=sc.next();
        }
    
    }
    public class BusBooking extends Bus1{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int ch=2;
            Bus1 b = new Bus1();
            busNmae.add("A1 Travels");
            busName.add("Kallada");
            busCost.add(3427);
            busCost.add(5432);
            int avg=(S.reduce(0,(c,e) -> (c+e))/busCost.size());

            do{
                System.out.println("Bus App");
                System.out.println("Name:");
                b.name=sc.next();
                b.getBoardingDestination();
                b.getDate();
                b.showBooking();
                System.out.println("Enter Choice");
                int choice=sc.nextInt();
                b.selectedBus1=b.bus[choice-1];
                b.showBooking();
                // b.age=sc.nextInt();
                System.out.println("1)Book another ticket");
                System.out.println("2)Exit");
                System.out.println("Enter Choice");
                ch=sc.nextInt();


        }
        while(ch==1);
    }

}
        
    


