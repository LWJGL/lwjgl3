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
 * struct XrCompositionLayerColorScaleBiasKHR {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrColor4f XrColor4f} colorScale;
 *     {@link XrColor4f XrColor4f} colorBias;
 * }}</pre>
 */
public class XrCompositionLayerColorScaleBiasKHR extends Struct<XrCompositionLayerColorScaleBiasKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COLORSCALE,
        COLORBIAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrColor4f.SIZEOF, XrColor4f.ALIGNOF),
            __member(XrColor4f.SIZEOF, XrColor4f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COLORSCALE = layout.offsetof(2);
        COLORBIAS = layout.offsetof(3);
    }

    protected XrCompositionLayerColorScaleBiasKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerColorScaleBiasKHR create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerColorScaleBiasKHR(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerColorScaleBiasKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerColorScaleBiasKHR(ByteBuffer container) {
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
    /** @return a {@link XrColor4f} view of the {@code colorScale} field. */
    public XrColor4f colorScale() { return ncolorScale(address()); }
    /** @return a {@link XrColor4f} view of the {@code colorBias} field. */
    public XrColor4f colorBias() { return ncolorBias(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerColorScaleBiasKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRCompositionLayerColorScaleBias#XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR} value to the {@code type} field. */
    public XrCompositionLayerColorScaleBiasKHR type$Default() { return type(KHRCompositionLayerColorScaleBias.XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerColorScaleBiasKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrColor4f} to the {@code colorScale} field. */
    public XrCompositionLayerColorScaleBiasKHR colorScale(XrColor4f value) { ncolorScale(address(), value); return this; }
    /** Passes the {@code colorScale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerColorScaleBiasKHR colorScale(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(colorScale()); return this; }
    /** Copies the specified {@link XrColor4f} to the {@code colorBias} field. */
    public XrCompositionLayerColorScaleBiasKHR colorBias(XrColor4f value) { ncolorBias(address(), value); return this; }
    /** Passes the {@code colorBias} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerColorScaleBiasKHR colorBias(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(colorBias()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerColorScaleBiasKHR set(
        int type,
        long next,
        XrColor4f colorScale,
        XrColor4f colorBias
    ) {
        type(type);
        next(next);
        colorScale(colorScale);
        colorBias(colorBias);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerColorScaleBiasKHR set(XrCompositionLayerColorScaleBiasKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerColorScaleBiasKHR malloc() {
        return new XrCompositionLayerColorScaleBiasKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerColorScaleBiasKHR calloc() {
        return new XrCompositionLayerColorScaleBiasKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerColorScaleBiasKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerColorScaleBiasKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance for the specified memory address. */
    public static XrCompositionLayerColorScaleBiasKHR create(long address) {
        return new XrCompositionLayerColorScaleBiasKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerColorScaleBiasKHR createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerColorScaleBiasKHR(address, null);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerColorScaleBiasKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerColorScaleBiasKHR malloc(MemoryStack stack) {
        return new XrCompositionLayerColorScaleBiasKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerColorScaleBiasKHR calloc(MemoryStack stack) {
        return new XrCompositionLayerColorScaleBiasKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerColorScaleBiasKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerColorScaleBiasKHR.NEXT); }
    /** Unsafe version of {@link #colorScale}. */
    public static XrColor4f ncolorScale(long struct) { return XrColor4f.create(struct + XrCompositionLayerColorScaleBiasKHR.COLORSCALE); }
    /** Unsafe version of {@link #colorBias}. */
    public static XrColor4f ncolorBias(long struct) { return XrColor4f.create(struct + XrCompositionLayerColorScaleBiasKHR.COLORBIAS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerColorScaleBiasKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerColorScaleBiasKHR.NEXT, value); }
    /** Unsafe version of {@link #colorScale(XrColor4f) colorScale}. */
    public static void ncolorScale(long struct, XrColor4f value) { memCopy(value.address(), struct + XrCompositionLayerColorScaleBiasKHR.COLORSCALE, XrColor4f.SIZEOF); }
    /** Unsafe version of {@link #colorBias(XrColor4f) colorBias}. */
    public static void ncolorBias(long struct, XrColor4f value) { memCopy(value.address(), struct + XrCompositionLayerColorScaleBiasKHR.COLORBIAS, XrColor4f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerColorScaleBiasKHR} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerColorScaleBiasKHR, Buffer> implements NativeResource {

        private static final XrCompositionLayerColorScaleBiasKHR ELEMENT_FACTORY = XrCompositionLayerColorScaleBiasKHR.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerColorScaleBiasKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerColorScaleBiasKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerColorScaleBiasKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerColorScaleBiasKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerColorScaleBiasKHR.nnext(address()); }
        /** @return a {@link XrColor4f} view of the {@code colorScale} field. */
        public XrColor4f colorScale() { return XrCompositionLayerColorScaleBiasKHR.ncolorScale(address()); }
        /** @return a {@link XrColor4f} view of the {@code colorBias} field. */
        public XrColor4f colorBias() { return XrCompositionLayerColorScaleBiasKHR.ncolorBias(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerColorScaleBiasKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRCompositionLayerColorScaleBias#XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR} value to the {@code type} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer type$Default() { return type(KHRCompositionLayerColorScaleBias.XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerColorScaleBiasKHR.nnext(address(), value); return this; }
        /** Copies the specified {@link XrColor4f} to the {@code colorScale} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer colorScale(XrColor4f value) { XrCompositionLayerColorScaleBiasKHR.ncolorScale(address(), value); return this; }
        /** Passes the {@code colorScale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer colorScale(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(colorScale()); return this; }
        /** Copies the specified {@link XrColor4f} to the {@code colorBias} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer colorBias(XrColor4f value) { XrCompositionLayerColorScaleBiasKHR.ncolorBias(address(), value); return this; }
        /** Passes the {@code colorBias} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer colorBias(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(colorBias()); return this; }

    }

}