
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
    <title>Thêm KhachHang</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
</head>
<body>
<section class="container">
    <sf:form action="store" method="post" modelAttribute="kh">
        <div class="row">
            <div class="col-6">
                <label>Mã</label>
                <sf:input path="ma" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ma" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Họ</label>
                <sf:input path="ho" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ho" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label>Tên đệm</label>
                <sf:input  path="tenDem" class="form-control"></sf:input>
                <div>
                    <sf:errors path="tenDem" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Tên</label>
                <sf:input  path="ten" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ten" cssStyle="color: red"></sf:errors>
                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-6">
                <label>Ngày sinh</label>
                <sf:input type="date" path="ngaySinh" class="form-control"></sf:input>
                <div>
                    <sf:errors type="date" path="ngaySinh" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>SDT</label>
                <sf:input type="tel" path="sdt" class="form-control"></sf:input>
                <div>
                    <sf:errors type="tel" path="sdt" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label>Địa chỉ</label>
                <sf:input path="diaChi" class="form-control"></sf:input>
                <div>
                    <sf:errors path="diaChi" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Thành phố</label>
                <sf:select path="thanhPho" cssClass="form-select">
                    <sf:option value="Hà Nội" >Hà Nội</sf:option>
                    <sf:option value="Đà Nẵng" >Đà Nẵng</sf:option>
                    <sf:option value="New York" >New York</sf:option>
                </sf:select>
            </div>

        </div>
        <div class="row">
            <div class="col-6">
                <label>Quốc gia</label>
                <sf:select path="quocGia" cssClass="form-select">
                    <sf:option value="VN" >VN</sf:option>
                    <sf:option value="US" >HOA KY</sf:option>

                </sf:select>
            </div>
            <div class="col-6">
                <label>Mật khẩu</label>
                <sf:input path="matKhau" class="form-control"></sf:input>
                <div>
                    <sf:errors path="matKhau" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>



        <br>
        <p style="text-align: right">
            <button class="btn btn-primary" style="height: 50px; width: 100px;font-size: 20px">Thêm</button>
        </p>

    </sf:form>
</section>
</body>
</html>
