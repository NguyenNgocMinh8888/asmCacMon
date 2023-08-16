window.sinhVienController = function ($scope, $http) {
  $scope.listSinhVien = [];
  $http.get(" http://localhost:3000/sinhVien").then(function (response) {
    $scope.listSinhVien = response.data;
  });
  $scope.them = function () {
    $http
      .post("http://localhost:3000/sinhVien", {
        id: $scope.id,
        ten: $scope.ten,
        gioiTinh: $scope.gioiTinh,
        lop: $scope.lop,
        diaChi: $scope.diaChi,
      })
      .then(function (response) {
        if (response.status === 201) {
          alert("THêm thành công");
        }
      });
  };

  $scope.delete = function (id) {
    $http
      .delete("http://localhost:3000/sinhVien/" + id)
      .then(function (response) {
        if (response.status === 200) {
          alert("Xóa thành công");
        }
      });
  };
};
window.detailController = function ($scope, $http, $routeParams) {
  var id = $routeParams.id;
  $http.get("http://localhost:3000/sinhVien/" + id).then(function (response) {
    $scope.id = response.data.id;
    $scope.ten = response.data.ten;
    $scope.gioiTinh = response.data.gioiTinh;
    $scope.lop = response.data.lop;
    $scope.diaChi = response.data.diaChi;
  });
  $scope.update = function (id) {
    $http
      .put("http://localhost:3000/sinhVien/" + $scope.id, {
        ten: $scope.ten,
        gioiTinh: $scope.gioiTinh,
        lop: $scope.lop,
        diaChi: $scope.diaChi,
      })
      .then(function (response) {
        if (response.status === 200) {
          alert("update thành công");
        }
      });
  };
};
