package pub.ants.miaosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pub.ants.miaosha.entity.UserEntity;
import pub.ants.miaosha.redis.RedisService;
import pub.ants.miaosha.result.Result;
import pub.ants.miaosha.service.UserService;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.HttpServletRequest;

/**
 * @author magw
 * @version 1.0
 * @date 2020/1/1 下午12:01
 * @description: No Description
 */
@RestController
public class UserController {
    @Autowired
    RedisService redisService;

    @RequestMapping("/redis/get")
    public Result<Long> redisGet(){
        redisService.set("key1",12345l);
        return Result.success(redisService.get("key1",Long.class));
    }
    //测试用户模块操作
    @Autowired
    private UserService userService;
    @RequestMapping("getUser/{id}")
    public Result GetUser(@PathVariable int id){
        return Result.success(userService.Sel(id).toString());
    }

    //ThymeLeaf配置
    @GetMapping(value = "/test")
    public ModelAndView test(HttpServletRequest req) {
        // UserEntity userEntity = getCurrentUser(req);
        UserEntity user = new UserEntity();
        user.setLoginName("tom");
        user.setId(234);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("/user/show.html");
        return mv;
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }



}
