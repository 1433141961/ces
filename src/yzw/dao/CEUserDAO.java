package yzw.dao;


import yzw.user.CE_USER;

import java.util.List;

public interface CEUserDAO {
    public void  addUser(CE_USER user);

    public void delUser(Integer id);

    public void updateUser(CE_USER user);

    public CE_USER getUserById(Integer id);

    public List<CE_USER> queryUser();

    public CE_USER getUserByUnameAndPassword(String username,String password);

}
