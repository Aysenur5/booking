var myApp=angular.module('BookingApplication',[]).controller('RezervasyonController',function ($scope,$http) {

    $scope.rezervasyon={}
    $scope.rezervasyonList=[];

    $scope.pageOpen=function () {
        $scope.findRezervasyonList();

    };
    $scope.findRezervasyonList=function () {
        var res=$http.get('api/rezervasyon/findRezervasyon');
        res.then(function (response) {
            $scope.rezervasyonList=response.data;
        })
    }
    $scope.save=function () {
        var x=$http.post('api/rezervasyon/saveRezervasyon');
            x.then(function (response) {
                alert=response.data;
                $scope.findRezervasyonList();
            })
    }

    $scope.selectRezervasyon=function (rezervasyon) {
        $scope.rezervasyon=rezervasyon;
    }
});