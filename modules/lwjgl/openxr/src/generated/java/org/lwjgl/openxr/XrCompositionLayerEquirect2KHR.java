/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Equirectangular layer composition info.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrCompositionLayerEquirect2KHR} contains the information needed to render an equirectangular image onto a sphere when calling {@link XR10#xrEndFrame EndFrame}. {@link XrCompositionLayerEquirect2KHR} is an alias type for the base struct {@link XrCompositionLayerBaseHeader} used in {@link XrFrameEndInfo}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRCompositionLayerEquirect2 XR_KHR_composition_layer_equirect2} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerEquirect2KHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRCompositionLayerEquirect2#XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>{@code eyeVisibility} <b>must</b> be a valid {@code XrEyeVisibility} value</li>
 * <li>{@code subImage} <b>must</b> be a valid {@link XrSwapchainSubImage} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}, {@link XrFrameEndInfo}, {@link XrPosef}, {@link XrSwapchainSubImage}, {@link XR10#xrEndFrame EndFrame}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerEquirect2KHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerFlags {@link #layerFlags};
 *     XrSpace {@link #space};
 *     XrEyeVisibility eyeVisibility;
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} {@link #subImage};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     float {@link #radius};
 *     float {@link #centralHorizontalAngle};
 *     float {@link #upperVerticalAngle};
 *     float {@link #lowerVerticalAngle};
 * }</code></pre>
 */
public class XrCompositionLayerEquirect2KHR extends Struct implements NativeResource {

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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** specifies options for the layer. */
    @NativeType("XrCompositionLayerFlags")
    public long layerFlags() { return nlayerFlags(address()); }
    /** the {@code XrSpace} in which the {@code pose} of the equirect layer is evaluated over time. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code eyeVisibility} field. */
    @NativeType("XrEyeVisibility")
    public int eyeVisibility() { return neyeVisibility(address()); }
    /** identifies the image {@link XrSwapchainSubImage} to use. */
    public XrSwapchainSubImage subImage() { return nsubImage(address()); }
    /** an {@link XrPosef} defining the position and orientation of the center point of the sphere onto which the equirect image data is mapped, relative to the reference frame of the {@code space}. */
    public XrPosef pose() { return npose(address()); }
    /** the non-negative radius of the sphere onto which the equirect image data is mapped. Values of zero or floating point positive infinity are treated as an infinite sphere. */
    public float radius() { return nradius(address()); }
    /** defines the visible horizontal angle of the sphere, based at 0 radians, in the range of <code>[0, 2π]</code>. It grows symmetrically around the 0 radian angle. */
    public float centralHorizontalAngle() { return ncentralHorizontalAngle(address()); }
    /** defines the upper vertical angle of the visible portion of the sphere, in the range of <code>[-π/2, π/2]</code>. */
    public float upperVerticalAngle() { return nupperVerticalAngle(address()); }
    /** defines the lower vertical angle of the visible portion of the sphere, in the range of <code>[-π/2, π/2]</code>. */
    public float lowerVerticalAngle() { return nlowerVerticalAngle(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerEquirect2KHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRCompositionLayerEquirect2#XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR} value to the {@link #type} field. */
    public XrCompositionLayerEquirect2KHR type$Default() { return type(KHRCompositionLayerEquirect2.XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerEquirect2KHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #layerFlags} field. */
    public XrCompositionLayerEquirect2KHR layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrCompositionLayerEquirect2KHR space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code eyeVisibility} field. */
    public XrCompositionLayerEquirect2KHR eyeVisibility(@NativeType("XrEyeVisibility") int value) { neyeVisibility(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@link #subImage} field. */
    public XrCompositionLayerEquirect2KHR subImage(XrSwapchainSubImage value) { nsubImage(address(), value); return this; }
    /** Passes the {@link #subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerEquirect2KHR subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrCompositionLayerEquirect2KHR pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerEquirect2KHR pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@link #radius} field. */
    public XrCompositionLayerEquirect2KHR radius(float value) { nradius(address(), value); return this; }
    /** Sets the specified value to the {@link #centralHorizontalAngle} field. */
    public XrCompositionLayerEquirect2KHR centralHorizontalAngle(float value) { ncentralHorizontalAngle(address(), value); return this; }
    /** Sets the specified value to the {@link #upperVerticalAngle} field. */
    public XrCompositionLayerEquirect2KHR upperVerticalAngle(float value) { nupperVerticalAngle(address(), value); return this; }
    /** Sets the specified value to the {@link #lowerVerticalAngle} field. */
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
        return wrap(XrCompositionLayerEquirect2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerEquirect2KHR calloc() {
        return wrap(XrCompositionLayerEquirect2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerEquirect2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerEquirect2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerEquirect2KHR} instance for the specified memory address. */
    public static XrCompositionLayerEquirect2KHR create(long address) {
        return wrap(XrCompositionLayerEquirect2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerEquirect2KHR createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerEquirect2KHR.class, address);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerEquirect2KHR}. */
    public static XrCompositionLayerEquirect2KHR create(XrCompositionLayerBaseHeader value) {
        return wrap(XrCompositionLayerEquirect2KHR.class, value);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerEquirect2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerEquirect2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerEquirect2KHR.Buffer}. */
    public static XrCompositionLayerEquirect2KHR.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerEquirect2KHR malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerEquirect2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerEquirect2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerEquirect2KHR calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerEquirect2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirect2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirect2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerEquirect2KHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerEquirect2KHR.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerEquirect2KHR.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerEquirect2KHR.SPACE); }
    /** Unsafe version of {@link #eyeVisibility}. */
    public static int neyeVisibility(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerEquirect2KHR.EYEVISIBILITY); }
    /** Unsafe version of {@link #subImage}. */
    public static XrSwapchainSubImage nsubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerEquirect2KHR.SUBIMAGE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrCompositionLayerEquirect2KHR.POSE); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerEquirect2KHR.RADIUS); }
    /** Unsafe version of {@link #centralHorizontalAngle}. */
    public static float ncentralHorizontalAngle(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerEquirect2KHR.CENTRALHORIZONTALANGLE); }
    /** Unsafe version of {@link #upperVerticalAngle}. */
    public static float nupperVerticalAngle(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerEquirect2KHR.UPPERVERTICALANGLE); }
    /** Unsafe version of {@link #lowerVerticalAngle}. */
    public static float nlowerVerticalAngle(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerEquirect2KHR.LOWERVERTICALANGLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerEquirect2KHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerEquirect2KHR.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerEquirect2KHR.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerEquirect2KHR.SPACE, value.address()); }
    /** Unsafe version of {@link #eyeVisibility(int) eyeVisibility}. */
    public static void neyeVisibility(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerEquirect2KHR.EYEVISIBILITY, value); }
    /** Unsafe version of {@link #subImage(XrSwapchainSubImage) subImage}. */
    public static void nsubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerEquirect2KHR.SUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerEquirect2KHR.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerEquirect2KHR.RADIUS, value); }
    /** Unsafe version of {@link #centralHorizontalAngle(float) centralHorizontalAngle}. */
    public static void ncentralHorizontalAngle(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerEquirect2KHR.CENTRALHORIZONTALANGLE, value); }
    /** Unsafe version of {@link #upperVerticalAngle(float) upperVerticalAngle}. */
    public static void nupperVerticalAngle(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerEquirect2KHR.UPPERVERTICALANGLE, value); }
    /** Unsafe version of {@link #lowerVerticalAngle(float) lowerVerticalAngle}. */
    public static void nlowerVerticalAngle(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerEquirect2KHR.LOWERVERTICALANGLE, value); }

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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerEquirect2KHR#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerEquirect2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerEquirect2KHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerEquirect2KHR.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerEquirect2KHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerEquirect2KHR.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerEquirect2KHR#layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerEquirect2KHR.nlayerFlags(address()); }
        /** @return the value of the {@link XrCompositionLayerEquirect2KHR#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerEquirect2KHR.nspace(address()); }
        /** @return the value of the {@code eyeVisibility} field. */
        @NativeType("XrEyeVisibility")
        public int eyeVisibility() { return XrCompositionLayerEquirect2KHR.neyeVisibility(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@link XrCompositionLayerEquirect2KHR#subImage} field. */
        public XrSwapchainSubImage subImage() { return XrCompositionLayerEquirect2KHR.nsubImage(address()); }
        /** @return a {@link XrPosef} view of the {@link XrCompositionLayerEquirect2KHR#pose} field. */
        public XrPosef pose() { return XrCompositionLayerEquirect2KHR.npose(address()); }
        /** @return the value of the {@link XrCompositionLayerEquirect2KHR#radius} field. */
        public float radius() { return XrCompositionLayerEquirect2KHR.nradius(address()); }
        /** @return the value of the {@link XrCompositionLayerEquirect2KHR#centralHorizontalAngle} field. */
        public float centralHorizontalAngle() { return XrCompositionLayerEquirect2KHR.ncentralHorizontalAngle(address()); }
        /** @return the value of the {@link XrCompositionLayerEquirect2KHR#upperVerticalAngle} field. */
        public float upperVerticalAngle() { return XrCompositionLayerEquirect2KHR.nupperVerticalAngle(address()); }
        /** @return the value of the {@link XrCompositionLayerEquirect2KHR#lowerVerticalAngle} field. */
        public float lowerVerticalAngle() { return XrCompositionLayerEquirect2KHR.nlowerVerticalAngle(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerEquirect2KHR#type} field. */
        public XrCompositionLayerEquirect2KHR.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerEquirect2KHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRCompositionLayerEquirect2#XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR} value to the {@link XrCompositionLayerEquirect2KHR#type} field. */
        public XrCompositionLayerEquirect2KHR.Buffer type$Default() { return type(KHRCompositionLayerEquirect2.XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR); }
        /** Sets the specified value to the {@link XrCompositionLayerEquirect2KHR#next} field. */
        public XrCompositionLayerEquirect2KHR.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerEquirect2KHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerEquirect2KHR#layerFlags} field. */
        public XrCompositionLayerEquirect2KHR.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerEquirect2KHR.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerEquirect2KHR#space} field. */
        public XrCompositionLayerEquirect2KHR.Buffer space(XrSpace value) { XrCompositionLayerEquirect2KHR.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code eyeVisibility} field. */
        public XrCompositionLayerEquirect2KHR.Buffer eyeVisibility(@NativeType("XrEyeVisibility") int value) { XrCompositionLayerEquirect2KHR.neyeVisibility(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@link XrCompositionLayerEquirect2KHR#subImage} field. */
        public XrCompositionLayerEquirect2KHR.Buffer subImage(XrSwapchainSubImage value) { XrCompositionLayerEquirect2KHR.nsubImage(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerEquirect2KHR#subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerEquirect2KHR.Buffer subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrCompositionLayerEquirect2KHR#pose} field. */
        public XrCompositionLayerEquirect2KHR.Buffer pose(XrPosef value) { XrCompositionLayerEquirect2KHR.npose(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerEquirect2KHR#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerEquirect2KHR.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerEquirect2KHR#radius} field. */
        public XrCompositionLayerEquirect2KHR.Buffer radius(float value) { XrCompositionLayerEquirect2KHR.nradius(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerEquirect2KHR#centralHorizontalAngle} field. */
        public XrCompositionLayerEquirect2KHR.Buffer centralHorizontalAngle(float value) { XrCompositionLayerEquirect2KHR.ncentralHorizontalAngle(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerEquirect2KHR#upperVerticalAngle} field. */
        public XrCompositionLayerEquirect2KHR.Buffer upperVerticalAngle(float value) { XrCompositionLayerEquirect2KHR.nupperVerticalAngle(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerEquirect2KHR#lowerVerticalAngle} field. */
        public XrCompositionLayerEquirect2KHR.Buffer lowerVerticalAngle(float value) { XrCompositionLayerEquirect2KHR.nlowerVerticalAngle(address(), value); return this; }

    }

}