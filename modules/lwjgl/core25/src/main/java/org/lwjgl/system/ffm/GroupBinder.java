/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.runtime.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public sealed interface GroupBinder<L extends GroupLayout, T>
    extends Binder<T>
    permits StructBinder, UnionBinder {

    // core methods, bytecode generated at runtime

    L layout(); // stored in trusted final field (i.e. effectively constant)

    T ofAddress(long address); // calls group implementation constructor (via MethodHandle)

    long addressOf(T value); // returns group implementation address (via MethodHandle)

    T copy(T src, T dst); // inlined + optimized memcpy
    T clear(T value); // inlined + optimized memset

    // these skip bounds/alignment checking when FFMConfig::checks is disabled
    T get(MemorySegment segment);
    T get(MemorySegment segment, long offset);
    T getAtIndex(MemorySegment segment, long index);

    // helper methods, non-generated

    default long sizeof()                           { return layout().byteSize(); }
    default long alignof()                          { return layout().byteAlignment(); }

    default @Nullable T ofAddressSafe(long address) { return address == NULL ? null : ofAddress(address); }

    default long addressOfSafe(@Nullable T value)   { return value == null ? NULL : addressOf(value); }

    GroupBinder<L, T> set(MemorySegment segment, T value);
    GroupBinder<L, T> set(MemorySegment segment, long offset, T value);
    GroupBinder<L, T> setAtIndex(MemorySegment segment, long index, T value);

    GroupArray<L, T> array(MemorySegment segment);
    GroupArray<L, T> array(MemorySegment segment, long index);
    GroupArray<L, T> array(MemorySegment segment, long index, long elementCount);

    default MemorySegment asSegment(T value) {
        return MemorySegment
            .ofAddress(addressOf(value))
            .reinterpret(layout().byteSize());
    }

    default MemorySegment malloc(SegmentStack stack)                    { return stack.allocate(layout()); }
    default MemorySegment malloc(SegmentStack stack, long elementCount) { return stack.allocate(layout(), elementCount); }

    default MemorySegment allocate(SegmentStack stack)                  { return stack.calloc(layout()); }
    default MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout()); // TODO: skip 1 inline level?
        /*var layout = layout();
        return DEBUG
            ? allocator.allocate(layout)
            : allocator.allocate(layout.byteSize(), layout.byteAlignment());*/
    }

    default MemorySegment allocate(SegmentStack stack, long elementCount) { return stack.calloc(layout(), elementCount); }
    default MemorySegment allocate(SegmentAllocator allocator, long elementCount) {
        return allocator.allocate(layout(), elementCount); // TODO: inefficient?
        /*var layout = layout();
        return DEBUG
            ? allocator.allocate(layout, elementCount)
            : allocator.allocate(elementCount * layout.byteSize(), layout.byteAlignment());*/
    }

    GroupBinder<L, T> apply(MemorySegment array, long offset, Consumer<T> consumer);
    GroupBinder<L, T> applyAtIndex(MemorySegment segment, long index, Consumer<T> consumer);

    default void forEach(MemorySegment segment, Consumer<? super T> action) {
        Objects.requireNonNull(action);

        var sizeof = sizeof();
        var fence  = segment.byteSize();
        for (long offset = 0; offset + sizeof <= fence; offset += sizeof) {
            action.accept(get(segment, offset));
        }
    }

    default Iterable<T> iterable(MemorySegment segment) {
        return () -> iterator(segment);
    }

    default Iterator<T> iterator(MemorySegment segment) {
        return new Iterator<>() {
            private final long sizeof = sizeof();
            private final long fence  = segment.byteSize();

            private long offset;

            @Override
            public boolean hasNext() {
                return offset + sizeof <= fence;
            }

            @Override
            public T next() {
                if (DEBUG && fence < offset + sizeof) {
                    throw new NoSuchElementException();
                }
                try {
                    return get(segment, offset);
                } finally {
                    offset += sizeof;
                }
            }
        };
    }

    default Spliterator<T> spliterator(MemorySegment segment) {
        return new GroupSpliterator<>(this, segment, 0L, segment.byteSize() / sizeof());
    }

    default Stream<T> stream(MemorySegment segment) {
        return StreamSupport.stream(spliterator(segment), false);
    }

    default Stream<T> parallelStream(MemorySegment segment) {
        return StreamSupport.stream(spliterator(segment), true);
    }

    // TODO: remove these?

    default MemorySegment asSlice(MemorySegment segment, long index) {
        return segment.asSlice(layout().byteSize() * index);
    }

    default MemorySegment asSlice(MemorySegment segment, long index, long elementCount) {
        var sizeof = layout().byteSize();
        return segment.asSlice(sizeof * index, sizeof * elementCount, layout().byteAlignment());
    }

    default MemorySegment reinterpret(MemorySegment addr) {
        return addr.reinterpret(layout().byteSize());
    }
    default MemorySegment reinterpret(MemorySegment addr, long elementCount) {
        return addr.reinterpret(layout().byteSize() * elementCount);
    }
    default MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize(), arena, cleanup);
    }
    default MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }

    // This method is necessary because the equals/hashCode/toString methods generated for group types should never dereference pointer values. Because
    // pointer accessors often use higher level types, private methods are generated that return the raw pointer values. However, these private methods cannot
    // be referenced nominally in the ObjectMethods.bootstrap indy call site.

    // PROBLEM 1: The getter MethodHandles cannot be declared nominally with the hidden class as receiver type.
    // Instead, the getter names are passed as strings in the invokedynamic call site and unreflected here.

    // PROBLEM 2: The equals/hashCode/toString methods themselves cannot be declared with the hidden class as receiver type.
    // The ObjectMethods.bootstrap call site is generated with the hidden class as receiver type, then it is unwrapped, adapted with a cast, and wrapped again.

    /**
     * Bootstrap method to generate the {@link Object#equals(Object)}, {@link Object#hashCode()}, and {@link Object#toString()} methods in group types, with the
     * same semantics as the corresponding methods in {@link java.lang.Record} types.
     */
    @SuppressWarnings("unused")
    static Object bootstrapRecord(
        MethodHandles.Lookup lookup,
        String methodName,
        TypeDescriptor type,
        String names,
        String... getterNames
    ) throws Throwable {
        // The hidden class that implements the group interface
        var recordClass = lookup.lookupClass();

        var methodType = (MethodType)type;

        // TODO: handle overloads
        // unreflect the member getters
        var methodHandles = new MethodHandle[getterNames.length];
        for (var i = 0; i < getterNames.length; i++) {
            methodHandles[i] = lookup.unreflect(recordClass.getDeclaredMethod(getterNames[i]));
        }

        Object callSite;
        if ("toString".equals(methodName)) {
            // cast receiver to the group interface, to avoid printing the hidden class name
            var recordInterface = recordClass.getInterfaces()[0];
            for (var i = 0; i < methodHandles.length; i++) {
                methodHandles[i] = methodHandles[i].asType(methodHandles[i].type().changeParameterType(0, recordInterface));
            }

            // delegate to the JDK bootstrap implementation using the group interface as receiver
            callSite = ObjectMethods.bootstrap(lookup, methodName, methodType, recordInterface, names, methodHandles);
        } else {
            // delegate to the JDK bootstrap implementation using the group hidden class as receiver
            var adapted = ((ConstantCallSite)ObjectMethods
                .bootstrap(lookup, methodName, methodType.changeParameterType(0, recordClass), recordClass, names, methodHandles))
                .getTarget() // unwrap the call site
                .asType(methodType); // cast to the nominally-valid method type

            // wrap again
            callSite = new ConstantCallSite(adapted);
        }
        return callSite;
    }

}