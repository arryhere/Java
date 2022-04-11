//package com.company;
//
//interface Camera{
//    void takeSnap();
//    void takeVideo();
//    private void greet(){
//        System.out.println("Hello...");
//    }
//    default void take4kVideo(){
//        greet();
//        System.out.println("Recording in 4k");
//    }
//}
//
//interface Wifi{
//    String [] getNetworks();
//    void connectToNetwork(String network);
//}
//
//class CellPhone{
//    public void callNumber(int number){
//        System.out.println("Calling - "+number);
//    }
//    public void pickCall(){
//        System.out.println("Connecting...");
//    }
//}
//
//class SmartPhone extends CellPhone implements Camera,Wifi{
//
//    public void takeSnap(){
//        System.out.println("Taking a Snap");
//    }
//    public void takeVideo(){
//        System.out.println("Taking a Video");
//    }
////    public void take4kVideo(){
////        System.out.println("Taking a snap and recording Video in 4k");
////    }
//    public String [] getNetworks(){
//        System.out.println("Getting list of networks");
//        String [] networkList = {"node 1","node 69","node 33"};
//        return networkList;
//    }
//    public void connectToNetwork(String network){
//        System.out.println("Connecting to network - "+network);
//    }
//}
//
//public class ARRY_47_polymorphism {
//    public static void main(String[] args) {
//        Camera ns = new SmartPhone();
//        //ns.getNetworks(); // not valid
//        ns.take4kVideo();   // valid
//
//    }
//}

////-------------------------------------------------------------------------------------------------------------------------