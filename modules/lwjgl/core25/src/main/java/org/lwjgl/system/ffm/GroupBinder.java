/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;
import org.lwjgl.system.ffm.mapping.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.runtime.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The base binder class for struct and union interfaces.
 *
 * <p>Group binder implementations can be created using the builders returned by {@link FFM#ffmStruct ffmStruct} and {@link FFM#ffmUnion ffmUnion}.</p>
 *
 * @see StructBinder
 * @see UnionBinder
 */
public sealed interface GroupBinder<L extends GroupLayout, T>
    extends Binder<T>, GroupMapping<L>
    permits StructBinder, UnionBinder {

    // core methods, bytecode generated at runtime

    /**
     * Returns the memory layout of the group type.
     *
     * @return the group layout
     */
    @Override
    L layout(); // stored in trusted final field (i.e. effectively constant)

    /**
     * Creates a group instance at the specified memory address.
     *
     * @param address the memory address
     *
     * @return the group instance
     */
    T ofAddress(long address); // calls group implementation constructor (via MethodHandle)

    /**
     * Returns the memory address of the specified group instance.
     *
     * @param value the group instance
     *
     * @return the memory address
     */
    long addressOf(T value); // returns group implementation address (via MethodHandle)

    /**
     * Copies the contents of the source group to the destination group.
     *
     * @param src the source group instance
     * @param dst the destination group instance
     *
     * @return the destination group instance
     */
    T copy(T src, T dst); // inlined + optimized memcpy

    /**
     * Clears the contents of the specified group instance.
     *
     * @param value the group instance
     *
     * @return the cleared group instance
     */
    T clear(T value); // inlined + optimized memset

    // these skip bounds/alignment checking when FFMConfig::checks is disabled

    /**
     * Returns a group instance mapped to the specified memory segment.
     *
     * @param segment the memory segment
     *
     * @return the group instance
     */
    T get(MemorySegment segment);

    /**
     * Returns a group instance mapped to the specified memory segment and offset.
     *
     * @param segment the memory segment
     * @param offset  the memory offset
     *
     * @return the group instance
     */
    T get(MemorySegment segment, long offset);

    /**
     * Returns a group instance mapped to the specified memory segment and index.
     *
     * @param segment the memory segment
     * @param index   the element index
     *
     * @return the group instance
     */
    T getAtIndex(MemorySegment segment, long index);

    // helper methods, non-generated

    /**
     * Returns the size of the group type, in bytes.
     *
     * @return the size
     */
    default long sizeof() { return layout().byteSize(); }

    /**
     * Returns the alignment of the group type, in bytes.
     *
     * @return the alignment
     */
    default long alignof() { return layout().byteAlignment(); }

    /**
     * Returns a group instance at the specified memory address, or {@code null} if the address is {@code NULL}.
     *
     * @param address the memory address
     *
     * @return the group instance, or {@code null} if the address is {@code NULL}
     */
    default @Nullable T ofAddressSafe(long address) { return address == NULL ? null : ofAddress(address); }

    /**
     * Returns the memory address of the specified group instance, or {@code NULL} if the instance is {@code null}.
     *
     * @param value the group instance
     *
     * @return the memory address, or {@code NULL} if the instance is {@code null}
     */
    default long addressOfSafe(@Nullable T value) { return value == null ? NULL : addressOf(value); }

    /**
     * Sets the contents of the specified memory segment to the specified group value.
     *
     * @param segment the memory segment
     * @param value   the group instance
     *
     * @return this binder
     */
    GroupBinder<L, T> set(MemorySegment segment, T value);

    /**
     * Sets the contents of the specified memory segment at the specified offset to the specified group value.
     *
     * @param segment the memory segment
     * @param offset  the memory offset
     * @param value   the group instance
     *
     * @return this binder
     */
    GroupBinder<L, T> set(MemorySegment segment, long offset, T value);

    /**
     * Sets the contents of the specified memory segment at the specified index to the specified group value.
     *
     * @param segment the memory segment
     * @param index   the element index
     * @param value   the group instance
     *
     * @return this binder
     */
    GroupBinder<L, T> setAtIndex(MemorySegment segment, long index, T value);

    /**
     * Returns a group array mapped to the specified memory segment.
     *
     * @param segment the memory segment
     *
     * @return the group array
     */
    GroupArray<L, T> array(MemorySegment segment);

    /**
     * Returns a group array mapped to the specified memory segment and starting at the specified index.
     *
     * @param segment the memory segment
     * @param index   the starting index
     *
     * @return the group array
     */
    GroupArray<L, T> array(MemorySegment segment, long index);

    /**
     * Returns a group array mapped to the specified memory segment and starting at the specified index, with the specified element count.
     *
     * @param segment      the memory segment
     * @param index        the starting index
     * @param elementCount the number of elements
     *
     * @return the group array
     */
    GroupArray<L, T> array(MemorySegment segment, long index, long elementCount);

    /**
     * Returns a memory segment view of the specified group instance.
     *
     * @param value the group instance
     *
     * @return the memory segment
     */
    default MemorySegment asSegment(T value) {
        return MemorySegment
            .ofAddress(addressOf(value))
            .reinterpret(layout().byteSize());
    }

    /**
     * Allocates a memory segment, without zero-initialization, for a single group instance on the specified segment stack.
     *
     * @param stack the segment stack
     *
     * @return the group instancen
     */
    default T malloc(SegmentStack stack) { return get(stack.allocate(layout())); }

    /**
     * Allocates a memory segment, without zero-initialization, for the specified number of group instances on the specified segment stack.
     *
     * @param stack        the segment stack
     * @param elementCount the number of elements
     *
     * @return the group array
     */
    GroupArray<L, T> malloc(SegmentStack stack, long elementCount);

    /**
     * Allocates a memory segment, without zero-initialization, for a single group instance using the specified segment allocator.
     *
     * @param stack the segment allocator
     *
     * @return the group instance
     */
    default T allocate(SegmentStack stack) { return get(stack.calloc(layout())); }

    /**
     * Allocates a memory segment for a single group instance using the specified segment allocator.
     *
     * @param allocator the segment allocator
     *
     * @return the group instance
     */
    default T allocate(SegmentAllocator allocator) {
        return get(allocator.allocate(layout())); // TODO: skip 1 inline level?
        /*var layout = layout();
        return DEBUG
            ? allocator.allocate(layout)
            : allocator.allocate(layout.byteSize(), layout.byteAlignment());*/
    }

    /**
     * Allocates a memory segment, with zero-initialization, for the specified number of group instances on the specified segment stack.
     *
     * @param stack        the segment stack
     * @param elementCount the number of elements
     *
     * @return the group array
     */
    GroupArray<L, T> allocate(SegmentStack stack, long elementCount);

    /**
     * Allocates a memory segment for the specified number of group instances using the specified segment allocator.
     *
     * @param allocator    the segment allocator
     * @param elementCount the number of elements
     *
     * @return the group array
     */
    GroupArray<L, T> allocate(SegmentAllocator allocator, long elementCount);

    /**
     * Applies the specified consumer to the group instance mapped to the specified memory segment and offset.
     *
     * @param array    the memory segment
     * @param offset   the offset of the group instance
     * @param consumer the consumer to apply
     *
     * @return this binder
     */
    GroupBinder<L, T> apply(MemorySegment array, long offset, Consumer<T> consumer);

    /**
     * Applies the specified consumer to the group instance mapped to the specified memory segment and index.
     *
     * @param segment  the memory segment
     * @param index    the index of the group instance
     * @param consumer the consumer to apply
     *
     * @return this binder
     */
    GroupBinder<L, T> applyAtIndex(MemorySegment segment, long index, Consumer<T> consumer);

    /**
     * Performs the given action for each group instance in the specified memory segment.
     *
     * @param segment the memory segment
     * @param action  the action to perform
     */
    default void forEach(MemorySegment segment, Consumer<? super T> action) {
        Objects.requireNonNull(action);

        var sizeof = sizeof();
        var fence  = segment.byteSize();
        for (long offset = 0; offset + sizeof <= fence; offset += sizeof) {
            action.accept(get(segment, offset));
        }
    }

    /**
     * Returns an {@link Iterable} over the group instances in the specified memory segment.
     *
     * @param segment the memory segment
     *
     * @return an iterable over the group instances
     */
    default Iterable<T> iterable(MemorySegment segment) {
        return () -> iterator(segment);
    }

    /**
     * Returns an {@link Iterator} over the group instances in the specified memory segment.
     *
     * @param segment the memory segment
     *
     * @return an iterator over the group instances
     */
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

    /**
     * Returns a {@link Spliterator} over the group instances in the specified memory segment.
     *
     * @param segment the memory segment
     *
     * @return a spliterator over the group instances
     */
    default Spliterator<T> spliterator(MemorySegment segment) {
        return new GroupSpliterator<>(this, segment, 0L, segment.byteSize() / sizeof());
    }

    /**
     * Returns a sequential {@link Stream} over the group instances in the specified memory segment.
     *
     * @param segment the memory segment
     *
     * @return a sequential stream over the group instances
     */
    default Stream<T> stream(MemorySegment segment) {
        return StreamSupport.stream(spliterator(segment), false);
    }

    /**
     * Returns a parallel {@link Stream} over the group instances in the specified memory segment.
     *
     * @param segment the memory segment
     *
     * @return a parallel stream over the group instances
     */
    default Stream<T> parallelStream(MemorySegment segment) {
        return StreamSupport.stream(spliterator(segment), true);
    }

    // TODO: remove these?

    /**
     * Returns a slice of the specified memory segment at the specified index.
     *
     * @param segment the memory segment
     * @param index   the index of the group instance
     *
     * @return a slice of the memory segment
     */
    default MemorySegment asSlice(MemorySegment segment, long index) {
        return segment.asSlice(layout().byteSize() * index);
    }

    /**
     * Returns a slice of the specified memory segment at the specified index and element count.
     *
     * @param segment      the memory segment
     * @param index        the index of the group instance
     * @param elementCount the number of elements in the group
     *
     * @return a slice of the memory segment
     */
    default MemorySegment asSlice(MemorySegment segment, long index, long elementCount) {
        var sizeof = layout().byteSize();
        return segment.asSlice(sizeof * index, sizeof * elementCount, layout().byteAlignment());
    }

    /**
     * Reinterprets the specified memory segment to the size of the group type.
     *
     * @param addr the memory segment to reinterpret
     *
     * @return a new memory segment with the reinterpreted size
     */
    default MemorySegment reinterpret(MemorySegment addr) {
        return addr.reinterpret(layout().byteSize());
    }

    /**
     * Reinterprets the specified memory segment to the size of the group type multiplied by the specified element count.
     *
     * @param addr         the memory segment to reinterpret
     * @param elementCount the number of elements in the group
     *
     * @return a new memory segment with the reinterpreted size
     */
    default MemorySegment reinterpret(MemorySegment addr, long elementCount) {
        return addr.reinterpret(layout().byteSize() * elementCount);
    }
    /**
     * Reinterprets the specified memory segment to the size of the group type, using the specified arena and cleanup action.
     *
     * @param addr    the memory segment to reinterpret
     * @param arena   the arena to use
     * @param cleanup the cleanup action
     *
     * @return a new memory segment with the reinterpreted size
     */
    default MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize(), arena, cleanup);
    }

    /**
     * Reinterprets the specified memory segment to the size of the group type multiplied by the specified element count, using the specified arena and cleanup
     *
     * @param addr         the memory segment to reinterpret
     * @param elementCount the number of elements in the group
     * @param arena        the arena to use
     * @param cleanup      the cleanup action
     *
     * @return a new memory segment with the reinterpreted sizen
     */
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
     * same semantics as the corresponding methods in {@link java.lang.Record} types. [INTERNAL API]
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