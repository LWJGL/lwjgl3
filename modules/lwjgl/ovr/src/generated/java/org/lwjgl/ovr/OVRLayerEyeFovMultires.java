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
 * Describes a layer that specifies a monoscopic or stereoscopic view with support for optional multiresolution textures. This struct is the same as
 * {@link OVRLayerEyeFov} plus texture layout parameters.
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
 * struct ovrLayerEyeFovMultires {
 *     {@link OVRLayerHeader ovrLayerHeader} {@link #Header};
 *     ovrTextureSwapChain {@link #ColorTexture}[ovrEye_Count];
 *     {@link OVRRecti ovrRecti} {@link #Viewport}[ovrEye_Count];
 *     {@link OVRFovPort ovrFovPort} {@link #Fov}[ovrEye_Count];
 *     {@link OVRPosef ovrPosef} {@link #RenderPose}[ovrEye_Count];
 *     double {@link #SensorSampleTime};
 *     ovrTextureLayout {@link #TextureLayout};
 *     {@link OVRTextureLayoutDescUnion ovrTextureLayoutDesc_Union} {@link #TextureLayoutDesc};
 * }</code></pre>
 */
@NativeType("struct ovrLayerEyeFovMultires")
public class OVRLayerEyeFovMultires extends Struct implements NativeResource {

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
        TEXTURELAYOUT,
        TEXTURELAYOUTDESC;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF, true),
            __array(POINTER_SIZE, ovrEye_Count),
            __array(OVRRecti.SIZEOF, OVRRecti.ALIGNOF, ovrEye_Count),
            __array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, ovrEye_Count),
            __array(OVRPosef.SIZEOF, OVRPosef.ALIGNOF, ovrEye_Count),
            __member(8),
            __member(4),
            __member(OVRTextureLayoutDescUnion.SIZEOF, OVRTextureLayoutDescUnion.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        COLORTEXTURE = layout.offsetof(1);
        VIEWPORT = layout.offsetof(2);
        FOV = layout.offsetof(3);
        RENDERPOSE = layout.offsetof(4);
        SENSORSAMPLETIME = layout.offsetof(5);
        TEXTURELAYOUT = layout.offsetof(6);
        TEXTURELAYOUTDESC = layout.offsetof(7);
    }

    /**
     * Creates a {@code OVRLayerEyeFovMultires} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerEyeFovMultires(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code Header.Type} must be {@link OVR#ovrLayerType_EyeFovMultires LayerType_EyeFovMultires} */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** {@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be {@code NULL} for cases described above. */
    @NativeType("ovrTextureSwapChain[ovrEye_Count]")
    public PointerBuffer ColorTexture() { return nColorTexture(address()); }
    /** {@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be {@code NULL} for cases described above. */
    @NativeType("ovrTextureSwapChain")
    public long ColorTexture(int index) { return nColorTexture(address(), index); }
    /** specifies the ColorTexture sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid. */
    @NativeType("ovrRecti[ovrEye_Count]")
    public OVRRecti.Buffer Viewport() { return nViewport(address()); }
    /** specifies the ColorTexture sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid. */
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
    /** specifies layout type of textures */
    @NativeType("ovrTextureLayout")
    public int TextureLayout() { return nTextureLayout(address()); }
    /** specifies texture layout parameters */
    @NativeType("ovrTextureLayoutDesc_Union")
    public OVRTextureLayoutDescUnion TextureLayoutDesc() { return nTextureLayoutDesc(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@link #Header} field. */
    public OVRLayerEyeFovMultires Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Passes the {@link #Header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovMultires Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@link #ColorTexture} field. */
    public OVRLayerEyeFovMultires ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { nColorTexture(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ColorTexture} field. */
    public OVRLayerEyeFovMultires ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { nColorTexture(address(), index, value); return this; }
    /** Copies the specified {@link OVRRecti.Buffer} to the {@link #Viewport} field. */
    public OVRLayerEyeFovMultires Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { nViewport(address(), value); return this; }
    /** Copies the specified {@link OVRRecti} at the specified index of the {@link #Viewport} field. */
    public OVRLayerEyeFovMultires Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { nViewport(address(), index, value); return this; }
    /** Passes the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovMultires Viewport(java.util.function.Consumer<OVRRecti.Buffer> consumer) { consumer.accept(Viewport()); return this; }
    /** Passes the element at {@code index} of the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovMultires Viewport(int index, java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport(index)); return this; }
    /** Copies the specified {@link OVRFovPort.Buffer} to the {@link #Fov} field. */
    public OVRLayerEyeFovMultires Fov(@NativeType("ovrFovPort[ovrEye_Count]") OVRFovPort.Buffer value) { nFov(address(), value); return this; }
    /** Copies the specified {@link OVRFovPort} at the specified index of the {@link #Fov} field. */
    public OVRLayerEyeFovMultires Fov(int index, @NativeType("ovrFovPort") OVRFovPort value) { nFov(address(), index, value); return this; }
    /** Passes the {@link #Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovMultires Fov(java.util.function.Consumer<OVRFovPort.Buffer> consumer) { consumer.accept(Fov()); return this; }
    /** Passes the element at {@code index} of the {@link #Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovMultires Fov(int index, java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(Fov(index)); return this; }
    /** Copies the specified {@link OVRPosef.Buffer} to the {@link #RenderPose} field. */
    public OVRLayerEyeFovMultires RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
    /** Copies the specified {@link OVRPosef} at the specified index of the {@link #RenderPose} field. */
    public OVRLayerEyeFovMultires RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { nRenderPose(address(), index, value); return this; }
    /** Passes the {@link #RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovMultires RenderPose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(RenderPose()); return this; }
    /** Passes the element at {@code index} of the {@link #RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovMultires RenderPose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RenderPose(index)); return this; }
    /** Sets the specified value to the {@link #SensorSampleTime} field. */
    public OVRLayerEyeFovMultires SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }
    /** Sets the specified value to the {@link #TextureLayout} field. */
    public OVRLayerEyeFovMultires TextureLayout(@NativeType("ovrTextureLayout") int value) { nTextureLayout(address(), value); return this; }
    /** Copies the specified {@link OVRTextureLayoutDescUnion} to the {@link #TextureLayoutDesc} field. */
    public OVRLayerEyeFovMultires TextureLayoutDesc(@NativeType("ovrTextureLayoutDesc_Union") OVRTextureLayoutDescUnion value) { nTextureLayoutDesc(address(), value); return this; }
    /** Passes the {@link #TextureLayoutDesc} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFovMultires TextureLayoutDesc(java.util.function.Consumer<OVRTextureLayoutDescUnion> consumer) { consumer.accept(TextureLayoutDesc()); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerEyeFovMultires set(
        OVRLayerHeader Header,
        PointerBuffer ColorTexture,
        OVRRecti.Buffer Viewport,
        OVRFovPort.Buffer Fov,
        OVRPosef.Buffer RenderPose,
        double SensorSampleTime,
        int TextureLayout,
        OVRTextureLayoutDescUnion TextureLayoutDesc
    ) {
        Header(Header);
        ColorTexture(ColorTexture);
        Viewport(Viewport);
        Fov(Fov);
        RenderPose(RenderPose);
        SensorSampleTime(SensorSampleTime);
        TextureLayout(TextureLayout);
        TextureLayoutDesc(TextureLayoutDesc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerEyeFovMultires set(OVRLayerEyeFovMultires src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerEyeFovMultires} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeFovMultires malloc() {
        return wrap(OVRLayerEyeFovMultires.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRLayerEyeFovMultires} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeFovMultires calloc() {
        return wrap(OVRLayerEyeFovMultires.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRLayerEyeFovMultires} instance allocated with {@link BufferUtils}. */
    public static OVRLayerEyeFovMultires create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRLayerEyeFovMultires.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerEyeFovMultires} instance for the specified memory address. */
    public static OVRLayerEyeFovMultires create(long address) {
        return wrap(OVRLayerEyeFovMultires.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerEyeFovMultires createSafe(long address) {
        return address == NULL ? null : wrap(OVRLayerEyeFovMultires.class, address);
    }

    /**
     * Returns a new {@link OVRLayerEyeFovMultires.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovMultires.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFovMultires.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovMultires.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFovMultires.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovMultires.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRLayerEyeFovMultires.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovMultires.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerEyeFovMultires.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovMultires mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovMultires callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovMultires mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovMultires callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovMultires.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovMultires.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovMultires.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFovMultires.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerEyeFovMultires} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeFovMultires malloc(MemoryStack stack) {
        return wrap(OVRLayerEyeFovMultires.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRLayerEyeFovMultires} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeFovMultires calloc(MemoryStack stack) {
        return wrap(OVRLayerEyeFovMultires.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerEyeFovMultires.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovMultires.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFovMultires.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFovMultires.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerEyeFovMultires.HEADER); }
    /** Unsafe version of {@link #ColorTexture}. */
    public static PointerBuffer nColorTexture(long struct) { return memPointerBuffer(struct + OVRLayerEyeFovMultires.COLORTEXTURE, ovrEye_Count); }
    /** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
    public static long nColorTexture(long struct, int index) {
        return memGetAddress(struct + OVRLayerEyeFovMultires.COLORTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #Viewport}. */
    public static OVRRecti.Buffer nViewport(long struct) { return OVRRecti.create(struct + OVRLayerEyeFovMultires.VIEWPORT, ovrEye_Count); }
    /** Unsafe version of {@link #Viewport(int) Viewport}. */
    public static OVRRecti nViewport(long struct, int index) {
        return OVRRecti.create(struct + OVRLayerEyeFovMultires.VIEWPORT + check(index, ovrEye_Count) * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Fov}. */
    public static OVRFovPort.Buffer nFov(long struct) { return OVRFovPort.create(struct + OVRLayerEyeFovMultires.FOV, ovrEye_Count); }
    /** Unsafe version of {@link #Fov(int) Fov}. */
    public static OVRFovPort nFov(long struct, int index) {
        return OVRFovPort.create(struct + OVRLayerEyeFovMultires.FOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose}. */
    public static OVRPosef.Buffer nRenderPose(long struct) { return OVRPosef.create(struct + OVRLayerEyeFovMultires.RENDERPOSE, ovrEye_Count); }
    /** Unsafe version of {@link #RenderPose(int) RenderPose}. */
    public static OVRPosef nRenderPose(long struct, int index) {
        return OVRPosef.create(struct + OVRLayerEyeFovMultires.RENDERPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime}. */
    public static double nSensorSampleTime(long struct) { return UNSAFE.getDouble(null, struct + OVRLayerEyeFovMultires.SENSORSAMPLETIME); }
    /** Unsafe version of {@link #TextureLayout}. */
    public static int nTextureLayout(long struct) { return UNSAFE.getInt(null, struct + OVRLayerEyeFovMultires.TEXTURELAYOUT); }
    /** Unsafe version of {@link #TextureLayoutDesc}. */
    public static OVRTextureLayoutDescUnion nTextureLayoutDesc(long struct) { return OVRTextureLayoutDescUnion.create(struct + OVRLayerEyeFovMultires.TEXTURELAYOUTDESC); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerEyeFovMultires.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #ColorTexture(PointerBuffer) ColorTexture}. */
    public static void nColorTexture(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(memAddress(value), struct + OVRLayerEyeFovMultires.COLORTEXTURE, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #ColorTexture(int, long) ColorTexture}. */
    public static void nColorTexture(long struct, int index, long value) {
        memPutAddress(struct + OVRLayerEyeFovMultires.COLORTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE, value);
    }
    /** Unsafe version of {@link #Viewport(OVRRecti.Buffer) Viewport}. */
    public static void nViewport(long struct, OVRRecti.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFovMultires.VIEWPORT, value.remaining() * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Viewport(int, OVRRecti) Viewport}. */
    public static void nViewport(long struct, int index, OVRRecti value) {
        memCopy(value.address(), struct + OVRLayerEyeFovMultires.VIEWPORT + check(index, ovrEye_Count) * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Fov(OVRFovPort.Buffer) Fov}. */
    public static void nFov(long struct, OVRFovPort.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFovMultires.FOV, value.remaining() * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #Fov(int, OVRFovPort) Fov}. */
    public static void nFov(long struct, int index, OVRFovPort value) {
        memCopy(value.address(), struct + OVRLayerEyeFovMultires.FOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF, OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(OVRPosef.Buffer) RenderPose}. */
    public static void nRenderPose(long struct, OVRPosef.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFovMultires.RENDERPOSE, value.remaining() * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(int, OVRPosef) RenderPose}. */
    public static void nRenderPose(long struct, int index, OVRPosef value) {
        memCopy(value.address(), struct + OVRLayerEyeFovMultires.RENDERPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime(double) SensorSampleTime}. */
    public static void nSensorSampleTime(long struct, double value) { UNSAFE.putDouble(null, struct + OVRLayerEyeFovMultires.SENSORSAMPLETIME, value); }
    /** Unsafe version of {@link #TextureLayout(int) TextureLayout}. */
    public static void nTextureLayout(long struct, int value) { UNSAFE.putInt(null, struct + OVRLayerEyeFovMultires.TEXTURELAYOUT, value); }
    /** Unsafe version of {@link #TextureLayoutDesc(OVRTextureLayoutDescUnion) TextureLayoutDesc}. */
    public static void nTextureLayoutDesc(long struct, OVRTextureLayoutDescUnion value) { memCopy(value.address(), struct + OVRLayerEyeFovMultires.TEXTURELAYOUTDESC, OVRTextureLayoutDescUnion.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerEyeFovMultires.COLORTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link OVRLayerEyeFovMultires} structs. */
    public static class Buffer extends StructBuffer<OVRLayerEyeFovMultires, Buffer> implements NativeResource {

        private static final OVRLayerEyeFovMultires ELEMENT_FACTORY = OVRLayerEyeFovMultires.create(-1L);

        /**
         * Creates a new {@code OVRLayerEyeFovMultires.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerEyeFovMultires#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerEyeFovMultires getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRLayerHeader} view of the {@link OVRLayerEyeFovMultires#Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerEyeFovMultires.nHeader(address()); }
        /** @return a {@link PointerBuffer} view of the {@link OVRLayerEyeFovMultires#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain[ovrEye_Count]")
        public PointerBuffer ColorTexture() { return OVRLayerEyeFovMultires.nColorTexture(address()); }
        /** @return the value at the specified index of the {@link OVRLayerEyeFovMultires#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long ColorTexture(int index) { return OVRLayerEyeFovMultires.nColorTexture(address(), index); }
        /** @return a {@link OVRRecti}.Buffer view of the {@link OVRLayerEyeFovMultires#Viewport} field. */
        @NativeType("ovrRecti[ovrEye_Count]")
        public OVRRecti.Buffer Viewport() { return OVRLayerEyeFovMultires.nViewport(address()); }
        /** @return a {@link OVRRecti} view of the struct at the specified index of the {@link OVRLayerEyeFovMultires#Viewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti Viewport(int index) { return OVRLayerEyeFovMultires.nViewport(address(), index); }
        /** @return a {@link OVRFovPort}.Buffer view of the {@link OVRLayerEyeFovMultires#Fov} field. */
        @NativeType("ovrFovPort[ovrEye_Count]")
        public OVRFovPort.Buffer Fov() { return OVRLayerEyeFovMultires.nFov(address()); }
        /** @return a {@link OVRFovPort} view of the struct at the specified index of the {@link OVRLayerEyeFovMultires#Fov} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort Fov(int index) { return OVRLayerEyeFovMultires.nFov(address(), index); }
        /** @return a {@link OVRPosef}.Buffer view of the {@link OVRLayerEyeFovMultires#RenderPose} field. */
        @NativeType("ovrPosef[ovrEye_Count]")
        public OVRPosef.Buffer RenderPose() { return OVRLayerEyeFovMultires.nRenderPose(address()); }
        /** @return a {@link OVRPosef} view of the struct at the specified index of the {@link OVRLayerEyeFovMultires#RenderPose} field. */
        @NativeType("ovrPosef")
        public OVRPosef RenderPose(int index) { return OVRLayerEyeFovMultires.nRenderPose(address(), index); }
        /** @return the value of the {@link OVRLayerEyeFovMultires#SensorSampleTime} field. */
        public double SensorSampleTime() { return OVRLayerEyeFovMultires.nSensorSampleTime(address()); }
        /** @return the value of the {@link OVRLayerEyeFovMultires#TextureLayout} field. */
        @NativeType("ovrTextureLayout")
        public int TextureLayout() { return OVRLayerEyeFovMultires.nTextureLayout(address()); }
        /** @return a {@link OVRTextureLayoutDescUnion} view of the {@link OVRLayerEyeFovMultires#TextureLayoutDesc} field. */
        @NativeType("ovrTextureLayoutDesc_Union")
        public OVRTextureLayoutDescUnion TextureLayoutDesc() { return OVRLayerEyeFovMultires.nTextureLayoutDesc(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@link OVRLayerEyeFovMultires#Header} field. */
        public OVRLayerEyeFovMultires.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerEyeFovMultires.nHeader(address(), value); return this; }
        /** Passes the {@link OVRLayerEyeFovMultires#Header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovMultires.Buffer Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@link OVRLayerEyeFovMultires#ColorTexture} field. */
        public OVRLayerEyeFovMultires.Buffer ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { OVRLayerEyeFovMultires.nColorTexture(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link OVRLayerEyeFovMultires#ColorTexture} field. */
        public OVRLayerEyeFovMultires.Buffer ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { OVRLayerEyeFovMultires.nColorTexture(address(), index, value); return this; }
        /** Copies the specified {@link OVRRecti.Buffer} to the {@link OVRLayerEyeFovMultires#Viewport} field. */
        public OVRLayerEyeFovMultires.Buffer Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { OVRLayerEyeFovMultires.nViewport(address(), value); return this; }
        /** Copies the specified {@link OVRRecti} at the specified index of the {@link OVRLayerEyeFovMultires#Viewport} field. */
        public OVRLayerEyeFovMultires.Buffer Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { OVRLayerEyeFovMultires.nViewport(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFovMultires#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovMultires.Buffer Viewport(java.util.function.Consumer<OVRRecti.Buffer> consumer) { consumer.accept(Viewport()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFovMultires#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovMultires.Buffer Viewport(int index, java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport(index)); return this; }
        /** Copies the specified {@link OVRFovPort.Buffer} to the {@link OVRLayerEyeFovMultires#Fov} field. */
        public OVRLayerEyeFovMultires.Buffer Fov(@NativeType("ovrFovPort[ovrEye_Count]") OVRFovPort.Buffer value) { OVRLayerEyeFovMultires.nFov(address(), value); return this; }
        /** Copies the specified {@link OVRFovPort} at the specified index of the {@link OVRLayerEyeFovMultires#Fov} field. */
        public OVRLayerEyeFovMultires.Buffer Fov(int index, @NativeType("ovrFovPort") OVRFovPort value) { OVRLayerEyeFovMultires.nFov(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFovMultires#Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovMultires.Buffer Fov(java.util.function.Consumer<OVRFovPort.Buffer> consumer) { consumer.accept(Fov()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFovMultires#Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovMultires.Buffer Fov(int index, java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(Fov(index)); return this; }
        /** Copies the specified {@link OVRPosef.Buffer} to the {@link OVRLayerEyeFovMultires#RenderPose} field. */
        public OVRLayerEyeFovMultires.Buffer RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { OVRLayerEyeFovMultires.nRenderPose(address(), value); return this; }
        /** Copies the specified {@link OVRPosef} at the specified index of the {@link OVRLayerEyeFovMultires#RenderPose} field. */
        public OVRLayerEyeFovMultires.Buffer RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { OVRLayerEyeFovMultires.nRenderPose(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFovMultires#RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovMultires.Buffer RenderPose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(RenderPose()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFovMultires#RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovMultires.Buffer RenderPose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RenderPose(index)); return this; }
        /** Sets the specified value to the {@link OVRLayerEyeFovMultires#SensorSampleTime} field. */
        public OVRLayerEyeFovMultires.Buffer SensorSampleTime(double value) { OVRLayerEyeFovMultires.nSensorSampleTime(address(), value); return this; }
        /** Sets the specified value to the {@link OVRLayerEyeFovMultires#TextureLayout} field. */
        public OVRLayerEyeFovMultires.Buffer TextureLayout(@NativeType("ovrTextureLayout") int value) { OVRLayerEyeFovMultires.nTextureLayout(address(), value); return this; }
        /** Copies the specified {@link OVRTextureLayoutDescUnion} to the {@link OVRLayerEyeFovMultires#TextureLayoutDesc} field. */
        public OVRLayerEyeFovMultires.Buffer TextureLayoutDesc(@NativeType("ovrTextureLayoutDesc_Union") OVRTextureLayoutDescUnion value) { OVRLayerEyeFovMultires.nTextureLayoutDesc(address(), value); return this; }
        /** Passes the {@link OVRLayerEyeFovMultires#TextureLayoutDesc} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFovMultires.Buffer TextureLayoutDesc(java.util.function.Consumer<OVRTextureLayoutDescUnion> consumer) { consumer.accept(TextureLayoutDesc()); return this; }

    }

}