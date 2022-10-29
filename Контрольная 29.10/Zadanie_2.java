public class Zadanie_2 {

    static class Car{
        private String color;
        private int maxspd;
        private String type;
        private int nowspd;
        private int price;


        public Car(String color,int maxspd,String type,int nowspd,int price){
            this.color = color;
            this.maxspd = maxspd;
            this.type = type;
            this.nowspd = nowspd;
            this.price = price;

        }

        public void start(){
            this.nowspd = 20;
        }

        public void stop(){
            this.nowspd = 0;
        }

        public void accelerate(int speed){
            this.nowspd += speed;
            if (this.nowspd > this.maxspd) {
                this.nowspd = this.maxspd;
            }
        }

        static class BMW extends Car{

            private Boolean Sub;
            private String Nms;

            public BMW(String color,int maxspd,String type,int nowspd,int price,Boolean Sub,String Nms){
                super(color, maxspd, type, nowspd, price);
                this.Sub = Sub;
                this.Nms = Nms;
            }

            public String getNms() {
                return Nms;
            }

            public void Subscribe(){
                if (this.Sub == Boolean.FALSE){
                    this.Sub = Boolean.TRUE;
                }
                else {
                    System.out.println("Уже есть подписка на БМВ");
                }
            }

        }

        static class Lada extends Car{

             private String old;
            private String Nms;

            public Lada(String color,int maxspd,String type,int nowspd,int price,String old,String Nms){
                super(color, maxspd, type, nowspd, price);
                this.old = old;
                this.Nms = Nms;
            }

            public String getNms() {
                return Nms;
            }

            public void older(){
                if (this.old == "new"){
                    this.old = "used";
                } else if (this.old == "used") {
                    this.old = "old";
                } else if (this.old == "old") {
                    this.old = "very old";
                } else{
                    System.out.println("Ваша машина слишком старая");
                }
            }
        }
    }


    public static class Garage{

        int max;
        String[] Crs;

        int[] kol;


        public Garage(int max,String[] Crs, int[] kol){
            this.max = max;
            this.Crs =Crs;
            this.kol = kol;
        }

        public void show() { // Сортировку не успел
            int i = 0;
            while (i < this.Crs.length) {
                System.out.println(this.Crs[i] + " в кол-во: " + this.kol[i]);
                i += 1;
            }
        }
    }



    public static void main(String[] args) {

        Car.BMW bmw = new Car.BMW("Black",140,"A",0,2000000, Boolean.FALSE,"BMW X4");
        Car.Lada lada = new Car.Lada("velvet",160,"M",0,1500000,"new","Kalina");

        bmw.start();
        bmw.accelerate(50);
        bmw.Subscribe();
        bmw.stop();

        lada.start();
        lada.accelerate(50);
        lada.older();
        lada.stop();

        String[] Cr = {bmw.getNms(),lada.getNms()};
        int[] kl = {6,7};
        Garage garage = new Garage(50,Cr,kl);

        garage.show();
    }
}