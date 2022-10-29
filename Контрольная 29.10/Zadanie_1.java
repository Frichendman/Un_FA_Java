public class Zadanie_1 {

    public static class Reader{
        String name;
        int numb;
        String fkul;
        String date;
        String phone;

        public Reader(String name, int numb, String fkul, String date, String phone) {
            this.name = name;
            this.numb = numb;
            this.fkul = fkul;
            this.date = date;
            this.phone = phone;
        }


        public void takeBook(int k){
            System.out.println(this.name + " взял " + k + " книги.");
        }

        public void takeBook(String book){
            System.out.println(this.name + " взял книги: " + book);
        }

        public void takeBook(Book bk){
            System.out.println(this.name + " взял книги: " + bk.Name);
        }


        public void returnBook(int k){
            System.out.println(this.name + " вернул " + k + " книги.");
        }

        public void returnBook(String book){
            System.out.println(this.name + " вернул книги: " + book);
        }

        public void returnBook(Book bk){
            System.out.println(this.name + " вернул книги: " + bk.Name);
        }

        public static class Book{
            public String Name;
            public String author;

            public Book(String Name,String author){
                this.Name = Name;
                this.author = author;
            }
        }

    }



    public static void main(String[] args) {

        Reader r1 = new Reader("Пертров В.В",15,"ПИС","20-06-1995","89456567598");

        int kolvo = 3;
        String booklist = "Приключения, Словарь, Энциклопедия";

        //Reader.Book b1 = new Reader.Book("Приключения","Твен");
        //Reader.Book b2 = new Reader.Book("Словарь","Даль");
        //Reader.Book b3 = new Reader.Book("Энциклопедия","Навин");

        Reader.Book b1 = new Reader.Book("Приключения, Словарь ,Энциклопедия","Твен,Даль,Навин");

        r1.takeBook(kolvo);
        r1.takeBook(booklist);
        r1.takeBook(b1);
        r1.returnBook(kolvo);
        r1.returnBook(booklist);
        r1.returnBook(b1);
    }
}