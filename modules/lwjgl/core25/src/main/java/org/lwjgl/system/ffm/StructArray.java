/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.foreign.*;
import java.util.function.*;

public record StructArray<T>(
    StructBinder<T> binder,
    MemorySegment segment
) implements GroupArray<StructLayout, T> {

    @Override
    public long address() {
        return segment.address();
    }

    @Override
    public T get(long index) {
        return binder.getAtIndex(segment, index);
    }

    @Override
    public StructArray<T> set(long index, T value) {
        binder.setAtIndex(segment, index, value);
        return this;
    }

    @Override
    public <GA extends GroupArray<StructLayout, T>> GA copy(long thisIndex, GA other, long otherIndex, long length) {
        /*if (CHECKS) {
            Objects.checkFromIndexSize(thisIndex, length, this.length());
            Objects.checkFromIndexSize(otherIndex, length, other.length());
        }*/
        for (var i = 0L; i < length; i++) {
            binder.copy(
                binder.getAtIndex(this.segment, thisIndex + i),
                binder.getAtIndex(other.segment(), otherIndex + i)
            );
        }
        return other;
    }

    @Override
    public void clear(long fromIndex, long toIndex) {
        /*if (CHECKS) {
            Objects.checkFromToIndex(fromIndex, toIndex, this.length());
        }*/
        for (var i = fromIndex; i < toIndex; i++) {
            binder.clear(
                binder.getAtIndex(segment, i)
            );
        }
    }

    @Override
    public StructArray<T> apply(long index, Consumer<T> consumer) {
        /*if (CHECKS) {
            Objects.checkIndex(index, length());
        }*/
        binder.applyAtIndex(segment, index, consumer);
        return this;
    }

    @Override
    public StructArray<T> slice(long index) {
        return new StructArray<>(binder, segment.asSlice(index * binder.sizeof()));
    }

    @Override
    public StructArray<T> slice(long index, long elementCount) {
        var sizeof = binder.sizeof();
        return new StructArray<>(binder, segment.asSlice(index * sizeof, elementCount * sizeof));
    }

}