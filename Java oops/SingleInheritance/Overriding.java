public class Overriding {

    public void show(){
        System.out.println("hello");
    }

    public void show(int a){
        System.out.println("hii hello");
    }
    public static void main(String[] args) {
        Override override=new Overriding();
        override.show();

    }
}
