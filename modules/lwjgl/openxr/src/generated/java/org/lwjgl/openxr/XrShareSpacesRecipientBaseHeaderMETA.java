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
 * struct XrShareSpacesRecipientBaseHeaderMETA {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrShareSpacesRecipientBaseHeaderMETA extends Struct<XrShareSpacesRecipientBaseHeaderMETA> implements NativeResource {

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

    protected XrShareSpacesRecipientBaseHeaderMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrShareSpacesRecipientBaseHeaderMETA create(long address, @Nullable ByteBuffer container) {
        return new XrShareSpacesRecipientBaseHeaderMETA(address, container);
    }

    /**
     * Creates a {@code XrShareSpacesRecipientBaseHeaderMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrShareSpacesRecipientBaseHeaderMETA(ByteBuffer container) {
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
    public XrShareSpacesRecipientBaseHeaderMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrShareSpacesRecipientBaseHeaderMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrShareSpacesRecipientBaseHeaderMETA set(
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
    public XrShareSpacesRecipientBaseHeaderMETA set(XrShareSpacesRecipientBaseHeaderMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrShareSpacesRecipientBaseHeaderMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrShareSpacesRecipientBaseHeaderMETA malloc() {
        return new XrShareSpacesRecipientBaseHeaderMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrShareSpacesRecipientBaseHeaderMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrShareSpacesRecipientBaseHeaderMETA calloc() {
        return new XrShareSpacesRecipientBaseHeaderMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrShareSpacesRecipientBaseHeaderMETA} instance allocated with {@link BufferUtils}. */
    public static XrShareSpacesRecipientBaseHeaderMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrShareSpacesRecipientBaseHeaderMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrShareSpacesRecipientBaseHeaderMETA} instance for the specified memory address. */
    public static XrShareSpacesRecipientBaseHeaderMETA create(long address) {
        return new XrShareSpacesRecipientBaseHeaderMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrShareSpacesRecipientBaseHeaderMETA createSafe(long address) {
        return address == NULL ? null : new XrShareSpacesRecipientBaseHeaderMETA(address, null);
    }

    /** Upcasts the specified {@code XrShareSpacesRecipientGroupsMETA} instance to {@code XrShareSpacesRecipientBaseHeaderMETA}. */
    public static XrShareSpacesRecipientBaseHeaderMETA create(XrShareSpacesRecipientGroupsMETA value) {
        return new XrShareSpacesRecipientBaseHeaderMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientBaseHeaderMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientBaseHeaderMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientBaseHeaderMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientBaseHeaderMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientBaseHeaderMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientBaseHeaderMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrShareSpacesRecipientBaseHeaderMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientBaseHeaderMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrShareSpacesRecipientBaseHeaderMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrShareSpacesRecipientGroupsMETA.Buffer} instance to {@code XrShareSpacesRecipientBaseHeaderMETA.Buffer}. */
    public static XrShareSpacesRecipientBaseHeaderMETA.Buffer create(XrShareSpacesRecipientGroupsMETA.Buffer value) {
        return new XrShareSpacesRecipientBaseHeaderMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrShareSpacesRecipientBaseHeaderMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrShareSpacesRecipientBaseHeaderMETA malloc(MemoryStack stack) {
        return new XrShareSpacesRecipientBaseHeaderMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrShareSpacesRecipientBaseHeaderMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrShareSpacesRecipientBaseHeaderMETA calloc(MemoryStack stack) {
        return new XrShareSpacesRecipientBaseHeaderMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientBaseHeaderMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientBaseHeaderMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientBaseHeaderMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientBaseHeaderMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrShareSpacesRecipientBaseHeaderMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrShareSpacesRecipientBaseHeaderMETA.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrShareSpacesRecipientBaseHeaderMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrShareSpacesRecipientBaseHeaderMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrShareSpacesRecipientBaseHeaderMETA} structs. */
    public static class Buffer extends StructBuffer<XrShareSpacesRecipientBaseHeaderMETA, Buffer> implements NativeResource {

        private static final XrShareSpacesRecipientBaseHeaderMETA ELEMENT_FACTORY = XrShareSpacesRecipientBaseHeaderMETA.create(-1L);

        /**
         * Creates a new {@code XrShareSpacesRecipientBaseHeaderMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrShareSpacesRecipientBaseHeaderMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrShareSpacesRecipientBaseHeaderMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrShareSpacesRecipientBaseHeaderMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrShareSpacesRecipientBaseHeaderMETA.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrShareSpacesRecipientBaseHeaderMETA.Buffer type(@NativeType("XrStructureType") int value) { XrShareSpacesRecipientBaseHeaderMETA.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrShareSpacesRecipientBaseHeaderMETA.Buffer next(@NativeType("void const *") long value) { XrShareSpacesRecipientBaseHeaderMETA.nnext(address(), value); return this; }

    }

}