package com.service;

import com.dao.CommodityDao;
import com.pojo.Commodity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateCom extends HttpServlet {
    CommodityDao commodityDao=new CommodityDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String comId = req.getParameter ("comId");
        String comName = req.getParameter ("comName");
        String comNum = req.getParameter ("comNum");
        String comKind = req.getParameter ("comKind");
        String fragile = req.getParameter ("fragile");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date ();
        String s = format.format(date);
        commodityDao.updateCom (new Commodity (comId,comName,comNum,comKind,fragile,s));
        resp.sendRedirect(req.getContextPath()+"/page/commodity.jsp");
    }
}
