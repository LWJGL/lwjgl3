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
 * struct XrSpaceFilterInfoBaseHeaderFB {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrSpaceFilterInfoBaseHeaderFB extends Struct<XrSpaceFilterInfoBaseHeaderFB> implements NativeResource {

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

    protected XrSpaceFilterInfoBaseHeaderFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceFilterInfoBaseHeaderFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceFilterInfoBaseHeaderFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceFilterInfoBaseHeaderFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceFilterInfoBaseHeaderFB(ByteBuffer container) {
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
    public XrSpaceFilterInfoBaseHeaderFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceFilterInfoBaseHeaderFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpaceStorageLocationFilterInfoFB} value to the {@code next} chain. */
    public XrSpaceFilterInfoBaseHeaderFB next(XrSpaceStorageLocationFilterInfoFB value) { return this.next(value.next(this.next()).address()); }

    /** Initializes this struct with the specified values. */
    public XrSpaceFilterInfoBaseHeaderFB set(
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
    public XrSpaceFilterInfoBaseHeaderFB set(XrSpaceFilterInfoBaseHeaderFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceFilterInfoBaseHeaderFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceFilterInfoBaseHeaderFB malloc() {
        return new XrSpaceFilterInfoBaseHeaderFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceFilterInfoBaseHeaderFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceFilterInfoBaseHeaderFB calloc() {
        return new XrSpaceFilterInfoBaseHeaderFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceFilterInfoBaseHeaderFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceFilterInfoBaseHeaderFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceFilterInfoBaseHeaderFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceFilterInfoBaseHeaderFB} instance for the specified memory address. */
    public static XrSpaceFilterInfoBaseHeaderFB create(long address) {
        return new XrSpaceFilterInfoBaseHeaderFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceFilterInfoBaseHeaderFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceFilterInfoBaseHeaderFB(address, null);
    }

    /** Upcasts the specified {@code XrSpaceUuidFilterInfoFB} instance to {@code XrSpaceFilterInfoBaseHeaderFB}. */
    public static XrSpaceFilterInfoBaseHeaderFB create(XrSpaceUuidFilterInfoFB value) {
        return new XrSpaceFilterInfoBaseHeaderFB(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpaceComponentFilterInfoFB} instance to {@code XrSpaceFilterInfoBaseHeaderFB}. */
    public static XrSpaceFilterInfoBaseHeaderFB create(XrSpaceComponentFilterInfoFB value) {
        return new XrSpaceFilterInfoBaseHeaderFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpaceFilterInfoBaseHeaderFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterInfoBaseHeaderFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterInfoBaseHeaderFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterInfoBaseHeaderFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterInfoBaseHeaderFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterInfoBaseHeaderFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceFilterInfoBaseHeaderFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterInfoBaseHeaderFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceFilterInfoBaseHeaderFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrSpaceUuidFilterInfoFB.Buffer} instance to {@code XrSpaceFilterInfoBaseHeaderFB.Buffer}. */
    public static XrSpaceFilterInfoBaseHeaderFB.Buffer create(XrSpaceUuidFilterInfoFB.Buffer value) {
        return new XrSpaceFilterInfoBaseHeaderFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpaceComponentFilterInfoFB.Buffer} instance to {@code XrSpaceFilterInfoBaseHeaderFB.Buffer}. */
    public static XrSpaceFilterInfoBaseHeaderFB.Buffer create(XrSpaceComponentFilterInfoFB.Buffer value) {
        return new XrSpaceFilterInfoBaseHeaderFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpaceFilterInfoBaseHeaderFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceFilterInfoBaseHeaderFB malloc(MemoryStack stack) {
        return new XrSpaceFilterInfoBaseHeaderFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceFilterInfoBaseHeaderFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceFilterInfoBaseHeaderFB calloc(MemoryStack stack) {
        return new XrSpaceFilterInfoBaseHeaderFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceFilterInfoBaseHeaderFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterInfoBaseHeaderFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterInfoBaseHeaderFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterInfoBaseHeaderFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceFilterInfoBaseHeaderFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceFilterInfoBaseHeaderFB.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceFilterInfoBaseHeaderFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceFilterInfoBaseHeaderFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceFilterInfoBaseHeaderFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceFilterInfoBaseHeaderFB, Buffer> implements NativeResource {

        private static final XrSpaceFilterInfoBaseHeaderFB ELEMENT_FACTORY = XrSpaceFilterInfoBaseHeaderFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceFilterInfoBaseHeaderFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceFilterInfoBaseHeaderFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceFilterInfoBaseHeaderFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceFilterInfoBaseHeaderFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceFilterInfoBaseHeaderFB.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceFilterInfoBaseHeaderFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceFilterInfoBaseHeaderFB.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceFilterInfoBaseHeaderFB.Buffer next(@NativeType("void const *") long value) { XrSpaceFilterInfoBaseHeaderFB.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpaceStorageLocationFilterInfoFB} value to the {@code next} chain. */
        public XrSpaceFilterInfoBaseHeaderFB.Buffer next(XrSpaceStorageLocationFilterInfoFB value) { return this.next(value.next(this.next()).address()); }

    }

}