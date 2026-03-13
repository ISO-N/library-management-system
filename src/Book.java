public class Book {
    String bookId;
    String title;
    String author;
    double price;
    BookStatus status;

    public Book(String bookId,String title,String author,double price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.status = AVAILABLE;
    }

    public String getBookId(){
        return this.bookId;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getPirce(){
        return this.price;
    }

    public BookStatus getBookStatus(){
        return this.BookStatus;
    }

    public void setBookId(Sring bookId){
        this.bookId = bookId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setBookStatus(BookStatus bookStatus)
    {
        this.bookStatus = bookStatus;
    }

    public void printInfo(){
        System.out.println("bookId: " + bookId);
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: "+ price);
    }
}
