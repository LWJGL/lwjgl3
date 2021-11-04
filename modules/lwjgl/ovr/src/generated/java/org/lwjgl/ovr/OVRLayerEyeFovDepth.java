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

import static org.lwjgl.ovr.OVR.ovrEye_Count;

/**
 * Describes a layer that specifies a monoscopic or stereoscopic view, with depth textures in addition to color textures. This is typically used to
 * support positional time warp. This struct is the same as {@link OVRLayerEyeFov}, but with the addition of {@code DepthTexture} and {@code ProjectionDesc}.
 * 
 * <p>{@code ProjectionDesc} can be created using {@link OVRUtil#ovrTimewarpProjectionDesc_FromProjection TimewarpProjectionDesc_FromProjection}.</p>
 * 
 * <p>Three options exist with respect to mono/stereo texture usage:</p>
 * 
 * <ul>
 * <li>{@code ColorTexture[0]} and {@code ColorTexture[1]} contain the left and right stereo renderings, respectively. {@code Viewport[0]} and
 * {@code Viewport[1]} refer to {@code ColorTexture[0]} and {@code ColorTexture[1]}, respectively.</li>
 * <li>{@code ColorTexture[0]} contains both the left and right renderings, {@code ColorTexture[1]} is {@code NULL}, and {@code Viewport[0]} and
 * {@code Viewport[1]} refer to sub-rects with {@code ColorTexture[0]}.</li>
 * <li>{@code ColorTexture[0]} contains a single monoscopic rendering, and {@code Viewport[0]} and {@code Viewport[1]} both refer to that rendering.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrLayerEyeFovDepth {
 *     {@link OVRLayerHeader ovrLayerHeader} {@link #Header};
 *     ovrTextureSwapChain {@link #ColorTexture}[ovrEye_Count];
 *     {@link OVRRecti ovrRecti} {@link #Viewport}[ovrEye_Count];
 *     {@link OVRFovPort ovrFovPort} {@link #Fov}[ovrEye_Count];
 *     {@link OVRPosef ovrPosef} {@link #RenderPose}[ovrEye_Count];
 *     double {@link #SensorSampleTime};
 *     ovrTextureSwapChain {@link #DepthTexture}[ovrEye_Count];
 *     {@link OVRTimewarpProjectionDesc ovrTimewarpProjectionDesc} {@link #ProjectionDesc};
 * }</code></pre>
 */
