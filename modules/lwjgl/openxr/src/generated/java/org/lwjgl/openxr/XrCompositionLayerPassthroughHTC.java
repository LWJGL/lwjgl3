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
 * struct XrCompositionLayerPassthroughHTC {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags layerFlags;
 *     XrSpace space;
 *     XrPassthroughHTC passthrough;
 *     {@link XrPassthroughColorHTC XrPassthroughColorHTC} color;
 * }}</pre>
 */
public class XrCompositionLayerPassthroughHTC extends Struct<XrCompositionLayerPassthroughHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS,
        SPACE,
        PASSTHROUGH,
        COLOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPassthroughColorHTC.SIZEOF, XrPassthroughColorHTC.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        PASSTHROUGH = layout.offsetof(4);
        COLOR = layout.offsetof(5);
    }

    protected XrCompositionLayerPassthroughHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerPassthroughHTC create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerPassthroughHTC(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerPassthroughHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerPassthroughHTC(ByteBuffer container) {
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
    /** @return the value of the {@code passthrough} field. */
    @NativeType("XrPassthroughHTC")
    public long passthrough() { return npassthrough(address()); }
    /** @return a {@link XrPassthroughColorHTC} view of the {@code color} field. */
    public XrPassthroughColorHTC color() { return ncolor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerPassthroughHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC} value to the {@code type} field. */
    public XrCompositionLayerPassthroughHTC type$Default() { return type(HTCPassthrough.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerPassthroughHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrPassthroughMeshTransformInfoHTC} value to the {@code next} chain. */
    public XrCompositionLayerPassthroughHTC next(XrPassthroughMeshTransformInfoHTC value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerPassthroughHTC layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerPassthroughHTC space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code passthrough} field. */
    public XrCompositionLayerPassthroughHTC passthrough(XrPassthroughHTC value) { npassthrough(address(), value); return this; }
    /** Copies the specified {@link XrPassthroughColorHTC} to the {@code color} field. */
    public XrCompositionLayerPassthroughHTC color(XrPassthroughColorHTC value) { ncolor(address(), value); return this; }
    /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerPassthroughHTC color(java.util.function.Consumer<XrPassthroughColorHTC> consumer) { consumer.accept(color()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerPassthroughHTC set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        XrPassthroughHTC passthrough,
        XrPassthroughColorHTC color
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        passthrough(passthrough);
        color(color);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerPassthroughHTC set(XrCompositionLayerPassthroughHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughHTC malloc() {
        return new XrCompositionLayerPassthroughHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughHTC calloc() {
        return new XrCompositionLayerPassthroughHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerPassthroughHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerPassthroughHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughHTC} instance for the specified memory address. */
    public static XrCompositionLayerPassthroughHTC create(long address) {
        return new XrCompositionLayerPassthroughHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerPassthroughHTC createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerPassthroughHTC(address, null);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerPassthroughHTC}. */
    public static XrCompositionLayerPassthroughHTC create(XrCompositionLayerBaseHeader value) {
        return new XrCompositionLayerPassthroughHTC(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerPassthroughHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerPassthroughHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerPassthroughHTC.Buffer}. */
    public static XrCompositionLayerPassthroughHTC.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return new XrCompositionLayerPassthroughHTC.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughHTC malloc(MemoryStack stack) {
        return new XrCompositionLayerPassthroughHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughHTC calloc(MemoryStack stack) {
        return new XrCompositionLayerPassthroughHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerPassthroughHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughHTC.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return memGetLong(struct + XrCompositionLayerPassthroughHTC.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughHTC.SPACE); }
    /** Unsafe version of {@link #passthrough}. */
    public static long npassthrough(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughHTC.PASSTHROUGH); }
    /** Unsafe version of {@link #color}. */
    public static XrPassthroughColorHTC ncolor(long struct) { return XrPassthroughColorHTC.create(struct + XrCompositionLayerPassthroughHTC.COLOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerPassthroughHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerPassthroughHTC.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { memPutLong(struct + XrCompositionLayerPassthroughHTC.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerPassthroughHTC.SPACE, value.address()); }
    /** Unsafe version of {@link #passthrough(XrPassthroughHTC) passthrough}. */
    public static void npassthrough(long struct, XrPassthroughHTC value) { memPutAddress(struct + XrCompositionLayerPassthroughHTC.PASSTHROUGH, value.address()); }
    /** Unsafe version of {@link #color(XrPassthroughColorHTC) color}. */
    public static void ncolor(long struct, XrPassthroughColorHTC value) { memCopy(value.address(), struct + XrCompositionLayerPassthroughHTC.COLOR, XrPassthroughColorHTC.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerPassthroughHTC.SPACE));
        check(memGetAddress(struct + XrCompositionLayerPassthroughHTC.PASSTHROUGH));
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerPassthroughHTC} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerPassthroughHTC, Buffer> implements NativeResource {

        private static final XrCompositionLayerPassthroughHTC ELEMENT_FACTORY = XrCompositionLayerPassthroughHTC.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerPassthroughHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerPassthroughHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerPassthroughHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerPassthroughHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerPassthroughHTC.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerPassthroughHTC.nlayerFlags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerPassthroughHTC.nspace(address()); }
        /** @return the value of the {@code passthrough} field. */
        @NativeType("XrPassthroughHTC")
        public long passthrough() { return XrCompositionLayerPassthroughHTC.npassthrough(address()); }
        /** @return a {@link XrPassthroughColorHTC} view of the {@code color} field. */
        public XrPassthroughColorHTC color() { return XrCompositionLayerPassthroughHTC.ncolor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerPassthroughHTC.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerPassthroughHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC} value to the {@code type} field. */
        public XrCompositionLayerPassthroughHTC.Buffer type$Default() { return type(HTCPassthrough.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerPassthroughHTC.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerPassthroughHTC.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrPassthroughMeshTransformInfoHTC} value to the {@code next} chain. */
        public XrCompositionLayerPassthroughHTC.Buffer next(XrPassthroughMeshTransformInfoHTC value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerPassthroughHTC.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerPassthroughHTC.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerPassthroughHTC.Buffer space(XrSpace value) { XrCompositionLayerPassthroughHTC.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code passthrough} field. */
        public XrCompositionLayerPassthroughHTC.Buffer passthrough(XrPassthroughHTC value) { XrCompositionLayerPassthroughHTC.npassthrough(address(), value); return this; }
        /** Copies the specified {@link XrPassthroughColorHTC} to the {@code color} field. */
        public XrCompositionLayerPassthroughHTC.Buffer color(XrPassthroughColorHTC value) { XrCompositionLayerPassthroughHTC.ncolor(address(), value); return this; }
        /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerPassthroughHTC.Buffer color(java.util.function.Consumer<XrPassthroughColorHTC> consumer) { consumer.accept(color()); return this; }

    }

}