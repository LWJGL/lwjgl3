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
 * struct XrCompositionLayerPassthroughFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags flags;
 *     XrSpace space;
 *     XrPassthroughLayerFB layerHandle;
 * }}</pre>
 */
public class XrCompositionLayerPassthroughFB extends Struct<XrCompositionLayerPassthroughFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS,
        SPACE,
        LAYERHANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        LAYERHANDLE = layout.offsetof(4);
    }

    protected XrCompositionLayerPassthroughFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerPassthroughFB create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerPassthroughFB(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerPassthroughFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerPassthroughFB(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("XrCompositionLayerFlags")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code layerHandle} field. */
    @NativeType("XrPassthroughLayerFB")
    public long layerHandle() { return nlayerHandle(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerPassthroughFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB} value to the {@code type} field. */
    public XrCompositionLayerPassthroughFB type$Default() { return type(FBPassthrough.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerPassthroughFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrCompositionLayerPassthroughFB flags(@NativeType("XrCompositionLayerFlags") long value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerPassthroughFB space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code layerHandle} field. */
    public XrCompositionLayerPassthroughFB layerHandle(XrPassthroughLayerFB value) { nlayerHandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerPassthroughFB set(
        int type,
        long next,
        long flags,
        XrSpace space,
        XrPassthroughLayerFB layerHandle
    ) {
        type(type);
        next(next);
        flags(flags);
        space(space);
        layerHandle(layerHandle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerPassthroughFB set(XrCompositionLayerPassthroughFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughFB malloc() {
        return new XrCompositionLayerPassthroughFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughFB calloc() {
        return new XrCompositionLayerPassthroughFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerPassthroughFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerPassthroughFB(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughFB} instance for the specified memory address. */
    public static XrCompositionLayerPassthroughFB create(long address) {
        return new XrCompositionLayerPassthroughFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerPassthroughFB createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerPassthroughFB(address, null);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerPassthroughFB}. */
    public static XrCompositionLayerPassthroughFB create(XrCompositionLayerBaseHeader value) {
        return new XrCompositionLayerPassthroughFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerPassthroughFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerPassthroughFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerPassthroughFB.Buffer}. */
    public static XrCompositionLayerPassthroughFB.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return new XrCompositionLayerPassthroughFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughFB malloc(MemoryStack stack) {
        return new XrCompositionLayerPassthroughFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughFB calloc(MemoryStack stack) {
        return new XrCompositionLayerPassthroughFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerPassthroughFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughFB.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrCompositionLayerPassthroughFB.FLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughFB.SPACE); }
    /** Unsafe version of {@link #layerHandle}. */
    public static long nlayerHandle(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughFB.LAYERHANDLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerPassthroughFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerPassthroughFB.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrCompositionLayerPassthroughFB.FLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerPassthroughFB.SPACE, value.address()); }
    /** Unsafe version of {@link #layerHandle(XrPassthroughLayerFB) layerHandle}. */
    public static void nlayerHandle(long struct, XrPassthroughLayerFB value) { memPutAddress(struct + XrCompositionLayerPassthroughFB.LAYERHANDLE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerPassthroughFB.SPACE));
        check(memGetAddress(struct + XrCompositionLayerPassthroughFB.LAYERHANDLE));
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerPassthroughFB} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerPassthroughFB, Buffer> implements NativeResource {

        private static final XrCompositionLayerPassthroughFB ELEMENT_FACTORY = XrCompositionLayerPassthroughFB.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerPassthroughFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerPassthroughFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerPassthroughFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerPassthroughFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerPassthroughFB.nnext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long flags() { return XrCompositionLayerPassthroughFB.nflags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerPassthroughFB.nspace(address()); }
        /** @return the value of the {@code layerHandle} field. */
        @NativeType("XrPassthroughLayerFB")
        public long layerHandle() { return XrCompositionLayerPassthroughFB.nlayerHandle(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerPassthroughFB.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerPassthroughFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB} value to the {@code type} field. */
        public XrCompositionLayerPassthroughFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerPassthroughFB.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerPassthroughFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrCompositionLayerPassthroughFB.Buffer flags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerPassthroughFB.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerPassthroughFB.Buffer space(XrSpace value) { XrCompositionLayerPassthroughFB.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code layerHandle} field. */
        public XrCompositionLayerPassthroughFB.Buffer layerHandle(XrPassthroughLayerFB value) { XrCompositionLayerPassthroughFB.nlayerHandle(address(), value); return this; }

    }

}