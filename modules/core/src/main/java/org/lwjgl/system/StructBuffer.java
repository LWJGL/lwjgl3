/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Base class of struct custom buffers. */
public abstract class StructBuffer<T extends Struct, SELF extends StructBuffer<T, SELF>> extends CustomBuffer<SELF> implements Iterable<T> {

    protected StructBuffer(ByteBuffer container, int remaining) {
        this(memAddress(container), container, -1, 0, remaining, remaining);
    }

    protected StructBuffer(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address, container, mark, position, limit, capacity);
    }

    /**
     * Relative <i>get</i> method. Reads the struct at this buffer's current position, and then increments the position.
     *
     * <p>The struct instance returned is a view of the buffer at the current position. Changes to this buffer's content will be visible in the struct instance
     * and vice versa.</p>
     *
     * @return the struct at the buffer's current position
     *
     * @throws java.nio.BufferUnderflowException If the buffer's current position is not smaller than its limit
     */
    public T get() {
        return newInstance(address + nextGetIndex() * sizeof());
    }

    /**
     * Relative <i>get</i> method. Reads the struct data at this buffer's current position into the specified struct, and then increments the position.
     *
     * @return the struct at the buffer's current position
     *
     * @throws java.nio.BufferUnderflowException If the buffer's current position is not smaller than its limit
     */
    public SELF get(T value) {
        memCopy(address + nextGetIndex() * sizeof(), value.address(), sizeof());
        return self();
    }

    /**
     * Relative <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>Writes the specified struct into this buffer at the current position, and then increments the position.</p>
     *
     * @param value the struct to be written
     *
     * @return This buffer
     *
     * @throws java.nio.BufferOverflowException If this buffer's current position is not smaller than its limit
     * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
     */
    public SELF put(T value) {
        memCopy(value.address(), address + nextPutIndex() * sizeof(), sizeof());
        return self();
    }

    /**
     * Absolute <i>get</i> method. Reads the struct at the specified index.
     *
     * <p>The struct instance returned is a view of the buffer at the specified position. Changes to this buffer's content will be visible in the struct
     * instance and vice versa.</p>
     *
     * @param index the index from which the struct will be read
     *
     * @return the struct at the specified index
     *
     * @throws IndexOutOfBoundsException If <tt>index</tt> is negative or not smaller than the buffer's limit
     */
    public T get(int index) {
        return newInstance(address + checkIndex(index) * sizeof());
    }

    /**
     * Absolute <i>get</i> method. Reads the struct data at the specified index into the specified struct.
     *
     * @param index the index from which the struct will be read
     *
     * @return the struct at the specified index
     *
     * @throws IndexOutOfBoundsException If <tt>index</tt> is negative or not smaller than the buffer's limit
     */
    public SELF get(int index, T value) {
        memCopy(address + checkIndex(index) * sizeof(), value.address(), sizeof());
        return self();
    }

    /**
     * Absolute <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>Writes the specified struct into this buffer at the specified index.</p>
     *
     * @param index the index at which the struct will be written
     * @param value the struct value to be written
     *
     * @return This buffer
     *
     * @throws IndexOutOfBoundsException        If <tt>index</tt> is negative or not smaller than the buffer's limit
     * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
     */
    public SELF put(int index, T value) {
        memCopy(value.address(), address + checkIndex(index) * sizeof(), sizeof());
        return self();
    }

    // --------------------------------------

    @Override public Iterator<T> iterator() {
        return new Iterator<T>() {
            int cursor = position;

            @Override public boolean hasNext() {
                return cursor < limit;
            }

            @Override public T next() {
                return get(cursor++);
            }

            @Override public void forEachRemaining(Consumer<? super T> action) {
                Objects.requireNonNull(action);
                int i = cursor;
                for (; i < limit; i++) {
                    action.accept(get(i));
                }
                cursor = i;
            }
        };
    }

    @Override public void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (int i = position; i < limit; i++) {
            action.accept(get(i));
        }
    }

    @Override public Spliterator<T> spliterator() {
        return new StructSpliterator();
    }

    private class StructSpliterator implements Spliterator<T> {
        private int index;

        private final int fence;

        StructSpliterator() {
            this(position, limit);
        }

        StructSpliterator(int origin, int fence) {
            this.index = origin;
            this.fence = fence;
        }

        @Override
        public boolean tryAdvance(Consumer<? super T> action) {
            Objects.requireNonNull(action);

            if (index < fence) {
                action.accept(get(index++));
                return true;
            }

            return false;
        }
        @Override
        public Spliterator<T> trySplit() {
            int lo = index,
                mid = (lo + fence) >>> 1;

            return lo < mid
                ? new StructSpliterator(lo, index = mid)
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
            int i = index;
            for (; i < fence; i++) {
                action.accept(get(i));
            }
            index = i;
        }

        @Override
        public Comparator<? super T> getComparator() {
            throw new IllegalStateException();
        }
    }

    /** Returns a sequential {@code Stream} with this struct buffer as its source. */
    public Stream<T> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    /** Returns a parallel {@code Stream} with this struct buffer as its source. */
    public Stream<T> parallelStream() {
        return StreamSupport.stream(spliterator(), true);
    }

    // --------------------------------------

    protected abstract T newInstance(long address);

}