app.controller('myController' , function($scope){
    	
    	$scope.fName = "Vivek";
    	$scope.lName= "Sharma";
    	$scope.changeName= function(){
    		$scope.firstName='Nelly';
    	};
    	$scope.names = [{name:'Vivek',company:'Thermo'},{name:'Preeti',company:'Synchronos'},{name:'TP',company:'TCS'},{name:'Boby',company:'Agriculture'}]
    	$scope.user = $scope.fName +" "+ $scope.lName;
    });