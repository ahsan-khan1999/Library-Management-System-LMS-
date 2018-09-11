import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Book extends Liberary_Items implements Lendable {

    private String bookName;
    private String autharName;
    private int iSBN;
    private String genra;

    public Book(){}

    public Book(String name, String type, int quantity, String id, String bookName, String autharName, int iSBN, String genra) {
        super(name, type, quantity, id);
        this.bookName = bookName;
        this.autharName = autharName;
        this.iSBN = iSBN;
        this.genra = genra;
//        this.myFile = myFile;
//        this.scanner = scanner;
    }

    public Book(String bookName , String autharName ,int iSBN , String genra){
        this.bookName=bookName;
        this.autharName=autharName;
        this.iSBN=iSBN;
        this.genra =genra;
    }

    File myFile = new File("myFile.txt");

    public void creationFile() throws IOException {
        PrintStream printStream = new PrintStream(myFile);
        FileWriter fileWriter = new FileWriter(myFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        if (myFile.exists() == true) {
            System.out.println("created");
            printStream.print("\nBook Name : Intro To Java Programming\n");
            printStream.print("\nAuthor Name : Y Danial Liang\n");
            printStream.print("\nISBN Number : 12345\n");
            printStream.print("\nGenra : Programming\n");
        } else {
            myFile.createNewFile();
            printStream.print("\nBook Name : Intro To Java Programming\n");
            printStream.print("\nAuthor Name : Y Danial Liang\n");
            printStream.print("\nISBN Number : 12345\n");
            printStream.print("\nGenra : Programming\n");

        }


    }

    Scanner scanner = new Scanner(System.in);

    public void newDataEntry() throws IOException {
//        System.out.println("Please Enter The Number Of Books You Want To Add!");
//        int numOfBooks = scanner.nextInt();
//        for (int i = 0; i <= numOfBooks; i++) {
        if (myFile.exists()) {
            PrintStream printStream = new PrintStream(myFile);
            FileWriter fileWriter = new FileWriter(myFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            System.out.println("\nEnter Name Of Book \n");

            bookName = scanner.nextLine();
//                flush();
            printStream.println("\nBook Name   :" + bookName);
            System.out.println("\nEnter Name Of Authar\n");
            autharName = scanner.nextLine();
            printStream.println("\nAuthar Name :" + autharName);
            System.out.println("\nEnter Genra  \n");
            genra = scanner.nextLine();
            printStream.println("\nGenra is    :" + genra);
            System.out.println("Enter ISBN  \n");
            iSBN = scanner.nextInt();
            printStream.println(iSBN);
            System.out.println("ISBN is " + iSBN);
            printStream.println("Identity      : 4728364");

        } else {
            creationFile();
        }

    }

    @Override
    public boolean isLendable() throws IOException {
//        String myString = "My Name Is Ahsan";
//        String delimtr = "a";
//
//        Scanner scanner = new Scanner(myFile);
        String line4 = Files.readAllLines(Paths.get("myFile.txt")).get(6);

        int castInt = Integer.parseInt(line4);
        System.out.println(castInt);
        if (this.iSBN == castInt) {
            System.out.println("Yes The Book Is Avilable");
            return true;
        } else {
            System.out.println("Book Is Not Avilable Now.");
            return false;
        }

//        String delimtr = "12345";
//        String[] myArray = line4.split(delimtr);
//        for(int i = 0 ; i <= myArray.length ; i++){
//
//            System.out.println(myArray[i]);
//
//        }
//        int [] tall = new int [100];
//        int i = 0;
//        while(scanner.hasNext()){
//            System.out.println(tall[i]);
//            tall[i++] = scanner.nextInt();
    }

//        int line4 = Files.readAllLines(Paths.get("myFile.txt")).get(7);
//        int line4 = Files.readAttributes()
//        System.out.println(line4);
//        if(this.iSBN = line4)

//            public void bookIssue() throws Exception{
//                if(isLendable()){
//
//                }


    //            }
    public void displayBooks() throws Exception{

        Scanner s = new Scanner(myFile);
        while (s.hasNext())
         {
            System.out.println(s.nextLine());
        }

    }

}