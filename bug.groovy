def list = [1, 2, 3, 4, 5]

println list.eachWithIndex { item, index ->
    if (item % 2 == 0) {
        list.remove(index)
    }
}

println list