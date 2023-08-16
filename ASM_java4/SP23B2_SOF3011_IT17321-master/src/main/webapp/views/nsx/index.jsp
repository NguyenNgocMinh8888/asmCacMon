<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 22/03/2023
  Time: 9:16 CH
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
<div class="col-8 offset-2 mt-5 table-responsive">
    <div class="row">
        <div class="col-6">
            <a href="/SP23B2_SOF3011_IT17321_war_exploded/nhaSX/create" class="btn btn-success">Thêm mới</a>
        </div>
    </div>
    <c:if test="${ f:length(danhSachNSX) == 0 }">
        <h3>Không có dữ liệu</h3>
    </c:if>
    <c:if test="${ f:length(danhSachNSX) != 0 }">
        <table class="table table-striped mt-3">
            <thead class="table-primary">
            <tr>
                <th>Mã</th>
                <th>Tên</th>
                <th colspan="2">Thao tác</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ danhSachNSX }" var="nsx">
                <tr>
                    <td>${ nsx.ma }</td>
                    <td>${ nsx.ten }</td>
                    <td>
                        <a class="btn btn-primary"
                           href="/SP23B2_SOF3011_IT17321_war_exploded/nhaSX/edit?ma=${ nsx.ma }">
                            Cập nhật
                        </a>
                    </td>
                    <td>
                        <a class="btn btn-danger"
                           href="/SP23B2_SOF3011_IT17321_war_exploded/nhaSX/delete?ma=${ nsx.ma }">
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
