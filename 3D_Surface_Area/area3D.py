def surfaceArea(Matrix, H, W):
    t = H*W * 2
    for i in range(H):
        for j in range(W):
            if i == 0:
                t += Matrix[i][j]
            if j == 0:
                t += Matrix[i][j]
            if i == H-1:
                t += Matrix[i][j]
            if j == W-1:
                t += Matrix[i][j]

            if j != 0:
                t += abs(Matrix[i][j] - Matrix[i][j-1])
            if i != 0:
                t += abs(Matrix[i][j] - Matrix[i-1][j])
            
    return t


input_val = list(map(int,input().strip().split()))
H, W = input_val[0] , input_val[1]
toyMatrix = []
for i in range(H):
    temp = list(map(int,input().strip().split()))
    toyMatrix.append(temp)
result = surfaceArea(toyMatrix, H, W)
print (result)
