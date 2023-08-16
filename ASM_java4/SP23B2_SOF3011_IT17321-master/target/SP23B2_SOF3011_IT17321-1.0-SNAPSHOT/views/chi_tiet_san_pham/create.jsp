<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/03/2023
  Time: 10:22 AM
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
<div class="col-10 offset-1">
    <form name="ctsp" class="row needs-validation" novalidate onsubmit = "return(validate());" method="POST" action="/SP23B2_SOF3011_IT17321_war_exploded/chi-tiet-san-pham/store" >
        <div class="row mt-3">
            <div class="col-6">
                <label>Năm bảo hành</label>
                <input type="number" name="namBaoHanh" class="form-control" required/>
            </div>
            <div class="col-6">
                <label>Mô tả</label>
                <input type="text" name="moTa" class="form-control" required/>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Số lượng tồn</label>
                <input type="number" name="soLuongTon" class="form-control" required/>
            </div>

        </div>
        <div class="row mt-3">
            <div class="col-6">
                <label>Giá nhập</label>
                <input type="number" name="giaNhap" class="form-control" required/>
            </div>

            <div class="col-6">
                <label>Giá bán</label>
                <input type="number" name="giaBan" class="form-control" required/>
            </div>

        </div>

        <div class="row mt-3">
            <div class="col-6">
                <button class="btn btn-primary" type="submit" value="Submit">Thêm mới</button>
            </div>
            <div class="col-6"></div>
        </div>

    </form>
<%--    <div class="alert alert-danger">--%>
<%--        ${ validate }--%>
<%--    </div>--%>
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
})()

function validate(){
    if( document.ctsp.namBaoHanh.value == "" ) {
        alert( "Trong cc!" );
        document.ctsp.namBaoHanh.focus() ;
        return false;
    }
}
</script>
</body>
</html>
