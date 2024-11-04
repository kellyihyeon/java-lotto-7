package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class LottoGenerator {

    public static List<Lotto> generate(int totalAmount) {
        if (totalAmount < 1000) {
            throw new IllegalArgumentException("[ERROR] 구입 금액은 1,000원 이상이어야 해요.");
        }

        List<Lotto> result = new ArrayList<>();
        int quantity = totalAmount / 1000;

        while (quantity-- > 0) {
            result.add(new Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6)));
        }

        return result;
    }
}
