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

import static org.lwjgl.openxr.EXTRenderModel.*;

/**
 * <pre>{@code
 * struct XrRenderModelAssetNodePropertiesEXT {
 *     char uniqueName[XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT];
 * }}</pre>
 */
public class XrRenderModelAssetNodePropertiesEXT extends Struct<XrRenderModelAssetNodePropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNIQUENAME;

    static {
        Layout layout = __struct(
            __array(1, XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNIQUENAME = layout.offsetof(0);
    }

    protected XrRenderModelAssetNodePropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelAssetNodePropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelAssetNodePropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelAssetNodePropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelAssetNodePropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code uniqueName} field. */
    @NativeType("char[XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT]")
    public ByteBuffer uniqueName() { return nuniqueName(address()); }
    /** @return the null-terminated string stored in the {@code uniqueName} field. */
    @NativeType("char[XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT]")
    public String uniqueNameString() { return nuniqueNameString(address()); }

    /** Copies the specified encoded string to the {@code uniqueName} field. */
    public XrRenderModelAssetNodePropertiesEXT uniqueName(@NativeType("char[XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT]") ByteBuffer value) { nuniqueName(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelAssetNodePropertiesEXT set(XrRenderModelAssetNodePropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelAssetNodePropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetNodePropertiesEXT malloc() {
        return new XrRenderModelAssetNodePropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetNodePropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetNodePropertiesEXT calloc() {
        return new XrRenderModelAssetNodePropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetNodePropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelAssetNodePropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelAssetNodePropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelAssetNodePropertiesEXT} instance for the specified memory address. */
    public static XrRenderModelAssetNodePropertiesEXT create(long address) {
        return new XrRenderModelAssetNodePropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelAssetNodePropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelAssetNodePropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetNodePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetNodePropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetNodePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetNodePropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetNodePropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetNodePropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelAssetNodePropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetNodePropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelAssetNodePropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelAssetNodePropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetNodePropertiesEXT malloc(MemoryStack stack) {
        return new XrRenderModelAssetNodePropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelAssetNodePropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetNodePropertiesEXT calloc(MemoryStack stack) {
        return new XrRenderModelAssetNodePropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetNodePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetNodePropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetNodePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetNodePropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #uniqueName}. */
    public static ByteBuffer nuniqueName(long struct) { return memByteBuffer(struct + XrRenderModelAssetNodePropertiesEXT.UNIQUENAME, XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT); }
    /** Unsafe version of {@link #uniqueNameString}. */
    public static String nuniqueNameString(long struct) { return memUTF8(struct + XrRenderModelAssetNodePropertiesEXT.UNIQUENAME); }

    /** Unsafe version of {@link #uniqueName(ByteBuffer) uniqueName}. */
    public static void nuniqueName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT);
        }
        memCopy(memAddress(value), struct + XrRenderModelAssetNodePropertiesEXT.UNIQUENAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link XrRenderModelAssetNodePropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelAssetNodePropertiesEXT, Buffer> implements NativeResource {

        private static final XrRenderModelAssetNodePropertiesEXT ELEMENT_FACTORY = XrRenderModelAssetNodePropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelAssetNodePropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelAssetNodePropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelAssetNodePropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code uniqueName} field. */
        @NativeType("char[XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT]")
        public ByteBuffer uniqueName() { return XrRenderModelAssetNodePropertiesEXT.nuniqueName(address()); }
        /** @return the null-terminated string stored in the {@code uniqueName} field. */
        @NativeType("char[XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT]")
        public String uniqueNameString() { return XrRenderModelAssetNodePropertiesEXT.nuniqueNameString(address()); }

        /** Copies the specified encoded string to the {@code uniqueName} field. */
        public XrRenderModelAssetNodePropertiesEXT.Buffer uniqueName(@NativeType("char[XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT]") ByteBuffer value) { XrRenderModelAssetNodePropertiesEXT.nuniqueName(address(), value); return this; }

    }

}