public class test_p17 {
    public static void main(String[] args) {
       proCar cars[];
       cars = new proCar[2];
       cars[0] =new proCar();
       cars[0].setCar(1234,20.5);
       cars[1]=new proRacingCar();
       cars[1].setCar(4567,30.5);
       for(int i=0;i<cars.length;i++){
           cars[i].show();
       }
    }
}
