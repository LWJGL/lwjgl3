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
 * struct XrEventDataSessionStateChanged {
 *     XrStructureType type;
 *     void const * next;
 *     XrSession session;
 *     XrSessionState state;
 *     XrTime time;
 * }}</pre>
 */
public class XrEventDataSessionStateChanged extends Struct<XrEventDataSessionStateChanged> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        STATE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        STATE = layout.offsetof(3);
        TIME = layout.offsetof(4);
    }

    protected XrEventDataSessionStateChanged(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSessionStateChanged create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSessionStateChanged(address, container);
    }

    /**
     * Creates a {@code XrEventDataSessionStateChanged} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSessionStateChanged(ByteBuffer container) {
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
    /** @return the value of the {@code session} field. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }
    /** @return the value of the {@code state} field. */
    @NativeType("XrSessionState")
    public int state() { return nstate(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSessionStateChanged type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED TYPE_EVENT_DATA_SESSION_STATE_CHANGED} value to the {@code type} field. */
    public XrEventDataSessionStateChanged type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSessionStateChanged next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSessionStateChanged set(
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
    public XrEventDataSessionStateChanged set(XrEventDataSessionStateChanged src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSessionStateChanged} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSessionStateChanged malloc() {
        return new XrEventDataSessionStateChanged(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSessionStateChanged} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSessionStateChanged calloc() {
        return new XrEventDataSessionStateChanged(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSessionStateChanged} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSessionStateChanged create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSessionStateChanged(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSessionStateChanged} instance for the specified memory address. */
    public static XrEventDataSessionStateChanged create(long address) {
        return new XrEventDataSessionStateChanged(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataSessionStateChanged createSafe(long address) {
        return address == NULL ? null : new XrEventDataSessionStateChanged(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSessionStateChanged}. */
    public static XrEventDataSessionStateChanged create(XrEventDataBaseHeader value) {
        return new XrEventDataSessionStateChanged(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSessionStateChanged.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataSessionStateChanged.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSessionStateChanged.Buffer}. */
    public static XrEventDataSessionStateChanged.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSessionStateChanged.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSessionStateChanged} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSessionStateChanged malloc(MemoryStack stack) {
        return new XrEventDataSessionStateChanged(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSessionStateChanged} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSessionStateChanged calloc(MemoryStack stack) {
        return new XrEventDataSessionStateChanged(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataSessionStateChanged.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSessionStateChanged.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataSessionStateChanged.SESSION); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + XrEventDataSessionStateChanged.STATE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrEventDataSessionStateChanged.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataSessionStateChanged.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSessionStateChanged.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSessionStateChanged} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSessionStateChanged, Buffer> implements NativeResource {

        private static final XrEventDataSessionStateChanged ELEMENT_FACTORY = XrEventDataSessionStateChanged.create(-1L);

        /**
         * Creates a new {@code XrEventDataSessionStateChanged.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSessionStateChanged#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSessionStateChanged getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSessionStateChanged.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSessionStateChanged.nnext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataSessionStateChanged.nsession(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("XrSessionState")
        public int state() { return XrEventDataSessionStateChanged.nstate(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrEventDataSessionStateChanged.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSessionStateChanged.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSessionStateChanged.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED TYPE_EVENT_DATA_SESSION_STATE_CHANGED} value to the {@code type} field. */
        public XrEventDataSessionStateChanged.Buffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSessionStateChanged.Buffer next(@NativeType("void const *") long value) { XrEventDataSessionStateChanged.nnext(address(), value); return this; }

    }

}