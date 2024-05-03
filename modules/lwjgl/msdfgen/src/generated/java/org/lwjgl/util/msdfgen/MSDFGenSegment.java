/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct msdf_segment {
 *     int type;
 *     void * handle;
 * }</code></pre>
 */
@NativeType("struct msdf_segment")
public class MSDFGenSegment extends Struct<MSDFGenSegment> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        HANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        HANDLE = layout.offsetof(1);
    }

    protected MSDFGenSegment(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenSegment create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenSegment(address, container);
    }

    /**
     * Creates a {@code MSDFGenSegment} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenSegment(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code handle} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer handle(int capacity) { return nhandle(address(), capacity); }

    /** Sets the specified value to the {@code type} field. */
    public MSDFGenSegment type(int value) { ntype(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code handle} field. */
    public MSDFGenSegment handle(@NativeType("void *") ByteBuffer value) { nhandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MSDFGenSegment set(
        int type,
        ByteBuffer handle
    ) {
        type(type);
        handle(handle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenSegment set(MSDFGenSegment src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenSegment} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenSegment malloc() {
        return new MSDFGenSegment(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenSegment} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenSegment calloc() {
        return new MSDFGenSegment(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenSegment} instance allocated with {@link BufferUtils}. */
    public static MSDFGenSegment create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenSegment(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenSegment} instance for the specified memory address. */
    public static MSDFGenSegment create(long address) {
        return new MSDFGenSegment(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MSDFGenSegment createSafe(long address) {
        return address == NULL ? null : new MSDFGenSegment(address, null);
    }

    /**
     * Returns a new {@link MSDFGenSegment.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenSegment.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenSegment.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenSegment.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenSegment.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenSegment.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenSegment.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenSegment.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MSDFGenSegment.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenSegment} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenSegment malloc(MemoryStack stack) {
        return new MSDFGenSegment(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenSegment} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenSegment calloc(MemoryStack stack) {
        return new MSDFGenSegment(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenSegment.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenSegment.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenSegment.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenSegment.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + MSDFGenSegment.TYPE); }
    /** Unsafe version of {@link #handle(int) handle}. */
    public static ByteBuffer nhandle(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + MSDFGenSegment.HANDLE), capacity); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + MSDFGenSegment.TYPE, value); }
    /** Unsafe version of {@link #handle(ByteBuffer) handle}. */
    public static void nhandle(long struct, ByteBuffer value) { memPutAddress(struct + MSDFGenSegment.HANDLE, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + MSDFGenSegment.HANDLE));
    }

    // -----------------------------------

    /** An array of {@link MSDFGenSegment} structs. */
    public static class Buffer extends StructBuffer<MSDFGenSegment, Buffer> implements NativeResource {

        private static final MSDFGenSegment ELEMENT_FACTORY = MSDFGenSegment.create(-1L);

        /**
         * Creates a new {@code MSDFGenSegment.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenSegment#SIZEOF}, and its mark will be undefined.</p>
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
        protected MSDFGenSegment getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return MSDFGenSegment.ntype(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code handle} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer handle(int capacity) { return MSDFGenSegment.nhandle(address(), capacity); }

        /** Sets the specified value to the {@code type} field. */
        public MSDFGenSegment.Buffer type(int value) { MSDFGenSegment.ntype(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code handle} field. */
        public MSDFGenSegment.Buffer handle(@NativeType("void *") ByteBuffer value) { MSDFGenSegment.nhandle(address(), value); return this; }

    }

}