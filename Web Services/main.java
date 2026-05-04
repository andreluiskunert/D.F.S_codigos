// // // public static void main(String[] args) throws IOException {
// // // 	Retrofit cliente = new Retrofit.Builder()
// // // 		.baseUrl("http://localhost:8080")
// // // 		.addConverterFactory(JacksonConverterFactory.create())
// // // 		.build();
// // // 	CountryClient countryCli = cliente.create(CountryClient.class);
// // // 	for(Country c: countryCli.obterPaises().execute().body()){
// // // 		System.out.println("name: " + c.getName());
// // // 		System.out.println("capital: " + c.getCapital());
// // // 		System.out.println("currency: " + c.getCurrency());
// // // 		System.out.println("population: " + c.getPopulation());
		
// // // 		System.out.println();
// // // 	}
// // // }
// // name: Spain
// // capital: Madrid
// // currency: EUR
// // population: 46704314

// // name: Poland
// // capital: Warsaw
// // currency: PLN
// // population: 38186860

// // name: United Kingdom
// // capital: London
// // currency: GBP
// // population: 63705000
// Retrofit cliente = new Retrofit.Builder()
//             .baseUrl("http://localhost:8080")
//             .addConverterFactory(JacksonConverterFactory.create())
//             .build();
// CountryClient countryCli = cliente.create(CountryClient.class);
// List<Country> listaPaises = countryCli.obterPaises().execute().body();