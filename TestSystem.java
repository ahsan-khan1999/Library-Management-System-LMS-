import java.io.*;

public class TestSystem {
    public static void main(String[] args) throws Exception{
        try {
            Book book = new Book("C HOw","Prog",2,"SA18","C how to prog","Y danial",1234,"Prog");
            Student student = new Student("Ali","FA17-BSCS-0061",02,true,new Book("C HOw","Prog",2,"SA18","C how to prog","Y danial",1234,"Prog"),1,7);
            Faculty faculty = new Faculty("ahsan",716,031,book);
//            faculty.isLendable();
            //        book.displayBooks();
            student.bookIssue();

}
        catch (Exception e){
            System.out.println("Enter Correct Type!");
        }
//        book.creationFile();
//        book.newDataEntry(/);/*
//        book.isLendable();
//        File Store = new F   ile("Store.txt");
//
//        PrintStream printStream = new PrintStream(Store);
//        FileWriter fileWriter = new FileWriter(Store,true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        PrintWriter printWriter = new PrintWriter(bufferedWriter);
//            Store.createNewFile();
//            System.out.println("The file has been created!!");
//printStream.print("dafefffewf" +
//        "wffwe");









//        File myFile = new File("MyFile.txt");
//
//
//
//        PrintStream stream = new PrintStream(myFile);
//        FileWriter fileWriter = new FileWriter(myFile, false);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        PrintWriter printWriter = new PrintWriter(bufferedWriter);
//
//        if(myFile.exists() == true){
//            System.out.println("created");
//        }
//        else{
//            myFile.createNewFile();
//
//        }
//
//        printWriter.append('a');
//    }









//    try{
//
//    Book books = new Book();
//    books.creationFile();
////    books.fileCreation();
////        books.newDataEntry();
//}
//catch (IOException i){
//    System.out.println();
//}

    }}

