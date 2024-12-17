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
 * struct XrWorldMeshBlockStateML {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 *     {@link XrPosef XrPosef} meshBoundingBoxCenter;
 *     {@link XrExtent3DfEXT XrExtent3DfEXT} meshBoundingBoxExtents;
 *     XrTime lastUpdateTime;
 *     XrWorldMeshBlockStatusML status;
 * }}</pre>
 */
public class XrWorldMeshBlockStateML extends Struct<XrWorldMeshBlockStateML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        UUID,
        MESHBOUNDINGBOXCENTER,
        MESHBOUNDINGBOXEXTENTS,
        LASTUPDATETIME,
        STATUS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent3DfEXT.SIZEOF, XrExtent3DfEXT.ALIGNOF),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        UUID = layout.offsetof(2);
        MESHBOUNDINGBOXCENTER = layout.offsetof(3);
        MESHBOUNDINGBOXEXTENTS = layout.offsetof(4);
        LASTUPDATETIME = layout.offsetof(5);
        STATUS = layout.offsetof(6);
    }

    protected XrWorldMeshBlockStateML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshBlockStateML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshBlockStateML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshBlockStateML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshBlockStateML(ByteBuffer container) {
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
    /** @return a {@link XrPosef} view of the {@code meshBoundingBoxCenter} field. */
    public XrPosef meshBoundingBoxCenter() { return nmeshBoundingBoxCenter(address()); }
    /** @return a {@link XrExtent3DfEXT} view of the {@code meshBoundingBoxExtents} field. */
    public XrExtent3DfEXT meshBoundingBoxExtents() { return nmeshBoundingBoxExtents(address()); }
    /** @return the value of the {@code lastUpdateTime} field. */
    @NativeType("XrTime")
    public long lastUpdateTime() { return nlastUpdateTime(address()); }
    /** @return the value of the {@code status} field. */
    @NativeType("XrWorldMeshBlockStatusML")
    public int status() { return nstatus(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrWorldMeshBlockStateML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_STATE_ML TYPE_WORLD_MESH_BLOCK_STATE_ML} value to the {@code type} field. */
    public XrWorldMeshBlockStateML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BLOCK_STATE_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrWorldMeshBlockStateML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
    public XrWorldMeshBlockStateML uuid(XrUuidEXT value) { nuuid(address(), value); return this; }
    /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrWorldMeshBlockStateML uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
    /** Copies the specified {@link XrPosef} to the {@code meshBoundingBoxCenter} field. */
    public XrWorldMeshBlockStateML meshBoundingBoxCenter(XrPosef value) { nmeshBoundingBoxCenter(address(), value); return this; }
    /** Passes the {@code meshBoundingBoxCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrWorldMeshBlockStateML meshBoundingBoxCenter(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(meshBoundingBoxCenter()); return this; }
    /** Copies the specified {@link XrExtent3DfEXT} to the {@code meshBoundingBoxExtents} field. */
    public XrWorldMeshBlockStateML meshBoundingBoxExtents(XrExtent3DfEXT value) { nmeshBoundingBoxExtents(address(), value); return this; }
    /** Passes the {@code meshBoundingBoxExtents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrWorldMeshBlockStateML meshBoundingBoxExtents(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(meshBoundingBoxExtents()); return this; }
    /** Sets the specified value to the {@code lastUpdateTime} field. */
    public XrWorldMeshBlockStateML lastUpdateTime(@NativeType("XrTime") long value) { nlastUpdateTime(address(), value); return this; }
    /** Sets the specified value to the {@code status} field. */
    public XrWorldMeshBlockStateML status(@NativeType("XrWorldMeshBlockStatusML") int value) { nstatus(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshBlockStateML set(
        int type,
        long next,
        XrUuidEXT uuid,
        XrPosef meshBoundingBoxCenter,
        XrExtent3DfEXT meshBoundingBoxExtents,
        long lastUpdateTime,
        int status
    ) {
        type(type);
        next(next);
        uuid(uuid);
        meshBoundingBoxCenter(meshBoundingBoxCenter);
        meshBoundingBoxExtents(meshBoundingBoxExtents);
        lastUpdateTime(lastUpdateTime);
        status(status);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshBlockStateML set(XrWorldMeshBlockStateML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshBlockStateML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBlockStateML malloc() {
        return new XrWorldMeshBlockStateML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBlockStateML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBlockStateML calloc() {
        return new XrWorldMeshBlockStateML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBlockStateML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshBlockStateML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshBlockStateML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshBlockStateML} instance for the specified memory address. */
    public static XrWorldMeshBlockStateML create(long address) {
        return new XrWorldMeshBlockStateML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshBlockStateML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshBlockStateML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockStateML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockStateML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockStateML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockStateML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockStateML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockStateML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshBlockStateML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockStateML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshBlockStateML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshBlockStateML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBlockStateML malloc(MemoryStack stack) {
        return new XrWorldMeshBlockStateML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshBlockStateML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBlockStateML calloc(MemoryStack stack) {
        return new XrWorldMeshBlockStateML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockStateML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockStateML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockStateML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockStateML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshBlockStateML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshBlockStateML.NEXT); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrWorldMeshBlockStateML.UUID); }
    /** Unsafe version of {@link #meshBoundingBoxCenter}. */
    public static XrPosef nmeshBoundingBoxCenter(long struct) { return XrPosef.create(struct + XrWorldMeshBlockStateML.MESHBOUNDINGBOXCENTER); }
    /** Unsafe version of {@link #meshBoundingBoxExtents}. */
    public static XrExtent3DfEXT nmeshBoundingBoxExtents(long struct) { return XrExtent3DfEXT.create(struct + XrWorldMeshBlockStateML.MESHBOUNDINGBOXEXTENTS); }
    /** Unsafe version of {@link #lastUpdateTime}. */
    public static long nlastUpdateTime(long struct) { return memGetLong(struct + XrWorldMeshBlockStateML.LASTUPDATETIME); }
    /** Unsafe version of {@link #status}. */
    public static int nstatus(long struct) { return memGetInt(struct + XrWorldMeshBlockStateML.STATUS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshBlockStateML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshBlockStateML.NEXT, value); }
    /** Unsafe version of {@link #uuid(XrUuidEXT) uuid}. */
    public static void nuuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrWorldMeshBlockStateML.UUID, XrUuidEXT.SIZEOF); }
    /** Unsafe version of {@link #meshBoundingBoxCenter(XrPosef) meshBoundingBoxCenter}. */
    public static void nmeshBoundingBoxCenter(long struct, XrPosef value) { memCopy(value.address(), struct + XrWorldMeshBlockStateML.MESHBOUNDINGBOXCENTER, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #meshBoundingBoxExtents(XrExtent3DfEXT) meshBoundingBoxExtents}. */
    public static void nmeshBoundingBoxExtents(long struct, XrExtent3DfEXT value) { memCopy(value.address(), struct + XrWorldMeshBlockStateML.MESHBOUNDINGBOXEXTENTS, XrExtent3DfEXT.SIZEOF); }
    /** Unsafe version of {@link #lastUpdateTime(long) lastUpdateTime}. */
    public static void nlastUpdateTime(long struct, long value) { memPutLong(struct + XrWorldMeshBlockStateML.LASTUPDATETIME, value); }
    /** Unsafe version of {@link #status(int) status}. */
    public static void nstatus(long struct, int value) { memPutInt(struct + XrWorldMeshBlockStateML.STATUS, value); }

    // -----------------------------------

    /** An array of {@link XrWorldMeshBlockStateML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshBlockStateML, Buffer> implements NativeResource {

        private static final XrWorldMeshBlockStateML ELEMENT_FACTORY = XrWorldMeshBlockStateML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshBlockStateML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshBlockStateML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshBlockStateML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshBlockStateML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshBlockStateML.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrWorldMeshBlockStateML.nuuid(address()); }
        /** @return a {@link XrPosef} view of the {@code meshBoundingBoxCenter} field. */
        public XrPosef meshBoundingBoxCenter() { return XrWorldMeshBlockStateML.nmeshBoundingBoxCenter(address()); }
        /** @return a {@link XrExtent3DfEXT} view of the {@code meshBoundingBoxExtents} field. */
        public XrExtent3DfEXT meshBoundingBoxExtents() { return XrWorldMeshBlockStateML.nmeshBoundingBoxExtents(address()); }
        /** @return the value of the {@code lastUpdateTime} field. */
        @NativeType("XrTime")
        public long lastUpdateTime() { return XrWorldMeshBlockStateML.nlastUpdateTime(address()); }
        /** @return the value of the {@code status} field. */
        @NativeType("XrWorldMeshBlockStatusML")
        public int status() { return XrWorldMeshBlockStateML.nstatus(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrWorldMeshBlockStateML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshBlockStateML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_STATE_ML TYPE_WORLD_MESH_BLOCK_STATE_ML} value to the {@code type} field. */
        public XrWorldMeshBlockStateML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BLOCK_STATE_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrWorldMeshBlockStateML.Buffer next(@NativeType("void *") long value) { XrWorldMeshBlockStateML.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
        public XrWorldMeshBlockStateML.Buffer uuid(XrUuidEXT value) { XrWorldMeshBlockStateML.nuuid(address(), value); return this; }
        /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrWorldMeshBlockStateML.Buffer uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
        /** Copies the specified {@link XrPosef} to the {@code meshBoundingBoxCenter} field. */
        public XrWorldMeshBlockStateML.Buffer meshBoundingBoxCenter(XrPosef value) { XrWorldMeshBlockStateML.nmeshBoundingBoxCenter(address(), value); return this; }
        /** Passes the {@code meshBoundingBoxCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrWorldMeshBlockStateML.Buffer meshBoundingBoxCenter(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(meshBoundingBoxCenter()); return this; }
        /** Copies the specified {@link XrExtent3DfEXT} to the {@code meshBoundingBoxExtents} field. */
        public XrWorldMeshBlockStateML.Buffer meshBoundingBoxExtents(XrExtent3DfEXT value) { XrWorldMeshBlockStateML.nmeshBoundingBoxExtents(address(), value); return this; }
        /** Passes the {@code meshBoundingBoxExtents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrWorldMeshBlockStateML.Buffer meshBoundingBoxExtents(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(meshBoundingBoxExtents()); return this; }
        /** Sets the specified value to the {@code lastUpdateTime} field. */
        public XrWorldMeshBlockStateML.Buffer lastUpdateTime(@NativeType("XrTime") long value) { XrWorldMeshBlockStateML.nlastUpdateTime(address(), value); return this; }
        /** Sets the specified value to the {@code status} field. */
        public XrWorldMeshBlockStateML.Buffer status(@NativeType("XrWorldMeshBlockStatusML") int value) { XrWorldMeshBlockStateML.nstatus(address(), value); return this; }

    }

}