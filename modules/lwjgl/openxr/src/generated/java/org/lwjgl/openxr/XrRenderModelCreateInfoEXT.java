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
 * struct XrRenderModelCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrRenderModelIdEXT renderModelId;
 *     uint32_t gltfExtensionCount;
 *     char const * const * gltfExtensions;
 * }}</pre>
 */
public class XrRenderModelCreateInfoEXT extends Struct<XrRenderModelCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RENDERMODELID,
        GLTFEXTENSIONCOUNT,
        GLTFEXTENSIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RENDERMODELID = layout.offsetof(2);
        GLTFEXTENSIONCOUNT = layout.offsetof(3);
        GLTFEXTENSIONS = layout.offsetof(4);
    }

    protected XrRenderModelCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code renderModelId} field. */
    @NativeType("XrRenderModelIdEXT")
    public long renderModelId() { return nrenderModelId(address()); }
    /** @return the value of the {@code gltfExtensionCount} field. */
    @NativeType("uint32_t")
    public int gltfExtensionCount() { return ngltfExtensionCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code gltfExtensions} field. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer gltfExtensions() { return ngltfExtensions(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_CREATE_INFO_EXT TYPE_RENDER_MODEL_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrRenderModelCreateInfoEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code renderModelId} field. */
    public XrRenderModelCreateInfoEXT renderModelId(@NativeType("XrRenderModelIdEXT") long value) { nrenderModelId(address(), value); return this; }
    /** Sets the specified value to the {@code gltfExtensionCount} field. */
    public XrRenderModelCreateInfoEXT gltfExtensionCount(@NativeType("uint32_t") int value) { ngltfExtensionCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code gltfExtensions} field. */
    public XrRenderModelCreateInfoEXT gltfExtensions(@Nullable @NativeType("char const * const *") PointerBuffer value) { ngltfExtensions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelCreateInfoEXT set(
        int type,
        long next,
        long renderModelId,
        int gltfExtensionCount,
        @Nullable PointerBuffer gltfExtensions
    ) {
        type(type);
        next(next);
        renderModelId(renderModelId);
        gltfExtensionCount(gltfExtensionCount);
        gltfExtensions(gltfExtensions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelCreateInfoEXT set(XrRenderModelCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelCreateInfoEXT malloc() {
        return new XrRenderModelCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelCreateInfoEXT calloc() {
        return new XrRenderModelCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelCreateInfoEXT} instance for the specified memory address. */
    public static XrRenderModelCreateInfoEXT create(long address) {
        return new XrRenderModelCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelCreateInfoEXT malloc(MemoryStack stack) {
        return new XrRenderModelCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelCreateInfoEXT calloc(MemoryStack stack) {
        return new XrRenderModelCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #renderModelId}. */
    public static long nrenderModelId(long struct) { return memGetLong(struct + XrRenderModelCreateInfoEXT.RENDERMODELID); }
    /** Unsafe version of {@link #gltfExtensionCount}. */
    public static int ngltfExtensionCount(long struct) { return memGetInt(struct + XrRenderModelCreateInfoEXT.GLTFEXTENSIONCOUNT); }
    /** Unsafe version of {@link #gltfExtensions() gltfExtensions}. */
    public static @Nullable PointerBuffer ngltfExtensions(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrRenderModelCreateInfoEXT.GLTFEXTENSIONS), ngltfExtensionCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #renderModelId(long) renderModelId}. */
    public static void nrenderModelId(long struct, long value) { memPutLong(struct + XrRenderModelCreateInfoEXT.RENDERMODELID, value); }
    /** Sets the specified value to the {@code gltfExtensionCount} field of the specified {@code struct}. */
    public static void ngltfExtensionCount(long struct, int value) { memPutInt(struct + XrRenderModelCreateInfoEXT.GLTFEXTENSIONCOUNT, value); }
    /** Unsafe version of {@link #gltfExtensions(PointerBuffer) gltfExtensions}. */
    public static void ngltfExtensions(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrRenderModelCreateInfoEXT.GLTFEXTENSIONS, memAddressSafe(value)); if (value != null) { ngltfExtensionCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRenderModelCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrRenderModelCreateInfoEXT ELEMENT_FACTORY = XrRenderModelCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrRenderModelCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code renderModelId} field. */
        @NativeType("XrRenderModelIdEXT")
        public long renderModelId() { return XrRenderModelCreateInfoEXT.nrenderModelId(address()); }
        /** @return the value of the {@code gltfExtensionCount} field. */
        @NativeType("uint32_t")
        public int gltfExtensionCount() { return XrRenderModelCreateInfoEXT.ngltfExtensionCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code gltfExtensions} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer gltfExtensions() { return XrRenderModelCreateInfoEXT.ngltfExtensions(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_CREATE_INFO_EXT TYPE_RENDER_MODEL_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrRenderModelCreateInfoEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrRenderModelCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code renderModelId} field. */
        public XrRenderModelCreateInfoEXT.Buffer renderModelId(@NativeType("XrRenderModelIdEXT") long value) { XrRenderModelCreateInfoEXT.nrenderModelId(address(), value); return this; }
        /** Sets the specified value to the {@code gltfExtensionCount} field. */
        public XrRenderModelCreateInfoEXT.Buffer gltfExtensionCount(@NativeType("uint32_t") int value) { XrRenderModelCreateInfoEXT.ngltfExtensionCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code gltfExtensions} field. */
        public XrRenderModelCreateInfoEXT.Buffer gltfExtensions(@Nullable @NativeType("char const * const *") PointerBuffer value) { XrRenderModelCreateInfoEXT.ngltfExtensions(address(), value); return this; }

    }

}