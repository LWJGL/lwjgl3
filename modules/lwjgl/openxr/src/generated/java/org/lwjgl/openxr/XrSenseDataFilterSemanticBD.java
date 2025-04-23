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
 * struct XrSenseDataFilterSemanticBD {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t labelCount;
 *     XrSemanticLabelBD const * labels;
 * }}</pre>
 */
public class XrSenseDataFilterSemanticBD extends Struct<XrSenseDataFilterSemanticBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LABELCOUNT,
        LABELS;

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
        LABELCOUNT = layout.offsetof(2);
        LABELS = layout.offsetof(3);
    }

    protected XrSenseDataFilterSemanticBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataFilterSemanticBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataFilterSemanticBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataFilterSemanticBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataFilterSemanticBD(ByteBuffer container) {
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
    /** @return the value of the {@code labelCount} field. */
    @NativeType("uint32_t")
    public int labelCount() { return nlabelCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code labels} field. */
    @NativeType("XrSemanticLabelBD const *")
    public IntBuffer labels() { return nlabels(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSenseDataFilterSemanticBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_FILTER_SEMANTIC_BD TYPE_SENSE_DATA_FILTER_SEMANTIC_BD} value to the {@code type} field. */
    public XrSenseDataFilterSemanticBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_FILTER_SEMANTIC_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataFilterSemanticBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code labels} field. */
    public XrSenseDataFilterSemanticBD labels(@NativeType("XrSemanticLabelBD const *") IntBuffer value) { nlabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSenseDataFilterSemanticBD set(
        int type,
        long next,
        IntBuffer labels
    ) {
        type(type);
        next(next);
        labels(labels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSenseDataFilterSemanticBD set(XrSenseDataFilterSemanticBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataFilterSemanticBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataFilterSemanticBD malloc() {
        return new XrSenseDataFilterSemanticBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataFilterSemanticBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataFilterSemanticBD calloc() {
        return new XrSenseDataFilterSemanticBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataFilterSemanticBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataFilterSemanticBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataFilterSemanticBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataFilterSemanticBD} instance for the specified memory address. */
    public static XrSenseDataFilterSemanticBD create(long address) {
        return new XrSenseDataFilterSemanticBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataFilterSemanticBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataFilterSemanticBD(address, null);
    }

    /**
     * Returns a new {@link XrSenseDataFilterSemanticBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterSemanticBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterSemanticBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterSemanticBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterSemanticBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterSemanticBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataFilterSemanticBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterSemanticBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataFilterSemanticBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSenseDataFilterSemanticBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataFilterSemanticBD malloc(MemoryStack stack) {
        return new XrSenseDataFilterSemanticBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataFilterSemanticBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataFilterSemanticBD calloc(MemoryStack stack) {
        return new XrSenseDataFilterSemanticBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataFilterSemanticBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterSemanticBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterSemanticBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterSemanticBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataFilterSemanticBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataFilterSemanticBD.NEXT); }
    /** Unsafe version of {@link #labelCount}. */
    public static int nlabelCount(long struct) { return memGetInt(struct + XrSenseDataFilterSemanticBD.LABELCOUNT); }
    /** Unsafe version of {@link #labels() labels}. */
    public static IntBuffer nlabels(long struct) { return memIntBuffer(memGetAddress(struct + XrSenseDataFilterSemanticBD.LABELS), nlabelCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataFilterSemanticBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataFilterSemanticBD.NEXT, value); }
    /** Sets the specified value to the {@code labelCount} field of the specified {@code struct}. */
    public static void nlabelCount(long struct, int value) { memPutInt(struct + XrSenseDataFilterSemanticBD.LABELCOUNT, value); }
    /** Unsafe version of {@link #labels(IntBuffer) labels}. */
    public static void nlabels(long struct, IntBuffer value) { memPutAddress(struct + XrSenseDataFilterSemanticBD.LABELS, memAddress(value)); nlabelCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSenseDataFilterSemanticBD.LABELS));
    }

    // -----------------------------------

    /** An array of {@link XrSenseDataFilterSemanticBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataFilterSemanticBD, Buffer> implements NativeResource {

        private static final XrSenseDataFilterSemanticBD ELEMENT_FACTORY = XrSenseDataFilterSemanticBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataFilterSemanticBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataFilterSemanticBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataFilterSemanticBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataFilterSemanticBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSenseDataFilterSemanticBD.nnext(address()); }
        /** @return the value of the {@code labelCount} field. */
        @NativeType("uint32_t")
        public int labelCount() { return XrSenseDataFilterSemanticBD.nlabelCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code labels} field. */
        @NativeType("XrSemanticLabelBD const *")
        public IntBuffer labels() { return XrSenseDataFilterSemanticBD.nlabels(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataFilterSemanticBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataFilterSemanticBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_FILTER_SEMANTIC_BD TYPE_SENSE_DATA_FILTER_SEMANTIC_BD} value to the {@code type} field. */
        public XrSenseDataFilterSemanticBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_FILTER_SEMANTIC_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataFilterSemanticBD.Buffer next(@NativeType("void const *") long value) { XrSenseDataFilterSemanticBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code labels} field. */
        public XrSenseDataFilterSemanticBD.Buffer labels(@NativeType("XrSemanticLabelBD const *") IntBuffer value) { XrSenseDataFilterSemanticBD.nlabels(address(), value); return this; }

    }

}