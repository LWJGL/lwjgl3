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
 * struct XrEventDataMainSessionVisibilityChangedEXTX {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 visible;
 *     XrOverlayMainSessionFlagsEXTX flags;
 * }}</pre>
 */
public class XrEventDataMainSessionVisibilityChangedEXTX extends Struct<XrEventDataMainSessionVisibilityChangedEXTX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VISIBLE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VISIBLE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected XrEventDataMainSessionVisibilityChangedEXTX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataMainSessionVisibilityChangedEXTX create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataMainSessionVisibilityChangedEXTX(address, container);
    }

    /**
     * Creates a {@code XrEventDataMainSessionVisibilityChangedEXTX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataMainSessionVisibilityChangedEXTX(ByteBuffer container) {
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
    /** @return the value of the {@code visible} field. */
    @NativeType("XrBool32")
    public boolean visible() { return nvisible(address()) != 0; }
    /** @return the value of the {@code flags} field. */
    @NativeType("XrOverlayMainSessionFlagsEXTX")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataMainSessionVisibilityChangedEXTX type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTXOverlay#XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX} value to the {@code type} field. */
    public XrEventDataMainSessionVisibilityChangedEXTX type$Default() { return type(EXTXOverlay.XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataMainSessionVisibilityChangedEXTX next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataMainSessionVisibilityChangedEXTX set(
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
    public XrEventDataMainSessionVisibilityChangedEXTX set(XrEventDataMainSessionVisibilityChangedEXTX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataMainSessionVisibilityChangedEXTX malloc() {
        return new XrEventDataMainSessionVisibilityChangedEXTX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataMainSessionVisibilityChangedEXTX calloc() {
        return new XrEventDataMainSessionVisibilityChangedEXTX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated with {@link BufferUtils}. */
    public static XrEventDataMainSessionVisibilityChangedEXTX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataMainSessionVisibilityChangedEXTX(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance for the specified memory address. */
    public static XrEventDataMainSessionVisibilityChangedEXTX create(long address) {
        return new XrEventDataMainSessionVisibilityChangedEXTX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataMainSessionVisibilityChangedEXTX createSafe(long address) {
        return address == NULL ? null : new XrEventDataMainSessionVisibilityChangedEXTX(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataMainSessionVisibilityChangedEXTX}. */
    public static XrEventDataMainSessionVisibilityChangedEXTX create(XrEventDataBaseHeader value) {
        return new XrEventDataMainSessionVisibilityChangedEXTX(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataMainSessionVisibilityChangedEXTX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataMainSessionVisibilityChangedEXTX.Buffer}. */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataMainSessionVisibilityChangedEXTX.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX malloc(MemoryStack stack) {
        return new XrEventDataMainSessionVisibilityChangedEXTX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX calloc(MemoryStack stack) {
        return new XrEventDataMainSessionVisibilityChangedEXTX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataMainSessionVisibilityChangedEXTX.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataMainSessionVisibilityChangedEXTX.NEXT); }
    /** Unsafe version of {@link #visible}. */
    public static int nvisible(long struct) { return memGetInt(struct + XrEventDataMainSessionVisibilityChangedEXTX.VISIBLE); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrEventDataMainSessionVisibilityChangedEXTX.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataMainSessionVisibilityChangedEXTX.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataMainSessionVisibilityChangedEXTX.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataMainSessionVisibilityChangedEXTX} structs. */
    public static class Buffer extends StructBuffer<XrEventDataMainSessionVisibilityChangedEXTX, Buffer> implements NativeResource {

        private static final XrEventDataMainSessionVisibilityChangedEXTX ELEMENT_FACTORY = XrEventDataMainSessionVisibilityChangedEXTX.create(-1L);

        /**
         * Creates a new {@code XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataMainSessionVisibilityChangedEXTX#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataMainSessionVisibilityChangedEXTX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataMainSessionVisibilityChangedEXTX.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataMainSessionVisibilityChangedEXTX.nnext(address()); }
        /** @return the value of the {@code visible} field. */
        @NativeType("XrBool32")
        public boolean visible() { return XrEventDataMainSessionVisibilityChangedEXTX.nvisible(address()) != 0; }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrOverlayMainSessionFlagsEXTX")
        public long flags() { return XrEventDataMainSessionVisibilityChangedEXTX.nflags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataMainSessionVisibilityChangedEXTX.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataMainSessionVisibilityChangedEXTX.ntype(address(), value); return this; }
        /** Sets the {@link EXTXOverlay#XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX} value to the {@code type} field. */
        public XrEventDataMainSessionVisibilityChangedEXTX.Buffer type$Default() { return type(EXTXOverlay.XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataMainSessionVisibilityChangedEXTX.Buffer next(@NativeType("void const *") long value) { XrEventDataMainSessionVisibilityChangedEXTX.nnext(address(), value); return this; }

    }

}