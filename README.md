# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## 기능 요구 사항
# step 1 : 문자열 계산기
### 1. 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
### 2. 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
### 3. 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
### 4. 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
### 5. 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

- [x] 사용자가 입력한 문자열을 space를 기준으로 split한다.
- [x] 새로운 배열에 사칙연산은 그대로 문자열로 두고, 나머지 숫자를 포함한 문자열들은 int로 변환하여 저장한다.
- [x] "+"에 대한 메서드 작성한다.
- [x] "-"에 대한 메서드 작성한다.
- [x] "*"에 대한 메서드 작성한다.
- [x] "/"에 대한 메서드 작성한다.
- [x] 저장된 배열의 값들을 조회하며 계산한다.

## 기능 요구 사항
# step 2 : 로또(자동)
### 1. 사용자가 구입금액을 입력한다.
### 2. 구입금액에 따라 각 로또 티겟당 랜덤 숫자들을 생성한다.
### 3. 당첨 번호를 랜덤으로 생성한다.
### 4. 로또 티겟과 당첨 번호를 비교하여 당첨 통계를 계산한다.
### 5. 당첨 통계에 따라 수익률을 계산한다.