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
 * struct XrBodyTrackingPostureDataBD {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t postureCount;
 *     XrBodyTrackingPostureBD * postureData;
 * }}</pre>
 */
public class XrBodyTrackingPostureDataBD extends Struct<XrBodyTrackingPostureDataBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        POSTURECOUNT,
        POSTUREDATA;

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
        POSTURECOUNT = layout.offsetof(2);
        POSTUREDATA = layout.offsetof(3);
    }

    protected XrBodyTrackingPostureDataBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackingPostureDataBD create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackingPostureDataBD(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackingPostureDataBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackingPostureDataBD(ByteBuffer container) {
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
    /** @return the value of the {@code postureCount} field. */
    @NativeType("uint32_t")
    public int postureCount() { return npostureCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code postureData} field. */
    @NativeType("XrBodyTrackingPostureBD *")
    public IntBuffer postureData() { return npostureData(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyTrackingPostureDataBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDBodyTrackingAuxiliaryMetrics#XR_TYPE_BODY_TRACKING_POSTURE_DATA_BD TYPE_BODY_TRACKING_POSTURE_DATA_BD} value to the {@code type} field. */
    public XrBodyTrackingPostureDataBD type$Default() { return type(BDBodyTrackingAuxiliaryMetrics.XR_TYPE_BODY_TRACKING_POSTURE_DATA_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyTrackingPostureDataBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code postureData} field. */
    public XrBodyTrackingPostureDataBD postureData(@NativeType("XrBodyTrackingPostureBD *") IntBuffer value) { npostureData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackingPostureDataBD set(
        int type,
        long next,
        IntBuffer postureData
    ) {
        type(type);
        next(next);
        postureData(postureData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyTrackingPostureDataBD set(XrBodyTrackingPostureDataBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackingPostureDataBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingPostureDataBD malloc() {
        return new XrBodyTrackingPostureDataBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingPostureDataBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingPostureDataBD calloc() {
        return new XrBodyTrackingPostureDataBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingPostureDataBD} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackingPostureDataBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackingPostureDataBD(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackingPostureDataBD} instance for the specified memory address. */
    public static XrBodyTrackingPostureDataBD create(long address) {
        return new XrBodyTrackingPostureDataBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyTrackingPostureDataBD createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackingPostureDataBD(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackingPostureDataBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingPostureDataBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingPostureDataBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingPostureDataBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingPostureDataBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingPostureDataBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackingPostureDataBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingPostureDataBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyTrackingPostureDataBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackingPostureDataBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingPostureDataBD malloc(MemoryStack stack) {
        return new XrBodyTrackingPostureDataBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackingPostureDataBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingPostureDataBD calloc(MemoryStack stack) {
        return new XrBodyTrackingPostureDataBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackingPostureDataBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingPostureDataBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingPostureDataBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingPostureDataBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyTrackingPostureDataBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackingPostureDataBD.NEXT); }
    /** Unsafe version of {@link #postureCount}. */
    public static int npostureCount(long struct) { return memGetInt(struct + XrBodyTrackingPostureDataBD.POSTURECOUNT); }
    /** Unsafe version of {@link #postureData() postureData}. */
    public static IntBuffer npostureData(long struct) { return memIntBuffer(memGetAddress(struct + XrBodyTrackingPostureDataBD.POSTUREDATA), npostureCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyTrackingPostureDataBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackingPostureDataBD.NEXT, value); }
    /** Sets the specified value to the {@code postureCount} field of the specified {@code struct}. */
    public static void npostureCount(long struct, int value) { memPutInt(struct + XrBodyTrackingPostureDataBD.POSTURECOUNT, value); }
    /** Unsafe version of {@link #postureData(IntBuffer) postureData}. */
    public static void npostureData(long struct, IntBuffer value) { memPutAddress(struct + XrBodyTrackingPostureDataBD.POSTUREDATA, memAddress(value)); npostureCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodyTrackingPostureDataBD.POSTUREDATA));
    }

    // -----------------------------------

    /** An array of {@link XrBodyTrackingPostureDataBD} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackingPostureDataBD, Buffer> implements NativeResource {

        private static final XrBodyTrackingPostureDataBD ELEMENT_FACTORY = XrBodyTrackingPostureDataBD.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackingPostureDataBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackingPostureDataBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackingPostureDataBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackingPostureDataBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodyTrackingPostureDataBD.nnext(address()); }
        /** @return the value of the {@code postureCount} field. */
        @NativeType("uint32_t")
        public int postureCount() { return XrBodyTrackingPostureDataBD.npostureCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code postureData} field. */
        @NativeType("XrBodyTrackingPostureBD *")
        public IntBuffer postureData() { return XrBodyTrackingPostureDataBD.npostureData(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyTrackingPostureDataBD.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackingPostureDataBD.ntype(address(), value); return this; }
        /** Sets the {@link BDBodyTrackingAuxiliaryMetrics#XR_TYPE_BODY_TRACKING_POSTURE_DATA_BD TYPE_BODY_TRACKING_POSTURE_DATA_BD} value to the {@code type} field. */
        public XrBodyTrackingPostureDataBD.Buffer type$Default() { return type(BDBodyTrackingAuxiliaryMetrics.XR_TYPE_BODY_TRACKING_POSTURE_DATA_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyTrackingPostureDataBD.Buffer next(@NativeType("void *") long value) { XrBodyTrackingPostureDataBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code postureData} field. */
        public XrBodyTrackingPostureDataBD.Buffer postureData(@NativeType("XrBodyTrackingPostureBD *") IntBuffer value) { XrBodyTrackingPostureDataBD.npostureData(address(), value); return this; }

    }

}