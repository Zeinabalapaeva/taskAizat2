import java.util.Scanner;

public class Student {




      private   String fullName;
      private   int phoneNumber;
     private    String address;
     private     int bank;


        public Student(String fullName,int phoneNumber,String address,int bank){
            this.fullName = fullName;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.bank = bank;
        }

        public void live(Appartment appartments,Student[] manas){
            int a = appartments.getCost();

            for(Student st : manas){
                int c = st.bank / a;
                System.out.println(c);
            }

        }
        public void getLive(Appartment appartments,Student[] magistral){
            int b = appartments.getCost();

            for(Student st : magistral){
                int a = st.bank / b;
                System.out.println(a);
            }
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public int getBank() {
            return bank;
        }

        public void setBank(int bank) {
            this.bank = bank;
        }

            public String getInfo() {
                return "Full name: " + getFullName() + " | Telephone: " + getPhoneNumber() + " | Address: " + getAddress() + " | Bank: " + getBank();
            }


            public void change(String name,Student[] students){
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            for (Student studd :students){
                if(name.equalsIgnoreCase(studd.getFullName())){
                    System.out.println("Пишите имя: ");
                    studd.setFullName(scanner.nextLine());
                    System.out.println("Пишите телефон номер: ");
                    studd.setPhoneNumber(scanner.nextInt());
                    System.out.println("Пишите адрес: ");
                    studd.setAddress(scanner1.nextLine());
                    System.out.println("Пишите сумму: ");
                    studd.setBank(scanner.nextInt());
                }
            }
            for (Student info : students){
                System.out.println(info.getInfo());
            }
        }

    }



