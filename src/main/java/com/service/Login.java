package com.service;

import com.dao.LoginDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class Login extends HttpServlet {
    LoginDao loginDao=new LoginDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String id = req.getParameter ("id");
        String pwd = req.getParameter ("pwd");
            try {
                Object pwd1 = loginDao.adminLogin (id);
                if (pwd1!=null){
                    if (pwd.equals (pwd1)){
                        req.getSession ().setAttribute ("role","admin");
                        req.getSession ().setAttribute ("id",id);
                        ObjectMapper objectMapper = new ObjectMapper ();
                        resp.getWriter ().print (objectMapper.writeValueAsString ("admin"));
                    }else {
                        ObjectMapper objectMapper = new ObjectMapper ();
                        resp.getWriter ().print (objectMapper.writeValueAsString ("error"));
                    }
                }else {
                    ObjectMapper objectMapper = new ObjectMapper ();
                    resp.getWriter ().print (objectMapper.writeValueAsString ("error"));
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
    }
}
