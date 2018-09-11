import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Faculty extends Borrower {
    private String  name;
    private int id;
    private int contact;
    private int quantity;
    private Book book;

    public Faculty(String name, int id, int contact, Book book) {
//        super(name, id, contact);
        this.name=name;
        this.id=id;
        this.contact=contact;
        this.book = book;
    }
    Scanner s = new Scanner(System.in);

//    @Override
//    public boolean isLendable(){
//        if (quantity < 5){
//            System.out.println("Sorry You Cannot Lend More Books");
//            lendBook();
//            return false;
//        }
//        else{
////            throw lendBook();
//            throw  new IOException();
//            return true;
//        }
//    }
    public Book lendBook() throws Exception{
        File facultyWithBook = new File("facultyWithBook");
        if(quantity > 5){
            System.out.println("Sorry We Cannot Lend Book To You");

        }

        else{
            System.out.println("These Are Books Avilable In Our Liberary!!Facullty Class");
//            String bTittle = s.nextLine();
            Scanner scan = new Scanner(book.myFile);
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
            PrintStream printStream = new PrintStream(facultyWithBook);
            FileWriter fileWriter = new FileWriter(facultyWithBook , true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            System.out.println("If you want to lend tis book press 1");
            int i = s.nextInt();
//            System.out.println("\nABCD\n");

            if(i == 1){
                System.out.println("\nEnter Id\n");
                id = s.nextInt();
                printStream.println("Id is :"+id);

                System.out.println("Enter Your Name\n\n");
                name = s.next();
                printStream.println("Faculty Name is :"+name);
//                printStream.println(scan.nextLine());
                System.out.println("you can lend this book for a semester");

                java.util.Date issueDate = new java.util.Date();
                printStream.println("Issue Date     :" + issueDate);
                System.out.println("Maximun No Of Day Are about 112 days So Returning Date would be");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar c = Calendar.getInstance();
                c.setTime(new Date()); // Now use today date.
                c.add(Calendar.DATE, 112); // Adding 7 days
                String output = sdf.format(c.getTime());
                System.out.println(output);
                printStream.println("Returning Date    :" + output);
                Date date = new Date();
                Date date1 = sdf.parse(output);
                }
                else{
                System.out.println("Enter Right Input!");
                lendBook();
            }
            }
            File returnedBooks = new File("returnedBooks.txt");
            PrintStream printStream = new PrintStream(returnedBooks);
            FileWriter fileWriter = new FileWriter(returnedBooks , true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            System.out.println("If you Want to return book press 2!");
            int j = s.nextInt();

            if(j == 2){
//                System.out.println("Returned!!");
//                printStream.print(new Book("Intro To Java Prog","Y liang",12334,"Programming"));
                System.out.println("Book Name");
                String bName  = s.nextLine();
                s.nextLine();
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

}
