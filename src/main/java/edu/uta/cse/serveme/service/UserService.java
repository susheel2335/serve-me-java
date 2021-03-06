package edu.uta.cse.serveme.service;

import com.github.pagehelper.Page;
import edu.uta.cse.serveme.entity.User;
import edu.uta.cse.serveme.entity.UserInfo;

import java.util.Map;

/**
 * @author housirvip
 */
public interface UserService {
    /**
     * verify account and password, then return jwt token
     *
     * @param user User
     * @return String
     */
    String login(User user);

    /**
     * register a new account, then return jwt token
     *
     * @param user User
     * @return String
     */
    String register(User user);

    /**
     * select a user where equal param uid
     *
     * @param uid Integer
     * @return User
     */
    User oneById(Integer uid);

    /**
     * select a user where equal param uid
     *
     * @param uid Integer
     * @return User
     */
    User oneByIdWithInfo(Integer uid);

    /**
     * select user list where equal param pageDto
     *
     * @param pageNum int
     * @param pageSize int
     * @param params Map
     * @return Page
     */
    Page<User> pageByParam(int pageNum, int pageSize, Map<String, Object> params);

    /**
     * update user where equal param user
     *
     * @param user User
     * @return Integer
     */
    Integer update(User user);

    /**
     * update userInfo where equal param userInfo
     *
     * @param userInfo UserInfo
     * @return Integer
     */
    Integer updateInfo(UserInfo userInfo);
}
