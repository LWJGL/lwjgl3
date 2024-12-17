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
 * struct XrEventDataPassthroughLayerResumedMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrPassthroughLayerFB layer;
 * }}</pre>
 */
public class XrEventDataPassthroughLayerResumedMETA extends Struct<XrEventDataPassthroughLayerResumedMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYER = layout.offsetof(2);
    }

    protected XrEventDataPassthroughLayerResumedMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataPassthroughLayerResumedMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataPassthroughLayerResumedMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataPassthroughLayerResumedMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataPassthroughLayerResumedMETA(ByteBuffer container) {
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
    /** @return the value of the {@code layer} field. */
    @NativeType("XrPassthroughLayerFB")
    public long layer() { return nlayer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataPassthroughLayerResumedMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughLayerResumedEvent#XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META} value to the {@code type} field. */
    public XrEventDataPassthroughLayerResumedMETA type$Default() { return type(METAPassthroughLayerResumedEvent.XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataPassthroughLayerResumedMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataPassthroughLayerResumedMETA set(
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
    public XrEventDataPassthroughLayerResumedMETA set(XrEventDataPassthroughLayerResumedMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataPassthroughLayerResumedMETA malloc() {
        return new XrEventDataPassthroughLayerResumedMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataPassthroughLayerResumedMETA calloc() {
        return new XrEventDataPassthroughLayerResumedMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataPassthroughLayerResumedMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataPassthroughLayerResumedMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance for the specified memory address. */
    public static XrEventDataPassthroughLayerResumedMETA create(long address) {
        return new XrEventDataPassthroughLayerResumedMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataPassthroughLayerResumedMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataPassthroughLayerResumedMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataPassthroughLayerResumedMETA}. */
    public static XrEventDataPassthroughLayerResumedMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataPassthroughLayerResumedMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataPassthroughLayerResumedMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataPassthroughLayerResumedMETA.Buffer}. */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataPassthroughLayerResumedMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataPassthroughLayerResumedMETA malloc(MemoryStack stack) {
        return new XrEventDataPassthroughLayerResumedMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataPassthroughLayerResumedMETA calloc(MemoryStack stack) {
        return new XrEventDataPassthroughLayerResumedMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataPassthroughLayerResumedMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataPassthroughLayerResumedMETA.NEXT); }
    /** Unsafe version of {@link #layer}. */
    public static long nlayer(long struct) { return memGetAddress(struct + XrEventDataPassthroughLayerResumedMETA.LAYER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataPassthroughLayerResumedMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataPassthroughLayerResumedMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataPassthroughLayerResumedMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataPassthroughLayerResumedMETA, Buffer> implements NativeResource {

        private static final XrEventDataPassthroughLayerResumedMETA ELEMENT_FACTORY = XrEventDataPassthroughLayerResumedMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataPassthroughLayerResumedMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataPassthroughLayerResumedMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataPassthroughLayerResumedMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataPassthroughLayerResumedMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataPassthroughLayerResumedMETA.nnext(address()); }
        /** @return the value of the {@code layer} field. */
        @NativeType("XrPassthroughLayerFB")
        public long layer() { return XrEventDataPassthroughLayerResumedMETA.nlayer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataPassthroughLayerResumedMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataPassthroughLayerResumedMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughLayerResumedEvent#XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META} value to the {@code type} field. */
        public XrEventDataPassthroughLayerResumedMETA.Buffer type$Default() { return type(METAPassthroughLayerResumedEvent.XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataPassthroughLayerResumedMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataPassthroughLayerResumedMETA.nnext(address(), value); return this; }

    }

}