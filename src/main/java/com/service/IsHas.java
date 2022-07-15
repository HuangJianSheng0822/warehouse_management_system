package com.service;

import com.dao.CommodityDao;
import com.dao.LoginDao;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Commodity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IsHas extends HttpServlet {
    CommodityDao commodityDao=new CommodityDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String comId = req.getParameter ("id");
        String has = commodityDao.getHas (comId);
        if (has==null){
            ObjectMapper objectMapper = new ObjectMapper ();
            resp.getWriter ().print (objectMapper.writeValueAsString ("no"));
        }else {
            ObjectMapper objectMapper = new ObjectMapper ();
            resp.getWriter ().print (objectMapper.writeValueAsString ("ok"));
        }

    }
}
