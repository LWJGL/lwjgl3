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
 * Performance metrics counter value.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrPerformanceMetricsCounterMETA} is populated by calling {@link METAPerformanceMetrics#xrQueryPerformanceMetricsCounterMETA QueryPerformanceMetricsCounterMETA} to query real-time performance metrics counter information.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to using {@link XrPerformanceMetricsCounterMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_COUNTER_META TYPE_PERFORMANCE_METRICS_COUNTER_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code counterFlags} <b>must</b> be 0 or a valid combination of {@code XrPerformanceMetricsCounterFlagBitsMETA} values</li>
 * <li>{@code counterUnit} <b>must</b> be a valid {@code XrPerformanceMetricsCounterUnitMETA} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAPerformanceMetrics#xrQueryPerformanceMetricsCounterMETA QueryPerformanceMetricsCounterMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPerformanceMetricsCounterMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPerformanceMetricsCounterFlagsMETA {@link #counterFlags};
 *     XrPerformanceMetricsCounterUnitMETA {@link #counterUnit};
 *     uint32_t {@link #uintValue};
 *     float {@link #floatValue};
 * }</code></pre>
 */
public class XrPerformanceMetricsCounterMETA extends Struct<XrPerformanceMetricsCounterMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COUNTERFLAGS,
        COUNTERUNIT,
        UINTVALUE,
        FLOATVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COUNTERFLAGS = layout.offsetof(2);
        COUNTERUNIT = layout.offsetof(3);
        UINTVALUE = layout.offsetof(4);
        FLOATVALUE = layout.offsetof(5);
    }

    protected XrPerformanceMetricsCounterMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPerformanceMetricsCounterMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPerformanceMetricsCounterMETA(address, container);
    }

    /**
     * Creates a {@code XrPerformanceMetricsCounterMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPerformanceMetricsCounterMETA(ByteBuffer container) {
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
    /** a bitmask of {@code XrPerformanceMetricsCounterFlagBitsMETA} describing the validity of value members. */
    @NativeType("XrPerformanceMetricsCounterFlagsMETA")
    public long counterFlags() { return ncounterFlags(address()); }
    /** a enum of {@code XrPerformanceMetricsCounterUnitMETA} describing the measurement unit. */
    @NativeType("XrPerformanceMetricsCounterUnitMETA")
    public int counterUnit() { return ncounterUnit(address()); }
    /** the counter value in {@code uint32_t} format. It is valid if {@code counterFlags} contains {@link METAPerformanceMetrics#XR_PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META}. */
    @NativeType("uint32_t")
    public int uintValue() { return nuintValue(address()); }
    /** the counter value in {@code float} format. It is valid if {@code counterFlags} contains {@link METAPerformanceMetrics#XR_PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META}. */
    public float floatValue() { return nfloatValue(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPerformanceMetricsCounterMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_COUNTER_META TYPE_PERFORMANCE_METRICS_COUNTER_META} value to the {@link #type} field. */
    public XrPerformanceMetricsCounterMETA type$Default() { return type(METAPerformanceMetrics.XR_TYPE_PERFORMANCE_METRICS_COUNTER_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPerformanceMetricsCounterMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #counterFlags} field. */
    public XrPerformanceMetricsCounterMETA counterFlags(@NativeType("XrPerformanceMetricsCounterFlagsMETA") long value) { ncounterFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #counterUnit} field. */
    public XrPerformanceMetricsCounterMETA counterUnit(@NativeType("XrPerformanceMetricsCounterUnitMETA") int value) { ncounterUnit(address(), value); return this; }
    /** Sets the specified value to the {@link #uintValue} field. */
    public XrPerformanceMetricsCounterMETA uintValue(@NativeType("uint32_t") int value) { nuintValue(address(), value); return this; }
    /** Sets the specified value to the {@link #floatValue} field. */
    public XrPerformanceMetricsCounterMETA floatValue(float value) { nfloatValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPerformanceMetricsCounterMETA set(
        int type,
        long next,
        long counterFlags,
        int counterUnit,
        int uintValue,
        float floatValue
    ) {
        type(type);
        next(next);
        counterFlags(counterFlags);
        counterUnit(counterUnit);
        uintValue(uintValue);
        floatValue(floatValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPerformanceMetricsCounterMETA set(XrPerformanceMetricsCounterMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPerformanceMetricsCounterMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPerformanceMetricsCounterMETA malloc() {
        return new XrPerformanceMetricsCounterMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPerformanceMetricsCounterMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPerformanceMetricsCounterMETA calloc() {
        return new XrPerformanceMetricsCounterMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPerformanceMetricsCounterMETA} instance allocated with {@link BufferUtils}. */
    public static XrPerformanceMetricsCounterMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPerformanceMetricsCounterMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPerformanceMetricsCounterMETA} instance for the specified memory address. */
    public static XrPerformanceMetricsCounterMETA create(long address) {
        return new XrPerformanceMetricsCounterMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPerformanceMetricsCounterMETA createSafe(long address) {
        return address == NULL ? null : new XrPerformanceMetricsCounterMETA(address, null);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPerformanceMetricsCounterMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPerformanceMetricsCounterMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPerformanceMetricsCounterMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPerformanceMetricsCounterMETA malloc(MemoryStack stack) {
        return new XrPerformanceMetricsCounterMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPerformanceMetricsCounterMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPerformanceMetricsCounterMETA calloc(MemoryStack stack) {
        return new XrPerformanceMetricsCounterMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPerformanceMetricsCounterMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPerformanceMetricsCounterMETA.NEXT); }
    /** Unsafe version of {@link #counterFlags}. */
    public static long ncounterFlags(long struct) { return UNSAFE.getLong(null, struct + XrPerformanceMetricsCounterMETA.COUNTERFLAGS); }
    /** Unsafe version of {@link #counterUnit}. */
    public static int ncounterUnit(long struct) { return UNSAFE.getInt(null, struct + XrPerformanceMetricsCounterMETA.COUNTERUNIT); }
    /** Unsafe version of {@link #uintValue}. */
    public static int nuintValue(long struct) { return UNSAFE.getInt(null, struct + XrPerformanceMetricsCounterMETA.UINTVALUE); }
    /** Unsafe version of {@link #floatValue}. */
    public static float nfloatValue(long struct) { return UNSAFE.getFloat(null, struct + XrPerformanceMetricsCounterMETA.FLOATVALUE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPerformanceMetricsCounterMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPerformanceMetricsCounterMETA.NEXT, value); }
    /** Unsafe version of {@link #counterFlags(long) counterFlags}. */
    public static void ncounterFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrPerformanceMetricsCounterMETA.COUNTERFLAGS, value); }
    /** Unsafe version of {@link #counterUnit(int) counterUnit}. */
    public static void ncounterUnit(long struct, int value) { UNSAFE.putInt(null, struct + XrPerformanceMetricsCounterMETA.COUNTERUNIT, value); }
    /** Unsafe version of {@link #uintValue(int) uintValue}. */
    public static void nuintValue(long struct, int value) { UNSAFE.putInt(null, struct + XrPerformanceMetricsCounterMETA.UINTVALUE, value); }
    /** Unsafe version of {@link #floatValue(float) floatValue}. */
    public static void nfloatValue(long struct, float value) { UNSAFE.putFloat(null, struct + XrPerformanceMetricsCounterMETA.FLOATVALUE, value); }

    // -----------------------------------

    /** An array of {@link XrPerformanceMetricsCounterMETA} structs. */
    public static class Buffer extends StructBuffer<XrPerformanceMetricsCounterMETA, Buffer> implements NativeResource {

        private static final XrPerformanceMetricsCounterMETA ELEMENT_FACTORY = XrPerformanceMetricsCounterMETA.create(-1L);

        /**
         * Creates a new {@code XrPerformanceMetricsCounterMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPerformanceMetricsCounterMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPerformanceMetricsCounterMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPerformanceMetricsCounterMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPerformanceMetricsCounterMETA.ntype(address()); }
        /** @return the value of the {@link XrPerformanceMetricsCounterMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrPerformanceMetricsCounterMETA.nnext(address()); }
        /** @return the value of the {@link XrPerformanceMetricsCounterMETA#counterFlags} field. */
        @NativeType("XrPerformanceMetricsCounterFlagsMETA")
        public long counterFlags() { return XrPerformanceMetricsCounterMETA.ncounterFlags(address()); }
        /** @return the value of the {@link XrPerformanceMetricsCounterMETA#counterUnit} field. */
        @NativeType("XrPerformanceMetricsCounterUnitMETA")
        public int counterUnit() { return XrPerformanceMetricsCounterMETA.ncounterUnit(address()); }
        /** @return the value of the {@link XrPerformanceMetricsCounterMETA#uintValue} field. */
        @NativeType("uint32_t")
        public int uintValue() { return XrPerformanceMetricsCounterMETA.nuintValue(address()); }
        /** @return the value of the {@link XrPerformanceMetricsCounterMETA#floatValue} field. */
        public float floatValue() { return XrPerformanceMetricsCounterMETA.nfloatValue(address()); }

        /** Sets the specified value to the {@link XrPerformanceMetricsCounterMETA#type} field. */
        public XrPerformanceMetricsCounterMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPerformanceMetricsCounterMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_COUNTER_META TYPE_PERFORMANCE_METRICS_COUNTER_META} value to the {@link XrPerformanceMetricsCounterMETA#type} field. */
        public XrPerformanceMetricsCounterMETA.Buffer type$Default() { return type(METAPerformanceMetrics.XR_TYPE_PERFORMANCE_METRICS_COUNTER_META); }
        /** Sets the specified value to the {@link XrPerformanceMetricsCounterMETA#next} field. */
        public XrPerformanceMetricsCounterMETA.Buffer next(@NativeType("void const *") long value) { XrPerformanceMetricsCounterMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPerformanceMetricsCounterMETA#counterFlags} field. */
        public XrPerformanceMetricsCounterMETA.Buffer counterFlags(@NativeType("XrPerformanceMetricsCounterFlagsMETA") long value) { XrPerformanceMetricsCounterMETA.ncounterFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrPerformanceMetricsCounterMETA#counterUnit} field. */
        public XrPerformanceMetricsCounterMETA.Buffer counterUnit(@NativeType("XrPerformanceMetricsCounterUnitMETA") int value) { XrPerformanceMetricsCounterMETA.ncounterUnit(address(), value); return this; }
        /** Sets the specified value to the {@link XrPerformanceMetricsCounterMETA#uintValue} field. */
        public XrPerformanceMetricsCounterMETA.Buffer uintValue(@NativeType("uint32_t") int value) { XrPerformanceMetricsCounterMETA.nuintValue(address(), value); return this; }
        /** Sets the specified value to the {@link XrPerformanceMetricsCounterMETA#floatValue} field. */
        public XrPerformanceMetricsCounterMETA.Buffer floatValue(float value) { XrPerformanceMetricsCounterMETA.nfloatValue(address(), value); return this; }

    }

}