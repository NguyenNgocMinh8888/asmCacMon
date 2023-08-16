package controllers.admin;


import domain_models.NSX;
import domain_models.SanPham;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import repositories.NSXRepository;
import view_model.QLNSX;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet({
        "/nhaSX/index",    // GET
        "/nhaSX/create",   // GET
        "/nhaSX/edit",     // GET
        "/nhaSX/delete",   // GET
        "/nhaSX/store",    // POST
        "/nhaSX/update",   // POST
})
public class NSXServlet extends HttpServlet {
    private NSXRepository nsxRepo;

    public NSXServlet()
    {
        this.nsxRepo = new NSXRepository();
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
        NSX nsx = this.nsxRepo.findByMa(ma);
        request.setAttribute("nsx", nsx);
        request.getRequestDispatcher("/views/nsx/edit.jsp")
                .forward(request, response);
    }

    protected void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        NSX nsx = this.nsxRepo.findByMa(ma);
        this.nsxRepo.delete(nsx);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/nhaSX/index");
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
            response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/nhaSX/index");
            // 404
            // 405
        }
    }

    protected void create(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("view", "/views/nsx/create.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    protected void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("danhSachNSX", this.nsxRepo.findAll());
        request.setAttribute("view", "/views/nsx/index.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    protected void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        try {
            NSX domainModelNSX = new NSX();
            BeanUtils.populate(domainModelNSX, request.getParameterMap());
            this.nsxRepo.insert(domainModelNSX);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/nhaSX/index");
    }

    protected void update(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        try {
            String ma = request.getParameter("ma");
            NSX domainModelNSX = this.nsxRepo.findByMa(ma);
            BeanUtils.populate(domainModelNSX, request.getParameterMap());
            this.nsxRepo.update(domainModelNSX);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/nhaSX/index");
    }
}
