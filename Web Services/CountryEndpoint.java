// @Endpoint
// public class CountryEndpoint {
// 	private static final String NAMESPACE_URI = "http://groupid.com/wsprovider";

// 	private CountryRepository countryRepository;

// 	@Autowired
// 	public CountryEndpoint(CountryRepository countryRepository) {
// 		this.countryRepository = countryRepository;
// 	}

// 	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
// 	@ResponsePayload
// 	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
// 		Map<String, Country> countryMap = new HashMap<>();
// 		Country country = new Country();
		
// 		GetCountryResponse response = new GetCountryResponse();
// 		CountryEntity countryEntity = countryRepository.findByName(request.getName()).get(); 
		
// 		country.setName(countryEntity.getName());
// 		country.setCapital(countryEntity.getCapital());
// 		country.setCurrency(countryEntity.getCurrency());
// 		country.setPopulation(countryEntity.getPopulation());
// 		countryMap.put(country.getName(), country);
		
// 		response.setCountry(countryMap.get(request.getName()));
		
// 		return response;
// 	}

// 	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllCountriesRequest")
// 	@ResponsePayload
// 	public GetAllCountriesResponse getCountries(@RequestPayload GetAllCountriesRequest request) {
// 		List<Country> countries = new ArrayList<>();
		
// 		GetAllCountriesResponse response = new GetAllCountriesResponse();
// 		List<CountryEntity> listCountryEntity = countryRepository.findAll();
		
// 		for(CountryEntity countryEntity:listCountryEntity) {
// 			Country country = new Country();
// 			country.setName(countryEntity.getName());
// 			country.setCapital(countryEntity.getCapital());
// 			country.setCurrency(countryEntity.getCurrency());
// 			country.setPopulation(countryEntity.getPopulation());
// 			countries.add(country);
// 		}
		
// 		response.getCountry().addAll(countries);
		
// 		return response;
// 	}
// }