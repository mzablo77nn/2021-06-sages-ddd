package com.smalaca.rentalapp.rental.infrastructure.api.foobar;

import com.smalaca.rentalapp.rental.application.booking.BookingApplicationService;

public class BookingFooBarController {
    private final BookingApplicationService bookingApplicationService;

    public BookingFooBarController(BookingApplicationService bookingApplicationService) {
        this.bookingApplicationService = bookingApplicationService;
    }

    public void bookApartment() {
        bookingApplicationService.bookApartment();
    }
}
