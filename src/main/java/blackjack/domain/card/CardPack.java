package blackjack.domain.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CardPack {

    private final List<Card> cardPack;
    private static final List<Card> cards = new ArrayList<>();

    static {
        for (final CardSymbol symbol : CardSymbol.values()) {
            Arrays.stream(CardType.values())
                .forEach(type -> cards.add(new Card(symbol, type)));
        }
    }

    public CardPack(List<Card> cardPack) {
        this.cardPack = cardPack;
    }

    public static CardPack create() {
        Collections.shuffle(cards);
        return new CardPack(new ArrayList<>(cards));
    }

    public Card pick() {
        return cardPack.remove(0);
    }

    public List<Card> getCardPack() {
        return Collections.unmodifiableList(cardPack);
    }
}
