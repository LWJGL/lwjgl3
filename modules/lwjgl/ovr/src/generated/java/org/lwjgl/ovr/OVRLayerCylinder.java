/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a layer of type {@link OVR#ovrLayerType_Cylinder LayerType_Cylinder} which is a single cylinder relative to the recentered origin. This type of layer represents a single
 * object placed in the world and not a stereo view of the world itself.
 * 
 * <pre><code>
 *                -Z                                       +Y
 *         U=0  +--+--+  U=1
 *          +---+  |  +---+            +-----------------+  - V=0
 *       +--+ \    |    / +--+         |                 |  |
 *     +-+     \       /     +-+       |                 |  |
 *    ++        \  A  /        ++      |                 |  |
 *   ++          \---/          ++     |                 |  |
 *   |            \ /            |     |              +X |  |
 *   +-------------C------R------+ +X  +--------C--------+  | &lt;--- Height
 *       (+Y is out of screen)         |                 |  |
 *                                     |                 |  |
 *   R = Radius                        |                 |  |
 *   A = Angle (0,2*Pi)                |                 |  |
 *   C = CylinderPoseCenter            |                 |  |
 *   U/V = UV Coordinates              +-----------------+  - V=1</code></pre>
 * 
 * <p>An identity {@code CylinderPoseCenter} places the center of the cylinder at the recentered origin unless the headlocked flag is set.</p>
 * 
 * <p>Does not utilize {@code HmdSpaceToWorldScaleInMeters}. If necessary, adjust translation and radius.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Only the interior surface of the cylinder is visible. Use cylinder layers when the user cannot leave the extents of the cylinder. Artifacts may appear
 * when viewing the cylinder's exterior surface. Additionally, while the interface supports an Angle that ranges from {@code [0,2*Pi]} the angle should
 * remain less than {@code 1.9*PI} to avoid artifacts where the cylinder edges converge.</p></div>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrLayerCylinder {
 *     {@link OVRLayerHeader ovrLayerHeader} {@link #Header};
 *     ovrTextureSwapChain {@link #ColorTexture};
 *     {@link OVRRecti ovrRecti} {@link #Viewport};
 *     {@link OVRPosef ovrPosef} {@link #CylinderPoseCenter};
 *     float {@link #CylinderRadius};
 *     float {@link #CylinderAngle};
 *     float {@link #CylinderAspectRatio};
 * }</code></pre>
 */
@NativeType("struct ovrLayerCylinder")
public class OVRLayerCylinder extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        COLORTEXTURE,
        VIEWPORT,
        CYLINDERPOSECENTER,
        CYLINDERRADIUS,
        CYLINDERANGLE,
        CYLINDERASPECTRATIO;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF, true),
            __member(POINTER_SIZE),
            __member(OVRRecti.SIZEOF, OVRRecti.ALIGNOF),
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        COLORTEXTURE = layout.offsetof(1);
        VIEWPORT = layout.offsetof(2);
        CYLINDERPOSECENTER = layout.offsetof(3);
        CYLINDERRADIUS = layout.offsetof(4);
        CYLINDERANGLE = layout.offsetof(5);
        CYLINDERASPECTRATIO = layout.offsetof(6);
    }

    /**
     * Creates a {@code OVRLayerCylinder} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerCylinder(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code Header.Type} must be {@link OVR#ovrLayerType_Cylinder LayerType_Cylinder} */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** contains a single image, never with any stereo view */
    @NativeType("ovrTextureSwapChain")
    public long ColorTexture() { return nColorTexture(address()); }
    /** specifies the ColorTexture sub-rect UV coordinates */
    @NativeType("ovrRecti")
    public OVRRecti Viewport() { return nViewport(address()); }
    /**
     * specifies the orientation and position of the center point of a cylinder layer type. The position is in real-world meters not the application's virtual
     * world, but the physical world the user is in. It is relative to the "zero" position set by {@link OVR#ovr_RecenterTrackingOrigin RecenterTrackingOrigin} unless the
     * {@link OVR#ovrLayerFlag_HeadLocked LayerFlag_HeadLocked} flag is used.
     */
    @NativeType("ovrPosef")
    public OVRPosef CylinderPoseCenter() { return nCylinderPoseCenter(address()); }
    /** radius of the cylinder in meters */
    public float CylinderRadius() { return nCylinderRadius(address()); }
    /** angle in radians. Range is from 0 to {@code 2*Pi} exclusive covering the entire cylinder (see diagram and note above). */
    public float CylinderAngle() { return nCylinderAngle(address()); }
    /**
     * custom aspect ratio presumably set based on {@code Viewport}. Used to calculate the height of the cylinder based on the arc-length
     * ({@code CylinderAngle}) and radius ({@code CylinderRadius}) given above. The height of the cylinder is given by:
     * {@code height = (CylinderRadius * CylinderAngle) / CylinderAspectRatio}. Aspect ratio is {@code width / height}.
     */
    public float CylinderAspectRatio() { return nCylinderAspectRatio(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@link #Header} field. */
    public OVRLayerCylinder Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Passes the {@link #Header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerCylinder Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
    /** Sets the specified value to the {@link #ColorTexture} field. */
    public OVRLayerCylinder ColorTexture(@NativeType("ovrTextureSwapChain") long value) { nColorTexture(address(), value); return this; }
    /** Copies the specified {@link OVRRecti} to the {@link #Viewport} field. */
    public OVRLayerCylinder Viewport(@NativeType("ovrRecti") OVRRecti value) { nViewport(address(), value); return this; }
    /** Passes the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerCylinder Viewport(java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport()); return this; }
    /** Copies the specified {@link OVRPosef} to the {@link #CylinderPoseCenter} field. */
    public OVRLayerCylinder CylinderPoseCenter(@NativeType("ovrPosef") OVRPosef value) { nCylinderPoseCenter(address(), value); return this; }
    /** Passes the {@link #CylinderPoseCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerCylinder CylinderPoseCenter(java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(CylinderPoseCenter()); return this; }
    /** Sets the specified value to the {@link #CylinderRadius} field. */
    public OVRLayerCylinder CylinderRadius(float value) { nCylinderRadius(address(), value); return this; }
    /** Sets the specified value to the {@link #CylinderAngle} field. */
    public OVRLayerCylinder CylinderAngle(float value) { nCylinderAngle(address(), value); return this; }
    /** Sets the specified value to the {@link #CylinderAspectRatio} field. */
    public OVRLayerCylinder CylinderAspectRatio(float value) { nCylinderAspectRatio(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerCylinder set(
        OVRLayerHeader Header,
        long ColorTexture,
        OVRRecti Viewport,
        OVRPosef CylinderPoseCenter,
        float CylinderRadius,
        float CylinderAngle,
        float CylinderAspectRatio
    ) {
        Header(Header);
        ColorTexture(ColorTexture);
        Viewport(Viewport);
        CylinderPoseCenter(CylinderPoseCenter);
        CylinderRadius(CylinderRadius);
        CylinderAngle(CylinderAngle);
        CylinderAspectRatio(CylinderAspectRatio);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerCylinder set(OVRLayerCylinder src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerCylinder} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerCylinder malloc() {
        return wrap(OVRLayerCylinder.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRLayerCylinder} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerCylinder calloc() {
        return wrap(OVRLayerCylinder.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRLayerCylinder} instance allocated with {@link BufferUtils}. */
    public static OVRLayerCylinder create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRLayerCylinder.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerCylinder} instance for the specified memory address. */
    public static OVRLayerCylinder create(long address) {
        return wrap(OVRLayerCylinder.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerCylinder createSafe(long address) {
        return address == NULL ? null : wrap(OVRLayerCylinder.class, address);
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerCylinder.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerCylinder.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerCylinder.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRLayerCylinder.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerCylinder.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerCylinder.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerCylinder mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerCylinder callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerCylinder mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerCylinder callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerCylinder.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerCylinder.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerCylinder.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerCylinder.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerCylinder} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerCylinder malloc(MemoryStack stack) {
        return wrap(OVRLayerCylinder.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRLayerCylinder} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerCylinder calloc(MemoryStack stack) {
        return wrap(OVRLayerCylinder.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerCylinder.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCylinder.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerCylinder.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerCylinder.HEADER); }
    /** Unsafe version of {@link #ColorTexture}. */
    public static long nColorTexture(long struct) { return memGetAddress(struct + OVRLayerCylinder.COLORTEXTURE); }
    /** Unsafe version of {@link #Viewport}. */
    public static OVRRecti nViewport(long struct) { return OVRRecti.create(struct + OVRLayerCylinder.VIEWPORT); }
    /** Unsafe version of {@link #CylinderPoseCenter}. */
    public static OVRPosef nCylinderPoseCenter(long struct) { return OVRPosef.create(struct + OVRLayerCylinder.CYLINDERPOSECENTER); }
    /** Unsafe version of {@link #CylinderRadius}. */
    public static float nCylinderRadius(long struct) { return UNSAFE.getFloat(null, struct + OVRLayerCylinder.CYLINDERRADIUS); }
    /** Unsafe version of {@link #CylinderAngle}. */
    public static float nCylinderAngle(long struct) { return UNSAFE.getFloat(null, struct + OVRLayerCylinder.CYLINDERANGLE); }
    /** Unsafe version of {@link #CylinderAspectRatio}. */
    public static float nCylinderAspectRatio(long struct) { return UNSAFE.getFloat(null, struct + OVRLayerCylinder.CYLINDERASPECTRATIO); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerCylinder.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #ColorTexture(long) ColorTexture}. */
    public static void nColorTexture(long struct, long value) { memPutAddress(struct + OVRLayerCylinder.COLORTEXTURE, check(value)); }
    /** Unsafe version of {@link #Viewport(OVRRecti) Viewport}. */
    public static void nViewport(long struct, OVRRecti value) { memCopy(value.address(), struct + OVRLayerCylinder.VIEWPORT, OVRRecti.SIZEOF); }
    /** Unsafe version of {@link #CylinderPoseCenter(OVRPosef) CylinderPoseCenter}. */
    public static void nCylinderPoseCenter(long struct, OVRPosef value) { memCopy(value.address(), struct + OVRLayerCylinder.CYLINDERPOSECENTER, OVRPosef.SIZEOF); }
    /** Unsafe version of {@link #CylinderRadius(float) CylinderRadius}. */
    public static void nCylinderRadius(long struct, float value) { UNSAFE.putFloat(null, struct + OVRLayerCylinder.CYLINDERRADIUS, value); }
    /** Unsafe version of {@link #CylinderAngle(float) CylinderAngle}. */
    public static void nCylinderAngle(long struct, float value) { UNSAFE.putFloat(null, struct + OVRLayerCylinder.CYLINDERANGLE, value); }
    /** Unsafe version of {@link #CylinderAspectRatio(float) CylinderAspectRatio}. */
    public static void nCylinderAspectRatio(long struct, float value) { UNSAFE.putFloat(null, struct + OVRLayerCylinder.CYLINDERASPECTRATIO, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerCylinder.COLORTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link OVRLayerCylinder} structs. */
    public static class Buffer extends StructBuffer<OVRLayerCylinder, Buffer> implements NativeResource {

        private static final OVRLayerCylinder ELEMENT_FACTORY = OVRLayerCylinder.create(-1L);

        /**
         * Creates a new {@code OVRLayerCylinder.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerCylinder#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerCylinder getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRLayerHeader} view of the {@link OVRLayerCylinder#Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerCylinder.nHeader(address()); }
        /** @return the value of the {@link OVRLayerCylinder#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long ColorTexture() { return OVRLayerCylinder.nColorTexture(address()); }
        /** @return a {@link OVRRecti} view of the {@link OVRLayerCylinder#Viewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti Viewport() { return OVRLayerCylinder.nViewport(address()); }
        /** @return a {@link OVRPosef} view of the {@link OVRLayerCylinder#CylinderPoseCenter} field. */
        @NativeType("ovrPosef")
        public OVRPosef CylinderPoseCenter() { return OVRLayerCylinder.nCylinderPoseCenter(address()); }
        /** @return the value of the {@link OVRLayerCylinder#CylinderRadius} field. */
        public float CylinderRadius() { return OVRLayerCylinder.nCylinderRadius(address()); }
        /** @return the value of the {@link OVRLayerCylinder#CylinderAngle} field. */
        public float CylinderAngle() { return OVRLayerCylinder.nCylinderAngle(address()); }
        /** @return the value of the {@link OVRLayerCylinder#CylinderAspectRatio} field. */
        public float CylinderAspectRatio() { return OVRLayerCylinder.nCylinderAspectRatio(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@link OVRLayerCylinder#Header} field. */
        public OVRLayerCylinder.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerCylinder.nHeader(address(), value); return this; }
        /** Passes the {@link OVRLayerCylinder#Header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerCylinder.Buffer Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
        /** Sets the specified value to the {@link OVRLayerCylinder#ColorTexture} field. */
        public OVRLayerCylinder.Buffer ColorTexture(@NativeType("ovrTextureSwapChain") long value) { OVRLayerCylinder.nColorTexture(address(), value); return this; }
        /** Copies the specified {@link OVRRecti} to the {@link OVRLayerCylinder#Viewport} field. */
        public OVRLayerCylinder.Buffer Viewport(@NativeType("ovrRecti") OVRRecti value) { OVRLayerCylinder.nViewport(address(), value); return this; }
        /** Passes the {@link OVRLayerCylinder#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerCylinder.Buffer Viewport(java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport()); return this; }
        /** Copies the specified {@link OVRPosef} to the {@link OVRLayerCylinder#CylinderPoseCenter} field. */
        public OVRLayerCylinder.Buffer CylinderPoseCenter(@NativeType("ovrPosef") OVRPosef value) { OVRLayerCylinder.nCylinderPoseCenter(address(), value); return this; }
        /** Passes the {@link OVRLayerCylinder#CylinderPoseCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerCylinder.Buffer CylinderPoseCenter(java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(CylinderPoseCenter()); return this; }
        /** Sets the specified value to the {@link OVRLayerCylinder#CylinderRadius} field. */
        public OVRLayerCylinder.Buffer CylinderRadius(float value) { OVRLayerCylinder.nCylinderRadius(address(), value); return this; }
        /** Sets the specified value to the {@link OVRLayerCylinder#CylinderAngle} field. */
        public OVRLayerCylinder.Buffer CylinderAngle(float value) { OVRLayerCylinder.nCylinderAngle(address(), value); return this; }
        /** Sets the specified value to the {@link OVRLayerCylinder#CylinderAspectRatio} field. */
        public OVRLayerCylinder.Buffer CylinderAspectRatio(float value) { OVRLayerCylinder.nCylinderAspectRatio(address(), value); return this; }

    }

}