/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpaceFilterBaseHeaderMETA {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrSpaceFilterBaseHeaderMETA extends Struct<XrSpaceFilterBaseHeaderMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrSpaceFilterBaseHeaderMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceFilterBaseHeaderMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceFilterBaseHeaderMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceFilterBaseHeaderMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceFilterBaseHeaderMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceFilterBaseHeaderMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceFilterBaseHeaderMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceFilterBaseHeaderMETA set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceFilterBaseHeaderMETA set(XrSpaceFilterBaseHeaderMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceFilterBaseHeaderMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceFilterBaseHeaderMETA malloc() {
        return new XrSpaceFilterBaseHeaderMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceFilterBaseHeaderMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceFilterBaseHeaderMETA calloc() {
        return new XrSpaceFilterBaseHeaderMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceFilterBaseHeaderMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceFilterBaseHeaderMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceFilterBaseHeaderMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceFilterBaseHeaderMETA} instance for the specified memory address. */
    public static XrSpaceFilterBaseHeaderMETA create(long address) {
        return new XrSpaceFilterBaseHeaderMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceFilterBaseHeaderMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceFilterBaseHeaderMETA(address, null);
    }

    /** Upcasts the specified {@code XrSpaceFilterUuidMETA} instance to {@code XrSpaceFilterBaseHeaderMETA}. */
    public static XrSpaceFilterBaseHeaderMETA create(XrSpaceFilterUuidMETA value) {
        return new XrSpaceFilterBaseHeaderMETA(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpaceFilterComponentMETA} instance to {@code XrSpaceFilterBaseHeaderMETA}. */
    public static XrSpaceFilterBaseHeaderMETA create(XrSpaceFilterComponentMETA value) {
        return new XrSpaceFilterBaseHeaderMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpaceFilterBaseHeaderMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterBaseHeaderMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterBaseHeaderMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterBaseHeaderMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterBaseHeaderMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterBaseHeaderMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceFilterBaseHeaderMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterBaseHeaderMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceFilterBaseHeaderMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrSpaceFilterUuidMETA.Buffer} instance to {@code XrSpaceFilterBaseHeaderMETA.Buffer}. */
    public static XrSpaceFilterBaseHeaderMETA.Buffer create(XrSpaceFilterUuidMETA.Buffer value) {
        return new XrSpaceFilterBaseHeaderMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpaceFilterComponentMETA.Buffer} instance to {@code XrSpaceFilterBaseHeaderMETA.Buffer}. */
    public static XrSpaceFilterBaseHeaderMETA.Buffer create(XrSpaceFilterComponentMETA.Buffer value) {
        return new XrSpaceFilterBaseHeaderMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpaceFilterBaseHeaderMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceFilterBaseHeaderMETA malloc(MemoryStack stack) {
        return new XrSpaceFilterBaseHeaderMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceFilterBaseHeaderMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceFilterBaseHeaderMETA calloc(MemoryStack stack) {
        return new XrSpaceFilterBaseHeaderMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceFilterBaseHeaderMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterBaseHeaderMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterBaseHeaderMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterBaseHeaderMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceFilterBaseHeaderMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceFilterBaseHeaderMETA.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceFilterBaseHeaderMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceFilterBaseHeaderMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceFilterBaseHeaderMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceFilterBaseHeaderMETA, Buffer> implements NativeResource {

        private static final XrSpaceFilterBaseHeaderMETA ELEMENT_FACTORY = XrSpaceFilterBaseHeaderMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceFilterBaseHeaderMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceFilterBaseHeaderMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceFilterBaseHeaderMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceFilterBaseHeaderMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceFilterBaseHeaderMETA.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceFilterBaseHeaderMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceFilterBaseHeaderMETA.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceFilterBaseHeaderMETA.Buffer next(@NativeType("void const *") long value) { XrSpaceFilterBaseHeaderMETA.nnext(address(), value); return this; }

    }

}