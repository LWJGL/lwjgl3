/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

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
 * union LARGE_INTEGER {
 *     struct {
 *         DWORD LowPart;
 *         LONG HighPart;
 *     } u;
 *     LONGLONG QuadPart;
 * }</code></pre>
 */
public class LARGE_INTEGER extends Struct<LARGE_INTEGER> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        U,
            U_LOWPART,
            U_HIGHPART,
        QUADPART;

    static {
        Layout layout = __union(
            __struct(
                __member(4),
                __member(4)
            ),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        U = layout.offsetof(0);
            U_LOWPART = layout.offsetof(1);
            U_HIGHPART = layout.offsetof(2);
        QUADPART = layout.offsetof(3);
    }

    protected LARGE_INTEGER(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LARGE_INTEGER create(long address, @Nullable ByteBuffer container) {
        return new LARGE_INTEGER(address, container);
    }

    /**
     * Creates a {@code LARGE_INTEGER} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LARGE_INTEGER(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code u.LowPart} field. */
    @NativeType("DWORD")
    public int u_LowPart() { return nu_LowPart(address()); }
    /** @return the value of the {@code u.HighPart} field. */
    @NativeType("LONG")
    public int u_HighPart() { return nu_HighPart(address()); }
    /** @return the value of the {@code QuadPart} field. */
    @NativeType("LONGLONG")
    public long QuadPart() { return nQuadPart(address()); }

    /** Sets the specified value to the {@code LowPart} field. */
    public LARGE_INTEGER u_LowPart(@NativeType("DWORD") int value) { nu_LowPart(address(), value); return this; }
    /** Sets the specified value to the {@code HighPart} field. */
    public LARGE_INTEGER u_HighPart(@NativeType("LONG") int value) { nu_HighPart(address(), value); return this; }
    /** Sets the specified value to the {@code QuadPart} field. */
    public LARGE_INTEGER QuadPart(@NativeType("LONGLONG") long value) { nQuadPart(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LARGE_INTEGER set(LARGE_INTEGER src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LARGE_INTEGER} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LARGE_INTEGER malloc() {
        return new LARGE_INTEGER(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LARGE_INTEGER} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LARGE_INTEGER calloc() {
        return new LARGE_INTEGER(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LARGE_INTEGER} instance allocated with {@link BufferUtils}. */
    public static LARGE_INTEGER create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LARGE_INTEGER(memAddress(container), container);
    }

    /** Returns a new {@code LARGE_INTEGER} instance for the specified memory address. */
    public static LARGE_INTEGER create(long address) {
        return new LARGE_INTEGER(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LARGE_INTEGER createSafe(long address) {
        return address == NULL ? null : new LARGE_INTEGER(address, null);
    }

    /**
     * Returns a new {@link LARGE_INTEGER.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LARGE_INTEGER.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LARGE_INTEGER.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LARGE_INTEGER.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LARGE_INTEGER.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LARGE_INTEGER.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LARGE_INTEGER.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LARGE_INTEGER.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LARGE_INTEGER.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LARGE_INTEGER} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LARGE_INTEGER malloc(MemoryStack stack) {
        return new LARGE_INTEGER(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LARGE_INTEGER} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LARGE_INTEGER calloc(MemoryStack stack) {
        return new LARGE_INTEGER(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LARGE_INTEGER.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LARGE_INTEGER.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LARGE_INTEGER.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LARGE_INTEGER.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #u_LowPart}. */
    public static int nu_LowPart(long struct) { return UNSAFE.getInt(null, struct + LARGE_INTEGER.U_LOWPART); }
    /** Unsafe version of {@link #u_HighPart}. */
    public static int nu_HighPart(long struct) { return UNSAFE.getInt(null, struct + LARGE_INTEGER.U_HIGHPART); }
    /** Unsafe version of {@link #QuadPart}. */
    public static long nQuadPart(long struct) { return UNSAFE.getLong(null, struct + LARGE_INTEGER.QUADPART); }

    /** Unsafe version of {@link #u_LowPart(int) u_LowPart}. */
    public static void nu_LowPart(long struct, int value) { UNSAFE.putInt(null, struct + LARGE_INTEGER.U_LOWPART, value); }
    /** Unsafe version of {@link #u_HighPart(int) u_HighPart}. */
    public static void nu_HighPart(long struct, int value) { UNSAFE.putInt(null, struct + LARGE_INTEGER.U_HIGHPART, value); }
    /** Unsafe version of {@link #QuadPart(long) QuadPart}. */
    public static void nQuadPart(long struct, long value) { UNSAFE.putLong(null, struct + LARGE_INTEGER.QUADPART, value); }

    // -----------------------------------

    /** An array of {@link LARGE_INTEGER} structs. */
    public static class Buffer extends StructBuffer<LARGE_INTEGER, Buffer> implements NativeResource {

        private static final LARGE_INTEGER ELEMENT_FACTORY = LARGE_INTEGER.create(-1L);

        /**
         * Creates a new {@code LARGE_INTEGER.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LARGE_INTEGER#SIZEOF}, and its mark will be undefined.</p>
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
        protected LARGE_INTEGER getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code u.LowPart} field. */
        @NativeType("DWORD")
        public int u_LowPart() { return LARGE_INTEGER.nu_LowPart(address()); }
        /** @return the value of the {@code u.HighPart} field. */
        @NativeType("LONG")
        public int u_HighPart() { return LARGE_INTEGER.nu_HighPart(address()); }
        /** @return the value of the {@code QuadPart} field. */
        @NativeType("LONGLONG")
        public long QuadPart() { return LARGE_INTEGER.nQuadPart(address()); }

        /** Sets the specified value to the {@code LowPart} field. */
        public LARGE_INTEGER.Buffer u_LowPart(@NativeType("DWORD") int value) { LARGE_INTEGER.nu_LowPart(address(), value); return this; }
        /** Sets the specified value to the {@code HighPart} field. */
        public LARGE_INTEGER.Buffer u_HighPart(@NativeType("LONG") int value) { LARGE_INTEGER.nu_HighPart(address(), value); return this; }
        /** Sets the specified value to the {@code QuadPart} field. */
        public LARGE_INTEGER.Buffer QuadPart(@NativeType("LONGLONG") long value) { LARGE_INTEGER.nQuadPart(address(), value); return this; }

    }

}