@NativeType("struct ovrLayerEyeFovDepth")
public class OVRLayerEyeFovDepth extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        COLORTEXTURE,
        VIEWPORT,
        FOV,
        RENDERPOSE,
        SENSORSAMPLETIME,
        DEPTHTEXTURE,
        PROJECTIONDESC;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF, true),
            __array(POINTER_SIZE, ovrEye_Count),
            __array(OVRRecti.SIZEOF, OVRRecti.ALIGNOF, ovrEye_Count),
            __array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, ovrEye_Count),
            __array(OVRPosef.SIZEOF, OVRPosef.ALIGNOF, ovrEye_Count),
            __member(8),
            __array(POINTER_SIZE, ovrEye_Count),
            __member(OVRTimewarpProjectionDesc.SIZEOF, OVRTimewarpProjectionDesc.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        COLORTEXTURE = layout.offsetof(1);
        VIEWPORT = layout.offsetof(2);
        FOV = layout.offsetof(3);
        RENDERPOSE = layout.offsetof(4);
        SENSORSAMPLETIME = layout.offsetof(5);
        DEPTHTEXTURE = layout.offsetof(6);
        PROJECTIONDESC = layout.offsetof(7);
    }

    /**
     * Creates a {@code OVRLayerEyeFovDepth} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerEyeFovDepth(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code Header.Type} must be {@link OVR#ovrLayerType_EyeFovDepth LayerType_EyeFovDepth} */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** {@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be {@code NULL} for cases described above. */
    @NativeType("ovrTextureSwapChain[ovrEye_Count]")
    public PointerBuffer ColorTexture() { return nColorTexture(address()); }
    /** {@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be {@code NULL} for cases described above. */
    @NativeType("ovrTextureSwapChain")
    public long ColorTexture(int index) { return nColorTexture(address(), index); }
    /** specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid. */
    @NativeType("ovrRecti[ovrEye_Count]")
    public OVRRecti.Buffer Viewport() { return nViewport(address()); }
    /** specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid. */
    @NativeType("ovrRecti")
    public OVRRecti Viewport(int index) { return nViewport(address(), index); }
    /** the viewport field of view */
    @NativeType("ovrFovPort[ovrEye_Count]")
    public OVRFovPort.Buffer Fov() { return nFov(address()); }
    /** the viewport field of view */
    @NativeType("ovrFovPort")
    public OVRFovPort Fov(int index) { return nFov(address(), index); }
    /**
     * specifies the position and orientation of each eye view, with position specified in meters. {@code RenderPose} will typically be the value returned
     * from {@link OVRUtil#ovr_CalcEyePoses _CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.
     */
    @NativeType("ovrPosef[ovrEye_Count]")
    public OVRPosef.Buffer RenderPose() { return nRenderPose(address()); }
    /**
     * specifies the position and orientation of each eye view, with position specified in meters. {@code RenderPose} will typically be the value returned
     * from {@link OVRUtil#ovr_CalcEyePoses _CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.
     */
    @NativeType("ovrPosef")
    public OVRPosef RenderPose(int index) { return nRenderPose(address(), index); }
    /**
     * specifies the timestamp when the source {@link OVRPosef} (used in calculating {@code RenderPose}) was sampled from the SDK. Typically retrieved by calling
     * {@link OVR#ovr_GetTimeInSeconds GetTimeInSeconds} around the instant the application calls {@link OVR#ovr_GetTrackingState GetTrackingState}. The main purpose for this is to accurately track app tracking
     * latency.
     */
    public double SensorSampleTime() { return nSensorSampleTime(address()); }
    /** depth texture for depth composition with overlays. Must map 1:1 to the {@code ColorTexture}. */
    @NativeType("ovrTextureSwapChain[ovrEye_Count]")
    public PointerBuffer DepthTexture() { return nDepthTexture(address()); }
    /** depth texture for depth composition with overlays. Must map 1:1 to the {@code ColorTexture}. */
    @NativeType("ovrTextureSwapChain")
    public long DepthTexture(int index) { return nDepthTexture(address(), index); }
    /** specifies how to convert {@code DepthTexture} information into meters */
    @NativeType("ovrTimewarpProjectionDesc")
    public OVRTimewarpProjectionDesc ProjectionDesc() { return nProjectionDesc(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@link #Header} field. */
    public OVRLayerEyeFovDepth Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Passes the {@link #Header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovDepth Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@link #ColorTexture} field. */
    public OVRLayerEyeFovDepth ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { nColorTexture(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ColorTexture} field. */
    public OVRLayerEyeFovDepth ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { nColorTexture(address(), index, value); return this; }
    /** Copies the specified {@link OVRRecti.Buffer} to the {@link #Viewport} field. */
    public OVRLayerEyeFovDepth Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { nViewport(address(), value); return this; }
    /** Copies the specified {@link OVRRecti} at the specified index of the {@link #Viewport} field. */
    public OVRLayerEyeFovDepth Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { nViewport(address(), index, value); return this; }
    /** Passes the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovDepth Viewport(java.util.function.Consumer<OVRRecti.Buffer> consumer) { consumer.accept(Viewport()); return this; }
    /** Passes the element at {@code index} of the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovDepth Viewport(int index, java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport(index)); return this; }
    /** Copies the specified {@link OVRFovPort.Buffer} to the {@link #Fov} field. */
    public OVRLayerEyeFovDepth Fov(@NativeType("ovrFovPort[ovrEye_Count]") OVRFovPort.Buffer value) { nFov(address(), value); return this; }
    /** Copies the specified {@link OVRFovPort} at the specified index of the {@link #Fov} field. */
    public OVRLayerEyeFovDepth Fov(int index, @NativeType("ovrFovPort") OVRFovPort value) { nFov(address(), index, value); return this; }
    /** Passes the {@link #Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovDepth Fov(java.util.function.Consumer<OVRFovPort.Buffer> consumer) { consumer.accept(Fov()); return this; }
    /** Passes the element at {@code index} of the {@link #Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovDepth Fov(int index, java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(Fov(index)); return this; }
    /** Copies the specified {@link OVRPosef.Buffer} to the {@link #RenderPose} field. */
    public OVRLayerEyeFovDepth RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
    /** Copies the specified {@link OVRPosef} at the specified index of the {@link #RenderPose} field. */
    public OVRLayerEyeFovDepth RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { nRenderPose(address(), index, value); return this; }
    /** Passes the {@link #RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovDepth RenderPose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(RenderPose()); return this; }
    /** Passes the element at {@code index} of the {@link #RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovDepth RenderPose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RenderPose(index)); return this; }
    /** Sets the specified value to the {@link #SensorSampleTime} field. */
    public OVRLayerEyeFovDepth SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@link #DepthTexture} field. */
    public OVRLayerEyeFovDepth DepthTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { nDepthTexture(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #DepthTexture} field. */
    public OVRLayerEyeFovDepth DepthTexture(int index, @NativeType("ovrTextureSwapChain") long value) { nDepthTexture(address(), index, value); return this; }
    /** Copies the specified {@link OVRTimewarpProjectionDesc} to the {@link #ProjectionDesc} field. */
    public OVRLayerEyeFovDepth ProjectionDesc(@NativeType("ovrTimewarpProjectionDesc") OVRTimewarpProjectionDesc value) { nProjectionDesc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerEyeFovDepth set(
        OVRLayerHeader Header,
        PointerBuffer ColorTexture,
        OVRRecti.Buffer Viewport,
        OVRFovPort.Buffer Fov,
        OVRPosef.Buffer RenderPose,
        double SensorSampleTime,
        PointerBuffer DepthTexture,
        OVRTimewarpProjectionDesc ProjectionDesc
    ) {
        Header(Header);
        ColorTexture(ColorTexture);
        Viewport(Viewport);
        Fov(Fov);
        RenderPose(RenderPose);
        SensorSampleTime(SensorSampleTime);
        DepthTexture(DepthTexture);
        ProjectionDesc(ProjectionDesc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerEyeFovDepth set(OVRLayerEyeFovDepth src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerEyeFovDepth} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeFovDepth malloc() {
        return wrap(OVRLayerEyeFovDepth.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRLayerEyeFovDepth} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeFovDepth calloc() {
        return wrap(OVRLayerEyeFovDepth.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRLayerEyeFovDepth} instance allocated with {@link BufferUtils}. */
    public static OVRLayerEyeFovDepth create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRLayerEyeFovDepth.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerEyeFovDepth} instance for the specified memory address. */
    public static OVRLayerEyeFovDepth create(long address) {
        return wrap(OVRLayerEyeFovDepth.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerEyeFovDepth createSafe(long address) {
        return address == NULL ? null : wrap(OVRLayerEyeFovDepth.class, address);
    }

    /**
     * Returns a new {@link OVRLayerEyeFovDepth.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovDepth.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFovDepth.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovDepth.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFovDepth.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovDepth.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRLayerEyeFovDepth.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovDepth.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerEyeFovDepth.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovDepth mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovDepth callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovDepth mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovDepth callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovDepth.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovDepth.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovDepth.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovDepth.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerEyeFovDepth} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeFovDepth malloc(MemoryStack stack) {
        return wrap(OVRLayerEyeFovDepth.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRLayerEyeFovDepth} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeFovDepth calloc(MemoryStack stack) {
        return wrap(OVRLayerEyeFovDepth.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerEyeFovDepth.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovDepth.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFovDepth.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovDepth.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerEyeFovDepth.HEADER); }
    /** Unsafe version of {@link #ColorTexture}. */
    public static PointerBuffer nColorTexture(long struct) { return memPointerBuffer(struct + OVRLayerEyeFovDepth.COLORTEXTURE, ovrEye_Count); }
    /** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
    public static long nColorTexture(long struct, int index) {
        return memGetAddress(struct + OVRLayerEyeFovDepth.COLORTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #Viewport}. */
    public static OVRRecti.Buffer nViewport(long struct) { return OVRRecti.create(struct + OVRLayerEyeFovDepth.VIEWPORT, ovrEye_Count); }
    /** Unsafe version of {@link #Viewport(int) Viewport}. */
    public static OVRRecti nViewport(long struct, int index) {
        return OVRRecti.create(struct + OVRLayerEyeFovDepth.VIEWPORT + check(index, ovrEye_Count) * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Fov}. */
    public static OVRFovPort.Buffer nFov(long struct) { return OVRFovPort.create(struct + OVRLayerEyeFovDepth.FOV, ovrEye_Count); }
    /** Unsafe version of {@link #Fov(int) Fov}. */
    public static OVRFovPort nFov(long struct, int index) {
        return OVRFovPort.create(struct + OVRLayerEyeFovDepth.FOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose}. */
    public static OVRPosef.Buffer nRenderPose(long struct) { return OVRPosef.create(struct + OVRLayerEyeFovDepth.RENDERPOSE, ovrEye_Count); }
    /** Unsafe version of {@link #RenderPose(int) RenderPose}. */
    public static OVRPosef nRenderPose(long struct, int index) {
        return OVRPosef.create(struct + OVRLayerEyeFovDepth.RENDERPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime}. */
    public static double nSensorSampleTime(long struct) { return UNSAFE.getDouble(null, struct + OVRLayerEyeFovDepth.SENSORSAMPLETIME); }
    /** Unsafe version of {@link #DepthTexture}. */
    public static PointerBuffer nDepthTexture(long struct) { return memPointerBuffer(struct + OVRLayerEyeFovDepth.DEPTHTEXTURE, ovrEye_Count); }
    /** Unsafe version of {@link #DepthTexture(int) DepthTexture}. */
    public static long nDepthTexture(long struct, int index) {
        return memGetAddress(struct + OVRLayerEyeFovDepth.DEPTHTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #ProjectionDesc}. */
    public static OVRTimewarpProjectionDesc nProjectionDesc(long struct) { return OVRTimewarpProjectionDesc.create(struct + OVRLayerEyeFovDepth.PROJECTIONDESC); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerEyeFovDepth.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #ColorTexture(PointerBuffer) ColorTexture}. */
    public static void nColorTexture(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(memAddress(value), struct + OVRLayerEyeFovDepth.COLORTEXTURE, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #ColorTexture(int, long) ColorTexture}. */
    public static void nColorTexture(long struct, int index, long value) {
        memPutAddress(struct + OVRLayerEyeFovDepth.COLORTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE, value);
    }
    /** Unsafe version of {@link #Viewport(OVRRecti.Buffer) Viewport}. */
    public static void nViewport(long struct, OVRRecti.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFovDepth.VIEWPORT, value.remaining() * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Viewport(int, OVRRecti) Viewport}. */
    public static void nViewport(long struct, int index, OVRRecti value) {
        memCopy(value.address(), struct + OVRLayerEyeFovDepth.VIEWPORT + check(index, ovrEye_Count) * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Fov(OVRFovPort.Buffer) Fov}. */
    public static void nFov(long struct, OVRFovPort.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFovDepth.FOV, value.remaining() * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #Fov(int, OVRFovPort) Fov}. */
    public static void nFov(long struct, int index, OVRFovPort value) {
        memCopy(value.address(), struct + OVRLayerEyeFovDepth.FOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF, OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(OVRPosef.Buffer) RenderPose}. */
    public static void nRenderPose(long struct, OVRPosef.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFovDepth.RENDERPOSE, value.remaining() * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(int, OVRPosef) RenderPose}. */
    public static void nRenderPose(long struct, int index, OVRPosef value) {
        memCopy(value.address(), struct + OVRLayerEyeFovDepth.RENDERPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime(double) SensorSampleTime}. */
    public static void nSensorSampleTime(long struct, double value) { UNSAFE.putDouble(null, struct + OVRLayerEyeFovDepth.SENSORSAMPLETIME, value); }
    /** Unsafe version of {@link #DepthTexture(PointerBuffer) DepthTexture}. */
    public static void nDepthTexture(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(memAddress(value), struct + OVRLayerEyeFovDepth.DEPTHTEXTURE, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #DepthTexture(int, long) DepthTexture}. */
    public static void nDepthTexture(long struct, int index, long value) {
        memPutAddress(struct + OVRLayerEyeFovDepth.DEPTHTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE, value);
    }
    /** Unsafe version of {@link #ProjectionDesc(OVRTimewarpProjectionDesc) ProjectionDesc}. */
    public static void nProjectionDesc(long struct, OVRTimewarpProjectionDesc value) { memCopy(value.address(), struct + OVRLayerEyeFovDepth.PROJECTIONDESC, OVRTimewarpProjectionDesc.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerEyeFovDepth.COLORTEXTURE));
        check(memGetAddress(struct + OVRLayerEyeFovDepth.DEPTHTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link OVRLayerEyeFovDepth} structs. */
    public static class Buffer extends StructBuffer<OVRLayerEyeFovDepth, Buffer> implements NativeResource {

        private static final OVRLayerEyeFovDepth ELEMENT_FACTORY = OVRLayerEyeFovDepth.create(-1L);

        /**
         * Creates a new {@code OVRLayerEyeFovDepth.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerEyeFovDepth#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerEyeFovDepth getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRLayerHeader} view of the {@link OVRLayerEyeFovDepth#Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerEyeFovDepth.nHeader(address()); }
        /** @return a {@link PointerBuffer} view of the {@link OVRLayerEyeFovDepth#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain[ovrEye_Count]")
        public PointerBuffer ColorTexture() { return OVRLayerEyeFovDepth.nColorTexture(address()); }
        /** @return the value at the specified index of the {@link OVRLayerEyeFovDepth#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long ColorTexture(int index) { return OVRLayerEyeFovDepth.nColorTexture(address(), index); }
        /** @return a {@link OVRRecti}.Buffer view of the {@link OVRLayerEyeFovDepth#Viewport} field. */
        @NativeType("ovrRecti[ovrEye_Count]")
        public OVRRecti.Buffer Viewport() { return OVRLayerEyeFovDepth.nViewport(address()); }
        /** @return a {@link OVRRecti} view of the struct at the specified index of the {@link OVRLayerEyeFovDepth#Viewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti Viewport(int index) { return OVRLayerEyeFovDepth.nViewport(address(), index); }
        /** @return a {@link OVRFovPort}.Buffer view of the {@link OVRLayerEyeFovDepth#Fov} field. */
        @NativeType("ovrFovPort[ovrEye_Count]")
        public OVRFovPort.Buffer Fov() { return OVRLayerEyeFovDepth.nFov(address()); }
        /** @return a {@link OVRFovPort} view of the struct at the specified index of the {@link OVRLayerEyeFovDepth#Fov} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort Fov(int index) { return OVRLayerEyeFovDepth.nFov(address(), index); }
        /** @return a {@link OVRPosef}.Buffer view of the {@link OVRLayerEyeFovDepth#RenderPose} field. */
        @NativeType("ovrPosef[ovrEye_Count]")
        public OVRPosef.Buffer RenderPose() { return OVRLayerEyeFovDepth.nRenderPose(address()); }
        /** @return a {@link OVRPosef} view of the struct at the specified index of the {@link OVRLayerEyeFovDepth#RenderPose} field. */
        @NativeType("ovrPosef")
        public OVRPosef RenderPose(int index) { return OVRLayerEyeFovDepth.nRenderPose(address(), index); }
        /** @return the value of the {@link OVRLayerEyeFovDepth#SensorSampleTime} field. */
        public double SensorSampleTime() { return OVRLayerEyeFovDepth.nSensorSampleTime(address()); }
        /** @return a {@link PointerBuffer} view of the {@link OVRLayerEyeFovDepth#DepthTexture} field. */
        @NativeType("ovrTextureSwapChain[ovrEye_Count]")
        public PointerBuffer DepthTexture() { return OVRLayerEyeFovDepth.nDepthTexture(address()); }
        /** @return the value at the specified index of the {@link OVRLayerEyeFovDepth#DepthTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long DepthTexture(int index) { return OVRLayerEyeFovDepth.nDepthTexture(address(), index); }
        /** @return a {@link OVRTimewarpProjectionDesc} view of the {@link OVRLayerEyeFovDepth#ProjectionDesc} field. */
        @NativeType("ovrTimewarpProjectionDesc")
        public OVRTimewarpProjectionDesc ProjectionDesc() { return OVRLayerEyeFovDepth.nProjectionDesc(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@link OVRLayerEyeFovDepth#Header} field. */
        public OVRLayerEyeFovDepth.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerEyeFovDepth.nHeader(address(), value); return this; }
        /** Passes the {@link OVRLayerEyeFovDepth#Header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovDepth.Buffer Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@link OVRLayerEyeFovDepth#ColorTexture} field. */
        public OVRLayerEyeFovDepth.Buffer ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { OVRLayerEyeFovDepth.nColorTexture(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link OVRLayerEyeFovDepth#ColorTexture} field. */
        public OVRLayerEyeFovDepth.Buffer ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { OVRLayerEyeFovDepth.nColorTexture(address(), index, value); return this; }
        /** Copies the specified {@link OVRRecti.Buffer} to the {@link OVRLayerEyeFovDepth#Viewport} field. */
        public OVRLayerEyeFovDepth.Buffer Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { OVRLayerEyeFovDepth.nViewport(address(), value); return this; }
        /** Copies the specified {@link OVRRecti} at the specified index of the {@link OVRLayerEyeFovDepth#Viewport} field. */
        public OVRLayerEyeFovDepth.Buffer Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { OVRLayerEyeFovDepth.nViewport(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFovDepth#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovDepth.Buffer Viewport(java.util.function.Consumer<OVRRecti.Buffer> consumer) { consumer.accept(Viewport()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFovDepth#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovDepth.Buffer Viewport(int index, java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport(index)); return this; }
        /** Copies the specified {@link OVRFovPort.Buffer} to the {@link OVRLayerEyeFovDepth#Fov} field. */
        public OVRLayerEyeFovDepth.Buffer Fov(@NativeType("ovrFovPort[ovrEye_Count]") OVRFovPort.Buffer value) { OVRLayerEyeFovDepth.nFov(address(), value); return this; }
        /** Copies the specified {@link OVRFovPort} at the specified index of the {@link OVRLayerEyeFovDepth#Fov} field. */
        public OVRLayerEyeFovDepth.Buffer Fov(int index, @NativeType("ovrFovPort") OVRFovPort value) { OVRLayerEyeFovDepth.nFov(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFovDepth#Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovDepth.Buffer Fov(java.util.function.Consumer<OVRFovPort.Buffer> consumer) { consumer.accept(Fov()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFovDepth#Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovDepth.Buffer Fov(int index, java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(Fov(index)); return this; }
        /** Copies the specified {@link OVRPosef.Buffer} to the {@link OVRLayerEyeFovDepth#RenderPose} field. */
        public OVRLayerEyeFovDepth.Buffer RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { OVRLayerEyeFovDepth.nRenderPose(address(), value); return this; }
        /** Copies the specified {@link OVRPosef} at the specified index of the {@link OVRLayerEyeFovDepth#RenderPose} field. */
        public OVRLayerEyeFovDepth.Buffer RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { OVRLayerEyeFovDepth.nRenderPose(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFovDepth#RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovDepth.Buffer RenderPose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(RenderPose()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFovDepth#RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovDepth.Buffer RenderPose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RenderPose(index)); return this; }
        /** Sets the specified value to the {@link OVRLayerEyeFovDepth#SensorSampleTime} field. */
        public OVRLayerEyeFovDepth.Buffer SensorSampleTime(double value) { OVRLayerEyeFovDepth.nSensorSampleTime(address(), value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@link OVRLayerEyeFovDepth#DepthTexture} field. */
        public OVRLayerEyeFovDepth.Buffer DepthTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { OVRLayerEyeFovDepth.nDepthTexture(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link OVRLayerEyeFovDepth#DepthTexture} field. */
        public OVRLayerEyeFovDepth.Buffer DepthTexture(int index, @NativeType("ovrTextureSwapChain") long value) { OVRLayerEyeFovDepth.nDepthTexture(address(), index, value); return this; }
        /** Copies the specified {@link OVRTimewarpProjectionDesc} to the {@link OVRLayerEyeFovDepth#ProjectionDesc} field. */
        public OVRLayerEyeFovDepth.Buffer ProjectionDesc(@NativeType("ovrTimewarpProjectionDesc") OVRTimewarpProjectionDesc value) { OVRLayerEyeFovDepth.nProjectionDesc(address(), value); return this; }

    }

}