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
 * struct XrSystemHandTrackingMeshPropertiesMSFT {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsHandTrackingMesh;
 *     uint32_t maxHandMeshIndexCount;
 *     uint32_t maxHandMeshVertexCount;
 * }}</pre>
 */
public class XrSystemHandTrackingMeshPropertiesMSFT extends Struct<XrSystemHandTrackingMeshPropertiesMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSHANDTRACKINGMESH,
        MAXHANDMESHINDEXCOUNT,
        MAXHANDMESHVERTEXCOUNT;

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
        SUPPORTSHANDTRACKINGMESH = layout.offsetof(2);
        MAXHANDMESHINDEXCOUNT = layout.offsetof(3);
        MAXHANDMESHVERTEXCOUNT = layout.offsetof(4);
    }

    protected XrSystemHandTrackingMeshPropertiesMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemHandTrackingMeshPropertiesMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSystemHandTrackingMeshPropertiesMSFT(address, container);
    }

    /**
     * Creates a {@code XrSystemHandTrackingMeshPropertiesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemHandTrackingMeshPropertiesMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code supportsHandTrackingMesh} field. */
    @NativeType("XrBool32")
    public boolean supportsHandTrackingMesh() { return nsupportsHandTrackingMesh(address()) != 0; }
    /** @return the value of the {@code maxHandMeshIndexCount} field. */
    @NativeType("uint32_t")
    public int maxHandMeshIndexCount() { return nmaxHandMeshIndexCount(address()); }
    /** @return the value of the {@code maxHandMeshVertexCount} field. */
    @NativeType("uint32_t")
    public int maxHandMeshVertexCount() { return nmaxHandMeshVertexCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT} value to the {@code type} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemHandTrackingMeshPropertiesMSFT set(
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
    public XrSystemHandTrackingMeshPropertiesMSFT set(XrSystemHandTrackingMeshPropertiesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemHandTrackingMeshPropertiesMSFT malloc() {
        return new XrSystemHandTrackingMeshPropertiesMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemHandTrackingMeshPropertiesMSFT calloc() {
        return new XrSystemHandTrackingMeshPropertiesMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSystemHandTrackingMeshPropertiesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemHandTrackingMeshPropertiesMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance for the specified memory address. */
    public static XrSystemHandTrackingMeshPropertiesMSFT create(long address) {
        return new XrSystemHandTrackingMeshPropertiesMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemHandTrackingMeshPropertiesMSFT createSafe(long address) {
        return address == NULL ? null : new XrSystemHandTrackingMeshPropertiesMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemHandTrackingMeshPropertiesMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT malloc(MemoryStack stack) {
        return new XrSystemHandTrackingMeshPropertiesMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT calloc(MemoryStack stack) {
        return new XrSystemHandTrackingMeshPropertiesMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemHandTrackingMeshPropertiesMSFT.NEXT); }
    /** Unsafe version of {@link #supportsHandTrackingMesh}. */
    public static int nsupportsHandTrackingMesh(long struct) { return memGetInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.SUPPORTSHANDTRACKINGMESH); }
    /** Unsafe version of {@link #maxHandMeshIndexCount}. */
    public static int nmaxHandMeshIndexCount(long struct) { return memGetInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.MAXHANDMESHINDEXCOUNT); }
    /** Unsafe version of {@link #maxHandMeshVertexCount}. */
    public static int nmaxHandMeshVertexCount(long struct) { return memGetInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.MAXHANDMESHVERTEXCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemHandTrackingMeshPropertiesMSFT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemHandTrackingMeshPropertiesMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSystemHandTrackingMeshPropertiesMSFT, Buffer> implements NativeResource {

        private static final XrSystemHandTrackingMeshPropertiesMSFT ELEMENT_FACTORY = XrSystemHandTrackingMeshPropertiesMSFT.create(-1L);

        /**
         * Creates a new {@code XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemHandTrackingMeshPropertiesMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemHandTrackingMeshPropertiesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemHandTrackingMeshPropertiesMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemHandTrackingMeshPropertiesMSFT.nnext(address()); }
        /** @return the value of the {@code supportsHandTrackingMesh} field. */
        @NativeType("XrBool32")
        public boolean supportsHandTrackingMesh() { return XrSystemHandTrackingMeshPropertiesMSFT.nsupportsHandTrackingMesh(address()) != 0; }
        /** @return the value of the {@code maxHandMeshIndexCount} field. */
        @NativeType("uint32_t")
        public int maxHandMeshIndexCount() { return XrSystemHandTrackingMeshPropertiesMSFT.nmaxHandMeshIndexCount(address()); }
        /** @return the value of the {@code maxHandMeshVertexCount} field. */
        @NativeType("uint32_t")
        public int maxHandMeshVertexCount() { return XrSystemHandTrackingMeshPropertiesMSFT.nmaxHandMeshVertexCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSystemHandTrackingMeshPropertiesMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT} value to the {@code type} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer next(@NativeType("void *") long value) { XrSystemHandTrackingMeshPropertiesMSFT.nnext(address(), value); return this; }

    }

}