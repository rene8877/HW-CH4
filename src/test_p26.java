public class test_p26 {
    public static void main(String[] args) {
        proCar[] cars;
        cars=new proCar[2];
        cars[0]=new proCar();
        cars[1]=new proRacingCar();
        for(int i=0;i<cars.length;i++){
            Class cl = cars[i].getClass();
            System.out.println("第"+(i+1)+"個物件的類別是"+cl);
        }
    }
}
