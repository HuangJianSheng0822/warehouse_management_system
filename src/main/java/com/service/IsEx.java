package com.service;

import com.dao.ExDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IsEx extends HttpServlet {
    ExDao exDao=new ExDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String comId = req.getParameter ("comId");
        String exNum = req.getParameter ("exNum");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date ();
        String s = format.format(date);
        boolean b = exDao.setEx (comId , s , Integer.valueOf (exNum));
        if (b){
            ObjectMapper objectMapper = new ObjectMapper ();
            resp.getWriter ().print (objectMapper.writeValueAsString ("no"));
        }
    }
}
