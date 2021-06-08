package com.smalaca.rentalapp.rental.infrastructure.api.foobar;

import com.smalaca.rentalapp.rental.application.bookingrequest.BookingRequestApplicationService;

public class BookingRequestFooBarController {
    private final BookingRequestApplicationService bookingRequestApplicationService;

    public BookingRequestFooBarController(BookingRequestApplicationService bookingRequestApplicationService) {
        this.bookingRequestApplicationService = bookingRequestApplicationService;
    }

    public void requestApartmentBooking() {
        bookingRequestApplicationService.requestApartmentBooking();
    }
}
