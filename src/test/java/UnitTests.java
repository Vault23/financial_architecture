import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.podmarkov.CreditCard;
import ru.podmarkov.DebitCard;
import ru.podmarkov.DepositAccount;

import static org.assertj.core.api.Assertions.assertThat;

public class UnitTests {

    @Test()
    @DisplayName("Тест дебетовой карты")
    public void debitCardTest() {
        DebitCard card = new DebitCard(
                "Дебетовая карта",
                "RUB",
                25000.0);
        card.deposit(15000.0);
        assertThat(40000.0).isEqualTo(card.getBalance());
    }

    @Test
    @DisplayName("Тест кредитной карты")
    public void creditCardTest() {
        CreditCard card = new CreditCard(
                "Кредитная карта",
                "RUB",
                -1000.0,
                0.05);
        assertThat(-1050.0).isEqualTo(card.getDebt());
    }

    @Test
    @DisplayName("Тест вклада")
    public void depositAccountTest() {
        DepositAccount account = new DepositAccount(
                "My Deposit",
                "EUR",
                1000.0);
        account.closeAccount();
        assertThat(0.0).isEqualTo(account.getBalance());
    }
}
