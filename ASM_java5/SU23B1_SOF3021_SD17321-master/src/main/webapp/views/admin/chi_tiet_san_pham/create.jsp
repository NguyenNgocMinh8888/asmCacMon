<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title></title>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous" />
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
<body>
<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">SD17321</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/admin/chi-tiet-san-pham/index">Chi tiết sản phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/chuc-vu/index">Chức vụ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/cua-hang/index">Cửa hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/dong-sp/index">Dóng sản phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/khach-hang/index">Khách hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/mau-sac/index">Màu sắc</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/nhan-vien/index">Nhân viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/NhaSX/index">Nhà sản xuất</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/san-pham/index">Sản phẩm</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<sf:form method="post" action="${action}" modelAttribute="ctsp">
    <div>
        <label>Sản phẩm</label>
        <sf:select path="sanPhamVM">
            <c:forEach items="${ dssp }" var="sp">
                <sf:option value="${sp.id}">${sp.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="sanPhamVM"/>
    </div>
    <div>
        <label>Nhà sản xuất</label>
        <sf:select path="nsxVM">
            <c:forEach items="${ dsnsx }" var="nsx">
                <sf:option value="${nsx.id}">${nsx.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="nsxVM"/>
    </div>
    <div>
        <label>Màu sắc</label>
        <sf:select path="mauSacVM">
            <c:forEach items="${ dsms }" var="ms">
                <sf:option value="${ms.id}">${ms.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="mauSacVM"/>
    </div>
    <div>
        <label>Dòng sản phẩm</label>
        <sf:select path="dongSPVM">
            <c:forEach items="${ dsdsp }" var="dsp">
                <sf:option value="${dsp.id}">${dsp.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="dongSPVM"/>
    </div>
    <div>
        <label>Năm bảo hành</label>
        <sf:input path="namBH" />
        <sf:errors Style="color:red" path="namBH" />
    </div>
    <div>
        <label>Mô tả</label>
        <sf:input path="moTa" />
        <sf:errors Style="color:red" path="moTa" />
    </div>
    <div>
        <label>Số lượng tồn</label>
        <sf:input path="soLuongTon" />
        <sf:errors Style="color:red" path="soLuongTon" />
    </div>
    <div>
        <label>Giá nhập</label>
        <sf:input path="giaNhap" />
        <sf:errors Style="color:red" path="giaNhap" />
    </div>
    <div>
        <label>Giá bán</label>
        <sf:input path="giaBan" />
        <sf:errors Style="color:red" path="giaBan" />
    </div>
    <button>Thêm mới</button>
</sf:form>

</body>


</html>