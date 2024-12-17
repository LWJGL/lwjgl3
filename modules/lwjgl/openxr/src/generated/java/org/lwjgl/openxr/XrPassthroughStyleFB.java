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
 * struct XrPassthroughStyleFB {
 *     XrStructureType type;
 *     void const * next;
 *     float textureOpacityFactor;
 *     {@link XrColor4f XrColor4f} edgeColor;
 * }}</pre>
 */
public class XrPassthroughStyleFB extends Struct<XrPassthroughStyleFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TEXTUREOPACITYFACTOR,
        EDGECOLOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrColor4f.SIZEOF, XrColor4f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TEXTUREOPACITYFACTOR = layout.offsetof(2);
        EDGECOLOR = layout.offsetof(3);
    }

    protected XrPassthroughStyleFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughStyleFB create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughStyleFB(address, container);
    }

    /**
     * Creates a {@code XrPassthroughStyleFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughStyleFB(ByteBuffer container) {
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
    /** @return the value of the {@code textureOpacityFactor} field. */
    public float textureOpacityFactor() { return ntextureOpacityFactor(address()); }
    /** @return a {@link XrColor4f} view of the {@code edgeColor} field. */
    public XrColor4f edgeColor() { return nedgeColor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughStyleFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_PASSTHROUGH_STYLE_FB TYPE_PASSTHROUGH_STYLE_FB} value to the {@code type} field. */
    public XrPassthroughStyleFB type$Default() { return type(FBPassthrough.XR_TYPE_PASSTHROUGH_STYLE_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughStyleFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrPassthroughBrightnessContrastSaturationFB} value to the {@code next} chain. */
    public XrPassthroughStyleFB next(XrPassthroughBrightnessContrastSaturationFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrPassthroughColorMapInterpolatedLutMETA} value to the {@code next} chain. */
    public XrPassthroughStyleFB next(XrPassthroughColorMapInterpolatedLutMETA value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrPassthroughColorMapLutMETA} value to the {@code next} chain. */
    public XrPassthroughStyleFB next(XrPassthroughColorMapLutMETA value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrPassthroughColorMapMonoToMonoFB} value to the {@code next} chain. */
    public XrPassthroughStyleFB next(XrPassthroughColorMapMonoToMonoFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrPassthroughColorMapMonoToRgbaFB} value to the {@code next} chain. */
    public XrPassthroughStyleFB next(XrPassthroughColorMapMonoToRgbaFB value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code textureOpacityFactor} field. */
    public XrPassthroughStyleFB textureOpacityFactor(float value) { ntextureOpacityFactor(address(), value); return this; }
    /** Copies the specified {@link XrColor4f} to the {@code edgeColor} field. */
    public XrPassthroughStyleFB edgeColor(XrColor4f value) { nedgeColor(address(), value); return this; }
    /** Passes the {@code edgeColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPassthroughStyleFB edgeColor(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(edgeColor()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughStyleFB set(
        int type,
        long next,
        float textureOpacityFactor,
        XrColor4f edgeColor
    ) {
        type(type);
        next(next);
        textureOpacityFactor(textureOpacityFactor);
        edgeColor(edgeColor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughStyleFB set(XrPassthroughStyleFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughStyleFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughStyleFB malloc() {
        return new XrPassthroughStyleFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughStyleFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughStyleFB calloc() {
        return new XrPassthroughStyleFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughStyleFB} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughStyleFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughStyleFB(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughStyleFB} instance for the specified memory address. */
    public static XrPassthroughStyleFB create(long address) {
        return new XrPassthroughStyleFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughStyleFB createSafe(long address) {
        return address == NULL ? null : new XrPassthroughStyleFB(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughStyleFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughStyleFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughStyleFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughStyleFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughStyleFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughStyleFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughStyleFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughStyleFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughStyleFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughStyleFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughStyleFB malloc(MemoryStack stack) {
        return new XrPassthroughStyleFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughStyleFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughStyleFB calloc(MemoryStack stack) {
        return new XrPassthroughStyleFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughStyleFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughStyleFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughStyleFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughStyleFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughStyleFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughStyleFB.NEXT); }
    /** Unsafe version of {@link #textureOpacityFactor}. */
    public static float ntextureOpacityFactor(long struct) { return memGetFloat(struct + XrPassthroughStyleFB.TEXTUREOPACITYFACTOR); }
    /** Unsafe version of {@link #edgeColor}. */
    public static XrColor4f nedgeColor(long struct) { return XrColor4f.create(struct + XrPassthroughStyleFB.EDGECOLOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughStyleFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughStyleFB.NEXT, value); }
    /** Unsafe version of {@link #textureOpacityFactor(float) textureOpacityFactor}. */
    public static void ntextureOpacityFactor(long struct, float value) { memPutFloat(struct + XrPassthroughStyleFB.TEXTUREOPACITYFACTOR, value); }
    /** Unsafe version of {@link #edgeColor(XrColor4f) edgeColor}. */
    public static void nedgeColor(long struct, XrColor4f value) { memCopy(value.address(), struct + XrPassthroughStyleFB.EDGECOLOR, XrColor4f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrPassthroughStyleFB} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughStyleFB, Buffer> implements NativeResource {

        private static final XrPassthroughStyleFB ELEMENT_FACTORY = XrPassthroughStyleFB.create(-1L);

        /**
         * Creates a new {@code XrPassthroughStyleFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughStyleFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughStyleFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughStyleFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughStyleFB.nnext(address()); }
        /** @return the value of the {@code textureOpacityFactor} field. */
        public float textureOpacityFactor() { return XrPassthroughStyleFB.ntextureOpacityFactor(address()); }
        /** @return a {@link XrColor4f} view of the {@code edgeColor} field. */
        public XrColor4f edgeColor() { return XrPassthroughStyleFB.nedgeColor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughStyleFB.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughStyleFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_PASSTHROUGH_STYLE_FB TYPE_PASSTHROUGH_STYLE_FB} value to the {@code type} field. */
        public XrPassthroughStyleFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_PASSTHROUGH_STYLE_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughStyleFB.Buffer next(@NativeType("void const *") long value) { XrPassthroughStyleFB.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrPassthroughBrightnessContrastSaturationFB} value to the {@code next} chain. */
        public XrPassthroughStyleFB.Buffer next(XrPassthroughBrightnessContrastSaturationFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrPassthroughColorMapInterpolatedLutMETA} value to the {@code next} chain. */
        public XrPassthroughStyleFB.Buffer next(XrPassthroughColorMapInterpolatedLutMETA value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrPassthroughColorMapLutMETA} value to the {@code next} chain. */
        public XrPassthroughStyleFB.Buffer next(XrPassthroughColorMapLutMETA value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrPassthroughColorMapMonoToMonoFB} value to the {@code next} chain. */
        public XrPassthroughStyleFB.Buffer next(XrPassthroughColorMapMonoToMonoFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrPassthroughColorMapMonoToRgbaFB} value to the {@code next} chain. */
        public XrPassthroughStyleFB.Buffer next(XrPassthroughColorMapMonoToRgbaFB value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code textureOpacityFactor} field. */
        public XrPassthroughStyleFB.Buffer textureOpacityFactor(float value) { XrPassthroughStyleFB.ntextureOpacityFactor(address(), value); return this; }
        /** Copies the specified {@link XrColor4f} to the {@code edgeColor} field. */
        public XrPassthroughStyleFB.Buffer edgeColor(XrColor4f value) { XrPassthroughStyleFB.nedgeColor(address(), value); return this; }
        /** Passes the {@code edgeColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPassthroughStyleFB.Buffer edgeColor(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(edgeColor()); return this; }

    }

}