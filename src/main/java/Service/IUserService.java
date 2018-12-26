package Service;

import com.org.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by weixin on 17-8-28.
 */

@Component
public interface IUserService {
    public String login(User user);

}
