    # For google Foobar challenge
    # return list of the areas of the largest squares that can be made out of the provided area, largest first
import math

def solution(area):
    ar = area
    list_squares = []
    
    while(ar > 0):
        i = 0
        while(i*i <= ar):
            i = i+1
        i = i-1
        list_squares.append(i*i)
        ar = ar - (i*i)
        
    return(list_squares)

area = 11000
print(solution(area))
