package contructor;

public class Constructor_Lrn {

    public static void main(String[] args) {
Constructor_Lrn in =new Constructor_Lrn();
    }
public  Constructor_Lrn(){
    System.out.println("kniknknkn");

}
public static class mbl{
    String ab;
    public static void main(String[] args) {
       mbl in =new mbl("Tomal",31,5.8) ;
       mbl into =new mbl(828533112,"dhaka");
       mbl init =new mbl("Bangladesh","QA Engineer");
       mbl initial = new mbl("alpha");
    }
        public mbl(String name,int age,double height){
            System.out.println("Name-"+name);
            System.out.println("Age-"+age);
            System.out.println("Height-"+height);

        }
public mbl(int phnNumb,String city){
    System.out.println("Phone number-"+phnNumb);
    System.out.println("City-"+city);
}
public mbl(String country,String profession){
    System.out.println("Country -"+country);
    System.out.println("Profession-"+profession);
}
public mbl(String alpha){
        this.ab=alpha;
    System.out.println("name-"+this.ab);

}


}


}
