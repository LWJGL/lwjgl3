/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Reserved} &ndash; public definition reserves space for graphics API-specific implementation.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrGraphicsLuid {
 *     char Reserved[8];
 * }</code></pre>
 */
@NativeType("struct ovrGraphicsLuid")
public class OVRGraphicsLuid extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESERVED;

    static {
        Layout layout = __struct(
            __array(1, 8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESERVED = layout.offsetof(0);
    }

    OVRGraphicsLuid(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRGraphicsLuid} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRGraphicsLuid(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code Reserved} field. */
    @NativeType("char[8]")
    public ByteBuffer Reserved() { return nReserved(address()); }
    /** Returns the value at the specified index of the {@code Reserved} field. */
    @NativeType("char")
    public byte Reserved(int index) { return nReserved(address(), index); }

    // -----------------------------------

    /** Returns a new {@link OVRGraphicsLuid} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRGraphicsLuid malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRGraphicsLuid} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRGraphicsLuid calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRGraphicsLuid} instance allocated with {@link BufferUtils}. */
    public static OVRGraphicsLuid create() {
        return new OVRGraphicsLuid(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRGraphicsLuid} instance for the specified memory address. */
    public static OVRGraphicsLuid create(long address) {
        return new OVRGraphicsLuid(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRGraphicsLuid createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static OVRGraphicsLuid.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRGraphicsLuid} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRGraphicsLuid mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRGraphicsLuid} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRGraphicsLuid callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRGraphicsLuid} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRGraphicsLuid mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRGraphicsLuid} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRGraphicsLuid callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRGraphicsLuid.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRGraphicsLuid.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

        /**
         * Creates a new {@link OVRGraphicsLuid.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRGraphicsLuid#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRGraphicsLuid newInstance(long address) {
            return new OVRGraphicsLuid(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the {@code Reserved} field. */
        @NativeType("char[8]")
        public ByteBuffer Reserved() { return OVRGraphicsLuid.nReserved(address()); }
        /** Returns the value at the specified index of the {@code Reserved} field. */
        @NativeType("char")
        public byte Reserved(int index) { return OVRGraphicsLuid.nReserved(address(), index); }

    }

}