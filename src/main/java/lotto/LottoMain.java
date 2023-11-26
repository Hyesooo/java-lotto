package lotto;


import lotto.domain.Lotto;
import lotto.domain.WinningNumbers;
import lotto.view.LottoInputView;
import lotto.view.LottoResultView;

public class LottoMain {
    public static void main(String[] args) {
        LottoInputView lottoInputView = new LottoInputView();

        Lotto lotto = new Lotto();
        lotto.sellLotto(lottoInputView.inputBuyingMoney());
        LottoResultView.printLotto(lotto);

        WinningNumbers winningNumbers = new WinningNumbers(lottoInputView.inputWinningNumbers(), lottoInputView.inputBonusNumber());
        LottoResult lottoResult = new LottoResult(lotto.makeStatistics(winningNumbers), lotto.calcRateOfReturn(winningNumbers));

        LottoResultView.printResult(lottoResult);
    }
}
