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
 * struct XrWorldMeshBlockRequestML {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 *     XrWorldMeshDetectorLodML lod;
 * }}</pre>
 */
public class XrWorldMeshBlockRequestML extends Struct<XrWorldMeshBlockRequestML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        UUID,
        LOD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        UUID = layout.offsetof(2);
        LOD = layout.offsetof(3);
    }

    protected XrWorldMeshBlockRequestML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshBlockRequestML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshBlockRequestML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshBlockRequestML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshBlockRequestML(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
    public XrUuidEXT uuid() { return nuuid(address()); }
    /** @return the value of the {@code lod} field. */
    @NativeType("XrWorldMeshDetectorLodML")
    public int lod() { return nlod(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrWorldMeshBlockRequestML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_REQUEST_ML TYPE_WORLD_MESH_BLOCK_REQUEST_ML} value to the {@code type} field. */
    public XrWorldMeshBlockRequestML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BLOCK_REQUEST_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrWorldMeshBlockRequestML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
    public XrWorldMeshBlockRequestML uuid(XrUuidEXT value) { nuuid(address(), value); return this; }
    /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrWorldMeshBlockRequestML uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
    /** Sets the specified value to the {@code lod} field. */
    public XrWorldMeshBlockRequestML lod(@NativeType("XrWorldMeshDetectorLodML") int value) { nlod(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshBlockRequestML set(
        int type,
        long next,
        XrUuidEXT uuid,
        int lod
    ) {
        type(type);
        next(next);
        uuid(uuid);
        lod(lod);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshBlockRequestML set(XrWorldMeshBlockRequestML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshBlockRequestML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBlockRequestML malloc() {
        return new XrWorldMeshBlockRequestML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBlockRequestML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBlockRequestML calloc() {
        return new XrWorldMeshBlockRequestML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBlockRequestML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshBlockRequestML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshBlockRequestML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshBlockRequestML} instance for the specified memory address. */
    public static XrWorldMeshBlockRequestML create(long address) {
        return new XrWorldMeshBlockRequestML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshBlockRequestML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshBlockRequestML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockRequestML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockRequestML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockRequestML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockRequestML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockRequestML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockRequestML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshBlockRequestML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockRequestML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshBlockRequestML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshBlockRequestML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBlockRequestML malloc(MemoryStack stack) {
        return new XrWorldMeshBlockRequestML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshBlockRequestML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBlockRequestML calloc(MemoryStack stack) {
        return new XrWorldMeshBlockRequestML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockRequestML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockRequestML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockRequestML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockRequestML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshBlockRequestML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshBlockRequestML.NEXT); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrWorldMeshBlockRequestML.UUID); }
    /** Unsafe version of {@link #lod}. */
    public static int nlod(long struct) { return memGetInt(struct + XrWorldMeshBlockRequestML.LOD); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshBlockRequestML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshBlockRequestML.NEXT, value); }
    /** Unsafe version of {@link #uuid(XrUuidEXT) uuid}. */
    public static void nuuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrWorldMeshBlockRequestML.UUID, XrUuidEXT.SIZEOF); }
    /** Unsafe version of {@link #lod(int) lod}. */
    public static void nlod(long struct, int value) { memPutInt(struct + XrWorldMeshBlockRequestML.LOD, value); }

    // -----------------------------------

    /** An array of {@link XrWorldMeshBlockRequestML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshBlockRequestML, Buffer> implements NativeResource {

        private static final XrWorldMeshBlockRequestML ELEMENT_FACTORY = XrWorldMeshBlockRequestML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshBlockRequestML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshBlockRequestML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshBlockRequestML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshBlockRequestML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshBlockRequestML.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrWorldMeshBlockRequestML.nuuid(address()); }
        /** @return the value of the {@code lod} field. */
        @NativeType("XrWorldMeshDetectorLodML")
        public int lod() { return XrWorldMeshBlockRequestML.nlod(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrWorldMeshBlockRequestML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshBlockRequestML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_REQUEST_ML TYPE_WORLD_MESH_BLOCK_REQUEST_ML} value to the {@code type} field. */
        public XrWorldMeshBlockRequestML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BLOCK_REQUEST_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrWorldMeshBlockRequestML.Buffer next(@NativeType("void *") long value) { XrWorldMeshBlockRequestML.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
        public XrWorldMeshBlockRequestML.Buffer uuid(XrUuidEXT value) { XrWorldMeshBlockRequestML.nuuid(address(), value); return this; }
        /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrWorldMeshBlockRequestML.Buffer uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
        /** Sets the specified value to the {@code lod} field. */
        public XrWorldMeshBlockRequestML.Buffer lod(@NativeType("XrWorldMeshDetectorLodML") int value) { XrWorldMeshBlockRequestML.nlod(address(), value); return this; }

    }

}