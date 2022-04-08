package bbSiteDemo

import com.kms.katalon.core.annotation.Keyword

import fabricator.Contact
import fabricator.Fabricator




















public class FillDetails {
	@Keyword
	def FillForm() {

		Contact con = Fabricator.contact()

		String fullname = con.fullName(true, false)
		return fullname

		String Add1 = con.apartmentNumber()
		return Add1

		String Add2 = con.address()
		return Add2

		String city = con.city()
		return city

		String zip = con.postcode()
		return zip

		String coun = con.country()
		return coun

		String email = con.eMail()
		return email

		String phone = con.phoneNumber()
		return phone
	}
}
