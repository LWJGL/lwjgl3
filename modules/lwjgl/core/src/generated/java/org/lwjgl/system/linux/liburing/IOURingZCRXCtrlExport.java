/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct zcrx_ctrl_export {
 *     __u32 zcrx_fd;
 *     __u32 __resv1[11];
 * }}</pre>
 */
@NativeType("struct zcrx_ctrl_export")
public class IOURingZCRXCtrlExport extends Struct<IOURingZCRXCtrlExport> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ZCRX_FD,
        __RESV1;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 11)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ZCRX_FD = layout.offsetof(0);
        __RESV1 = layout.offsetof(1);
    }

    protected IOURingZCRXCtrlExport(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXCtrlExport create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXCtrlExport(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXCtrlExport} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXCtrlExport(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code zcrx_fd} field. */
    @NativeType("__u32")
    public int zcrx_fd() { return nzcrx_fd(address()); }

    /** Sets the specified value to the {@code zcrx_fd} field. */
    public IOURingZCRXCtrlExport zcrx_fd(@NativeType("__u32") int value) { nzcrx_fd(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingZCRXCtrlExport set(IOURingZCRXCtrlExport src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXCtrlExport} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingZCRXCtrlExport malloc() {
        return new IOURingZCRXCtrlExport(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXCtrlExport} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingZCRXCtrlExport calloc() {
        return new IOURingZCRXCtrlExport(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXCtrlExport} instance allocated with {@link BufferUtils}. */
    public static IOURingZCRXCtrlExport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXCtrlExport(memAddress(container), container);
    }

    /** Returns a new {@code IOURingZCRXCtrlExport} instance for the specified memory address. */
    public static IOURingZCRXCtrlExport create(long address) {
        return new IOURingZCRXCtrlExport(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXCtrlExport createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXCtrlExport(address, null);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrlExport.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrlExport.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrlExport.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrlExport.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrlExport.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrlExport.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingZCRXCtrlExport.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrlExport.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXCtrlExport.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingZCRXCtrlExport} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXCtrlExport malloc(MemoryStack stack) {
        return new IOURingZCRXCtrlExport(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingZCRXCtrlExport} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXCtrlExport calloc(MemoryStack stack) {
        return new IOURingZCRXCtrlExport(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrlExport.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrlExport.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrlExport.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrlExport.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #zcrx_fd}. */
    public static int nzcrx_fd(long struct) { return memGetInt(struct + IOURingZCRXCtrlExport.ZCRX_FD); }
    static IntBuffer n__resv1(long struct) { return memIntBuffer(struct + IOURingZCRXCtrlExport.__RESV1, 11); }
    static int n__resv1(long struct, int index) {
        return memGetInt(struct + IOURingZCRXCtrlExport.__RESV1 + check(index, 11) * 4);
    }

    /** Unsafe version of {@link #zcrx_fd(int) zcrx_fd}. */
    public static void nzcrx_fd(long struct, int value) { memPutInt(struct + IOURingZCRXCtrlExport.ZCRX_FD, value); }
    static void n__resv1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 11); }
        memCopy(memAddress(value), struct + IOURingZCRXCtrlExport.__RESV1, value.remaining() * 4);
    }
    static void n__resv1(long struct, int index, int value) {
        memPutInt(struct + IOURingZCRXCtrlExport.__RESV1 + check(index, 11) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingZCRXCtrlExport} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXCtrlExport, Buffer> implements NativeResource {

        private static final IOURingZCRXCtrlExport ELEMENT_FACTORY = IOURingZCRXCtrlExport.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXCtrlExport.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXCtrlExport#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingZCRXCtrlExport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code zcrx_fd} field. */
        @NativeType("__u32")
        public int zcrx_fd() { return IOURingZCRXCtrlExport.nzcrx_fd(address()); }

        /** Sets the specified value to the {@code zcrx_fd} field. */
        public IOURingZCRXCtrlExport.Buffer zcrx_fd(@NativeType("__u32") int value) { IOURingZCRXCtrlExport.nzcrx_fd(address(), value); return this; }

    }

}