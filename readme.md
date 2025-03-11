# 💯 알고리즘 및 코딩 테스트 대비 스터디

1.  주 4회 이상 참여해야 합니다. (패널티 추후 도입 예정)

2.  모두가 같은 문제를 풀지 않아도 됩니다. 원하는 문제를 골라서 풀면 됩니다!

3.  난이도는 금융권 ~ 사기업 수준으로 제한합니다.

4.  첫 번째 문제집: 삼성 SW 역량 테스트 기출 문제(https://www.acmicpc.net/workbook/view/1152)

## ✅ 참여방법

### GIT 최초 설정

1.  프로젝트 레포 fork 해서 자신의 github로 복사
2.  fork한 프로젝트 자신의 로컬 저장소에 clone
3.  브랜치 생성

    ```
    $ git remote add upstream <원래 프로젝트 레포의 url>
    $ git remote -v
    $ git checkout -b 브랜치이름
    ```

4.  Read Me 생성 혹은 변경 후,

    ```
    $ git add .
    $ git commit -m "커밋 규칙을 지켜서 등록해주세요."
    $ git push origin 브랜치이름
    ```

5.  Compare & pull request
    (Merge 된 후, main 브랜치로 이동하여 upstream의 커밋 내역을 가져와서 동기화)

    ```
    $ git fetch upstream
    $ git merge upstream/main
    $ git push
    ```

## ✅ 커밋 규칙

- commit 메세지: [문제 출처(플랫폼)] 문제이름 / 난이도 / 걸린시간
- description: 문제 주소 (option)

  ```
  git commit -m "[BOJ] Hello World / 브론즈5 / 1분" -m "https://www.acmicpc.net/problem/2557"
  ```

- 플랫폼 작성법(통일)
  - [BOJ] - 백준
  - [PGS] - 프로그래머스
  - [LTC] - 리트코드
  - [CFS] - 코드포스
  - [SEA] - 삼성SW Expert Academy
  - [ETC] - 그외

## ✨ 참여인원

| 제목 | 내용    | 설명    | 하이    |
| ---- | ------- | ------- | ------- |
|      | 테스트2 | 테스트3 | 테스트4 |
