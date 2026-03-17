
public class BorrowManager {
    final UserManager userManager;
    private BookManager bookManager;
    private Book book;
    private User user;


    public BorrowManager(UserManager userManager) {
        this.userManager = userManager;
    }


    //借书
    public void borrowBook(String userId, String bookId) {

        if (userManager.findUserById(userId) == null) {//检查用户是否存在
            return;
        }
        if (bookManager.findBookById(bookId) == null) {//查阅图书是否存在
            return;
        }
        if (book.getBookStatus() == BookStatus.AVAILABLE) {//检查图书状态
            System.out.println("图书可被借阅");
        }else if(book.getBookStatus() == BookStatus.BORROWED) {
            System.out.println("图书已被借阅");
            return;
        }else{
            System.out.println("图书已丢失");
            return;
        }
        if (user.getBorrowCount() == 5){//检查用户借阅数是否达到上限
            System.out.println("借阅数量已达5本上限");
            return;
        }
        book.setBookStatus(BookStatus.BORROWED);//修改图书状态
        user.updateBorrowedBookIds(bookId);//把新的图书Id加进借阅图书Id数组去
    }

    //还书
    public void returnBook(String userId, String bookId) {
        // 获取用户借的书
        String[] borrowedBooks = user.getBorrowedBookIds();
        for (int i = 0; i < user.getBorrowCount(); i++ ){//遍历数组检查用户是否借了书
            if (borrowedBooks[i].equals(bookId)){
                System.out.println("本用户已借阅该书");
                user.deleteBorrowedBookIds(i);//传入数组位置i和bookId
                book.setBookStatus(BookStatus.AVAILABLE);//修改图书状态
                return;
            }
        }
        System.out.println("用户未借阅该书");
    }

    //打印某用户借阅详情
    public void printUserBorrowInfo(String userId) {
        user.printInfo();
    }
}
