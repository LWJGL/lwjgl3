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
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code weightCount} is not equal to the number of blend shapes defined by the {@code XrFaceExpressionSetFB} used to create the {@code XrFaceTrackerFB}.</p>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code confidenceCount} is not equal to the number of confidence areas defined by the {@code XrFaceExpressionSetFB} used to create the {@code XrFaceTrackerFB}.</p>
 * 
 * <p>The runtime <b>must</b> return {@code weights} representing the weights of blend shapes of current facial expression.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code weights} array ordered so that the application <b>can</b> index elements using the corresponding facial expression enum (e.g. {@code XrFaceExpressionFB}) as described by {@code XrFaceExpressionSetFB} when creating the {@code XrFaceTrackerFB}. For example, when the {@code XrFaceTrackerFB} is created with {@link FBFaceTracking#XR_FACE_EXPRESSION_SET_DEFAULT_FB FACE_EXPRESSION_SET_DEFAULT_FB}, the application sets the {@code weightCount} to {@link FBFaceTracking#XR_FACE_EXPRESSION_COUNT_FB FACE_EXPRESSION_COUNT_FB}, and the runtime <b>must</b> fill the {@code weights} array ordered so that it <b>can</b> be indexed by the {@code XrFaceExpressionFB} enum.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code confidences} array ordered so that the application <b>can</b> index elements using the corresponding confidence area enum (e.g. {@code XrFaceConfidenceFB}) as described by {@code XrFaceExpressionSetFB} when creating the {@code XrFaceTrackerFB}. For example, when the {@code XrFaceTrackerFB} is created with {@link FBFaceTracking#XR_FACE_EXPRESSION_SET_DEFAULT_FB FACE_EXPRESSION_SET_DEFAULT_FB}, the application sets the {@code confidenceCount} to {@link FBFaceTracking#XR_FACE_CONFIDENCE_COUNT_FB FACE_CONFIDENCE_COUNT_FB}, and the runtime <b>must</b> fill the {@code confidences} array ordered so that it <b>can</b> be indexed by the {@code XrFaceConfidenceFB} enum.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to using {@link XrFaceExpressionWeightsFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBFaceTracking#XR_TYPE_FACE_EXPRESSION_WEIGHTS_FB TYPE_FACE_EXPRESSION_WEIGHTS_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code weights} <b>must</b> be a pointer to an array of {@code weightCount} {@code float} values</li>
 * <li>{@code confidences} <b>must</b> be a pointer to an array of {@code confidenceCount} {@code float} values</li>
 * <li>{@code status} <b>must</b> be a valid {@link XrFaceExpressionStatusFB} structure</li>
 * <li>The {@code weightCount} parameter <b>must</b> be greater than 0</li>
 * <li>The {@code confidenceCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFaceExpressionStatusFB}, {@link FBFaceTracking#xrGetFaceExpressionWeightsFB GetFaceExpressionWeightsFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFaceExpressionWeightsFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #weightCount};
 *     float * {@link #weights};
 *     uint32_t {@link #confidenceCount};
 *     float * {@link #confidences};
 *     {@link XrFaceExpressionStatusFB XrFaceExpressionStatusFB} {@link #status};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrFaceExpressionWeightsFB extends Struct<XrFaceExpressionWeightsFB> implements NativeResource {

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
        STATUS,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrFaceExpressionStatusFB.SIZEOF, XrFaceExpressionStatusFB.ALIGNOF),
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
        STATUS = layout.offsetof(6);
        TIME = layout.offsetof(7);
    }

    protected XrFaceExpressionWeightsFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceExpressionWeightsFB create(long address, @Nullable ByteBuffer container) {
        return new XrFaceExpressionWeightsFB(address, container);
    }

    /**
     * Creates a {@code XrFaceExpressionWeightsFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceExpressionWeightsFB(ByteBuffer container) {
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
    /** the {@link XrFaceExpressionStatusFB} of validity status of the expression weights. */
    public XrFaceExpressionStatusFB status() { return nstatus(address()); }
    /** an {@code XrTime} time at which the returned expression weights are tracked or extrapolated to. Equals the time at which the expression weights were requested if the extrapolating at the time was successful. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFaceExpressionWeightsFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFaceTracking#XR_TYPE_FACE_EXPRESSION_WEIGHTS_FB TYPE_FACE_EXPRESSION_WEIGHTS_FB} value to the {@link #type} field. */
    public XrFaceExpressionWeightsFB type$Default() { return type(FBFaceTracking.XR_TYPE_FACE_EXPRESSION_WEIGHTS_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFaceExpressionWeightsFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #weights} field. */
    public XrFaceExpressionWeightsFB weights(@NativeType("float *") FloatBuffer value) { nweights(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #confidences} field. */
    public XrFaceExpressionWeightsFB confidences(@NativeType("float *") FloatBuffer value) { nconfidences(address(), value); return this; }
    /** Copies the specified {@link XrFaceExpressionStatusFB} to the {@link #status} field. */
    public XrFaceExpressionWeightsFB status(XrFaceExpressionStatusFB value) { nstatus(address(), value); return this; }
    /** Passes the {@link #status} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFaceExpressionWeightsFB status(java.util.function.Consumer<XrFaceExpressionStatusFB> consumer) { consumer.accept(status()); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrFaceExpressionWeightsFB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceExpressionWeightsFB set(
        int type,
        long next,
        FloatBuffer weights,
        FloatBuffer confidences,
        XrFaceExpressionStatusFB status,
        long time
    ) {
        type(type);
        next(next);
        weights(weights);
        confidences(confidences);
        status(status);
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
    public XrFaceExpressionWeightsFB set(XrFaceExpressionWeightsFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceExpressionWeightsFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionWeightsFB malloc() {
        return new XrFaceExpressionWeightsFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionWeightsFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionWeightsFB calloc() {
        return new XrFaceExpressionWeightsFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionWeightsFB} instance allocated with {@link BufferUtils}. */
    public static XrFaceExpressionWeightsFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceExpressionWeightsFB(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceExpressionWeightsFB} instance for the specified memory address. */
    public static XrFaceExpressionWeightsFB create(long address) {
        return new XrFaceExpressionWeightsFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFaceExpressionWeightsFB createSafe(long address) {
        return address == NULL ? null : new XrFaceExpressionWeightsFB(address, null);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeightsFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeightsFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeightsFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeightsFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeightsFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeightsFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceExpressionWeightsFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeightsFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFaceExpressionWeightsFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceExpressionWeightsFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionWeightsFB malloc(MemoryStack stack) {
        return new XrFaceExpressionWeightsFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceExpressionWeightsFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionWeightsFB calloc(MemoryStack stack) {
        return new XrFaceExpressionWeightsFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeightsFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeightsFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionWeightsFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionWeightsFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeightsFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceExpressionWeightsFB.NEXT); }
    /** Unsafe version of {@link #weightCount}. */
    public static int nweightCount(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeightsFB.WEIGHTCOUNT); }
    /** Unsafe version of {@link #weights() weights}. */
    public static FloatBuffer nweights(long struct) { return memFloatBuffer(memGetAddress(struct + XrFaceExpressionWeightsFB.WEIGHTS), nweightCount(struct)); }
    /** Unsafe version of {@link #confidenceCount}. */
    public static int nconfidenceCount(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionWeightsFB.CONFIDENCECOUNT); }
    /** Unsafe version of {@link #confidences() confidences}. */
    public static FloatBuffer nconfidences(long struct) { return memFloatBuffer(memGetAddress(struct + XrFaceExpressionWeightsFB.CONFIDENCES), nconfidenceCount(struct)); }
    /** Unsafe version of {@link #status}. */
    public static XrFaceExpressionStatusFB nstatus(long struct) { return XrFaceExpressionStatusFB.create(struct + XrFaceExpressionWeightsFB.STATUS); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrFaceExpressionWeightsFB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeightsFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceExpressionWeightsFB.NEXT, value); }
    /** Sets the specified value to the {@code weightCount} field of the specified {@code struct}. */
    public static void nweightCount(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeightsFB.WEIGHTCOUNT, value); }
    /** Unsafe version of {@link #weights(FloatBuffer) weights}. */
    public static void nweights(long struct, FloatBuffer value) { memPutAddress(struct + XrFaceExpressionWeightsFB.WEIGHTS, memAddress(value)); nweightCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code confidenceCount} field of the specified {@code struct}. */
    public static void nconfidenceCount(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionWeightsFB.CONFIDENCECOUNT, value); }
    /** Unsafe version of {@link #confidences(FloatBuffer) confidences}. */
    public static void nconfidences(long struct, FloatBuffer value) { memPutAddress(struct + XrFaceExpressionWeightsFB.CONFIDENCES, memAddress(value)); nconfidenceCount(struct, value.remaining()); }
    /** Unsafe version of {@link #status(XrFaceExpressionStatusFB) status}. */
    public static void nstatus(long struct, XrFaceExpressionStatusFB value) { memCopy(value.address(), struct + XrFaceExpressionWeightsFB.STATUS, XrFaceExpressionStatusFB.SIZEOF); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrFaceExpressionWeightsFB.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrFaceExpressionWeightsFB.WEIGHTS));
        check(memGetAddress(struct + XrFaceExpressionWeightsFB.CONFIDENCES));
    }

    // -----------------------------------

    /** An array of {@link XrFaceExpressionWeightsFB} structs. */
    public static class Buffer extends StructBuffer<XrFaceExpressionWeightsFB, Buffer> implements NativeResource {

        private static final XrFaceExpressionWeightsFB ELEMENT_FACTORY = XrFaceExpressionWeightsFB.create(-1L);

        /**
         * Creates a new {@code XrFaceExpressionWeightsFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceExpressionWeightsFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceExpressionWeightsFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFaceExpressionWeightsFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceExpressionWeightsFB.ntype(address()); }
        /** @return the value of the {@link XrFaceExpressionWeightsFB#next} field. */
        @NativeType("void *")
        public long next() { return XrFaceExpressionWeightsFB.nnext(address()); }
        /** @return the value of the {@link XrFaceExpressionWeightsFB#weightCount} field. */
        @NativeType("uint32_t")
        public int weightCount() { return XrFaceExpressionWeightsFB.nweightCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link XrFaceExpressionWeightsFB#weights} field. */
        @NativeType("float *")
        public FloatBuffer weights() { return XrFaceExpressionWeightsFB.nweights(address()); }
        /** @return the value of the {@link XrFaceExpressionWeightsFB#confidenceCount} field. */
        @NativeType("uint32_t")
        public int confidenceCount() { return XrFaceExpressionWeightsFB.nconfidenceCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link XrFaceExpressionWeightsFB#confidences} field. */
        @NativeType("float *")
        public FloatBuffer confidences() { return XrFaceExpressionWeightsFB.nconfidences(address()); }
        /** @return a {@link XrFaceExpressionStatusFB} view of the {@link XrFaceExpressionWeightsFB#status} field. */
        public XrFaceExpressionStatusFB status() { return XrFaceExpressionWeightsFB.nstatus(address()); }
        /** @return the value of the {@link XrFaceExpressionWeightsFB#time} field. */
        @NativeType("XrTime")
        public long time() { return XrFaceExpressionWeightsFB.ntime(address()); }

        /** Sets the specified value to the {@link XrFaceExpressionWeightsFB#type} field. */
        public XrFaceExpressionWeightsFB.Buffer type(@NativeType("XrStructureType") int value) { XrFaceExpressionWeightsFB.ntype(address(), value); return this; }
        /** Sets the {@link FBFaceTracking#XR_TYPE_FACE_EXPRESSION_WEIGHTS_FB TYPE_FACE_EXPRESSION_WEIGHTS_FB} value to the {@link XrFaceExpressionWeightsFB#type} field. */
        public XrFaceExpressionWeightsFB.Buffer type$Default() { return type(FBFaceTracking.XR_TYPE_FACE_EXPRESSION_WEIGHTS_FB); }
        /** Sets the specified value to the {@link XrFaceExpressionWeightsFB#next} field. */
        public XrFaceExpressionWeightsFB.Buffer next(@NativeType("void *") long value) { XrFaceExpressionWeightsFB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link XrFaceExpressionWeightsFB#weights} field. */
        public XrFaceExpressionWeightsFB.Buffer weights(@NativeType("float *") FloatBuffer value) { XrFaceExpressionWeightsFB.nweights(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link XrFaceExpressionWeightsFB#confidences} field. */
        public XrFaceExpressionWeightsFB.Buffer confidences(@NativeType("float *") FloatBuffer value) { XrFaceExpressionWeightsFB.nconfidences(address(), value); return this; }
        /** Copies the specified {@link XrFaceExpressionStatusFB} to the {@link XrFaceExpressionWeightsFB#status} field. */
        public XrFaceExpressionWeightsFB.Buffer status(XrFaceExpressionStatusFB value) { XrFaceExpressionWeightsFB.nstatus(address(), value); return this; }
        /** Passes the {@link XrFaceExpressionWeightsFB#status} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFaceExpressionWeightsFB.Buffer status(java.util.function.Consumer<XrFaceExpressionStatusFB> consumer) { consumer.accept(status()); return this; }
        /** Sets the specified value to the {@link XrFaceExpressionWeightsFB#time} field. */
        public XrFaceExpressionWeightsFB.Buffer time(@NativeType("XrTime") long value) { XrFaceExpressionWeightsFB.ntime(address(), value); return this; }

    }

}