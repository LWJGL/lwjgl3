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
 * struct XrCompositionLayerEquirect2KHR {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags layerFlags;
 *     XrSpace space;
 *     XrEyeVisibility eyeVisibility;
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} subImage;
 *     {@link XrPosef XrPosef} pose;
 *     float radius;
 *     float centralHorizontalAngle;
 *     float upperVerticalAngle;
 *     float lowerVerticalAngle;
 * }}</pre>
 */
public class XrCompositionLayerEquirect2KHR extends Struct<XrCompositionLayerEquirect2KHR> implements NativeResource {

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
        EYEVISIBILITY,
        SUBIMAGE,
        POSE,
        RADIUS,
        CENTRALHORIZONTALANGLE,
        UPPERVERTICALANGLE,
        LOWERVERTICALANGLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
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
        SPACE = layout.offsetof(3);
        EYEVISIBILITY = layout.offsetof(4);
        SUBIMAGE = layout.offsetof(5);
        POSE = layout.offsetof(6);
        RADIUS = layout.offsetof(7);
        CENTRALHORIZONTALANGLE = layout.offsetof(8);
        UPPERVERTICALANGLE = layout.offsetof(9);
        LOWERVERTICALANGLE = layout.offsetof(10);
    }

    protected XrCompositionLayerEquirect2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerEquirect2KHR create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerEquirect2KHR(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerEquirect2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerEquirect2KHR(ByteBuffer container) {
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
    /** @return the value of the {@code eyeVisibility} field. */
    @NativeType("XrEyeVisibility")
    public int eyeVisibility() { return neyeVisibility(address()); }
    /** @return a {@link XrSwapchainSubImage} view of the {@code subImage} field. */
    public XrSwapchainSubImage subImage() { return nsubImage(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return the value of the {@code radius} field. */
    public float radius() { return nradius(address()); }
    /** @return the value of the {@code centralHorizontalAngle} field. */
    public float centralHorizontalAngle() { return ncentralHorizontalAngle(address()); }
    /** @return the value of the {@code upperVerticalAngle} field. */
    public float upperVerticalAngle() { return nupperVerticalAngle(address()); }
    /** @return the value of the {@code lowerVerticalAngle} field. */
    public float lowerVerticalAngle() { return nlowerVerticalAngle(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerEquirect2KHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRCompositionLayerEquirect2#XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR} value to the {@code type} field. */
    public XrCompositionLayerEquirect2KHR type$Default() { return type(KHRCompositionLayerEquirect2.XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerEquirect2KHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerEquirect2KHR layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerEquirect2KHR space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code eyeVisibility} field. */
    public XrCompositionLayerEquirect2KHR eyeVisibility(@NativeType("XrEyeVisibility") int value) { neyeVisibility(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@code subImage} field. */
    public XrCompositionLayerEquirect2KHR subImage(XrSwapchainSubImage value) { nsubImage(address(), value); return this; }
    /** Passes the {@code subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerEquirect2KHR subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrCompositionLayerEquirect2KHR pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerEquirect2KHR pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@code radius} field. */
    public XrCompositionLayerEquirect2KHR radius(float value) { nradius(address(), value); return this; }
    /** Sets the specified value to the {@code centralHorizontalAngle} field. */
    public XrCompositionLayerEquirect2KHR centralHorizontalAngle(float value) { ncentralHorizontalAngle(address(), value); return this; }
    /** Sets the specified value to the {@code upperVerticalAngle} field. */
    public XrCompositionLayerEquirect2KHR upperVerticalAngle(float value) { nupperVerticalAngle(address(), value); return this; }
    /** Sets the specified value to the {@code lowerVerticalAngle} field. */
    public XrCompositionLayerEquirect2KHR lowerVerticalAngle(float value) { nlowerVerticalAngle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerEquirect2KHR set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        int eyeVisibility,
        XrSwapchainSubImage subImage,
        XrPosef pose,
        float radius,
        float centralHorizontalAngle,
        float upperVerticalAngle,
        float lowerVerticalAngle
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        eyeVisibility(eyeVisibility);
        subImage(subImage);
        pose(pose);
        radius(radius);
        centralHorizontalAngle(centralHorizontalAngle);
        upperVerticalAngle(upperVerticalAngle);
        lowerVerticalAngle(lowerVerticalAngle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerEquirect2KHR set(XrCompositionLayerEquirect2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerEquirect2KHR malloc() {
        return new XrCompositionLayerEquirect2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerEquirect2KHR calloc() {
        return new XrCompositionLayerEquirect2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerEquirect2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerEquirect2KHR(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerEquirect2KHR} instance for the specified memory address. */
    public static XrCompositionLayerEquirect2KHR create(long address) {
        return new XrCompositionLayerEquirect2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerEquirect2KHR createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerEquirect2KHR(address, null);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerEquirect2KHR}. */
    public static XrCompositionLayerEquirect2KHR create(XrCompositionLayerBaseHeader value) {
        return new XrCompositionLayerEquirect2KHR(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerEquirect2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerEquirect2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerEquirect2KHR.Buffer}. */
    public static XrCompositionLayerEquirect2KHR.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return new XrCompositionLayerEquirect2KHR.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerEquirect2KHR malloc(MemoryStack stack) {
        return new XrCompositionLayerEquirect2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerEquirect2KHR calloc(MemoryStack stack) {
        return new XrCompositionLayerEquirect2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerEquirect2KHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerEquirect2KHR.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return memGetLong(struct + XrCompositionLayerEquirect2KHR.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerEquirect2KHR.SPACE); }
    /** Unsafe version of {@link #eyeVisibility}. */
    public static int neyeVisibility(long struct) { return memGetInt(struct + XrCompositionLayerEquirect2KHR.EYEVISIBILITY); }
    /** Unsafe version of {@link #subImage}. */
    public static XrSwapchainSubImage nsubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerEquirect2KHR.SUBIMAGE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrCompositionLayerEquirect2KHR.POSE); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return memGetFloat(struct + XrCompositionLayerEquirect2KHR.RADIUS); }
    /** Unsafe version of {@link #centralHorizontalAngle}. */
    public static float ncentralHorizontalAngle(long struct) { return memGetFloat(struct + XrCompositionLayerEquirect2KHR.CENTRALHORIZONTALANGLE); }
    /** Unsafe version of {@link #upperVerticalAngle}. */
    public static float nupperVerticalAngle(long struct) { return memGetFloat(struct + XrCompositionLayerEquirect2KHR.UPPERVERTICALANGLE); }
    /** Unsafe version of {@link #lowerVerticalAngle}. */
    public static float nlowerVerticalAngle(long struct) { return memGetFloat(struct + XrCompositionLayerEquirect2KHR.LOWERVERTICALANGLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerEquirect2KHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerEquirect2KHR.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { memPutLong(struct + XrCompositionLayerEquirect2KHR.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerEquirect2KHR.SPACE, value.address()); }
    /** Unsafe version of {@link #eyeVisibility(int) eyeVisibility}. */
    public static void neyeVisibility(long struct, int value) { memPutInt(struct + XrCompositionLayerEquirect2KHR.EYEVISIBILITY, value); }
    /** Unsafe version of {@link #subImage(XrSwapchainSubImage) subImage}. */
    public static void nsubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerEquirect2KHR.SUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerEquirect2KHR.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { memPutFloat(struct + XrCompositionLayerEquirect2KHR.RADIUS, value); }
    /** Unsafe version of {@link #centralHorizontalAngle(float) centralHorizontalAngle}. */
    public static void ncentralHorizontalAngle(long struct, float value) { memPutFloat(struct + XrCompositionLayerEquirect2KHR.CENTRALHORIZONTALANGLE, value); }
    /** Unsafe version of {@link #upperVerticalAngle(float) upperVerticalAngle}. */
    public static void nupperVerticalAngle(long struct, float value) { memPutFloat(struct + XrCompositionLayerEquirect2KHR.UPPERVERTICALANGLE, value); }
    /** Unsafe version of {@link #lowerVerticalAngle(float) lowerVerticalAngle}. */
    public static void nlowerVerticalAngle(long struct, float value) { memPutFloat(struct + XrCompositionLayerEquirect2KHR.LOWERVERTICALANGLE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerEquirect2KHR.SPACE));
        XrSwapchainSubImage.validate(struct + XrCompositionLayerEquirect2KHR.SUBIMAGE);
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerEquirect2KHR} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerEquirect2KHR, Buffer> implements NativeResource {

        private static final XrCompositionLayerEquirect2KHR ELEMENT_FACTORY = XrCompositionLayerEquirect2KHR.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerEquirect2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerEquirect2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerEquirect2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerEquirect2KHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerEquirect2KHR.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerEquirect2KHR.nlayerFlags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerEquirect2KHR.nspace(address()); }
        /** @return the value of the {@code eyeVisibility} field. */
        @NativeType("XrEyeVisibility")
        public int eyeVisibility() { return XrCompositionLayerEquirect2KHR.neyeVisibility(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@code subImage} field. */
        public XrSwapchainSubImage subImage() { return XrCompositionLayerEquirect2KHR.nsubImage(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrCompositionLayerEquirect2KHR.npose(address()); }
        /** @return the value of the {@code radius} field. */
        public float radius() { return XrCompositionLayerEquirect2KHR.nradius(address()); }
        /** @return the value of the {@code centralHorizontalAngle} field. */
        public float centralHorizontalAngle() { return XrCompositionLayerEquirect2KHR.ncentralHorizontalAngle(address()); }
        /** @return the value of the {@code upperVerticalAngle} field. */
        public float upperVerticalAngle() { return XrCompositionLayerEquirect2KHR.nupperVerticalAngle(address()); }
        /** @return the value of the {@code lowerVerticalAngle} field. */
        public float lowerVerticalAngle() { return XrCompositionLayerEquirect2KHR.nlowerVerticalAngle(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerEquirect2KHR.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerEquirect2KHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRCompositionLayerEquirect2#XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR} value to the {@code type} field. */
        public XrCompositionLayerEquirect2KHR.Buffer type$Default() { return type(KHRCompositionLayerEquirect2.XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerEquirect2KHR.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerEquirect2KHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerEquirect2KHR.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerEquirect2KHR.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerEquirect2KHR.Buffer space(XrSpace value) { XrCompositionLayerEquirect2KHR.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code eyeVisibility} field. */
        public XrCompositionLayerEquirect2KHR.Buffer eyeVisibility(@NativeType("XrEyeVisibility") int value) { XrCompositionLayerEquirect2KHR.neyeVisibility(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@code subImage} field. */
        public XrCompositionLayerEquirect2KHR.Buffer subImage(XrSwapchainSubImage value) { XrCompositionLayerEquirect2KHR.nsubImage(address(), value); return this; }
        /** Passes the {@code subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerEquirect2KHR.Buffer subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrCompositionLayerEquirect2KHR.Buffer pose(XrPosef value) { XrCompositionLayerEquirect2KHR.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerEquirect2KHR.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@code radius} field. */
        public XrCompositionLayerEquirect2KHR.Buffer radius(float value) { XrCompositionLayerEquirect2KHR.nradius(address(), value); return this; }
        /** Sets the specified value to the {@code centralHorizontalAngle} field. */
        public XrCompositionLayerEquirect2KHR.Buffer centralHorizontalAngle(float value) { XrCompositionLayerEquirect2KHR.ncentralHorizontalAngle(address(), value); return this; }
        /** Sets the specified value to the {@code upperVerticalAngle} field. */
        public XrCompositionLayerEquirect2KHR.Buffer upperVerticalAngle(float value) { XrCompositionLayerEquirect2KHR.nupperVerticalAngle(address(), value); return this; }
        /** Sets the specified value to the {@code lowerVerticalAngle} field. */
        public XrCompositionLayerEquirect2KHR.Buffer lowerVerticalAngle(float value) { XrCompositionLayerEquirect2KHR.nlowerVerticalAngle(address(), value); return this; }

    }

}