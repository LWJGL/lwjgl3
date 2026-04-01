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
 * struct XrPerformanceMetricsStateANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 enabled;
 * }}</pre>
 */
public class XrPerformanceMetricsStateANDROID extends Struct<XrPerformanceMetricsStateANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENABLED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENABLED = layout.offsetof(2);
    }

    protected XrPerformanceMetricsStateANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPerformanceMetricsStateANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrPerformanceMetricsStateANDROID(address, container);
    }

    /**
     * Creates a {@code XrPerformanceMetricsStateANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPerformanceMetricsStateANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code enabled} field. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrPerformanceMetricsStateANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_STATE_ANDROID TYPE_PERFORMANCE_METRICS_STATE_ANDROID} value to the {@code type} field. */
    public XrPerformanceMetricsStateANDROID type$Default() { return type(ANDROIDPerformanceMetrics.XR_TYPE_PERFORMANCE_METRICS_STATE_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrPerformanceMetricsStateANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code enabled} field. */
    public XrPerformanceMetricsStateANDROID enabled(@NativeType("XrBool32") boolean value) { nenabled(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrPerformanceMetricsStateANDROID set(
        int type,
        long next,
        boolean enabled
    ) {
        type(type);
        next(next);
        enabled(enabled);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPerformanceMetricsStateANDROID set(XrPerformanceMetricsStateANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPerformanceMetricsStateANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPerformanceMetricsStateANDROID malloc() {
        return new XrPerformanceMetricsStateANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPerformanceMetricsStateANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPerformanceMetricsStateANDROID calloc() {
        return new XrPerformanceMetricsStateANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPerformanceMetricsStateANDROID} instance allocated with {@link BufferUtils}. */
    public static XrPerformanceMetricsStateANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPerformanceMetricsStateANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrPerformanceMetricsStateANDROID} instance for the specified memory address. */
    public static XrPerformanceMetricsStateANDROID create(long address) {
        return new XrPerformanceMetricsStateANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPerformanceMetricsStateANDROID createSafe(long address) {
        return address == NULL ? null : new XrPerformanceMetricsStateANDROID(address, null);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPerformanceMetricsStateANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPerformanceMetricsStateANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPerformanceMetricsStateANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPerformanceMetricsStateANDROID malloc(MemoryStack stack) {
        return new XrPerformanceMetricsStateANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPerformanceMetricsStateANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPerformanceMetricsStateANDROID calloc(MemoryStack stack) {
        return new XrPerformanceMetricsStateANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPerformanceMetricsStateANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPerformanceMetricsStateANDROID.NEXT); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return memGetInt(struct + XrPerformanceMetricsStateANDROID.ENABLED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPerformanceMetricsStateANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPerformanceMetricsStateANDROID.NEXT, value); }
    /** Unsafe version of {@link #enabled(boolean) enabled}. */
    public static void nenabled(long struct, int value) { memPutInt(struct + XrPerformanceMetricsStateANDROID.ENABLED, value); }

    // -----------------------------------

    /** An array of {@link XrPerformanceMetricsStateANDROID} structs. */
    public static class Buffer extends StructBuffer<XrPerformanceMetricsStateANDROID, Buffer> implements NativeResource {

        private static final XrPerformanceMetricsStateANDROID ELEMENT_FACTORY = XrPerformanceMetricsStateANDROID.create(-1L);

        /**
         * Creates a new {@code XrPerformanceMetricsStateANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPerformanceMetricsStateANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPerformanceMetricsStateANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPerformanceMetricsStateANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrPerformanceMetricsStateANDROID.nnext(address()); }
        /** @return the value of the {@code enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrPerformanceMetricsStateANDROID.nenabled(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrPerformanceMetricsStateANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrPerformanceMetricsStateANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_STATE_ANDROID TYPE_PERFORMANCE_METRICS_STATE_ANDROID} value to the {@code type} field. */
        public XrPerformanceMetricsStateANDROID.Buffer type$Default() { return type(ANDROIDPerformanceMetrics.XR_TYPE_PERFORMANCE_METRICS_STATE_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrPerformanceMetricsStateANDROID.Buffer next(@NativeType("void *") long value) { XrPerformanceMetricsStateANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code enabled} field. */
        public XrPerformanceMetricsStateANDROID.Buffer enabled(@NativeType("XrBool32") boolean value) { XrPerformanceMetricsStateANDROID.nenabled(address(), value ? 1 : 0); return this; }

    }

}