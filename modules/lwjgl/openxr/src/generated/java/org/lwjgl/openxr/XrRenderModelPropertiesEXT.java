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
 * struct XrRenderModelPropertiesEXT {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrUuidEXT XrUuidEXT} cacheId;
 *     uint32_t animatableNodeCount;
 * }}</pre>
 */
public class XrRenderModelPropertiesEXT extends Struct<XrRenderModelPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CACHEID,
        ANIMATABLENODECOUNT;

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
        CACHEID = layout.offsetof(2);
        ANIMATABLENODECOUNT = layout.offsetof(3);
    }

    protected XrRenderModelPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelPropertiesEXT(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code cacheId} field. */
    public XrUuidEXT cacheId() { return ncacheId(address()); }
    /** @return the value of the {@code animatableNodeCount} field. */
    @NativeType("uint32_t")
    public int animatableNodeCount() { return nanimatableNodeCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelPropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_PROPERTIES_EXT TYPE_RENDER_MODEL_PROPERTIES_EXT} value to the {@code type} field. */
    public XrRenderModelPropertiesEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelPropertiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelPropertiesEXT set(
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
    public XrRenderModelPropertiesEXT set(XrRenderModelPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelPropertiesEXT malloc() {
        return new XrRenderModelPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelPropertiesEXT calloc() {
        return new XrRenderModelPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelPropertiesEXT} instance for the specified memory address. */
    public static XrRenderModelPropertiesEXT create(long address) {
        return new XrRenderModelPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPropertiesEXT malloc(MemoryStack stack) {
        return new XrRenderModelPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPropertiesEXT calloc(MemoryStack stack) {
        return new XrRenderModelPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelPropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelPropertiesEXT.NEXT); }
    /** Unsafe version of {@link #cacheId}. */
    public static XrUuidEXT ncacheId(long struct) { return XrUuidEXT.create(struct + XrRenderModelPropertiesEXT.CACHEID); }
    /** Unsafe version of {@link #animatableNodeCount}. */
    public static int nanimatableNodeCount(long struct) { return memGetInt(struct + XrRenderModelPropertiesEXT.ANIMATABLENODECOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelPropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelPropertiesEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelPropertiesEXT, Buffer> implements NativeResource {

        private static final XrRenderModelPropertiesEXT ELEMENT_FACTORY = XrRenderModelPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelPropertiesEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelPropertiesEXT.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code cacheId} field. */
        public XrUuidEXT cacheId() { return XrRenderModelPropertiesEXT.ncacheId(address()); }
        /** @return the value of the {@code animatableNodeCount} field. */
        @NativeType("uint32_t")
        public int animatableNodeCount() { return XrRenderModelPropertiesEXT.nanimatableNodeCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelPropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelPropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_PROPERTIES_EXT TYPE_RENDER_MODEL_PROPERTIES_EXT} value to the {@code type} field. */
        public XrRenderModelPropertiesEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelPropertiesEXT.Buffer next(@NativeType("void *") long value) { XrRenderModelPropertiesEXT.nnext(address(), value); return this; }

    }

}