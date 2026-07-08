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
 * struct XrVPSAvailabilityCheckCompletionANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrVPSAvailabilityANDROID availability;
 * }}</pre>
 */
public class XrVPSAvailabilityCheckCompletionANDROID extends Struct<XrVPSAvailabilityCheckCompletionANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        AVAILABILITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        AVAILABILITY = layout.offsetof(3);
    }

    protected XrVPSAvailabilityCheckCompletionANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVPSAvailabilityCheckCompletionANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrVPSAvailabilityCheckCompletionANDROID(address, container);
    }

    /**
     * Creates a {@code XrVPSAvailabilityCheckCompletionANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVPSAvailabilityCheckCompletionANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code futureResult} field. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }
    /** @return the value of the {@code availability} field. */
    @NativeType("XrVPSAvailabilityANDROID")
    public int availability() { return navailability(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVPSAvailabilityCheckCompletionANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatial#XR_TYPE_VPS_AVAILABILITY_CHECK_COMPLETION_ANDROID TYPE_VPS_AVAILABILITY_CHECK_COMPLETION_ANDROID} value to the {@code type} field. */
    public XrVPSAvailabilityCheckCompletionANDROID type$Default() { return type(ANDROIDGeospatial.XR_TYPE_VPS_AVAILABILITY_CHECK_COMPLETION_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrVPSAvailabilityCheckCompletionANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrVPSAvailabilityCheckCompletionANDROID futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code availability} field. */
    public XrVPSAvailabilityCheckCompletionANDROID availability(@NativeType("XrVPSAvailabilityANDROID") int value) { navailability(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVPSAvailabilityCheckCompletionANDROID set(
        int type,
        long next,
        int futureResult,
        int availability
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        availability(availability);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVPSAvailabilityCheckCompletionANDROID set(XrVPSAvailabilityCheckCompletionANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVPSAvailabilityCheckCompletionANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVPSAvailabilityCheckCompletionANDROID malloc() {
        return new XrVPSAvailabilityCheckCompletionANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVPSAvailabilityCheckCompletionANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVPSAvailabilityCheckCompletionANDROID calloc() {
        return new XrVPSAvailabilityCheckCompletionANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVPSAvailabilityCheckCompletionANDROID} instance allocated with {@link BufferUtils}. */
    public static XrVPSAvailabilityCheckCompletionANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVPSAvailabilityCheckCompletionANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrVPSAvailabilityCheckCompletionANDROID} instance for the specified memory address. */
    public static XrVPSAvailabilityCheckCompletionANDROID create(long address) {
        return new XrVPSAvailabilityCheckCompletionANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrVPSAvailabilityCheckCompletionANDROID createSafe(long address) {
        return address == NULL ? null : new XrVPSAvailabilityCheckCompletionANDROID(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrVPSAvailabilityCheckCompletionANDROID}. */
    public static XrVPSAvailabilityCheckCompletionANDROID create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrVPSAvailabilityCheckCompletionANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrVPSAvailabilityCheckCompletionANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVPSAvailabilityCheckCompletionANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVPSAvailabilityCheckCompletionANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVPSAvailabilityCheckCompletionANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVPSAvailabilityCheckCompletionANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVPSAvailabilityCheckCompletionANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVPSAvailabilityCheckCompletionANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVPSAvailabilityCheckCompletionANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrVPSAvailabilityCheckCompletionANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrVPSAvailabilityCheckCompletionANDROID.Buffer}. */
    public static XrVPSAvailabilityCheckCompletionANDROID.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrVPSAvailabilityCheckCompletionANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrVPSAvailabilityCheckCompletionANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVPSAvailabilityCheckCompletionANDROID malloc(MemoryStack stack) {
        return new XrVPSAvailabilityCheckCompletionANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVPSAvailabilityCheckCompletionANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVPSAvailabilityCheckCompletionANDROID calloc(MemoryStack stack) {
        return new XrVPSAvailabilityCheckCompletionANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVPSAvailabilityCheckCompletionANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVPSAvailabilityCheckCompletionANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVPSAvailabilityCheckCompletionANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVPSAvailabilityCheckCompletionANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrVPSAvailabilityCheckCompletionANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVPSAvailabilityCheckCompletionANDROID.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrVPSAvailabilityCheckCompletionANDROID.FUTURERESULT); }
    /** Unsafe version of {@link #availability}. */
    public static int navailability(long struct) { return memGetInt(struct + XrVPSAvailabilityCheckCompletionANDROID.AVAILABILITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrVPSAvailabilityCheckCompletionANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVPSAvailabilityCheckCompletionANDROID.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrVPSAvailabilityCheckCompletionANDROID.FUTURERESULT, value); }
    /** Unsafe version of {@link #availability(int) availability}. */
    public static void navailability(long struct, int value) { memPutInt(struct + XrVPSAvailabilityCheckCompletionANDROID.AVAILABILITY, value); }

    // -----------------------------------

    /** An array of {@link XrVPSAvailabilityCheckCompletionANDROID} structs. */
    public static class Buffer extends StructBuffer<XrVPSAvailabilityCheckCompletionANDROID, Buffer> implements NativeResource {

        private static final XrVPSAvailabilityCheckCompletionANDROID ELEMENT_FACTORY = XrVPSAvailabilityCheckCompletionANDROID.create(-1L);

        /**
         * Creates a new {@code XrVPSAvailabilityCheckCompletionANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVPSAvailabilityCheckCompletionANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVPSAvailabilityCheckCompletionANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVPSAvailabilityCheckCompletionANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrVPSAvailabilityCheckCompletionANDROID.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrVPSAvailabilityCheckCompletionANDROID.nfutureResult(address()); }
        /** @return the value of the {@code availability} field. */
        @NativeType("XrVPSAvailabilityANDROID")
        public int availability() { return XrVPSAvailabilityCheckCompletionANDROID.navailability(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVPSAvailabilityCheckCompletionANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrVPSAvailabilityCheckCompletionANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatial#XR_TYPE_VPS_AVAILABILITY_CHECK_COMPLETION_ANDROID TYPE_VPS_AVAILABILITY_CHECK_COMPLETION_ANDROID} value to the {@code type} field. */
        public XrVPSAvailabilityCheckCompletionANDROID.Buffer type$Default() { return type(ANDROIDGeospatial.XR_TYPE_VPS_AVAILABILITY_CHECK_COMPLETION_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrVPSAvailabilityCheckCompletionANDROID.Buffer next(@NativeType("void *") long value) { XrVPSAvailabilityCheckCompletionANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrVPSAvailabilityCheckCompletionANDROID.Buffer futureResult(@NativeType("XrResult") int value) { XrVPSAvailabilityCheckCompletionANDROID.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code availability} field. */
        public XrVPSAvailabilityCheckCompletionANDROID.Buffer availability(@NativeType("XrVPSAvailabilityANDROID") int value) { XrVPSAvailabilityCheckCompletionANDROID.navailability(address(), value); return this; }

    }

}