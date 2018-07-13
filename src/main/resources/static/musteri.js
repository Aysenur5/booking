var myApp=angular.module('BookingApplication',[]).controller('MusteriController',function ($scope,$http)
{



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
        var x=$http.post('api/musteri/saveMusteri', $scope.oda);
        x.then(function (response) {
            alert(response.data);
            $scope.findOdaList();
        });
    }
});