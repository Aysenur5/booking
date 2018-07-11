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
    $scope.save=function () {
        var x=$http.post('api/oda/saveOda', $scope.player);
        x.then(function (response) {
            alert=response.data;
            $scope.findOdaList();
        });
    }
    $scope.selectOda=function (oda) {
        $scope.oda=oda;
    }

});