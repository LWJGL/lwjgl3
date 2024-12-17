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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrPassthroughColorMapInterpolatedLutMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrPassthroughColorLutMETA sourceColorLut;
 *     XrPassthroughColorLutMETA targetColorLut;
 *     float weight;
 * }}</pre>
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

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code sourceColorLut} field. */
    @NativeType("XrPassthroughColorLutMETA")
    public long sourceColorLut() { return nsourceColorLut(address()); }
    /** @return the value of the {@code targetColorLut} field. */
    @NativeType("XrPassthroughColorLutMETA")
    public long targetColorLut() { return ntargetColorLut(address()); }
    /** @return the value of the {@code weight} field. */
    public float weight() { return nweight(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughColorMapInterpolatedLutMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META} value to the {@code type} field. */
    public XrPassthroughColorMapInterpolatedLutMETA type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughColorMapInterpolatedLutMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code sourceColorLut} field. */
    public XrPassthroughColorMapInterpolatedLutMETA sourceColorLut(XrPassthroughColorLutMETA value) { nsourceColorLut(address(), value); return this; }
    /** Sets the specified value to the {@code targetColorLut} field. */
    public XrPassthroughColorMapInterpolatedLutMETA targetColorLut(XrPassthroughColorLutMETA value) { ntargetColorLut(address(), value); return this; }
    /** Sets the specified value to the {@code weight} field. */
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
    public static @Nullable XrPassthroughColorMapInterpolatedLutMETA createSafe(long address) {
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
    public static XrPassthroughColorMapInterpolatedLutMETA.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughColorMapInterpolatedLutMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.NEXT); }
    /** Unsafe version of {@link #sourceColorLut}. */
    public static long nsourceColorLut(long struct) { return memGetAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.SOURCECOLORLUT); }
    /** Unsafe version of {@link #targetColorLut}. */
    public static long ntargetColorLut(long struct) { return memGetAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.TARGETCOLORLUT); }
    /** Unsafe version of {@link #weight}. */
    public static float nweight(long struct) { return memGetFloat(struct + XrPassthroughColorMapInterpolatedLutMETA.WEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughColorMapInterpolatedLutMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.NEXT, value); }
    /** Unsafe version of {@link #sourceColorLut(XrPassthroughColorLutMETA) sourceColorLut}. */
    public static void nsourceColorLut(long struct, XrPassthroughColorLutMETA value) { memPutAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.SOURCECOLORLUT, value.address()); }
    /** Unsafe version of {@link #targetColorLut(XrPassthroughColorLutMETA) targetColorLut}. */
    public static void ntargetColorLut(long struct, XrPassthroughColorLutMETA value) { memPutAddress(struct + XrPassthroughColorMapInterpolatedLutMETA.TARGETCOLORLUT, value.address()); }
    /** Unsafe version of {@link #weight(float) weight}. */
    public static void nweight(long struct, float value) { memPutFloat(struct + XrPassthroughColorMapInterpolatedLutMETA.WEIGHT, value); }

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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrPassthroughColorMapInterpolatedLutMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorMapInterpolatedLutMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorMapInterpolatedLutMETA.nnext(address()); }
        /** @return the value of the {@code sourceColorLut} field. */
        @NativeType("XrPassthroughColorLutMETA")
        public long sourceColorLut() { return XrPassthroughColorMapInterpolatedLutMETA.nsourceColorLut(address()); }
        /** @return the value of the {@code targetColorLut} field. */
        @NativeType("XrPassthroughColorLutMETA")
        public long targetColorLut() { return XrPassthroughColorMapInterpolatedLutMETA.ntargetColorLut(address()); }
        /** @return the value of the {@code weight} field. */
        public float weight() { return XrPassthroughColorMapInterpolatedLutMETA.nweight(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorMapInterpolatedLutMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META} value to the {@code type} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorMapInterpolatedLutMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code sourceColorLut} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer sourceColorLut(XrPassthroughColorLutMETA value) { XrPassthroughColorMapInterpolatedLutMETA.nsourceColorLut(address(), value); return this; }
        /** Sets the specified value to the {@code targetColorLut} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer targetColorLut(XrPassthroughColorLutMETA value) { XrPassthroughColorMapInterpolatedLutMETA.ntargetColorLut(address(), value); return this; }
        /** Sets the specified value to the {@code weight} field. */
        public XrPassthroughColorMapInterpolatedLutMETA.Buffer weight(float value) { XrPassthroughColorMapInterpolatedLutMETA.nweight(address(), value); return this; }

    }

}