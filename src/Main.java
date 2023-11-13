import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Appartment appartment1 = new Appartment("House", 30000, "Manasa");
        Appartment appartment2 = new Appartment("Vilo", 45000, "Magistral");
        Appartment[] appartments = {appartment1, appartment2};

        Student student1 = new Student("Keldibekova M", 500500514, "Magistral", 45000);
        Student student2 = new Student("Taalaubekova A", 500500555, "Magistral", 135000);
        Student student3 = new Student("Taichicov U", 503503503, "Manasa", 30000);
        Student student4 = new Student("Turumbekov J", 709664562, "Manasa", 60000);
        Student student5 = new Student("Tarielova A", 709674523, "Magistral", 90000);
        Student student6 = new Student("Egemberdiev B", 999600600, "Manasa", 120000);
        Student[] students = {student1, student2, student3, student4, student5, student6};
        Student[] manas = {student3,student4,student6};
        Student[] magistral = {student1,student2,student5};


        while (true) {
            System.out.println("1-Адрести жазыныз: ");
            System.out.println("2-Aдрес Манаста жашагандар канча толошу керек: ");
            System.out.println("3-Aдрес Магистралда жашагандар канча толошу керек: ");
            System.out.println("4-Адресс Манаста Канча ай жашай алышат: ");
            System.out.println("5-Адресс Магитралда Канча ай жашай алышат: ");
            System.out.println("6-Информация озгортуу: ");
            Scanner scanner1 = new Scanner(System.in);
            int a = scanner1.nextInt();

            switch (a){
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Адрести жазыныз: ");
                    int counter1 = 0;
                    int counter2 = 0;
                    String addr = scanner.nextLine();
                    for(Student stud : students){
                        if(stud.getAddress().equals(addr)){
                            System.out.println(stud.getFullName());
                            counter1++;
                        }else {
                            counter2++;
                        }
                    }
                    System.out.println("Counter1 :" + counter1 );
                    break;
                case 2:
                    for (Student staff : manas){
                        System.out.println(staff.getFullName());
                    }
                    System.out.println("Канчадан толошу керек: "+appartment1.pay(manas));
                    break;
                case 3:
                    for (Student staf : magistral){
                        System.out.println(staf.getFullName());
                    }
                    System.out.println("Канчадан толошу керек: "+appartment2.pay(magistral));
                    break;
                case 4:
                    System.out.println("Адресс Манаста Канча ай жашай алат: ");
                    student1.live(appartment1,manas);
                    break;
                case 5:
                    System.out.println("Адресс Магитралда Канча ай жашай алат: ");
                    student2.getLive(appartment2,magistral);
                    break;
                case 6:
                    System.out.println("Пишите имя студента которого вы хотите изменить(без ошибок): ");
                    Scanner scanner2 = new Scanner(System.in);
                    String name = scanner2.nextLine();
                    student1.change(name,students);


            }}}

}



