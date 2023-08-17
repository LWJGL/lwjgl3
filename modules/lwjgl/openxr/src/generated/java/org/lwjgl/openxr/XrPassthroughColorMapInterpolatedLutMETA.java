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
 * A color map defined by the interpolation between two LUTs.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrPassthroughColorMapInterpolatedLutMETA} lets applications apply the interpolation between two color LUTs to a passthrough layer. Applications <b>may</b> use this feature to smoothly transition between two color LUTs. Other Passthrough style elements (such as edges) <b>must</b> not be affected by color LUTs.</p>
 * 
 * <p>The blend between {@code sourceColorLut} and {@code targetColorLut} is computed as <code>(1 - weight) * sourceColorLut[C<sub>in</sub>] + weight * targetColorLut[C<sub>in</sub>]</code>.</p>
 * 
 * <p>{@link XrPassthroughColorMapInterpolatedLutMETA} is provided in the {@code next} chain of {@link XrPassthroughStyleFB} when calling {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB}. Subsequent calls to {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB} with {@link XrPassthroughColorMapInterpolatedLutMETA} in the next chain update the color LUT for that layer. Subsequent calls to {@link FBPassthrough#xrPassthroughLayerSetStyleFB PassthroughLayerSetStyleFB} without this {@link XrPassthroughColorMapInterpolatedLutMETA} (or {@link XrPassthroughColorMapLutMETA}) in the next chain disable color LUTs for that layer.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using {@link XrPassthroughColorMapInterpolatedLutMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code sourceColorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
 * <li>{@code targetColorLut} <b>must</b> be a valid {@code XrPassthroughColorLutMETA} handle</li>
 * <li>Both of {@code sourceColorLut} and {@code targetColorLut} <b>must</b> have been created, allocated, or retrieved from the same {@code XrPassthroughFB}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughColorMapInterpolatedLutMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPassthroughColorLutMETA {@link #sourceColorLut};
 *     XrPassthroughColorLutMETA {@link #targetColorLut};
 *     float {@link #weight};
 * }</code></pre>
 */
public class XrPassthroughColorMapInterpolatedLutMETA extends Struct<XrPassthroughColorMapInterpolatedLutMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SOURCECOLORLUT,
        TARGETCOLORLUT,
        WEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SOURCECOLORLUT = layout.offsetof(2);
        TARGETCOLORLUT = layout.offsetof(3);
        WEIGHT = layout.offsetof(4);
    }

    protected XrPassthroughColorMapInterpolatedLutMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughColorMapInterpolatedLutMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughColorMapInterpolatedLutMETA(address, container);
    }

    /**
     * Creates a {@code XrPassthroughColorMapInterpolatedLutMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorMapInterpolatedLutMETA(ByteBuffer container) {
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
    /** the initial {@code XrPassthroughColorLutMETA}. */
    @NativeType("XrPassthroughColorLutMETA")
    public long sourceColorLut() { return nsourceColorLut(address()); }
    /** the final {@code XrPassthroughColorLutMETA}. */
    @NativeType("XrPassthroughColorLutMETA")
    public long targetColorLut() { return ntargetColorLut(address()); }
    /** a factor in the range <code>[0, 1]</code> which defines the linear blend between the initial and the final color LUT. */
    public float weight() { return nweight(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPassthroughColorMapInterpolatedLutMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META} value to the {@link #type} field. */
    public XrPassthroughColorMapInterpolatedLutMETA type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPassthroughColorMapInterpolatedLutMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #sourceColorLut} field. */
    public XrPassthroughColorMapInterpolatedLutMETA sourceColorLut(XrPassthroughColorLutMETA value) { nsourceColorLut(address(), value); return this; }
    /** Sets the specified value to the {@link #targetColorLut} field. */
    public XrPassthroughColorMapInterpolatedLutMETA targetColorLut(XrPassthroughColorLutMETA value) { ntargetColorLut(address(), value); return this; }
    /** Sets the specified value to the {@link #weight} field. */
    public XrPassthroughColorMapInterpolatedLutMETA weight(float value) { nweight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughColorMapInterpolatedLutMETA set(
        int type,
        long next,
        XrPassthroughColorLutMETA sourceColorLut,
        XrPassthroughColorLutMETA targetColorLut,
        float weight
    ) {
        type(type);
        next(next);
        sourceColorLut(sourceColorLut);
        targetColorLut(targetColorLut);
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
    public XrPassthroughColorMapInterpolatedLutMETA set(XrPassthroughColorMapInterpolatedLutMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorMapInterpolatedLutMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorMapInterpolatedLutMETA malloc() {
        return new XrPassthroughColorMapInterpolatedLutMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorMapInterpolatedLutMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorMapInterpolatedLutMETA calloc() {
        return new XrPassthroughColorMapInterpolatedLutMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorMapInterpolatedLutMETA} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorMapInterpolatedLutMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughColorMapInterpolatedLutMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorMapInterpolatedLutMETA} instance for the specified memory address. */
    public static XrPassthroughColorMapInterpolatedLutMETA create(long address) {
        return new XrPassthroughColorMapInterpolatedLutMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorMapInterpolatedLutMETA createSafe(long address) {
        return address == NULL ? null : new XrPassthroughColorMapInterpolatedLutMETA(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapInterpolatedLutMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapInterpolatedLutMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapInterpolatedLutMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapInterpolatedLutMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapInterpolatedLutMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapInterpolatedLutMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughColorMapInterpolatedLutMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapInterpolatedLutMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorMapInterpolatedLutMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorMapInterpolatedLutMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorMapInterpolatedLutMETA malloc(MemoryStack stack) {
        return new XrPassthroughColorMapInterpolatedLutMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughColorMapInterpolatedLutMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorMapInterpolatedLutMETA calloc(MemoryStack stack) {
        return new XrPassthroughColorMapInterpolatedLutMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapInterpolatedLutMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapInterpolatedLutMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapInterpolatedLutMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapInterpolatedLutMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughColorMapInterpolatedLutMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.NEXT); }
    /** Unsafe version of {@link #sourceColorLut}. */
    public static long nsourceColorLut(long struct) { return memGetAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.SOURCECOLORLUT); }
    /** Unsafe version of {@link #targetColorLut}. */
    public static long ntargetColorLut(long struct) { return memGetAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.TARGETCOLORLUT); }
    /** Unsafe version of {@link #weight}. */
    public static float nweight(long struct) { return UNSAFE.getFloat(null, struct + XrPassthroughColorMapInterpolatedLutMETA.WEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughColorMapInterpolatedLutMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.NEXT, value); }
    /** Unsafe version of {@link #sourceColorLut(XrPassthroughColorLutMETA) sourceColorLut}. */
    public static void nsourceColorLut(long struct, XrPassthroughColorLutMETA value) { memPutAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.SOURCECOLORLUT, value.address()); }
    /** Unsafe version of {@link #targetColorLut(XrPassthroughColorLutMETA) targetColorLut}. */
    public static void ntargetColorLut(long struct, XrPassthroughColorLutMETA value) { memPutAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.TARGETCOLORLUT, value.address()); }
    /** Unsafe version of {@link #weight(float) weight}. */
    public static void nweight(long struct, float value) { UNSAFE.putFloat(null, struct + XrPassthroughColorMapInterpolatedLutMETA.WEIGHT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.SOURCECOLORLUT));
        check(memGetAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.TARGETCOLORLUT));
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorMapInterpolatedLutMETA} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorMapInterpolatedLutMETA, Buffer> implements NativeResource {

        private static final XrPassthroughColorMapInterpolatedLutMETA ELEMENT_FACTORY = XrPassthroughColorMapInterpolatedLutMETA.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorMapInterpolatedLutMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorMapInterpolatedLutMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughColorMapInterpolatedLutMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPassthroughColorMapInterpolatedLutMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorMapInterpolatedLutMETA.ntype(address()); }
        /** @return the value of the {@link XrPassthroughColorMapInterpolatedLutMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorMapInterpolatedLutMETA.nnext(address()); }
        /** @return the value of the {@link XrPassthroughColorMapInterpolatedLutMETA#sourceColorLut} field. */
        @NativeType("XrPassthroughColorLutMETA")
        public long sourceColorLut() { return XrPassthroughColorMapInterpolatedLutMETA.nsourceColorLut(address()); }
        /** @return the value of the {@link XrPassthroughColorMapInterpolatedLutMETA#targetColorLut} field. */
        @NativeType("XrPassthroughColorLutMETA")
        public long targetColorLut() { return XrPassthroughColorMapInterpolatedLutMETA.ntargetColorLut(address()); }
        /** @return the value of the {@link XrPassthroughColorMapInterpolatedLutMETA#weight} field. */
        public float weight() { return XrPassthroughColorMapInterpolatedLutMETA.nweight(address()); }

        /** Sets the specified value to the {@link XrPassthroughColorMapInterpolatedLutMETA#type} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorMapInterpolatedLutMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META} value to the {@link XrPassthroughColorMapInterpolatedLutMETA#type} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META); }
        /** Sets the specified value to the {@link XrPassthroughColorMapInterpolatedLutMETA#next} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorMapInterpolatedLutMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughColorMapInterpolatedLutMETA#sourceColorLut} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer sourceColorLut(XrPassthroughColorLutMETA value) { XrPassthroughColorMapInterpolatedLutMETA.nsourceColorLut(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughColorMapInterpolatedLutMETA#targetColorLut} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer targetColorLut(XrPassthroughColorLutMETA value) { XrPassthroughColorMapInterpolatedLutMETA.ntargetColorLut(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughColorMapInterpolatedLutMETA#weight} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer weight(float value) { XrPassthroughColorMapInterpolatedLutMETA.nweight(address(), value); return this; }

    }

}