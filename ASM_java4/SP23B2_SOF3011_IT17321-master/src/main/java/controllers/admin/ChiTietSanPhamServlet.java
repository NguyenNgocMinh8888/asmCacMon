package controllers.admin;

import domain_models.ChiTietSP;

import domain_models.NhanVien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import repositories.ChiTietSanPhamRepository;
import jakarta.servlet.http.HttpSession;
import view_model.QLChiTietSanPham;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

    @WebServlet({
            "/chi-tiet-san-pham/index",    // GET
            "/chi-tiet-san-pham/create",   // GET
            "/chi-tiet-san-pham/edit",     // GET
            "/chi-tiet-san-pham/delete",   // GET
            "/chi-tiet-san-pham/store",    // POST
            "/chi-tiet-san-pham/update",   // POST
    })
    public class ChiTietSanPhamServlet extends HttpServlet {
        private ChiTietSanPhamRepository ctspRepo;

        public ChiTietSanPhamServlet()
        {
            this.ctspRepo = new ChiTietSanPhamRepository();
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
                String moTa = request.getParameter("moTa");
            ChiTietSP ctsp = this.ctspRepo.findByMa(moTa);
            request.setAttribute("ctsp", ctsp);
            request.getRequestDispatcher("/views/chi_tiet_san_pham/edit.jsp")
                    .forward(request, response);
        }

        protected void delete(
                HttpServletRequest request,
                HttpServletResponse response
        ) throws ServletException, IOException {
            String moTa = request.getParameter("moTa");
            ChiTietSP ctsp = this.ctspRepo.findByMa(moTa);
            this.ctspRepo.delete(ctsp);
            response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/index");
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
                response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/index");
                // 404
                // 405
            }
//            HttpSession session = request.getSession();
//            ChiTietSP ctsp = (ChiTietSP) session.getAttribute("ctsp");
//
//            if (ctsp == null) {
//
//            }
//                response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/login");
////            } else {
////                chain.doFilter(request, response);
////            }
//////            if(request.getParameter("namBH") != null){
////                String namBH = request.getParameter("namBH");
////            } else {
////                request.setAttribute("CTSPERORR", "Khong dc de trong");
////            }
////
//            if(request.getParameter("namBaoHanh") == null){
//                String validate = "Trong cc";
//                String message  = request.getParameter("message");
//                request.setAttribute("validate",validate);
//            } else {
//                String validate = "Trong cc";
//                String message  = request.getParameter("message");
//                request.setAttribute("validate",validate);
//                HttpSession session = request.getSession();
//                session.setAttribute("CTSPERORR", "Khong dc de trong");
//                response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/create");

//            }

////            HttpSession session = request.getSession();
////            if (uri == null) {
////                session.setAttribute("CTSPERORR", "Snull");
////                response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/create");
////            } else {
////                session.setAttribute("uri", uri);
////                response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/khach-hang/index");
////            }
        }

        protected void create(
                HttpServletRequest request,
                HttpServletResponse response
        ) throws ServletException, IOException {
            request.setAttribute("view", "/views/chi_tiet_san_pham/create.jsp");
            request.getRequestDispatcher("/views/layout.jsp")
                    .forward(request, response);
        }

        protected void index(
                HttpServletRequest request,
                HttpServletResponse response
        ) throws ServletException, IOException {
            request.setAttribute("danhSachCTSP", this.ctspRepo.findAll());
            request.setAttribute("view", "/views/chi_tiet_san_pham/index.jsp");
            request.getRequestDispatcher("/views/layout.jsp")
                    .forward(request, response);
        }

        protected void store(
                HttpServletRequest request,
                HttpServletResponse response
        ) throws ServletException, IOException {
            try {
                ChiTietSP domainModelChiTietSanPham = new ChiTietSP();
                BeanUtils.populate(domainModelChiTietSanPham, request.getParameterMap());
                this.ctspRepo.insert(domainModelChiTietSanPham);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/index");
        }

        protected void update(
                HttpServletRequest request,
                HttpServletResponse response
        ) throws ServletException, IOException {
            try {
                String moTa = request.getParameter("moTa");
                ChiTietSP domainModelChiTietSP = this.ctspRepo.findByMa(moTa);
                BeanUtils.populate(domainModelChiTietSP, request.getParameterMap());
                this.ctspRepo.update(domainModelChiTietSP);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/index");
        }
//        protected void validate(
//                HttpServletRequest request,
//                HttpServletResponse responst)
//                throws ServletException, IOException {
//
//            if(request.getParameter("namBH") != null){
//                String nameParameter = request.getParameter("namBH");
//            } else {
//                HttpSession session = request.getSession();
//                session.setAttribute("CTSPERORR", "Khong dc de trong");
//                responst.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/create");
//            }
//
//            int ageParameter = Integer.parseInt(request.getParameter("soLuongTon"));
//
//
//
//        }
    }

