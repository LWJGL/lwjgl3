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
 * struct XrRenderModelPathInfoFB {
 *     XrStructureType type;
 *     void * next;
 *     XrPath path;
 * }}</pre>
 */
public class XrRenderModelPathInfoFB extends Struct<XrRenderModelPathInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PATH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PATH = layout.offsetof(2);
    }

    protected XrRenderModelPathInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelPathInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelPathInfoFB(address, container);
    }

    /**
     * Creates a {@code XrRenderModelPathInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelPathInfoFB(ByteBuffer container) {
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
    /** @return the value of the {@code path} field. */
    @NativeType("XrPath")
    public long path() { return npath(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelPathInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PATH_INFO_FB TYPE_RENDER_MODEL_PATH_INFO_FB} value to the {@code type} field. */
    public XrRenderModelPathInfoFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_PATH_INFO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelPathInfoFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code path} field. */
    public XrRenderModelPathInfoFB path(@NativeType("XrPath") long value) { npath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelPathInfoFB set(
        int type,
        long next,
        long path
    ) {
        type(type);
        next(next);
        path(path);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelPathInfoFB set(XrRenderModelPathInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelPathInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelPathInfoFB malloc() {
        return new XrRenderModelPathInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelPathInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelPathInfoFB calloc() {
        return new XrRenderModelPathInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelPathInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelPathInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelPathInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelPathInfoFB} instance for the specified memory address. */
    public static XrRenderModelPathInfoFB create(long address) {
        return new XrRenderModelPathInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelPathInfoFB createSafe(long address) {
        return address == NULL ? null : new XrRenderModelPathInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelPathInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelPathInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelPathInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPathInfoFB malloc(MemoryStack stack) {
        return new XrRenderModelPathInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelPathInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPathInfoFB calloc(MemoryStack stack) {
        return new XrRenderModelPathInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelPathInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelPathInfoFB.NEXT); }
    /** Unsafe version of {@link #path}. */
    public static long npath(long struct) { return memGetLong(struct + XrRenderModelPathInfoFB.PATH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelPathInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelPathInfoFB.NEXT, value); }
    /** Unsafe version of {@link #path(long) path}. */
    public static void npath(long struct, long value) { memPutLong(struct + XrRenderModelPathInfoFB.PATH, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelPathInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelPathInfoFB, Buffer> implements NativeResource {

        private static final XrRenderModelPathInfoFB ELEMENT_FACTORY = XrRenderModelPathInfoFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelPathInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelPathInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelPathInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelPathInfoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelPathInfoFB.nnext(address()); }
        /** @return the value of the {@code path} field. */
        @NativeType("XrPath")
        public long path() { return XrRenderModelPathInfoFB.npath(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelPathInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelPathInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PATH_INFO_FB TYPE_RENDER_MODEL_PATH_INFO_FB} value to the {@code type} field. */
        public XrRenderModelPathInfoFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_PATH_INFO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelPathInfoFB.Buffer next(@NativeType("void *") long value) { XrRenderModelPathInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code path} field. */
        public XrRenderModelPathInfoFB.Buffer path(@NativeType("XrPath") long value) { XrRenderModelPathInfoFB.npath(address(), value); return this; }

    }

}