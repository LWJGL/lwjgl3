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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A color map defined by a LUT.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrPassthroughColorMapLutMETA} lets applications apply a color LUT to a passthrough layer. Other Passthrough style elements (such as edges) <b>must</b> not be affected by color LUTs.</p>
 * 
 * <p>Applications <b>may</b> use {@code weight} to efficiently blend between the original colors and the mapped colors. The blend is computed as <code>(1 - weight) * C<sub>in</sub> + weight * colorLut[C<sub>in</sub>]</code>.</p>
 * 
 * <p>{@link XrPassthroughColorMapLutMETA} is provided in the {@code next} chain of {@link XrPassthroughStyleFB} when calling {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB}. Subsequent calls to {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB} with {@link XrPassthroughColorMapLutMETA} in the {@code next} chain update the color LUT for that layer. Subsequent calls to {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB} without this {@link XrPassthroughColorMapLutMETA} (or {@link XrPassthroughColorMapInterpolatedLutMETA}) in the next chain disable color LUTs for that layer.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using {@link XrPassthroughColorMapLutMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_MAP_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_LUT_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code colorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughColorMapLutMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPassthroughColorLutMETA {@link #colorLut};
 *     float {@link #weight};
 * }</code></pre>
 */
public class XrPassthroughColorMapLutMETA extends Struct<XrPassthroughColorMapLutMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COLORLUT,
        WEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COLORLUT = layout.offsetof(2);
        WEIGHT = layout.offsetof(3);
    }

    protected XrPassthroughColorMapLutMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughColorMapLutMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughColorMapLutMETA(address, container);
    }

    /**
     * Creates a {@code XrPassthroughColorMapLutMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorMapLutMETA(ByteBuffer container) {
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
    /** an {@code XrPassthroughColorLutMETA}. */
    @NativeType("XrPassthroughColorLutMETA")
    public long colorLut() { return ncolorLut(address()); }
    /** a factor in the range <code>[0, 1]</code> which defines the linear blend between the original and the mapped colors for the output color. */
    public float weight() { return nweight(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPassthroughColorMapLutMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_MAP_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_LUT_META} value to the {@link #type} field. */
    public XrPassthroughColorMapLutMETA type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_MAP_LUT_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPassthroughColorMapLutMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #colorLut} field. */
    public XrPassthroughColorMapLutMETA colorLut(XrPassthroughColorLutMETA value) { ncolorLut(address(), value); return this; }
    /** Sets the specified value to the {@link #weight} field. */
    public XrPassthroughColorMapLutMETA weight(float value) { nweight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughColorMapLutMETA set(
        int type,
        long next,
        XrPassthroughColorLutMETA colorLut,
        float weight
    ) {
        type(type);
        next(next);
        colorLut(colorLut);
        weight(weight);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughColorMapLutMETA set(XrPassthroughColorMapLutMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorMapLutMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorMapLutMETA malloc() {
        return new XrPassthroughColorMapLutMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorMapLutMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorMapLutMETA calloc() {
        return new XrPassthroughColorMapLutMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorMapLutMETA} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorMapLutMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughColorMapLutMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorMapLutMETA} instance for the specified memory address. */
    public static XrPassthroughColorMapLutMETA create(long address) {
        return new XrPassthroughColorMapLutMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorMapLutMETA createSafe(long address) {
        return address == NULL ? null : new XrPassthroughColorMapLutMETA(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapLutMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapLutMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapLutMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapLutMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapLutMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapLutMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughColorMapLutMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapLutMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorMapLutMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorMapLutMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorMapLutMETA malloc(MemoryStack stack) {
        return new XrPassthroughColorMapLutMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughColorMapLutMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorMapLutMETA calloc(MemoryStack stack) {
        return new XrPassthroughColorMapLutMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapLutMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapLutMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapLutMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapLutMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughColorMapLutMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorMapLutMETA.NEXT); }
    /** Unsafe version of {@link #colorLut}. */
    public static long ncolorLut(long struct) { return memGetAddress(struct + XrPassthroughColorMapLutMETA.COLORLUT); }
    /** Unsafe version of {@link #weight}. */
    public static float nweight(long struct) { return UNSAFE.getFloat(null, struct + XrPassthroughColorMapLutMETA.WEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughColorMapLutMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorMapLutMETA.NEXT, value); }
    /** Unsafe version of {@link #colorLut(XrPassthroughColorLutMETA) colorLut}. */
    public static void ncolorLut(long struct, XrPassthroughColorLutMETA value) { memPutAddress(struct + XrPassthroughColorMapLutMETA.COLORLUT, value.address()); }
    /** Unsafe version of {@link #weight(float) weight}. */
    public static void nweight(long struct, float value) { UNSAFE.putFloat(null, struct + XrPassthroughColorMapLutMETA.WEIGHT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrPassthroughColorMapLutMETA.COLORLUT));
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorMapLutMETA} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorMapLutMETA, Buffer> implements NativeResource {

        private static final XrPassthroughColorMapLutMETA ELEMENT_FACTORY = XrPassthroughColorMapLutMETA.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorMapLutMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorMapLutMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughColorMapLutMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPassthroughColorMapLutMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorMapLutMETA.ntype(address()); }
        /** @return the value of the {@link XrPassthroughColorMapLutMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorMapLutMETA.nnext(address()); }
        /** @return the value of the {@link XrPassthroughColorMapLutMETA#colorLut} field. */
        @NativeType("XrPassthroughColorLutMETA")
        public long colorLut() { return XrPassthroughColorMapLutMETA.ncolorLut(address()); }
        /** @return the value of the {@link XrPassthroughColorMapLutMETA#weight} field. */
        public float weight() { return XrPassthroughColorMapLutMETA.nweight(address()); }

        /** Sets the specified value to the {@link XrPassthroughColorMapLutMETA#type} field. */
        public XrPassthroughColorMapLutMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorMapLutMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_MAP_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_LUT_META} value to the {@link XrPassthroughColorMapLutMETA#type} field. */
        public XrPassthroughColorMapLutMETA.Buffer type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_MAP_LUT_META); }
        /** Sets the specified value to the {@link XrPassthroughColorMapLutMETA#next} field. */
        public XrPassthroughColorMapLutMETA.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorMapLutMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughColorMapLutMETA#colorLut} field. */
        public XrPassthroughColorMapLutMETA.Buffer colorLut(XrPassthroughColorLutMETA value) { XrPassthroughColorMapLutMETA.ncolorLut(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughColorMapLutMETA#weight} field. */
        public XrPassthroughColorMapLutMETA.Buffer weight(float value) { XrPassthroughColorMapLutMETA.nweight(address(), value); return this; }

    }

}