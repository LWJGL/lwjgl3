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
 * struct XrFrameSynthesisConfigViewEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t recommendedMotionVectorImageRectWidth;
 *     uint32_t recommendedMotionVectorImageRectHeight;
 * }}</pre>
 */
public class XrFrameSynthesisConfigViewEXT extends Struct<XrFrameSynthesisConfigViewEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RECOMMENDEDMOTIONVECTORIMAGERECTWIDTH,
        RECOMMENDEDMOTIONVECTORIMAGERECTHEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RECOMMENDEDMOTIONVECTORIMAGERECTWIDTH = layout.offsetof(2);
        RECOMMENDEDMOTIONVECTORIMAGERECTHEIGHT = layout.offsetof(3);
    }

    protected XrFrameSynthesisConfigViewEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFrameSynthesisConfigViewEXT create(long address, @Nullable ByteBuffer container) {
        return new XrFrameSynthesisConfigViewEXT(address, container);
    }

    /**
     * Creates a {@code XrFrameSynthesisConfigViewEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFrameSynthesisConfigViewEXT(ByteBuffer container) {
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
    /** @return the value of the {@code recommendedMotionVectorImageRectWidth} field. */
    @NativeType("uint32_t")
    public int recommendedMotionVectorImageRectWidth() { return nrecommendedMotionVectorImageRectWidth(address()); }
    /** @return the value of the {@code recommendedMotionVectorImageRectHeight} field. */
    @NativeType("uint32_t")
    public int recommendedMotionVectorImageRectHeight() { return nrecommendedMotionVectorImageRectHeight(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFrameSynthesisConfigViewEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTFrameSynthesis#XR_TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT} value to the {@code type} field. */
    public XrFrameSynthesisConfigViewEXT type$Default() { return type(EXTFrameSynthesis.XR_TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrFrameSynthesisConfigViewEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code recommendedMotionVectorImageRectWidth} field. */
    public XrFrameSynthesisConfigViewEXT recommendedMotionVectorImageRectWidth(@NativeType("uint32_t") int value) { nrecommendedMotionVectorImageRectWidth(address(), value); return this; }
    /** Sets the specified value to the {@code recommendedMotionVectorImageRectHeight} field. */
    public XrFrameSynthesisConfigViewEXT recommendedMotionVectorImageRectHeight(@NativeType("uint32_t") int value) { nrecommendedMotionVectorImageRectHeight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFrameSynthesisConfigViewEXT set(
        int type,
        long next,
        int recommendedMotionVectorImageRectWidth,
        int recommendedMotionVectorImageRectHeight
    ) {
        type(type);
        next(next);
        recommendedMotionVectorImageRectWidth(recommendedMotionVectorImageRectWidth);
        recommendedMotionVectorImageRectHeight(recommendedMotionVectorImageRectHeight);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFrameSynthesisConfigViewEXT set(XrFrameSynthesisConfigViewEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFrameSynthesisConfigViewEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFrameSynthesisConfigViewEXT malloc() {
        return new XrFrameSynthesisConfigViewEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFrameSynthesisConfigViewEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFrameSynthesisConfigViewEXT calloc() {
        return new XrFrameSynthesisConfigViewEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFrameSynthesisConfigViewEXT} instance allocated with {@link BufferUtils}. */
    public static XrFrameSynthesisConfigViewEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFrameSynthesisConfigViewEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrFrameSynthesisConfigViewEXT} instance for the specified memory address. */
    public static XrFrameSynthesisConfigViewEXT create(long address) {
        return new XrFrameSynthesisConfigViewEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFrameSynthesisConfigViewEXT createSafe(long address) {
        return address == NULL ? null : new XrFrameSynthesisConfigViewEXT(address, null);
    }

    /**
     * Returns a new {@link XrFrameSynthesisConfigViewEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisConfigViewEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFrameSynthesisConfigViewEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisConfigViewEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameSynthesisConfigViewEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisConfigViewEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFrameSynthesisConfigViewEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisConfigViewEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFrameSynthesisConfigViewEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFrameSynthesisConfigViewEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameSynthesisConfigViewEXT malloc(MemoryStack stack) {
        return new XrFrameSynthesisConfigViewEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFrameSynthesisConfigViewEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameSynthesisConfigViewEXT calloc(MemoryStack stack) {
        return new XrFrameSynthesisConfigViewEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFrameSynthesisConfigViewEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisConfigViewEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameSynthesisConfigViewEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisConfigViewEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFrameSynthesisConfigViewEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFrameSynthesisConfigViewEXT.NEXT); }
    /** Unsafe version of {@link #recommendedMotionVectorImageRectWidth}. */
    public static int nrecommendedMotionVectorImageRectWidth(long struct) { return memGetInt(struct + XrFrameSynthesisConfigViewEXT.RECOMMENDEDMOTIONVECTORIMAGERECTWIDTH); }
    /** Unsafe version of {@link #recommendedMotionVectorImageRectHeight}. */
    public static int nrecommendedMotionVectorImageRectHeight(long struct) { return memGetInt(struct + XrFrameSynthesisConfigViewEXT.RECOMMENDEDMOTIONVECTORIMAGERECTHEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFrameSynthesisConfigViewEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFrameSynthesisConfigViewEXT.NEXT, value); }
    /** Unsafe version of {@link #recommendedMotionVectorImageRectWidth(int) recommendedMotionVectorImageRectWidth}. */
    public static void nrecommendedMotionVectorImageRectWidth(long struct, int value) { memPutInt(struct + XrFrameSynthesisConfigViewEXT.RECOMMENDEDMOTIONVECTORIMAGERECTWIDTH, value); }
    /** Unsafe version of {@link #recommendedMotionVectorImageRectHeight(int) recommendedMotionVectorImageRectHeight}. */
    public static void nrecommendedMotionVectorImageRectHeight(long struct, int value) { memPutInt(struct + XrFrameSynthesisConfigViewEXT.RECOMMENDEDMOTIONVECTORIMAGERECTHEIGHT, value); }

    // -----------------------------------

    /** An array of {@link XrFrameSynthesisConfigViewEXT} structs. */
    public static class Buffer extends StructBuffer<XrFrameSynthesisConfigViewEXT, Buffer> implements NativeResource {

        private static final XrFrameSynthesisConfigViewEXT ELEMENT_FACTORY = XrFrameSynthesisConfigViewEXT.create(-1L);

        /**
         * Creates a new {@code XrFrameSynthesisConfigViewEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFrameSynthesisConfigViewEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFrameSynthesisConfigViewEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFrameSynthesisConfigViewEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFrameSynthesisConfigViewEXT.nnext(address()); }
        /** @return the value of the {@code recommendedMotionVectorImageRectWidth} field. */
        @NativeType("uint32_t")
        public int recommendedMotionVectorImageRectWidth() { return XrFrameSynthesisConfigViewEXT.nrecommendedMotionVectorImageRectWidth(address()); }
        /** @return the value of the {@code recommendedMotionVectorImageRectHeight} field. */
        @NativeType("uint32_t")
        public int recommendedMotionVectorImageRectHeight() { return XrFrameSynthesisConfigViewEXT.nrecommendedMotionVectorImageRectHeight(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFrameSynthesisConfigViewEXT.Buffer type(@NativeType("XrStructureType") int value) { XrFrameSynthesisConfigViewEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTFrameSynthesis#XR_TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT} value to the {@code type} field. */
        public XrFrameSynthesisConfigViewEXT.Buffer type$Default() { return type(EXTFrameSynthesis.XR_TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrFrameSynthesisConfigViewEXT.Buffer next(@NativeType("void *") long value) { XrFrameSynthesisConfigViewEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code recommendedMotionVectorImageRectWidth} field. */
        public XrFrameSynthesisConfigViewEXT.Buffer recommendedMotionVectorImageRectWidth(@NativeType("uint32_t") int value) { XrFrameSynthesisConfigViewEXT.nrecommendedMotionVectorImageRectWidth(address(), value); return this; }
        /** Sets the specified value to the {@code recommendedMotionVectorImageRectHeight} field. */
        public XrFrameSynthesisConfigViewEXT.Buffer recommendedMotionVectorImageRectHeight(@NativeType("uint32_t") int value) { XrFrameSynthesisConfigViewEXT.nrecommendedMotionVectorImageRectHeight(address(), value); return this; }

    }

}