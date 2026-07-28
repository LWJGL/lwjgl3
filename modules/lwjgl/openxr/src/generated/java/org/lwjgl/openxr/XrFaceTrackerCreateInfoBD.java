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
 * struct XrFaceTrackerCreateInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrFacialSimulationModeBD mode;
 * }}</pre>
 */
public class XrFaceTrackerCreateInfoBD extends Struct<XrFaceTrackerCreateInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MODE;

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
        MODE = layout.offsetof(2);
    }

    protected XrFaceTrackerCreateInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceTrackerCreateInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrFaceTrackerCreateInfoBD(address, container);
    }

    /**
     * Creates a {@code XrFaceTrackerCreateInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceTrackerCreateInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code mode} field. */
    @NativeType("XrFacialSimulationModeBD")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFaceTrackerCreateInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDFacialSimulation#XR_TYPE_FACE_TRACKER_CREATE_INFO_BD TYPE_FACE_TRACKER_CREATE_INFO_BD} value to the {@code type} field. */
    public XrFaceTrackerCreateInfoBD type$Default() { return type(BDFacialSimulation.XR_TYPE_FACE_TRACKER_CREATE_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrFaceTrackerCreateInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public XrFaceTrackerCreateInfoBD mode(@NativeType("XrFacialSimulationModeBD") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceTrackerCreateInfoBD set(
        int type,
        long next,
        int mode
    ) {
        type(type);
        next(next);
        mode(mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFaceTrackerCreateInfoBD set(XrFaceTrackerCreateInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceTrackerCreateInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceTrackerCreateInfoBD malloc() {
        return new XrFaceTrackerCreateInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceTrackerCreateInfoBD calloc() {
        return new XrFaceTrackerCreateInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrFaceTrackerCreateInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceTrackerCreateInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfoBD} instance for the specified memory address. */
    public static XrFaceTrackerCreateInfoBD create(long address) {
        return new XrFaceTrackerCreateInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFaceTrackerCreateInfoBD createSafe(long address) {
        return address == NULL ? null : new XrFaceTrackerCreateInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceTrackerCreateInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFaceTrackerCreateInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceTrackerCreateInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceTrackerCreateInfoBD malloc(MemoryStack stack) {
        return new XrFaceTrackerCreateInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceTrackerCreateInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceTrackerCreateInfoBD calloc(MemoryStack stack) {
        return new XrFaceTrackerCreateInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFaceTrackerCreateInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceTrackerCreateInfoBD.NEXT); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + XrFaceTrackerCreateInfoBD.MODE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFaceTrackerCreateInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceTrackerCreateInfoBD.NEXT, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + XrFaceTrackerCreateInfoBD.MODE, value); }

    // -----------------------------------

    /** An array of {@link XrFaceTrackerCreateInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrFaceTrackerCreateInfoBD, Buffer> implements NativeResource {

        private static final XrFaceTrackerCreateInfoBD ELEMENT_FACTORY = XrFaceTrackerCreateInfoBD.create(-1L);

        /**
         * Creates a new {@code XrFaceTrackerCreateInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceTrackerCreateInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceTrackerCreateInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceTrackerCreateInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFaceTrackerCreateInfoBD.nnext(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("XrFacialSimulationModeBD")
        public int mode() { return XrFaceTrackerCreateInfoBD.nmode(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFaceTrackerCreateInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrFaceTrackerCreateInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDFacialSimulation#XR_TYPE_FACE_TRACKER_CREATE_INFO_BD TYPE_FACE_TRACKER_CREATE_INFO_BD} value to the {@code type} field. */
        public XrFaceTrackerCreateInfoBD.Buffer type$Default() { return type(BDFacialSimulation.XR_TYPE_FACE_TRACKER_CREATE_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrFaceTrackerCreateInfoBD.Buffer next(@NativeType("void const *") long value) { XrFaceTrackerCreateInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public XrFaceTrackerCreateInfoBD.Buffer mode(@NativeType("XrFacialSimulationModeBD") int value) { XrFaceTrackerCreateInfoBD.nmode(address(), value); return this; }

    }

}