<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 14/03/2023
  Time: 9:41 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
    <%--    <link rel="stylesheet" href="../../css/bootstrap.min.css" />--%>
    <link href="/SP23B2_SOF3011_IT17321_war_exploded/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="col-10 offset-1 mt-5 table-responsive">
    <div class="row">
        <div class="col-6">
            <a href="/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/create" class="btn btn-success">Thêm mới</a>
        </div>
    </div>
    <c:if test="${ f:length(danhSachCTSP) == 0 }">
        <h3>Không có dữ liệu</h3>
    </c:if>
    <c:if test="${ f:length(danhSachCTSP) != 0 }">
        <table class="table table-striped mt-3">
            <thead class="table-primary">
            <tr>
                <th>ID</th>
                    <%--                <th>Sản phẩm</th>--%>
                    <%--                <th>NSX</th>--%>
                    <%--                <th>Màu sắc</th>--%>
                    <%--                <th>Dòng sản phẩm</th>--%>
                <th>Năm bảo hành</th>
                <th>Mô tả</th>
                <th>Số lượng tồn</th>
                <th>Giá nhập</th>
                <th>Giá bán</th>
                <th colspan="2"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ danhSachCTSP }" var="ctsp">
                <tr>
                    <td>${ ctsp.id }</td>
                        <%--                    <td>${ ctsp.san_pham }</td>--%>
                        <%--                    <td>${ ctsp.nha_sx }</td>--%>
                        <%--                    <td>${ ctsp.mau_sac }</td>--%>
                        <%--                    <td>${ ctsp.dong_sp }</td>--%>
                    <td>${ ctsp.namBaoHanh }</td>
                    <td>${ ctsp.moTa}</td>
                    <td>${ ctsp.soLuongTon }</td>
                    <td>${ ctsp.giaNhap }</td>
                    <td>${ ctsp.giaBan }</td>
                    <td>
                        <a href="/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham//edit?moTa=${ ctsp.moTa }" class="btn btn-primary">Cập nhật</a>
                    </td>
                    <td>
                        <a href="/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/delete?moTa=${ ctsp.moTa }" class="btn btn-danger">Xóa</a>
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

