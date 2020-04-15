package cn.ekgc.dubbo.dao;

import cn.ekgc.dubbo.model.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
	List<User> findUserByQueryForPage(Map<String, Object> paramMap)throws Exception;
}
