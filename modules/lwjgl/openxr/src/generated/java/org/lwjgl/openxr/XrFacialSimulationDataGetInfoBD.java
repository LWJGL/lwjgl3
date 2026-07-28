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
 * struct XrFacialSimulationDataGetInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrTime time;
 * }}</pre>
 */
public class XrFacialSimulationDataGetInfoBD extends Struct<XrFacialSimulationDataGetInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TIME = layout.offsetof(2);
    }

    protected XrFacialSimulationDataGetInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFacialSimulationDataGetInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrFacialSimulationDataGetInfoBD(address, container);
    }

    /**
     * Creates a {@code XrFacialSimulationDataGetInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFacialSimulationDataGetInfoBD(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrFacialSimulationDataGetInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDFacialSimulation#XR_TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD} value to the {@code type} field. */
    public XrFacialSimulationDataGetInfoBD type$Default() { return type(BDFacialSimulation.XR_TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrFacialSimulationDataGetInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrFacialSimulationDataGetInfoBD time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFacialSimulationDataGetInfoBD set(
        int type,
        long next,
        long time
    ) {
        type(type);
        next(next);
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
    public XrFacialSimulationDataGetInfoBD set(XrFacialSimulationDataGetInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFacialSimulationDataGetInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFacialSimulationDataGetInfoBD malloc() {
        return new XrFacialSimulationDataGetInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFacialSimulationDataGetInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFacialSimulationDataGetInfoBD calloc() {
        return new XrFacialSimulationDataGetInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFacialSimulationDataGetInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrFacialSimulationDataGetInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFacialSimulationDataGetInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrFacialSimulationDataGetInfoBD} instance for the specified memory address. */
    public static XrFacialSimulationDataGetInfoBD create(long address) {
        return new XrFacialSimulationDataGetInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFacialSimulationDataGetInfoBD createSafe(long address) {
        return address == NULL ? null : new XrFacialSimulationDataGetInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataGetInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataGetInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataGetInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataGetInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataGetInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataGetInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFacialSimulationDataGetInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataGetInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFacialSimulationDataGetInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFacialSimulationDataGetInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialSimulationDataGetInfoBD malloc(MemoryStack stack) {
        return new XrFacialSimulationDataGetInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFacialSimulationDataGetInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialSimulationDataGetInfoBD calloc(MemoryStack stack) {
        return new XrFacialSimulationDataGetInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataGetInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataGetInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataGetInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataGetInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFacialSimulationDataGetInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFacialSimulationDataGetInfoBD.NEXT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrFacialSimulationDataGetInfoBD.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFacialSimulationDataGetInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFacialSimulationDataGetInfoBD.NEXT, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrFacialSimulationDataGetInfoBD.TIME, value); }

    // -----------------------------------

    /** An array of {@link XrFacialSimulationDataGetInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrFacialSimulationDataGetInfoBD, Buffer> implements NativeResource {

        private static final XrFacialSimulationDataGetInfoBD ELEMENT_FACTORY = XrFacialSimulationDataGetInfoBD.create(-1L);

        /**
         * Creates a new {@code XrFacialSimulationDataGetInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFacialSimulationDataGetInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFacialSimulationDataGetInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFacialSimulationDataGetInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFacialSimulationDataGetInfoBD.nnext(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrFacialSimulationDataGetInfoBD.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFacialSimulationDataGetInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrFacialSimulationDataGetInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDFacialSimulation#XR_TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD} value to the {@code type} field. */
        public XrFacialSimulationDataGetInfoBD.Buffer type$Default() { return type(BDFacialSimulation.XR_TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrFacialSimulationDataGetInfoBD.Buffer next(@NativeType("void const *") long value) { XrFacialSimulationDataGetInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrFacialSimulationDataGetInfoBD.Buffer time(@NativeType("XrTime") long value) { XrFacialSimulationDataGetInfoBD.ntime(address(), value); return this; }

    }

}