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
 * struct XrWorldMeshBufferML {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t bufferSize;
 *     void * buffer;
 * }}</pre>
 */
public class XrWorldMeshBufferML extends Struct<XrWorldMeshBufferML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BUFFERSIZE,
        BUFFER;

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
        BUFFERSIZE = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
    }

    protected XrWorldMeshBufferML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshBufferML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshBufferML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshBufferML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshBufferML(ByteBuffer container) {
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
    /** @return the value of the {@code bufferSize} field. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("void *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrWorldMeshBufferML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BUFFER_ML TYPE_WORLD_MESH_BUFFER_ML} value to the {@code type} field. */
    public XrWorldMeshBufferML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BUFFER_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrWorldMeshBufferML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
    public XrWorldMeshBufferML buffer(@NativeType("void *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshBufferML set(
        int type,
        long next,
        ByteBuffer buffer
    ) {
        type(type);
        next(next);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshBufferML set(XrWorldMeshBufferML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshBufferML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBufferML malloc() {
        return new XrWorldMeshBufferML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBufferML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBufferML calloc() {
        return new XrWorldMeshBufferML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBufferML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshBufferML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshBufferML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshBufferML} instance for the specified memory address. */
    public static XrWorldMeshBufferML create(long address) {
        return new XrWorldMeshBufferML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshBufferML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshBufferML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshBufferML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshBufferML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshBufferML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBufferML malloc(MemoryStack stack) {
        return new XrWorldMeshBufferML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshBufferML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBufferML calloc(MemoryStack stack) {
        return new XrWorldMeshBufferML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshBufferML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshBufferML.NEXT); }
    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return memGetInt(struct + XrWorldMeshBufferML.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(memGetAddress(struct + XrWorldMeshBufferML.BUFFER), nbufferSize(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshBufferML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshBufferML.NEXT, value); }
    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { memPutInt(struct + XrWorldMeshBufferML.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, ByteBuffer value) { memPutAddress(struct + XrWorldMeshBufferML.BUFFER, memAddress(value)); nbufferSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrWorldMeshBufferML.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link XrWorldMeshBufferML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshBufferML, Buffer> implements NativeResource {

        private static final XrWorldMeshBufferML ELEMENT_FACTORY = XrWorldMeshBufferML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshBufferML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshBufferML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshBufferML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshBufferML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshBufferML.nnext(address()); }
        /** @return the value of the {@code bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrWorldMeshBufferML.nbufferSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("void *")
        public ByteBuffer buffer() { return XrWorldMeshBufferML.nbuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrWorldMeshBufferML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshBufferML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BUFFER_ML TYPE_WORLD_MESH_BUFFER_ML} value to the {@code type} field. */
        public XrWorldMeshBufferML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BUFFER_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrWorldMeshBufferML.Buffer next(@NativeType("void *") long value) { XrWorldMeshBufferML.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
        public XrWorldMeshBufferML.Buffer buffer(@NativeType("void *") ByteBuffer value) { XrWorldMeshBufferML.nbuffer(address(), value); return this; }

    }

}