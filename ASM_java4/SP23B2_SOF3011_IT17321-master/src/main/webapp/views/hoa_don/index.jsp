<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 15/03/2023
  Time: 11:50 CH
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
            <a href="/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/create" class="btn btn-success">Thêm mới</a>
        </div>
    </div>
    <c:if test="${ f:length(danhSachHD) == 0 }">
        <h3>Không có dữ liệu</h3>
    </c:if>
    <c:if test="${ f:length(danhSachHD) != 0 }">
        <table class="table table-striped mt-3">
            <thead class="table-primary">
            <tr>
                <th>Mã</th>
                <th>Ngày tạo</th>
                <th>Ngày thanh toán</th>
                <th>Ngày ship</th>
                <th>Ngày nhận</th>
                <th>Tình trạng</th>
                <th>Tên người nhận</th>
                <th>Địa chỉ</th>
                <th>SDT</th>
                <th colspan="2">Thao tác</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ danhSachHD }" var="hd">
                <tr>
                    <td>${ hd.ma }</td>
                    <td>${ hd.ngayTao }</td>
                    <td>${ hd.ngayThanhToan }</td>
                    <td>${ hd.ngayShip }</td>
                    <td>${ hd.ngayNhan }</td>
                    <td> <c:if test="${hd.tinhTrang == '1'}">Đã thanh toán</c:if>
                        <c:if test="${hd.tinhTrang == '2'}">Chưa thanh toán</c:if></td>
                    <td>${ hd.tenNguoiNhan }</td>
                    <td>${ hd.diaChi }</td>
                    <td>${ hd.sdt }</td>
                    <td>
                        <a class="btn btn-primary"
                           href="/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/edit?ma=${ hd.ma }">
                            Cập nhật
                        </a>
                    </td>
                    <td>
                        <a class="btn btn-danger"
                           href="/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/delete?ma=${ hd.ma }">
                            Xóa
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>

<script src="../../js/bootstrap.min.js"></script>
</body>
</html>

