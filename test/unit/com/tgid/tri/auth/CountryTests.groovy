package com.tgid.tri.auth

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@Mock(Country)
class CountryTests {

    void setUp() {
        // Setup logic here
    }

    void tearDown() {
        // Tear down logic here
    }

    void testCreatingCountry() {
        Country country = new Country(countryID: 'USA', countryID3: 'USA', countryName: 'United States of America')

        assert country.countryID == 'USA'
    }
}
