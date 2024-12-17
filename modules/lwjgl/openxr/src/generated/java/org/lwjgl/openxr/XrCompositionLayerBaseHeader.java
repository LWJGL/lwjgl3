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
 * struct XrCompositionLayerBaseHeader {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags layerFlags;
 *     XrSpace space;
 * }}</pre>
 */
public class XrCompositionLayerBaseHeader extends Struct<XrCompositionLayerBaseHeader> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS,
        SPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
    }

    protected XrCompositionLayerBaseHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerBaseHeader create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerBaseHeader(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerBaseHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerBaseHeader(ByteBuffer container) {
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
    /** @return the value of the {@code layerFlags} field. */
    @NativeType("XrCompositionLayerFlags")
    public long layerFlags() { return nlayerFlags(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerBaseHeader type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerBaseHeader next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrCompositionLayerAlphaBlendFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerAlphaBlendFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerColorScaleBiasKHR} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerColorScaleBiasKHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerDepthTestFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerDepthTestFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerImageLayoutFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerImageLayoutFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerSecureContentFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerSecureContentFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerSettingsFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerSettingsFB value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerBaseHeader layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerBaseHeader space(XrSpace value) { nspace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerBaseHeader set(
        int type,
        long next,
        long layerFlags,
        XrSpace space
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerBaseHeader set(XrCompositionLayerBaseHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerBaseHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerBaseHeader malloc() {
        return new XrCompositionLayerBaseHeader(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerBaseHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerBaseHeader calloc() {
        return new XrCompositionLayerBaseHeader(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerBaseHeader} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerBaseHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerBaseHeader(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerBaseHeader} instance for the specified memory address. */
    public static XrCompositionLayerBaseHeader create(long address) {
        return new XrCompositionLayerBaseHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerBaseHeader createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerBaseHeader(address, null);
    }

    /** Upcasts the specified {@code XrCompositionLayerProjection} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerProjection value) {
        return new XrCompositionLayerBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCompositionLayerQuad} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerQuad value) {
        return new XrCompositionLayerBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCompositionLayerCubeKHR} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerCubeKHR value) {
        return new XrCompositionLayerBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCompositionLayerCylinderKHR} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerCylinderKHR value) {
        return new XrCompositionLayerBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCompositionLayerEquirectKHR} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerEquirectKHR value) {
        return new XrCompositionLayerBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCompositionLayerEquirect2KHR} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerEquirect2KHR value) {
        return new XrCompositionLayerBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCompositionLayerPassthroughFB} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerPassthroughFB value) {
        return new XrCompositionLayerBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCompositionLayerPassthroughHTC} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerPassthroughHTC value) {
        return new XrCompositionLayerBaseHeader(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerBaseHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerBaseHeader.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrCompositionLayerProjection.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerProjection.Buffer value) {
        return new XrCompositionLayerBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCompositionLayerQuad.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerQuad.Buffer value) {
        return new XrCompositionLayerBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCompositionLayerCubeKHR.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerCubeKHR.Buffer value) {
        return new XrCompositionLayerBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCompositionLayerCylinderKHR.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerCylinderKHR.Buffer value) {
        return new XrCompositionLayerBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCompositionLayerEquirectKHR.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerEquirectKHR.Buffer value) {
        return new XrCompositionLayerBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCompositionLayerEquirect2KHR.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerEquirect2KHR.Buffer value) {
        return new XrCompositionLayerBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCompositionLayerPassthroughFB.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerPassthroughFB.Buffer value) {
        return new XrCompositionLayerBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCompositionLayerPassthroughHTC.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerPassthroughHTC.Buffer value) {
        return new XrCompositionLayerBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCompositionLayerBaseHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerBaseHeader malloc(MemoryStack stack) {
        return new XrCompositionLayerBaseHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerBaseHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerBaseHeader calloc(MemoryStack stack) {
        return new XrCompositionLayerBaseHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerBaseHeader.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerBaseHeader.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return memGetLong(struct + XrCompositionLayerBaseHeader.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerBaseHeader.SPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerBaseHeader.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerBaseHeader.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { memPutLong(struct + XrCompositionLayerBaseHeader.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerBaseHeader.SPACE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerBaseHeader.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerBaseHeader} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerBaseHeader, Buffer> implements NativeResource {

        private static final XrCompositionLayerBaseHeader ELEMENT_FACTORY = XrCompositionLayerBaseHeader.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerBaseHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerBaseHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerBaseHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerBaseHeader.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerBaseHeader.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerBaseHeader.nlayerFlags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerBaseHeader.nspace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerBaseHeader.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerBaseHeader.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerBaseHeader.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerBaseHeader.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrCompositionLayerAlphaBlendFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerAlphaBlendFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerColorScaleBiasKHR} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerColorScaleBiasKHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerDepthTestFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerDepthTestFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerImageLayoutFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerImageLayoutFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerSecureContentFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerSecureContentFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerSettingsFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerSettingsFB value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerBaseHeader.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerBaseHeader.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerBaseHeader.Buffer space(XrSpace value) { XrCompositionLayerBaseHeader.nspace(address(), value); return this; }

    }

}