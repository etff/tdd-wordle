## 기능 요구 사항

지난 몇주간 선풍적인 인기인 단어 맞추기 웹 게임

- 6x5 격자를 통해서 5글자 단어를 6번만에 추측하기
- 맞는 글자는 녹색, 위치가 틀리면 노란색, 없으면 회색
- 하루에 한 문제를 이용자 모두에게 똑같이 출제
- 독특한 공유 방식으로 더욱 인기
- (현재 날짜 - 2021년 6월 19일) % 배열의 크기

## 단어

- [X] 단어는 5글자로 구성된다.
- [ ] 단어가 5글자가 아니면 예외를 던진다.
- [ ] 입력한 단어와 주어진 단어의 영자가 동일한 위치에 존재하면 초록 결과를 리턴한다.
- [ ] 입력한 단어와 주어진 단어의 영자가 일치하는 것이 없으면 흰 결과를 리턴한다.
- [ ] 입력한 단어와 주어진 단어의 영자가 동일 위치는 아니지만, 다른 위치에 있으면 노란을 리턴한다.

## 비교

- [ ] 비교는 흰, 노란, 초록으로 구성된다.

## 게임

- [ ] 6번 시도가 가능하다.
- [ ] 입력한 단어와 주어진 단어의 일치 갯수가 5개면 승리.

## 결과

- [ ] 결과는 승리, 패배로 구성된다.

## 실행 결과

```
WORDLE을 6번 만에 맞춰 보세요.
시도의 결과는 타일의 색 변화로 나타납니다.

⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜
⬜⬜🟨⬜⬜
🟩🟩🟩🟩🟩

Wordle 235 4/6

🟩⬜⬜⬜⬜
🟩🟩🟨⬜⬜
🟩🟩🟩⬜⬜
🟩🟩🟩🟩🟩
```
