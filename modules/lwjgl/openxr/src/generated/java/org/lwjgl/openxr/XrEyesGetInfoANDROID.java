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
 * struct XrEyesGetInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrTime time;
 *     XrSpace baseSpace;
 * }}</pre>
 */
public class XrEyesGetInfoANDROID extends Struct<XrEyesGetInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIME,
        BASESPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TIME = layout.offsetof(2);
        BASESPACE = layout.offsetof(3);
    }

    protected XrEyesGetInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEyesGetInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrEyesGetInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrEyesGetInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyesGetInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEyesGetInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDEyeTracking#XR_TYPE_EYES_GET_INFO_ANDROID TYPE_EYES_GET_INFO_ANDROID} value to the {@code type} field. */
    public XrEyesGetInfoANDROID type$Default() { return type(ANDROIDEyeTracking.XR_TYPE_EYES_GET_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrEyesGetInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrEyesGetInfoANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrEyesGetInfoANDROID baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyesGetInfoANDROID set(
        int type,
        long next,
        long time,
        XrSpace baseSpace
    ) {
        type(type);
        next(next);
        time(time);
        baseSpace(baseSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEyesGetInfoANDROID set(XrEyesGetInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyesGetInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyesGetInfoANDROID malloc() {
        return new XrEyesGetInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEyesGetInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyesGetInfoANDROID calloc() {
        return new XrEyesGetInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEyesGetInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrEyesGetInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEyesGetInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrEyesGetInfoANDROID} instance for the specified memory address. */
    public static XrEyesGetInfoANDROID create(long address) {
        return new XrEyesGetInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEyesGetInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrEyesGetInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrEyesGetInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyesGetInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyesGetInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyesGetInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyesGetInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyesGetInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEyesGetInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyesGetInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEyesGetInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEyesGetInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyesGetInfoANDROID malloc(MemoryStack stack) {
        return new XrEyesGetInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEyesGetInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyesGetInfoANDROID calloc(MemoryStack stack) {
        return new XrEyesGetInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEyesGetInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyesGetInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyesGetInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyesGetInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEyesGetInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEyesGetInfoANDROID.NEXT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrEyesGetInfoANDROID.TIME); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrEyesGetInfoANDROID.BASESPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEyesGetInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEyesGetInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrEyesGetInfoANDROID.TIME, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrEyesGetInfoANDROID.BASESPACE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEyesGetInfoANDROID.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrEyesGetInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrEyesGetInfoANDROID, Buffer> implements NativeResource {

        private static final XrEyesGetInfoANDROID ELEMENT_FACTORY = XrEyesGetInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrEyesGetInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyesGetInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEyesGetInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEyesGetInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEyesGetInfoANDROID.nnext(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrEyesGetInfoANDROID.ntime(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrEyesGetInfoANDROID.nbaseSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEyesGetInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrEyesGetInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDEyeTracking#XR_TYPE_EYES_GET_INFO_ANDROID TYPE_EYES_GET_INFO_ANDROID} value to the {@code type} field. */
        public XrEyesGetInfoANDROID.Buffer type$Default() { return type(ANDROIDEyeTracking.XR_TYPE_EYES_GET_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrEyesGetInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrEyesGetInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrEyesGetInfoANDROID.Buffer time(@NativeType("XrTime") long value) { XrEyesGetInfoANDROID.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrEyesGetInfoANDROID.Buffer baseSpace(XrSpace value) { XrEyesGetInfoANDROID.nbaseSpace(address(), value); return this; }

    }

}