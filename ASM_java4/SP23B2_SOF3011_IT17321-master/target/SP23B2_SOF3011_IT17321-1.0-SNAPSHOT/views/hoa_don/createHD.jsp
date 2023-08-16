<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 13/03/2023
  Time: 12:40 CH
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
          action="/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/store">
        <div class="row mt-3">
            <div class="col-6">
                <label>Mã</label>
                <input type="text" name="ma" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>Ngày tạo</label>
                <input type="date" name="ngayTao" class="form-control" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Ngày thanh toán</label>
                <input type="date" name="ngayThanhToan" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>Ngày ship</label>
                <input type="date" name="ngayShip" class="form-control" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Ngày nhận</label>
                <input type="date" name="ngayNhan" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>Tình trạng</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="tinhTrang" value="1">
                    <label class="form-check-label" >
                        Đã thanh toán
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="tinhTrang" value="2" checked>
                    <label class="form-check-label" >
                        Chưa thanh toán
                    </label>
                </div>
            </div>
        </div>
        <div class="row m/hoa-don/createt-3">
            <div class="col-6">
                <label>Tên người nhận</label>
                <input type="text" name="tenNguoiNhan" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>Địa chỉ</label>
                <input type="text" name="diaChi" class="form-control" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Số điện thoại</label>
                <input type="tel" name="sdt" class="form-control" required/>
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

