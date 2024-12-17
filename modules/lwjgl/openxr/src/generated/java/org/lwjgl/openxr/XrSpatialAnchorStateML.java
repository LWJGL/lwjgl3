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
 * struct XrSpatialAnchorStateML {
 *     XrStructureType type;
 *     void * next;
 *     XrSpatialAnchorConfidenceML confidence;
 * }}</pre>
 */
public class XrSpatialAnchorStateML extends Struct<XrSpatialAnchorStateML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CONFIDENCE;

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
        CONFIDENCE = layout.offsetof(2);
    }

    protected XrSpatialAnchorStateML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorStateML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorStateML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorStateML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorStateML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code confidence} field. */
    @NativeType("XrSpatialAnchorConfidenceML")
    public int confidence() { return nconfidence(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorStateML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchors#XR_TYPE_SPATIAL_ANCHOR_STATE_ML TYPE_SPATIAL_ANCHOR_STATE_ML} value to the {@code type} field. */
    public XrSpatialAnchorStateML type$Default() { return type(MLSpatialAnchors.XR_TYPE_SPATIAL_ANCHOR_STATE_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorStateML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code confidence} field. */
    public XrSpatialAnchorStateML confidence(@NativeType("XrSpatialAnchorConfidenceML") int value) { nconfidence(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorStateML set(
        int type,
        long next,
        int confidence
    ) {
        type(type);
        next(next);
        confidence(confidence);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorStateML set(XrSpatialAnchorStateML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorStateML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorStateML malloc() {
        return new XrSpatialAnchorStateML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorStateML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorStateML calloc() {
        return new XrSpatialAnchorStateML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorStateML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorStateML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorStateML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorStateML} instance for the specified memory address. */
    public static XrSpatialAnchorStateML create(long address) {
        return new XrSpatialAnchorStateML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorStateML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorStateML(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorStateML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorStateML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorStateML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorStateML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorStateML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorStateML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorStateML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorStateML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorStateML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorStateML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorStateML malloc(MemoryStack stack) {
        return new XrSpatialAnchorStateML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorStateML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorStateML calloc(MemoryStack stack) {
        return new XrSpatialAnchorStateML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorStateML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorStateML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorStateML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorStateML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorStateML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorStateML.NEXT); }
    /** Unsafe version of {@link #confidence}. */
    public static int nconfidence(long struct) { return memGetInt(struct + XrSpatialAnchorStateML.CONFIDENCE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorStateML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorStateML.NEXT, value); }
    /** Unsafe version of {@link #confidence(int) confidence}. */
    public static void nconfidence(long struct, int value) { memPutInt(struct + XrSpatialAnchorStateML.CONFIDENCE, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorStateML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorStateML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorStateML ELEMENT_FACTORY = XrSpatialAnchorStateML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorStateML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorStateML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorStateML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorStateML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorStateML.nnext(address()); }
        /** @return the value of the {@code confidence} field. */
        @NativeType("XrSpatialAnchorConfidenceML")
        public int confidence() { return XrSpatialAnchorStateML.nconfidence(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorStateML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorStateML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchors#XR_TYPE_SPATIAL_ANCHOR_STATE_ML TYPE_SPATIAL_ANCHOR_STATE_ML} value to the {@code type} field. */
        public XrSpatialAnchorStateML.Buffer type$Default() { return type(MLSpatialAnchors.XR_TYPE_SPATIAL_ANCHOR_STATE_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorStateML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorStateML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code confidence} field. */
        public XrSpatialAnchorStateML.Buffer confidence(@NativeType("XrSpatialAnchorConfidenceML") int value) { XrSpatialAnchorStateML.nconfidence(address(), value); return this; }

    }

}