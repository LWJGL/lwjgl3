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

public sealed interface GroupArray<L extends GroupLayout, T>
    extends Pointer, Iterable<T>
    permits StructArray, UnionArray {

    GroupBinder<L, T> binder();

    MemorySegment segment();

    T get(long index);
    GroupArray<L, T> set(long index, T value);

    <GA extends GroupArray<L, T>> GA copy(long thisIndex, GA other, long otherIndex, long length);

    void clear(long fromIndex, long toIndex);

    GroupArray<L, T> apply(long index, Consumer<T> consumer);

    GroupArray<L, T> slice(long index);
    GroupArray<L, T> slice(long index, long elementCount);

    default long length() {
        return segment().byteSize() / binder().sizeof();
    }

    default <GA extends GroupArray<L, T>> GA copy(GA dst) {
        return copy(0L, dst, 0L, length());
    }
    default <GA extends GroupArray<L, T>> GA copy(GA dst, long length) {
        return copy(0L, dst, 0L, length);
    }

    default void clear()   { clear(0L, length()); }

    default long sizeof()  { return binder().sizeof() * length(); }
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

    default Stream<T> stream() {
        return binder().stream(segment());
    }

    default Stream<T> parallelStream() {
        return binder().parallelStream(segment());
    }

}