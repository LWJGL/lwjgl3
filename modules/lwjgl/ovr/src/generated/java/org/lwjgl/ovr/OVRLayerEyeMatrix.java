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
 * Describes a layer that specifies a monoscopic or stereoscopic view.
 * 
 * <p>This uses a direct 3x4 matrix to map from view space to the UV coordinates. It is essentially the same thing as {@link OVRLayerEyeFov} but using a much
 * lower level. This is mainly to provide compatibility with specific apps. Unless the application really requires this flexibility, it is usually
 * better to use {@code ovrLayerEyeFov}.</p>
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
 * struct ovrLayerEyeMatrix {
 *     {@link OVRLayerHeader ovrLayerHeader} {@link #Header};
 *     ovrTextureSwapChain {@link #ColorTexture}[ovrEye_Count];
 *     {@link OVRRecti ovrRecti} {@link #Viewport}[ovrEye_Count];
 *     {@link OVRPosef ovrPosef} {@link #RenderPose}[ovrEye_Count];
 *     {@link OVRMatrix4f ovrMatrix4f} {@link #Matrix}[ovrEye_Count];
 *     double {@link #SensorSampleTime};
 * }</code></pre>
 */
@NativeType("struct ovrLayerEyeMatrix")
public class OVRLayerEyeMatrix extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        COLORTEXTURE,
        VIEWPORT,
        RENDERPOSE,
        MATRIX,
        SENSORSAMPLETIME;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF, true),
            __array(POINTER_SIZE, ovrEye_Count),
            __array(OVRRecti.SIZEOF, OVRRecti.ALIGNOF, ovrEye_Count),
            __array(OVRPosef.SIZEOF, OVRPosef.ALIGNOF, ovrEye_Count),
            __array(OVRMatrix4f.SIZEOF, OVRMatrix4f.ALIGNOF, ovrEye_Count),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        COLORTEXTURE = layout.offsetof(1);
        VIEWPORT = layout.offsetof(2);
        RENDERPOSE = layout.offsetof(3);
        MATRIX = layout.offsetof(4);
        SENSORSAMPLETIME = layout.offsetof(5);
    }

    /**
     * Creates a {@code OVRLayerEyeMatrix} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerEyeMatrix(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code Header.Type} must be {@link OVR#ovrLayerType_EyeMatrix LayerType_EyeMatrix} */
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
    /**
     * specifies the position and orientation of each eye view, with the position specified in meters. {@code RenderPose} will typically be the value
     * returned from {@link OVRUtil#ovr_CalcEyePoses _CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.
     */
    @NativeType("ovrPosef[ovrEye_Count]")
    public OVRPosef.Buffer RenderPose() { return nRenderPose(address()); }
    /**
     * specifies the position and orientation of each eye view, with the position specified in meters. {@code RenderPose} will typically be the value
     * returned from {@link OVRUtil#ovr_CalcEyePoses _CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.
     */
    @NativeType("ovrPosef")
    public OVRPosef RenderPose(int index) { return nRenderPose(address(), index); }
    /**
     * specifies the mapping from a view-space vector to a UV coordinate on the textures given above.
     * 
     * <pre><code>
     * P = (x,y,z,1)*Matrix
     * TexU  = P.x/P.z
     * TexV  = P.y/P.z</code></pre>
     */
    @NativeType("ovrMatrix4f[ovrEye_Count]")
    public OVRMatrix4f.Buffer Matrix() { return nMatrix(address()); }
    /**
     * specifies the mapping from a view-space vector to a UV coordinate on the textures given above.
     * 
     * <pre><code>
     * P = (x,y,z,1)*Matrix
     * TexU  = P.x/P.z
     * TexV  = P.y/P.z</code></pre>
     */
    @NativeType("ovrMatrix4f")
    public OVRMatrix4f Matrix(int index) { return nMatrix(address(), index); }
    /**
     * specifies the timestamp when the source {@code ovrPosef} (used in calculating {@code RenderPose}) was sampled from the SDK. Typically retrieved by
     * calling {@link OVR#ovr_GetTimeInSeconds GetTimeInSeconds} around the instant the application calls {@link OVR#ovr_GetTrackingState GetTrackingState} The main purpose for this is to accurately track app
     * tracking latency.
     */
    public double SensorSampleTime() { return nSensorSampleTime(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@link #Header} field. */
    public OVRLayerEyeMatrix Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Passes the {@link #Header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeMatrix Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@link #ColorTexture} field. */
    public OVRLayerEyeMatrix ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { nColorTexture(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ColorTexture} field. */
    public OVRLayerEyeMatrix ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { nColorTexture(address(), index, value); return this; }
    /** Copies the specified {@link OVRRecti.Buffer} to the {@link #Viewport} field. */
    public OVRLayerEyeMatrix Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { nViewport(address(), value); return this; }
    /** Copies the specified {@link OVRRecti} at the specified index of the {@link #Viewport} field. */
    public OVRLayerEyeMatrix Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { nViewport(address(), index, value); return this; }
    /** Passes the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeMatrix Viewport(java.util.function.Consumer<OVRRecti.Buffer> consumer) { consumer.accept(Viewport()); return this; }
    /** Passes the element at {@code index} of the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeMatrix Viewport(int index, java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport(index)); return this; }
    /** Copies the specified {@link OVRPosef.Buffer} to the {@link #RenderPose} field. */
    public OVRLayerEyeMatrix RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
    /** Copies the specified {@link OVRPosef} at the specified index of the {@link #RenderPose} field. */
    public OVRLayerEyeMatrix RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { nRenderPose(address(), index, value); return this; }
    /** Passes the {@link #RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeMatrix RenderPose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(RenderPose()); return this; }
    /** Passes the element at {@code index} of the {@link #RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeMatrix RenderPose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RenderPose(index)); return this; }
    /** Copies the specified {@link OVRMatrix4f.Buffer} to the {@link #Matrix} field. */
    public OVRLayerEyeMatrix Matrix(@NativeType("ovrMatrix4f[ovrEye_Count]") OVRMatrix4f.Buffer value) { nMatrix(address(), value); return this; }
    /** Copies the specified {@link OVRMatrix4f} at the specified index of the {@link #Matrix} field. */
    public OVRLayerEyeMatrix Matrix(int index, @NativeType("ovrMatrix4f") OVRMatrix4f value) { nMatrix(address(), index, value); return this; }
    /** Passes the {@link #Matrix} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeMatrix Matrix(java.util.function.Consumer<OVRMatrix4f.Buffer> consumer) { consumer.accept(Matrix()); return this; }
    /** Passes the element at {@code index} of the {@link #Matrix} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerEyeMatrix Matrix(int index, java.util.function.Consumer<OVRMatrix4f> consumer) { consumer.accept(Matrix(index)); return this; }
    /** Sets the specified value to the {@link #SensorSampleTime} field. */
    public OVRLayerEyeMatrix SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerEyeMatrix set(
        OVRLayerHeader Header,
        PointerBuffer ColorTexture,
        OVRRecti.Buffer Viewport,
        OVRPosef.Buffer RenderPose,
        OVRMatrix4f.Buffer Matrix,
        double SensorSampleTime
    ) {
        Header(Header);
        ColorTexture(ColorTexture);
        Viewport(Viewport);
        RenderPose(RenderPose);
        Matrix(Matrix);
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
    public OVRLayerEyeMatrix set(OVRLayerEyeMatrix src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerEyeMatrix} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeMatrix malloc() {
        return wrap(OVRLayerEyeMatrix.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRLayerEyeMatrix} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerEyeMatrix calloc() {
        return wrap(OVRLayerEyeMatrix.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRLayerEyeMatrix} instance allocated with {@link BufferUtils}. */
    public static OVRLayerEyeMatrix create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRLayerEyeMatrix.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerEyeMatrix} instance for the specified memory address. */
    public static OVRLayerEyeMatrix create(long address) {
        return wrap(OVRLayerEyeMatrix.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerEyeMatrix createSafe(long address) {
        return address == NULL ? null : wrap(OVRLayerEyeMatrix.class, address);
    }

    /**
     * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeMatrix.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeMatrix.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeMatrix.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRLayerEyeMatrix.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeMatrix.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerEyeMatrix.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeMatrix mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeMatrix callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeMatrix mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeMatrix callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeMatrix.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeMatrix.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeMatrix.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerEyeMatrix.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerEyeMatrix} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeMatrix malloc(MemoryStack stack) {
        return wrap(OVRLayerEyeMatrix.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRLayerEyeMatrix} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerEyeMatrix calloc(MemoryStack stack) {
        return wrap(OVRLayerEyeMatrix.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeMatrix.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerEyeMatrix.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerEyeMatrix.HEADER); }
    /** Unsafe version of {@link #ColorTexture}. */
    public static PointerBuffer nColorTexture(long struct) { return memPointerBuffer(struct + OVRLayerEyeMatrix.COLORTEXTURE, ovrEye_Count); }
    /** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
    public static long nColorTexture(long struct, int index) {
        return memGetAddress(struct + OVRLayerEyeMatrix.COLORTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #Viewport}. */
    public static OVRRecti.Buffer nViewport(long struct) { return OVRRecti.create(struct + OVRLayerEyeMatrix.VIEWPORT, ovrEye_Count); }
    /** Unsafe version of {@link #Viewport(int) Viewport}. */
    public static OVRRecti nViewport(long struct, int index) {
        return OVRRecti.create(struct + OVRLayerEyeMatrix.VIEWPORT + check(index, ovrEye_Count) * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose}. */
    public static OVRPosef.Buffer nRenderPose(long struct) { return OVRPosef.create(struct + OVRLayerEyeMatrix.RENDERPOSE, ovrEye_Count); }
    /** Unsafe version of {@link #RenderPose(int) RenderPose}. */
    public static OVRPosef nRenderPose(long struct, int index) {
        return OVRPosef.create(struct + OVRLayerEyeMatrix.RENDERPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #Matrix}. */
    public static OVRMatrix4f.Buffer nMatrix(long struct) { return OVRMatrix4f.create(struct + OVRLayerEyeMatrix.MATRIX, ovrEye_Count); }
    /** Unsafe version of {@link #Matrix(int) Matrix}. */
    public static OVRMatrix4f nMatrix(long struct, int index) {
        return OVRMatrix4f.create(struct + OVRLayerEyeMatrix.MATRIX + check(index, ovrEye_Count) * OVRMatrix4f.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime}. */
    public static double nSensorSampleTime(long struct) { return UNSAFE.getDouble(null, struct + OVRLayerEyeMatrix.SENSORSAMPLETIME); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerEyeMatrix.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #ColorTexture(PointerBuffer) ColorTexture}. */
    public static void nColorTexture(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(memAddress(value), struct + OVRLayerEyeMatrix.COLORTEXTURE, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #ColorTexture(int, long) ColorTexture}. */
    public static void nColorTexture(long struct, int index, long value) {
        memPutAddress(struct + OVRLayerEyeMatrix.COLORTEXTURE + check(index, ovrEye_Count) * POINTER_SIZE, value);
    }
    /** Unsafe version of {@link #Viewport(OVRRecti.Buffer) Viewport}. */
    public static void nViewport(long struct, OVRRecti.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeMatrix.VIEWPORT, value.remaining() * OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #Viewport(int, OVRRecti) Viewport}. */
    public static void nViewport(long struct, int index, OVRRecti value) {
        memCopy(value.address(), struct + OVRLayerEyeMatrix.VIEWPORT + check(index, ovrEye_Count) * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(OVRPosef.Buffer) RenderPose}. */
    public static void nRenderPose(long struct, OVRPosef.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeMatrix.RENDERPOSE, value.remaining() * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #RenderPose(int, OVRPosef) RenderPose}. */
    public static void nRenderPose(long struct, int index, OVRPosef value) {
        memCopy(value.address(), struct + OVRLayerEyeMatrix.RENDERPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #Matrix(OVRMatrix4f.Buffer) Matrix}. */
    public static void nMatrix(long struct, OVRMatrix4f.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRLayerEyeMatrix.MATRIX, value.remaining() * OVRMatrix4f.SIZEOF);
    }
    /** Unsafe version of {@link #Matrix(int, OVRMatrix4f) Matrix}. */
    public static void nMatrix(long struct, int index, OVRMatrix4f value) {
        memCopy(value.address(), struct + OVRLayerEyeMatrix.MATRIX + check(index, ovrEye_Count) * OVRMatrix4f.SIZEOF, OVRMatrix4f.SIZEOF);
    }
    /** Unsafe version of {@link #SensorSampleTime(double) SensorSampleTime}. */
    public static void nSensorSampleTime(long struct, double value) { UNSAFE.putDouble(null, struct + OVRLayerEyeMatrix.SENSORSAMPLETIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerEyeMatrix.COLORTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link OVRLayerEyeMatrix} structs. */
    public static class Buffer extends StructBuffer<OVRLayerEyeMatrix, Buffer> implements NativeResource {

        private static final OVRLayerEyeMatrix ELEMENT_FACTORY = OVRLayerEyeMatrix.create(-1L);

        /**
         * Creates a new {@code OVRLayerEyeMatrix.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerEyeMatrix#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerEyeMatrix getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRLayerHeader} view of the {@link OVRLayerEyeMatrix#Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerEyeMatrix.nHeader(address()); }
        /** @return a {@link PointerBuffer} view of the {@link OVRLayerEyeMatrix#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain[ovrEye_Count]")
        public PointerBuffer ColorTexture() { return OVRLayerEyeMatrix.nColorTexture(address()); }
        /** @return the value at the specified index of the {@link OVRLayerEyeMatrix#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long ColorTexture(int index) { return OVRLayerEyeMatrix.nColorTexture(address(), index); }
        /** @return a {@link OVRRecti}.Buffer view of the {@link OVRLayerEyeMatrix#Viewport} field. */
        @NativeType("ovrRecti[ovrEye_Count]")
        public OVRRecti.Buffer Viewport() { return OVRLayerEyeMatrix.nViewport(address()); }
        /** @return a {@link OVRRecti} view of the struct at the specified index of the {@link OVRLayerEyeMatrix#Viewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti Viewport(int index) { return OVRLayerEyeMatrix.nViewport(address(), index); }
        /** @return a {@link OVRPosef}.Buffer view of the {@link OVRLayerEyeMatrix#RenderPose} field. */
        @NativeType("ovrPosef[ovrEye_Count]")
        public OVRPosef.Buffer RenderPose() { return OVRLayerEyeMatrix.nRenderPose(address()); }
        /** @return a {@link OVRPosef} view of the struct at the specified index of the {@link OVRLayerEyeMatrix#RenderPose} field. */
        @NativeType("ovrPosef")
        public OVRPosef RenderPose(int index) { return OVRLayerEyeMatrix.nRenderPose(address(), index); }
        /** @return a {@link OVRMatrix4f}.Buffer view of the {@link OVRLayerEyeMatrix#Matrix} field. */
        @NativeType("ovrMatrix4f[ovrEye_Count]")
        public OVRMatrix4f.Buffer Matrix() { return OVRLayerEyeMatrix.nMatrix(address()); }
        /** @return a {@link OVRMatrix4f} view of the struct at the specified index of the {@link OVRLayerEyeMatrix#Matrix} field. */
        @NativeType("ovrMatrix4f")
        public OVRMatrix4f Matrix(int index) { return OVRLayerEyeMatrix.nMatrix(address(), index); }
        /** @return the value of the {@link OVRLayerEyeMatrix#SensorSampleTime} field. */
        public double SensorSampleTime() { return OVRLayerEyeMatrix.nSensorSampleTime(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@link OVRLayerEyeMatrix#Header} field. */
        public OVRLayerEyeMatrix.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerEyeMatrix.nHeader(address(), value); return this; }
        /** Passes the {@link OVRLayerEyeMatrix#Header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeMatrix.Buffer Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@link OVRLayerEyeMatrix#ColorTexture} field. */
        public OVRLayerEyeMatrix.Buffer ColorTexture(@NativeType("ovrTextureSwapChain[ovrEye_Count]") PointerBuffer value) { OVRLayerEyeMatrix.nColorTexture(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link OVRLayerEyeMatrix#ColorTexture} field. */
        public OVRLayerEyeMatrix.Buffer ColorTexture(int index, @NativeType("ovrTextureSwapChain") long value) { OVRLayerEyeMatrix.nColorTexture(address(), index, value); return this; }
        /** Copies the specified {@link OVRRecti.Buffer} to the {@link OVRLayerEyeMatrix#Viewport} field. */
        public OVRLayerEyeMatrix.Buffer Viewport(@NativeType("ovrRecti[ovrEye_Count]") OVRRecti.Buffer value) { OVRLayerEyeMatrix.nViewport(address(), value); return this; }
        /** Copies the specified {@link OVRRecti} at the specified index of the {@link OVRLayerEyeMatrix#Viewport} field. */
        public OVRLayerEyeMatrix.Buffer Viewport(int index, @NativeType("ovrRecti") OVRRecti value) { OVRLayerEyeMatrix.nViewport(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeMatrix#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeMatrix.Buffer Viewport(java.util.function.Consumer<OVRRecti.Buffer> consumer) { consumer.accept(Viewport()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeMatrix#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeMatrix.Buffer Viewport(int index, java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport(index)); return this; }
        /** Copies the specified {@link OVRPosef.Buffer} to the {@link OVRLayerEyeMatrix#RenderPose} field. */
        public OVRLayerEyeMatrix.Buffer RenderPose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { OVRLayerEyeMatrix.nRenderPose(address(), value); return this; }
        /** Copies the specified {@link OVRPosef} at the specified index of the {@link OVRLayerEyeMatrix#RenderPose} field. */
        public OVRLayerEyeMatrix.Buffer RenderPose(int index, @NativeType("ovrPosef") OVRPosef value) { OVRLayerEyeMatrix.nRenderPose(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeMatrix#RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeMatrix.Buffer RenderPose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(RenderPose()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeMatrix#RenderPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeMatrix.Buffer RenderPose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RenderPose(index)); return this; }
        /** Copies the specified {@link OVRMatrix4f.Buffer} to the {@link OVRLayerEyeMatrix#Matrix} field. */
        public OVRLayerEyeMatrix.Buffer Matrix(@NativeType("ovrMatrix4f[ovrEye_Count]") OVRMatrix4f.Buffer value) { OVRLayerEyeMatrix.nMatrix(address(), value); return this; }
        /** Copies the specified {@link OVRMatrix4f} at the specified index of the {@link OVRLayerEyeMatrix#Matrix} field. */
        public OVRLayerEyeMatrix.Buffer Matrix(int index, @NativeType("ovrMatrix4f") OVRMatrix4f value) { OVRLayerEyeMatrix.nMatrix(address(), index, value); return this; }
        /** Passes the {@link OVRLayerEyeMatrix#Matrix} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeMatrix.Buffer Matrix(java.util.function.Consumer<OVRMatrix4f.Buffer> consumer) { consumer.accept(Matrix()); return this; }
        /** Passes the element at {@code index} of the {@link OVRLayerEyeMatrix#Matrix} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerEyeMatrix.Buffer Matrix(int index, java.util.function.Consumer<OVRMatrix4f> consumer) { consumer.accept(Matrix(index)); return this; }
        /** Sets the specified value to the {@link OVRLayerEyeMatrix#SensorSampleTime} field. */
        public OVRLayerEyeMatrix.Buffer SensorSampleTime(double value) { OVRLayerEyeMatrix.nSensorSampleTime(address(), value); return this; }

    }

}