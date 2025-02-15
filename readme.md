work in progress

# TODO

1. Implement break and continue
2. Implement comma operator
3. Implement ternary operator
4. Implement printing expression result on evaluation when using REPL
5. Implement anonymous functions
6. Extend the resolver to report an error if a local variable is never used
7. Extend the resolver to associate a unique index for each local variable declared in a scope. When resolving a variable access, look up both the
   scope the variable is in and its index and store that. In the interpreter, use that to quickly access a variable
   by its index instead of using a map.
8. Add support for static methods. Use a class keyword preceding the method to indicate a static method that hangs off the class object.
   Hint: Make LoxClass extend LoxInstance and go from there.
9. Extend Lox to support getter methods. These are declared without a parameter list.
   The body of the getter is executed when a property with that name is accessed.
10. Add feature: read user input from stdin
11. Implement different kinds of inheritance
