// @RestController
// @RequestMapping("/countries")
// public class CountryController {
// 	@Autowired
// 	CountryService countryService;
	
// 	@GetMapping
// 	public ResponseEntity<List<Country>>
// 	getAllCountries(){
// 		return new ResponseEntity<>(countryService.getAllCountries(),
// 				HttpStatus.OK);
// 	}
	
// 	@GetMapping("/{name}")
// 	public ResponseEntity<Country>
// 		getCountryByName(@PathVariable String name){
// 			return new ResponseEntity<>(countryService.getCountryByName(name),
// 					HttpStatus.OK);
// 	}
// }