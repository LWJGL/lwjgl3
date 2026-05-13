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
 * struct XrLightEstimateANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrLightEstimateStateANDROID state;
 *     XrTime lastUpdatedTime;
 * }}</pre>
 */
public class XrLightEstimateANDROID extends Struct<XrLightEstimateANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATE,
        LASTUPDATEDTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATE = layout.offsetof(2);
        LASTUPDATEDTIME = layout.offsetof(3);
    }

    protected XrLightEstimateANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrLightEstimateANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrLightEstimateANDROID(address, container);
    }

    /**
     * Creates a {@code XrLightEstimateANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLightEstimateANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code state} field. */
    @NativeType("XrLightEstimateStateANDROID")
    public int state() { return nstate(address()); }
    /** @return the value of the {@code lastUpdatedTime} field. */
    @NativeType("XrTime")
    public long lastUpdatedTime() { return nlastUpdatedTime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrLightEstimateANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_LIGHT_ESTIMATE_ANDROID TYPE_LIGHT_ESTIMATE_ANDROID} value to the {@code type} field. */
    public XrLightEstimateANDROID type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_LIGHT_ESTIMATE_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrLightEstimateANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrAmbientLightANDROID} value to the {@code next} chain. */
    public XrLightEstimateANDROID next(XrAmbientLightANDROID value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrDirectionalLightANDROID} value to the {@code next} chain. */
    public XrLightEstimateANDROID next(XrDirectionalLightANDROID value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSphericalHarmonicsANDROID} value to the {@code next} chain. */
    public XrLightEstimateANDROID next(XrSphericalHarmonicsANDROID value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code state} field. */
    public XrLightEstimateANDROID state(@NativeType("XrLightEstimateStateANDROID") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@code lastUpdatedTime} field. */
    public XrLightEstimateANDROID lastUpdatedTime(@NativeType("XrTime") long value) { nlastUpdatedTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLightEstimateANDROID set(
        int type,
        long next,
        int state,
        long lastUpdatedTime
    ) {
        type(type);
        next(next);
        state(state);
        lastUpdatedTime(lastUpdatedTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrLightEstimateANDROID set(XrLightEstimateANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLightEstimateANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLightEstimateANDROID malloc() {
        return new XrLightEstimateANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrLightEstimateANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLightEstimateANDROID calloc() {
        return new XrLightEstimateANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrLightEstimateANDROID} instance allocated with {@link BufferUtils}. */
    public static XrLightEstimateANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrLightEstimateANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrLightEstimateANDROID} instance for the specified memory address. */
    public static XrLightEstimateANDROID create(long address) {
        return new XrLightEstimateANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrLightEstimateANDROID createSafe(long address) {
        return address == NULL ? null : new XrLightEstimateANDROID(address, null);
    }

    /**
     * Returns a new {@link XrLightEstimateANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLightEstimateANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLightEstimateANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrLightEstimateANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrLightEstimateANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrLightEstimateANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLightEstimateANDROID malloc(MemoryStack stack) {
        return new XrLightEstimateANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrLightEstimateANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLightEstimateANDROID calloc(MemoryStack stack) {
        return new XrLightEstimateANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrLightEstimateANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLightEstimateANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrLightEstimateANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLightEstimateANDROID.NEXT); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + XrLightEstimateANDROID.STATE); }
    /** Unsafe version of {@link #lastUpdatedTime}. */
    public static long nlastUpdatedTime(long struct) { return memGetLong(struct + XrLightEstimateANDROID.LASTUPDATEDTIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrLightEstimateANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLightEstimateANDROID.NEXT, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { memPutInt(struct + XrLightEstimateANDROID.STATE, value); }
    /** Unsafe version of {@link #lastUpdatedTime(long) lastUpdatedTime}. */
    public static void nlastUpdatedTime(long struct, long value) { memPutLong(struct + XrLightEstimateANDROID.LASTUPDATEDTIME, value); }

    // -----------------------------------

    /** An array of {@link XrLightEstimateANDROID} structs. */
    public static class Buffer extends StructBuffer<XrLightEstimateANDROID, Buffer> implements NativeResource {

        private static final XrLightEstimateANDROID ELEMENT_FACTORY = XrLightEstimateANDROID.create(-1L);

        /**
         * Creates a new {@code XrLightEstimateANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLightEstimateANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrLightEstimateANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLightEstimateANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrLightEstimateANDROID.nnext(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("XrLightEstimateStateANDROID")
        public int state() { return XrLightEstimateANDROID.nstate(address()); }
        /** @return the value of the {@code lastUpdatedTime} field. */
        @NativeType("XrTime")
        public long lastUpdatedTime() { return XrLightEstimateANDROID.nlastUpdatedTime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrLightEstimateANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrLightEstimateANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_LIGHT_ESTIMATE_ANDROID TYPE_LIGHT_ESTIMATE_ANDROID} value to the {@code type} field. */
        public XrLightEstimateANDROID.Buffer type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_LIGHT_ESTIMATE_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrLightEstimateANDROID.Buffer next(@NativeType("void *") long value) { XrLightEstimateANDROID.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrAmbientLightANDROID} value to the {@code next} chain. */
        public XrLightEstimateANDROID.Buffer next(XrAmbientLightANDROID value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrDirectionalLightANDROID} value to the {@code next} chain. */
        public XrLightEstimateANDROID.Buffer next(XrDirectionalLightANDROID value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSphericalHarmonicsANDROID} value to the {@code next} chain. */
        public XrLightEstimateANDROID.Buffer next(XrSphericalHarmonicsANDROID value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code state} field. */
        public XrLightEstimateANDROID.Buffer state(@NativeType("XrLightEstimateStateANDROID") int value) { XrLightEstimateANDROID.nstate(address(), value); return this; }
        /** Sets the specified value to the {@code lastUpdatedTime} field. */
        public XrLightEstimateANDROID.Buffer lastUpdatedTime(@NativeType("XrTime") long value) { XrLightEstimateANDROID.nlastUpdatedTime(address(), value); return this; }

    }

}