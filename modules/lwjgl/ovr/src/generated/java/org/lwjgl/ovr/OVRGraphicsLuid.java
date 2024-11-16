/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Identifies a graphics device in a platform-specific way.
 * 
 * <p>For Windows this is a LUID type.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrGraphicsLuid {
 *     char {@link #Reserved}[8];
 * }</code></pre>
 */
@NativeType("struct ovrGraphicsLuid")
public class OVRGraphicsLuid extends Struct<OVRGraphicsLuid> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESERVED;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, POINTER_SIZE,
            __array(1, 8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESERVED = layout.offsetof(0);
    }

    protected OVRGraphicsLuid(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRGraphicsLuid create(long address, @Nullable ByteBuffer container) {
        return new OVRGraphicsLuid(address, container);
    }

    /**
     * Creates a {@code OVRGraphicsLuid} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRGraphicsLuid(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** public definition reserves space for graphics API-specific implementation. */
    @NativeType("char[8]")
    public ByteBuffer Reserved() { return nReserved(address()); }
    /** public definition reserves space for graphics API-specific implementation. */
    @NativeType("char")
    public byte Reserved(int index) { return nReserved(address(), index); }

    // -----------------------------------

    /** Returns a new {@code OVRGraphicsLuid} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRGraphicsLuid malloc() {
        return new OVRGraphicsLuid(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRGraphicsLuid} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRGraphicsLuid calloc() {
        return new OVRGraphicsLuid(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRGraphicsLuid} instance allocated with {@link BufferUtils}. */
    public static OVRGraphicsLuid create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRGraphicsLuid(memAddress(container), container);
    }

    /** Returns a new {@code OVRGraphicsLuid} instance for the specified memory address. */
    public static OVRGraphicsLuid create(long address) {
        return new OVRGraphicsLuid(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRGraphicsLuid createSafe(long address) {
        return address == NULL ? null : new OVRGraphicsLuid(address, null);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRGraphicsLuid.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OVRGraphicsLuid.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRGraphicsLuid mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRGraphicsLuid callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRGraphicsLuid mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRGraphicsLuid callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRGraphicsLuid.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRGraphicsLuid.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRGraphicsLuid.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRGraphicsLuid.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRGraphicsLuid} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRGraphicsLuid malloc(MemoryStack stack) {
        return new OVRGraphicsLuid(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRGraphicsLuid} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRGraphicsLuid calloc(MemoryStack stack) {
        return new OVRGraphicsLuid(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Reserved}. */
    public static ByteBuffer nReserved(long struct) { return memByteBuffer(struct + OVRGraphicsLuid.RESERVED, 8); }
    /** Unsafe version of {@link #Reserved(int) Reserved}. */
    public static byte nReserved(long struct, int index) {
        return memGetByte(struct + OVRGraphicsLuid.RESERVED + check(index, 8) * 1);
    }

    // -----------------------------------

    /** An array of {@link OVRGraphicsLuid} structs. */
    public static class Buffer extends StructBuffer<OVRGraphicsLuid, Buffer> implements NativeResource {

        private static final OVRGraphicsLuid ELEMENT_FACTORY = OVRGraphicsLuid.create(-1L);

        /**
         * Creates a new {@code OVRGraphicsLuid.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRGraphicsLuid#SIZEOF}, and its mark will be undefined.</p>
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
        protected OVRGraphicsLuid getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link OVRGraphicsLuid#Reserved} field. */
        @NativeType("char[8]")
        public ByteBuffer Reserved() { return OVRGraphicsLuid.nReserved(address()); }
        /** @return the value at the specified index of the {@link OVRGraphicsLuid#Reserved} field. */
        @NativeType("char")
        public byte Reserved(int index) { return OVRGraphicsLuid.nReserved(address(), index); }

    }

}