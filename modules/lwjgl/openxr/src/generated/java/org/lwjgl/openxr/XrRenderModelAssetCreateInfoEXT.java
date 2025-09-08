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
 * <pre><code>
 * struct XrRenderModelAssetCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrUuidEXT XrUuidEXT} cacheId;
 * }</code></pre>
 */
public class XrRenderModelAssetCreateInfoEXT extends Struct<XrRenderModelAssetCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CACHEID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CACHEID = layout.offsetof(2);
    }

    protected XrRenderModelAssetCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelAssetCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelAssetCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelAssetCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelAssetCreateInfoEXT(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code cacheId} field. */
    public XrUuidEXT cacheId() { return ncacheId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelAssetCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrRenderModelAssetCreateInfoEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelAssetCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code cacheId} field. */
    public XrRenderModelAssetCreateInfoEXT cacheId(XrUuidEXT value) { ncacheId(address(), value); return this; }
    /** Passes the {@code cacheId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRenderModelAssetCreateInfoEXT cacheId(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(cacheId()); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelAssetCreateInfoEXT set(
        int type,
        long next,
        XrUuidEXT cacheId
    ) {
        type(type);
        next(next);
        cacheId(cacheId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelAssetCreateInfoEXT set(XrRenderModelAssetCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelAssetCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetCreateInfoEXT malloc() {
        return new XrRenderModelAssetCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetCreateInfoEXT calloc() {
        return new XrRenderModelAssetCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelAssetCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelAssetCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelAssetCreateInfoEXT} instance for the specified memory address. */
    public static XrRenderModelAssetCreateInfoEXT create(long address) {
        return new XrRenderModelAssetCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelAssetCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelAssetCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelAssetCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelAssetCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelAssetCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetCreateInfoEXT malloc(MemoryStack stack) {
        return new XrRenderModelAssetCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelAssetCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetCreateInfoEXT calloc(MemoryStack stack) {
        return new XrRenderModelAssetCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelAssetCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelAssetCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #cacheId}. */
    public static XrUuidEXT ncacheId(long struct) { return XrUuidEXT.create(struct + XrRenderModelAssetCreateInfoEXT.CACHEID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelAssetCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelAssetCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #cacheId(XrUuidEXT) cacheId}. */
    public static void ncacheId(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrRenderModelAssetCreateInfoEXT.CACHEID, XrUuidEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrRenderModelAssetCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelAssetCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrRenderModelAssetCreateInfoEXT ELEMENT_FACTORY = XrRenderModelAssetCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelAssetCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelAssetCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelAssetCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelAssetCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrRenderModelAssetCreateInfoEXT.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code cacheId} field. */
        public XrUuidEXT cacheId() { return XrRenderModelAssetCreateInfoEXT.ncacheId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelAssetCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelAssetCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrRenderModelAssetCreateInfoEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelAssetCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrRenderModelAssetCreateInfoEXT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code cacheId} field. */
        public XrRenderModelAssetCreateInfoEXT.Buffer cacheId(XrUuidEXT value) { XrRenderModelAssetCreateInfoEXT.ncacheId(address(), value); return this; }
        /** Passes the {@code cacheId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRenderModelAssetCreateInfoEXT.Buffer cacheId(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(cacheId()); return this; }

    }

}