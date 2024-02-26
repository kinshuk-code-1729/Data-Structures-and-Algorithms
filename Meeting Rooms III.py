class Solution:
    def mostBooked(self, n: int, meetings: List[List[int]]) -> int:
        meetings.sort()

        avl = [i for i in range(n)]
        used = [] # (end time, room no.)
        count = [0] * n # schedule

        for start, end in meetings:
            # finish meet
            while used and start >= used[0][0]:
                _, room = heapq.heappop(used)
                heapq.heappush(avl, room) 
            # all rooms occupied
            if not avl:
                endTime, room = heapq.heappop(used)
                end = endTime + (end - start)
                heapq.heappush(avl, room)

            room = heapq.heappop(avl)
            heapq.heappush(used, (end, room))
            count[room] += 1
            
        return count.index(max(count))
