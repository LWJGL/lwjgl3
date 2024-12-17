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
 * struct XrWorldMeshDetectorCreateInfoML {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrWorldMeshDetectorCreateInfoML extends Struct<XrWorldMeshDetectorCreateInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrWorldMeshDetectorCreateInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshDetectorCreateInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshDetectorCreateInfoML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshDetectorCreateInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshDetectorCreateInfoML(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrWorldMeshDetectorCreateInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML} value to the {@code type} field. */
    public XrWorldMeshDetectorCreateInfoML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrWorldMeshDetectorCreateInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshDetectorCreateInfoML set(
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
    public XrWorldMeshDetectorCreateInfoML set(XrWorldMeshDetectorCreateInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshDetectorCreateInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshDetectorCreateInfoML malloc() {
        return new XrWorldMeshDetectorCreateInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshDetectorCreateInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshDetectorCreateInfoML calloc() {
        return new XrWorldMeshDetectorCreateInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshDetectorCreateInfoML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshDetectorCreateInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshDetectorCreateInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshDetectorCreateInfoML} instance for the specified memory address. */
    public static XrWorldMeshDetectorCreateInfoML create(long address) {
        return new XrWorldMeshDetectorCreateInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshDetectorCreateInfoML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshDetectorCreateInfoML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshDetectorCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshDetectorCreateInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshDetectorCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshDetectorCreateInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshDetectorCreateInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshDetectorCreateInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshDetectorCreateInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshDetectorCreateInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshDetectorCreateInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshDetectorCreateInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshDetectorCreateInfoML malloc(MemoryStack stack) {
        return new XrWorldMeshDetectorCreateInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshDetectorCreateInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshDetectorCreateInfoML calloc(MemoryStack stack) {
        return new XrWorldMeshDetectorCreateInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshDetectorCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshDetectorCreateInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshDetectorCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshDetectorCreateInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshDetectorCreateInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshDetectorCreateInfoML.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshDetectorCreateInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshDetectorCreateInfoML.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrWorldMeshDetectorCreateInfoML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshDetectorCreateInfoML, Buffer> implements NativeResource {

        private static final XrWorldMeshDetectorCreateInfoML ELEMENT_FACTORY = XrWorldMeshDetectorCreateInfoML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshDetectorCreateInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshDetectorCreateInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshDetectorCreateInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshDetectorCreateInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrWorldMeshDetectorCreateInfoML.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrWorldMeshDetectorCreateInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshDetectorCreateInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML} value to the {@code type} field. */
        public XrWorldMeshDetectorCreateInfoML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrWorldMeshDetectorCreateInfoML.Buffer next(@NativeType("void const *") long value) { XrWorldMeshDetectorCreateInfoML.nnext(address(), value); return this; }

    }

}