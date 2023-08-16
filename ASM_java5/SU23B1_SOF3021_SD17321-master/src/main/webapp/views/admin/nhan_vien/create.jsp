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
<sf:form method="post" action="${action}" modelAttribute="nv">
    <DIV>
        <label>Mã</label>
        <sf:input path="ma"/>
                <sf:errors path="ma"/>
    </DIV>
    <DIV>
        <label>Họ</label>
        <sf:input path="ho"/>
        <sf:errors path="ho"/>
    </DIV>
    <DIV>
        <label>Tên Đệm</label>
        <sf:input path="tenDem"/>
        <sf:errors path="tenDem"/>
    </DIV>
    <DIV>
        <label>Tên</label>
        <sf:input path="ten"/>
        <sf:errors path="ten"/>
    </DIV>


    <DIV>
        <label>Giới tính</label>
        <sf:input path="gioiTinh"/>
        <sf:errors path="gioiTinh"/>
    </DIV>
    <DIV>
        <label>Ngày Sinh</label>
        <sf:input type="date" path="ngaySinh"/>
        <sf:errors path="ngaySinh"/>
    </DIV>
    <DIV>
        <label>Sdt</label>
        <sf:input path="sdt"/>
        <sf:errors path="sdt"/>
    </DIV>

    <DIV>
        <label>Địa Chỉ</label>
        <sf:input path="diaChi"/>
        <sf:errors path="diaChi"/>
    </DIV>
    <DIV>
        <label>Cửa hàng</label>
            <%--        <sf:input path="cuaHangVM"/>--%>
        <sf:select path="cuaHangVM">
            <c:forEach items="${ dsch }" var="ch">
                <sf:option value="${ch.id}">${ch.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="cuaHangVM"/>

    </DIV>
        <DIV>
            <label>Chức vụ</label>
            <sf:select path="chucVuVM">
                <c:forEach items="${ dscv }" var="cv">
                    <sf:option value="${cv.id}">${cv.ten}</sf:option>
                </c:forEach>
            </sf:select>
            <sf:errors path="chucVuVM"/>
        </DIV>


    <DIV>
        <label>Trạng thái</label>
        <sf:input path="trangThai"/>
        <sf:errors Style="color:red" path="trangThai"/>
    </DIV>
    <DIV>
        <label>Mật khẩu</label>
        <sf:input path="matKhau"/>
        <sf:errors Style="color:red" path="matKhau"/>
    </DIV>
    <button>Thêm mới</button>
</sf:form>

</body>


</html>