/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct epoll_event {
 *     uint32_t {@link #events};
 *     {@link EpollData epoll_data_t} {@link #data};
 * }</code></pre>
 */
@NativeType("struct epoll_event")
public class EpollEvent extends Struct<EpollEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EVENTS,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(EpollData.SIZEOF, EpollData.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EVENTS = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    protected EpollEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected EpollEvent create(long address, @Nullable ByteBuffer container) {
        return new EpollEvent(address, container);
    }

    /**
     * Creates a {@code EpollEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EpollEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** epoll events */
    @NativeType("uint32_t")
    public int events() { return nevents(address()); }
    /** user data variable */
    @NativeType("epoll_data_t")
    public EpollData data() { return ndata(address()); }

    /** Sets the specified value to the {@link #events} field. */
    public EpollEvent events(@NativeType("uint32_t") int value) { nevents(address(), value); return this; }
    /** Copies the specified {@link EpollData} to the {@link #data} field. */
    public EpollEvent data(@NativeType("epoll_data_t") EpollData value) { ndata(address(), value); return this; }
    /** Passes the {@link #data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public EpollEvent data(java.util.function.Consumer<EpollData> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public EpollEvent set(
        int events,
        EpollData data
    ) {
        events(events);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EpollEvent set(EpollEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EpollEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EpollEvent malloc() {
        return new EpollEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code EpollEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EpollEvent calloc() {
        return new EpollEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code EpollEvent} instance allocated with {@link BufferUtils}. */
    public static EpollEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new EpollEvent(memAddress(container), container);
    }

    /** Returns a new {@code EpollEvent} instance for the specified memory address. */
    public static EpollEvent create(long address) {
        return new EpollEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EpollEvent createSafe(long address) {
        return address == NULL ? null : new EpollEvent(address, null);
    }

    /**
     * Returns a new {@link EpollEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EpollEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EpollEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EpollEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EpollEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EpollEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link EpollEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EpollEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EpollEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code EpollEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EpollEvent malloc(MemoryStack stack) {
        return new EpollEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code EpollEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EpollEvent calloc(MemoryStack stack) {
        return new EpollEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link EpollEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EpollEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EpollEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EpollEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #events}. */
    public static int nevents(long struct) { return UNSAFE.getInt(null, struct + EpollEvent.EVENTS); }
    /** Unsafe version of {@link #data}. */
    public static EpollData ndata(long struct) { return EpollData.create(struct + EpollEvent.DATA); }

    /** Unsafe version of {@link #events(int) events}. */
    public static void nevents(long struct, int value) { UNSAFE.putInt(null, struct + EpollEvent.EVENTS, value); }
    /** Unsafe version of {@link #data(EpollData) data}. */
    public static void ndata(long struct, EpollData value) { memCopy(value.address(), struct + EpollEvent.DATA, EpollData.SIZEOF); }

    // -----------------------------------

    /** An array of {@link EpollEvent} structs. */
    public static class Buffer extends StructBuffer<EpollEvent, Buffer> implements NativeResource {

        private static final EpollEvent ELEMENT_FACTORY = EpollEvent.create(-1L);

        /**
         * Creates a new {@code EpollEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EpollEvent#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected EpollEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link EpollEvent#events} field. */
        @NativeType("uint32_t")
        public int events() { return EpollEvent.nevents(address()); }
        /** @return a {@link EpollData} view of the {@link EpollEvent#data} field. */
        @NativeType("epoll_data_t")
        public EpollData data() { return EpollEvent.ndata(address()); }

        /** Sets the specified value to the {@link EpollEvent#events} field. */
        public EpollEvent.Buffer events(@NativeType("uint32_t") int value) { EpollEvent.nevents(address(), value); return this; }
        /** Copies the specified {@link EpollData} to the {@link EpollEvent#data} field. */
        public EpollEvent.Buffer data(@NativeType("epoll_data_t") EpollData value) { EpollEvent.ndata(address(), value); return this; }
        /** Passes the {@link EpollEvent#data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public EpollEvent.Buffer data(java.util.function.Consumer<EpollData> consumer) { consumer.accept(data()); return this; }

    }

}