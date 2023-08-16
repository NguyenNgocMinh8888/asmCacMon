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
    <th>sdt</th>
    <th>gt</th>
    <th>hang</th>
    <th colspan="2">cn</th>

    </thead>
    <tbody>
    <c:forEach items="${ data }" var="kh">
        <tr>
            <td>${kh.maKhachHang}</td>
            <td>${kh.tenKhachHang}</td>
            <td>${kh.soDienThoai}</td>
            <td>${kh.gioiTinh == "1" ? "Nam" : "Nu"}</td>
            <td>${kh.hangKhachHang.tenHang }</td>

            <td>
            <td>
            <a href="/khach-hang/edit/${kh.maKhachHang}">Cập nhật</a>
            </td>
            <td>
                <a href="/khach-hang/delete/${kh.maKhachHang}">Xóa</a>
            </td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>