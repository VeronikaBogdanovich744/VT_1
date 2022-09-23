package BookTasks;

import BookTasks.Book;

public class Task12 {

    public static void main(String[] args) {
        var book1 = new Book();
        book1.createValues("123","456",1);
        System.out.println("Book1\n"+book1.toString());
        System.out.println(book1.hashCode());

        var book2 = new Book();
        book2.createValues("123","456",2);
        System.out.println("Book2\n"+book1.toString());
        System.out.println(book2.hashCode());
        printResult(book1.equals(book2));

        book2.createValues("1234","456",3);
        System.out.println("Book2\n"+book1.toString());
        printResult(book1.equals(book2));

        printResult(book1.equals(8));


    }

    private static void printResult(boolean bool){
        if(bool){
            System.out.println("Objects are equal");
        }else{
            System.out.println("Objects are not equal");
        }
    }
}
/*
class BookTasks.Book {
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;

    public void createValues(String title,String author){
        this.title = title;
        this.author=author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        BookTasks.Book object = (BookTasks.Book)obj;

        if(object.title==this.title && object.author==this.author &&
                object.price==this.price && object.edition==this.edition)
        return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + ((title == null) ? 0 :title.hashCode());
        result = 31 * result + ((author == null) ? 0 :author.hashCode());
        result = 31 * result + price;
        result = 31 * result + edition;
        return result;
    }

    @Override
    public String toString() {
        String result = "Title: " + title.toString() +"\n";
        result+= "Author: " + author.toString() +"\n";
        result+= "Price: " + price +"\n";
        result+= "Edition: " + edition +"\n";
        return result;
    }
    @Override
    public Object clone()
    {
        BookTasks.Book book = new BookTasks.Book();
        book.title = this.title;
        book.author = this.author;
        book.price = this.price;
        book.edition = this.edition;
        return book;
    }


}
*/
