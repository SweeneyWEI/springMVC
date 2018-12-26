package Service;

import Dao.UserDao;
import com.org.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by weixin on 17-8-28.
 */
@Service
public class UserService implements IUserService {

    public String login(User user) {
        String userid=user.getUid();
        String username=user.getUname();
        UserDao userDao=new UserDao();
        String nameInDB=userDao.finaPasswordByUid(userid);
        if(username.equals(nameInDB)){
            return "ok";
        }
        else return "fail";
    }
}
