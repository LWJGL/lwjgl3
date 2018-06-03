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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code FovPort} &ndash; typically Fov obtained from {@link OVR#ovr_GetRenderDesc GetRenderDesc}</li>
 * <li>{@code HmdToEyeRotation} &ndash; typically {@code HmdToEyePose.Orientation} obtained from {@link OVR#ovr_GetRenderDesc GetRenderDesc}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrViewportStencilDesc {
 *     ovrViewportStencilType StencilType;
 *     ovrEyeType Eye;
 *     {@link OVRFovPort ovrFovPort} FovPort;
 *     {@link OVRQuatf ovrQuatf} HmdToEyeRotation;
 * }</code></pre>
 */
@NativeType("struct ovrViewportStencilDesc")
public class OVRViewportStencilDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STENCILTYPE,
        EYE,
        FOVPORT,
        HMDTOEYEROTATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF),
            __member(OVRQuatf.SIZEOF, OVRQuatf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STENCILTYPE = layout.offsetof(0);
        EYE = layout.offsetof(1);
        FOVPORT = layout.offsetof(2);
        HMDTOEYEROTATION = layout.offsetof(3);
    }

    OVRViewportStencilDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRViewportStencilDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRViewportStencilDesc(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code StencilType} field. */
    @NativeType("ovrViewportStencilType")
    public int StencilType() { return nStencilType(address()); }
    /** Returns the value of the {@code Eye} field. */
    @NativeType("ovrEyeType")
    public int Eye() { return nEye(address()); }
    /** Returns a {@link OVRFovPort} view of the {@code FovPort} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort FovPort() { return nFovPort(address()); }
    /** Passes the {@code FovPort} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRViewportStencilDesc FovPort(java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(FovPort()); return this; }
    /** Returns a {@link OVRQuatf} view of the {@code HmdToEyeRotation} field. */
    @NativeType("ovrQuatf")
    public OVRQuatf HmdToEyeRotation() { return nHmdToEyeRotation(address()); }
    /** Passes the {@code HmdToEyeRotation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRViewportStencilDesc HmdToEyeRotation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(HmdToEyeRotation()); return this; }

    /** Sets the specified value to the {@code StencilType} field. */
    public OVRViewportStencilDesc StencilType(@NativeType("ovrViewportStencilType") int value) { nStencilType(address(), value); return this; }
    /** Sets the specified value to the {@code Eye} field. */
    public OVRViewportStencilDesc Eye(@NativeType("ovrEyeType") int value) { nEye(address(), value); return this; }
    /** Copies the specified {@link OVRFovPort} to the {@code FovPort} field. */
    public OVRViewportStencilDesc FovPort(@NativeType("ovrFovPort") OVRFovPort value) { nFovPort(address(), value); return this; }
    /** Copies the specified {@link OVRQuatf} to the {@code HmdToEyeRotation} field. */
    public OVRViewportStencilDesc HmdToEyeRotation(@NativeType("ovrQuatf") OVRQuatf value) { nHmdToEyeRotation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRViewportStencilDesc set(
        int StencilType,
        int Eye,
        OVRFovPort FovPort,
        OVRQuatf HmdToEyeRotation
    ) {
        StencilType(StencilType);
        Eye(Eye);
        FovPort(FovPort);
        HmdToEyeRotation(HmdToEyeRotation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRViewportStencilDesc set(OVRViewportStencilDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRViewportStencilDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRViewportStencilDesc malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRViewportStencilDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRViewportStencilDesc calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRViewportStencilDesc} instance allocated with {@link BufferUtils}. */
    public static OVRViewportStencilDesc create() {
        return new OVRViewportStencilDesc(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRViewportStencilDesc} instance for the specified memory address. */
    public static OVRViewportStencilDesc create(long address) {
        return new OVRViewportStencilDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRViewportStencilDesc createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilDesc.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilDesc.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilDesc.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRViewportStencilDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRViewportStencilDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRViewportStencilDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRViewportStencilDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRViewportStencilDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRViewportStencilDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRViewportStencilDesc mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRViewportStencilDesc callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilDesc.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilDesc.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilDesc.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRViewportStencilDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilDesc.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #StencilType}. */
    public static int nStencilType(long struct) { return memGetInt(struct + OVRViewportStencilDesc.STENCILTYPE); }
    /** Unsafe version of {@link #Eye}. */
    public static int nEye(long struct) { return memGetInt(struct + OVRViewportStencilDesc.EYE); }
    /** Unsafe version of {@link #FovPort}. */
    public static OVRFovPort nFovPort(long struct) { return OVRFovPort.create(struct + OVRViewportStencilDesc.FOVPORT); }
    /** Unsafe version of {@link #HmdToEyeRotation}. */
    public static OVRQuatf nHmdToEyeRotation(long struct) { return OVRQuatf.create(struct + OVRViewportStencilDesc.HMDTOEYEROTATION); }

    /** Unsafe version of {@link #StencilType(int) StencilType}. */
    public static void nStencilType(long struct, int value) { memPutInt(struct + OVRViewportStencilDesc.STENCILTYPE, value); }
    /** Unsafe version of {@link #Eye(int) Eye}. */
    public static void nEye(long struct, int value) { memPutInt(struct + OVRViewportStencilDesc.EYE, value); }
    /** Unsafe version of {@link #FovPort(OVRFovPort) FovPort}. */
    public static void nFovPort(long struct, OVRFovPort value) { memCopy(value.address(), struct + OVRViewportStencilDesc.FOVPORT, OVRFovPort.SIZEOF); }
    /** Unsafe version of {@link #HmdToEyeRotation(OVRQuatf) HmdToEyeRotation}. */
    public static void nHmdToEyeRotation(long struct, OVRQuatf value) { memCopy(value.address(), struct + OVRViewportStencilDesc.HMDTOEYEROTATION, OVRQuatf.SIZEOF); }

    // -----------------------------------

    /** An array of {@link OVRViewportStencilDesc} structs. */
    public static class Buffer extends StructBuffer<OVRViewportStencilDesc, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRViewportStencilDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRViewportStencilDesc#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRViewportStencilDesc newInstance(long address) {
            return new OVRViewportStencilDesc(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code StencilType} field. */
        @NativeType("ovrViewportStencilType")
        public int StencilType() { return OVRViewportStencilDesc.nStencilType(address()); }
        /** Returns the value of the {@code Eye} field. */
        @NativeType("ovrEyeType")
        public int Eye() { return OVRViewportStencilDesc.nEye(address()); }
        /** Returns a {@link OVRFovPort} view of the {@code FovPort} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort FovPort() { return OVRViewportStencilDesc.nFovPort(address()); }
        /** Passes the {@code FovPort} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRViewportStencilDesc.Buffer FovPort(java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(FovPort()); return this; }
        /** Returns a {@link OVRQuatf} view of the {@code HmdToEyeRotation} field. */
        @NativeType("ovrQuatf")
        public OVRQuatf HmdToEyeRotation() { return OVRViewportStencilDesc.nHmdToEyeRotation(address()); }
        /** Passes the {@code HmdToEyeRotation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRViewportStencilDesc.Buffer HmdToEyeRotation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(HmdToEyeRotation()); return this; }

        /** Sets the specified value to the {@code StencilType} field. */
        public OVRViewportStencilDesc.Buffer StencilType(@NativeType("ovrViewportStencilType") int value) { OVRViewportStencilDesc.nStencilType(address(), value); return this; }
        /** Sets the specified value to the {@code Eye} field. */
        public OVRViewportStencilDesc.Buffer Eye(@NativeType("ovrEyeType") int value) { OVRViewportStencilDesc.nEye(address(), value); return this; }
        /** Copies the specified {@link OVRFovPort} to the {@code FovPort} field. */
        public OVRViewportStencilDesc.Buffer FovPort(@NativeType("ovrFovPort") OVRFovPort value) { OVRViewportStencilDesc.nFovPort(address(), value); return this; }
        /** Copies the specified {@link OVRQuatf} to the {@code HmdToEyeRotation} field. */
        public OVRViewportStencilDesc.Buffer HmdToEyeRotation(@NativeType("ovrQuatf") OVRQuatf value) { OVRViewportStencilDesc.nHmdToEyeRotation(address(), value); return this; }

    }

}