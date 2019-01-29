package com.master.spring.restful.webservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Dynamic filtering , handle code to filter properties based on some logic
 */
@RestController
public class DynamicFilteringController {


    @GetMapping("/filtering")
    public MappingJacksonValue getPerson() {
        Person person = new Person("Jon", "Johny", "Janardhan");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("firstName");
        MappingJacksonValue mapping = new MappingJacksonValue(person);
        FilterProvider filters = new SimpleFilterProvider().addFilter("personFilter", filter);
        mapping.setFilters(filters);

        return mapping;
    }


}
