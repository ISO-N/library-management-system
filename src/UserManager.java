public class UserManager {
    User[] users;
    int usersCount;
    public UserManager() {
        users = new User[50];
        usersCount = 0;
    }

    //添加用户
    public void addUser(User user) {
        users[usersCount++] = user;
    }

    //按ID删除用户
    public void removeUserById(String userId) {
        for (int i = 0; i < usersCount; i++) {
            if (users[i].getUserId().equals(userId)) {
                for (int j = i + 1; j < usersCount; j++) {
                    User tmp = users[j];
                    users[j - 1] = tmp;
                }
                usersCount--;
                return;
            }
        }
    }

    //按ID查找
    public String findUserById(String userId) {
        for (int i = 0; i < usersCount; i++) {
            if (users[i].getUserId().equals(userId)) {
                System.out.println("User ID: " + users[i].getUserId());
                return users[i].getUserId();
            }
        }
        System.out.println("未找到User ID");
        return null;
    }


    //打印所有用户
    public void printAllUsers() {
        for (int i = 0; i < usersCount; i++) {
            System.out.println(users[i]);
        }
    }

}
