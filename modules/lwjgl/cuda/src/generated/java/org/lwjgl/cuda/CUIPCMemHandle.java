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
 * struct CUipcMemHandle {
 *     char reserved[CU_IPC_HANDLE_SIZE];
 * }</code></pre>
 */
@NativeType("struct CUipcMemHandle")
public class CUIPCMemHandle extends Struct implements NativeResource {

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

    /**
     * Creates a {@code CUIPCMemHandle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUIPCMemHandle(ByteBuffer container) {
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
    public CUIPCMemHandle reserved(@NativeType("char[CU_IPC_HANDLE_SIZE]") ByteBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUIPCMemHandle reserved(int index, @NativeType("char") byte value) { nreserved(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUIPCMemHandle set(CUIPCMemHandle src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUIPCMemHandle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUIPCMemHandle malloc() {
        return wrap(CUIPCMemHandle.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUIPCMemHandle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUIPCMemHandle calloc() {
        return wrap(CUIPCMemHandle.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUIPCMemHandle} instance allocated with {@link BufferUtils}. */
    public static CUIPCMemHandle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUIPCMemHandle.class, memAddress(container), container);
    }

    /** Returns a new {@code CUIPCMemHandle} instance for the specified memory address. */
    public static CUIPCMemHandle create(long address) {
        return wrap(CUIPCMemHandle.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUIPCMemHandle createSafe(long address) {
        return address == NULL ? null : wrap(CUIPCMemHandle.class, address);
    }

    /**
     * Returns a new {@link CUIPCMemHandle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCMemHandle.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUIPCMemHandle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCMemHandle.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUIPCMemHandle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCMemHandle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUIPCMemHandle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUIPCMemHandle.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUIPCMemHandle.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUIPCMemHandle mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUIPCMemHandle callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUIPCMemHandle mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUIPCMemHandle callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUIPCMemHandle.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUIPCMemHandle.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUIPCMemHandle.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUIPCMemHandle.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUIPCMemHandle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUIPCMemHandle malloc(MemoryStack stack) {
        return wrap(CUIPCMemHandle.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUIPCMemHandle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUIPCMemHandle calloc(MemoryStack stack) {
        return wrap(CUIPCMemHandle.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUIPCMemHandle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUIPCMemHandle.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUIPCMemHandle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUIPCMemHandle.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #reserved}. */
    public static ByteBuffer nreserved(long struct) { return memByteBuffer(struct + CUIPCMemHandle.RESERVED, CU_IPC_HANDLE_SIZE); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static byte nreserved(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUIPCMemHandle.RESERVED + check(index, CU_IPC_HANDLE_SIZE) * 1);
    }

    /** Unsafe version of {@link #reserved(ByteBuffer) reserved}. */
    public static void nreserved(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, CU_IPC_HANDLE_SIZE); }
        memCopy(memAddress(value), struct + CUIPCMemHandle.RESERVED, value.remaining() * 1);
    }
    /** Unsafe version of {@link #reserved(int, byte) reserved}. */
    public static void nreserved(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CUIPCMemHandle.RESERVED + check(index, CU_IPC_HANDLE_SIZE) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link CUIPCMemHandle} structs. */
    public static class Buffer extends StructBuffer<CUIPCMemHandle, Buffer> implements NativeResource {

        private static final CUIPCMemHandle ELEMENT_FACTORY = CUIPCMemHandle.create(-1L);

        /**
         * Creates a new {@code CUIPCMemHandle.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUIPCMemHandle#SIZEOF}, and its mark will be undefined.
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
        protected CUIPCMemHandle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code reserved} field. */
        @NativeType("char[CU_IPC_HANDLE_SIZE]")
        public ByteBuffer reserved() { return CUIPCMemHandle.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("char")
        public byte reserved(int index) { return CUIPCMemHandle.nreserved(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code reserved} field. */
        public CUIPCMemHandle.Buffer reserved(@NativeType("char[CU_IPC_HANDLE_SIZE]") ByteBuffer value) { CUIPCMemHandle.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUIPCMemHandle.Buffer reserved(int index, @NativeType("char") byte value) { CUIPCMemHandle.nreserved(address(), index, value); return this; }

    }

}