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
 * struct XrFaceExpressionWeights2FB {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t weightCount;
 *     float * weights;
 *     uint32_t confidenceCount;
 *     float * confidences;
 *     XrBool32 isValid;
 *     XrBool32 isEyeFollowingBlendshapesValid;
 *     XrFaceTrackingDataSource2FB dataSource;
 *     XrTime time;
 * }}</pre>
 */
public class XrFaceExpressionWeights2FB extends Struct<XrFaceExpressionWeights2FB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        WEIGHTCOUNT,
        WEIGHTS,
        CONFIDENCECOUNT,
        CONFIDENCES,
        ISVALID,
        ISEYEFOLLOWINGBLENDSHAPESVALID,
        DATASOURCE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        WEIGHTCOUNT = layout.offsetof(2);
        WEIGHTS = layout.offsetof(3);
        CONFIDENCECOUNT = layout.offsetof(4);
        CONFIDENCES = layout.offsetof(5);
        ISVALID = layout.offsetof(6);
        ISEYEFOLLOWINGBLENDSHAPESVALID = layout.offsetof(7);
        DATASOURCE = layout.offsetof(8);
        TIME = layout.offsetof(9);
    }

    protected XrFaceExpressionWeights2FB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceExpressionWeights2FB create(long address, @Nullable ByteBuffer container) {
        return new XrFaceExpressionWeights2FB(address, container);
    }

    /**
     * Creates a {@code XrFaceExpressionWeights2FB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceExpressionWeights2FB(ByteBuffer container) {
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
    /** @return the value of the {@code weightCount} field. */
    @NativeType("uint32_t")
    public int weightCount() { return nweightCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code weights} field. */
    @NativeType("float *")
    public FloatBuffer weights() { return nweights(address()); }
    /** @return the value of the {@code confidenceCount} field. */
    @NativeType("uint32_t")
    public int confidenceCount() { return nconfidenceCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code confidences} field. */
    @NativeType("float *")
    public FloatBuffer confidences() { return nconfidences(address()); }
    /** @return the value of the {@code isValid} field. */
    @NativeType("XrBool32")
    public boolean isValid() { return nisValid(address()) != 0; }
    /** @return the value of the {@code isEyeFollowingBlendshapesValid} field. */
    @NativeType("XrBool32")
    public boolean isEyeFollowingBlendshapesValid() { return nisEyeFollowingBlendshapesValid(address()) != 0; }
    /** @return the value of the {@code dataSource} field. */
    @NativeType("XrFaceTrackingDataSource2FB")
    public int dataSource() { return ndataSource(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFaceExpressionWeights2FB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFaceTracking2#XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB TYPE_FACE_EXPRESSION_WEIGHTS2_FB} value to the {@code type} field. */
    public XrFaceExpressionWeights2FB type$Default() { return type(FBFaceTracking2.XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrFaceExpressionWeights2FB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code weights} field. */
    public XrFaceExpressionWeights2FB weights(@NativeType("float *") FloatBuffer value) { nweights(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code confidences} field. */
    public XrFaceExpressionWeights2FB confidences(@NativeType("float *") FloatBuffer value) { nconfidences(address(), value); return this; }
    /** Sets the specified value to the {@code isValid} field. */
    public XrFaceExpressionWeights2FB isValid(@NativeType("XrBool32") boolean value) { nisValid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code isEyeFollowingBlendshapesValid} field. */
    public XrFaceExpressionWeights2FB isEyeFollowingBlendshapesValid(@NativeType("XrBool32") boolean value) { nisEyeFollowingBlendshapesValid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dataSource} field. */
    public XrFaceExpressionWeights2FB dataSource(@NativeType("XrFaceTrackingDataSource2FB") int value) { ndataSource(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrFaceExpressionWeights2FB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceExpressionWeights2FB set(
        int type,
        long next,
        FloatBuffer weights,
        FloatBuffer confidences,
        boolean isValid,
        boolean isEyeFollowingBlendshapesValid,
        int dataSource,
        long time
    ) {
        type(type);
        next(next);
        weights(weights);
        confidences(confidences);
        isValid(isValid);
        isEyeFollowingBlendshapesValid(isEyeFollowingBlendshapesValid);
        dataSource(dataSource);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFaceExpressionWeights2FB set(XrFaceExpressionWeights2FB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceExpressionWeights2FB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionWeights2FB malloc() {
        return new XrFaceExpressionWeights2FB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionWeights2FB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionWeights2FB calloc() {
        return new XrFaceExpressionWeights2FB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionWeights2FB} instance allocated with {@link BufferUtils}. */
    public static XrFaceExpressionWeights2FB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceExpressionWeights2FB(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceExpressionWeights2FB} instance for the specified memory address. */
    public static XrFaceExpressionWeights2FB create(long address) {
        return new XrFaceExpressionWeights2FB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFaceExpressionWeights2FB createSafe(long address) {
        return address == NULL ? null : new XrFaceExpressionWeights2FB(address, null);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeights2FB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeights2FB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeights2FB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeights2FB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeights2FB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeights2FB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceExpressionWeights2FB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeights2FB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFaceExpressionWeights2FB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceExpressionWeights2FB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionWeights2FB malloc(MemoryStack stack) {
        return new XrFaceExpressionWeights2FB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceExpressionWeights2FB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionWeights2FB calloc(MemoryStack stack) {
        return new XrFaceExpressionWeights2FB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeights2FB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeights2FB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeights2FB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeights2FB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFaceExpressionWeights2FB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceExpressionWeights2FB.NEXT); }
    /** Unsafe version of {@link #weightCount}. */
    public static int nweightCount(long struct) { return memGetInt(struct + XrFaceExpressionWeights2FB.WEIGHTCOUNT); }
    /** Unsafe version of {@link #weights() weights}. */
    public static FloatBuffer nweights(long struct) { return memFloatBuffer(memGetAddress(struct + XrFaceExpressionWeights2FB.WEIGHTS), nweightCount(struct)); }
    /** Unsafe version of {@link #confidenceCount}. */
    public static int nconfidenceCount(long struct) { return memGetInt(struct + XrFaceExpressionWeights2FB.CONFIDENCECOUNT); }
    /** Unsafe version of {@link #confidences() confidences}. */
    public static FloatBuffer nconfidences(long struct) { return memFloatBuffer(memGetAddress(struct + XrFaceExpressionWeights2FB.CONFIDENCES), nconfidenceCount(struct)); }
    /** Unsafe version of {@link #isValid}. */
    public static int nisValid(long struct) { return memGetInt(struct + XrFaceExpressionWeights2FB.ISVALID); }
    /** Unsafe version of {@link #isEyeFollowingBlendshapesValid}. */
    public static int nisEyeFollowingBlendshapesValid(long struct) { return memGetInt(struct + XrFaceExpressionWeights2FB.ISEYEFOLLOWINGBLENDSHAPESVALID); }
    /** Unsafe version of {@link #dataSource}. */
    public static int ndataSource(long struct) { return memGetInt(struct + XrFaceExpressionWeights2FB.DATASOURCE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrFaceExpressionWeights2FB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFaceExpressionWeights2FB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceExpressionWeights2FB.NEXT, value); }
    /** Sets the specified value to the {@code weightCount} field of the specified {@code struct}. */
    public static void nweightCount(long struct, int value) { memPutInt(struct + XrFaceExpressionWeights2FB.WEIGHTCOUNT, value); }
    /** Unsafe version of {@link #weights(FloatBuffer) weights}. */
    public static void nweights(long struct, FloatBuffer value) { memPutAddress(struct + XrFaceExpressionWeights2FB.WEIGHTS, memAddress(value)); nweightCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code confidenceCount} field of the specified {@code struct}. */
    public static void nconfidenceCount(long struct, int value) { memPutInt(struct + XrFaceExpressionWeights2FB.CONFIDENCECOUNT, value); }
    /** Unsafe version of {@link #confidences(FloatBuffer) confidences}. */
    public static void nconfidences(long struct, FloatBuffer value) { memPutAddress(struct + XrFaceExpressionWeights2FB.CONFIDENCES, memAddress(value)); nconfidenceCount(struct, value.remaining()); }
    /** Unsafe version of {@link #isValid(boolean) isValid}. */
    public static void nisValid(long struct, int value) { memPutInt(struct + XrFaceExpressionWeights2FB.ISVALID, value); }
    /** Unsafe version of {@link #isEyeFollowingBlendshapesValid(boolean) isEyeFollowingBlendshapesValid}. */
    public static void nisEyeFollowingBlendshapesValid(long struct, int value) { memPutInt(struct + XrFaceExpressionWeights2FB.ISEYEFOLLOWINGBLENDSHAPESVALID, value); }
    /** Unsafe version of {@link #dataSource(int) dataSource}. */
    public static void ndataSource(long struct, int value) { memPutInt(struct + XrFaceExpressionWeights2FB.DATASOURCE, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrFaceExpressionWeights2FB.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrFaceExpressionWeights2FB.WEIGHTS));
        check(memGetAddress(struct + XrFaceExpressionWeights2FB.CONFIDENCES));
    }

    // -----------------------------------

    /** An array of {@link XrFaceExpressionWeights2FB} structs. */
    public static class Buffer extends StructBuffer<XrFaceExpressionWeights2FB, Buffer> implements NativeResource {

        private static final XrFaceExpressionWeights2FB ELEMENT_FACTORY = XrFaceExpressionWeights2FB.create(-1L);

        /**
         * Creates a new {@code XrFaceExpressionWeights2FB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceExpressionWeights2FB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceExpressionWeights2FB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceExpressionWeights2FB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFaceExpressionWeights2FB.nnext(address()); }
        /** @return the value of the {@code weightCount} field. */
        @NativeType("uint32_t")
        public int weightCount() { return XrFaceExpressionWeights2FB.nweightCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code weights} field. */
        @NativeType("float *")
        public FloatBuffer weights() { return XrFaceExpressionWeights2FB.nweights(address()); }
        /** @return the value of the {@code confidenceCount} field. */
        @NativeType("uint32_t")
        public int confidenceCount() { return XrFaceExpressionWeights2FB.nconfidenceCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code confidences} field. */
        @NativeType("float *")
        public FloatBuffer confidences() { return XrFaceExpressionWeights2FB.nconfidences(address()); }
        /** @return the value of the {@code isValid} field. */
        @NativeType("XrBool32")
        public boolean isValid() { return XrFaceExpressionWeights2FB.nisValid(address()) != 0; }
        /** @return the value of the {@code isEyeFollowingBlendshapesValid} field. */
        @NativeType("XrBool32")
        public boolean isEyeFollowingBlendshapesValid() { return XrFaceExpressionWeights2FB.nisEyeFollowingBlendshapesValid(address()) != 0; }
        /** @return the value of the {@code dataSource} field. */
        @NativeType("XrFaceTrackingDataSource2FB")
        public int dataSource() { return XrFaceExpressionWeights2FB.ndataSource(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrFaceExpressionWeights2FB.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFaceExpressionWeights2FB.Buffer type(@NativeType("XrStructureType") int value) { XrFaceExpressionWeights2FB.ntype(address(), value); return this; }
        /** Sets the {@link FBFaceTracking2#XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB TYPE_FACE_EXPRESSION_WEIGHTS2_FB} value to the {@code type} field. */
        public XrFaceExpressionWeights2FB.Buffer type$Default() { return type(FBFaceTracking2.XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrFaceExpressionWeights2FB.Buffer next(@NativeType("void *") long value) { XrFaceExpressionWeights2FB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code weights} field. */
        public XrFaceExpressionWeights2FB.Buffer weights(@NativeType("float *") FloatBuffer value) { XrFaceExpressionWeights2FB.nweights(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code confidences} field. */
        public XrFaceExpressionWeights2FB.Buffer confidences(@NativeType("float *") FloatBuffer value) { XrFaceExpressionWeights2FB.nconfidences(address(), value); return this; }
        /** Sets the specified value to the {@code isValid} field. */
        public XrFaceExpressionWeights2FB.Buffer isValid(@NativeType("XrBool32") boolean value) { XrFaceExpressionWeights2FB.nisValid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code isEyeFollowingBlendshapesValid} field. */
        public XrFaceExpressionWeights2FB.Buffer isEyeFollowingBlendshapesValid(@NativeType("XrBool32") boolean value) { XrFaceExpressionWeights2FB.nisEyeFollowingBlendshapesValid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dataSource} field. */
        public XrFaceExpressionWeights2FB.Buffer dataSource(@NativeType("XrFaceTrackingDataSource2FB") int value) { XrFaceExpressionWeights2FB.ndataSource(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrFaceExpressionWeights2FB.Buffer time(@NativeType("XrTime") long value) { XrFaceExpressionWeights2FB.ntime(address(), value); return this; }

    }

}