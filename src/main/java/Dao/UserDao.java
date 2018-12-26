package Dao;

import com.org.User;

/**
 * Created by weixin on 17-8-28.
 */
public class UserDao {
    public String finaPasswordByUid(String uid){
        User user=new User();
        user.setUid(uid);
        String uname=user.getUid();
        return uname;
    }
}
