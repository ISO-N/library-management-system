public class BookManager {
    Book[] books;
    int bookCount;

    public BookManager(){
        this.books = new Book[100];
        this.bookCount = 0;
    }

    public void addBook(Book book){
        books[bookCount++] = book;
        System.out.println("添加成功: " + book.getTitle());
    }

    public void removeBookById(String bookId){
        boolean flag = false;
        for(int i = 0;i<bookCount;i++){
            if(books[i].bookId == bookId){
                for(int j=i+1;j<bookCount;j++){
                    Book tmp = books[j];
                    books[j-1] = tmp;
                }
                flag = true;
                break;
            }
        }
        if(flag){
            bookCount--;
            System.out.println("删除成功：" + bookId);
        }else{
            System.out.println("删除失败！");
        }
    }

    public Book findBookById(String bookId){
        int i;
        boolean flag = false;
        for(i=0;i<bookCount;i++){
            if(books[i].bookId == bookId){
                flag = true;
                break;
            }
        }
        if(flag){
            return books[i];
        }else{
            return null;
        }
    }

    //TODO
    public findBookByTitle(String keyword){

    }

    public void printAllBooks(){
        for(int i = 1;i<=bookCount;i++){
            books[i-1].printInfo();
        }
    }
}
