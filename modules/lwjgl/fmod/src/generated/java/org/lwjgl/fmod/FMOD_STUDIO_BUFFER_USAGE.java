/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_STUDIO_BUFFER_USAGE {
 *     {@link FMOD_STUDIO_BUFFER_INFO FMOD_STUDIO_BUFFER_INFO} studiocommandqueue;
 *     {@link FMOD_STUDIO_BUFFER_INFO FMOD_STUDIO_BUFFER_INFO} studiohandle;
 * }</code></pre>
 */
public class FMOD_STUDIO_BUFFER_USAGE extends Struct<FMOD_STUDIO_BUFFER_USAGE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STUDIOCOMMANDQUEUE,
        STUDIOHANDLE;

    static {
        Layout layout = __struct(
            __member(FMOD_STUDIO_BUFFER_INFO.SIZEOF, FMOD_STUDIO_BUFFER_INFO.ALIGNOF),
            __member(FMOD_STUDIO_BUFFER_INFO.SIZEOF, FMOD_STUDIO_BUFFER_INFO.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STUDIOCOMMANDQUEUE = layout.offsetof(0);
        STUDIOHANDLE = layout.offsetof(1);
    }

    protected FMOD_STUDIO_BUFFER_USAGE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_BUFFER_USAGE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_BUFFER_USAGE(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_BUFFER_USAGE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_BUFFER_USAGE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FMOD_STUDIO_BUFFER_INFO} view of the {@code studiocommandqueue} field. */
    public FMOD_STUDIO_BUFFER_INFO studiocommandqueue() { return nstudiocommandqueue(address()); }
    /** @return a {@link FMOD_STUDIO_BUFFER_INFO} view of the {@code studiohandle} field. */
    public FMOD_STUDIO_BUFFER_INFO studiohandle() { return nstudiohandle(address()); }

    /** Copies the specified {@link FMOD_STUDIO_BUFFER_INFO} to the {@code studiocommandqueue} field. */
    public FMOD_STUDIO_BUFFER_USAGE studiocommandqueue(FMOD_STUDIO_BUFFER_INFO value) { nstudiocommandqueue(address(), value); return this; }
    /** Passes the {@code studiocommandqueue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_STUDIO_BUFFER_USAGE studiocommandqueue(java.util.function.Consumer<FMOD_STUDIO_BUFFER_INFO> consumer) { consumer.accept(studiocommandqueue()); return this; }
    /** Copies the specified {@link FMOD_STUDIO_BUFFER_INFO} to the {@code studiohandle} field. */
    public FMOD_STUDIO_BUFFER_USAGE studiohandle(FMOD_STUDIO_BUFFER_INFO value) { nstudiohandle(address(), value); return this; }
    /** Passes the {@code studiohandle} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_STUDIO_BUFFER_USAGE studiohandle(java.util.function.Consumer<FMOD_STUDIO_BUFFER_INFO> consumer) { consumer.accept(studiohandle()); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_BUFFER_USAGE set(
        FMOD_STUDIO_BUFFER_INFO studiocommandqueue,
        FMOD_STUDIO_BUFFER_INFO studiohandle
    ) {
        studiocommandqueue(studiocommandqueue);
        studiohandle(studiohandle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_BUFFER_USAGE set(FMOD_STUDIO_BUFFER_USAGE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_BUFFER_USAGE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_BUFFER_USAGE malloc() {
        return new FMOD_STUDIO_BUFFER_USAGE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_BUFFER_USAGE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_BUFFER_USAGE calloc() {
        return new FMOD_STUDIO_BUFFER_USAGE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_BUFFER_USAGE} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_BUFFER_USAGE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_BUFFER_USAGE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_BUFFER_USAGE} instance for the specified memory address. */
    public static FMOD_STUDIO_BUFFER_USAGE create(long address) {
        return new FMOD_STUDIO_BUFFER_USAGE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable FMOD_STUDIO_BUFFER_USAGE createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_BUFFER_USAGE(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_USAGE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_USAGE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_USAGE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_USAGE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_USAGE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_USAGE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_BUFFER_USAGE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_USAGE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static FMOD_STUDIO_BUFFER_USAGE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_BUFFER_USAGE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_BUFFER_USAGE malloc(MemoryStack stack) {
        return new FMOD_STUDIO_BUFFER_USAGE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_BUFFER_USAGE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_BUFFER_USAGE calloc(MemoryStack stack) {
        return new FMOD_STUDIO_BUFFER_USAGE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_USAGE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_USAGE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_USAGE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_USAGE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #studiocommandqueue}. */
    public static FMOD_STUDIO_BUFFER_INFO nstudiocommandqueue(long struct) { return FMOD_STUDIO_BUFFER_INFO.create(struct + FMOD_STUDIO_BUFFER_USAGE.STUDIOCOMMANDQUEUE); }
    /** Unsafe version of {@link #studiohandle}. */
    public static FMOD_STUDIO_BUFFER_INFO nstudiohandle(long struct) { return FMOD_STUDIO_BUFFER_INFO.create(struct + FMOD_STUDIO_BUFFER_USAGE.STUDIOHANDLE); }

    /** Unsafe version of {@link #studiocommandqueue(FMOD_STUDIO_BUFFER_INFO) studiocommandqueue}. */
    public static void nstudiocommandqueue(long struct, FMOD_STUDIO_BUFFER_INFO value) { memCopy(value.address(), struct + FMOD_STUDIO_BUFFER_USAGE.STUDIOCOMMANDQUEUE, FMOD_STUDIO_BUFFER_INFO.SIZEOF); }
    /** Unsafe version of {@link #studiohandle(FMOD_STUDIO_BUFFER_INFO) studiohandle}. */
    public static void nstudiohandle(long struct, FMOD_STUDIO_BUFFER_INFO value) { memCopy(value.address(), struct + FMOD_STUDIO_BUFFER_USAGE.STUDIOHANDLE, FMOD_STUDIO_BUFFER_INFO.SIZEOF); }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_BUFFER_USAGE} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_BUFFER_USAGE, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_BUFFER_USAGE ELEMENT_FACTORY = FMOD_STUDIO_BUFFER_USAGE.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_BUFFER_USAGE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_BUFFER_USAGE#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected FMOD_STUDIO_BUFFER_USAGE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FMOD_STUDIO_BUFFER_INFO} view of the {@code studiocommandqueue} field. */
        public FMOD_STUDIO_BUFFER_INFO studiocommandqueue() { return FMOD_STUDIO_BUFFER_USAGE.nstudiocommandqueue(address()); }
        /** @return a {@link FMOD_STUDIO_BUFFER_INFO} view of the {@code studiohandle} field. */
        public FMOD_STUDIO_BUFFER_INFO studiohandle() { return FMOD_STUDIO_BUFFER_USAGE.nstudiohandle(address()); }

        /** Copies the specified {@link FMOD_STUDIO_BUFFER_INFO} to the {@code studiocommandqueue} field. */
        public FMOD_STUDIO_BUFFER_USAGE.Buffer studiocommandqueue(FMOD_STUDIO_BUFFER_INFO value) { FMOD_STUDIO_BUFFER_USAGE.nstudiocommandqueue(address(), value); return this; }
        /** Passes the {@code studiocommandqueue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_STUDIO_BUFFER_USAGE.Buffer studiocommandqueue(java.util.function.Consumer<FMOD_STUDIO_BUFFER_INFO> consumer) { consumer.accept(studiocommandqueue()); return this; }
        /** Copies the specified {@link FMOD_STUDIO_BUFFER_INFO} to the {@code studiohandle} field. */
        public FMOD_STUDIO_BUFFER_USAGE.Buffer studiohandle(FMOD_STUDIO_BUFFER_INFO value) { FMOD_STUDIO_BUFFER_USAGE.nstudiohandle(address(), value); return this; }
        /** Passes the {@code studiohandle} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_STUDIO_BUFFER_USAGE.Buffer studiohandle(java.util.function.Consumer<FMOD_STUDIO_BUFFER_INFO> consumer) { consumer.accept(studiohandle()); return this; }

    }

}