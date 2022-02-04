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
 * Cylindrical layer composition info.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrCompositionLayerCylinderKHR} contains the information needed to render a texture onto a cylinder when calling {@link XR10#xrEndFrame EndFrame}. {@link XrCompositionLayerCylinderKHR} is an alias type for the base struct {@link XrCompositionLayerBaseHeader} used in {@link XrFrameEndInfo}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRCompositionLayerCylinder XR_KHR_composition_layer_cylinder} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerCylinderKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRCompositionLayerCylinder#XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR TYPE_COMPOSITION_LAYER_CYLINDER_KHR}</li>
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
 * struct XrCompositionLayerCylinderKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerFlags {@link #layerFlags};
 *     XrSpace {@link #space};
 *     XrEyeVisibility eyeVisibility;
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} {@link #subImage};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     float {@link #radius};
 *     float {@link #centralAngle};
 *     float {@link #aspectRatio};
 * }</code></pre>
 */
public class XrCompositionLayerCylinderKHR extends Struct implements NativeResource {

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
        CENTRALANGLE,
        ASPECTRATIO;

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
        CENTRALANGLE = layout.offsetof(8);
        ASPECTRATIO = layout.offsetof(9);
    }

    /**
     * Creates a {@code XrCompositionLayerCylinderKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerCylinderKHR(ByteBuffer container) {
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
    /** the {@code XrSpace} in which the {@code pose} of the cylinder layer is evaluated over time. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code eyeVisibility} field. */
    @NativeType("XrEyeVisibility")
    public int eyeVisibility() { return neyeVisibility(address()); }
    /** identifies the image {@link XrSwapchainSubImage} to use. */
    public XrSwapchainSubImage subImage() { return nsubImage(address()); }
    /** an {@link XrPosef} defining the position and orientation of the center point of the view of the cylinder within the reference frame of the {@code space}. */
    public XrPosef pose() { return npose(address()); }
    /** the non-negative radius of the cylinder. Values of zero or floating point positive infinity are treated as an infinite cylinder. */
    public float radius() { return nradius(address()); }
    /** the angle of the visible section of the cylinder, based at 0 radians, in the range of <code>[0, 2π)</code>. It grows symmetrically around the 0 radian angle. */
    public float centralAngle() { return ncentralAngle(address()); }
    /** the ratio of the visible cylinder section <code>width / height</code>. The height of the cylinder is given by: <code>(cylinder radius × cylinder angle) / aspectRatio</code>. */
    public float aspectRatio() { return naspectRatio(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerCylinderKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRCompositionLayerCylinder#XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR TYPE_COMPOSITION_LAYER_CYLINDER_KHR} value to the {@link #type} field. */
    public XrCompositionLayerCylinderKHR type$Default() { return type(KHRCompositionLayerCylinder.XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerCylinderKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #layerFlags} field. */
    public XrCompositionLayerCylinderKHR layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrCompositionLayerCylinderKHR space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code eyeVisibility} field. */
    public XrCompositionLayerCylinderKHR eyeVisibility(@NativeType("XrEyeVisibility") int value) { neyeVisibility(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@link #subImage} field. */
    public XrCompositionLayerCylinderKHR subImage(XrSwapchainSubImage value) { nsubImage(address(), value); return this; }
    /** Passes the {@link #subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerCylinderKHR subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrCompositionLayerCylinderKHR pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerCylinderKHR pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@link #radius} field. */
    public XrCompositionLayerCylinderKHR radius(float value) { nradius(address(), value); return this; }
    /** Sets the specified value to the {@link #centralAngle} field. */
    public XrCompositionLayerCylinderKHR centralAngle(float value) { ncentralAngle(address(), value); return this; }
    /** Sets the specified value to the {@link #aspectRatio} field. */
    public XrCompositionLayerCylinderKHR aspectRatio(float value) { naspectRatio(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerCylinderKHR set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        int eyeVisibility,
        XrSwapchainSubImage subImage,
        XrPosef pose,
        float radius,
        float centralAngle,
        float aspectRatio
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        eyeVisibility(eyeVisibility);
        subImage(subImage);
        pose(pose);
        radius(radius);
        centralAngle(centralAngle);
        aspectRatio(aspectRatio);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerCylinderKHR set(XrCompositionLayerCylinderKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerCylinderKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerCylinderKHR malloc() {
        return wrap(XrCompositionLayerCylinderKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerCylinderKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerCylinderKHR calloc() {
        return wrap(XrCompositionLayerCylinderKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerCylinderKHR} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerCylinderKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerCylinderKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerCylinderKHR} instance for the specified memory address. */
    public static XrCompositionLayerCylinderKHR create(long address) {
        return wrap(XrCompositionLayerCylinderKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerCylinderKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerCylinderKHR.class, address);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerCylinderKHR}. */
    public static XrCompositionLayerCylinderKHR create(XrCompositionLayerBaseHeader value) {
        return wrap(XrCompositionLayerCylinderKHR.class, value);
    }

    /**
     * Returns a new {@link XrCompositionLayerCylinderKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCylinderKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerCylinderKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCylinderKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerCylinderKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCylinderKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerCylinderKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCylinderKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerCylinderKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerCylinderKHR.Buffer}. */
    public static XrCompositionLayerCylinderKHR.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrCompositionLayerCylinderKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerCylinderKHR malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerCylinderKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerCylinderKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerCylinderKHR calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerCylinderKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerCylinderKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCylinderKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerCylinderKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCylinderKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerCylinderKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerCylinderKHR.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerCylinderKHR.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerCylinderKHR.SPACE); }
    /** Unsafe version of {@link #eyeVisibility}. */
    public static int neyeVisibility(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerCylinderKHR.EYEVISIBILITY); }
    /** Unsafe version of {@link #subImage}. */
    public static XrSwapchainSubImage nsubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerCylinderKHR.SUBIMAGE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrCompositionLayerCylinderKHR.POSE); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerCylinderKHR.RADIUS); }
    /** Unsafe version of {@link #centralAngle}. */
    public static float ncentralAngle(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerCylinderKHR.CENTRALANGLE); }
    /** Unsafe version of {@link #aspectRatio}. */
    public static float naspectRatio(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerCylinderKHR.ASPECTRATIO); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerCylinderKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerCylinderKHR.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerCylinderKHR.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerCylinderKHR.SPACE, value.address()); }
    /** Unsafe version of {@link #eyeVisibility(int) eyeVisibility}. */
    public static void neyeVisibility(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerCylinderKHR.EYEVISIBILITY, value); }
    /** Unsafe version of {@link #subImage(XrSwapchainSubImage) subImage}. */
    public static void nsubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerCylinderKHR.SUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerCylinderKHR.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerCylinderKHR.RADIUS, value); }
    /** Unsafe version of {@link #centralAngle(float) centralAngle}. */
    public static void ncentralAngle(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerCylinderKHR.CENTRALANGLE, value); }
    /** Unsafe version of {@link #aspectRatio(float) aspectRatio}. */
    public static void naspectRatio(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerCylinderKHR.ASPECTRATIO, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerCylinderKHR.SPACE));
        XrSwapchainSubImage.validate(struct + XrCompositionLayerCylinderKHR.SUBIMAGE);
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerCylinderKHR} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerCylinderKHR, Buffer> implements NativeResource {

        private static final XrCompositionLayerCylinderKHR ELEMENT_FACTORY = XrCompositionLayerCylinderKHR.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerCylinderKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerCylinderKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerCylinderKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerCylinderKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerCylinderKHR.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerCylinderKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerCylinderKHR.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerCylinderKHR#layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerCylinderKHR.nlayerFlags(address()); }
        /** @return the value of the {@link XrCompositionLayerCylinderKHR#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerCylinderKHR.nspace(address()); }
        /** @return the value of the {@code eyeVisibility} field. */
        @NativeType("XrEyeVisibility")
        public int eyeVisibility() { return XrCompositionLayerCylinderKHR.neyeVisibility(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@link XrCompositionLayerCylinderKHR#subImage} field. */
        public XrSwapchainSubImage subImage() { return XrCompositionLayerCylinderKHR.nsubImage(address()); }
        /** @return a {@link XrPosef} view of the {@link XrCompositionLayerCylinderKHR#pose} field. */
        public XrPosef pose() { return XrCompositionLayerCylinderKHR.npose(address()); }
        /** @return the value of the {@link XrCompositionLayerCylinderKHR#radius} field. */
        public float radius() { return XrCompositionLayerCylinderKHR.nradius(address()); }
        /** @return the value of the {@link XrCompositionLayerCylinderKHR#centralAngle} field. */
        public float centralAngle() { return XrCompositionLayerCylinderKHR.ncentralAngle(address()); }
        /** @return the value of the {@link XrCompositionLayerCylinderKHR#aspectRatio} field. */
        public float aspectRatio() { return XrCompositionLayerCylinderKHR.naspectRatio(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerCylinderKHR#type} field. */
        public XrCompositionLayerCylinderKHR.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerCylinderKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRCompositionLayerCylinder#XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR TYPE_COMPOSITION_LAYER_CYLINDER_KHR} value to the {@link XrCompositionLayerCylinderKHR#type} field. */
        public XrCompositionLayerCylinderKHR.Buffer type$Default() { return type(KHRCompositionLayerCylinder.XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR); }
        /** Sets the specified value to the {@link XrCompositionLayerCylinderKHR#next} field. */
        public XrCompositionLayerCylinderKHR.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerCylinderKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerCylinderKHR#layerFlags} field. */
        public XrCompositionLayerCylinderKHR.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerCylinderKHR.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerCylinderKHR#space} field. */
        public XrCompositionLayerCylinderKHR.Buffer space(XrSpace value) { XrCompositionLayerCylinderKHR.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code eyeVisibility} field. */
        public XrCompositionLayerCylinderKHR.Buffer eyeVisibility(@NativeType("XrEyeVisibility") int value) { XrCompositionLayerCylinderKHR.neyeVisibility(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@link XrCompositionLayerCylinderKHR#subImage} field. */
        public XrCompositionLayerCylinderKHR.Buffer subImage(XrSwapchainSubImage value) { XrCompositionLayerCylinderKHR.nsubImage(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerCylinderKHR#subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerCylinderKHR.Buffer subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrCompositionLayerCylinderKHR#pose} field. */
        public XrCompositionLayerCylinderKHR.Buffer pose(XrPosef value) { XrCompositionLayerCylinderKHR.npose(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerCylinderKHR#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerCylinderKHR.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerCylinderKHR#radius} field. */
        public XrCompositionLayerCylinderKHR.Buffer radius(float value) { XrCompositionLayerCylinderKHR.nradius(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerCylinderKHR#centralAngle} field. */
        public XrCompositionLayerCylinderKHR.Buffer centralAngle(float value) { XrCompositionLayerCylinderKHR.ncentralAngle(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerCylinderKHR#aspectRatio} field. */
        public XrCompositionLayerCylinderKHR.Buffer aspectRatio(float value) { XrCompositionLayerCylinderKHR.naspectRatio(address(), value); return this; }

    }

}