package com.microservice.cards.service;

import com.microservice.cards.dto.CardsDto;

public interface ICardsService {

    /**
     * Creates a new card for the customer.
     *
     * @param mobileNumber The mobile number of the customer.
     */
    void createCard(String mobileNumber);

    /**
     * Fetches card details for a given mobile number.
     *
     * @param mobileNumber The input mobile number.
     * @return Card details as a {@link CardsDto} object.
     */
    CardsDto fetchCard(String mobileNumber);

    /**
     * Updates card details.
     *
     * @param cardsDto The card details to be updated as a {@link CardsDto} object.
     * @return {@code true} if the update is successful, otherwise {@code false}.
     */
    boolean updateCard(CardsDto cardsDto);

    /**
     * Deletes card details for a given mobile number.
     *
     * @param mobileNumber The input mobile number.
     * @return {@code true} if the deletion is successful, otherwise {@code false}.
     */
    boolean deleteCard(String mobileNumber);

}
