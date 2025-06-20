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
 * struct XrRenderModelAssetPropertiesGetInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrRenderModelAssetPropertiesGetInfoEXT extends Struct<XrRenderModelAssetPropertiesGetInfoEXT> implements NativeResource {

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

    protected XrRenderModelAssetPropertiesGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelAssetPropertiesGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelAssetPropertiesGetInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelAssetPropertiesGetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelAssetPropertiesGetInfoEXT(ByteBuffer container) {
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
    public XrRenderModelAssetPropertiesGetInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT} value to the {@code type} field. */
    public XrRenderModelAssetPropertiesGetInfoEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelAssetPropertiesGetInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelAssetPropertiesGetInfoEXT set(
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
    public XrRenderModelAssetPropertiesGetInfoEXT set(XrRenderModelAssetPropertiesGetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelAssetPropertiesGetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetPropertiesGetInfoEXT malloc() {
        return new XrRenderModelAssetPropertiesGetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetPropertiesGetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetPropertiesGetInfoEXT calloc() {
        return new XrRenderModelAssetPropertiesGetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetPropertiesGetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelAssetPropertiesGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelAssetPropertiesGetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelAssetPropertiesGetInfoEXT} instance for the specified memory address. */
    public static XrRenderModelAssetPropertiesGetInfoEXT create(long address) {
        return new XrRenderModelAssetPropertiesGetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelAssetPropertiesGetInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelAssetPropertiesGetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesGetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesGetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesGetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesGetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelAssetPropertiesGetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesGetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelAssetPropertiesGetInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelAssetPropertiesGetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetPropertiesGetInfoEXT malloc(MemoryStack stack) {
        return new XrRenderModelAssetPropertiesGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelAssetPropertiesGetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetPropertiesGetInfoEXT calloc(MemoryStack stack) {
        return new XrRenderModelAssetPropertiesGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesGetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesGetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelAssetPropertiesGetInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelAssetPropertiesGetInfoEXT.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelAssetPropertiesGetInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelAssetPropertiesGetInfoEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelAssetPropertiesGetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelAssetPropertiesGetInfoEXT, Buffer> implements NativeResource {

        private static final XrRenderModelAssetPropertiesGetInfoEXT ELEMENT_FACTORY = XrRenderModelAssetPropertiesGetInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelAssetPropertiesGetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelAssetPropertiesGetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelAssetPropertiesGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelAssetPropertiesGetInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrRenderModelAssetPropertiesGetInfoEXT.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelAssetPropertiesGetInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelAssetPropertiesGetInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT} value to the {@code type} field. */
        public XrRenderModelAssetPropertiesGetInfoEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelAssetPropertiesGetInfoEXT.Buffer next(@NativeType("void const *") long value) { XrRenderModelAssetPropertiesGetInfoEXT.nnext(address(), value); return this; }

    }

}