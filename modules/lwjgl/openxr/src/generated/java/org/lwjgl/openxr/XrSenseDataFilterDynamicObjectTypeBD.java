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
 * struct XrSenseDataFilterDynamicObjectTypeBD {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t typeCount;
 *     XrDynamicObjectTypeBD const * types;
 * }}</pre>
 */
public class XrSenseDataFilterDynamicObjectTypeBD extends Struct<XrSenseDataFilterDynamicObjectTypeBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TYPECOUNT,
        TYPES;

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
        TYPECOUNT = layout.offsetof(2);
        TYPES = layout.offsetof(3);
    }

    protected XrSenseDataFilterDynamicObjectTypeBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataFilterDynamicObjectTypeBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataFilterDynamicObjectTypeBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataFilterDynamicObjectTypeBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataFilterDynamicObjectTypeBD(ByteBuffer container) {
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
    /** @return the value of the {@code typeCount} field. */
    @NativeType("uint32_t")
    public int typeCount() { return ntypeCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code types} field. */
    @NativeType("XrDynamicObjectTypeBD const *")
    public IntBuffer types() { return ntypes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSenseDataFilterDynamicObjectTypeBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDDynamicObjectTracking#XR_TYPE_SENSE_DATA_FILTER_DYNAMIC_OBJECT_TYPE_BD TYPE_SENSE_DATA_FILTER_DYNAMIC_OBJECT_TYPE_BD} value to the {@code type} field. */
    public XrSenseDataFilterDynamicObjectTypeBD type$Default() { return type(BDDynamicObjectTracking.XR_TYPE_SENSE_DATA_FILTER_DYNAMIC_OBJECT_TYPE_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataFilterDynamicObjectTypeBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code types} field. */
    public XrSenseDataFilterDynamicObjectTypeBD types(@NativeType("XrDynamicObjectTypeBD const *") IntBuffer value) { ntypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSenseDataFilterDynamicObjectTypeBD set(
        int type,
        long next,
        IntBuffer types
    ) {
        type(type);
        next(next);
        types(types);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSenseDataFilterDynamicObjectTypeBD set(XrSenseDataFilterDynamicObjectTypeBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataFilterDynamicObjectTypeBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataFilterDynamicObjectTypeBD malloc() {
        return new XrSenseDataFilterDynamicObjectTypeBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataFilterDynamicObjectTypeBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataFilterDynamicObjectTypeBD calloc() {
        return new XrSenseDataFilterDynamicObjectTypeBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataFilterDynamicObjectTypeBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataFilterDynamicObjectTypeBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataFilterDynamicObjectTypeBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataFilterDynamicObjectTypeBD} instance for the specified memory address. */
    public static XrSenseDataFilterDynamicObjectTypeBD create(long address) {
        return new XrSenseDataFilterDynamicObjectTypeBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataFilterDynamicObjectTypeBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataFilterDynamicObjectTypeBD(address, null);
    }

    /**
     * Returns a new {@link XrSenseDataFilterDynamicObjectTypeBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterDynamicObjectTypeBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterDynamicObjectTypeBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterDynamicObjectTypeBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterDynamicObjectTypeBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterDynamicObjectTypeBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataFilterDynamicObjectTypeBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterDynamicObjectTypeBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataFilterDynamicObjectTypeBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSenseDataFilterDynamicObjectTypeBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataFilterDynamicObjectTypeBD malloc(MemoryStack stack) {
        return new XrSenseDataFilterDynamicObjectTypeBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataFilterDynamicObjectTypeBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataFilterDynamicObjectTypeBD calloc(MemoryStack stack) {
        return new XrSenseDataFilterDynamicObjectTypeBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataFilterDynamicObjectTypeBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterDynamicObjectTypeBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterDynamicObjectTypeBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterDynamicObjectTypeBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataFilterDynamicObjectTypeBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataFilterDynamicObjectTypeBD.NEXT); }
    /** Unsafe version of {@link #typeCount}. */
    public static int ntypeCount(long struct) { return memGetInt(struct + XrSenseDataFilterDynamicObjectTypeBD.TYPECOUNT); }
    /** Unsafe version of {@link #types() types}. */
    public static IntBuffer ntypes(long struct) { return memIntBuffer(memGetAddress(struct + XrSenseDataFilterDynamicObjectTypeBD.TYPES), ntypeCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataFilterDynamicObjectTypeBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataFilterDynamicObjectTypeBD.NEXT, value); }
    /** Sets the specified value to the {@code typeCount} field of the specified {@code struct}. */
    public static void ntypeCount(long struct, int value) { memPutInt(struct + XrSenseDataFilterDynamicObjectTypeBD.TYPECOUNT, value); }
    /** Unsafe version of {@link #types(IntBuffer) types}. */
    public static void ntypes(long struct, IntBuffer value) { memPutAddress(struct + XrSenseDataFilterDynamicObjectTypeBD.TYPES, memAddress(value)); ntypeCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSenseDataFilterDynamicObjectTypeBD.TYPES));
    }

    // -----------------------------------

    /** An array of {@link XrSenseDataFilterDynamicObjectTypeBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataFilterDynamicObjectTypeBD, Buffer> implements NativeResource {

        private static final XrSenseDataFilterDynamicObjectTypeBD ELEMENT_FACTORY = XrSenseDataFilterDynamicObjectTypeBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataFilterDynamicObjectTypeBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataFilterDynamicObjectTypeBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataFilterDynamicObjectTypeBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataFilterDynamicObjectTypeBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSenseDataFilterDynamicObjectTypeBD.nnext(address()); }
        /** @return the value of the {@code typeCount} field. */
        @NativeType("uint32_t")
        public int typeCount() { return XrSenseDataFilterDynamicObjectTypeBD.ntypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code types} field. */
        @NativeType("XrDynamicObjectTypeBD const *")
        public IntBuffer types() { return XrSenseDataFilterDynamicObjectTypeBD.ntypes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataFilterDynamicObjectTypeBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataFilterDynamicObjectTypeBD.ntype(address(), value); return this; }
        /** Sets the {@link BDDynamicObjectTracking#XR_TYPE_SENSE_DATA_FILTER_DYNAMIC_OBJECT_TYPE_BD TYPE_SENSE_DATA_FILTER_DYNAMIC_OBJECT_TYPE_BD} value to the {@code type} field. */
        public XrSenseDataFilterDynamicObjectTypeBD.Buffer type$Default() { return type(BDDynamicObjectTracking.XR_TYPE_SENSE_DATA_FILTER_DYNAMIC_OBJECT_TYPE_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataFilterDynamicObjectTypeBD.Buffer next(@NativeType("void const *") long value) { XrSenseDataFilterDynamicObjectTypeBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code types} field. */
        public XrSenseDataFilterDynamicObjectTypeBD.Buffer types(@NativeType("XrDynamicObjectTypeBD const *") IntBuffer value) { XrSenseDataFilterDynamicObjectTypeBD.ntypes(address(), value); return this; }

    }

}