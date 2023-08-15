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
 * Passthrough color LUT creation info.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code resolution} <b>must</b> be a power of 2, otherwise the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}. The runtime <b>may</b> impose a limit on the maximum supported resolution, which is indicated in {@link XrSystemPassthroughColorLutPropertiesMETA}. If {@code resolution} exceeds that limit, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>{@code data} contains a 3-dimensional array which defines an output color for each RGB input color. The input color is scaled to be in the range <code>[0, resolution]</code>. For an RGBA LUT, the RGBA tuple of output colors for an input color <code>(R<sub>in</sub>, G<sub>in</sub>, B<sub>in</sub>)</code> is found in the four bytes starting at the offset <code>4 * (R<sub>in</sub> + G<sub>in</sub> * resolution + B<sub>in</sub> * resolution<sup>2</sup>)</code>. For an RGB LUT, the RGB tuple of output colors for an input color <code>(R<sub>in</sub>, G<sub>in</sub>, B<sub>in</sub>)</code> is found in the three bytes starting at the offset <code>3 * (R<sub>in</sub> + G<sub>in</sub> * resolution + B<sub>in</sub> * resolution<sup>2</sup>)</code>.</p>
 * 
 * <p>Color LUT data <b>must</b> be specified and interpreted in sRGB color space.</p>
 * 
 * <p>Runtimes <b>must</b> employ trilinear interpolation of neighboring color values if the resolution of the color LUT is smaller than the bit depth of the input colors.</p>
 * 
 * <p>The value of {@code bufferSize} in {@code data} <b>must</b> be equal to <code>resolution<sup>3</sup> * bytesPerElement</code>, where <code>bytesPerElement</code> is either 3 or 4 depending on {@code channels}. Otherwise, the runtime <b>must</b> return {@link METAPassthroughColorLut#XR_ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using {@link XrPassthroughColorLutCreateInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code channels} <b>must</b> be a valid {@code XrPassthroughColorLutChannelsMETA} value</li>
 * <li>{@code data} <b>must</b> be a valid {@link XrPassthroughColorLutDataMETA} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPassthroughColorLutDataMETA}, {@link METAPassthroughColorLut#xrCreatePassthroughColorLutMETA CreatePassthroughColorLutMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughColorLutCreateInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPassthroughColorLutChannelsMETA {@link #channels};
 *     uint32_t {@link #resolution};
 *     {@link XrPassthroughColorLutDataMETA XrPassthroughColorLutDataMETA} {@link #data};
 * }</code></pre>
 */
public class XrPassthroughColorLutCreateInfoMETA extends Struct<XrPassthroughColorLutCreateInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CHANNELS,
        RESOLUTION,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(XrPassthroughColorLutDataMETA.SIZEOF, XrPassthroughColorLutDataMETA.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CHANNELS = layout.offsetof(2);
        RESOLUTION = layout.offsetof(3);
        DATA = layout.offsetof(4);
    }

    protected XrPassthroughColorLutCreateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughColorLutCreateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughColorLutCreateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrPassthroughColorLutCreateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorLutCreateInfoMETA(ByteBuffer container) {
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
    /** defines the color channels expected in one LUT element. The number of bytes expected per LUT element is 3 for {@link METAPassthroughColorLut#XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META} and 4 for {@link METAPassthroughColorLut#XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META}. */
    @NativeType("XrPassthroughColorLutChannelsMETA")
    public int channels() { return nchannels(address()); }
    /** the number of LUT elements per input channel. The total number of elements in the LUT is <code>resolution<sup>3</sup></code>. */
    @NativeType("uint32_t")
    public int resolution() { return nresolution(address()); }
    /** contains the data the LUT is initialized with. */
    public XrPassthroughColorLutDataMETA data() { return ndata(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPassthroughColorLutCreateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META} value to the {@link #type} field. */
    public XrPassthroughColorLutCreateInfoMETA type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPassthroughColorLutCreateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #channels} field. */
    public XrPassthroughColorLutCreateInfoMETA channels(@NativeType("XrPassthroughColorLutChannelsMETA") int value) { nchannels(address(), value); return this; }
    /** Sets the specified value to the {@link #resolution} field. */
    public XrPassthroughColorLutCreateInfoMETA resolution(@NativeType("uint32_t") int value) { nresolution(address(), value); return this; }
    /** Copies the specified {@link XrPassthroughColorLutDataMETA} to the {@link #data} field. */
    public XrPassthroughColorLutCreateInfoMETA data(XrPassthroughColorLutDataMETA value) { ndata(address(), value); return this; }
    /** Passes the {@link #data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPassthroughColorLutCreateInfoMETA data(java.util.function.Consumer<XrPassthroughColorLutDataMETA> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughColorLutCreateInfoMETA set(
        int type,
        long next,
        int channels,
        int resolution,
        XrPassthroughColorLutDataMETA data
    ) {
        type(type);
        next(next);
        channels(channels);
        resolution(resolution);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughColorLutCreateInfoMETA set(XrPassthroughColorLutCreateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorLutCreateInfoMETA malloc() {
        return new XrPassthroughColorLutCreateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorLutCreateInfoMETA calloc() {
        return new XrPassthroughColorLutCreateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorLutCreateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughColorLutCreateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance for the specified memory address. */
    public static XrPassthroughColorLutCreateInfoMETA create(long address) {
        return new XrPassthroughColorLutCreateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorLutCreateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrPassthroughColorLutCreateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorLutCreateInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorLutCreateInfoMETA malloc(MemoryStack stack) {
        return new XrPassthroughColorLutCreateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorLutCreateInfoMETA calloc(MemoryStack stack) {
        return new XrPassthroughColorLutCreateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughColorLutCreateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorLutCreateInfoMETA.NEXT); }
    /** Unsafe version of {@link #channels}. */
    public static int nchannels(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughColorLutCreateInfoMETA.CHANNELS); }
    /** Unsafe version of {@link #resolution}. */
    public static int nresolution(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughColorLutCreateInfoMETA.RESOLUTION); }
    /** Unsafe version of {@link #data}. */
    public static XrPassthroughColorLutDataMETA ndata(long struct) { return XrPassthroughColorLutDataMETA.create(struct + XrPassthroughColorLutCreateInfoMETA.DATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughColorLutCreateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorLutCreateInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #channels(int) channels}. */
    public static void nchannels(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughColorLutCreateInfoMETA.CHANNELS, value); }
    /** Unsafe version of {@link #resolution(int) resolution}. */
    public static void nresolution(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughColorLutCreateInfoMETA.RESOLUTION, value); }
    /** Unsafe version of {@link #data(XrPassthroughColorLutDataMETA) data}. */
    public static void ndata(long struct, XrPassthroughColorLutDataMETA value) { memCopy(value.address(), struct + XrPassthroughColorLutCreateInfoMETA.DATA, XrPassthroughColorLutDataMETA.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        XrPassthroughColorLutDataMETA.validate(struct + XrPassthroughColorLutCreateInfoMETA.DATA);
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorLutCreateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorLutCreateInfoMETA, Buffer> implements NativeResource {

        private static final XrPassthroughColorLutCreateInfoMETA ELEMENT_FACTORY = XrPassthroughColorLutCreateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorLutCreateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorLutCreateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughColorLutCreateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPassthroughColorLutCreateInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorLutCreateInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrPassthroughColorLutCreateInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorLutCreateInfoMETA.nnext(address()); }
        /** @return the value of the {@link XrPassthroughColorLutCreateInfoMETA#channels} field. */
        @NativeType("XrPassthroughColorLutChannelsMETA")
        public int channels() { return XrPassthroughColorLutCreateInfoMETA.nchannels(address()); }
        /** @return the value of the {@link XrPassthroughColorLutCreateInfoMETA#resolution} field. */
        @NativeType("uint32_t")
        public int resolution() { return XrPassthroughColorLutCreateInfoMETA.nresolution(address()); }
        /** @return a {@link XrPassthroughColorLutDataMETA} view of the {@link XrPassthroughColorLutCreateInfoMETA#data} field. */
        public XrPassthroughColorLutDataMETA data() { return XrPassthroughColorLutCreateInfoMETA.ndata(address()); }

        /** Sets the specified value to the {@link XrPassthroughColorLutCreateInfoMETA#type} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorLutCreateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META} value to the {@link XrPassthroughColorLutCreateInfoMETA#type} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META); }
        /** Sets the specified value to the {@link XrPassthroughColorLutCreateInfoMETA#next} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorLutCreateInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughColorLutCreateInfoMETA#channels} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer channels(@NativeType("XrPassthroughColorLutChannelsMETA") int value) { XrPassthroughColorLutCreateInfoMETA.nchannels(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughColorLutCreateInfoMETA#resolution} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer resolution(@NativeType("uint32_t") int value) { XrPassthroughColorLutCreateInfoMETA.nresolution(address(), value); return this; }
        /** Copies the specified {@link XrPassthroughColorLutDataMETA} to the {@link XrPassthroughColorLutCreateInfoMETA#data} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer data(XrPassthroughColorLutDataMETA value) { XrPassthroughColorLutCreateInfoMETA.ndata(address(), value); return this; }
        /** Passes the {@link XrPassthroughColorLutCreateInfoMETA#data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer data(java.util.function.Consumer<XrPassthroughColorLutDataMETA> consumer) { consumer.accept(data()); return this; }

    }

}