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
 * struct XrRecommendedLayerResolutionMETA {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrExtent2Di XrExtent2Di} recommendedImageDimensions;
 *     XrBool32 isValid;
 * }}</pre>
 */
public class XrRecommendedLayerResolutionMETA extends Struct<XrRecommendedLayerResolutionMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RECOMMENDEDIMAGEDIMENSIONS,
        ISVALID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrExtent2Di.SIZEOF, XrExtent2Di.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RECOMMENDEDIMAGEDIMENSIONS = layout.offsetof(2);
        ISVALID = layout.offsetof(3);
    }

    protected XrRecommendedLayerResolutionMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRecommendedLayerResolutionMETA create(long address, @Nullable ByteBuffer container) {
        return new XrRecommendedLayerResolutionMETA(address, container);
    }

    /**
     * Creates a {@code XrRecommendedLayerResolutionMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRecommendedLayerResolutionMETA(ByteBuffer container) {
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
    /** @return a {@link XrExtent2Di} view of the {@code recommendedImageDimensions} field. */
    public XrExtent2Di recommendedImageDimensions() { return nrecommendedImageDimensions(address()); }
    /** @return the value of the {@code isValid} field. */
    @NativeType("XrBool32")
    public boolean isValid() { return nisValid(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrRecommendedLayerResolutionMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METARecommendedLayerResolution#XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_META TYPE_RECOMMENDED_LAYER_RESOLUTION_META} value to the {@code type} field. */
    public XrRecommendedLayerResolutionMETA type$Default() { return type(METARecommendedLayerResolution.XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrRecommendedLayerResolutionMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRecommendedLayerResolutionMETA set(
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
    public XrRecommendedLayerResolutionMETA set(XrRecommendedLayerResolutionMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRecommendedLayerResolutionMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRecommendedLayerResolutionMETA malloc() {
        return new XrRecommendedLayerResolutionMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRecommendedLayerResolutionMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRecommendedLayerResolutionMETA calloc() {
        return new XrRecommendedLayerResolutionMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRecommendedLayerResolutionMETA} instance allocated with {@link BufferUtils}. */
    public static XrRecommendedLayerResolutionMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRecommendedLayerResolutionMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrRecommendedLayerResolutionMETA} instance for the specified memory address. */
    public static XrRecommendedLayerResolutionMETA create(long address) {
        return new XrRecommendedLayerResolutionMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRecommendedLayerResolutionMETA createSafe(long address) {
        return address == NULL ? null : new XrRecommendedLayerResolutionMETA(address, null);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRecommendedLayerResolutionMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRecommendedLayerResolutionMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRecommendedLayerResolutionMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRecommendedLayerResolutionMETA malloc(MemoryStack stack) {
        return new XrRecommendedLayerResolutionMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRecommendedLayerResolutionMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRecommendedLayerResolutionMETA calloc(MemoryStack stack) {
        return new XrRecommendedLayerResolutionMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRecommendedLayerResolutionMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRecommendedLayerResolutionMETA.NEXT); }
    /** Unsafe version of {@link #recommendedImageDimensions}. */
    public static XrExtent2Di nrecommendedImageDimensions(long struct) { return XrExtent2Di.create(struct + XrRecommendedLayerResolutionMETA.RECOMMENDEDIMAGEDIMENSIONS); }
    /** Unsafe version of {@link #isValid}. */
    public static int nisValid(long struct) { return memGetInt(struct + XrRecommendedLayerResolutionMETA.ISVALID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRecommendedLayerResolutionMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRecommendedLayerResolutionMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrRecommendedLayerResolutionMETA} structs. */
    public static class Buffer extends StructBuffer<XrRecommendedLayerResolutionMETA, Buffer> implements NativeResource {

        private static final XrRecommendedLayerResolutionMETA ELEMENT_FACTORY = XrRecommendedLayerResolutionMETA.create(-1L);

        /**
         * Creates a new {@code XrRecommendedLayerResolutionMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRecommendedLayerResolutionMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRecommendedLayerResolutionMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRecommendedLayerResolutionMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRecommendedLayerResolutionMETA.nnext(address()); }
        /** @return a {@link XrExtent2Di} view of the {@code recommendedImageDimensions} field. */
        public XrExtent2Di recommendedImageDimensions() { return XrRecommendedLayerResolutionMETA.nrecommendedImageDimensions(address()); }
        /** @return the value of the {@code isValid} field. */
        @NativeType("XrBool32")
        public boolean isValid() { return XrRecommendedLayerResolutionMETA.nisValid(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrRecommendedLayerResolutionMETA.Buffer type(@NativeType("XrStructureType") int value) { XrRecommendedLayerResolutionMETA.ntype(address(), value); return this; }
        /** Sets the {@link METARecommendedLayerResolution#XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_META TYPE_RECOMMENDED_LAYER_RESOLUTION_META} value to the {@code type} field. */
        public XrRecommendedLayerResolutionMETA.Buffer type$Default() { return type(METARecommendedLayerResolution.XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrRecommendedLayerResolutionMETA.Buffer next(@NativeType("void *") long value) { XrRecommendedLayerResolutionMETA.nnext(address(), value); return this; }

    }

}