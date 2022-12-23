import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Zadachn {

    public static class Zadacha{ //класс для задач
        int numb;
        String name;
        String cdate;
        String edate;
        String desc;

        public Zadacha(int numb,String name,String cdate, String desc){
            this.numb = numb;
            this.name = name;
            this.cdate = cdate;
            this.edate = null;
            this.desc = desc;
        }
    }

    public static class Zadachnik{

        Scanner in1;
        ArrayList<Zadacha> zadach;
        int k;
        String cdate;

        public Zadachnik(String cdate){
            this.zadach = new ArrayList<>();
            this.in1 = new Scanner(System.in);
            this.k = 1;
            this.cdate = cdate;

        }

        public void Menu(){ //главная функция которая связана со всеми действиями программы
            while (true) {
                System.out.print("Добро пожаловать в задачник для продолжения выберете одно из пунктов Меню\n 1. Создать задачу \n 2. Удалить задачу \n 3. Отредактировать вашу задачу \n 4. Показать описание задачи\n 5. Показать все задачи \n 6. Показать все выполненые задания \n 7. Показать все невыполненые задания \n 8. Изменить сегодняшнюю дату \n 9. Завершить работу\n");
                switch (this.in1.nextLine()) {
                    case "1" -> Create();
                    case "2" -> Delete();
                    case "3" -> Redact();
                    case "4" -> ShowDesc();
                    case "5" -> {
                        System.out.print("Вы хотите посмотреть задания на конкретное время? (1.Да/2.Нет)\n");
                        switch (this.in1.nextLine()) {
                            case "1" -> {
                                System.out.println("Напишите дату по которой вы желаете искать (YYYY:MM:DD)\n");
                                String date = in1.nextLine();
                                ShowAll(date);
                            }
                            case "2" -> ShowAll();
                        }
                    }
                    case "6" -> {
                        System.out.print("Вы хотите посмотреть задания на конкретное время? (1.Да/2.Нет)\n");
                        switch (this.in1.nextLine()) {
                            case "1" -> {
                                System.out.println("Напишите дату по которой вы желаете искать (YYYY:MM:DD)\n");
                                String date = in1.nextLine();
                                ShowDone(date);
                            }
                            case "2" -> ShowDone();
                        }
                    }
                    case "7" -> {
                        System.out.print("Вы хотите посмотреть задания на конкретное время? (1.Да/2.Нет)\n");
                        switch (this.in1.nextLine()) {
                            case "1" -> {
                                System.out.println("Напишите дату по которой вы желаете искать (YYYY:MM:DD)\n");
                                String date = in1.nextLine();
                                ShowNDone(date);
                            }
                            case "2" -> ShowNDone();
                        }
                    }
                    case "8" -> ChangeDate();
                    case "9" -> {
                        return;
                    }
                }
            }
        }

        public void Create(){//функция создания задач
            System.out.println("Создайте свою задачу:");
            System.out.println("Назовите свою задачу:");
            String name = this.in1.nextLine();
            System.out.println("Опешите вашу задачу:");
            String desc = this.in1.nextLine();
            this.zadach.add(new Zadacha(this.k, name, this.cdate, desc));
            System.out.println("Поздравляю вы создали задачу");
            this.k++;
        }

        public void Delete(){//функция удаления задач
            System.out.println("Назовите номер задачи которую вы хотите удалить:");
            int n = Integer.parseInt(in1.nextLine());
            this.zadach.remove(n-1);
            System.out.println("Поздравляю вы удалили задачу");
        }

        public void Redact(){ //функция изменения определённой информации в задании и отметка о выполнении задачи
            System.out.println("Назовите номер задачи которую вы хотите изменить:");
            int n = Integer.parseInt(in1.nextLine());
            Zadacha Zd = this.zadach.get(n-1);
            System.out.println("Выберете что вы хотите изменить: \n 1. Название задачи \n 2. Описание задачи \n 3. Выполнение задачи \n");
            switch (this.in1.nextLine()) {
                case "1" -> {
                    System.out.println("Напишите новое название:");
                    Zd.name = this.in1.nextLine();
                }
                case "2" -> {
                    System.out.println("Напишите новое Описание:");
                    Zd.desc = this.in1.nextLine();
                }
                case "3" -> {
                    Zd.edate = this.cdate;
                    System.out.println("Поздравляю вы выполнили задание!");
                }
            }
        }

        public void ShowDesc(){//функция показа всей иформации о задачи
            System.out.println("Назовите номер задачи информацию о которой вы хотите увидеть:");
            int n = Integer.parseInt(in1.nextLine());
            Zadacha Zd = this.zadach.get(n-1);
            int nu = Zd.numb;
            String nm = Zd.name;
            String cd = Zd.cdate;
            String ed = Zd.edate;
            String ds = Zd.desc;
            if (ed == null){
                ed = "Не выполнена";
            }
            System.out.println("Информация о задаче: \n Номер:" + nu + "\n Название:" + nm + "\n Дата создания:" + cd + "\n Дата выполнения:" + ed + "\n Описание:" + ds);
        }

        public void ShowAll() {//функция показа всех задач
            System.out.println("Список всех задач: \n");
            for (Zadacha Zn :this.zadach){
                System.out.println("Номер задачи: " + Zn.numb + " Имя задачи " + Zn.name + "\n");
            }
        }

        public void ShowDone(){ //функция показа выполненых задач
            System.out.println("Список всех выполненых задач: \n");
            for (Zadacha Zn :this.zadach){
                if(Zn.edate != null){
                    System.out.println("Номер задачи: " + Zn.numb + " Имя задачи " + Zn.name + "\n");
                }
            }
        }

        public void ShowNDone(){//функция показа невыполненых задач
            System.out.println("Список всех невыполненых задач задач: \n");
            for (Zadacha Zn :this.zadach){
                if(Zn.edate == null){
                    System.out.println("Номер задачи: " + Zn.numb + " Имя задачи " + Zn.name + "\n");
                }
            }
        }

        public void ShowAll(String cdate) { //функция показа всех задач по дате
            System.out.println("Выберете дату по которой вы хотите посмотреть задачи: \n 1. Дата создания \n 2.Дата выполнения");
            switch (this.in1.nextLine()) {
                case "1" -> {
                    System.out.println("Список всех задач: \n");
                    for (Zadacha Zn : this.zadach) {
                        if (Objects.equals(Zn.cdate, cdate)) {
                            System.out.println("Номер задачи: " + Zn.numb + " Имя задачи " + Zn.name + "\n");
                        }
                    }
                }
                case "2" -> {
                    System.out.println("Список всех задач: \n");
                    for (Zadacha Zn : this.zadach) {
                        if (Objects.equals(Zn.edate, cdate)) {
                            System.out.println("Номер задачи: " + Zn.numb + " Имя задачи " + Zn.name + "\n");
                        }
                    }
                }
            }
        }

        public void ShowDone(String cdate){//функция показа выполненых задач по дате
            System.out.println("Выберете дату по которой вы хотите посмотреть задачи: \n 1. Дата создания \n 2.Дата выполнения");
            switch (this.in1.nextLine()) {
                case "1" -> {
                    System.out.println("Список всех выполненых задач: \n");
                    for (Zadacha Zn : this.zadach) {
                        if (Zn.edate != null) {
                            if (Objects.equals(Zn.cdate, cdate)) {
                                System.out.println("Номер задачи: " + Zn.numb + " Имя задачи " + Zn.name + "\n");
                            }
                        }
                    }
                }
                case "2" -> {
                    System.out.println("Список всех задач: \n");
                    for (Zadacha Zn : this.zadach) {
                        if (Zn.edate != null) {
                            if (Zn.edate.equals(cdate)) {
                                System.out.println("Номер задачи: " + Zn.numb + " Имя задачи " + Zn.name + "\n");
                            }
                        }
                    }
                }
            }
        }

        public void ShowNDone(String cdate){ //функция показа невыполненых задач по дате (Поиск по выполненым задачам не работает т.к. их просто не существует)
            System.out.println("Выберете дату по которой вы хотите посмотреть задачи: \n 1. Дата создания \n 2.Дата выполнения");
            switch (this.in1.nextLine()) {
                case "1" -> {
                    System.out.println("Список всех выполненых задач: \n");
                    for (Zadacha Zn : this.zadach) {
                        if (Zn.edate == null) {
                            if (Objects.equals(Zn.cdate, cdate)) {
                                System.out.println("Номер задачи: " + Zn.numb + " Имя задачи " + Zn.name + "\n");
                            }
                        }
                    }
                }
                case "2" -> {
                    System.out.println("Список всех задач: \n");
                    //for (Zadacha Zn :this.zadach) {
                    //    if (Zn.edate == null) {
                    //        if (Zn.edate == e) {
                    //            System.out.println("Номер задачи:" + Zn.numb + "Имя задачи" + Zn.name + "\n");
                    //        }
                    //    }
                    //}
                    System.out.println("По данной выборке здесь быть ничего неможет");
                }
            }
        }

        public void ChangeDate(){ //функция изменения сегодняшней даты
            System.out.println("Предыдущая дата " + this.cdate);
            System.out.println("Введите новую сегодняшнюю дату (YYYY:MM:DD):");
            Scanner in = new Scanner(System.in);
            this.cdate = in.nextLine();
            System.out.println("Дата изменена");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Перед началом назовите сегодняшуюю дату (YYYY:MM:DD)");
        String cdate = in.nextLine();
        Zadachnik Z1 = new Zadachnik(cdate);
        Z1.Menu();
    }
}