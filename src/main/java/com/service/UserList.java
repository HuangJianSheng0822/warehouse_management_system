package com.service;

import com.dao.CommodityDao;
import com.dao.UserDao;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserList extends HttpServlet {
    UserDao userDao=new UserDao ();
    @Override
    protected void doGet( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String page = req.getParameter ("page");
        String limit = req.getParameter ("limit");
        resp.getWriter ().print (Json.setJson (userDao.userList (Integer.valueOf(Integer.valueOf(page)-1)*Integer.valueOf(limit),
                Integer.valueOf(limit))));
    }
}
