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
 * struct XrRenderModelLoadInfoFB {
 *     XrStructureType type;
 *     void * next;
 *     XrRenderModelKeyFB modelKey;
 * }}</pre>
 */
public class XrRenderModelLoadInfoFB extends Struct<XrRenderModelLoadInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MODELKEY;

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
        MODELKEY = layout.offsetof(2);
    }

    protected XrRenderModelLoadInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelLoadInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelLoadInfoFB(address, container);
    }

    /**
     * Creates a {@code XrRenderModelLoadInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelLoadInfoFB(ByteBuffer container) {
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
    /** @return the value of the {@code modelKey} field. */
    @NativeType("XrRenderModelKeyFB")
    public long modelKey() { return nmodelKey(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelLoadInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_LOAD_INFO_FB TYPE_RENDER_MODEL_LOAD_INFO_FB} value to the {@code type} field. */
    public XrRenderModelLoadInfoFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_LOAD_INFO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelLoadInfoFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code modelKey} field. */
    public XrRenderModelLoadInfoFB modelKey(@NativeType("XrRenderModelKeyFB") long value) { nmodelKey(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelLoadInfoFB set(
        int type,
        long next,
        long modelKey
    ) {
        type(type);
        next(next);
        modelKey(modelKey);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelLoadInfoFB set(XrRenderModelLoadInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelLoadInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelLoadInfoFB malloc() {
        return new XrRenderModelLoadInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelLoadInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelLoadInfoFB calloc() {
        return new XrRenderModelLoadInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelLoadInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelLoadInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelLoadInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelLoadInfoFB} instance for the specified memory address. */
    public static XrRenderModelLoadInfoFB create(long address) {
        return new XrRenderModelLoadInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelLoadInfoFB createSafe(long address) {
        return address == NULL ? null : new XrRenderModelLoadInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelLoadInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelLoadInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelLoadInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelLoadInfoFB malloc(MemoryStack stack) {
        return new XrRenderModelLoadInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelLoadInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelLoadInfoFB calloc(MemoryStack stack) {
        return new XrRenderModelLoadInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelLoadInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelLoadInfoFB.NEXT); }
    /** Unsafe version of {@link #modelKey}. */
    public static long nmodelKey(long struct) { return memGetLong(struct + XrRenderModelLoadInfoFB.MODELKEY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelLoadInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelLoadInfoFB.NEXT, value); }
    /** Unsafe version of {@link #modelKey(long) modelKey}. */
    public static void nmodelKey(long struct, long value) { memPutLong(struct + XrRenderModelLoadInfoFB.MODELKEY, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelLoadInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelLoadInfoFB, Buffer> implements NativeResource {

        private static final XrRenderModelLoadInfoFB ELEMENT_FACTORY = XrRenderModelLoadInfoFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelLoadInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelLoadInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelLoadInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelLoadInfoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelLoadInfoFB.nnext(address()); }
        /** @return the value of the {@code modelKey} field. */
        @NativeType("XrRenderModelKeyFB")
        public long modelKey() { return XrRenderModelLoadInfoFB.nmodelKey(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelLoadInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelLoadInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_LOAD_INFO_FB TYPE_RENDER_MODEL_LOAD_INFO_FB} value to the {@code type} field. */
        public XrRenderModelLoadInfoFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_LOAD_INFO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelLoadInfoFB.Buffer next(@NativeType("void *") long value) { XrRenderModelLoadInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code modelKey} field. */
        public XrRenderModelLoadInfoFB.Buffer modelKey(@NativeType("XrRenderModelKeyFB") long value) { XrRenderModelLoadInfoFB.nmodelKey(address(), value); return this; }

    }

}