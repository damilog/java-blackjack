# java-blackjack

## 기능

### Car
- [X] 이동거리로 주입해야할 연료량을 계산한다.
- [X] 차종을 리턴한다.
- [X] 연료량을 리턴한다.

### RentCompany
- [X] InputView를 생성한다.
- [X] InputView로 부터 받은 이동거리로 Car를 생성한다.
- [X] ReportView를 생성한다.
- [X] Car로부터 받은 연료량으로 ReportView를 생성한다.

### InputView
- [X] 이동거리 입력 받는다.

### ReportView
- [X] 차량별 주입해야할 연료량을 출력한다.


## 블랙잭 기능 요구사항

### 입력
- [x] 게임에 참여할 사람의 이름을 입력한다.
  - [x] 쉼표 기준으로 분리한다

### 출력
- [ ]

### 카드
- [ ] Ace는 1 또는 11로 계산한다.
- [x] King, Queen, Jack은 10으로 계산한다.
- [x] 나머지 카드는 카드숫자를 기본으로 계산한다.

### 게임
- [x] 게임시작 시 2장의 카드를 지급 받는다. 
- [ ] 21을 초과하지 않으면 카드를 계속 받을 수 있다.
- [ ] 21을 초과하면 패배로 처리한다.
- [ ] 21을 초과하지 않으면서 21에 가까운 사람이 이긴다.
#### 딜러
- [ ] 처음에 받은 2장의 합계가 16이하면 1장을 추가로 지급받는다. 
