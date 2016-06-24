/**
 * login service
 */

'use strict';

App.factory('StudentService',['$http','StudentService',function($http,$q){
	
	return{
		
		getCredentials : function(school){
			
			return $http.post()
				.then(
						function(response){
                        	
                            return response.data;
                        }, 
                        function(errResponse){
                            console.error('Error while checking credentials');
                            return $q.reject(errResponse);
                        }
					);
		}
	};
}]);