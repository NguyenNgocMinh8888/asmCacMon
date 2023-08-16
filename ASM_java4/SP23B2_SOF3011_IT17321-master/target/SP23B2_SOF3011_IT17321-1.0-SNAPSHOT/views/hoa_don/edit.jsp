<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 19/03/2023
  Time: 7:48 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="/SP23B2_SOF3011_IT17321_war_exploded/css/bootstrap.min.css" />
</head>
<body>
<div class="col-8 offset-2">
    <form class="row needs-validation" novalidate method="POST"
          action="/SP23B2_SOF3011_IT17321_war_exploded/hoa-don/update?ma=${ hd.ma }">
        <div class="row mt-3">
            <div class="col-6">
                <label>Mã</label>
                <input type="text" name="ma" class="form-control" value="${ hd.ma }" disabled required/>
            </div>
            <div class="col-6">
                <label>Ngày tạo</label>
                <input type="date" name="ngayTao" class="form-control" value="${ hd.ngayTao }" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Ngày thanh toán</label>
                <input type="date" name="ngayThanhToan" class="form-control" value="${ hd.ngayThanhToan}" required/>
            </div>
            <div class="col-6">
                <label>Ngày ship</label>
                <input type="date" name="ngayShip" class="form-control" value="${ hd.ngayShip }" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Ngày nhận</label>
                <input type="date" name="ngayNhan" class="form-control" value="${ hd.ngayNhan }" required/>
            </div>
            <div class="col-6">
                <label>Tình trạng</label>
                <div><input type="radio" name="tinhTrang" value="1" ${hd.tinhTrang == 1 ?"checked":""}>Đã thanh toán</div>
                <div><input type="radio" name="tinhTrang" value="2" ${hd.tinhTrang == 2 ?"checked":""}>Chưa thanh toán</div>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Tên người nhận</label>
                <input type="text" name="tenNguoiNhan" class="form-control" value="${ hd.tenNguoiNhan }" required/>
            </div>
            <div class="col-6">
                <label>Địa chỉ</label>
                <input type="text" name="diaChi" class="form-control" value="${ hd.diaChi }"required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Số điện thoại</label>
                <input type="tel" name="sdt" class="form-control" value="${ hd.sdt }"required/>
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

<script src="/SP23B2_SOF3011_IT17321_war_exploded/js/bootstrap.min.js"></script>
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
