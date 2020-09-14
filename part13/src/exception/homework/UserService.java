package exception.homework;

//用户业务类，处理相关业务，登录注册等功能
public class UserService {

    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @throws IllegalNameException 用户名异常
     */
    public void register(String username,String password) throws IllegalNameException {
        /**
         * 引用null一般放在最前面，避免空指针异常
         */
        /*
        username==null不如null==username （防止少些=）
         */
        if(username==null || username.length()<6 || username.length()>14){
            throw new IllegalNameException("用户名不合法必须在【6-14】之间");

        }
        System.out.println("注册成功！，欢迎【"+username+"】");
    }
}
