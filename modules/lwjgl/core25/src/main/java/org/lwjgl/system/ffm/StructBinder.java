/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.foreign.*;
import java.util.function.*;

public non-sealed interface StructBinder<T> extends GroupBinder<StructLayout, T> {
    @Override
    default StructBinder<T> set(MemorySegment segment, T value) {
        copy(value, get(segment));
        return this;
    }

    @Override
    default StructBinder<T> set(MemorySegment array, long offset, T value) {
        copy(value, get(array, offset));
        return this;
    }

    @Override
    default StructBinder<T> setAtIndex(MemorySegment array, long index, T value) {
        copy(value, getAtIndex(array, index));
        return this;
    }

    @Override
    default StructBinder<T> apply(MemorySegment array, long offset, Consumer<T> consumer) {
        consumer.accept(get(array, offset));
        return this;
    }

    @Override
    default StructBinder<T> applyAtIndex(MemorySegment segment, long index, Consumer<T> consumer) {
        consumer.accept(getAtIndex(segment, index));
        return this;
    }

    @Override
    default StructArray<T> array(MemorySegment segment) {
        return new StructArray<>(this, segment);
    }

    @Override
    default StructArray<T> array(MemorySegment segment, long index) {
        return new StructArray<>(this, asSlice(segment, index));
    }

    @Override
    default StructArray<T> array(MemorySegment segment, long index, long elementCount) {
        return new StructArray<>(this, asSlice(segment, index, elementCount));
    }
}