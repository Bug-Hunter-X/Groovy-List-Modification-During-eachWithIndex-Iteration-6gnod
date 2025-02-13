# Groovy List Modification During Iteration

This example demonstrates a common issue in Groovy when modifying a list while iterating over it using `eachWithIndex`.  The standard `eachWithIndex` iterator doesn't handle removals gracefully, potentially leading to skipped elements or `IndexOutOfBoundsException` errors.

The `bug.groovy` file shows the problem, and `bugSolution.groovy` offers a corrected approach.