import sys
from collections import deque

def find(x, y, shark, sea, n):
    visited = [[0] * n for _ in range(n)]
    queue = deque([(x, y)])
    visited[x][y] = 1
    fish = []

    while queue:
        i, j = queue.popleft()
        di, dj = [-1, 1, 0, 0], [0, 0, -1, 1]
        for k in range(4):
            ni, nj = i + di[k], j + dj[k]
            if 0 <= ni < n and 0 <= nj < n and visited[ni][nj] == 0:
                if sea[ni][nj] <= shark:
                    visited[ni][nj] = visited[i][j] + 1
                    queue.append((ni, nj))
                    if 0 < sea[ni][nj] < shark:
                        fish.append((visited[ni][nj] - 1, ni, nj))
    return sorted(fish)


n = int(sys.stdin.readline().strip())
sea = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
shark = 2
sec = 0
eat = 0

x = y = 0

for a in range(n):
    for b in range(n):
        if sea[a][b] == 9:
            sea[a][b] = 0
            x, y = a, b

while True:
    food = find(x, y, shark, sea, n)

    if food:
        distance, nx, ny = food[0]
        sec += distance
        x, y = nx, ny
        sea[x][y] = 0
        eat += 1
        if eat == shark:
            eat = 0
            shark += 1
    else:
        break

print(sec)
