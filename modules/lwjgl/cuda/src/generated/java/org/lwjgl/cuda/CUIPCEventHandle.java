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

import static org.lwjgl.cuda.CU41.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUipcEventHandle {
 *     char reserved[CU_IPC_HANDLE_SIZE];
 * }</code></pre>
 */
@NativeType("struct CUipcEventHandle")
public class CUIPCEventHandle extends Struct implements NativeResource {

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
        return wrap(CUIPCEventHandle.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUIPCEventHandle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUIPCEventHandle calloc() {
        return wrap(CUIPCEventHandle.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUIPCEventHandle} instance allocated with {@link BufferUtils}. */
    public static CUIPCEventHandle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUIPCEventHandle.class, memAddress(container), container);
    }

    /** Returns a new {@code CUIPCEventHandle} instance for the specified memory address. */
    public static CUIPCEventHandle create(long address) {
        return wrap(CUIPCEventHandle.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUIPCEventHandle createSafe(long address) {
        return address == NULL ? null : wrap(CUIPCEventHandle.class, address);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUIPCEventHandle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUIPCEventHandle.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CUIPCEventHandle} instance allocated on the thread-local {@link MemoryStack}. */
    public static CUIPCEventHandle mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CUIPCEventHandle} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CUIPCEventHandle callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CUIPCEventHandle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUIPCEventHandle mallocStack(MemoryStack stack) {
        return wrap(CUIPCEventHandle.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUIPCEventHandle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUIPCEventHandle callocStack(MemoryStack stack) {
        return wrap(CUIPCEventHandle.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUIPCEventHandle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUIPCEventHandle.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUIPCEventHandle#SIZEOF}, and its mark will be undefined.
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