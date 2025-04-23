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
 * struct XrSenseDataProviderCreateInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSenseDataProviderTypeBD providerType;
 * }}</pre>
 */
public class XrSenseDataProviderCreateInfoBD extends Struct<XrSenseDataProviderCreateInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PROVIDERTYPE;

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
        PROVIDERTYPE = layout.offsetof(2);
    }

    protected XrSenseDataProviderCreateInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataProviderCreateInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataProviderCreateInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataProviderCreateInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataProviderCreateInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code providerType} field. */
    @NativeType("XrSenseDataProviderTypeBD")
    public int providerType() { return nproviderType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSenseDataProviderCreateInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD} value to the {@code type} field. */
    public XrSenseDataProviderCreateInfoBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataProviderCreateInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSenseDataProviderCreateInfoSpatialMeshBD} value to the {@code next} chain. */
    public XrSenseDataProviderCreateInfoBD next(XrSenseDataProviderCreateInfoSpatialMeshBD value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code providerType} field. */
    public XrSenseDataProviderCreateInfoBD providerType(@NativeType("XrSenseDataProviderTypeBD") int value) { nproviderType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSenseDataProviderCreateInfoBD set(
        int type,
        long next,
        int providerType
    ) {
        type(type);
        next(next);
        providerType(providerType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSenseDataProviderCreateInfoBD set(XrSenseDataProviderCreateInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataProviderCreateInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataProviderCreateInfoBD malloc() {
        return new XrSenseDataProviderCreateInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataProviderCreateInfoBD calloc() {
        return new XrSenseDataProviderCreateInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataProviderCreateInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataProviderCreateInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoBD} instance for the specified memory address. */
    public static XrSenseDataProviderCreateInfoBD create(long address) {
        return new XrSenseDataProviderCreateInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataProviderCreateInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataProviderCreateInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataProviderCreateInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataProviderCreateInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSenseDataProviderCreateInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataProviderCreateInfoBD malloc(MemoryStack stack) {
        return new XrSenseDataProviderCreateInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataProviderCreateInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataProviderCreateInfoBD calloc(MemoryStack stack) {
        return new XrSenseDataProviderCreateInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataProviderCreateInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataProviderCreateInfoBD.NEXT); }
    /** Unsafe version of {@link #providerType}. */
    public static int nproviderType(long struct) { return memGetInt(struct + XrSenseDataProviderCreateInfoBD.PROVIDERTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataProviderCreateInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataProviderCreateInfoBD.NEXT, value); }
    /** Unsafe version of {@link #providerType(int) providerType}. */
    public static void nproviderType(long struct, int value) { memPutInt(struct + XrSenseDataProviderCreateInfoBD.PROVIDERTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSenseDataProviderCreateInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataProviderCreateInfoBD, Buffer> implements NativeResource {

        private static final XrSenseDataProviderCreateInfoBD ELEMENT_FACTORY = XrSenseDataProviderCreateInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataProviderCreateInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataProviderCreateInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataProviderCreateInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataProviderCreateInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSenseDataProviderCreateInfoBD.nnext(address()); }
        /** @return the value of the {@code providerType} field. */
        @NativeType("XrSenseDataProviderTypeBD")
        public int providerType() { return XrSenseDataProviderCreateInfoBD.nproviderType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataProviderCreateInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataProviderCreateInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD} value to the {@code type} field. */
        public XrSenseDataProviderCreateInfoBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataProviderCreateInfoBD.Buffer next(@NativeType("void const *") long value) { XrSenseDataProviderCreateInfoBD.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSenseDataProviderCreateInfoSpatialMeshBD} value to the {@code next} chain. */
        public XrSenseDataProviderCreateInfoBD.Buffer next(XrSenseDataProviderCreateInfoSpatialMeshBD value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code providerType} field. */
        public XrSenseDataProviderCreateInfoBD.Buffer providerType(@NativeType("XrSenseDataProviderTypeBD") int value) { XrSenseDataProviderCreateInfoBD.nproviderType(address(), value); return this; }

    }

}