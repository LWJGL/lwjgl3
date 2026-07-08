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
 * struct XrSenseDataProviderCreateInfoDynamicObjectBD {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t trackingTypeCount;
 *     XrDynamicObjectTypeBD const * trackingTypes;
 * }}</pre>
 */
public class XrSenseDataProviderCreateInfoDynamicObjectBD extends Struct<XrSenseDataProviderCreateInfoDynamicObjectBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGTYPECOUNT,
        TRACKINGTYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TRACKINGTYPECOUNT = layout.offsetof(2);
        TRACKINGTYPES = layout.offsetof(3);
    }

    protected XrSenseDataProviderCreateInfoDynamicObjectBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataProviderCreateInfoDynamicObjectBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataProviderCreateInfoDynamicObjectBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataProviderCreateInfoDynamicObjectBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataProviderCreateInfoDynamicObjectBD(ByteBuffer container) {
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
    /** @return the value of the {@code trackingTypeCount} field. */
    @NativeType("uint32_t")
    public int trackingTypeCount() { return ntrackingTypeCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code trackingTypes} field. */
    @NativeType("XrDynamicObjectTypeBD const *")
    public IntBuffer trackingTypes() { return ntrackingTypes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSenseDataProviderCreateInfoDynamicObjectBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDDynamicObjectTracking#XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_DYNAMIC_OBJECT_BD TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_DYNAMIC_OBJECT_BD} value to the {@code type} field. */
    public XrSenseDataProviderCreateInfoDynamicObjectBD type$Default() { return type(BDDynamicObjectTracking.XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_DYNAMIC_OBJECT_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataProviderCreateInfoDynamicObjectBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code trackingTypes} field. */
    public XrSenseDataProviderCreateInfoDynamicObjectBD trackingTypes(@NativeType("XrDynamicObjectTypeBD const *") IntBuffer value) { ntrackingTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSenseDataProviderCreateInfoDynamicObjectBD set(
        int type,
        long next,
        IntBuffer trackingTypes
    ) {
        type(type);
        next(next);
        trackingTypes(trackingTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSenseDataProviderCreateInfoDynamicObjectBD set(XrSenseDataProviderCreateInfoDynamicObjectBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataProviderCreateInfoDynamicObjectBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD malloc() {
        return new XrSenseDataProviderCreateInfoDynamicObjectBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoDynamicObjectBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD calloc() {
        return new XrSenseDataProviderCreateInfoDynamicObjectBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoDynamicObjectBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataProviderCreateInfoDynamicObjectBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoDynamicObjectBD} instance for the specified memory address. */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD create(long address) {
        return new XrSenseDataProviderCreateInfoDynamicObjectBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataProviderCreateInfoDynamicObjectBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataProviderCreateInfoDynamicObjectBD(address, null);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSenseDataProviderCreateInfoDynamicObjectBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD malloc(MemoryStack stack) {
        return new XrSenseDataProviderCreateInfoDynamicObjectBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataProviderCreateInfoDynamicObjectBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD calloc(MemoryStack stack) {
        return new XrSenseDataProviderCreateInfoDynamicObjectBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.NEXT); }
    /** Unsafe version of {@link #trackingTypeCount}. */
    public static int ntrackingTypeCount(long struct) { return memGetInt(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.TRACKINGTYPECOUNT); }
    /** Unsafe version of {@link #trackingTypes() trackingTypes}. */
    public static IntBuffer ntrackingTypes(long struct) { return memIntBuffer(memGetAddress(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.TRACKINGTYPES), ntrackingTypeCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.NEXT, value); }
    /** Sets the specified value to the {@code trackingTypeCount} field of the specified {@code struct}. */
    public static void ntrackingTypeCount(long struct, int value) { memPutInt(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.TRACKINGTYPECOUNT, value); }
    /** Unsafe version of {@link #trackingTypes(IntBuffer) trackingTypes}. */
    public static void ntrackingTypes(long struct, IntBuffer value) { memPutAddress(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.TRACKINGTYPES, memAddress(value)); ntrackingTypeCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSenseDataProviderCreateInfoDynamicObjectBD.TRACKINGTYPES));
    }

    // -----------------------------------

    /** An array of {@link XrSenseDataProviderCreateInfoDynamicObjectBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataProviderCreateInfoDynamicObjectBD, Buffer> implements NativeResource {

        private static final XrSenseDataProviderCreateInfoDynamicObjectBD ELEMENT_FACTORY = XrSenseDataProviderCreateInfoDynamicObjectBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataProviderCreateInfoDynamicObjectBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataProviderCreateInfoDynamicObjectBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataProviderCreateInfoDynamicObjectBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSenseDataProviderCreateInfoDynamicObjectBD.nnext(address()); }
        /** @return the value of the {@code trackingTypeCount} field. */
        @NativeType("uint32_t")
        public int trackingTypeCount() { return XrSenseDataProviderCreateInfoDynamicObjectBD.ntrackingTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code trackingTypes} field. */
        @NativeType("XrDynamicObjectTypeBD const *")
        public IntBuffer trackingTypes() { return XrSenseDataProviderCreateInfoDynamicObjectBD.ntrackingTypes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataProviderCreateInfoDynamicObjectBD.ntype(address(), value); return this; }
        /** Sets the {@link BDDynamicObjectTracking#XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_DYNAMIC_OBJECT_BD TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_DYNAMIC_OBJECT_BD} value to the {@code type} field. */
        public XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer type$Default() { return type(BDDynamicObjectTracking.XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_DYNAMIC_OBJECT_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer next(@NativeType("void const *") long value) { XrSenseDataProviderCreateInfoDynamicObjectBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code trackingTypes} field. */
        public XrSenseDataProviderCreateInfoDynamicObjectBD.Buffer trackingTypes(@NativeType("XrDynamicObjectTypeBD const *") IntBuffer value) { XrSenseDataProviderCreateInfoDynamicObjectBD.ntrackingTypes(address(), value); return this; }

    }

}