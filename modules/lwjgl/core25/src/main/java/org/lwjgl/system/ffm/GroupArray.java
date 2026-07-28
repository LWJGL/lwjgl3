/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.lwjgl.system.*;

import java.lang.foreign.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * Can be used to create a {@link MemorySegment} view as an array of structs or unions.
 *
 * <p>Instances of group arrays may be created with {@link StructBinder#array} or {@link UnionBinder#array}.</p>
 *
 * @see StructArray
 * @see UnionArray
 */
public sealed interface GroupArray<L extends GroupLayout, T>
    extends Pointer, Iterable<T>
    permits StructArray, UnionArray {

    /**
     * Returns the array memory address.
     *
     * <p>This address will be equal to the wrapped {@code MemorySegment} address.</p>
     */
    @Override long address();

    /**
     * Returns the binder used to access the array elements.
     *
     * @return the group binder
     */
    GroupBinder<L, T> binder();

    /**
     * Returns the wrapped memory segment.
     *
     * @return the memory segment
     */
    MemorySegment segment();

    /**
     * Returns the array element at the specified index.
     *
     * @param index the array index
     *
     * @return the array element
     */
    T get(long index);

    /**
     * Sets the array element at the specified index to the specified value.
     *
     * @param index the array index
     * @param value the new value
     *
     * @return this array
     */
    GroupArray<L, T> set(long index, T value);

    /**
     * Copies elements from this array to another array.
     *
     * @param thisIndex  the starting index in this array
     * @param other      the destination array
     * @param otherIndex the starting index in the destination array
     * @param length     the number of elements to copy
     *
     * @return this array
     */
    <GA extends GroupArray<L, T>> GroupArray<L, T> copy(long thisIndex, GA other, long otherIndex, long length);

    /**
     * Clears the elements in the specified index range.
     *
     * @param fromIndex the starting index (inclusive)
     * @param toIndex   the ending index (exclusive)
     */
    void clear(long fromIndex, long toIndex);

    /**
     * Applies the specified consumer to the element at the specified index.
     *
     * @param index    the array index
     * @param consumer the consumer to apply
     *
     * @return this array
     */
    GroupArray<L, T> apply(long index, Consumer<T> consumer);

    /**
     * Returns a new array that is a slice of this array starting at the specified index.
     *
     * @param index the starting index
     *
     * @return the sliced array
     */
    GroupArray<L, T> slice(long index);

    /**
     * Returns a new array that is a slice of this array starting at the specified index and containing the specified number of elements.
     *
     * @param index        the starting index
     * @param elementCount the number of elements in the slice
     *
     * @return the sliced array
     */
    GroupArray<L, T> slice(long index, long elementCount);

    /**
     * Returns the number of elements in this array.
     *
     * @return the number of elements
     */
    default long length() {
        return segment().byteSize() / binder().sizeof();
    }

    /**
     * Copies all elements from this array to the specified destination array.
     *
     * @param dst the destination array
     *
     * @return this array
     */
    default <GA extends GroupArray<L, T>> GroupArray<L, T> copy(GA dst) {
        return copy(0L, dst, 0L, length());
    }

    /**
     * Copies the specified number of elements from this array to the specified destination array.
     *
     * @param dst    the destination array
     * @param length the number of elements to copy
     *
     * @return this array
     */
    default <GA extends GroupArray<L, T>> GroupArray<L, T> copy(GA dst, long length) {
        return copy(0L, dst, 0L, length);
    }

    /** Clears all elements in this array. */
    default void clear() { clear(0L, length()); }

    /**
     * Returns the size in bytes of the array.
     *
     * @return the size in bytes
     */
    default long sizeof() { return binder().sizeof() * length(); }

    /**
     * Returns the alignment in bytes of the array.
     *
     * @return the alignment in bytes
     */
    default long alignof() { return binder().alignof(); }

    @Override
    default void forEach(Consumer<? super T> action) {
        binder().forEach(segment(), action);
    }

    @Override
    default Iterator<T> iterator() {
        return binder().iterator(segment());
    }

    @Override
    default Spliterator<T> spliterator() {
        return binder().spliterator(segment());
    }

    /**
     * Returns a sequential {@link Stream} with this array as its source.
     *
     * @return the new stream
     */
    default Stream<T> stream() {
        return binder().stream(segment());
    }

    /**
     * Returns a parallel {@link Stream} with this array as its source.
     *
     * @return the new stream
     */
    default Stream<T> parallelStream() {
        return binder().parallelStream(segment());
    }

}