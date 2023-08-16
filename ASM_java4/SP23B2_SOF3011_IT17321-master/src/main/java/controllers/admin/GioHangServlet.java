package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import view_model.QLGioHang;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet({
        "/gio-hang/index",    // GET
        "/gio-hang/create",   // GET
        "/gio-hang/edit",     // GET
        "/gio-hang/delete",   // GET
        "/gio-hang/store",    // POST
        "/gio-hang/update",   // POST
})
public class GioHangServlet extends HttpServlet {
    private ArrayList<QLGioHang> list = new ArrayList<>();
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        this.create(request, response);
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        this.store(request, response);
    }

    protected void create(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("view", "/views/gio_hang/create.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    protected void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
//        request.getRequestDispatcher("/views/cua_hang/index.jsp")
//                .forward(request, response);
    }

    protected void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ngay_tao = request.getParameter("ngay_tao");
        String ngay_thanh_toan = request.getParameter("ngay_thanh_toan");
        String ten_nguoi_nhan = request.getParameter("ten_nguoi_nhan");
        String dia_chi = request.getParameter("dia_chi");
        String sdt = request.getParameter("sdt");
        String tinh_trang = request.getParameter("tinh_trang");
        QLGioHang qlkh = new QLGioHang(ma,ngay_tao,ngay_thanh_toan,ten_nguoi_nhan,dia_chi,sdt,tinh_trang);

        list.add(qlkh);
    }
}

