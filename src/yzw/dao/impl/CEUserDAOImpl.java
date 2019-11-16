package yzw.dao.impl;


import yzw.ces.DBUtil;
import yzw.dao.CEUserDAO;
import yzw.user.CE_USER;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CEUserDAOImpl implements CEUserDAO {
    @Override
    public void addUser(CE_USER user) {
        String sql = "insert into ce_user(id,username,password,gender,birthday,address,sal,pic) values(USERSEQID.nextval,?,?,?,?,?,?,?)";

        PreparedStatement pstmt = null;
        try {
            pstmt = DBUtil.getPstmt(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getGender());
            pstmt.setDate(4, new java.sql.Date(user.getBirthday().getTime()));
            pstmt.setString(5, user.getAddress());
            pstmt.setBigDecimal(6, user.getSal());
            pstmt.setString(7,user.getPic());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResUpdate(pstmt);
        }
    }

    @Override
    public void delUser(Integer id) {
        String sql = "delete from ce_user where id=?";
        PreparedStatement pstmt = null;
        try {
            pstmt = DBUtil.getPstmt(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResUpdate(pstmt);
        }
    }

    @Override
    public void updateUser(CE_USER user) {
        String sql = "update ce_user set username=?,password=?,gender=?,birthday=?,address=?,sal=?,pic=? where id=?";
        PreparedStatement pstmt = null;
        try {
            pstmt = DBUtil.getPstmt(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getGender());
            pstmt.setDate(4, new java.sql.Date(user.getBirthday().getTime()));
            pstmt.setString(5, user.getAddress());
            pstmt.setBigDecimal(6, user.getSal());
            pstmt.setString(7, user.getPic());
            pstmt.setInt(8, user.getId());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResUpdate(pstmt);
        }
    }

    @Override
    public CE_USER getUserById(Integer id) {
        String sql = "select * from ce_user where id=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        CE_USER user = new CE_USER();
        try {
            pstmt = DBUtil.getPstmt(sql);
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            rs.next();
            String username = rs.getString("username");
            String password = rs.getString("password");
            Integer gender = rs.getInt("gender");
            Date birthday = rs.getDate("birthday");
            String address = rs.getString("address");
            BigDecimal sal = rs.getBigDecimal("sal");
            String pic = rs.getString("pic");

            user.setId(id);
            user.setUsername(username);
            user.setPassword(password);
            user.setGender(gender);
            user.setBirthday(birthday);
            user.setAddress(address);
            user.setSal(sal);
            user.setPic(pic);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeResQuery(rs);
        }

        return user;
    }

    @Override
    public List<CE_USER> queryUser() {
        String sql = "select * from ce_user order by id";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        //创建存储查询数据的集合
        List<CE_USER> ce_usersList = new ArrayList<CE_USER>();
        try {
            pstmt = DBUtil.getPstmt(sql);
            rs = pstmt.executeQuery();
            if (rs != null){
                while(rs.next()){
                    //获得查询数据
                    Integer id = rs.getInt("id");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    Integer gender = rs.getInt("gender");
                    Date birthday = rs.getDate("birthday");
                    String address = rs.getString("address");
                    BigDecimal sal = rs.getBigDecimal("sal");
                    String pic = rs.getString("pic");
                    //封装成user
                    CE_USER ce_user = new CE_USER();
                    ce_user.setId(id);
                    ce_user.setUsername(username);
                    ce_user.setPassword(password);
                    ce_user.setGender(gender);
                    ce_user.setBirthday(birthday);
                    ce_user.setAddress(address);
                    ce_user.setSal(sal);
                    ce_user.setPic(pic);
                    ce_usersList.add(ce_user);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.closeResQuery(rs);
        }

        return ce_usersList;
    }

    @Override
    public CE_USER getUserByUnameAndPassword(String username, String password) {
        String sql = "select * from ce_user where username=? and password=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        CE_USER user = new CE_USER();
        try {
            pstmt = DBUtil.getPstmt(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            if (rs.next()){
                Integer id = rs.getInt("id");
                Integer gender = rs.getInt("gender");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                BigDecimal sal = rs.getBigDecimal("sal");

                user.setId(id);
                user.setUsername(username);
                user.setPassword(password);
                user.setGender(gender);
                user.setBirthday(birthday);
                user.setAddress(address);
                user.setSal(sal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeResQuery(rs);
        }

        return user;
    }
}
