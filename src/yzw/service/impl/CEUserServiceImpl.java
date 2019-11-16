package yzw.service.impl;


import yzw.dao.CEUserDAO;
import yzw.dao.impl.CEUserDAOImpl;
import yzw.service.CEUserService;
import yzw.user.CE_USER;

import java.util.List;

public class CEUserServiceImpl implements CEUserService {
    private CEUserDAO userDAO = new CEUserDAOImpl();
    @Override
    public void addUser(CE_USER user) {
        userDAO.addUser(user);
    }

    @Override
    public void delUser(Integer id) {
        userDAO.delUser(id);
    }

    @Override
    public void updateUser(CE_USER user) {
        userDAO.updateUser(user);
    }

    @Override
    public CE_USER getUserById(Integer id) {
        return userDAO.getUserById(id);
    }

    @Override
    public List<CE_USER> queryUser() {
        return userDAO.queryUser();
    }

    @Override
    public CE_USER getUserByUnameAndPassword(String username, String password) {
        return userDAO.getUserByUnameAndPassword(username,password);
    }
}
