package controllers.admin;

import domain_models.HoaDon;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import repositories.HoaDonRepository;
import view_model.QLHoaDon;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

@WebServlet({
        "/hoa-don/index",    // GET
        "/hoa-don/create",   // GET
        "/hoa-don/edit",     // GET
        "/hoa-don/delete",   // GET
        "/hoa-don/store",    // POST
        "/hoa-don/update",   // POST
})
public class HoaDonServlet extends HttpServlet {
    private HoaDonRepository hdRepo;

    public HoaDonServlet()
    {
        this.hdRepo = new HoaDonRepository();
    }

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String uri = request.getRequestURI();

        if (uri.contains("create")) {
            this.create(request, response);
        } else if (uri.contains("edit")) {
            this.edit(request, response);
        } else if (uri.contains("delete")) {
            this.delete(request, response);
        } else {
            this.index(request, response);
        }
    }

    protected void edit(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        HoaDon hd = this.hdRepo.findByMa(ma);
        request.setAttribute("hd", hd);
        request.getRequestDispatcher("/views/hoa_don/edit.jsp")
                .forward(request, response);
    }

    protected void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        HoaDon hd = this.hdRepo.findByMa(ma);
        this.hdRepo.delete(hd);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/index");
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("store")) {
            this.store(request, response);
        } else if (uri.contains("update")) {
            this.update(request, response);
        } else {
            response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/index");
            // 404
            // 405
        }
    }

    protected void create(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("view", "/views/hoa_don/createHD.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    protected void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("danhSachHD", this.hdRepo.findAll());
        request.setAttribute("view", "/views/hoa_don/index.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    protected void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        try {
            HoaDon domainModelHoaDon = new HoaDon();
            BeanUtils.populate(domainModelHoaDon, request.getParameterMap());
            this.hdRepo.insert(domainModelHoaDon);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/index");
    }

    protected void update(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        try {
            String ma = request.getParameter("ma");
            HoaDon domainModelHoaDon = this.hdRepo.findByMa(ma);
            BeanUtils.populate(domainModelHoaDon, request.getParameterMap());
            this.hdRepo.update(domainModelHoaDon);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/index");
    }
}

