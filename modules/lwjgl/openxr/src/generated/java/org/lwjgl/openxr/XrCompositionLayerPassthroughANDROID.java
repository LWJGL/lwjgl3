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
 * <pre><code>
 * struct XrCompositionLayerPassthroughANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags layerFlags;
 *     XrSpace space;
 *     {@link XrPosef XrPosef} pose;
 *     {@link XrVector3f XrVector3f} scale;
 *     float opacity;
 *     XrPassthroughLayerANDROID layer;
 * }</code></pre>
 */
public class XrCompositionLayerPassthroughANDROID extends Struct<XrCompositionLayerPassthroughANDROID> implements NativeResource {

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
        POSE,
        SCALE,
        OPACITY,
        LAYER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        POSE = layout.offsetof(4);
        SCALE = layout.offsetof(5);
        OPACITY = layout.offsetof(6);
        LAYER = layout.offsetof(7);
    }

    protected XrCompositionLayerPassthroughANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerPassthroughANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerPassthroughANDROID(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerPassthroughANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerPassthroughANDROID(ByteBuffer container) {
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
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return a {@link XrVector3f} view of the {@code scale} field. */
    public XrVector3f scale() { return nscale(address()); }
    /** @return the value of the {@code opacity} field. */
    public float opacity() { return nopacity(address()); }
    /** @return the value of the {@code layer} field. */
    @NativeType("XrPassthroughLayerANDROID")
    public long layer() { return nlayer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerPassthroughANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDCompositionLayerPassthroughMesh#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_ANDROID TYPE_COMPOSITION_LAYER_PASSTHROUGH_ANDROID} value to the {@code type} field. */
    public XrCompositionLayerPassthroughANDROID type$Default() { return type(ANDROIDCompositionLayerPassthroughMesh.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerPassthroughANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerPassthroughANDROID layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerPassthroughANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrCompositionLayerPassthroughANDROID pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerPassthroughANDROID pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code scale} field. */
    public XrCompositionLayerPassthroughANDROID scale(XrVector3f value) { nscale(address(), value); return this; }
    /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerPassthroughANDROID scale(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(scale()); return this; }
    /** Sets the specified value to the {@code opacity} field. */
    public XrCompositionLayerPassthroughANDROID opacity(float value) { nopacity(address(), value); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public XrCompositionLayerPassthroughANDROID layer(XrPassthroughLayerANDROID value) { nlayer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerPassthroughANDROID set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        XrPosef pose,
        XrVector3f scale,
        float opacity,
        XrPassthroughLayerANDROID layer
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        pose(pose);
        scale(scale);
        opacity(opacity);
        layer(layer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerPassthroughANDROID set(XrCompositionLayerPassthroughANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerPassthroughANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughANDROID malloc() {
        return new XrCompositionLayerPassthroughANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughANDROID calloc() {
        return new XrCompositionLayerPassthroughANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughANDROID} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerPassthroughANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerPassthroughANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughANDROID} instance for the specified memory address. */
    public static XrCompositionLayerPassthroughANDROID create(long address) {
        return new XrCompositionLayerPassthroughANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerPassthroughANDROID createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerPassthroughANDROID(address, null);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerPassthroughANDROID}. */
    public static XrCompositionLayerPassthroughANDROID create(XrCompositionLayerBaseHeader value) {
        return new XrCompositionLayerPassthroughANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerPassthroughANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerPassthroughANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerPassthroughANDROID.Buffer}. */
    public static XrCompositionLayerPassthroughANDROID.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return new XrCompositionLayerPassthroughANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughANDROID malloc(MemoryStack stack) {
        return new XrCompositionLayerPassthroughANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughANDROID calloc(MemoryStack stack) {
        return new XrCompositionLayerPassthroughANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerPassthroughANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughANDROID.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return memGetLong(struct + XrCompositionLayerPassthroughANDROID.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughANDROID.SPACE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrCompositionLayerPassthroughANDROID.POSE); }
    /** Unsafe version of {@link #scale}. */
    public static XrVector3f nscale(long struct) { return XrVector3f.create(struct + XrCompositionLayerPassthroughANDROID.SCALE); }
    /** Unsafe version of {@link #opacity}. */
    public static float nopacity(long struct) { return memGetFloat(struct + XrCompositionLayerPassthroughANDROID.OPACITY); }
    /** Unsafe version of {@link #layer}. */
    public static long nlayer(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughANDROID.LAYER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerPassthroughANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerPassthroughANDROID.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { memPutLong(struct + XrCompositionLayerPassthroughANDROID.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerPassthroughANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerPassthroughANDROID.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #scale(XrVector3f) scale}. */
    public static void nscale(long struct, XrVector3f value) { memCopy(value.address(), struct + XrCompositionLayerPassthroughANDROID.SCALE, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #opacity(float) opacity}. */
    public static void nopacity(long struct, float value) { memPutFloat(struct + XrCompositionLayerPassthroughANDROID.OPACITY, value); }
    /** Unsafe version of {@link #layer(XrPassthroughLayerANDROID) layer}. */
    public static void nlayer(long struct, XrPassthroughLayerANDROID value) { memPutAddress(struct + XrCompositionLayerPassthroughANDROID.LAYER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerPassthroughANDROID.SPACE));
        check(memGetAddress(struct + XrCompositionLayerPassthroughANDROID.LAYER));
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerPassthroughANDROID} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerPassthroughANDROID, Buffer> implements NativeResource {

        private static final XrCompositionLayerPassthroughANDROID ELEMENT_FACTORY = XrCompositionLayerPassthroughANDROID.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerPassthroughANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerPassthroughANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerPassthroughANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerPassthroughANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerPassthroughANDROID.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerPassthroughANDROID.nlayerFlags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerPassthroughANDROID.nspace(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrCompositionLayerPassthroughANDROID.npose(address()); }
        /** @return a {@link XrVector3f} view of the {@code scale} field. */
        public XrVector3f scale() { return XrCompositionLayerPassthroughANDROID.nscale(address()); }
        /** @return the value of the {@code opacity} field. */
        public float opacity() { return XrCompositionLayerPassthroughANDROID.nopacity(address()); }
        /** @return the value of the {@code layer} field. */
        @NativeType("XrPassthroughLayerANDROID")
        public long layer() { return XrCompositionLayerPassthroughANDROID.nlayer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerPassthroughANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDCompositionLayerPassthroughMesh#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_ANDROID TYPE_COMPOSITION_LAYER_PASSTHROUGH_ANDROID} value to the {@code type} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer type$Default() { return type(ANDROIDCompositionLayerPassthroughMesh.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerPassthroughANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerPassthroughANDROID.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer space(XrSpace value) { XrCompositionLayerPassthroughANDROID.nspace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer pose(XrPosef value) { XrCompositionLayerPassthroughANDROID.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerPassthroughANDROID.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code scale} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer scale(XrVector3f value) { XrCompositionLayerPassthroughANDROID.nscale(address(), value); return this; }
        /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerPassthroughANDROID.Buffer scale(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(scale()); return this; }
        /** Sets the specified value to the {@code opacity} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer opacity(float value) { XrCompositionLayerPassthroughANDROID.nopacity(address(), value); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public XrCompositionLayerPassthroughANDROID.Buffer layer(XrPassthroughLayerANDROID value) { XrCompositionLayerPassthroughANDROID.nlayer(address(), value); return this; }

    }

}