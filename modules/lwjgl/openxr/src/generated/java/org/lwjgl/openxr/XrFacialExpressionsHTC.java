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
 * Returns the expression data.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrFacialExpressionsHTC} structure returns data of a lip facial expression or an eye facial expression.</p>
 * 
 * <p>An application <b>must</b> preallocate the output {@code expressionWeightings} array that can contain at least {@code expressionCount} of {@code float}. {@code expressionCount} <b>must</b> be at least {@link HTCFacialTracking#XR_FACIAL_EXPRESSION_LIP_COUNT_HTC FACIAL_EXPRESSION_LIP_COUNT_HTC} for {@link HTCFacialTracking#XR_FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC}, and at least {@link HTCFacialTracking#XR_FACIAL_EXPRESSION_EYE_COUNT_HTC FACIAL_EXPRESSION_EYE_COUNT_HTC} for {@link HTCFacialTracking#XR_FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC}.</p>
 * 
 * <p>The application <b>must</b> set {@code expressionCount} as described by the {@code XrFacialTrackingTypeHTC} when creating the {@code XrFacialTrackerHTC} otherwise the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code expressionWeightings} array ordered so that the application can index elements using the corresponding facial tracker enum (e.g. {@code XrEyeExpressionHTC} or {@code XrLipExpressionHTC}) as described by {@code XrFacialTrackingTypeHTC} when creating the {@code XrFacialTrackerHTC}. For example, when the {@code XrFacialTrackerHTC} is created with {@code facialTrackingType} set to {@link HTCFacialTracking#XR_FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC}, the application <b>must</b> set the {@code expressionCount} to {@link HTCFacialTracking#XR_FACIAL_EXPRESSION_EYE_COUNT_HTC FACIAL_EXPRESSION_EYE_COUNT_HTC}, and the runtime <b>must</b> fill the {@code expressionWeightings} array ordered with eye expression data so that it can be indexed by the {@code XrEyeExpressionHTC} enum.</p>
 * 
 * <p>If the returned {@code isActive} is true, the runtime <b>must</b> fill the {@code expressionWeightings} array ordered.</p>
 * 
 * <p>If the returned {@code isActive} is false, it indicates the facial tracker did not detect the corresponding facial input or the application lost input focus.</p>
 * 
 * <p>If the input {@code expressionCount} is not sufficient to contain all output indices, the runtime <b>must</b> return {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT} on calls to {@link HTCFacialTracking#xrGetFacialExpressionsHTC GetFacialExpressionsHTC} and not change the content in {@code expressionWeightings}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to using {@link XrFacialExpressionsHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCFacialTracking#XR_TYPE_FACIAL_EXPRESSIONS_HTC TYPE_FACIAL_EXPRESSIONS_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code expressionWeightings} <b>must</b> be a pointer to a {@code float} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link HTCFacialTracking#xrGetFacialExpressionsHTC GetFacialExpressionsHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFacialExpressionsHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBool32 {@link #isActive};
 *     XrTime {@link #sampleTime};
 *     uint32_t {@link #expressionCount};
 *     float * {@link #expressionWeightings};
 * }</code></pre>
 */
public class XrFacialExpressionsHTC extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        SAMPLETIME,
        EXPRESSIONCOUNT,
        EXPRESSIONWEIGHTINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
        SAMPLETIME = layout.offsetof(3);
        EXPRESSIONCOUNT = layout.offsetof(4);
        EXPRESSIONWEIGHTINGS = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrFacialExpressionsHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFacialExpressionsHTC(ByteBuffer container) {
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
    /** an {@code XrBool32} indicating if the facial tracker is active. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** when in time the expression is expressed. */
    @NativeType("XrTime")
    public long sampleTime() { return nsampleTime(address()); }
    /** a {@code uint32_t} describing the count of elements in {@code expressionWeightings} array. */
    @NativeType("uint32_t")
    public int expressionCount() { return nexpressionCount(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return a {@code float} array filled in by the runtime, specifying the weightings for each blend shape.
     */
    @NativeType("float *")
    public FloatBuffer expressionWeightings(int capacity) { return nexpressionWeightings(address(), capacity); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFacialExpressionsHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCFacialTracking#XR_TYPE_FACIAL_EXPRESSIONS_HTC TYPE_FACIAL_EXPRESSIONS_HTC} value to the {@link #type} field. */
    public XrFacialExpressionsHTC type$Default() { return type(HTCFacialTracking.XR_TYPE_FACIAL_EXPRESSIONS_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFacialExpressionsHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #isActive} field. */
    public XrFacialExpressionsHTC isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sampleTime} field. */
    public XrFacialExpressionsHTC sampleTime(@NativeType("XrTime") long value) { nsampleTime(address(), value); return this; }
    /** Sets the specified value to the {@link #expressionCount} field. */
    public XrFacialExpressionsHTC expressionCount(@NativeType("uint32_t") int value) { nexpressionCount(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #expressionWeightings} field. */
    public XrFacialExpressionsHTC expressionWeightings(@NativeType("float *") FloatBuffer value) { nexpressionWeightings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFacialExpressionsHTC set(
        int type,
        long next,
        boolean isActive,
        long sampleTime,
        int expressionCount,
        FloatBuffer expressionWeightings
    ) {
        type(type);
        next(next);
        isActive(isActive);
        sampleTime(sampleTime);
        expressionCount(expressionCount);
        expressionWeightings(expressionWeightings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFacialExpressionsHTC set(XrFacialExpressionsHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFacialExpressionsHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionsHTC malloc() {
        return wrap(XrFacialExpressionsHTC.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrFacialExpressionsHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionsHTC calloc() {
        return wrap(XrFacialExpressionsHTC.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrFacialExpressionsHTC} instance allocated with {@link BufferUtils}. */
    public static XrFacialExpressionsHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrFacialExpressionsHTC.class, memAddress(container), container);
    }

    /** Returns a new {@code XrFacialExpressionsHTC} instance for the specified memory address. */
    public static XrFacialExpressionsHTC create(long address) {
        return wrap(XrFacialExpressionsHTC.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFacialExpressionsHTC createSafe(long address) {
        return address == NULL ? null : wrap(XrFacialExpressionsHTC.class, address);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrFacialExpressionsHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFacialExpressionsHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrFacialExpressionsHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionsHTC malloc(MemoryStack stack) {
        return wrap(XrFacialExpressionsHTC.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrFacialExpressionsHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionsHTC calloc(MemoryStack stack) {
        return wrap(XrFacialExpressionsHTC.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFacialExpressionsHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFacialExpressionsHTC.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return UNSAFE.getInt(null, struct + XrFacialExpressionsHTC.ISACTIVE); }
    /** Unsafe version of {@link #sampleTime}. */
    public static long nsampleTime(long struct) { return UNSAFE.getLong(null, struct + XrFacialExpressionsHTC.SAMPLETIME); }
    /** Unsafe version of {@link #expressionCount}. */
    public static int nexpressionCount(long struct) { return UNSAFE.getInt(null, struct + XrFacialExpressionsHTC.EXPRESSIONCOUNT); }
    /** Unsafe version of {@link #expressionWeightings(int) expressionWeightings}. */
    public static FloatBuffer nexpressionWeightings(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + XrFacialExpressionsHTC.EXPRESSIONWEIGHTINGS), capacity); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFacialExpressionsHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFacialExpressionsHTC.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { UNSAFE.putInt(null, struct + XrFacialExpressionsHTC.ISACTIVE, value); }
    /** Unsafe version of {@link #sampleTime(long) sampleTime}. */
    public static void nsampleTime(long struct, long value) { UNSAFE.putLong(null, struct + XrFacialExpressionsHTC.SAMPLETIME, value); }
    /** Unsafe version of {@link #expressionCount(int) expressionCount}. */
    public static void nexpressionCount(long struct, int value) { UNSAFE.putInt(null, struct + XrFacialExpressionsHTC.EXPRESSIONCOUNT, value); }
    /** Unsafe version of {@link #expressionWeightings(FloatBuffer) expressionWeightings}. */
    public static void nexpressionWeightings(long struct, FloatBuffer value) { memPutAddress(struct + XrFacialExpressionsHTC.EXPRESSIONWEIGHTINGS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrFacialExpressionsHTC.EXPRESSIONWEIGHTINGS));
    }

    // -----------------------------------

    /** An array of {@link XrFacialExpressionsHTC} structs. */
    public static class Buffer extends StructBuffer<XrFacialExpressionsHTC, Buffer> implements NativeResource {

        private static final XrFacialExpressionsHTC ELEMENT_FACTORY = XrFacialExpressionsHTC.create(-1L);

        /**
         * Creates a new {@code XrFacialExpressionsHTC.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFacialExpressionsHTC#SIZEOF}, and its mark will be undefined.
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
        protected XrFacialExpressionsHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFacialExpressionsHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFacialExpressionsHTC.ntype(address()); }
        /** @return the value of the {@link XrFacialExpressionsHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrFacialExpressionsHTC.nnext(address()); }
        /** @return the value of the {@link XrFacialExpressionsHTC#isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrFacialExpressionsHTC.nisActive(address()) != 0; }
        /** @return the value of the {@link XrFacialExpressionsHTC#sampleTime} field. */
        @NativeType("XrTime")
        public long sampleTime() { return XrFacialExpressionsHTC.nsampleTime(address()); }
        /** @return the value of the {@link XrFacialExpressionsHTC#expressionCount} field. */
        @NativeType("uint32_t")
        public int expressionCount() { return XrFacialExpressionsHTC.nexpressionCount(address()); }
        /**
         * @return a {@link FloatBuffer} view of the data pointed to by the {@link XrFacialExpressionsHTC#expressionWeightings} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("float *")
        public FloatBuffer expressionWeightings(int capacity) { return XrFacialExpressionsHTC.nexpressionWeightings(address(), capacity); }

        /** Sets the specified value to the {@link XrFacialExpressionsHTC#type} field. */
        public XrFacialExpressionsHTC.Buffer type(@NativeType("XrStructureType") int value) { XrFacialExpressionsHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCFacialTracking#XR_TYPE_FACIAL_EXPRESSIONS_HTC TYPE_FACIAL_EXPRESSIONS_HTC} value to the {@link XrFacialExpressionsHTC#type} field. */
        public XrFacialExpressionsHTC.Buffer type$Default() { return type(HTCFacialTracking.XR_TYPE_FACIAL_EXPRESSIONS_HTC); }
        /** Sets the specified value to the {@link XrFacialExpressionsHTC#next} field. */
        public XrFacialExpressionsHTC.Buffer next(@NativeType("void const *") long value) { XrFacialExpressionsHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFacialExpressionsHTC#isActive} field. */
        public XrFacialExpressionsHTC.Buffer isActive(@NativeType("XrBool32") boolean value) { XrFacialExpressionsHTC.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrFacialExpressionsHTC#sampleTime} field. */
        public XrFacialExpressionsHTC.Buffer sampleTime(@NativeType("XrTime") long value) { XrFacialExpressionsHTC.nsampleTime(address(), value); return this; }
        /** Sets the specified value to the {@link XrFacialExpressionsHTC#expressionCount} field. */
        public XrFacialExpressionsHTC.Buffer expressionCount(@NativeType("uint32_t") int value) { XrFacialExpressionsHTC.nexpressionCount(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link XrFacialExpressionsHTC#expressionWeightings} field. */
        public XrFacialExpressionsHTC.Buffer expressionWeightings(@NativeType("float *") FloatBuffer value) { XrFacialExpressionsHTC.nexpressionWeightings(address(), value); return this; }

    }

}