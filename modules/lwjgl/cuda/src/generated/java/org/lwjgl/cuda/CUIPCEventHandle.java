/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.cuda.CU.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUipcEventHandle {
 *     char reserved[CU_IPC_HANDLE_SIZE];
 * }</code></pre>
 */
@NativeType("struct CUipcEventHandle")
public class CUIPCEventHandle extends Struct<CUIPCEventHandle> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESERVED;

    static {
        Layout layout = __struct(
            __array(1, CU_IPC_HANDLE_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESERVED = layout.offsetof(0);
    }

    protected CUIPCEventHandle(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUIPCEventHandle create(long address, @Nullable ByteBuffer container) {
        return new CUIPCEventHandle(address, container);
    }

    /**
     * Creates a {@code CUIPCEventHandle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUIPCEventHandle(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code reserved} field. */
    @NativeType("char[CU_IPC_HANDLE_SIZE]")
    public ByteBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("char")
    public byte reserved(int index) { return nreserved(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code reserved} field. */
    public CUIPCEventHandle reserved(@NativeType("char[CU_IPC_HANDLE_SIZE]") ByteBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUIPCEventHandle reserved(int index, @NativeType("char") byte value) { nreserved(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUIPCEventHandle set(CUIPCEventHandle src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUIPCEventHandle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUIPCEventHandle malloc() {
        return new CUIPCEventHandle(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUIPCEventHandle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUIPCEventHandle calloc() {
        return new CUIPCEventHandle(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUIPCEventHandle} instance allocated with {@link BufferUtils}. */
    public static CUIPCEventHandle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUIPCEventHandle(memAddress(container), container);
    }

    /** Returns a new {@code CUIPCEventHandle} instance for the specified memory address. */
    public static CUIPCEventHandle create(long address) {
        return new CUIPCEventHandle(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUIPCEventHandle createSafe(long address) {
        return address == NULL ? null : new CUIPCEventHandle(address, null);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUIPCEventHandle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUIPCEventHandle.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUIPCEventHandle mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUIPCEventHandle callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUIPCEventHandle mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUIPCEventHandle callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUIPCEventHandle.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUIPCEventHandle.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUIPCEventHandle.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUIPCEventHandle.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUIPCEventHandle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUIPCEventHandle malloc(MemoryStack stack) {
        return new CUIPCEventHandle(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUIPCEventHandle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUIPCEventHandle calloc(MemoryStack stack) {
        return new CUIPCEventHandle(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #reserved}. */
    public static ByteBuffer nreserved(long struct) { return memByteBuffer(struct + CUIPCEventHandle.RESERVED, CU_IPC_HANDLE_SIZE); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static byte nreserved(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUIPCEventHandle.RESERVED + check(index, CU_IPC_HANDLE_SIZE) * 1);
    }

    /** Unsafe version of {@link #reserved(ByteBuffer) reserved}. */
    public static void nreserved(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, CU_IPC_HANDLE_SIZE); }
        memCopy(memAddress(value), struct + CUIPCEventHandle.RESERVED, value.remaining() * 1);
    }
    /** Unsafe version of {@link #reserved(int, byte) reserved}. */
    public static void nreserved(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CUIPCEventHandle.RESERVED + check(index, CU_IPC_HANDLE_SIZE) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link CUIPCEventHandle} structs. */
    public static class Buffer extends StructBuffer<CUIPCEventHandle, Buffer> implements NativeResource {

        private static final CUIPCEventHandle ELEMENT_FACTORY = CUIPCEventHandle.create(-1L);

        /**
         * Creates a new {@code CUIPCEventHandle.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUIPCEventHandle#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUIPCEventHandle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code reserved} field. */
        @NativeType("char[CU_IPC_HANDLE_SIZE]")
        public ByteBuffer reserved() { return CUIPCEventHandle.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("char")
        public byte reserved(int index) { return CUIPCEventHandle.nreserved(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code reserved} field. */
        public CUIPCEventHandle.Buffer reserved(@NativeType("char[CU_IPC_HANDLE_SIZE]") ByteBuffer value) { CUIPCEventHandle.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUIPCEventHandle.Buffer reserved(int index, @NativeType("char") byte value) { CUIPCEventHandle.nreserved(address(), index, value); return this; }

    }

}