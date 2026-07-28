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
 * struct XrLightEstimateGetInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrTime time;
 * }}</pre>
 */
public class XrLightEstimateGetInfoANDROID extends Struct<XrLightEstimateGetInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
    }

    protected XrLightEstimateGetInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrLightEstimateGetInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrLightEstimateGetInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrLightEstimateGetInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLightEstimateGetInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrLightEstimateGetInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_LIGHT_ESTIMATE_GET_INFO_ANDROID TYPE_LIGHT_ESTIMATE_GET_INFO_ANDROID} value to the {@code type} field. */
    public XrLightEstimateGetInfoANDROID type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_LIGHT_ESTIMATE_GET_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrLightEstimateGetInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrLightEstimateGetInfoANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrLightEstimateGetInfoANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLightEstimateGetInfoANDROID set(
        int type,
        long next,
        XrSpace space,
        long time
    ) {
        type(type);
        next(next);
        space(space);
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
    public XrLightEstimateGetInfoANDROID set(XrLightEstimateGetInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLightEstimateGetInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLightEstimateGetInfoANDROID malloc() {
        return new XrLightEstimateGetInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrLightEstimateGetInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLightEstimateGetInfoANDROID calloc() {
        return new XrLightEstimateGetInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrLightEstimateGetInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrLightEstimateGetInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrLightEstimateGetInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrLightEstimateGetInfoANDROID} instance for the specified memory address. */
    public static XrLightEstimateGetInfoANDROID create(long address) {
        return new XrLightEstimateGetInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrLightEstimateGetInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrLightEstimateGetInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrLightEstimateGetInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateGetInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLightEstimateGetInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateGetInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLightEstimateGetInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateGetInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrLightEstimateGetInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateGetInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrLightEstimateGetInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrLightEstimateGetInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLightEstimateGetInfoANDROID malloc(MemoryStack stack) {
        return new XrLightEstimateGetInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrLightEstimateGetInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLightEstimateGetInfoANDROID calloc(MemoryStack stack) {
        return new XrLightEstimateGetInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrLightEstimateGetInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateGetInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLightEstimateGetInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLightEstimateGetInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrLightEstimateGetInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLightEstimateGetInfoANDROID.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrLightEstimateGetInfoANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrLightEstimateGetInfoANDROID.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrLightEstimateGetInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLightEstimateGetInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrLightEstimateGetInfoANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrLightEstimateGetInfoANDROID.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrLightEstimateGetInfoANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrLightEstimateGetInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrLightEstimateGetInfoANDROID, Buffer> implements NativeResource {

        private static final XrLightEstimateGetInfoANDROID ELEMENT_FACTORY = XrLightEstimateGetInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrLightEstimateGetInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLightEstimateGetInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrLightEstimateGetInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLightEstimateGetInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrLightEstimateGetInfoANDROID.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrLightEstimateGetInfoANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrLightEstimateGetInfoANDROID.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrLightEstimateGetInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrLightEstimateGetInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_LIGHT_ESTIMATE_GET_INFO_ANDROID TYPE_LIGHT_ESTIMATE_GET_INFO_ANDROID} value to the {@code type} field. */
        public XrLightEstimateGetInfoANDROID.Buffer type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_LIGHT_ESTIMATE_GET_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrLightEstimateGetInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrLightEstimateGetInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrLightEstimateGetInfoANDROID.Buffer space(XrSpace value) { XrLightEstimateGetInfoANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrLightEstimateGetInfoANDROID.Buffer time(@NativeType("XrTime") long value) { XrLightEstimateGetInfoANDROID.ntime(address(), value); return this; }

    }

}