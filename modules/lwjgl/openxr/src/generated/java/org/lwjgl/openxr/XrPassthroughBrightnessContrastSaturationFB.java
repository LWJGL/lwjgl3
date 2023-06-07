/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A color adjustment for passthrough layers.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrPassthroughBrightnessContrastSaturationFB} lets applications adjust the brightness, contrast, and saturation of passthrough layers. The adjustments only are applied before any additional effects (such as edges) are rendered on top.</p>
 * 
 * <p>The adjustments are applied in CIELAB color space (white point D65) using the following formulas:</p>
 * 
 * <ul>
 * <li><code>L*' = clamp((L* - 50) × contrast + 50, 0, 100)</code></li>
 * <li><code>L*'' = clamp(L*' + brightness, 0, 100)</code></li>
 * <li><code>(a*', b*') = (a*, b*) × saturation</code></li>
 * <li>Resulting color: (L*'', a*', b*')</li>
 * </ul>
 * 
 * <p>{@link XrPassthroughBrightnessContrastSaturationFB} is provided in the {@code next} chain of {@link XrPassthroughStyleFB}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using {@link XrPassthroughBrightnessContrastSaturationFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBPassthrough#XR_TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughBrightnessContrastSaturationFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     float {@link #brightness};
 *     float {@link #contrast};
 *     float {@link #saturation};
 * }</code></pre>
 */
public class XrPassthroughBrightnessContrastSaturationFB extends Struct<XrPassthroughBrightnessContrastSaturationFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BRIGHTNESS,
        CONTRAST,
        SATURATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BRIGHTNESS = layout.offsetof(2);
        CONTRAST = layout.offsetof(3);
        SATURATION = layout.offsetof(4);
    }

    protected XrPassthroughBrightnessContrastSaturationFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughBrightnessContrastSaturationFB create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughBrightnessContrastSaturationFB(address, container);
    }

    /**
     * Creates a {@code XrPassthroughBrightnessContrastSaturationFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughBrightnessContrastSaturationFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the brightness adjustment value in the range [-100, 100]. The neutral element is 0. */
    public float brightness() { return nbrightness(address()); }
    /** the contrast adjustment value in the range [0, Infinity]. The neutral element is 1. */
    public float contrast() { return ncontrast(address()); }
    /** the saturation adjustment value in the range [0, Infinity]. The neutral element is 1. */
    public float saturation() { return nsaturation(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPassthroughBrightnessContrastSaturationFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB} value to the {@link #type} field. */
    public XrPassthroughBrightnessContrastSaturationFB type$Default() { return type(FBPassthrough.XR_TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPassthroughBrightnessContrastSaturationFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #brightness} field. */
    public XrPassthroughBrightnessContrastSaturationFB brightness(float value) { nbrightness(address(), value); return this; }
    /** Sets the specified value to the {@link #contrast} field. */
    public XrPassthroughBrightnessContrastSaturationFB contrast(float value) { ncontrast(address(), value); return this; }
    /** Sets the specified value to the {@link #saturation} field. */
    public XrPassthroughBrightnessContrastSaturationFB saturation(float value) { nsaturation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughBrightnessContrastSaturationFB set(
        int type,
        long next,
        float brightness,
        float contrast,
        float saturation
    ) {
        type(type);
        next(next);
        brightness(brightness);
        contrast(contrast);
        saturation(saturation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughBrightnessContrastSaturationFB set(XrPassthroughBrightnessContrastSaturationFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughBrightnessContrastSaturationFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughBrightnessContrastSaturationFB malloc() {
        return new XrPassthroughBrightnessContrastSaturationFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughBrightnessContrastSaturationFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughBrightnessContrastSaturationFB calloc() {
        return new XrPassthroughBrightnessContrastSaturationFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughBrightnessContrastSaturationFB} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughBrightnessContrastSaturationFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughBrightnessContrastSaturationFB(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughBrightnessContrastSaturationFB} instance for the specified memory address. */
    public static XrPassthroughBrightnessContrastSaturationFB create(long address) {
        return new XrPassthroughBrightnessContrastSaturationFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughBrightnessContrastSaturationFB createSafe(long address) {
        return address == NULL ? null : new XrPassthroughBrightnessContrastSaturationFB(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughBrightnessContrastSaturationFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughBrightnessContrastSaturationFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughBrightnessContrastSaturationFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughBrightnessContrastSaturationFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughBrightnessContrastSaturationFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughBrightnessContrastSaturationFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughBrightnessContrastSaturationFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughBrightnessContrastSaturationFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughBrightnessContrastSaturationFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughBrightnessContrastSaturationFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughBrightnessContrastSaturationFB malloc(MemoryStack stack) {
        return new XrPassthroughBrightnessContrastSaturationFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughBrightnessContrastSaturationFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughBrightnessContrastSaturationFB calloc(MemoryStack stack) {
        return new XrPassthroughBrightnessContrastSaturationFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughBrightnessContrastSaturationFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughBrightnessContrastSaturationFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughBrightnessContrastSaturationFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughBrightnessContrastSaturationFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughBrightnessContrastSaturationFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughBrightnessContrastSaturationFB.NEXT); }
    /** Unsafe version of {@link #brightness}. */
    public static float nbrightness(long struct) { return UNSAFE.getFloat(null, struct + XrPassthroughBrightnessContrastSaturationFB.BRIGHTNESS); }
    /** Unsafe version of {@link #contrast}. */
    public static float ncontrast(long struct) { return UNSAFE.getFloat(null, struct + XrPassthroughBrightnessContrastSaturationFB.CONTRAST); }
    /** Unsafe version of {@link #saturation}. */
    public static float nsaturation(long struct) { return UNSAFE.getFloat(null, struct + XrPassthroughBrightnessContrastSaturationFB.SATURATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughBrightnessContrastSaturationFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughBrightnessContrastSaturationFB.NEXT, value); }
    /** Unsafe version of {@link #brightness(float) brightness}. */
    public static void nbrightness(long struct, float value) { UNSAFE.putFloat(null, struct + XrPassthroughBrightnessContrastSaturationFB.BRIGHTNESS, value); }
    /** Unsafe version of {@link #contrast(float) contrast}. */
    public static void ncontrast(long struct, float value) { UNSAFE.putFloat(null, struct + XrPassthroughBrightnessContrastSaturationFB.CONTRAST, value); }
    /** Unsafe version of {@link #saturation(float) saturation}. */
    public static void nsaturation(long struct, float value) { UNSAFE.putFloat(null, struct + XrPassthroughBrightnessContrastSaturationFB.SATURATION, value); }

    // -----------------------------------

    /** An array of {@link XrPassthroughBrightnessContrastSaturationFB} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughBrightnessContrastSaturationFB, Buffer> implements NativeResource {

        private static final XrPassthroughBrightnessContrastSaturationFB ELEMENT_FACTORY = XrPassthroughBrightnessContrastSaturationFB.create(-1L);

        /**
         * Creates a new {@code XrPassthroughBrightnessContrastSaturationFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughBrightnessContrastSaturationFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughBrightnessContrastSaturationFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPassthroughBrightnessContrastSaturationFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughBrightnessContrastSaturationFB.ntype(address()); }
        /** @return the value of the {@link XrPassthroughBrightnessContrastSaturationFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughBrightnessContrastSaturationFB.nnext(address()); }
        /** @return the value of the {@link XrPassthroughBrightnessContrastSaturationFB#brightness} field. */
        public float brightness() { return XrPassthroughBrightnessContrastSaturationFB.nbrightness(address()); }
        /** @return the value of the {@link XrPassthroughBrightnessContrastSaturationFB#contrast} field. */
        public float contrast() { return XrPassthroughBrightnessContrastSaturationFB.ncontrast(address()); }
        /** @return the value of the {@link XrPassthroughBrightnessContrastSaturationFB#saturation} field. */
        public float saturation() { return XrPassthroughBrightnessContrastSaturationFB.nsaturation(address()); }

        /** Sets the specified value to the {@link XrPassthroughBrightnessContrastSaturationFB#type} field. */
        public XrPassthroughBrightnessContrastSaturationFB.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughBrightnessContrastSaturationFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB} value to the {@link XrPassthroughBrightnessContrastSaturationFB#type} field. */
        public XrPassthroughBrightnessContrastSaturationFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB); }
        /** Sets the specified value to the {@link XrPassthroughBrightnessContrastSaturationFB#next} field. */
        public XrPassthroughBrightnessContrastSaturationFB.Buffer next(@NativeType("void const *") long value) { XrPassthroughBrightnessContrastSaturationFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughBrightnessContrastSaturationFB#brightness} field. */
        public XrPassthroughBrightnessContrastSaturationFB.Buffer brightness(float value) { XrPassthroughBrightnessContrastSaturationFB.nbrightness(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughBrightnessContrastSaturationFB#contrast} field. */
        public XrPassthroughBrightnessContrastSaturationFB.Buffer contrast(float value) { XrPassthroughBrightnessContrastSaturationFB.ncontrast(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughBrightnessContrastSaturationFB#saturation} field. */
        public XrPassthroughBrightnessContrastSaturationFB.Buffer saturation(float value) { XrPassthroughBrightnessContrastSaturationFB.nsaturation(address(), value); return this; }

    }

}