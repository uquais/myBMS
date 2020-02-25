import eNums.location;

import java.util.Scanner;

public class myBms {
    static int choice1;

    public static void inventoryforLko(){
        System.out.println("Choose the theatre to show seats:");
        System.out.println("1. Regal_lko");
        System.out.println("2. Wave_lko");
        System.out.println("3. PVR_lko");
        try{
            Scanner s = new Scanner(System.in);
            choice1= s.nextInt();
        }catch (Exception e){
            System.out.println("you have not entered the right choice.... Thanks");
        }
        if (choice1==1){
            String stn;
            Theatre regal = new Theatre("Regal_lko",5,10);
            System.out.println("Welcome to"+regal.getTheatreName());
            regal.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            regal.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
        if (choice1==2){
            String stn;
            Theatre wave = new Theatre("Wave_lko",6,10);
            System.out.println("Welcome to "+wave.getTheatreName());
            wave.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            wave.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
        if (choice1==3){
            String stn;
            Theatre PVR = new Theatre("PVR_lko",8,10);
            System.out.println("Welcome to"+PVR.getTheatreName());
            PVR.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            PVR.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
    }
    public static void inventoryforDelhi(){
        System.out.println("Choose the theatre to show seats:");
        System.out.println("1. Regal_Delhi");
        System.out.println("2. Wave_Delhi");
        System.out.println("3. PVR_Delhi");
        try{
            Scanner s = new Scanner(System.in);
            choice1= s.nextInt();
        }catch (Exception e){
            System.out.println("you have not entered the right choice.... Thanks");
        }
        if (choice1==1){
            String stn;
            Theatre regal = new Theatre("Regal",5,10);
            System.out.println("Welcome to"+regal.getTheatreName());
            regal.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            regal.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
        if (choice1==2){
            String stn;
            Theatre wave = new Theatre("Wave",6,10);
            System.out.println("Welcome to "+wave.getTheatreName());
            wave.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            wave.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
        if (choice1==3){
            String stn;
            Theatre PVR = new Theatre("PVR",8,10);
            System.out.println("Welcome to "+PVR.getTheatreName());
            PVR.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            PVR.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
    }
    public static void inventoryforMumbai(){
        System.out.println("Choose the theatre to show seats:");
        System.out.println("1. Regal_Mumbai");
        System.out.println("2. Wave_Mumbai");
        System.out.println("3. PVR_Mumbai");
        try{
            Scanner s = new Scanner(System.in);
            choice1= s.nextInt();
        }catch (Exception e){
            System.out.println("you have not entered the right choice.... Thanks");
        }
        if (choice1==1){
            String stn;
            Theatre regal = new Theatre("Regal_Mumbai",5,10);
            System.out.println("Welcome to "+regal.getTheatreName());
            regal.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            regal.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
        if (choice1==2){
            String stn;
            Theatre wave = new Theatre("Wave_Mumbai",6,10);
            System.out.println("Welcome to "+wave.getTheatreName());
            wave.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            wave.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
        if (choice1==3){
            String stn;
            Theatre PVR = new Theatre("PVR_Mumbai",8,10);
            System.out.println("Welcome to "+PVR.getTheatreName());
            PVR.getSeats();
            System.out.println("Enter the seat number");
            Scanner s = new Scanner(System.in);
            stn=s.nextLine();
            PVR.reserveSeat(stn);
            System.out.println("Please proceed to pay");
        }
    }

    public static void main(String[] args) {
        int num=1;
        int choice=0;
        System.out.println("Select the city code:");

        for (location s : location.values()) {

            System.out.println(num+" "+s);
            num++;
        }
        try{
            Scanner s = new Scanner(System.in);
            choice= s.nextInt();

        }catch (Exception e){
            System.out.println("you have not entered the right choice.... Thanks");
        }

        if (choice==1){
            myBms.inventoryforDelhi();
        }
        if (choice==2){
            myBms.inventoryforLko();
        }
        if (choice==3){
            myBms.inventoryforMumbai();
        }
    }
}