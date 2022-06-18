package tugas5;

/**
 *
 * @author admin
 */
public class MainClass {
    public static void main (String[] args){
        CarRider ming = new CarRider("Lin Ming", 19, "08000000000");
        CarRider youhan = new CarRider("Sei Youhan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "081222222222");
        CarRider xiao = new CarRider("Xiaojun", 42, "081233333333");
        
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("Truck", "N 3333 AB", "Suzuki");
        data.addCar("Sedan", "N 4444 AB", "Mercedes Benz");
        
        data.listOfCar();
        
        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling,data.carList.get(1), 1);
        arsip.Rent(xiao, data.carList.get(2), 4);
        
        System.out.println();
        arsip.info();
    }
    
}
