# Better Understanding through Bytecode

## Outline

* JVM Runtime
  * Stacks rule everything around me
    * Threads and the call stack
    * Execution stack per method
  * Bytecodes
    * javap
    * Anatomy of a bytecode (optional params, actually bytes)
    * load
    * store
    * Constant pool
    * new/dup/<init>
    * get/putfield
    * if/goto (look ma, no loops!)
    * invoke methods
* Concurrency
  * We can see the interleaving between threads
* Tail Call
  * Top level functions in Kotlin, but still need a class in bytecode!
  * GOTO makes everything better
* Coroutines
  * Like before, lots extra generated on our behalf!
  * State machine for each of our steps
  * Following method calls

## Resources

* [Java Virtual Machine Spec: Instruction Set](https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-6.html)
* [Fantastic Bytecodes & How To Interpret Them](https://www.youtube.com/watch?v=fozu0H_5C4I) by Ben Evans
