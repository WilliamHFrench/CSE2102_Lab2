package com.softwareengineering.course;

public class CarRunner{

    public static void main(String[] args){
        Hybrid car = new Hybrid();

        car.setCostPerGallon(3.50);
        car.setCostPerkWh(0.24);

        double miles = 1000.0;
        car.setElectricMiles(miles);
        car.setMilesfromGas(miles);
        car.setGallonsfromGas(50.0);
        car.setTotalkWh(1000);

        double Electric_MPK = car.calcMPGe();
        double Gasoline_MPG = car.calcGasMPG();
        double Avg_Mpg = (Electric_MPK + Gasoline_MPG) / 2;

        System.out.println("MPG fully Gas: " + Gasoline_MPG);
        System.out.println("MPK fully Electric: " + Electric_MPK);
        System.out.println("Average MPG: " + Avg_Mpg);
        
    }

}