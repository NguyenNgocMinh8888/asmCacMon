package controllers.admin;

import domain_models.DongSP;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import repositories.DongSPRepository;
import view_model.QLDongSP;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

@WebServlet({
        "/dongSP/index",    // GET
        "/dongSP/create",   // GET
        "/dongSP/edit",     // GET
        "/dongSP/delete",   // GET
        "/dongSP/store",    // POST
        "/dongSP/update",   // POST
})
public class DongSPServlet extends HttpServlet {
    private DongSPRepository dspRepo;

    public DongSPServlet()
    {
        this.dspRepo = new DongSPRepository();

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
        DongSP dsp = this.dspRepo.findByMa(ma);
        request.setAttribute("dsp", dsp);
        request.getRequestDispatcher("/views/dongSP/edit.jsp")
                .forward(request, response);
    }

    protected void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        DongSP dsp = this.dspRepo.findByMa(ma);
        this.dspRepo.delete(dsp);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/dongSP/index");
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
            response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/dongSP/index");
            // 404
            // 405
        }
    }

    protected void create(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("view", "/views/dongSP/create.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    protected void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("danhSachDSP", this.dspRepo.findAll());
        request.setAttribute("view", "/views/dongSP/index.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    protected void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        try {
            DongSP domainModelDongSP = new DongSP();
            BeanUtils.populate(domainModelDongSP, request.getParameterMap());
            this.dspRepo.insert(domainModelDongSP);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/dongSP/index");
    }

    protected void update(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        try {
            String ma = request.getParameter("ma");
            DongSP domainModelDongSP = this.dspRepo.findByMa(ma);
            BeanUtils.populate(domainModelDongSP, request.getParameterMap());
            this.dspRepo.update(domainModelDongSP);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/dongSP/index");
    }
}
