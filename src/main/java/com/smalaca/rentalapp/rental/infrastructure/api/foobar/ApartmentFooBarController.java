package com.smalaca.rentalapp.rental.infrastructure.api.foobar;

import com.smalaca.rentalapp.rental.application.apartment.ApartmentApplicationService;
import com.smalaca.rentalapp.rental.query.apartment.QueryApartmentFacade;

public class ApartmentFooBarController {
    private final QueryApartmentFacade queryApartmentFacade;
    private final ApartmentApplicationService apartmentApplicationService;

    public ApartmentFooBarController(QueryApartmentFacade queryApartmentFacade, ApartmentApplicationService apartmentApplicationService) {
        this.queryApartmentFacade = queryApartmentFacade;
        this.apartmentApplicationService = apartmentApplicationService;
    }

    public void searchApartments() {
        queryApartmentFacade.searchApartments();
    }

    public void filterApartments() {
        queryApartmentFacade.filterApartments();
    }

    public void sortApartments() {
        queryApartmentFacade.sortApartments();
    }

    public void displayApartment() {
        queryApartmentFacade.displayApartment();
    }

    public void chooseApartment() {
        apartmentApplicationService.chooseApartment();
    }
}
