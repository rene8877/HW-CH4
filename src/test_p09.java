public class test_p09 {
    public static void main(String[] args) {
        proRacingCar rccar1;
        rccar1=new proRacingCar();
        rccar1.newShow();
    }
}
class proCar{
    protected int num;
    protected double gas;

    public proCar(){
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    public proCar(int n,double g){
        num =n;
        gas = g;
        System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
    }
    public void setCar(int n,double g){
        num =n;
        gas =g;
        System.out.println("將車號設為"+num+"，汽油量設為"+gas);
    }
    public void show(){
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
    public String toString(){
        String str="車號:"+num+",汽油量:"+gas;
        return str;
    }
}
class proRacingCar extends proCar{
    private int course;
    public proRacingCar(){
        course=0;
        System.out.println("生產了賽車");
    }
    public proRacingCar(int n,double g,int c){
        super(n,g);
        course =c;
        System.out.println("生產了編號為"+course+"的賽車");
    }
    public void setCourse(int c){
        course =c;
        System.out.println("將賽車編號設為"+course);
    }
    public void newShow(){
        System.out.println("賽車的車號是"+num);
        System.out.println("賽車編號是"+course);
        System.out.println("汽油量是"+gas);
    }
    public void show(){
        System.out.println("賽車的車號是"+num);
        System.out.println("賽車編號是"+course);
        System.out.println("汽油量是"+gas);
    }
}
