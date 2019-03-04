def histogram(str):
    dic = dict()
    for s in str:
        dic[s] = str.count(s)
    return dic
