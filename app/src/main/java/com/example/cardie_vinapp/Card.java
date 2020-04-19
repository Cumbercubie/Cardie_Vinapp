package com.example.cardie_vinapp;

public class Card {
    private String CardId;
    private String CardWord;
    private String CardDefinition;
    private String CardImageUrl;
    private String CardTranslation;
    private String CardAudio;

    public Card()
    {}
    public Card(String cardId, String cardWord, String cardDefinition, String cardImageUrl, String cardTranslation, String cardAudio) {
        CardId = cardId;
        CardWord = cardWord;
        CardDefinition = cardDefinition;
        CardImageUrl = cardImageUrl;
        CardTranslation = cardTranslation;
        CardAudio = cardAudio;
    }

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public String getCardWord() {
        return CardWord;
    }

    public void setCardWord(String cardWord) {
        CardWord = cardWord;
    }

    public String getCardDefinition() {
        return CardDefinition;
    }

    public void setCardDefinition(String cardDefinition) {
        CardDefinition = cardDefinition;
    }

    public String getCardImageUrl() {
        return CardImageUrl;
    }

    public void setCardImageUrl(String cardImageUrl) {
        CardImageUrl = cardImageUrl;
    }

    public String getCardTranslation() {
        return CardTranslation;
    }

    public void setCardTranslation(String cardTranslation) {
        CardTranslation = cardTranslation;
    }

    public String getCardAudio() {
        return CardAudio;
    }

    public void setCardAudio(String cardAudio) {
        CardAudio = cardAudio;
    }
}
