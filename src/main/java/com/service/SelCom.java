package com.service;

import com.dao.CommodityDao;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SelCom extends HttpServlet {
    CommodityDao commodityDao=new CommodityDao ();
    @Override
    protected void doGet( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String comName = req.getParameter ("comName");
        resp.getWriter ().print (Json.setJson (commodityDao.select (comName)));
//        resp.sendRedirect(req.getContextPath()+"/page/commodity.jsp");
    }
}