package lotto.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static lotto.utils.StringParser.stringToIntegerList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class LottoNumbersTest {
    @Test
    void test_자동생성() {
        LottoNumbers lottoNumbers = new LottoNumbers();
        assertThat(lottoNumbers.numbers()).hasSize(6);
    }

    @Test
    void test_수동생성() {
        LottoNumbers lottoNumbers = new LottoNumbers(stringToIntegerList("1, 3, 7, 39, 44, 33"));
        assertThat(lottoNumbers.numbers()).hasSize(6);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1/ a/ 4/ 6/ 3/ 11"})
    void exceptionTest_유효하지_않은_구분자(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> new LottoNumbers(stringToIntegerList(input)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1, 80", "1, 4, 6, 2, 15, 19, 43, 25, 7"})
    void exceptionTest_갯수오류(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> new LottoNumbers(stringToIntegerList(input)));
    }

    @Test
    void test_번호일치여부() {
        LottoNumbers lottoNumbers = new LottoNumbers(stringToIntegerList("1, 2, 3, 4, 5, 6"));
        LottoNumbers target = new LottoNumbers(stringToIntegerList("6, 5, 4, 3, 45, 1"));

        assertThat(lottoNumbers.compareNumbers(target)).isEqualTo(5);
    }
}
