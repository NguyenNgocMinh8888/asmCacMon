<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>SD17321 - CRUD </title>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
</head>
<body>
<sf:form method="post" action="${ action }" modelAttribute="nv">
    <div>
        <label>Mã</label>
        <sf:input path="ma" />
        <div>
            <small><sf:errors path="ma" /></small>
        </div>
    </div>
    <div>
        <label>Họ</label>
        <sf:input path="ho" />
        <sf:errors path="ho" />
    </div>
    <div>
        <label>Tên Đệm</label>
        <sf:input path="tenDem" />
        <sf:errors path="tenDem" />
    </div>
    <div>
        <label>Tên</label>
        <sf:input path="ten" />
        <sf:errors path="ten" />
    </div>
    <div>
        <label>Giới tính</label>
        <div>
            <input type="radio" name="gioiTinh" value="true" checked/>Nam
        </div>
        <div>
            <input type="radio" name="gioiTinh" value="false"/>Nữ
        </div>
    </div>
    <div>
        <label>Ngày sinh</label>
        <sf:input path="ngaySinh" type="date" />
    </div>
    <div>
        <label>Địa chỉ</label>
        <sf:input path="diaChi" />
        <sf:errors path="diaChi" />
    </div>
    <div>
        <label>SĐT</label>
        <sf:input path="sdt" />
        <sf:errors path="sdt" />
    </div>
    <div>
        <label>Mật khẩu</label>
        <sf:input path="matKhau" />
        <sf:errors path="matKhau" />
    </div>
    <div>
        <label>Trạng thái</label>
        <div>
            <input type="radio" name="trangThai" value="0" checked/>Đang làm
        </div>
        <div>
            <input type="radio" name="trangThai" value="1"/>Nghỉ làm
        </div>
    </div>
    <div>
        <button>Thêm mới</button>
    </div>

</sf:form>
</body>
</html>