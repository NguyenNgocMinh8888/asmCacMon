<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 18/03/2023
  Time: 10:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="/SP23B2_SOF3011_IT17321_war_exploded/css/bootstrap.min.css" />
</head>
<body>
<div class="col-8 offset-2">
    <form class="row needs-validation" novalidate method="POST"
          action="/SP23B2_SOF3011_IT17321_war_exploded/cua-hang/update?ma=${ ch.ma }">
        <div class="row mt-3">
            <div class="col-6">
                <label>Mã</label>
                <input type="text" name="ma" class="form-control" value="${ ch.ma }" disabled required/>
            </div>
            <div class="col-6">
                <label>Tên</label>
                <input type="text" name="ten" class="form-control" value="${ ch.ten }" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Địa chỉ</label>
                <input type="text" name="diaChi" class="form-control" value="${ ch.diaChi }" required/>
            </div>
            <div class="col-6">
                <label>Thành phố</label>
                <select name="thanhPho" class="form-select">
                    <option value="Hà Nội" ${ kh.thanhPho == "Hà Nội" ? "selected" : "" }>Việt Nam</option>
                    <option value="BangKok" ${ kh.thanhPho == "BangKok" ? "selected" : "" }>BangKok</option>
                </select>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Quốc gia</label>
                <select name="quocGia" class="form-select">
                    <option value="Việt Nam" ${ kh.quocGia == "Việt Nam" ? "selected" : "" }>Việt Nam</option>
                    <option value="Thái Lan" ${ kh.quocGia == "Thái Lan" ? "selected" : "" }>Thái Lan</option>
                </select>
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
