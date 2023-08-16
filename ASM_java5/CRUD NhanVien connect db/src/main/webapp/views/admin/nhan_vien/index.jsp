<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>SD17313 - CRUD Cua Hang</title>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="f" uri="jakarta.tags.functions" %>
</head>
<body>
<a href="create">Thêm mới</a>
<table>
    <thead>
    <th>ID</th>
    <th>Mã</th>
    <th>Họ</th>
    <th>Tên đệm</th>
    <th>Tên</th>
    <th>Giới tính</th>
    <th>Ngày sinh</th>
    <th>Địa chỉ</th>
    <th>Sdt</th>
    <th>Mật khẩu</th>
    <th>Trạng thái</th>
    <th colspan="2">Thao tác</th>
    </thead>
    <tbody>
    <c:forEach items="${ data }" var="nv">
        <tr>
            <td>${ nv.id }</td>
            <td>${ nv.ma }</td>
            <td>${ nv.ho }</td>
            <td>${ nv.tenDem }</td>
            <td>${ nv.ten }</td>
            <td> <c:if test="${nv.gioiTinh == 'true'}">Nam</c:if>
                <c:if test="${nv.gioiTinh == 'false'}">Nữ</c:if></td>
            <td>${ nv.ngaySinh }</td>
            <td>${ nv.diaChi }</td>
            <td>${ nv.sdt }</td>
            <td>${ nv.matKhau }</td>
            <td> <c:if test="${nv.trangThai == '0'}">Đang làm</c:if>
                <c:if test="${nv.trangThai == '1'}">Đã nghỉ</c:if></td>
            <td>
            <td></td>
            <td>
            <td>
                <a href="/admin/nhan-vien/edit/${nv.id}">Cập nhật</a>
            </td>
            <td>
                <a href="/admin/nhan-vien/delete/${nv.id}">Xóa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>