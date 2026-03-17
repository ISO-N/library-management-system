import java.util.Arrays;

public class User {
    String userId;
    String name;
    UserRole role;
    String [] borrowedBookIds;
    int borrowCount;

    public User(String userId, String name, String [] borrowedBookIds, int borrowCount) {
        this.userId = userId;
        this.name = name;
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
        return borrowedBookIds;
    }

    //设置借阅图书Id
    public void setBorrowedBookIds(String[] borrowedBookIds) {
        this.borrowedBookIds = borrowedBookIds;
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
