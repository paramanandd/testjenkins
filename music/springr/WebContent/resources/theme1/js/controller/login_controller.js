/**
 * login controller
 */

'use strict'

App.controller('LoginController',['$scope','LoginService',function($scope,LoginService){
	
	var self = this;
	self.school={id:null,scname:'',scpass:''}
	self.message={code:null,msg:''}
	self.getCredentials = function(school){
		
		LoginService.getCredentials(school)
			.then(
					
					function(d){
						
						self.message = d;
					},
					function(errResponse){
						
						console.error('Error while checking credentials');
					}
				);
	};
	
	
}]);