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
 * Describes a layer that specifies a monoscopic or stereoscopic view. This is the kind of layer that's typically used as layer 0 to
 * {@link OVR#ovr_SubmitFrame SubmitFrame}, as it is the kind of layer used to render a 3D stereoscopic view.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrLayerEyeFov {
 *     {@link OVRLayerHeader ovrLayerHeader} {@link #Header};
 *     ovrTextureSwapChain {@link #ColorTexture}[ovrEye_Count];
 *     {@link OVRRecti ovrRecti} {@link #Viewport}[ovrEye_Count];
 *     {@link OVRFovPort ovrFovPort} {@link #Fov}[ovrEye_Count];
 *     {@link OVRPosef ovrPosef} {@link #RenderPose}[ovrEye_Count];
 *     double {@link #SensorSampleTime};
 * }</code></pre>
 */
@NativeType("struct ovrLayerEyeFov")
public class OVRLayerEyeFov extends Struct implements NativeResource {

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
        SENSORSAMPLETIME;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF, true),
            __array(POINTER_SIZE, ovrEye_Count),
            __array(OVRRecti.SIZEOF, OVRRecti.ALIGNOF, ovrEye_Count),
            __array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, ovrEye_Count),
            __array(OVRPosef.SIZEOF, OVRPosef.ALIGNOF, ovrEye_Count),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        COLORTEXTURE = layout.offsetof(1);
        VIEWPORT = layout.offsetof(2);
        FOV = layout.offsetof(3);
        RENDERPOSE = layout.offsetof(4);
        SENSORSAMPLETIME = layout.offsetof(5);
    }

    /**
     * Creates a {@code OVRLayerEyeFov} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerEyeFov(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code Header.Type} must be {@link OVR#ovrLayerType_EyeFov LayerType_EyeFov} */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** {@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be {@code NULL}. */
    @NativeType("ovrTextureSwapChain[ovrEye_Count]")
    public PointerBuffer ColorTexture() { return nColorTexture(address()); }
    /** {@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be {@code NULL}. */
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
     * specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
     * {@link OVRUtil#ovr_CalcEyePoses _CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.
     */
    @NativeType("ovrPosef[ovrEye_Count]")
    public OVRPosef.Buffer RenderPose() { return nRenderPose(address()); }
    /**
     * specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
     * {@link OVRUtil#ovr_CalcEyePoses _CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.
     */
    @NativeType("ovrPosef")
    public OVRPosef RenderPose(int index) { return nRenderPose(address(), index); }
    /**
     * specifies the timestamp when the source {@link OVRPosef} (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
     * {@link OVR#ovr_GetTimeInSeconds GetTimeInSeconds} around the instant the application calls {@link OVR#ovr_GetTrackingState GetTrackingState}. The main purpose for this is to accurately track app
     * tracking latency.
     */
    public double SensorSampleTime() { return nSensorSampleTime(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@link #Header} field. */
    public OVRLayerEyeFov Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Passes the {@link #Header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFov Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@link #ColorTexture} field. */
    public OVRLayerEyeFov ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { nColorTexture(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ColorTexture} field. */
    public OVRLayerEyeFov ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { nColorTexture(address(), index, value); return this; }
    /** Copies the specified {@link OVRRecti.Buffer} to the {@link #Viewport} field. */
    public OVRLayerEyeFov Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { nViewport(address(), value); return this; }
    /** Copies the specified {@link OVRRecti} at the specified index of the {@link #Viewport} field. */
    public OVRLayerEyeFov Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { nViewport(address(), index, value); return this; }
    /** Passes the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFov Viewport(java.util.function.Consumer<OVRRecti.Buffer> consumer) { consumer.accept(Viewport()); return this; }
    /** Passes the element at {@code index} of the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFov Viewport(int index, java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport(index)); return this; }
    /** Copies the specified {@link OVRFovPort.Buffer} to the {@link #Fov} field. */
    public OVRLayerEyeFov Fov(@NativeType("ovrFovPort[ovrEye_Count]") OVRFovPort.Buffer value) { nFov(address(), value); return this; }
    /** Copies the specified {@link OVRFovPort} at the specified index of the {@link #Fov} field. */
    public OVRLayerEyeFov Fov(int index, @NativeType("ovrFovPort") OVRFovPort value) { nFov(address(), index, value); return this; }
    /** Passes the {@link #Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFov Fov(java.util.function.Consumer<OVRFovPort.Buffer> consumer) { consumer.accept(Fov()); return this; }
    /** Passes the element at {@code index} of the {@link #Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFov Fov(int index, java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(Fov(index)); return this; }
    /** Copies the specified {@link OVRPosef.Buffer} to the {@link #RenderPose} field. */
    public OVRLayerEyeFov RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
    /** Copies the specified {@link OVRPosef} at the specified index of the {@link #RenderPose} field. */
    public OVRLayerEyeFov RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { nRenderPose(address(), index, value); return this; }
    /** Passes the {@link #RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFov RenderPose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(RenderPose()); return this; }
    /** Passes the element at {@code index} of the {@link #RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeFov RenderPose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RenderPose(index)); return this; }
    /** Sets the specified value to the {@link #SensorSampleTime} field. */
    public OVRLayerEyeFov SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerEyeFov set(
        OVRLayerHeader Header,
        PointerBuffer ColorTexture,
        OVRRecti.Buffer Viewport,
        OVRFovPort.Buffer Fov,
        OVRPosef.Buffer RenderPose,
        double SensorSampleTime
    ) {
        Header(Header);
        ColorTexture(ColorTexture);
        Viewport(Viewport);
        Fov(Fov);
        RenderPose(RenderPose);
        SensorSampleTime(SensorSampleTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerEyeFov set(OVRLayerEyeFov src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerEyeFov} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeFov malloc() {
        return wrap(OVRLayerEyeFov.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRLayerEyeFov} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeFov calloc() {
        return wrap(OVRLayerEyeFov.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRLayerEyeFov} instance allocated with {@link BufferUtils}. */
    public static OVRLayerEyeFov create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRLayerEyeFov.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerEyeFov} instance for the specified memory address. */
    public static OVRLayerEyeFov create(long address) {
        return wrap(OVRLayerEyeFov.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerEyeFov createSafe(long address) {
        return address == NULL ? null : wrap(OVRLayerEyeFov.class, address);
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFov.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFov.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFov.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRLayerEyeFov.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFov.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerEyeFov.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFov mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFov callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFov mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFov callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFov.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFov.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFov.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeFov.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerEyeFov} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeFov malloc(MemoryStack stack) {
        return wrap(OVRLayerEyeFov.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRLayerEyeFov} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeFov calloc(MemoryStack stack) {
        return wrap(OVRLayerEyeFov.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFov.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeFov.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeFov.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerEyeFov.HEADER); }
    /** Unsafe version of {@link #ColorTexture}. */
    public static PointerBuffer nColorTexture(long struct) { return memPointerBuffer(struct + OVRLayerEyeFov.COLORTEXTURE, ovrEye_Count); }
    /** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
    public static long nColorTexture(long struct, int index) {
        return memGetAddress(struct + OVRLayerEyeFov.COLORTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #Viewport}. */
    public static OVRRecti.Buffer nViewport(long struct) { return OVRRecti.create(struct + OVRLayerEyeFov.VIEWPORT, ovrEye_Count); }
    /** Unsafe version of {@link #Viewport(int) Viewport}. */
    public static OVRRecti nViewport(long struct, int index) {
        return OVRRecti.create(struct + OVRLayerEyeFov.VIEWPORT + check(index, ovrEye_Count) * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Fov}. */
    public static OVRFovPort.Buffer nFov(long struct) { return OVRFovPort.create(struct + OVRLayerEyeFov.FOV, ovrEye_Count); }
    /** Unsafe version of {@link #Fov(int) Fov}. */
    public static OVRFovPort nFov(long struct, int index) {
        return OVRFovPort.create(struct + OVRLayerEyeFov.FOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose}. */
    public static OVRPosef.Buffer nRenderPose(long struct) { return OVRPosef.create(struct + OVRLayerEyeFov.RENDERPOSE, ovrEye_Count); }
    /** Unsafe version of {@link #RenderPose(int) RenderPose}. */
    public static OVRPosef nRenderPose(long struct, int index) {
        return OVRPosef.create(struct + OVRLayerEyeFov.RENDERPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime}. */
    public static double nSensorSampleTime(long struct) { return UNSAFE.getDouble(null, struct + OVRLayerEyeFov.SENSORSAMPLETIME); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerEyeFov.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #ColorTexture(PointerBuffer) ColorTexture}. */
    public static void nColorTexture(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(memAddress(value), struct + OVRLayerEyeFov.COLORTEXTURE, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #ColorTexture(int, long) ColorTexture}. */
    public static void nColorTexture(long struct, int index, long value) {
        memPutAddress(struct + OVRLayerEyeFov.COLORTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE, value);
    }
    /** Unsafe version of {@link #Viewport(OVRRecti.Buffer) Viewport}. */
    public static void nViewport(long struct, OVRRecti.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.VIEWPORT, value.remaining() * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Viewport(int, OVRRecti) Viewport}. */
    public static void nViewport(long struct, int index, OVRRecti value) {
        memCopy(value.address(), struct + OVRLayerEyeFov.VIEWPORT + check(index, ovrEye_Count) * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Fov(OVRFovPort.Buffer) Fov}. */
    public static void nFov(long struct, OVRFovPort.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.FOV, value.remaining() * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #Fov(int, OVRFovPort) Fov}. */
    public static void nFov(long struct, int index, OVRFovPort value) {
        memCopy(value.address(), struct + OVRLayerEyeFov.FOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF, OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(OVRPosef.Buffer) RenderPose}. */
    public static void nRenderPose(long struct, OVRPosef.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeFov.RENDERPOSE, value.remaining() * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(int, OVRPosef) RenderPose}. */
    public static void nRenderPose(long struct, int index, OVRPosef value) {
        memCopy(value.address(), struct + OVRLayerEyeFov.RENDERPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime(double) SensorSampleTime}. */
    public static void nSensorSampleTime(long struct, double value) { UNSAFE.putDouble(null, struct + OVRLayerEyeFov.SENSORSAMPLETIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerEyeFov.COLORTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link OVRLayerEyeFov} structs. */
    public static class Buffer extends StructBuffer<OVRLayerEyeFov, Buffer> implements NativeResource {

        private static final OVRLayerEyeFov ELEMENT_FACTORY = OVRLayerEyeFov.create(-1L);

        /**
         * Creates a new {@code OVRLayerEyeFov.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerEyeFov#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerEyeFov getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRLayerHeader} view of the {@link OVRLayerEyeFov#Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerEyeFov.nHeader(address()); }
        /** @return a {@link PointerBuffer} view of the {@link OVRLayerEyeFov#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain[ovrEye_Count]")
        public PointerBuffer ColorTexture() { return OVRLayerEyeFov.nColorTexture(address()); }
        /** @return the value at the specified index of the {@link OVRLayerEyeFov#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long ColorTexture(int index) { return OVRLayerEyeFov.nColorTexture(address(), index); }
        /** @return a {@link OVRRecti}.Buffer view of the {@link OVRLayerEyeFov#Viewport} field. */
        @NativeType("ovrRecti[ovrEye_Count]")
        public OVRRecti.Buffer Viewport() { return OVRLayerEyeFov.nViewport(address()); }
        /** @return a {@link OVRRecti} view of the struct at the specified index of the {@link OVRLayerEyeFov#Viewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti Viewport(int index) { return OVRLayerEyeFov.nViewport(address(), index); }
        /** @return a {@link OVRFovPort}.Buffer view of the {@link OVRLayerEyeFov#Fov} field. */
        @NativeType("ovrFovPort[ovrEye_Count]")
        public OVRFovPort.Buffer Fov() { return OVRLayerEyeFov.nFov(address()); }
        /** @return a {@link OVRFovPort} view of the struct at the specified index of the {@link OVRLayerEyeFov#Fov} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort Fov(int index) { return OVRLayerEyeFov.nFov(address(), index); }
        /** @return a {@link OVRPosef}.Buffer view of the {@link OVRLayerEyeFov#RenderPose} field. */
        @NativeType("ovrPosef[ovrEye_Count]")
        public OVRPosef.Buffer RenderPose() { return OVRLayerEyeFov.nRenderPose(address()); }
        /** @return a {@link OVRPosef} view of the struct at the specified index of the {@link OVRLayerEyeFov#RenderPose} field. */
        @NativeType("ovrPosef")
        public OVRPosef RenderPose(int index) { return OVRLayerEyeFov.nRenderPose(address(), index); }
        /** @return the value of the {@link OVRLayerEyeFov#SensorSampleTime} field. */
        public double SensorSampleTime() { return OVRLayerEyeFov.nSensorSampleTime(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@link OVRLayerEyeFov#Header} field. */
        public OVRLayerEyeFov.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerEyeFov.nHeader(address(), value); return this; }
        /** Passes the {@link OVRLayerEyeFov#Header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFov.Buffer Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@link OVRLayerEyeFov#ColorTexture} field. */
        public OVRLayerEyeFov.Buffer ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { OVRLayerEyeFov.nColorTexture(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link OVRLayerEyeFov#ColorTexture} field. */
        public OVRLayerEyeFov.Buffer ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { OVRLayerEyeFov.nColorTexture(address(), index, value); return this; }
        /** Copies the specified {@link OVRRecti.Buffer} to the {@link OVRLayerEyeFov#Viewport} field. */
        public OVRLayerEyeFov.Buffer Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { OVRLayerEyeFov.nViewport(address(), value); return this; }
        /** Copies the specified {@link OVRRecti} at the specified index of the {@link OVRLayerEyeFov#Viewport} field. */
        public OVRLayerEyeFov.Buffer Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { OVRLayerEyeFov.nViewport(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFov#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFov.Buffer Viewport(java.util.function.Consumer<OVRRecti.Buffer> consumer) { consumer.accept(Viewport()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFov#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFov.Buffer Viewport(int index, java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport(index)); return this; }
        /** Copies the specified {@link OVRFovPort.Buffer} to the {@link OVRLayerEyeFov#Fov} field. */
        public OVRLayerEyeFov.Buffer Fov(@NativeType("ovrFovPort[ovrEye_Count]") OVRFovPort.Buffer value) { OVRLayerEyeFov.nFov(address(), value); return this; }
        /** Copies the specified {@link OVRFovPort} at the specified index of the {@link OVRLayerEyeFov#Fov} field. */
        public OVRLayerEyeFov.Buffer Fov(int index, @NativeType("ovrFovPort") OVRFovPort value) { OVRLayerEyeFov.nFov(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFov#Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFov.Buffer Fov(java.util.function.Consumer<OVRFovPort.Buffer> consumer) { consumer.accept(Fov()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFov#Fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFov.Buffer Fov(int index, java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(Fov(index)); return this; }
        /** Copies the specified {@link OVRPosef.Buffer} to the {@link OVRLayerEyeFov#RenderPose} field. */
        public OVRLayerEyeFov.Buffer RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { OVRLayerEyeFov.nRenderPose(address(), value); return this; }
        /** Copies the specified {@link OVRPosef} at the specified index of the {@link OVRLayerEyeFov#RenderPose} field. */
        public OVRLayerEyeFov.Buffer RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { OVRLayerEyeFov.nRenderPose(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeFov#RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFov.Buffer RenderPose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(RenderPose()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeFov#RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeFov.Buffer RenderPose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RenderPose(index)); return this; }
        /** Sets the specified value to the {@link OVRLayerEyeFov#SensorSampleTime} field. */
        public OVRLayerEyeFov.Buffer SensorSampleTime(double value) { OVRLayerEyeFov.nSensorSampleTime(address(), value); return this; }

    }

}