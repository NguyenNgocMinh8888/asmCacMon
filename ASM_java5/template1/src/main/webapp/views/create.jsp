<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title></title>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<sf:form method="post" action="${ action }" modelAttribute="pgg">
<div>
    <label>Mã</label>
        <sf:input path="maPhieu" />
        <sf:errors Style="color:red" path="maPhieu" />
    <div>
        <label>Tên</label>
        <sf:input path="tenPhieu" />
        <sf:errors Style="color:red" path="tenPhieu" />
    </div>
    <div>
        <label>ngay bat dau</label>
        <sf:input type="date" path="ngayBatDau" />
        <sf:errors Style="color:red" path="ngayBatDau" />
    </div>
    <div>
        <label>ngay kt</label>
        <sf:input type="date" path="ngayKetThuc" />
        <sf:errors Style="color:red" path="ngayKetThuc" />
    </div>
    <div>
        <label>gia tri giam</label>
        <sf:input path="giaTriGiam" />
        <sf:errors Style="color:red" path="giaTriGiam" />
    </div>
    <div>
        <label>trang thai</label>
        <sf:input path="trangThai" values="0" />
        <sf:errors Style="color:red" path="trangThai" />
    </div>
    <div>
        <label>ten khach</label>
        <sf:select path="phieuGiamGiaVM" >
            <c:forEach items="${ dskh }" var="kh">
                <sf:option value="${kh.maKhachHang}">${kh.tenKhachHang}</sf:option>
            </c:forEach>
        </sf:select>
    </div>
    <div>
        <button>Thêm mới</button>
    </div>

    </sf:form>
</body>
</html>