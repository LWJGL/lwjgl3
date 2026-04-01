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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrPerformanceMetricsCounterANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrPerformanceMetricsCounterFlagsANDROID counterFlags;
 *     XrPerformanceMetricsCounterUnitANDROID counterUnit;
 *     uint32_t uintValue;
 *     float floatValue;
 * }}</pre>
 */
public class XrPerformanceMetricsCounterANDROID extends Struct<XrPerformanceMetricsCounterANDROID> implements NativeResource {

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

    protected XrPerformanceMetricsCounterANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPerformanceMetricsCounterANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrPerformanceMetricsCounterANDROID(address, container);
    }

    /**
     * Creates a {@code XrPerformanceMetricsCounterANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPerformanceMetricsCounterANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code counterFlags} field. */
    @NativeType("XrPerformanceMetricsCounterFlagsANDROID")
    public long counterFlags() { return ncounterFlags(address()); }
    /** @return the value of the {@code counterUnit} field. */
    @NativeType("XrPerformanceMetricsCounterUnitANDROID")
    public int counterUnit() { return ncounterUnit(address()); }
    /** @return the value of the {@code uintValue} field. */
    @NativeType("uint32_t")
    public int uintValue() { return nuintValue(address()); }
    /** @return the value of the {@code floatValue} field. */
    public float floatValue() { return nfloatValue(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPerformanceMetricsCounterANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_COUNTER_ANDROID TYPE_PERFORMANCE_METRICS_COUNTER_ANDROID} value to the {@code type} field. */
    public XrPerformanceMetricsCounterANDROID type$Default() { return type(ANDROIDPerformanceMetrics.XR_TYPE_PERFORMANCE_METRICS_COUNTER_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrPerformanceMetricsCounterANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPerformanceMetricsCounterANDROID set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPerformanceMetricsCounterANDROID set(XrPerformanceMetricsCounterANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPerformanceMetricsCounterANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPerformanceMetricsCounterANDROID malloc() {
        return new XrPerformanceMetricsCounterANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPerformanceMetricsCounterANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPerformanceMetricsCounterANDROID calloc() {
        return new XrPerformanceMetricsCounterANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPerformanceMetricsCounterANDROID} instance allocated with {@link BufferUtils}. */
    public static XrPerformanceMetricsCounterANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPerformanceMetricsCounterANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrPerformanceMetricsCounterANDROID} instance for the specified memory address. */
    public static XrPerformanceMetricsCounterANDROID create(long address) {
        return new XrPerformanceMetricsCounterANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPerformanceMetricsCounterANDROID createSafe(long address) {
        return address == NULL ? null : new XrPerformanceMetricsCounterANDROID(address, null);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPerformanceMetricsCounterANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPerformanceMetricsCounterANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPerformanceMetricsCounterANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPerformanceMetricsCounterANDROID malloc(MemoryStack stack) {
        return new XrPerformanceMetricsCounterANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPerformanceMetricsCounterANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPerformanceMetricsCounterANDROID calloc(MemoryStack stack) {
        return new XrPerformanceMetricsCounterANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsCounterANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsCounterANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPerformanceMetricsCounterANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPerformanceMetricsCounterANDROID.NEXT); }
    /** Unsafe version of {@link #counterFlags}. */
    public static long ncounterFlags(long struct) { return memGetLong(struct + XrPerformanceMetricsCounterANDROID.COUNTERFLAGS); }
    /** Unsafe version of {@link #counterUnit}. */
    public static int ncounterUnit(long struct) { return memGetInt(struct + XrPerformanceMetricsCounterANDROID.COUNTERUNIT); }
    /** Unsafe version of {@link #uintValue}. */
    public static int nuintValue(long struct) { return memGetInt(struct + XrPerformanceMetricsCounterANDROID.UINTVALUE); }
    /** Unsafe version of {@link #floatValue}. */
    public static float nfloatValue(long struct) { return memGetFloat(struct + XrPerformanceMetricsCounterANDROID.FLOATVALUE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPerformanceMetricsCounterANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPerformanceMetricsCounterANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrPerformanceMetricsCounterANDROID} structs. */
    public static class Buffer extends StructBuffer<XrPerformanceMetricsCounterANDROID, Buffer> implements NativeResource {

        private static final XrPerformanceMetricsCounterANDROID ELEMENT_FACTORY = XrPerformanceMetricsCounterANDROID.create(-1L);

        /**
         * Creates a new {@code XrPerformanceMetricsCounterANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPerformanceMetricsCounterANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPerformanceMetricsCounterANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPerformanceMetricsCounterANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrPerformanceMetricsCounterANDROID.nnext(address()); }
        /** @return the value of the {@code counterFlags} field. */
        @NativeType("XrPerformanceMetricsCounterFlagsANDROID")
        public long counterFlags() { return XrPerformanceMetricsCounterANDROID.ncounterFlags(address()); }
        /** @return the value of the {@code counterUnit} field. */
        @NativeType("XrPerformanceMetricsCounterUnitANDROID")
        public int counterUnit() { return XrPerformanceMetricsCounterANDROID.ncounterUnit(address()); }
        /** @return the value of the {@code uintValue} field. */
        @NativeType("uint32_t")
        public int uintValue() { return XrPerformanceMetricsCounterANDROID.nuintValue(address()); }
        /** @return the value of the {@code floatValue} field. */
        public float floatValue() { return XrPerformanceMetricsCounterANDROID.nfloatValue(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPerformanceMetricsCounterANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrPerformanceMetricsCounterANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_COUNTER_ANDROID TYPE_PERFORMANCE_METRICS_COUNTER_ANDROID} value to the {@code type} field. */
        public XrPerformanceMetricsCounterANDROID.Buffer type$Default() { return type(ANDROIDPerformanceMetrics.XR_TYPE_PERFORMANCE_METRICS_COUNTER_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrPerformanceMetricsCounterANDROID.Buffer next(@NativeType("void *") long value) { XrPerformanceMetricsCounterANDROID.nnext(address(), value); return this; }

    }

}