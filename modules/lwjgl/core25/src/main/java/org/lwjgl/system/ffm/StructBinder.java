/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.lwjgl.system.*;

import java.lang.foreign.*;
import java.util.function.*;

/**
 * The binder class for struct interfaces.
 *
 * <p>Struct binder implementations can be created using the builder returned by {@link FFM#ffmStruct ffmStruct}.</p>
 */
public non-sealed interface StructBinder<T> extends GroupBinder<StructLayout, T> {
    @Override
    StructBinder<T> withByteAlignment(long byteAlignment);

    @Override
    default StructBinder<T> set(MemorySegment segment, T value) {
        copy(value, get(segment));
        return this;
    }

    @Override
    default StructBinder<T> set(MemorySegment segment, long offset, T value) {
        copy(value, get(segment, offset));
        return this;
    }

    @Override
    default StructBinder<T> setAtIndex(MemorySegment segment, long index, T value) {
        copy(value, getAtIndex(segment, index));
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

    @Override
    default StructArray<T> malloc(SegmentStack stack, long elementCount) {
        return new StructArray<>(this, stack.allocate(layout(), elementCount));
    }

    @Override
    default StructArray<T> allocate(SegmentStack stack, long elementCount) {
        return new StructArray<>(this, stack.calloc(layout(), elementCount));
    }

    @Override
    default StructArray<T> allocate(SegmentAllocator allocator, long elementCount) {
        return new StructArray<>(this, allocator.allocate(layout(), elementCount));
    }

}