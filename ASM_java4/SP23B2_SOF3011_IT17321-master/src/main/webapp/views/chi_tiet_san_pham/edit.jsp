<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 22/03/2023
  Time: 12:39 CH
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
    <form class="row needs-validation" novalidate method="POST" action="/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/update?moTa=${ ctsp.moTa }">
        <div class="row mt-3">
            <div class="col-6">
                <label>Năm bảo hành</label>
                <input type="text" name="namBaoHanh" class="form-control" value="${ ctsp.namBaoHanh }"  required/>
            </div>
            <div class="col-6">
                <label>Mô tả</label>
                <input type="text" name="moTa" class="form-control" value="${ ctsp.moTa }" disabled required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Số lượng tồn</label>
                <input type="text" name="soLuongTon" class="form-control"value="${ ctsp.soLuongTon } "required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Giá nhập</label>
                <input type="text" name="giaNhap" class="form-control" value="${ ctsp.giaNhap }"required/>
            </div>

            <div class="col-6">
                <label>Giá bán</label>
                <input type="text" name="giaBan" class="form-control" value="${ ctsp.giaBan }"required/>
            </div>

        </div>

        <div class="row mt-3">
            <div class="col-6">
                <button class="btn btn-primary">Cập nhật</button>
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

