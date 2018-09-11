import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Student extends Borrower {

    private boolean liberaryMember;
    private Book book;
    private int noOfBooksIssued=0;
    private int noOfDays;
    private String name;
    private String sID;
    public Student(String name, String sID,int contact, boolean liberaryMember, Book book,int noOfBooksIssued,int noOfDays) {
//        super(name,id,contact);
        this.name = name;
        this.sID=sID;
        this.liberaryMember = liberaryMember;
        this.book = book;
        this.noOfBooksIssued=noOfBooksIssued;
        this.noOfDays=noOfDays;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public boolean isLiberaryMember() {
        return liberaryMember;
    }

    public void setLiberaryMember(boolean liberaryMember) {
        this.liberaryMember = liberaryMember;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNoOfBooksIssued() {
        return noOfBooksIssued;
    }

    public void setNoOfBooksIssued(int noOfBooksIssued) {
        this.noOfBooksIssued = noOfBooksIssued;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }


          File Student = new File("Student.txt");
        public void studuentFile() throws Exception{
            PrintStream printStream = new PrintStream(Student);
            FileWriter fileWriter = new FileWriter(Student, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
        }

    Scanner s = new Scanner(System.in);
    public Book bookIssue() throws Exception{
        if(liberaryMember){
            if(noOfBooksIssued == 0){
                System.out.println("Sorry We cannot Issue the Book!!");
            }
            else {
                PrintStream printStream = new PrintStream(Student);
                FileWriter fileWriter = new FileWriter(Student, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                Scanner scan = new Scanner(book.myFile);
                System.out.println("These Are Books Avilable In Our Liberary Student Class");
                while (scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                }
//                book.myFile
//                System.out.println();
//                File studentWithBook = new File("");
                System.out.println("Yes You Can issue this book!");
                System.out.println("Enter Your Name");
                name = s.nextLine();
                printStream.println("Student Name  :" + name);
                System.out.println("Enter Your ID!");
                sID = s.nextLine();
                printStream.println("Student ID     :" + sID);
                java.util.Date issueDate = new java.util.Date();
                printStream.println("Issue Date     :" + issueDate);
                System.out.println("Maximun No Of Day Are 7 So Returning Date would be");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar c = Calendar.getInstance();
                c.setTime(new Date()); // Now use today date.
                c.add(Calendar.DATE, -1); // Adding 7 days
                String output = sdf.format(c.getTime());
                System.out.println(output);
                printStream.println("Returning Date    :" + output);
                Date date = new Date();
                Date date1 = sdf.parse(output);
//how to implement return of book?

//how to delete a book from file?
                if(date.after(date1)){

                    int i=1;
                    System.out.println("After Due Date You Are Charged 10 Per Day");
                    int fare = 10 * i;
                    System.out.println(fare);
                    i++;
                }
                else{
                    System.out.println("You are not charged");
                }
            }
        }
        else {
            System.out.println("Sorry We Dont Lend Book To Out Siders!");
        }

        File returnedBooksOfStudent = new File("returnedBooks.txt");
        PrintStream printStream = new PrintStream(returnedBooksOfStudent);
        FileWriter fileWriter = new FileWriter(returnedBooksOfStudent , true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        System.out.println("If you Want to return book press 2!");
        int j = s.nextInt();

        if(j == 2){
//            System.out.println("Returned!!");
//                printStream.print(new Book("Intro To Java Prog","Y liang",12334,"Programming"));
            System.out.println("Book Name");
            String bName  = s.nextLine();
            System.out.println("Author Name");
            String authorName = s.nextLine();
            System.out.println("Isbn ..");
            int isbn =  s.nextInt();
            System.out.println("Genra ...");
            String genra = s.nextLine();
            printStream.print(bName+authorName+isbn+genra);
            return new Book(bName,authorName,isbn,genra);
        }
        else {
            System.out.println("Continue!!");
            return new Book();
        }
    }
//    public Book returnBook(){
//
//
//    }
}
