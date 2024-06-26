/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;

import java.lang.foreign.*;
import java.util.*;
import java.util.function.*;

final class GroupSpliterator<L extends GroupLayout, T> implements Spliterator<T> {
    private final GroupBinder<L, T> binder;
    private final MemorySegment     segment;

    private long index;

    private final long fence;

    GroupSpliterator(GroupBinder<L, T> binder, MemorySegment segment, long index, long fence) {
        this.binder = binder;
        this.segment = segment;
        this.index = index;
        this.fence = fence;
    }

    @Override
    public boolean tryAdvance(Consumer<? super T> action) {
        Objects.requireNonNull(action);

        if (index < fence) {
            action.accept(binder.getAtIndex(segment, index++));
            return true;
        }

        return false;
    }

    @Override
    public @Nullable Spliterator<T> trySplit() {
        var lo  = index;
        var mid = (lo + fence) >>> 1;

        return lo < mid
            ? new GroupSpliterator<>(binder, segment, lo, index = mid)
            : null;
    }

    @Override
    public long estimateSize() {
        return fence - index;
    }

    @Override
    public int characteristics() {
        return Spliterator.ORDERED | Spliterator.IMMUTABLE | Spliterator.NONNULL | Spliterator.SIZED | Spliterator.SUBSIZED;
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        var i = index;
        try {
            for (; i < fence; i++) {
                action.accept(binder.getAtIndex(segment, i));
            }
        } finally {
            index = i;
        }
    }

    @Override
    public Comparator<? super T> getComparator() {
        throw new IllegalStateException();
    }

}