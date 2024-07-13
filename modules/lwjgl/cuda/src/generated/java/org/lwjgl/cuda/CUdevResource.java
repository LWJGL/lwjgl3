/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUdevResource {
 *     CUdevResourceType type;
 *     unsigned char _internal_padding[92];
 *     union {
 *         {@link CUdevSmResource CUdevSmResource} sm;
 *         unsigned char _oversize[48];
 *     } resource;
 * }</code></pre>
 */
public class CUdevResource extends Struct<CUdevResource> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        _INTERNAL_PADDING,
        RESOURCE,
            RESOURCE_SM,
            RESOURCE__OVERSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 92),
            __union(
                __member(CUdevSmResource.SIZEOF, CUdevSmResource.ALIGNOF),
                __array(1, 48)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        _INTERNAL_PADDING = layout.offsetof(1);
        RESOURCE = layout.offsetof(2);
            RESOURCE_SM = layout.offsetof(3);
            RESOURCE__OVERSIZE = layout.offsetof(4);
    }

    protected CUdevResource(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUdevResource create(long address, @Nullable ByteBuffer container) {
        return new CUdevResource(address, container);
    }

    /**
     * Creates a {@code CUdevResource} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUdevResource(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("CUdevResourceType")
    public int type() { return ntype(address()); }
    /** @return a {@link CUdevSmResource} view of the {@code resource.sm} field. */
    public CUdevSmResource resource_sm() { return nresource_sm(address()); }
    /** @return a {@link ByteBuffer} view of the {@code resource._oversize} field. */
    @NativeType("unsigned char[48]")
    public ByteBuffer resource__oversize() { return nresource__oversize(address()); }
    /** @return the value at the specified index of the {@code resource._oversize} field. */
    @NativeType("unsigned char")
    public byte resource__oversize(int index) { return nresource__oversize(address(), index); }

    // -----------------------------------

    /** Returns a new {@code CUdevResource} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUdevResource malloc() {
        return new CUdevResource(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUdevResource} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUdevResource calloc() {
        return new CUdevResource(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUdevResource} instance allocated with {@link BufferUtils}. */
    public static CUdevResource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUdevResource(memAddress(container), container);
    }

    /** Returns a new {@code CUdevResource} instance for the specified memory address. */
    public static CUdevResource create(long address) {
        return new CUdevResource(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUdevResource createSafe(long address) {
        return address == NULL ? null : new CUdevResource(address, null);
    }

    /**
     * Returns a new {@link CUdevResource.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUdevResource.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUdevResource.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUdevResource.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUdevResource.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUdevResource.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUdevResource.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUdevResource.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUdevResource.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUdevResource} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUdevResource malloc(MemoryStack stack) {
        return new CUdevResource(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUdevResource} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUdevResource calloc(MemoryStack stack) {
        return new CUdevResource(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUdevResource.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUdevResource.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUdevResource.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUdevResource.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + CUdevResource.TYPE); }
    public static ByteBuffer n_internal_padding(long struct) { return memByteBuffer(struct + CUdevResource._INTERNAL_PADDING, 92); }
    public static byte n_internal_padding(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUdevResource._INTERNAL_PADDING + check(index, 92) * 1);
    }
    /** Unsafe version of {@link #resource_sm}. */
    public static CUdevSmResource nresource_sm(long struct) { return CUdevSmResource.create(struct + CUdevResource.RESOURCE_SM); }
    public static ByteBuffer nresource__oversize(long struct) { return memByteBuffer(struct + CUdevResource.RESOURCE__OVERSIZE, 48); }
    public static byte nresource__oversize(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUdevResource.RESOURCE__OVERSIZE + check(index, 48) * 1);
    }

    // -----------------------------------

    /** An array of {@link CUdevResource} structs. */
    public static class Buffer extends StructBuffer<CUdevResource, Buffer> implements NativeResource {

        private static final CUdevResource ELEMENT_FACTORY = CUdevResource.create(-1L);

        /**
         * Creates a new {@code CUdevResource.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUdevResource#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUdevResource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("CUdevResourceType")
        public int type() { return CUdevResource.ntype(address()); }
        /** @return a {@link CUdevSmResource} view of the {@code resource.sm} field. */
        public CUdevSmResource resource_sm() { return CUdevResource.nresource_sm(address()); }
        /** @return a {@link ByteBuffer} view of the {@code resource._oversize} field. */
        @NativeType("unsigned char[48]")
        public ByteBuffer resource__oversize() { return CUdevResource.nresource__oversize(address()); }
        /** @return the value at the specified index of the {@code resource._oversize} field. */
        @NativeType("unsigned char")
        public byte resource__oversize(int index) { return CUdevResource.nresource__oversize(address(), index); }

    }

}