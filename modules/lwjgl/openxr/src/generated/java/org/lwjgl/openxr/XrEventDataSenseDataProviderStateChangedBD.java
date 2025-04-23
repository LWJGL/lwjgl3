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
 * struct XrEventDataSenseDataProviderStateChangedBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSenseDataProviderBD provider;
 *     XrSenseDataProviderStateBD newState;
 * }}</pre>
 */
public class XrEventDataSenseDataProviderStateChangedBD extends Struct<XrEventDataSenseDataProviderStateChangedBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PROVIDER,
        NEWSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PROVIDER = layout.offsetof(2);
        NEWSTATE = layout.offsetof(3);
    }

    protected XrEventDataSenseDataProviderStateChangedBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSenseDataProviderStateChangedBD create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSenseDataProviderStateChangedBD(address, container);
    }

    /**
     * Creates a {@code XrEventDataSenseDataProviderStateChangedBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSenseDataProviderStateChangedBD(ByteBuffer container) {
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
    /** @return the value of the {@code provider} field. */
    @NativeType("XrSenseDataProviderBD")
    public long provider() { return nprovider(address()); }
    /** @return the value of the {@code newState} field. */
    @NativeType("XrSenseDataProviderStateBD")
    public int newState() { return nnewState(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSenseDataProviderStateChangedBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD} value to the {@code type} field. */
    public XrEventDataSenseDataProviderStateChangedBD type$Default() { return type(BDSpatialSensing.XR_TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSenseDataProviderStateChangedBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSenseDataProviderStateChangedBD set(
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
    public XrEventDataSenseDataProviderStateChangedBD set(XrEventDataSenseDataProviderStateChangedBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSenseDataProviderStateChangedBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSenseDataProviderStateChangedBD malloc() {
        return new XrEventDataSenseDataProviderStateChangedBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSenseDataProviderStateChangedBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSenseDataProviderStateChangedBD calloc() {
        return new XrEventDataSenseDataProviderStateChangedBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSenseDataProviderStateChangedBD} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSenseDataProviderStateChangedBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSenseDataProviderStateChangedBD(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSenseDataProviderStateChangedBD} instance for the specified memory address. */
    public static XrEventDataSenseDataProviderStateChangedBD create(long address) {
        return new XrEventDataSenseDataProviderStateChangedBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataSenseDataProviderStateChangedBD createSafe(long address) {
        return address == NULL ? null : new XrEventDataSenseDataProviderStateChangedBD(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSenseDataProviderStateChangedBD}. */
    public static XrEventDataSenseDataProviderStateChangedBD create(XrEventDataBaseHeader value) {
        return new XrEventDataSenseDataProviderStateChangedBD(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSenseDataProviderStateChangedBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSenseDataProviderStateChangedBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSenseDataProviderStateChangedBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSenseDataProviderStateChangedBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSenseDataProviderStateChangedBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSenseDataProviderStateChangedBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSenseDataProviderStateChangedBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSenseDataProviderStateChangedBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataSenseDataProviderStateChangedBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSenseDataProviderStateChangedBD.Buffer}. */
    public static XrEventDataSenseDataProviderStateChangedBD.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSenseDataProviderStateChangedBD.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSenseDataProviderStateChangedBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSenseDataProviderStateChangedBD malloc(MemoryStack stack) {
        return new XrEventDataSenseDataProviderStateChangedBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSenseDataProviderStateChangedBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSenseDataProviderStateChangedBD calloc(MemoryStack stack) {
        return new XrEventDataSenseDataProviderStateChangedBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSenseDataProviderStateChangedBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSenseDataProviderStateChangedBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSenseDataProviderStateChangedBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSenseDataProviderStateChangedBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataSenseDataProviderStateChangedBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSenseDataProviderStateChangedBD.NEXT); }
    /** Unsafe version of {@link #provider}. */
    public static long nprovider(long struct) { return memGetAddress(struct + XrEventDataSenseDataProviderStateChangedBD.PROVIDER); }
    /** Unsafe version of {@link #newState}. */
    public static int nnewState(long struct) { return memGetInt(struct + XrEventDataSenseDataProviderStateChangedBD.NEWSTATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataSenseDataProviderStateChangedBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSenseDataProviderStateChangedBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSenseDataProviderStateChangedBD} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSenseDataProviderStateChangedBD, Buffer> implements NativeResource {

        private static final XrEventDataSenseDataProviderStateChangedBD ELEMENT_FACTORY = XrEventDataSenseDataProviderStateChangedBD.create(-1L);

        /**
         * Creates a new {@code XrEventDataSenseDataProviderStateChangedBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSenseDataProviderStateChangedBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSenseDataProviderStateChangedBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSenseDataProviderStateChangedBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSenseDataProviderStateChangedBD.nnext(address()); }
        /** @return the value of the {@code provider} field. */
        @NativeType("XrSenseDataProviderBD")
        public long provider() { return XrEventDataSenseDataProviderStateChangedBD.nprovider(address()); }
        /** @return the value of the {@code newState} field. */
        @NativeType("XrSenseDataProviderStateBD")
        public int newState() { return XrEventDataSenseDataProviderStateChangedBD.nnewState(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSenseDataProviderStateChangedBD.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSenseDataProviderStateChangedBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD} value to the {@code type} field. */
        public XrEventDataSenseDataProviderStateChangedBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSenseDataProviderStateChangedBD.Buffer next(@NativeType("void const *") long value) { XrEventDataSenseDataProviderStateChangedBD.nnext(address(), value); return this; }

    }

}