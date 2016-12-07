app.controller("detailController", ['$scope', '$http', '$routeParams', function($scope, $http, $routeParams) {

    var link ="http://localhost:8080/memo/get";
	$http.get(link).then(function (response) {
		$scope.memos = response.data;
	});
}]);