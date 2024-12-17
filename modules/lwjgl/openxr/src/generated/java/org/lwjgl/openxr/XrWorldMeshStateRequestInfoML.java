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
 * struct XrWorldMeshStateRequestInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     {@link XrPosef XrPosef} boundingBoxCenter;
 *     {@link XrExtent3DfEXT XrExtent3DfEXT} boundingBoxExtents;
 * }}</pre>
 */
public class XrWorldMeshStateRequestInfoML extends Struct<XrWorldMeshStateRequestInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME,
        BOUNDINGBOXCENTER,
        BOUNDINGBOXEXTENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent3DfEXT.SIZEOF, XrExtent3DfEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        BOUNDINGBOXCENTER = layout.offsetof(4);
        BOUNDINGBOXEXTENTS = layout.offsetof(5);
    }

    protected XrWorldMeshStateRequestInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshStateRequestInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshStateRequestInfoML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshStateRequestInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshStateRequestInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return a {@link XrPosef} view of the {@code boundingBoxCenter} field. */
    public XrPosef boundingBoxCenter() { return nboundingBoxCenter(address()); }
    /** @return a {@link XrExtent3DfEXT} view of the {@code boundingBoxExtents} field. */
    public XrExtent3DfEXT boundingBoxExtents() { return nboundingBoxExtents(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrWorldMeshStateRequestInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML} value to the {@code type} field. */
    public XrWorldMeshStateRequestInfoML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrWorldMeshStateRequestInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrWorldMeshStateRequestInfoML baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrWorldMeshStateRequestInfoML time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code boundingBoxCenter} field. */
    public XrWorldMeshStateRequestInfoML boundingBoxCenter(XrPosef value) { nboundingBoxCenter(address(), value); return this; }
    /** Passes the {@code boundingBoxCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrWorldMeshStateRequestInfoML boundingBoxCenter(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(boundingBoxCenter()); return this; }
    /** Copies the specified {@link XrExtent3DfEXT} to the {@code boundingBoxExtents} field. */
    public XrWorldMeshStateRequestInfoML boundingBoxExtents(XrExtent3DfEXT value) { nboundingBoxExtents(address(), value); return this; }
    /** Passes the {@code boundingBoxExtents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrWorldMeshStateRequestInfoML boundingBoxExtents(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(boundingBoxExtents()); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshStateRequestInfoML set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        XrPosef boundingBoxCenter,
        XrExtent3DfEXT boundingBoxExtents
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        boundingBoxCenter(boundingBoxCenter);
        boundingBoxExtents(boundingBoxExtents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshStateRequestInfoML set(XrWorldMeshStateRequestInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshStateRequestInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshStateRequestInfoML malloc() {
        return new XrWorldMeshStateRequestInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshStateRequestInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshStateRequestInfoML calloc() {
        return new XrWorldMeshStateRequestInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshStateRequestInfoML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshStateRequestInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshStateRequestInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshStateRequestInfoML} instance for the specified memory address. */
    public static XrWorldMeshStateRequestInfoML create(long address) {
        return new XrWorldMeshStateRequestInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshStateRequestInfoML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshStateRequestInfoML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshStateRequestInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshStateRequestInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshStateRequestInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshStateRequestInfoML malloc(MemoryStack stack) {
        return new XrWorldMeshStateRequestInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshStateRequestInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshStateRequestInfoML calloc(MemoryStack stack) {
        return new XrWorldMeshStateRequestInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshStateRequestInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshStateRequestInfoML.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrWorldMeshStateRequestInfoML.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrWorldMeshStateRequestInfoML.TIME); }
    /** Unsafe version of {@link #boundingBoxCenter}. */
    public static XrPosef nboundingBoxCenter(long struct) { return XrPosef.create(struct + XrWorldMeshStateRequestInfoML.BOUNDINGBOXCENTER); }
    /** Unsafe version of {@link #boundingBoxExtents}. */
    public static XrExtent3DfEXT nboundingBoxExtents(long struct) { return XrExtent3DfEXT.create(struct + XrWorldMeshStateRequestInfoML.BOUNDINGBOXEXTENTS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshStateRequestInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshStateRequestInfoML.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrWorldMeshStateRequestInfoML.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrWorldMeshStateRequestInfoML.TIME, value); }
    /** Unsafe version of {@link #boundingBoxCenter(XrPosef) boundingBoxCenter}. */
    public static void nboundingBoxCenter(long struct, XrPosef value) { memCopy(value.address(), struct + XrWorldMeshStateRequestInfoML.BOUNDINGBOXCENTER, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #boundingBoxExtents(XrExtent3DfEXT) boundingBoxExtents}. */
    public static void nboundingBoxExtents(long struct, XrExtent3DfEXT value) { memCopy(value.address(), struct + XrWorldMeshStateRequestInfoML.BOUNDINGBOXEXTENTS, XrExtent3DfEXT.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrWorldMeshStateRequestInfoML.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrWorldMeshStateRequestInfoML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshStateRequestInfoML, Buffer> implements NativeResource {

        private static final XrWorldMeshStateRequestInfoML ELEMENT_FACTORY = XrWorldMeshStateRequestInfoML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshStateRequestInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshStateRequestInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshStateRequestInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshStateRequestInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrWorldMeshStateRequestInfoML.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrWorldMeshStateRequestInfoML.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrWorldMeshStateRequestInfoML.ntime(address()); }
        /** @return a {@link XrPosef} view of the {@code boundingBoxCenter} field. */
        public XrPosef boundingBoxCenter() { return XrWorldMeshStateRequestInfoML.nboundingBoxCenter(address()); }
        /** @return a {@link XrExtent3DfEXT} view of the {@code boundingBoxExtents} field. */
        public XrExtent3DfEXT boundingBoxExtents() { return XrWorldMeshStateRequestInfoML.nboundingBoxExtents(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrWorldMeshStateRequestInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshStateRequestInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML} value to the {@code type} field. */
        public XrWorldMeshStateRequestInfoML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrWorldMeshStateRequestInfoML.Buffer next(@NativeType("void const *") long value) { XrWorldMeshStateRequestInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrWorldMeshStateRequestInfoML.Buffer baseSpace(XrSpace value) { XrWorldMeshStateRequestInfoML.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrWorldMeshStateRequestInfoML.Buffer time(@NativeType("XrTime") long value) { XrWorldMeshStateRequestInfoML.ntime(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code boundingBoxCenter} field. */
        public XrWorldMeshStateRequestInfoML.Buffer boundingBoxCenter(XrPosef value) { XrWorldMeshStateRequestInfoML.nboundingBoxCenter(address(), value); return this; }
        /** Passes the {@code boundingBoxCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrWorldMeshStateRequestInfoML.Buffer boundingBoxCenter(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(boundingBoxCenter()); return this; }
        /** Copies the specified {@link XrExtent3DfEXT} to the {@code boundingBoxExtents} field. */
        public XrWorldMeshStateRequestInfoML.Buffer boundingBoxExtents(XrExtent3DfEXT value) { XrWorldMeshStateRequestInfoML.nboundingBoxExtents(address(), value); return this; }
        /** Passes the {@code boundingBoxExtents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrWorldMeshStateRequestInfoML.Buffer boundingBoxExtents(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(boundingBoxExtents()); return this; }

    }

}