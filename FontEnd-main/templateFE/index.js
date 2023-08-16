window.sanPhamController = function ($scope, $http) {
	$scope.listSanPham = [];
	$http.get("http://localhost:3000/SanPham").then(function (response) {
	  $scope.listSanPham = response.data;
	});
  
	$scope.them = function () {
	  $http
		.post("http://localhost:3000/SanPham", {
		  id: $scope.id,
		  ten: $scope.ten,
		  soLuongTon: $scope.soLuongTon,
		  loaiSanPham: $scope.loaiSanPham,
          gia: $scope.gia,
          hinhThucSanXuat: $scope.hinhThucSanXuat
		})
		.then(function (response) {
		  if (response.status === 201) {
			alert("Them thanh cong");
		  }
		});
	};
    
	$scope.delete = function (id) {
		$http
		  .delete("http://localhost:3000/SanPham/" + id)
		  .then(function (response) {
			if (response.status === 200) {
			  alert("Xoa thanh cong");
			}
		  });
	  };
	
	 

		}	
	window.detailController = function ($scope, $http, $routeParams, $location) {
		var id = $routeParams.id;
		$http.get("http://localhost:3000/SanPham/" + id).then(function (response) {
		  $scope.id = response.data.id;
		  $scope.ten = response.data.ten;
		  $scope.soLuongTon = response.data.soLuongTon;
		  $scope.loaiSanPham = response.data.loaiSanPham; 
		  $scope.gia = response.data.gia;
		  $scope.hinhThucSanXuat = response.data.hinhThucSanXuat
		});
		$scope.sua = function () {
			$http
			  .put("http://localhost:3000/SanPham/" + $scope.id, {
				id: $scope.id,
				  ten: $scope.ten,
				  soLuongTon: $scope.soLuongTon,
				  loaiSanPham: $scope.loaiSanPham,
				  gia: $scope.gia,
				  hinhThucSanXuat: $scope.hinhThucSanXuat
			  })
			  .then(function (response) {
				if (response.status === 200) {
				  alert("update thanh cong");
				}
			  });
		  };
	  };