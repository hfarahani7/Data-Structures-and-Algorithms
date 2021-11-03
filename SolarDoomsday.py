import math

def solution1(area):
    # return list of the areas of the largest squares
    # that can be made out of the provided area, largest first
    if area < 1 or area > 1000000:
        raise ValueError("area should be between 1 and 1000000 inclusive")
    if math.sqrt(area).is_integer():
        return [area]
    biggest = int(math.sqrt(area)) ** 2
    return [biggest] + solution1(area - biggest)

def solution2(area):
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
print(solution2(area))
