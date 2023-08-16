<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>CRUD</title>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="f" uri="jakarta.tags.functions" %>
</head>
<body>
<sf:form method="post" action="${ action }" modelAttribute="kh">
            <div>
                 <label>Mã</label>
                <sf:input path="maKhachHang" />
            <div>
            <div>
                <label>ten</label>
                <sf:input path="tenKhachHang" />
            </div>
                <div>
                    <label>sdt</label>
                    <sf:input path="soDienThoai" />
                </div>
                <div>
                    <label>gioi tinh</label>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" path="gioiTinh">
                        <label class="form-check-label" >
                            Default radio
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" path="gioiTinh" checked>
                        <label class="form-check-label">
                            Default checked radio
                        </label>
                    </div>
                </div>
                <div>
                    <div>
                            <label>hang</label>
                            <sf:select path="hangKhachHangVM" >
                                <c:forEach items="${ dsh }" var="h">
                                    <sf:option value="${h.maHang}">${h.tenHang}</sf:option>
                                </c:forEach>
                            </sf:select>
                        </div>
                </div>


            </sf:form>
</body>
</html>
