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
 * struct XrFrameSynthesisInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrFrameSynthesisInfoFlagsEXT layerFlags;
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} motionVectorSubImage;
 *     {@link XrVector4f XrVector4f} motionVectorScale;
 *     {@link XrVector4f XrVector4f} motionVectorOffset;
 *     {@link XrPosef XrPosef} appSpaceDeltaPose;
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} depthSubImage;
 *     float minDepth;
 *     float maxDepth;
 *     float nearZ;
 *     float farZ;
 * }}</pre>
 */
public class XrFrameSynthesisInfoEXT extends Struct<XrFrameSynthesisInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS,
        MOTIONVECTORSUBIMAGE,
        MOTIONVECTORSCALE,
        MOTIONVECTOROFFSET,
        APPSPACEDELTAPOSE,
        DEPTHSUBIMAGE,
        MINDEPTH,
        MAXDEPTH,
        NEARZ,
        FARZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF),
            __member(XrVector4f.SIZEOF, XrVector4f.ALIGNOF),
            __member(XrVector4f.SIZEOF, XrVector4f.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        MOTIONVECTORSUBIMAGE = layout.offsetof(3);
        MOTIONVECTORSCALE = layout.offsetof(4);
        MOTIONVECTOROFFSET = layout.offsetof(5);
        APPSPACEDELTAPOSE = layout.offsetof(6);
        DEPTHSUBIMAGE = layout.offsetof(7);
        MINDEPTH = layout.offsetof(8);
        MAXDEPTH = layout.offsetof(9);
        NEARZ = layout.offsetof(10);
        FARZ = layout.offsetof(11);
    }

    protected XrFrameSynthesisInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFrameSynthesisInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrFrameSynthesisInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrFrameSynthesisInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFrameSynthesisInfoEXT(ByteBuffer container) {
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
    @NativeType("XrFrameSynthesisInfoFlagsEXT")
    public long layerFlags() { return nlayerFlags(address()); }
    /** @return a {@link XrSwapchainSubImage} view of the {@code motionVectorSubImage} field. */
    public XrSwapchainSubImage motionVectorSubImage() { return nmotionVectorSubImage(address()); }
    /** @return a {@link XrVector4f} view of the {@code motionVectorScale} field. */
    public XrVector4f motionVectorScale() { return nmotionVectorScale(address()); }
    /** @return a {@link XrVector4f} view of the {@code motionVectorOffset} field. */
    public XrVector4f motionVectorOffset() { return nmotionVectorOffset(address()); }
    /** @return a {@link XrPosef} view of the {@code appSpaceDeltaPose} field. */
    public XrPosef appSpaceDeltaPose() { return nappSpaceDeltaPose(address()); }
    /** @return a {@link XrSwapchainSubImage} view of the {@code depthSubImage} field. */
    public XrSwapchainSubImage depthSubImage() { return ndepthSubImage(address()); }
    /** @return the value of the {@code minDepth} field. */
    public float minDepth() { return nminDepth(address()); }
    /** @return the value of the {@code maxDepth} field. */
    public float maxDepth() { return nmaxDepth(address()); }
    /** @return the value of the {@code nearZ} field. */
    public float nearZ() { return nnearZ(address()); }
    /** @return the value of the {@code farZ} field. */
    public float farZ() { return nfarZ(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFrameSynthesisInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTFrameSynthesis#XR_TYPE_FRAME_SYNTHESIS_INFO_EXT TYPE_FRAME_SYNTHESIS_INFO_EXT} value to the {@code type} field. */
    public XrFrameSynthesisInfoEXT type$Default() { return type(EXTFrameSynthesis.XR_TYPE_FRAME_SYNTHESIS_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrFrameSynthesisInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrFrameSynthesisInfoEXT layerFlags(@NativeType("XrFrameSynthesisInfoFlagsEXT") long value) { nlayerFlags(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@code motionVectorSubImage} field. */
    public XrFrameSynthesisInfoEXT motionVectorSubImage(XrSwapchainSubImage value) { nmotionVectorSubImage(address(), value); return this; }
    /** Passes the {@code motionVectorSubImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFrameSynthesisInfoEXT motionVectorSubImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(motionVectorSubImage()); return this; }
    /** Copies the specified {@link XrVector4f} to the {@code motionVectorScale} field. */
    public XrFrameSynthesisInfoEXT motionVectorScale(XrVector4f value) { nmotionVectorScale(address(), value); return this; }
    /** Passes the {@code motionVectorScale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFrameSynthesisInfoEXT motionVectorScale(java.util.function.Consumer<XrVector4f> consumer) { consumer.accept(motionVectorScale()); return this; }
    /** Copies the specified {@link XrVector4f} to the {@code motionVectorOffset} field. */
    public XrFrameSynthesisInfoEXT motionVectorOffset(XrVector4f value) { nmotionVectorOffset(address(), value); return this; }
    /** Passes the {@code motionVectorOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFrameSynthesisInfoEXT motionVectorOffset(java.util.function.Consumer<XrVector4f> consumer) { consumer.accept(motionVectorOffset()); return this; }
    /** Copies the specified {@link XrPosef} to the {@code appSpaceDeltaPose} field. */
    public XrFrameSynthesisInfoEXT appSpaceDeltaPose(XrPosef value) { nappSpaceDeltaPose(address(), value); return this; }
    /** Passes the {@code appSpaceDeltaPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFrameSynthesisInfoEXT appSpaceDeltaPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(appSpaceDeltaPose()); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@code depthSubImage} field. */
    public XrFrameSynthesisInfoEXT depthSubImage(XrSwapchainSubImage value) { ndepthSubImage(address(), value); return this; }
    /** Passes the {@code depthSubImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFrameSynthesisInfoEXT depthSubImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(depthSubImage()); return this; }
    /** Sets the specified value to the {@code minDepth} field. */
    public XrFrameSynthesisInfoEXT minDepth(float value) { nminDepth(address(), value); return this; }
    /** Sets the specified value to the {@code maxDepth} field. */
    public XrFrameSynthesisInfoEXT maxDepth(float value) { nmaxDepth(address(), value); return this; }
    /** Sets the specified value to the {@code nearZ} field. */
    public XrFrameSynthesisInfoEXT nearZ(float value) { nnearZ(address(), value); return this; }
    /** Sets the specified value to the {@code farZ} field. */
    public XrFrameSynthesisInfoEXT farZ(float value) { nfarZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFrameSynthesisInfoEXT set(
        int type,
        long next,
        long layerFlags,
        XrSwapchainSubImage motionVectorSubImage,
        XrVector4f motionVectorScale,
        XrVector4f motionVectorOffset,
        XrPosef appSpaceDeltaPose,
        XrSwapchainSubImage depthSubImage,
        float minDepth,
        float maxDepth,
        float nearZ,
        float farZ
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        motionVectorSubImage(motionVectorSubImage);
        motionVectorScale(motionVectorScale);
        motionVectorOffset(motionVectorOffset);
        appSpaceDeltaPose(appSpaceDeltaPose);
        depthSubImage(depthSubImage);
        minDepth(minDepth);
        maxDepth(maxDepth);
        nearZ(nearZ);
        farZ(farZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFrameSynthesisInfoEXT set(XrFrameSynthesisInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFrameSynthesisInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFrameSynthesisInfoEXT malloc() {
        return new XrFrameSynthesisInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFrameSynthesisInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFrameSynthesisInfoEXT calloc() {
        return new XrFrameSynthesisInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFrameSynthesisInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrFrameSynthesisInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFrameSynthesisInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrFrameSynthesisInfoEXT} instance for the specified memory address. */
    public static XrFrameSynthesisInfoEXT create(long address) {
        return new XrFrameSynthesisInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFrameSynthesisInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrFrameSynthesisInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrFrameSynthesisInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFrameSynthesisInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameSynthesisInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFrameSynthesisInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFrameSynthesisInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFrameSynthesisInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameSynthesisInfoEXT malloc(MemoryStack stack) {
        return new XrFrameSynthesisInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFrameSynthesisInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameSynthesisInfoEXT calloc(MemoryStack stack) {
        return new XrFrameSynthesisInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFrameSynthesisInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameSynthesisInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameSynthesisInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFrameSynthesisInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFrameSynthesisInfoEXT.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return memGetLong(struct + XrFrameSynthesisInfoEXT.LAYERFLAGS); }
    /** Unsafe version of {@link #motionVectorSubImage}. */
    public static XrSwapchainSubImage nmotionVectorSubImage(long struct) { return XrSwapchainSubImage.create(struct + XrFrameSynthesisInfoEXT.MOTIONVECTORSUBIMAGE); }
    /** Unsafe version of {@link #motionVectorScale}. */
    public static XrVector4f nmotionVectorScale(long struct) { return XrVector4f.create(struct + XrFrameSynthesisInfoEXT.MOTIONVECTORSCALE); }
    /** Unsafe version of {@link #motionVectorOffset}. */
    public static XrVector4f nmotionVectorOffset(long struct) { return XrVector4f.create(struct + XrFrameSynthesisInfoEXT.MOTIONVECTOROFFSET); }
    /** Unsafe version of {@link #appSpaceDeltaPose}. */
    public static XrPosef nappSpaceDeltaPose(long struct) { return XrPosef.create(struct + XrFrameSynthesisInfoEXT.APPSPACEDELTAPOSE); }
    /** Unsafe version of {@link #depthSubImage}. */
    public static XrSwapchainSubImage ndepthSubImage(long struct) { return XrSwapchainSubImage.create(struct + XrFrameSynthesisInfoEXT.DEPTHSUBIMAGE); }
    /** Unsafe version of {@link #minDepth}. */
    public static float nminDepth(long struct) { return memGetFloat(struct + XrFrameSynthesisInfoEXT.MINDEPTH); }
    /** Unsafe version of {@link #maxDepth}. */
    public static float nmaxDepth(long struct) { return memGetFloat(struct + XrFrameSynthesisInfoEXT.MAXDEPTH); }
    /** Unsafe version of {@link #nearZ}. */
    public static float nnearZ(long struct) { return memGetFloat(struct + XrFrameSynthesisInfoEXT.NEARZ); }
    /** Unsafe version of {@link #farZ}. */
    public static float nfarZ(long struct) { return memGetFloat(struct + XrFrameSynthesisInfoEXT.FARZ); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFrameSynthesisInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFrameSynthesisInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { memPutLong(struct + XrFrameSynthesisInfoEXT.LAYERFLAGS, value); }
    /** Unsafe version of {@link #motionVectorSubImage(XrSwapchainSubImage) motionVectorSubImage}. */
    public static void nmotionVectorSubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrFrameSynthesisInfoEXT.MOTIONVECTORSUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #motionVectorScale(XrVector4f) motionVectorScale}. */
    public static void nmotionVectorScale(long struct, XrVector4f value) { memCopy(value.address(), struct + XrFrameSynthesisInfoEXT.MOTIONVECTORSCALE, XrVector4f.SIZEOF); }
    /** Unsafe version of {@link #motionVectorOffset(XrVector4f) motionVectorOffset}. */
    public static void nmotionVectorOffset(long struct, XrVector4f value) { memCopy(value.address(), struct + XrFrameSynthesisInfoEXT.MOTIONVECTOROFFSET, XrVector4f.SIZEOF); }
    /** Unsafe version of {@link #appSpaceDeltaPose(XrPosef) appSpaceDeltaPose}. */
    public static void nappSpaceDeltaPose(long struct, XrPosef value) { memCopy(value.address(), struct + XrFrameSynthesisInfoEXT.APPSPACEDELTAPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #depthSubImage(XrSwapchainSubImage) depthSubImage}. */
    public static void ndepthSubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrFrameSynthesisInfoEXT.DEPTHSUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #minDepth(float) minDepth}. */
    public static void nminDepth(long struct, float value) { memPutFloat(struct + XrFrameSynthesisInfoEXT.MINDEPTH, value); }
    /** Unsafe version of {@link #maxDepth(float) maxDepth}. */
    public static void nmaxDepth(long struct, float value) { memPutFloat(struct + XrFrameSynthesisInfoEXT.MAXDEPTH, value); }
    /** Unsafe version of {@link #nearZ(float) nearZ}. */
    public static void nnearZ(long struct, float value) { memPutFloat(struct + XrFrameSynthesisInfoEXT.NEARZ, value); }
    /** Unsafe version of {@link #farZ(float) farZ}. */
    public static void nfarZ(long struct, float value) { memPutFloat(struct + XrFrameSynthesisInfoEXT.FARZ, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        XrSwapchainSubImage.validate(struct + XrFrameSynthesisInfoEXT.MOTIONVECTORSUBIMAGE);
        XrSwapchainSubImage.validate(struct + XrFrameSynthesisInfoEXT.DEPTHSUBIMAGE);
    }

    // -----------------------------------

    /** An array of {@link XrFrameSynthesisInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrFrameSynthesisInfoEXT, Buffer> implements NativeResource {

        private static final XrFrameSynthesisInfoEXT ELEMENT_FACTORY = XrFrameSynthesisInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrFrameSynthesisInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFrameSynthesisInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFrameSynthesisInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFrameSynthesisInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFrameSynthesisInfoEXT.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrFrameSynthesisInfoFlagsEXT")
        public long layerFlags() { return XrFrameSynthesisInfoEXT.nlayerFlags(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@code motionVectorSubImage} field. */
        public XrSwapchainSubImage motionVectorSubImage() { return XrFrameSynthesisInfoEXT.nmotionVectorSubImage(address()); }
        /** @return a {@link XrVector4f} view of the {@code motionVectorScale} field. */
        public XrVector4f motionVectorScale() { return XrFrameSynthesisInfoEXT.nmotionVectorScale(address()); }
        /** @return a {@link XrVector4f} view of the {@code motionVectorOffset} field. */
        public XrVector4f motionVectorOffset() { return XrFrameSynthesisInfoEXT.nmotionVectorOffset(address()); }
        /** @return a {@link XrPosef} view of the {@code appSpaceDeltaPose} field. */
        public XrPosef appSpaceDeltaPose() { return XrFrameSynthesisInfoEXT.nappSpaceDeltaPose(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@code depthSubImage} field. */
        public XrSwapchainSubImage depthSubImage() { return XrFrameSynthesisInfoEXT.ndepthSubImage(address()); }
        /** @return the value of the {@code minDepth} field. */
        public float minDepth() { return XrFrameSynthesisInfoEXT.nminDepth(address()); }
        /** @return the value of the {@code maxDepth} field. */
        public float maxDepth() { return XrFrameSynthesisInfoEXT.nmaxDepth(address()); }
        /** @return the value of the {@code nearZ} field. */
        public float nearZ() { return XrFrameSynthesisInfoEXT.nnearZ(address()); }
        /** @return the value of the {@code farZ} field. */
        public float farZ() { return XrFrameSynthesisInfoEXT.nfarZ(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFrameSynthesisInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrFrameSynthesisInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTFrameSynthesis#XR_TYPE_FRAME_SYNTHESIS_INFO_EXT TYPE_FRAME_SYNTHESIS_INFO_EXT} value to the {@code type} field. */
        public XrFrameSynthesisInfoEXT.Buffer type$Default() { return type(EXTFrameSynthesis.XR_TYPE_FRAME_SYNTHESIS_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrFrameSynthesisInfoEXT.Buffer next(@NativeType("void const *") long value) { XrFrameSynthesisInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrFrameSynthesisInfoEXT.Buffer layerFlags(@NativeType("XrFrameSynthesisInfoFlagsEXT") long value) { XrFrameSynthesisInfoEXT.nlayerFlags(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@code motionVectorSubImage} field. */
        public XrFrameSynthesisInfoEXT.Buffer motionVectorSubImage(XrSwapchainSubImage value) { XrFrameSynthesisInfoEXT.nmotionVectorSubImage(address(), value); return this; }
        /** Passes the {@code motionVectorSubImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFrameSynthesisInfoEXT.Buffer motionVectorSubImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(motionVectorSubImage()); return this; }
        /** Copies the specified {@link XrVector4f} to the {@code motionVectorScale} field. */
        public XrFrameSynthesisInfoEXT.Buffer motionVectorScale(XrVector4f value) { XrFrameSynthesisInfoEXT.nmotionVectorScale(address(), value); return this; }
        /** Passes the {@code motionVectorScale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFrameSynthesisInfoEXT.Buffer motionVectorScale(java.util.function.Consumer<XrVector4f> consumer) { consumer.accept(motionVectorScale()); return this; }
        /** Copies the specified {@link XrVector4f} to the {@code motionVectorOffset} field. */
        public XrFrameSynthesisInfoEXT.Buffer motionVectorOffset(XrVector4f value) { XrFrameSynthesisInfoEXT.nmotionVectorOffset(address(), value); return this; }
        /** Passes the {@code motionVectorOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFrameSynthesisInfoEXT.Buffer motionVectorOffset(java.util.function.Consumer<XrVector4f> consumer) { consumer.accept(motionVectorOffset()); return this; }
        /** Copies the specified {@link XrPosef} to the {@code appSpaceDeltaPose} field. */
        public XrFrameSynthesisInfoEXT.Buffer appSpaceDeltaPose(XrPosef value) { XrFrameSynthesisInfoEXT.nappSpaceDeltaPose(address(), value); return this; }
        /** Passes the {@code appSpaceDeltaPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFrameSynthesisInfoEXT.Buffer appSpaceDeltaPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(appSpaceDeltaPose()); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@code depthSubImage} field. */
        public XrFrameSynthesisInfoEXT.Buffer depthSubImage(XrSwapchainSubImage value) { XrFrameSynthesisInfoEXT.ndepthSubImage(address(), value); return this; }
        /** Passes the {@code depthSubImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFrameSynthesisInfoEXT.Buffer depthSubImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(depthSubImage()); return this; }
        /** Sets the specified value to the {@code minDepth} field. */
        public XrFrameSynthesisInfoEXT.Buffer minDepth(float value) { XrFrameSynthesisInfoEXT.nminDepth(address(), value); return this; }
        /** Sets the specified value to the {@code maxDepth} field. */
        public XrFrameSynthesisInfoEXT.Buffer maxDepth(float value) { XrFrameSynthesisInfoEXT.nmaxDepth(address(), value); return this; }
        /** Sets the specified value to the {@code nearZ} field. */
        public XrFrameSynthesisInfoEXT.Buffer nearZ(float value) { XrFrameSynthesisInfoEXT.nnearZ(address(), value); return this; }
        /** Sets the specified value to the {@code farZ} field. */
        public XrFrameSynthesisInfoEXT.Buffer farZ(float value) { XrFrameSynthesisInfoEXT.nfarZ(address(), value); return this; }

    }

}