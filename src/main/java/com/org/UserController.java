package com.org;

import Service.IUserService;
import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created by weixin on 17-8-27.
 */
@Controller
@RequestMapping("/user")
public class UserController {
//
    @Autowired
    public IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/Info",method = RequestMethod.POST)
    public String userInfo(HttpServletRequest request){
        return request.getPathInfo();
    }
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public String userlist(@RequestBody User user){
        return user.toString();
    }

    @ResponseBody
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestBody User user){

        String res=userService.login(user);
        if(res!=null){
            return "hello user";
        }
        else return null;
    }


//
//    @ResponseBody
//    @RequestMapping(value = "/friend/{id}/{name}",method = RequestMethod.GET)
//    public User friend(@PathVariable("id") String id,@PathVariable("name") String name){
//        User user=new User();
//        String uuid= UUID.randomUUID().toString();
//        user.setUid(uuid);
//        String uname="weixin";
//        user.setUname(uname);
//        return user;
//
//
//
//    }

}
