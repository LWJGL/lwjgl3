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
 * struct XrEventDataEventsLost {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t lostEventCount;
 * }}</pre>
 */
public class XrEventDataEventsLost extends Struct<XrEventDataEventsLost> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOSTEVENTCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOSTEVENTCOUNT = layout.offsetof(2);
    }

    protected XrEventDataEventsLost(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataEventsLost create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataEventsLost(address, container);
    }

    /**
     * Creates a {@code XrEventDataEventsLost} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataEventsLost(ByteBuffer container) {
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
    /** @return the value of the {@code lostEventCount} field. */
    @NativeType("uint32_t")
    public int lostEventCount() { return nlostEventCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataEventsLost type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_EVENTS_LOST TYPE_EVENT_DATA_EVENTS_LOST} value to the {@code type} field. */
    public XrEventDataEventsLost type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_EVENTS_LOST); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataEventsLost next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataEventsLost set(
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
    public XrEventDataEventsLost set(XrEventDataEventsLost src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataEventsLost malloc() {
        return new XrEventDataEventsLost(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataEventsLost calloc() {
        return new XrEventDataEventsLost(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link BufferUtils}. */
    public static XrEventDataEventsLost create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataEventsLost(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataEventsLost} instance for the specified memory address. */
    public static XrEventDataEventsLost create(long address) {
        return new XrEventDataEventsLost(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataEventsLost createSafe(long address) {
        return address == NULL ? null : new XrEventDataEventsLost(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataEventsLost}. */
    public static XrEventDataEventsLost create(XrEventDataBaseHeader value) {
        return new XrEventDataEventsLost(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataEventsLost.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataEventsLost.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataEventsLost.Buffer}. */
    public static XrEventDataEventsLost.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataEventsLost.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataEventsLost} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataEventsLost malloc(MemoryStack stack) {
        return new XrEventDataEventsLost(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataEventsLost} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataEventsLost calloc(MemoryStack stack) {
        return new XrEventDataEventsLost(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataEventsLost.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataEventsLost.NEXT); }
    /** Unsafe version of {@link #lostEventCount}. */
    public static int nlostEventCount(long struct) { return memGetInt(struct + XrEventDataEventsLost.LOSTEVENTCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataEventsLost.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataEventsLost.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataEventsLost} structs. */
    public static class Buffer extends StructBuffer<XrEventDataEventsLost, Buffer> implements NativeResource {

        private static final XrEventDataEventsLost ELEMENT_FACTORY = XrEventDataEventsLost.create(-1L);

        /**
         * Creates a new {@code XrEventDataEventsLost.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataEventsLost#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataEventsLost getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataEventsLost.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataEventsLost.nnext(address()); }
        /** @return the value of the {@code lostEventCount} field. */
        @NativeType("uint32_t")
        public int lostEventCount() { return XrEventDataEventsLost.nlostEventCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataEventsLost.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataEventsLost.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_EVENTS_LOST TYPE_EVENT_DATA_EVENTS_LOST} value to the {@code type} field. */
        public XrEventDataEventsLost.Buffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_EVENTS_LOST); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataEventsLost.Buffer next(@NativeType("void const *") long value) { XrEventDataEventsLost.nnext(address(), value); return this; }

    }

}