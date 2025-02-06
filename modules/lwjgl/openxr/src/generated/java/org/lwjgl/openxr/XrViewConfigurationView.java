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
 * struct XrViewConfigurationView {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t recommendedImageRectWidth;
 *     uint32_t maxImageRectWidth;
 *     uint32_t recommendedImageRectHeight;
 *     uint32_t maxImageRectHeight;
 *     uint32_t recommendedSwapchainSampleCount;
 *     uint32_t maxSwapchainSampleCount;
 * }}</pre>
 */
public class XrViewConfigurationView extends Struct<XrViewConfigurationView> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RECOMMENDEDIMAGERECTWIDTH,
        MAXIMAGERECTWIDTH,
        RECOMMENDEDIMAGERECTHEIGHT,
        MAXIMAGERECTHEIGHT,
        RECOMMENDEDSWAPCHAINSAMPLECOUNT,
        MAXSWAPCHAINSAMPLECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RECOMMENDEDIMAGERECTWIDTH = layout.offsetof(2);
        MAXIMAGERECTWIDTH = layout.offsetof(3);
        RECOMMENDEDIMAGERECTHEIGHT = layout.offsetof(4);
        MAXIMAGERECTHEIGHT = layout.offsetof(5);
        RECOMMENDEDSWAPCHAINSAMPLECOUNT = layout.offsetof(6);
        MAXSWAPCHAINSAMPLECOUNT = layout.offsetof(7);
    }

    protected XrViewConfigurationView(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrViewConfigurationView create(long address, @Nullable ByteBuffer container) {
        return new XrViewConfigurationView(address, container);
    }

    /**
     * Creates a {@code XrViewConfigurationView} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrViewConfigurationView(ByteBuffer container) {
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
    /** @return the value of the {@code recommendedImageRectWidth} field. */
    @NativeType("uint32_t")
    public int recommendedImageRectWidth() { return nrecommendedImageRectWidth(address()); }
    /** @return the value of the {@code maxImageRectWidth} field. */
    @NativeType("uint32_t")
    public int maxImageRectWidth() { return nmaxImageRectWidth(address()); }
    /** @return the value of the {@code recommendedImageRectHeight} field. */
    @NativeType("uint32_t")
    public int recommendedImageRectHeight() { return nrecommendedImageRectHeight(address()); }
    /** @return the value of the {@code maxImageRectHeight} field. */
    @NativeType("uint32_t")
    public int maxImageRectHeight() { return nmaxImageRectHeight(address()); }
    /** @return the value of the {@code recommendedSwapchainSampleCount} field. */
    @NativeType("uint32_t")
    public int recommendedSwapchainSampleCount() { return nrecommendedSwapchainSampleCount(address()); }
    /** @return the value of the {@code maxSwapchainSampleCount} field. */
    @NativeType("uint32_t")
    public int maxSwapchainSampleCount() { return nmaxSwapchainSampleCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrViewConfigurationView type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_VIEW_CONFIGURATION_VIEW TYPE_VIEW_CONFIGURATION_VIEW} value to the {@code type} field. */
    public XrViewConfigurationView type$Default() { return type(XR10.XR_TYPE_VIEW_CONFIGURATION_VIEW); }
    /** Sets the specified value to the {@code next} field. */
    public XrViewConfigurationView next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrFoveatedViewConfigurationViewVARJO} value to the {@code next} chain. */
    public XrViewConfigurationView next(XrFoveatedViewConfigurationViewVARJO value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrFrameSynthesisConfigViewEXT} value to the {@code next} chain. */
    public XrViewConfigurationView next(XrFrameSynthesisConfigViewEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrViewConfigurationDepthRangeEXT} value to the {@code next} chain. */
    public XrViewConfigurationView next(XrViewConfigurationDepthRangeEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrViewConfigurationViewFovEPIC} value to the {@code next} chain. */
    public XrViewConfigurationView next(XrViewConfigurationViewFovEPIC value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code recommendedImageRectWidth} field. */
    public XrViewConfigurationView recommendedImageRectWidth(@NativeType("uint32_t") int value) { nrecommendedImageRectWidth(address(), value); return this; }
    /** Sets the specified value to the {@code maxImageRectWidth} field. */
    public XrViewConfigurationView maxImageRectWidth(@NativeType("uint32_t") int value) { nmaxImageRectWidth(address(), value); return this; }
    /** Sets the specified value to the {@code recommendedImageRectHeight} field. */
    public XrViewConfigurationView recommendedImageRectHeight(@NativeType("uint32_t") int value) { nrecommendedImageRectHeight(address(), value); return this; }
    /** Sets the specified value to the {@code maxImageRectHeight} field. */
    public XrViewConfigurationView maxImageRectHeight(@NativeType("uint32_t") int value) { nmaxImageRectHeight(address(), value); return this; }
    /** Sets the specified value to the {@code recommendedSwapchainSampleCount} field. */
    public XrViewConfigurationView recommendedSwapchainSampleCount(@NativeType("uint32_t") int value) { nrecommendedSwapchainSampleCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxSwapchainSampleCount} field. */
    public XrViewConfigurationView maxSwapchainSampleCount(@NativeType("uint32_t") int value) { nmaxSwapchainSampleCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrViewConfigurationView set(
        int type,
        long next,
        int recommendedImageRectWidth,
        int maxImageRectWidth,
        int recommendedImageRectHeight,
        int maxImageRectHeight,
        int recommendedSwapchainSampleCount,
        int maxSwapchainSampleCount
    ) {
        type(type);
        next(next);
        recommendedImageRectWidth(recommendedImageRectWidth);
        maxImageRectWidth(maxImageRectWidth);
        recommendedImageRectHeight(recommendedImageRectHeight);
        maxImageRectHeight(maxImageRectHeight);
        recommendedSwapchainSampleCount(recommendedSwapchainSampleCount);
        maxSwapchainSampleCount(maxSwapchainSampleCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrViewConfigurationView set(XrViewConfigurationView src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrViewConfigurationView} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationView malloc() {
        return new XrViewConfigurationView(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrViewConfigurationView} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationView calloc() {
        return new XrViewConfigurationView(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrViewConfigurationView} instance allocated with {@link BufferUtils}. */
    public static XrViewConfigurationView create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrViewConfigurationView(memAddress(container), container);
    }

    /** Returns a new {@code XrViewConfigurationView} instance for the specified memory address. */
    public static XrViewConfigurationView create(long address) {
        return new XrViewConfigurationView(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrViewConfigurationView createSafe(long address) {
        return address == NULL ? null : new XrViewConfigurationView(address, null);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrViewConfigurationView.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrViewConfigurationView.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrViewConfigurationView} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationView malloc(MemoryStack stack) {
        return new XrViewConfigurationView(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrViewConfigurationView} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationView calloc(MemoryStack stack) {
        return new XrViewConfigurationView(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrViewConfigurationView.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrViewConfigurationView.NEXT); }
    /** Unsafe version of {@link #recommendedImageRectWidth}. */
    public static int nrecommendedImageRectWidth(long struct) { return memGetInt(struct + XrViewConfigurationView.RECOMMENDEDIMAGERECTWIDTH); }
    /** Unsafe version of {@link #maxImageRectWidth}. */
    public static int nmaxImageRectWidth(long struct) { return memGetInt(struct + XrViewConfigurationView.MAXIMAGERECTWIDTH); }
    /** Unsafe version of {@link #recommendedImageRectHeight}. */
    public static int nrecommendedImageRectHeight(long struct) { return memGetInt(struct + XrViewConfigurationView.RECOMMENDEDIMAGERECTHEIGHT); }
    /** Unsafe version of {@link #maxImageRectHeight}. */
    public static int nmaxImageRectHeight(long struct) { return memGetInt(struct + XrViewConfigurationView.MAXIMAGERECTHEIGHT); }
    /** Unsafe version of {@link #recommendedSwapchainSampleCount}. */
    public static int nrecommendedSwapchainSampleCount(long struct) { return memGetInt(struct + XrViewConfigurationView.RECOMMENDEDSWAPCHAINSAMPLECOUNT); }
    /** Unsafe version of {@link #maxSwapchainSampleCount}. */
    public static int nmaxSwapchainSampleCount(long struct) { return memGetInt(struct + XrViewConfigurationView.MAXSWAPCHAINSAMPLECOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrViewConfigurationView.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrViewConfigurationView.NEXT, value); }
    /** Unsafe version of {@link #recommendedImageRectWidth(int) recommendedImageRectWidth}. */
    public static void nrecommendedImageRectWidth(long struct, int value) { memPutInt(struct + XrViewConfigurationView.RECOMMENDEDIMAGERECTWIDTH, value); }
    /** Unsafe version of {@link #maxImageRectWidth(int) maxImageRectWidth}. */
    public static void nmaxImageRectWidth(long struct, int value) { memPutInt(struct + XrViewConfigurationView.MAXIMAGERECTWIDTH, value); }
    /** Unsafe version of {@link #recommendedImageRectHeight(int) recommendedImageRectHeight}. */
    public static void nrecommendedImageRectHeight(long struct, int value) { memPutInt(struct + XrViewConfigurationView.RECOMMENDEDIMAGERECTHEIGHT, value); }
    /** Unsafe version of {@link #maxImageRectHeight(int) maxImageRectHeight}. */
    public static void nmaxImageRectHeight(long struct, int value) { memPutInt(struct + XrViewConfigurationView.MAXIMAGERECTHEIGHT, value); }
    /** Unsafe version of {@link #recommendedSwapchainSampleCount(int) recommendedSwapchainSampleCount}. */
    public static void nrecommendedSwapchainSampleCount(long struct, int value) { memPutInt(struct + XrViewConfigurationView.RECOMMENDEDSWAPCHAINSAMPLECOUNT, value); }
    /** Unsafe version of {@link #maxSwapchainSampleCount(int) maxSwapchainSampleCount}. */
    public static void nmaxSwapchainSampleCount(long struct, int value) { memPutInt(struct + XrViewConfigurationView.MAXSWAPCHAINSAMPLECOUNT, value); }

    // -----------------------------------

    /** An array of {@link XrViewConfigurationView} structs. */
    public static class Buffer extends StructBuffer<XrViewConfigurationView, Buffer> implements NativeResource {

        private static final XrViewConfigurationView ELEMENT_FACTORY = XrViewConfigurationView.create(-1L);

        /**
         * Creates a new {@code XrViewConfigurationView.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrViewConfigurationView#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrViewConfigurationView getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrViewConfigurationView.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrViewConfigurationView.nnext(address()); }
        /** @return the value of the {@code recommendedImageRectWidth} field. */
        @NativeType("uint32_t")
        public int recommendedImageRectWidth() { return XrViewConfigurationView.nrecommendedImageRectWidth(address()); }
        /** @return the value of the {@code maxImageRectWidth} field. */
        @NativeType("uint32_t")
        public int maxImageRectWidth() { return XrViewConfigurationView.nmaxImageRectWidth(address()); }
        /** @return the value of the {@code recommendedImageRectHeight} field. */
        @NativeType("uint32_t")
        public int recommendedImageRectHeight() { return XrViewConfigurationView.nrecommendedImageRectHeight(address()); }
        /** @return the value of the {@code maxImageRectHeight} field. */
        @NativeType("uint32_t")
        public int maxImageRectHeight() { return XrViewConfigurationView.nmaxImageRectHeight(address()); }
        /** @return the value of the {@code recommendedSwapchainSampleCount} field. */
        @NativeType("uint32_t")
        public int recommendedSwapchainSampleCount() { return XrViewConfigurationView.nrecommendedSwapchainSampleCount(address()); }
        /** @return the value of the {@code maxSwapchainSampleCount} field. */
        @NativeType("uint32_t")
        public int maxSwapchainSampleCount() { return XrViewConfigurationView.nmaxSwapchainSampleCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrViewConfigurationView.Buffer type(@NativeType("XrStructureType") int value) { XrViewConfigurationView.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_VIEW_CONFIGURATION_VIEW TYPE_VIEW_CONFIGURATION_VIEW} value to the {@code type} field. */
        public XrViewConfigurationView.Buffer type$Default() { return type(XR10.XR_TYPE_VIEW_CONFIGURATION_VIEW); }
        /** Sets the specified value to the {@code next} field. */
        public XrViewConfigurationView.Buffer next(@NativeType("void *") long value) { XrViewConfigurationView.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrFoveatedViewConfigurationViewVARJO} value to the {@code next} chain. */
        public XrViewConfigurationView.Buffer next(XrFoveatedViewConfigurationViewVARJO value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrFrameSynthesisConfigViewEXT} value to the {@code next} chain. */
        public XrViewConfigurationView.Buffer next(XrFrameSynthesisConfigViewEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrViewConfigurationDepthRangeEXT} value to the {@code next} chain. */
        public XrViewConfigurationView.Buffer next(XrViewConfigurationDepthRangeEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrViewConfigurationViewFovEPIC} value to the {@code next} chain. */
        public XrViewConfigurationView.Buffer next(XrViewConfigurationViewFovEPIC value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code recommendedImageRectWidth} field. */
        public XrViewConfigurationView.Buffer recommendedImageRectWidth(@NativeType("uint32_t") int value) { XrViewConfigurationView.nrecommendedImageRectWidth(address(), value); return this; }
        /** Sets the specified value to the {@code maxImageRectWidth} field. */
        public XrViewConfigurationView.Buffer maxImageRectWidth(@NativeType("uint32_t") int value) { XrViewConfigurationView.nmaxImageRectWidth(address(), value); return this; }
        /** Sets the specified value to the {@code recommendedImageRectHeight} field. */
        public XrViewConfigurationView.Buffer recommendedImageRectHeight(@NativeType("uint32_t") int value) { XrViewConfigurationView.nrecommendedImageRectHeight(address(), value); return this; }
        /** Sets the specified value to the {@code maxImageRectHeight} field. */
        public XrViewConfigurationView.Buffer maxImageRectHeight(@NativeType("uint32_t") int value) { XrViewConfigurationView.nmaxImageRectHeight(address(), value); return this; }
        /** Sets the specified value to the {@code recommendedSwapchainSampleCount} field. */
        public XrViewConfigurationView.Buffer recommendedSwapchainSampleCount(@NativeType("uint32_t") int value) { XrViewConfigurationView.nrecommendedSwapchainSampleCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxSwapchainSampleCount} field. */
        public XrViewConfigurationView.Buffer maxSwapchainSampleCount(@NativeType("uint32_t") int value) { XrViewConfigurationView.nmaxSwapchainSampleCount(address(), value); return this; }

    }

}