<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>SD17321 - CRUD</title>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="f" uri="jakarta.tags.functions" %>
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
<a href="create">Thêm mới</a>
<table>
    <thead>
    <th>ID</th>
    <th>Mã</th>
    <th>Tên</th>
    <th colspan="2">Thao tác</th>
    </thead>
    <tbody>
    <c:forEach items="${ data }" var="nsx">
        <tr>
            <td>${ nsx.id }</td>
            <td>${ nsx.ma }</td>
            <td>${ nsx.ten }</td>
            <td>
                <a href="/admin/NhaSX/edit/${nsx.id}">Cập nhật</a>
            </td>
            <td>
                <a href="/admin/NhaSX/delete/${nsx.id}">Xóa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>