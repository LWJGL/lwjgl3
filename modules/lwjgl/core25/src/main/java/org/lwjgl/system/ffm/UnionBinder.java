/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.lwjgl.system.*;

import java.lang.foreign.*;
import java.util.function.*;

/**
 * The binder class for union interfaces.
 *
 * <p>Union binder implementations can be created using the builder returned by {@link FFM#ffmUnion ffmUnion}.</p>
 */
public non-sealed interface UnionBinder<T> extends GroupBinder<UnionLayout, T> {
    @Override
    default UnionBinder<T> set(MemorySegment segment, T value) {
        copy(value, get(segment));
        return this;
    }

    @Override
    default UnionBinder<T> set(MemorySegment segment, long offset, T value) {
        copy(value, get(segment, offset));
        return this;
    }

    @Override
    default UnionBinder<T> setAtIndex(MemorySegment segment, long index, T value) {
        copy(value, getAtIndex(segment, index));
        return this;
    }

    @Override
    default UnionBinder<T> apply(MemorySegment array, long offset, Consumer<T> consumer) {
        consumer.accept(get(array, offset));
        return this;
    }

    @Override
    default UnionBinder<T> applyAtIndex(MemorySegment segment, long index, Consumer<T> consumer) {
        consumer.accept(getAtIndex(segment, index));
        return this;
    }

    @Override
    default UnionArray<T> array(MemorySegment segment) {
        return new UnionArray<>(this, segment);
    }

    @Override
    default UnionArray<T> array(MemorySegment segment, long index) {
        return new UnionArray<>(this, asSlice(segment, index));
    }

    @Override
    default UnionArray<T> array(MemorySegment segment, long index, long elementCount) {
        return new UnionArray<>(this, asSlice(segment, index, elementCount));
    }

    @Override
    default UnionArray<T> malloc(SegmentStack stack, long elementCount) {
        return new UnionArray<>(this, stack.allocate(layout(), elementCount));
    }

    @Override
    default UnionArray<T> allocate(SegmentStack stack, long elementCount) {
        return new UnionArray<>(this, stack.calloc(layout(), elementCount));
    }

    @Override
    default UnionArray<T> allocate(SegmentAllocator allocator, long elementCount) {
        return new UnionArray<>(this, allocator.allocate(layout(), elementCount));
    }

}