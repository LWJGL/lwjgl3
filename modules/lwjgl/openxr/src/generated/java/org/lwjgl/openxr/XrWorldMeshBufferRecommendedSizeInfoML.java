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
 * struct XrWorldMeshBufferRecommendedSizeInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t maxBlockCount;
 * }}</pre>
 */
public class XrWorldMeshBufferRecommendedSizeInfoML extends Struct<XrWorldMeshBufferRecommendedSizeInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MAXBLOCKCOUNT;

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
        MAXBLOCKCOUNT = layout.offsetof(2);
    }

    protected XrWorldMeshBufferRecommendedSizeInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshBufferRecommendedSizeInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshBufferRecommendedSizeInfoML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshBufferRecommendedSizeInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshBufferRecommendedSizeInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code maxBlockCount} field. */
    @NativeType("uint32_t")
    public int maxBlockCount() { return nmaxBlockCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrWorldMeshBufferRecommendedSizeInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML} value to the {@code type} field. */
    public XrWorldMeshBufferRecommendedSizeInfoML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrWorldMeshBufferRecommendedSizeInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code maxBlockCount} field. */
    public XrWorldMeshBufferRecommendedSizeInfoML maxBlockCount(@NativeType("uint32_t") int value) { nmaxBlockCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshBufferRecommendedSizeInfoML set(
        int type,
        long next,
        int maxBlockCount
    ) {
        type(type);
        next(next);
        maxBlockCount(maxBlockCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshBufferRecommendedSizeInfoML set(XrWorldMeshBufferRecommendedSizeInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshBufferRecommendedSizeInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBufferRecommendedSizeInfoML malloc() {
        return new XrWorldMeshBufferRecommendedSizeInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBufferRecommendedSizeInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBufferRecommendedSizeInfoML calloc() {
        return new XrWorldMeshBufferRecommendedSizeInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBufferRecommendedSizeInfoML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshBufferRecommendedSizeInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshBufferRecommendedSizeInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshBufferRecommendedSizeInfoML} instance for the specified memory address. */
    public static XrWorldMeshBufferRecommendedSizeInfoML create(long address) {
        return new XrWorldMeshBufferRecommendedSizeInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshBufferRecommendedSizeInfoML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshBufferRecommendedSizeInfoML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferRecommendedSizeInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferRecommendedSizeInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferRecommendedSizeInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferRecommendedSizeInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferRecommendedSizeInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferRecommendedSizeInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshBufferRecommendedSizeInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferRecommendedSizeInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshBufferRecommendedSizeInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshBufferRecommendedSizeInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBufferRecommendedSizeInfoML malloc(MemoryStack stack) {
        return new XrWorldMeshBufferRecommendedSizeInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshBufferRecommendedSizeInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBufferRecommendedSizeInfoML calloc(MemoryStack stack) {
        return new XrWorldMeshBufferRecommendedSizeInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferRecommendedSizeInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferRecommendedSizeInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferRecommendedSizeInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferRecommendedSizeInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshBufferRecommendedSizeInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshBufferRecommendedSizeInfoML.NEXT); }
    /** Unsafe version of {@link #maxBlockCount}. */
    public static int nmaxBlockCount(long struct) { return memGetInt(struct + XrWorldMeshBufferRecommendedSizeInfoML.MAXBLOCKCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshBufferRecommendedSizeInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshBufferRecommendedSizeInfoML.NEXT, value); }
    /** Unsafe version of {@link #maxBlockCount(int) maxBlockCount}. */
    public static void nmaxBlockCount(long struct, int value) { memPutInt(struct + XrWorldMeshBufferRecommendedSizeInfoML.MAXBLOCKCOUNT, value); }

    // -----------------------------------

    /** An array of {@link XrWorldMeshBufferRecommendedSizeInfoML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshBufferRecommendedSizeInfoML, Buffer> implements NativeResource {

        private static final XrWorldMeshBufferRecommendedSizeInfoML ELEMENT_FACTORY = XrWorldMeshBufferRecommendedSizeInfoML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshBufferRecommendedSizeInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshBufferRecommendedSizeInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshBufferRecommendedSizeInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshBufferRecommendedSizeInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrWorldMeshBufferRecommendedSizeInfoML.nnext(address()); }
        /** @return the value of the {@code maxBlockCount} field. */
        @NativeType("uint32_t")
        public int maxBlockCount() { return XrWorldMeshBufferRecommendedSizeInfoML.nmaxBlockCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrWorldMeshBufferRecommendedSizeInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshBufferRecommendedSizeInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML} value to the {@code type} field. */
        public XrWorldMeshBufferRecommendedSizeInfoML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrWorldMeshBufferRecommendedSizeInfoML.Buffer next(@NativeType("void const *") long value) { XrWorldMeshBufferRecommendedSizeInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code maxBlockCount} field. */
        public XrWorldMeshBufferRecommendedSizeInfoML.Buffer maxBlockCount(@NativeType("uint32_t") int value) { XrWorldMeshBufferRecommendedSizeInfoML.nmaxBlockCount(address(), value); return this; }

    }

}