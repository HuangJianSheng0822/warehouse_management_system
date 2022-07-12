package com.service;

import com.dao.UserDao;
import com.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateUser extends HttpServlet {
    UserDao userDao=new UserDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String userId = req.getParameter ("userId");
        String userName = req.getParameter ("userName");
        String userSex = req.getParameter ("userSex");
        int i = userDao.updateUser (new User (userId , userName , userSex));
        resp.sendRedirect(req.getContextPath()+"/page/user.jsp");
    }
}
