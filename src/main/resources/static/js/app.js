'use strict';

var app = angular.module("memoApp", ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.
    when('/', {
        templateUrl: 'views/welcome.html',
        controller: 'welcomeController'
    }).when('/detail/:category', {
        templateUrl: 'views/detail.html',
        controller: 'detailController'
    }).
    when('/add', {
        templateUrl: 'views/add.html',
        controller: 'addController'
    })
    .otherwise({
        redirectTo: '/'
    });
}]);