# Foreign Function and Memory API (FFM) support

Starting with `3.4.0`, when LWJGL runs on JDK 25 or later, a new backend is available that implements foreign function downcalls/upcalls and off-heap memory accesses using the JDK's FFM API. It is a full replacement for the traditional bindings based on JNI for downcalls, libffi+JNI for upcalls and `sun.misc.Unsafe` for off-heap memory accesses.

With the new backend, LWJGL is fully functional when running with `--sun-misc-unsafe-memory-access=deny`.

This backend is implemented using the new runtime bindings generator in the core module and the `org.lwjgl.system.ffm` package. The API is available to users, under preview status. It can be used to easily define and access custom bindings, for APIs not supported by LWJGL.

## Known issues with the FFM backend

* The maximum buffer size is `Integer.MAX_VALUE - 8` bytes.
  - This is a limitation of the FFM API.
  - Creating a multi-byte buffer with size larger than 2GB is no longer supported, because every buffer instantiation has to go through `ByteBuffer`.
  - Such uses cases should be replaced with `MemorySegment`, which supports 64-bit addressing.
* Upcalls are not allowed to throw exceptions.
  - This is a limitation of the FFM API.
  - By default, upcalls will be wrapped in a try-catch handler that will print uncaught exceptions.
  - Use `Configuration.FFM_UPCALL_EXCEPTION_CATCH` to disable this behavior.
  - Use `Configuration.FFM_UPCALL_EXCEPTION_HANDLER` to install a custom handler.
* Upcalls have 3-4x lower overhead compared to JNI, but they are more expensive to instantiate (roughly 15x slower).
* Upcalls that return a struct by-value cannot be used in multiple threads concurrently.
  - Currently, this is relevant only to `YGMeasureFunc` in the Yoga module.
* Upcalls must be allocated in an FFM `Arena`.
  - By default, this is done implicitly by LWJGL. Freeing the upcall instance will close the arena, which will release the associated resources.
  - Use `Configuration.FFM_UPCALL_ARENA` to change the implicit arena type.
  - The new `memScoped*` methods in `MemoryUtil` can be used to specify a user managed arena for upcall allocation, which is highly recommended.

## Known issues with the bindings generator

* The entire API is in preview and subject to change.
* The amount of QoL transformations supported is limited.
  - The plan is to support more of the transformations available in the offline Kotlin generator.

## Known issues with the design

* If the FFM backend is problematic for an application, it cannot currently be disabled on JDK 25+.
  - Even if reverting to the Unsafe backend would resolve the issue.
  - Could ship two core module artifacts, a default with the FFM backend and an alternative without it.
* Need to decide on `null` vs `MemorySegment.NULL` at the LWJGL API level.
* The struct/union DSL needs work.
  - Could wrap FFM layouts to a custom API with helper instance methods.

## Using the bindings generator

The bindings generator takes Java interfaces as input and produces implementations of those interfaces for downcalls, upcalls and structs/unions. 

### Annotations

Annotations may be used to configure the generated bindings, to produce APIs that are more fluent and convenient to use.

The annotation play the same role as the modifiers in the offline Kotlin generator. More annnotations will be added in the future.

### Binders

Upcalls and structs/unions require the definition of a binder instance for each type. The binder provides utility methods for allocating & managing the corresponding type.

### Performance characteristics

* Everything is lazy.
  - A downcall will not be generated unless the corresponding interface method is invoked.
  - An upcall will not be generated unless its binder instance is accessed.
  - A struct/union will not be generated unless its binder instance is accessed.
* The implementations are created as hidden classes, with trusted final fields (or class data), similar to Java records.
  - This makes everything inlineable by the JIT compiler.
  - Implementation instances should be stored as `static final` fields when possible, to make this even easier.
  - Effectively, there is no performance overhead compared to direct FFM API usage.
* Zero-allocation & copies of struct/union instances are inlined at the bytecode level, with hardcoded byte counts.
* Upgrading to JDK 26 or newer is highly recommended.
  - It is the first version that JIT compiles on-heap & off-heap memory accesses in a uniform fashion.
  - Off-heap accesses now routinely get optimizations like loop unrolling and SIMD vectorization, even in loops with `long` (i.e. 64-bit) indexing.

### Examples

* For complete demos, see the `modules/samples/src/test/java25/org/lwjgl/demo` package.
* For benchmarks, see the `modules/samples/src/test/java25/org/lwjgl/jmh` package.
* For struct/union examples, see the `modules/lwjgl/core25/src/test/java/org/lwjgl/system/ffm/StructTest.java` unit test.