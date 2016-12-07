app.controller("addController", ['$scope', '$http', '$routeParams', function($scope, $http, $routeParams) {
    
var Memo = function() {
 var title, category, description;
};
    
$scope.add = function() {
     
        var newMemo = new Memo();
        newMemo.title=$scope.tip.title;
        newMemo.category=$scope.tip.category;
        newMemo.description=$scope.tip.description;
    
        
      /*  $scope.tips.push({ "title":$scope.tip.title,"category":$scope.tip.category, "description":$scope.tip.description});

        */
        console.log(newMemo);
      //  var memo = JSON.stringify(newMemo);
        //Save the json 
        $http.post("http://127.0.0.1:8080/memo/add", newMemo).
        success(function() {console.log("OK");})
        .error(function() {console.log("KO");});
        
    
        //Clear form after adding
       // $scope.clear();

    
    
    
    };
    
    $scope.clear = function() {
        $scope.tip.title="";
        $scope.tip.category="";
        $scope.tip.description="";
    };
}]);