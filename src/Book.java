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
        this.status = BookStatus.AVAILABLE;
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

    public double getPirce(){
        return this.price;
    }

    public BookStatus getBookStatus(){
        return this.status;
    }

    public void setBookId(String bookId){
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
        this.status = bookStatus;
    }

    public void printInfo(){
        System.out.println("bookId: " + bookId);
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: "+ price);
    }
}
