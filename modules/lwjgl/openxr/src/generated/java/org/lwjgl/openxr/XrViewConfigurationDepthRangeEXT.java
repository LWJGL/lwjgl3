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
 * struct XrViewConfigurationDepthRangeEXT {
 *     XrStructureType type;
 *     void * next;
 *     float recommendedNearZ;
 *     float minNearZ;
 *     float recommendedFarZ;
 *     float maxFarZ;
 * }}</pre>
 */
public class XrViewConfigurationDepthRangeEXT extends Struct<XrViewConfigurationDepthRangeEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RECOMMENDEDNEARZ,
        MINNEARZ,
        RECOMMENDEDFARZ,
        MAXFARZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RECOMMENDEDNEARZ = layout.offsetof(2);
        MINNEARZ = layout.offsetof(3);
        RECOMMENDEDFARZ = layout.offsetof(4);
        MAXFARZ = layout.offsetof(5);
    }

    protected XrViewConfigurationDepthRangeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrViewConfigurationDepthRangeEXT create(long address, @Nullable ByteBuffer container) {
        return new XrViewConfigurationDepthRangeEXT(address, container);
    }

    /**
     * Creates a {@code XrViewConfigurationDepthRangeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrViewConfigurationDepthRangeEXT(ByteBuffer container) {
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
    /** @return the value of the {@code recommendedNearZ} field. */
    public float recommendedNearZ() { return nrecommendedNearZ(address()); }
    /** @return the value of the {@code minNearZ} field. */
    public float minNearZ() { return nminNearZ(address()); }
    /** @return the value of the {@code recommendedFarZ} field. */
    public float recommendedFarZ() { return nrecommendedFarZ(address()); }
    /** @return the value of the {@code maxFarZ} field. */
    public float maxFarZ() { return nmaxFarZ(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrViewConfigurationDepthRangeEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTViewConfigurationDepthRange#XR_TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT} value to the {@code type} field. */
    public XrViewConfigurationDepthRangeEXT type$Default() { return type(EXTViewConfigurationDepthRange.XR_TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrViewConfigurationDepthRangeEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code recommendedNearZ} field. */
    public XrViewConfigurationDepthRangeEXT recommendedNearZ(float value) { nrecommendedNearZ(address(), value); return this; }
    /** Sets the specified value to the {@code minNearZ} field. */
    public XrViewConfigurationDepthRangeEXT minNearZ(float value) { nminNearZ(address(), value); return this; }
    /** Sets the specified value to the {@code recommendedFarZ} field. */
    public XrViewConfigurationDepthRangeEXT recommendedFarZ(float value) { nrecommendedFarZ(address(), value); return this; }
    /** Sets the specified value to the {@code maxFarZ} field. */
    public XrViewConfigurationDepthRangeEXT maxFarZ(float value) { nmaxFarZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrViewConfigurationDepthRangeEXT set(
        int type,
        long next,
        float recommendedNearZ,
        float minNearZ,
        float recommendedFarZ,
        float maxFarZ
    ) {
        type(type);
        next(next);
        recommendedNearZ(recommendedNearZ);
        minNearZ(minNearZ);
        recommendedFarZ(recommendedFarZ);
        maxFarZ(maxFarZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrViewConfigurationDepthRangeEXT set(XrViewConfigurationDepthRangeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrViewConfigurationDepthRangeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationDepthRangeEXT malloc() {
        return new XrViewConfigurationDepthRangeEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrViewConfigurationDepthRangeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationDepthRangeEXT calloc() {
        return new XrViewConfigurationDepthRangeEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrViewConfigurationDepthRangeEXT} instance allocated with {@link BufferUtils}. */
    public static XrViewConfigurationDepthRangeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrViewConfigurationDepthRangeEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrViewConfigurationDepthRangeEXT} instance for the specified memory address. */
    public static XrViewConfigurationDepthRangeEXT create(long address) {
        return new XrViewConfigurationDepthRangeEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrViewConfigurationDepthRangeEXT createSafe(long address) {
        return address == NULL ? null : new XrViewConfigurationDepthRangeEXT(address, null);
    }

    /**
     * Returns a new {@link XrViewConfigurationDepthRangeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationDepthRangeEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationDepthRangeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationDepthRangeEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationDepthRangeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationDepthRangeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrViewConfigurationDepthRangeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationDepthRangeEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrViewConfigurationDepthRangeEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrViewConfigurationDepthRangeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationDepthRangeEXT malloc(MemoryStack stack) {
        return new XrViewConfigurationDepthRangeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrViewConfigurationDepthRangeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationDepthRangeEXT calloc(MemoryStack stack) {
        return new XrViewConfigurationDepthRangeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrViewConfigurationDepthRangeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationDepthRangeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationDepthRangeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationDepthRangeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrViewConfigurationDepthRangeEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrViewConfigurationDepthRangeEXT.NEXT); }
    /** Unsafe version of {@link #recommendedNearZ}. */
    public static float nrecommendedNearZ(long struct) { return memGetFloat(struct + XrViewConfigurationDepthRangeEXT.RECOMMENDEDNEARZ); }
    /** Unsafe version of {@link #minNearZ}. */
    public static float nminNearZ(long struct) { return memGetFloat(struct + XrViewConfigurationDepthRangeEXT.MINNEARZ); }
    /** Unsafe version of {@link #recommendedFarZ}. */
    public static float nrecommendedFarZ(long struct) { return memGetFloat(struct + XrViewConfigurationDepthRangeEXT.RECOMMENDEDFARZ); }
    /** Unsafe version of {@link #maxFarZ}. */
    public static float nmaxFarZ(long struct) { return memGetFloat(struct + XrViewConfigurationDepthRangeEXT.MAXFARZ); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrViewConfigurationDepthRangeEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrViewConfigurationDepthRangeEXT.NEXT, value); }
    /** Unsafe version of {@link #recommendedNearZ(float) recommendedNearZ}. */
    public static void nrecommendedNearZ(long struct, float value) { memPutFloat(struct + XrViewConfigurationDepthRangeEXT.RECOMMENDEDNEARZ, value); }
    /** Unsafe version of {@link #minNearZ(float) minNearZ}. */
    public static void nminNearZ(long struct, float value) { memPutFloat(struct + XrViewConfigurationDepthRangeEXT.MINNEARZ, value); }
    /** Unsafe version of {@link #recommendedFarZ(float) recommendedFarZ}. */
    public static void nrecommendedFarZ(long struct, float value) { memPutFloat(struct + XrViewConfigurationDepthRangeEXT.RECOMMENDEDFARZ, value); }
    /** Unsafe version of {@link #maxFarZ(float) maxFarZ}. */
    public static void nmaxFarZ(long struct, float value) { memPutFloat(struct + XrViewConfigurationDepthRangeEXT.MAXFARZ, value); }

    // -----------------------------------

    /** An array of {@link XrViewConfigurationDepthRangeEXT} structs. */
    public static class Buffer extends StructBuffer<XrViewConfigurationDepthRangeEXT, Buffer> implements NativeResource {

        private static final XrViewConfigurationDepthRangeEXT ELEMENT_FACTORY = XrViewConfigurationDepthRangeEXT.create(-1L);

        /**
         * Creates a new {@code XrViewConfigurationDepthRangeEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrViewConfigurationDepthRangeEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrViewConfigurationDepthRangeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrViewConfigurationDepthRangeEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrViewConfigurationDepthRangeEXT.nnext(address()); }
        /** @return the value of the {@code recommendedNearZ} field. */
        public float recommendedNearZ() { return XrViewConfigurationDepthRangeEXT.nrecommendedNearZ(address()); }
        /** @return the value of the {@code minNearZ} field. */
        public float minNearZ() { return XrViewConfigurationDepthRangeEXT.nminNearZ(address()); }
        /** @return the value of the {@code recommendedFarZ} field. */
        public float recommendedFarZ() { return XrViewConfigurationDepthRangeEXT.nrecommendedFarZ(address()); }
        /** @return the value of the {@code maxFarZ} field. */
        public float maxFarZ() { return XrViewConfigurationDepthRangeEXT.nmaxFarZ(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrViewConfigurationDepthRangeEXT.Buffer type(@NativeType("XrStructureType") int value) { XrViewConfigurationDepthRangeEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTViewConfigurationDepthRange#XR_TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT} value to the {@code type} field. */
        public XrViewConfigurationDepthRangeEXT.Buffer type$Default() { return type(EXTViewConfigurationDepthRange.XR_TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrViewConfigurationDepthRangeEXT.Buffer next(@NativeType("void *") long value) { XrViewConfigurationDepthRangeEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code recommendedNearZ} field. */
        public XrViewConfigurationDepthRangeEXT.Buffer recommendedNearZ(float value) { XrViewConfigurationDepthRangeEXT.nrecommendedNearZ(address(), value); return this; }
        /** Sets the specified value to the {@code minNearZ} field. */
        public XrViewConfigurationDepthRangeEXT.Buffer minNearZ(float value) { XrViewConfigurationDepthRangeEXT.nminNearZ(address(), value); return this; }
        /** Sets the specified value to the {@code recommendedFarZ} field. */
        public XrViewConfigurationDepthRangeEXT.Buffer recommendedFarZ(float value) { XrViewConfigurationDepthRangeEXT.nrecommendedFarZ(address(), value); return this; }
        /** Sets the specified value to the {@code maxFarZ} field. */
        public XrViewConfigurationDepthRangeEXT.Buffer maxFarZ(float value) { XrViewConfigurationDepthRangeEXT.nmaxFarZ(address(), value); return this; }

    }

}