<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 13/03/2023
  Time: 1:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="../../css/bootstrap.min.css" />
</head>
<body>
<div class="col-8 offset-2">
    <form class="row needs-validation" novalidate method="POST"
          action="/SP23B2_SOF3011_IT17321_war_exploded/nhan-vien/store">
        <div class="row mt-3">
            <div class="col-6">
                <label>Mã</label>
                <input type="text" name="ma" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>Họ</label>
                <input type="text" name="ho" class="form-control" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Tên đệm</label>
                <input type="text" name="tenDem" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>Tên</label>
                <input type="text" name="ten" class="form-control" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Giới tính</label>
                <div>
                    <input type="radio" name="gioiTinh" value="true" checked/>Nam
                </div>
                <div>
                    <input type="radio" name="gioiTinh" value="false"/>Nữ
                </div>
            </div>
            <div class="col-6">
                <label>Ngày sinh</label>
                <input type="date" name="ngaySinh" class="form-control" />
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Địa chỉ</label>
                <input type="text" name="diaChi" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>SDT</label>
                <input type="tel" name="sdt" class="form-control" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Mật khẩu</label>
                <input type="password" name="matKhau" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>Trạng thái</label>
                <div>
                    <input type="radio" name="trangThai" value="0" checked/>Đang làm
                </div>
                <div>
                    <input type="radio" name="trangThai" value="1"/>Nghỉ làm
                </div>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <button class="btn btn-primary">Thêm mới</button>
            </div>
            <div class="col-6"></div>
        </div>
    </form>
</div>

<script src="../../js/bootstrap.min.js"></script>
<script !src="">(() => {
    'use strict'

    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    const forms = document.querySelectorAll('.needs-validation')

    // Loop over them and prevent submission
    Array.from(forms).forEach(form => {
        form.addEventListener('submit', event => {
            if (!form.checkValidity()) {
                event.preventDefault()
                event.stopPropagation()
            }

            form.classList.add('was-validated')
        }, false)
    })
})()</script>
</body>
</html>

