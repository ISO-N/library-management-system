import java.util.Arrays;

public class User {
    private String userId;
    private String name;
    private UserRole role;
    private String [] borrowedBookIds;
    private int borrowCount;

    public User(String userId, String name, UserRole role,String [] borrowedBookIds, int borrowCount) {
        this.userId = userId;
        this.name = name;
        this.role = role;
        this.borrowedBookIds = borrowedBookIds;
        this.borrowCount = borrowCount;
    }

    //获取UserId
    public String getUserId() {
        return userId;
    }

    //设置UserId
    public void setUserId(String userId) {
        this.userId = userId;
    }

    //获取name
    public String getName() {
        return name;
    }

    //设置name
    public void setName(String name) {
        this.name = name;
    }

    //获取用户角色
    public UserRole getRole() {
        return role;
    }

    //设置用户角色
    public void setRole(UserRole role) {
        this.role = role;
    }

    //获取借阅图书Id
    public String[] getBorrowedBookIds() {
        return borrowedBookIds;//返回数组
    }

    //设置借阅图书Id
    public void setBorrowedBookIds(String[] borrowedBookIds) {
        this.borrowedBookIds = borrowedBookIds;
    }

    //增加借阅图书Id
    public void updateBorrowedBookIds(String bookId) {
        setBorrowCount(getBorrowCount() + 1);//借阅数量加1
        borrowedBookIds[getBorrowCount()] = bookId;//把bookId存到borrowedBookIds数组最新的位置
    }

    //删除借阅图书Id
    public void deleteBorrowedBookIds(int i) {
        //删除不一定删除数组最新
        for (int j = i + 1; j < getBorrowCount(); j++ ){//删除i,后面往前移动
            borrowedBookIds[j - 1] = borrowedBookIds[j];
        }
        borrowedBookIds[getBorrowCount()] = null;//数组最后一位置空
//        borrowCount--;
        setBorrowCount(getBorrowCount() - 1);//借阅数量加1
    }

    //获取用户借阅次数
    public int getBorrowCount() {
        return borrowCount;
    }

    //设置借阅次数
    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    //打印信息
    public void printInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role.toString());
        System.out.println("Borrowed Book IDs: " + Arrays.toString(borrowedBookIds));
        System.out.println("Borrowed Count: " + borrowCount);
    }
}
