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
 * struct XrSpatialComponentSubsumedByListANDROID {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t subsumedUniqueIdCount;
 *     XrSpatialEntityIdEXT * subsumedUniqueIds;
 * }}</pre>
 */
public class XrSpatialComponentSubsumedByListANDROID extends Struct<XrSpatialComponentSubsumedByListANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUBSUMEDUNIQUEIDCOUNT,
        SUBSUMEDUNIQUEIDS;

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
        SUBSUMEDUNIQUEIDCOUNT = layout.offsetof(2);
        SUBSUMEDUNIQUEIDS = layout.offsetof(3);
    }

    protected XrSpatialComponentSubsumedByListANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentSubsumedByListANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentSubsumedByListANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentSubsumedByListANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentSubsumedByListANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code subsumedUniqueIdCount} field. */
    @NativeType("uint32_t")
    public int subsumedUniqueIdCount() { return nsubsumedUniqueIdCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code subsumedUniqueIds} field. */
    @NativeType("XrSpatialEntityIdEXT *")
    public LongBuffer subsumedUniqueIds() { return nsubsumedUniqueIds(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentSubsumedByListANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialComponentSubsumedBy#XR_TYPE_SPATIAL_COMPONENT_SUBSUMED_BY_LIST_ANDROID TYPE_SPATIAL_COMPONENT_SUBSUMED_BY_LIST_ANDROID} value to the {@code type} field. */
    public XrSpatialComponentSubsumedByListANDROID type$Default() { return type(ANDROIDSpatialComponentSubsumedBy.XR_TYPE_SPATIAL_COMPONENT_SUBSUMED_BY_LIST_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentSubsumedByListANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code subsumedUniqueIds} field. */
    public XrSpatialComponentSubsumedByListANDROID subsumedUniqueIds(@NativeType("XrSpatialEntityIdEXT *") LongBuffer value) { nsubsumedUniqueIds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentSubsumedByListANDROID set(
        int type,
        long next,
        LongBuffer subsumedUniqueIds
    ) {
        type(type);
        next(next);
        subsumedUniqueIds(subsumedUniqueIds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentSubsumedByListANDROID set(XrSpatialComponentSubsumedByListANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentSubsumedByListANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentSubsumedByListANDROID malloc() {
        return new XrSpatialComponentSubsumedByListANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentSubsumedByListANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentSubsumedByListANDROID calloc() {
        return new XrSpatialComponentSubsumedByListANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentSubsumedByListANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentSubsumedByListANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentSubsumedByListANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentSubsumedByListANDROID} instance for the specified memory address. */
    public static XrSpatialComponentSubsumedByListANDROID create(long address) {
        return new XrSpatialComponentSubsumedByListANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentSubsumedByListANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentSubsumedByListANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentSubsumedByListANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentSubsumedByListANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentSubsumedByListANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentSubsumedByListANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentSubsumedByListANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentSubsumedByListANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentSubsumedByListANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentSubsumedByListANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentSubsumedByListANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentSubsumedByListANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentSubsumedByListANDROID malloc(MemoryStack stack) {
        return new XrSpatialComponentSubsumedByListANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentSubsumedByListANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentSubsumedByListANDROID calloc(MemoryStack stack) {
        return new XrSpatialComponentSubsumedByListANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentSubsumedByListANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentSubsumedByListANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentSubsumedByListANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentSubsumedByListANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentSubsumedByListANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentSubsumedByListANDROID.NEXT); }
    /** Unsafe version of {@link #subsumedUniqueIdCount}. */
    public static int nsubsumedUniqueIdCount(long struct) { return memGetInt(struct + XrSpatialComponentSubsumedByListANDROID.SUBSUMEDUNIQUEIDCOUNT); }
    /** Unsafe version of {@link #subsumedUniqueIds() subsumedUniqueIds}. */
    public static LongBuffer nsubsumedUniqueIds(long struct) { return memLongBuffer(memGetAddress(struct + XrSpatialComponentSubsumedByListANDROID.SUBSUMEDUNIQUEIDS), nsubsumedUniqueIdCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentSubsumedByListANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentSubsumedByListANDROID.NEXT, value); }
    /** Sets the specified value to the {@code subsumedUniqueIdCount} field of the specified {@code struct}. */
    public static void nsubsumedUniqueIdCount(long struct, int value) { memPutInt(struct + XrSpatialComponentSubsumedByListANDROID.SUBSUMEDUNIQUEIDCOUNT, value); }
    /** Unsafe version of {@link #subsumedUniqueIds(LongBuffer) subsumedUniqueIds}. */
    public static void nsubsumedUniqueIds(long struct, LongBuffer value) { memPutAddress(struct + XrSpatialComponentSubsumedByListANDROID.SUBSUMEDUNIQUEIDS, memAddress(value)); nsubsumedUniqueIdCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentSubsumedByListANDROID.SUBSUMEDUNIQUEIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentSubsumedByListANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentSubsumedByListANDROID, Buffer> implements NativeResource {

        private static final XrSpatialComponentSubsumedByListANDROID ELEMENT_FACTORY = XrSpatialComponentSubsumedByListANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentSubsumedByListANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentSubsumedByListANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentSubsumedByListANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentSubsumedByListANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentSubsumedByListANDROID.nnext(address()); }
        /** @return the value of the {@code subsumedUniqueIdCount} field. */
        @NativeType("uint32_t")
        public int subsumedUniqueIdCount() { return XrSpatialComponentSubsumedByListANDROID.nsubsumedUniqueIdCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code subsumedUniqueIds} field. */
        @NativeType("XrSpatialEntityIdEXT *")
        public LongBuffer subsumedUniqueIds() { return XrSpatialComponentSubsumedByListANDROID.nsubsumedUniqueIds(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentSubsumedByListANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentSubsumedByListANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialComponentSubsumedBy#XR_TYPE_SPATIAL_COMPONENT_SUBSUMED_BY_LIST_ANDROID TYPE_SPATIAL_COMPONENT_SUBSUMED_BY_LIST_ANDROID} value to the {@code type} field. */
        public XrSpatialComponentSubsumedByListANDROID.Buffer type$Default() { return type(ANDROIDSpatialComponentSubsumedBy.XR_TYPE_SPATIAL_COMPONENT_SUBSUMED_BY_LIST_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentSubsumedByListANDROID.Buffer next(@NativeType("void *") long value) { XrSpatialComponentSubsumedByListANDROID.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code subsumedUniqueIds} field. */
        public XrSpatialComponentSubsumedByListANDROID.Buffer subsumedUniqueIds(@NativeType("XrSpatialEntityIdEXT *") LongBuffer value) { XrSpatialComponentSubsumedByListANDROID.nsubsumedUniqueIds(address(), value); return this; }

    }

}