angular
		.module('CityApp', [])
		.controller(
				'CityController',
				function($scope, $http) {

					$scope.buttonText = "Submit";

					$scope.search = function fetch() {
						$http
								.get(
										"http://localhost:8080/city/getcityJSON/"
												+ $scope.searchText)
								.then(
										function(response) {
											$scope.city = response.data.geonames;
											$scope.query = "https://www.google.com/maps/embed/v1/search?key=AIzaSyDWsLMfK9C80NGz94zO-QQKgZ3Zoe2uccs&q="
													+ $scope.searchText;
										});
					}

				});