// // import java.util.List;
// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.stereotype.Service;
// // import com.groupid.apirest.entity.Country;
// // import com.groupid.apirest.repository.CountryRepository;

// // @Service
// // public class CountryService {
// // 	@Autowired
// // 	CountryRepository countryRepository;
	
// // 	public List<Country> getAllCountries(){
// // 		return countryRepository.findAll();
// // 	}
// // }
// @Service
// public class CountryService {
// 	@Autowired
// 	CountryRepository countryRepository;
	
// 	public List<Country> getAllCountries(){
// 		return countryRepository.findAll();
// 	}
	
// 	public Country getCountryByName(String name) {
// 		return countryRepository.findByName(name);
// 	}
// }