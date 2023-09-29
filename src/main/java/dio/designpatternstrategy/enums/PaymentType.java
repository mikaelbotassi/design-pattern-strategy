package dio.designpatternstrategy.enums;

public enum PaymentType {
    PAYPAL(1), CASH(2), CREDIT_CARD(3);

    PaymentType(Integer value) {
    }

    public static String showOptions() {
        return """
        <table border='1'>
            <thead>
                <tr>
                    <th>Option</th>
                    <th>Name</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>PayPal</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Cash</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>Crédit Card</td>
                </tr>
            </tbody>
        </table>
        """;
    }
}