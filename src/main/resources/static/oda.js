var myApp=angular.module('BookingApplication',[]).controller('OdaController',function ($scope,$http) {

    $scope.oda={}
    $scope.odaList=[];
    $scope.musteri={}
    $scope.musteriList=[];

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
        var x=$http.post('api/oda/saveOda', $scope.oda);
        x.then(function (response) {
            alert(response.data);
            $scope.findOdaList();
        });
    }
    // $scope.saveMusteri=function () {
    //     var x=$http.post('api/musteri/saveMusteri', $scope.musteri);
    //     x.then(function (response) {
    //         alert(response.data);
    //         $scope.findOdaList();
    //     });
    // }
    $scope.selectOda=function (oda) {
        $scope.oda=oda;
    }
    $scope.deleteOda=function (oda) {
        $scope.oda=oda;
        var x=$http.post('/api/oda/deleteOda', $scope.oda);
        x.then(function (response) {
            $scope.oda={};
            $scope.findOdaList();
        });
    }

});