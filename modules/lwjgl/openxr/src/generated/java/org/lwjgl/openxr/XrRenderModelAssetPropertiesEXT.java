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
 * struct XrRenderModelAssetPropertiesEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t nodePropertyCount;
 *     {@link XrRenderModelAssetNodePropertiesEXT XrRenderModelAssetNodePropertiesEXT} * nodeProperties;
 * }}</pre>
 */
public class XrRenderModelAssetPropertiesEXT extends Struct<XrRenderModelAssetPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NODEPROPERTYCOUNT,
        NODEPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NODEPROPERTYCOUNT = layout.offsetof(2);
        NODEPROPERTIES = layout.offsetof(3);
    }

    protected XrRenderModelAssetPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelAssetPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelAssetPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelAssetPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelAssetPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code nodePropertyCount} field. */
    @NativeType("uint32_t")
    public int nodePropertyCount() { return nnodePropertyCount(address()); }
    /** @return a {@link XrRenderModelAssetNodePropertiesEXT.Buffer} view of the struct array pointed to by the {@code nodeProperties} field. */
    @NativeType("XrRenderModelAssetNodePropertiesEXT *")
    public XrRenderModelAssetNodePropertiesEXT.Buffer nodeProperties() { return nnodeProperties(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelAssetPropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT} value to the {@code type} field. */
    public XrRenderModelAssetPropertiesEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelAssetPropertiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrRenderModelAssetNodePropertiesEXT.Buffer} to the {@code nodeProperties} field. */
    public XrRenderModelAssetPropertiesEXT nodeProperties(@NativeType("XrRenderModelAssetNodePropertiesEXT *") XrRenderModelAssetNodePropertiesEXT.Buffer value) { nnodeProperties(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelAssetPropertiesEXT set(
        int type,
        long next,
        XrRenderModelAssetNodePropertiesEXT.Buffer nodeProperties
    ) {
        type(type);
        next(next);
        nodeProperties(nodeProperties);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelAssetPropertiesEXT set(XrRenderModelAssetPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelAssetPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetPropertiesEXT malloc() {
        return new XrRenderModelAssetPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetPropertiesEXT calloc() {
        return new XrRenderModelAssetPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelAssetPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelAssetPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelAssetPropertiesEXT} instance for the specified memory address. */
    public static XrRenderModelAssetPropertiesEXT create(long address) {
        return new XrRenderModelAssetPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelAssetPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelAssetPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelAssetPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelAssetPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelAssetPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetPropertiesEXT malloc(MemoryStack stack) {
        return new XrRenderModelAssetPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelAssetPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetPropertiesEXT calloc(MemoryStack stack) {
        return new XrRenderModelAssetPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelAssetPropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelAssetPropertiesEXT.NEXT); }
    /** Unsafe version of {@link #nodePropertyCount}. */
    public static int nnodePropertyCount(long struct) { return memGetInt(struct + XrRenderModelAssetPropertiesEXT.NODEPROPERTYCOUNT); }
    /** Unsafe version of {@link #nodeProperties}. */
    public static XrRenderModelAssetNodePropertiesEXT.Buffer nnodeProperties(long struct) { return XrRenderModelAssetNodePropertiesEXT.create(memGetAddress(struct + XrRenderModelAssetPropertiesEXT.NODEPROPERTIES), nnodePropertyCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelAssetPropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelAssetPropertiesEXT.NEXT, value); }
    /** Sets the specified value to the {@code nodePropertyCount} field of the specified {@code struct}. */
    public static void nnodePropertyCount(long struct, int value) { memPutInt(struct + XrRenderModelAssetPropertiesEXT.NODEPROPERTYCOUNT, value); }
    /** Unsafe version of {@link #nodeProperties(XrRenderModelAssetNodePropertiesEXT.Buffer) nodeProperties}. */
    public static void nnodeProperties(long struct, XrRenderModelAssetNodePropertiesEXT.Buffer value) { memPutAddress(struct + XrRenderModelAssetPropertiesEXT.NODEPROPERTIES, value.address()); nnodePropertyCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrRenderModelAssetPropertiesEXT.NODEPROPERTIES));
    }

    // -----------------------------------

    /** An array of {@link XrRenderModelAssetPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelAssetPropertiesEXT, Buffer> implements NativeResource {

        private static final XrRenderModelAssetPropertiesEXT ELEMENT_FACTORY = XrRenderModelAssetPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelAssetPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelAssetPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelAssetPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelAssetPropertiesEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelAssetPropertiesEXT.nnext(address()); }
        /** @return the value of the {@code nodePropertyCount} field. */
        @NativeType("uint32_t")
        public int nodePropertyCount() { return XrRenderModelAssetPropertiesEXT.nnodePropertyCount(address()); }
        /** @return a {@link XrRenderModelAssetNodePropertiesEXT.Buffer} view of the struct array pointed to by the {@code nodeProperties} field. */
        @NativeType("XrRenderModelAssetNodePropertiesEXT *")
        public XrRenderModelAssetNodePropertiesEXT.Buffer nodeProperties() { return XrRenderModelAssetPropertiesEXT.nnodeProperties(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelAssetPropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelAssetPropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT} value to the {@code type} field. */
        public XrRenderModelAssetPropertiesEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelAssetPropertiesEXT.Buffer next(@NativeType("void *") long value) { XrRenderModelAssetPropertiesEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrRenderModelAssetNodePropertiesEXT.Buffer} to the {@code nodeProperties} field. */
        public XrRenderModelAssetPropertiesEXT.Buffer nodeProperties(@NativeType("XrRenderModelAssetNodePropertiesEXT *") XrRenderModelAssetNodePropertiesEXT.Buffer value) { XrRenderModelAssetPropertiesEXT.nnodeProperties(address(), value); return this; }

    }

}