// /**
//  * <p>Classe Java de anonymous complex type.
//  * 
//  * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
//  * 
//  * <pre>
//  * &lt;complexType&gt;
//  *   &lt;complexContent&gt;
//  *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
//  *       &lt;sequence&gt;
//  *         &lt;element name="country" type="{http://groupid.com/wsprovider}country" maxOccurs="unbounded"/&gt;
//  *       &lt;/sequence&gt;
//  *     &lt;/restriction&gt;
//  *   &lt;/complexContent&gt;
//  * &lt;/complexType&gt;
//  * </pre>
//  * 
//  * 
//  */
// @XmlAccessorType(XmlAccessType.FIELD)
// @XmlType(name = "", propOrder = {
//     "country"
// })
// @XmlRootElement(name = "getAllCountriesResponse")
// public class GetAllCountriesResponse {

//     @XmlElement(required = true)
//     protected List<Country> country;

//     /**
//      * Gets the value of the country property.
//      * 
//      * <p>
//      * This accessor method returns a reference to the live list,
//      * not a snapshot. Therefore any modification you make to the
//      * returned list will be present inside the Jakarta XML Binding object.
//      * This is why there is not a <CODE>set</CODE> method for the country property.
//      * 
//      * <p>
//      * For example, to add a new item, do as follows:
//      * <pre>
//      *    getCountry().add(newItem);
//      * </pre>
//      * 
//      * 
//      * <p>
//      * Objects of the following type(s) are allowed in the list
//      * {@link Country }
//      * 
//      * 
//      */
//     public List<Country> getCountry() {
//         if (country == null) {
//             country = new ArrayList<Country>();
//         }
//         return this.country;
//     }

// }