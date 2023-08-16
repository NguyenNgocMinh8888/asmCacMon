<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 14/03/2023
  Time: 9:32 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
    <link href="/SP23B2_SOF3011_IT17321_war_exploded/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="col-8 offset-2 mt-5 table-responsive">
    <div class="row">
        <div class="col-6">
            <a href="/SP23B2_SOF3011_IT17321_war_exploded/nhan-vien/create" class="btn btn-success">Thêm mới</a>
        </div>
    </div>
    <c:if test="${ f:length(danhSachNV) == 0 }">
        <h3>Không có dữ liệu</h3>
    </c:if>
    <c:if test="${ f:length(danhSachNV) != 0 }">
        <table class="table table-striped mt-3">
            <thead class="table-primary">
            <tr>
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
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ danhSachNV }" var="nv">
                <tr>
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
                        <a class="btn btn-primary"
                           href="/SP23B2_SOF3011_IT17321_war_exploded//nhan-vien/edit?ma=${ nv.ma }">
                            Cập nhật
                        </a>
                    </td>
                    <td>
                        <a class="btn btn-danger"
                           href="/SP23B2_SOF3011_IT17321_war_exploded/nhan-vien/delete?ma=${ nv.ma }">
                            Xóa
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>

<script src="SP23B2_SOF3011_IT17321_war_exploded/js/bootstrap.min.js"></script>
</body>
</html>


