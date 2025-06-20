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
 * struct XrRenderModelSpaceCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrRenderModelEXT renderModel;
 * }}</pre>
 */
public class XrRenderModelSpaceCreateInfoEXT extends Struct<XrRenderModelSpaceCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RENDERMODEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RENDERMODEL = layout.offsetof(2);
    }

    protected XrRenderModelSpaceCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelSpaceCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelSpaceCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelSpaceCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelSpaceCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code renderModel} field. */
    @NativeType("XrRenderModelEXT")
    public long renderModel() { return nrenderModel(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelSpaceCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrRenderModelSpaceCreateInfoEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelSpaceCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code renderModel} field. */
    public XrRenderModelSpaceCreateInfoEXT renderModel(XrRenderModelEXT value) { nrenderModel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelSpaceCreateInfoEXT set(
        int type,
        long next,
        XrRenderModelEXT renderModel
    ) {
        type(type);
        next(next);
        renderModel(renderModel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelSpaceCreateInfoEXT set(XrRenderModelSpaceCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelSpaceCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelSpaceCreateInfoEXT malloc() {
        return new XrRenderModelSpaceCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelSpaceCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelSpaceCreateInfoEXT calloc() {
        return new XrRenderModelSpaceCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelSpaceCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelSpaceCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelSpaceCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelSpaceCreateInfoEXT} instance for the specified memory address. */
    public static XrRenderModelSpaceCreateInfoEXT create(long address) {
        return new XrRenderModelSpaceCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelSpaceCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelSpaceCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelSpaceCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelSpaceCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelSpaceCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelSpaceCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelSpaceCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelSpaceCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelSpaceCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelSpaceCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelSpaceCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelSpaceCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelSpaceCreateInfoEXT malloc(MemoryStack stack) {
        return new XrRenderModelSpaceCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelSpaceCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelSpaceCreateInfoEXT calloc(MemoryStack stack) {
        return new XrRenderModelSpaceCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelSpaceCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelSpaceCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelSpaceCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelSpaceCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelSpaceCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelSpaceCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #renderModel}. */
    public static long nrenderModel(long struct) { return memGetAddress(struct + XrRenderModelSpaceCreateInfoEXT.RENDERMODEL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelSpaceCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelSpaceCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #renderModel(XrRenderModelEXT) renderModel}. */
    public static void nrenderModel(long struct, XrRenderModelEXT value) { memPutAddress(struct + XrRenderModelSpaceCreateInfoEXT.RENDERMODEL, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrRenderModelSpaceCreateInfoEXT.RENDERMODEL));
    }

    // -----------------------------------

    /** An array of {@link XrRenderModelSpaceCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelSpaceCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrRenderModelSpaceCreateInfoEXT ELEMENT_FACTORY = XrRenderModelSpaceCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelSpaceCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelSpaceCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelSpaceCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelSpaceCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrRenderModelSpaceCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code renderModel} field. */
        @NativeType("XrRenderModelEXT")
        public long renderModel() { return XrRenderModelSpaceCreateInfoEXT.nrenderModel(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelSpaceCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelSpaceCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrRenderModelSpaceCreateInfoEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelSpaceCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrRenderModelSpaceCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code renderModel} field. */
        public XrRenderModelSpaceCreateInfoEXT.Buffer renderModel(XrRenderModelEXT value) { XrRenderModelSpaceCreateInfoEXT.nrenderModel(address(), value); return this; }

    }

}