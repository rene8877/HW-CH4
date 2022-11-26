public class test_p25 {
    public static void main(String[] args) {
       proCar car1=new proCar();
       proCar car2=new proCar();
       proCar car3;
       car3 =car1;
       System.out.println("car1與car2相同"+car1.equals(car2));
       System.out.println("car1與car3相同"+car1.equals(car3));
    }
}
