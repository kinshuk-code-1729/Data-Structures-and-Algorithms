class Solution:
    def isPathCrossing(self, path: str) -> bool:
        visited = set()
        coord = {"N":[0,1],"S":[0,-1],"E":[1,0],"W":[-1,0]}
        X = 0
        Y = 0

        for k in path:
            visited.add((X,Y))
            x,y = coord[k]
            X += x
            Y += y 

            if (X,Y) in visited:
                return True
        
        return False