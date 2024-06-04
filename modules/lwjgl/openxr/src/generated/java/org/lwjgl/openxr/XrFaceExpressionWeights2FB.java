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
 * Returns the facial expression.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrFaceExpressionWeights2FB} structure returns the facial expression.</p>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code weightCount} is not equal to the number of blend shapes defined by the {@code XrFaceExpressionSet2FB} used to create the {@code XrFaceTracker2FB}.</p>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code confidenceCount} is not equal to the number of confidence areas defined by the {@code XrFaceExpressionSet2FB} used to create the {@code XrFaceTracker2FB}.</p>
 * 
 * <p>The runtime <b>must</b> return {@code weights} representing the weights of blend shapes of current facial expression.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code weights} array ordered so that the application <b>can</b> index elements using the corresponding facial expression enum (e.g. {@code XrFaceExpression2FB}) as described by {@code XrFaceExpressionSet2FB} when creating the {@code XrFaceTracker2FB}. For example, when the {@code XrFaceTracker2FB} is created with {@link FBFaceTracking2#XR_FACE_EXPRESSION_SET2_DEFAULT_FB FACE_EXPRESSION_SET2_DEFAULT_FB}, the application sets the {@code weightCount} to {@link FBFaceTracking2#XR_FACE_EXPRESSION2_COUNT_FB FACE_EXPRESSION2_COUNT_FB}, and the runtime <b>must</b> fill the {@code weights} array ordered so that it <b>can</b> be indexed by the {@code XrFaceExpression2FB} enum.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code confidences} array ordered so that the application <b>can</b> index elements using the corresponding confidence area enum (e.g. {@code XrFaceConfidence2FB}) as described by {@code XrFaceExpressionSet2FB} when creating the {@code XrFaceTracker2FB}. For example, when the {@code XrFaceTracker2FB} is created with {@link FBFaceTracking2#XR_FACE_EXPRESSION_SET2_DEFAULT_FB FACE_EXPRESSION_SET2_DEFAULT_FB}, the application sets the {@code confidenceCount} to {@link FBFaceTracking2#XR_FACE_CONFIDENCE2_COUNT_FB FACE_CONFIDENCE2_COUNT_FB}, and the runtime <b>must</b> fill the {@code confidences} array ordered so that it <b>can</b> be indexed by the {@code XrFaceConfidence2FB} enum.</p>
 * 
 * <p>The runtime <b>must</b> set {@code isValid} to {@link XR10#XR_FALSE FALSE} and it <b>must</b> also set all elements of {@code weights} to zero, if one of the following is true:</p>
 * 
 * <ul>
 * <li>the face tracker failed to track or lost track of the face</li>
 * <li>the application lost focus</li>
 * <li>the consent for face tracking was denied</li>
 * <li>the runtime is unable to estimate facial expression from the data sources specified when {@link FBFaceTracking2#xrCreateFaceTracker2FB CreateFaceTracker2FB} function was called</li>
 * </ul>
 * 
 * <p>If the returned {@code isValid} is {@link XR10#XR_TRUE TRUE}, the runtime <b>must</b> return all weights (or all weights except eyes related weights, see {@code isEyeFollowingBlendshapesValid}).</p>
 * 
 * <p>The runtime <b>must</b> set {@code isEyeFollowingBlendshapesValid} to {@link XR10#XR_FALSE FALSE} and it <b>must</b> also set 8 expression weights with prefix {@code XR_FACE_EXPRESSION2_EYES_LOOK_*} to zero, if one of the following is true:</p>
 * 
 * <ul>
 * <li>the eye tracking driving blendshapes with prefix {@code XR_FACE_EXPRESSION2_EYES_LOOK_*} lost track</li>
 * <li>the consent for eye tracking was denied</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBFaceTracking2 XR_FB_face_tracking2} extension <b>must</b> be enabled prior to using {@link XrFaceExpressionWeights2FB}</li>
 * <li>{@code type} <b>must</b> be {@link FBFaceTracking2#XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB TYPE_FACE_EXPRESSION_WEIGHTS2_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code weights} <b>must</b> be a pointer to an array of {@code weightCount} {@code float} values</li>
 * <li>{@code confidences} <b>must</b> be a pointer to an array of {@code confidenceCount} {@code float} values</li>
 * <li>{@code dataSource} <b>must</b> be a valid {@code XrFaceTrackingDataSource2FB} value</li>
 * <li>The {@code weightCount} parameter <b>must</b> be greater than 0</li>
 * <li>The {@code confidenceCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBFaceTracking2#xrGetFaceExpressionWeights2FB GetFaceExpressionWeights2FB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFaceExpressionWeights2FB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #weightCount};
 *     float * {@link #weights};
 *     uint32_t {@link #confidenceCount};
 *     float * {@link #confidences};
 *     XrBool32 {@link #isValid};
 *     XrBool32 {@link #isEyeFollowingBlendshapesValid};
 *     XrFaceTrackingDataSource2FB {@link #dataSource};
 *     XrTime {@link #time};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a {@code uint32_t} describing the count of elements in {@code weights} array. */
    @NativeType("uint32_t")
    public int weightCount() { return nweightCount(address()); }
    /** a pointer to an application-allocated array of {@code float} that will be filled with weights of facial expression blend shapes. */
    @NativeType("float *")
    public FloatBuffer weights() { return nweights(address()); }
    /** a {@code uint32_t} describing the count of elements in {@code confidences} array. */
    @NativeType("uint32_t")
    public int confidenceCount() { return nconfidenceCount(address()); }
    /** a pointer to an application-allocated array of {@code float} that will be filled with confidence of tracking specific parts of a face. */
    @NativeType("float *")
    public FloatBuffer confidences() { return nconfidences(address()); }
    /** an {@code XrBool32} which indicates that the tracked expression weights are valid. */
    @NativeType("XrBool32")
    public boolean isValid() { return nisValid(address()) != 0; }
    /** an {@code XrBool32} which indicates if the 8 expression weights with prefix {@code XR_FACE_EXPRESSION2_EYES_LOOK_*} are valid. */
    @NativeType("XrBool32")
    public boolean isEyeFollowingBlendshapesValid() { return nisEyeFollowingBlendshapesValid(address()) != 0; }
    /** an {@code XrFaceTrackingDataSource2FB} which indicates the data source that was used to estimate the facial expression. */
    @NativeType("XrFaceTrackingDataSource2FB")
    public int dataSource() { return ndataSource(address()); }
    /** an {@code XrTime} time at which the returned expression weights are tracked or extrapolated to. Equals the time at which the expression weights were requested if the extrapolating at the time was successful. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFaceExpressionWeights2FB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFaceTracking2#XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB TYPE_FACE_EXPRESSION_WEIGHTS2_FB} value to the {@link #type} field. */
    public XrFaceExpressionWeights2FB type$Default() { return type(FBFaceTracking2.XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFaceExpressionWeights2FB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #weights} field. */
    public XrFaceExpressionWeights2FB weights(@NativeType("float *") FloatBuffer value) { nweights(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #confidences} field. */
    public XrFaceExpressionWeights2FB confidences(@NativeType("float *") FloatBuffer value) { nconfidences(address(), value); return this; }
    /** Sets the specified value to the {@link #isValid} field. */
    public XrFaceExpressionWeights2FB isValid(@NativeType("XrBool32") boolean value) { nisValid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #isEyeFollowingBlendshapesValid} field. */
    public XrFaceExpressionWeights2FB isEyeFollowingBlendshapesValid(@NativeType("XrBool32") boolean value) { nisEyeFollowingBlendshapesValid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #dataSource} field. */
    public XrFaceExpressionWeights2FB dataSource(@NativeType("XrFaceTrackingDataSource2FB") int value) { ndataSource(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
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
    @Nullable
    public static XrFaceExpressionWeights2FB createSafe(long address) {
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
    @Nullable
    public static XrFaceExpressionWeights2FB.Buffer createSafe(long address, int capacity) {
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
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeights2FB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceExpressionWeights2FB.NEXT); }
    /** Unsafe version of {@link #weightCount}. */
    public static int nweightCount(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeights2FB.WEIGHTCOUNT); }
    /** Unsafe version of {@link #weights() weights}. */
    public static FloatBuffer nweights(long struct) { return memFloatBuffer(memGetAddress(struct + XrFaceExpressionWeights2FB.WEIGHTS), nweightCount(struct)); }
    /** Unsafe version of {@link #confidenceCount}. */
    public static int nconfidenceCount(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeights2FB.CONFIDENCECOUNT); }
    /** Unsafe version of {@link #confidences() confidences}. */
    public static FloatBuffer nconfidences(long struct) { return memFloatBuffer(memGetAddress(struct + XrFaceExpressionWeights2FB.CONFIDENCES), nconfidenceCount(struct)); }
    /** Unsafe version of {@link #isValid}. */
    public static int nisValid(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeights2FB.ISVALID); }
    /** Unsafe version of {@link #isEyeFollowingBlendshapesValid}. */
    public static int nisEyeFollowingBlendshapesValid(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeights2FB.ISEYEFOLLOWINGBLENDSHAPESVALID); }
    /** Unsafe version of {@link #dataSource}. */
    public static int ndataSource(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeights2FB.DATASOURCE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrFaceExpressionWeights2FB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeights2FB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceExpressionWeights2FB.NEXT, value); }
    /** Sets the specified value to the {@code weightCount} field of the specified {@code struct}. */
    public static void nweightCount(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeights2FB.WEIGHTCOUNT, value); }
    /** Unsafe version of {@link #weights(FloatBuffer) weights}. */
    public static void nweights(long struct, FloatBuffer value) { memPutAddress(struct + XrFaceExpressionWeights2FB.WEIGHTS, memAddress(value)); nweightCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code confidenceCount} field of the specified {@code struct}. */
    public static void nconfidenceCount(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeights2FB.CONFIDENCECOUNT, value); }
    /** Unsafe version of {@link #confidences(FloatBuffer) confidences}. */
    public static void nconfidences(long struct, FloatBuffer value) { memPutAddress(struct + XrFaceExpressionWeights2FB.CONFIDENCES, memAddress(value)); nconfidenceCount(struct, value.remaining()); }
    /** Unsafe version of {@link #isValid(boolean) isValid}. */
    public static void nisValid(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeights2FB.ISVALID, value); }
    /** Unsafe version of {@link #isEyeFollowingBlendshapesValid(boolean) isEyeFollowingBlendshapesValid}. */
    public static void nisEyeFollowingBlendshapesValid(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeights2FB.ISEYEFOLLOWINGBLENDSHAPESVALID, value); }
    /** Unsafe version of {@link #dataSource(int) dataSource}. */
    public static void ndataSource(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeights2FB.DATASOURCE, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrFaceExpressionWeights2FB.TIME, value); }

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
        protected XrFaceExpressionWeights2FB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFaceExpressionWeights2FB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceExpressionWeights2FB.ntype(address()); }
        /** @return the value of the {@link XrFaceExpressionWeights2FB#next} field. */
        @NativeType("void *")
        public long next() { return XrFaceExpressionWeights2FB.nnext(address()); }
        /** @return the value of the {@link XrFaceExpressionWeights2FB#weightCount} field. */
        @NativeType("uint32_t")
        public int weightCount() { return XrFaceExpressionWeights2FB.nweightCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link XrFaceExpressionWeights2FB#weights} field. */
        @NativeType("float *")
        public FloatBuffer weights() { return XrFaceExpressionWeights2FB.nweights(address()); }
        /** @return the value of the {@link XrFaceExpressionWeights2FB#confidenceCount} field. */
        @NativeType("uint32_t")
        public int confidenceCount() { return XrFaceExpressionWeights2FB.nconfidenceCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link XrFaceExpressionWeights2FB#confidences} field. */
        @NativeType("float *")
        public FloatBuffer confidences() { return XrFaceExpressionWeights2FB.nconfidences(address()); }
        /** @return the value of the {@link XrFaceExpressionWeights2FB#isValid} field. */
        @NativeType("XrBool32")
        public boolean isValid() { return XrFaceExpressionWeights2FB.nisValid(address()) != 0; }
        /** @return the value of the {@link XrFaceExpressionWeights2FB#isEyeFollowingBlendshapesValid} field. */
        @NativeType("XrBool32")
        public boolean isEyeFollowingBlendshapesValid() { return XrFaceExpressionWeights2FB.nisEyeFollowingBlendshapesValid(address()) != 0; }
        /** @return the value of the {@link XrFaceExpressionWeights2FB#dataSource} field. */
        @NativeType("XrFaceTrackingDataSource2FB")
        public int dataSource() { return XrFaceExpressionWeights2FB.ndataSource(address()); }
        /** @return the value of the {@link XrFaceExpressionWeights2FB#time} field. */
        @NativeType("XrTime")
        public long time() { return XrFaceExpressionWeights2FB.ntime(address()); }

        /** Sets the specified value to the {@link XrFaceExpressionWeights2FB#type} field. */
        public XrFaceExpressionWeights2FB.Buffer type(@NativeType("XrStructureType") int value) { XrFaceExpressionWeights2FB.ntype(address(), value); return this; }
        /** Sets the {@link FBFaceTracking2#XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB TYPE_FACE_EXPRESSION_WEIGHTS2_FB} value to the {@link XrFaceExpressionWeights2FB#type} field. */
        public XrFaceExpressionWeights2FB.Buffer type$Default() { return type(FBFaceTracking2.XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB); }
        /** Sets the specified value to the {@link XrFaceExpressionWeights2FB#next} field. */
        public XrFaceExpressionWeights2FB.Buffer next(@NativeType("void *") long value) { XrFaceExpressionWeights2FB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link XrFaceExpressionWeights2FB#weights} field. */
        public XrFaceExpressionWeights2FB.Buffer weights(@NativeType("float *") FloatBuffer value) { XrFaceExpressionWeights2FB.nweights(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link XrFaceExpressionWeights2FB#confidences} field. */
        public XrFaceExpressionWeights2FB.Buffer confidences(@NativeType("float *") FloatBuffer value) { XrFaceExpressionWeights2FB.nconfidences(address(), value); return this; }
        /** Sets the specified value to the {@link XrFaceExpressionWeights2FB#isValid} field. */
        public XrFaceExpressionWeights2FB.Buffer isValid(@NativeType("XrBool32") boolean value) { XrFaceExpressionWeights2FB.nisValid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrFaceExpressionWeights2FB#isEyeFollowingBlendshapesValid} field. */
        public XrFaceExpressionWeights2FB.Buffer isEyeFollowingBlendshapesValid(@NativeType("XrBool32") boolean value) { XrFaceExpressionWeights2FB.nisEyeFollowingBlendshapesValid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrFaceExpressionWeights2FB#dataSource} field. */
        public XrFaceExpressionWeights2FB.Buffer dataSource(@NativeType("XrFaceTrackingDataSource2FB") int value) { XrFaceExpressionWeights2FB.ndataSource(address(), value); return this; }
        /** Sets the specified value to the {@link XrFaceExpressionWeights2FB#time} field. */
        public XrFaceExpressionWeights2FB.Buffer time(@NativeType("XrTime") long value) { XrFaceExpressionWeights2FB.ntime(address(), value); return this; }

    }

}