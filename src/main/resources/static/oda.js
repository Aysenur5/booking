var myApp=angular.module('BookingApplication',[]).controller('OdaController',function ($scope,$http) {

    $scope.oda={}
    $scope.odaList=[];

    $scope.pageOpen=function () {
        $scope.findOdaList();

    };
    $scope.findOdaList=function () {
        var res=$http.get('api/oda/findOda');
        res.then(function (response) {
            $scope.odaList=response.data;

        })

    }

});