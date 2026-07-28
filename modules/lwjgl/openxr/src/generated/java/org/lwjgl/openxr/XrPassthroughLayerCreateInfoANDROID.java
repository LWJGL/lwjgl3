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
 * struct XrPassthroughLayerCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t vertexCapacity;
 *     uint32_t indexCapacity;
 * }}</pre>
 */
public class XrPassthroughLayerCreateInfoANDROID extends Struct<XrPassthroughLayerCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VERTEXCAPACITY,
        INDEXCAPACITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VERTEXCAPACITY = layout.offsetof(2);
        INDEXCAPACITY = layout.offsetof(3);
    }

    protected XrPassthroughLayerCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughLayerCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughLayerCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrPassthroughLayerCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughLayerCreateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code vertexCapacity} field. */
    @NativeType("uint32_t")
    public int vertexCapacity() { return nvertexCapacity(address()); }
    /** @return the value of the {@code indexCapacity} field. */
    @NativeType("uint32_t")
    public int indexCapacity() { return nindexCapacity(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughLayerCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDCompositionLayerPassthroughMesh#XR_TYPE_PASSTHROUGH_LAYER_CREATE_INFO_ANDROID TYPE_PASSTHROUGH_LAYER_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrPassthroughLayerCreateInfoANDROID type$Default() { return type(ANDROIDCompositionLayerPassthroughMesh.XR_TYPE_PASSTHROUGH_LAYER_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughLayerCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrPassthroughLayerMeshANDROID} value to the {@code next} chain. */
    public XrPassthroughLayerCreateInfoANDROID next(XrPassthroughLayerMeshANDROID value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code vertexCapacity} field. */
    public XrPassthroughLayerCreateInfoANDROID vertexCapacity(@NativeType("uint32_t") int value) { nvertexCapacity(address(), value); return this; }
    /** Sets the specified value to the {@code indexCapacity} field. */
    public XrPassthroughLayerCreateInfoANDROID indexCapacity(@NativeType("uint32_t") int value) { nindexCapacity(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughLayerCreateInfoANDROID set(
        int type,
        long next,
        int vertexCapacity,
        int indexCapacity
    ) {
        type(type);
        next(next);
        vertexCapacity(vertexCapacity);
        indexCapacity(indexCapacity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughLayerCreateInfoANDROID set(XrPassthroughLayerCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughLayerCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughLayerCreateInfoANDROID malloc() {
        return new XrPassthroughLayerCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughLayerCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughLayerCreateInfoANDROID calloc() {
        return new XrPassthroughLayerCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughLayerCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughLayerCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughLayerCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughLayerCreateInfoANDROID} instance for the specified memory address. */
    public static XrPassthroughLayerCreateInfoANDROID create(long address) {
        return new XrPassthroughLayerCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughLayerCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrPassthroughLayerCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughLayerCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughLayerCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughLayerCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughLayerCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughLayerCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughLayerCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughLayerCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrPassthroughLayerCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughLayerCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughLayerCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrPassthroughLayerCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughLayerCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughLayerCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughLayerCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughLayerCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #vertexCapacity}. */
    public static int nvertexCapacity(long struct) { return memGetInt(struct + XrPassthroughLayerCreateInfoANDROID.VERTEXCAPACITY); }
    /** Unsafe version of {@link #indexCapacity}. */
    public static int nindexCapacity(long struct) { return memGetInt(struct + XrPassthroughLayerCreateInfoANDROID.INDEXCAPACITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughLayerCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughLayerCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #vertexCapacity(int) vertexCapacity}. */
    public static void nvertexCapacity(long struct, int value) { memPutInt(struct + XrPassthroughLayerCreateInfoANDROID.VERTEXCAPACITY, value); }
    /** Unsafe version of {@link #indexCapacity(int) indexCapacity}. */
    public static void nindexCapacity(long struct, int value) { memPutInt(struct + XrPassthroughLayerCreateInfoANDROID.INDEXCAPACITY, value); }

    // -----------------------------------

    /** An array of {@link XrPassthroughLayerCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughLayerCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrPassthroughLayerCreateInfoANDROID ELEMENT_FACTORY = XrPassthroughLayerCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrPassthroughLayerCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughLayerCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughLayerCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughLayerCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughLayerCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code vertexCapacity} field. */
        @NativeType("uint32_t")
        public int vertexCapacity() { return XrPassthroughLayerCreateInfoANDROID.nvertexCapacity(address()); }
        /** @return the value of the {@code indexCapacity} field. */
        @NativeType("uint32_t")
        public int indexCapacity() { return XrPassthroughLayerCreateInfoANDROID.nindexCapacity(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughLayerCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughLayerCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDCompositionLayerPassthroughMesh#XR_TYPE_PASSTHROUGH_LAYER_CREATE_INFO_ANDROID TYPE_PASSTHROUGH_LAYER_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrPassthroughLayerCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDCompositionLayerPassthroughMesh.XR_TYPE_PASSTHROUGH_LAYER_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughLayerCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrPassthroughLayerCreateInfoANDROID.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrPassthroughLayerMeshANDROID} value to the {@code next} chain. */
        public XrPassthroughLayerCreateInfoANDROID.Buffer next(XrPassthroughLayerMeshANDROID value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code vertexCapacity} field. */
        public XrPassthroughLayerCreateInfoANDROID.Buffer vertexCapacity(@NativeType("uint32_t") int value) { XrPassthroughLayerCreateInfoANDROID.nvertexCapacity(address(), value); return this; }
        /** Sets the specified value to the {@code indexCapacity} field. */
        public XrPassthroughLayerCreateInfoANDROID.Buffer indexCapacity(@NativeType("uint32_t") int value) { XrPassthroughLayerCreateInfoANDROID.nindexCapacity(address(), value); return this; }

    }

}