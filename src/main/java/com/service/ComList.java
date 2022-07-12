package com.service;

import com.dao.CommodityDao;
import com.pojo.Commodity;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComList extends HttpServlet {
    CommodityDao commodityDao=new CommodityDao ();
    @Override
    protected void doGet( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String page = req.getParameter ("page");
        String limit = req.getParameter ("limit");
        int pages = (int) Math.ceil(commodityDao.count () * 1.0 / Integer.valueOf(limit));
        resp.getWriter ().print (Json.setJson (pages+"",commodityDao.commodityList (Integer.valueOf(Integer.valueOf(page)-1)*Integer.valueOf(limit),
                Integer.valueOf(limit))));
    }
}
