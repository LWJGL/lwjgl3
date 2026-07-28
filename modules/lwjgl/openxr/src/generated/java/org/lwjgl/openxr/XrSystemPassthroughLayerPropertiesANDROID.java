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
 * struct XrSystemPassthroughLayerPropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsPassthroughLayer;
 *     uint32_t maxMeshIndexCount;
 *     uint32_t maxMeshVertexCount;
 * }}</pre>
 */
public class XrSystemPassthroughLayerPropertiesANDROID extends Struct<XrSystemPassthroughLayerPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSPASSTHROUGHLAYER,
        MAXMESHINDEXCOUNT,
        MAXMESHVERTEXCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSPASSTHROUGHLAYER = layout.offsetof(2);
        MAXMESHINDEXCOUNT = layout.offsetof(3);
        MAXMESHVERTEXCOUNT = layout.offsetof(4);
    }

    protected XrSystemPassthroughLayerPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemPassthroughLayerPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemPassthroughLayerPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemPassthroughLayerPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPassthroughLayerPropertiesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code supportsPassthroughLayer} field. */
    @NativeType("XrBool32")
    public boolean supportsPassthroughLayer() { return nsupportsPassthroughLayer(address()) != 0; }
    /** @return the value of the {@code maxMeshIndexCount} field. */
    @NativeType("uint32_t")
    public int maxMeshIndexCount() { return nmaxMeshIndexCount(address()); }
    /** @return the value of the {@code maxMeshVertexCount} field. */
    @NativeType("uint32_t")
    public int maxMeshVertexCount() { return nmaxMeshVertexCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemPassthroughLayerPropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDCompositionLayerPassthroughMesh#XR_TYPE_SYSTEM_PASSTHROUGH_LAYER_PROPERTIES_ANDROID TYPE_SYSTEM_PASSTHROUGH_LAYER_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemPassthroughLayerPropertiesANDROID type$Default() { return type(ANDROIDCompositionLayerPassthroughMesh.XR_TYPE_SYSTEM_PASSTHROUGH_LAYER_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemPassthroughLayerPropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPassthroughLayerPropertiesANDROID set(
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
    public XrSystemPassthroughLayerPropertiesANDROID set(XrSystemPassthroughLayerPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPassthroughLayerPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughLayerPropertiesANDROID malloc() {
        return new XrSystemPassthroughLayerPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughLayerPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughLayerPropertiesANDROID calloc() {
        return new XrSystemPassthroughLayerPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughLayerPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemPassthroughLayerPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemPassthroughLayerPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPassthroughLayerPropertiesANDROID} instance for the specified memory address. */
    public static XrSystemPassthroughLayerPropertiesANDROID create(long address) {
        return new XrSystemPassthroughLayerPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemPassthroughLayerPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemPassthroughLayerPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughLayerPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughLayerPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughLayerPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughLayerPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughLayerPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughLayerPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemPassthroughLayerPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughLayerPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemPassthroughLayerPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPassthroughLayerPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughLayerPropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemPassthroughLayerPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemPassthroughLayerPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughLayerPropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemPassthroughLayerPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughLayerPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughLayerPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughLayerPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughLayerPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemPassthroughLayerPropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPassthroughLayerPropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsPassthroughLayer}. */
    public static int nsupportsPassthroughLayer(long struct) { return memGetInt(struct + XrSystemPassthroughLayerPropertiesANDROID.SUPPORTSPASSTHROUGHLAYER); }
    /** Unsafe version of {@link #maxMeshIndexCount}. */
    public static int nmaxMeshIndexCount(long struct) { return memGetInt(struct + XrSystemPassthroughLayerPropertiesANDROID.MAXMESHINDEXCOUNT); }
    /** Unsafe version of {@link #maxMeshVertexCount}. */
    public static int nmaxMeshVertexCount(long struct) { return memGetInt(struct + XrSystemPassthroughLayerPropertiesANDROID.MAXMESHVERTEXCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemPassthroughLayerPropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPassthroughLayerPropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPassthroughLayerPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemPassthroughLayerPropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemPassthroughLayerPropertiesANDROID ELEMENT_FACTORY = XrSystemPassthroughLayerPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemPassthroughLayerPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPassthroughLayerPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemPassthroughLayerPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPassthroughLayerPropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemPassthroughLayerPropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsPassthroughLayer} field. */
        @NativeType("XrBool32")
        public boolean supportsPassthroughLayer() { return XrSystemPassthroughLayerPropertiesANDROID.nsupportsPassthroughLayer(address()) != 0; }
        /** @return the value of the {@code maxMeshIndexCount} field. */
        @NativeType("uint32_t")
        public int maxMeshIndexCount() { return XrSystemPassthroughLayerPropertiesANDROID.nmaxMeshIndexCount(address()); }
        /** @return the value of the {@code maxMeshVertexCount} field. */
        @NativeType("uint32_t")
        public int maxMeshVertexCount() { return XrSystemPassthroughLayerPropertiesANDROID.nmaxMeshVertexCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemPassthroughLayerPropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPassthroughLayerPropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDCompositionLayerPassthroughMesh#XR_TYPE_SYSTEM_PASSTHROUGH_LAYER_PROPERTIES_ANDROID TYPE_SYSTEM_PASSTHROUGH_LAYER_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemPassthroughLayerPropertiesANDROID.Buffer type$Default() { return type(ANDROIDCompositionLayerPassthroughMesh.XR_TYPE_SYSTEM_PASSTHROUGH_LAYER_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemPassthroughLayerPropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemPassthroughLayerPropertiesANDROID.nnext(address(), value); return this; }

    }

}