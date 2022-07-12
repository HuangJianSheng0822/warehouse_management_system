package com.service;

import com.dao.ExDao;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetEx  extends HttpServlet {
    ExDao exDao=new ExDao ();
    @Override
    protected void doGet( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String comId = req.getParameter ("comId");
        resp.getWriter ().print (Json.setJson (exDao.exList (comId)));
    }
}
