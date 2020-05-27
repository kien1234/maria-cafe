/*
* IntroductionControl.java
*
* All Right Reserved
* Copyright (c) 2019 FPT University
 */
package controler;

import dao.InformationDAO;
import dao.ShareDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Information;
import model.Share;

/**
 * IntroductionControl.<br>
 *
 * <pre>
 * Class IntroductionControl lấy dữ liệu từ database thông qua class ShareDAO, InformationDAO và đẩy dữ
 * liệu lên Introduction.jsp để hiển thị lên trình duyệt. Trong class này sẽ tiến hành
 * các xử lí dưới đây.
 *
 * . ProcessRequest.
 * . DoGet.
 * . DoPost.
 *
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class IntroductionControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ShareDAO shareDAO = new ShareDAO();
            // Lấy ra 1 list share từ database và lưu vào biến share
            List<Share> share = shareDAO.getShare();
            request.setAttribute("share", share);
            InformationDAO inforDAO = new InformationDAO();
            // Lấy ra 1 list information từ database và lưu vào biến infor
            Information infor = inforDAO.getInformation();
            request.setAttribute("infor", infor);
            //Đẩy dữ liệu lên Information.jsp
            request.getRequestDispatcher("Introduction.jsp").forward(request, response);
        } catch (IOException | SQLException ex) {
            request.setAttribute("error", ex.getMessage());
            //Đẩy dữ liệu lên error.jsp
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
