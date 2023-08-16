<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>CRUD</title>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="f" uri="jakarta.tags.functions" %>
</head>
<body>
<a href="create">Thêm mới</a>
<table>
    <thead>
    <th>Mã</th>
    <th>ten</th>
    <th>ngay bat dau</th>
    <th>ngay ket thuc</th>
    <th>gia tri giam</th>
    <th>trang thai</th>
    <th>ten khach</th>
    <th colspan="2">Thao tác</th>
    </thead>
    <tbody>
    <c:forEach items="${ data }" var="pgg">
        <tr>
            <td>${ pgg.maPhieu }</td>
            <td>${ pgg.tenPhieu }</td>
            <td>${ pgg.ngayBatDau }</td>
            <td>${ pgg.ngayKetThuc }</td>
            <td>${ pgg.giaTriGiam }</td>
            <td>${ pgg.trangThai == "0" ? "Dang dien ra" : "Ket thuc" }</td>
            <td>${ pgg.khachHang.tenKhachHang }</td>


            <td>
            <td>
                <a href="/phieu-giam-gia/edit/${pgg.maPhieu}">Cập nhật</a>
            </td>
            <td>
                <a href="/phieu-giam-gia/delete/${pgg.maPhieu}">Xóa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>