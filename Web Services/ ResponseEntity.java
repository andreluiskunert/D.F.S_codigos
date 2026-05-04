// // // @GetMapping("/{name}")
// // // 	public ResponseEntity<Country>
// // // 		getCountryByName(@PathVariable String name){
// // // 			return new ResponseEntity<>(countryService.getCountryByName(name),
// // // 					HttpStatus.OK);
// // // 	}
// // @GetMapping("/{name}")
// // public ResponseEntity<Country>
// // 	getCountryByName(@PathVariable String name){
		
// // 		Country country = countryService.getCountryByName(name);

// // 		if(null == country)
// // 			return new ResponseEntity<>(null,
// // 					HttpStatus.NOT_FOUND);
// // 		else
// // 			return new ResponseEntity<>(country,
// // 					HttpStatus.OK);
					
// // }
// @GetMapping("/{name}")
// public ResponseEntity<Country>
// 	getCountryByName(@PathVariable String name){
		
// 		Country country = countryService.getCountryByName(name);

// 		if(null == country)
// 			return new ResponseEntity<>(null,
// 					HttpStatus.BAD_REQUEST);
// 		else
// 			return new ResponseEntity<>(country,
// 					HttpStatus.OK);
					
// }
// @GetMapping("/{name}")
// public ResponseEntity<Country>
// 	getCountryByName(@PathVariable String name){
		
// 		Country country = countryService.getCountryByName(name);

// 		if(null == country)
// 			return new ResponseEntity<>(null,
// 					HttpStatus.OK);
// 		else
// 			return new ResponseEntity<>(country,
// 					HttpStatus.OK);
					
// }
// @GetMapping("/{name}")
// 	public ResponseEntity<Country>
// 		getCountryByName(@PathVariable String name){
// 			return new ResponseEntity<>(countryService.getCountryByName(name),
// 					HttpStatus.NOT_FOUND);
// 	}