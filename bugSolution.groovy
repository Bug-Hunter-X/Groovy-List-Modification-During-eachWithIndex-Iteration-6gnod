def list = [1, 2, 3, 4, 5]

// Create a copy of the list to avoid concurrent modification issues
println list.findAll { it % 2 != 0 }

//Alternatively, iterate over a copy of the list
//def newList = []
//list.eachWithIndex { item, index ->
//    if (item % 2 != 0) {
//        newList << item
//    }
//} 
//println newList