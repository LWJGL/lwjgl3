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
 * Fov-stencil mesh descriptor passed into the function {@link OVR#ovr_GetFovStencil GetFovStencil}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code StencilType} &ndash; one of:<br><table><tr><td>{@link OVR#ovrFovStencil_HiddenArea FovStencil_HiddenArea}</td><td>{@link OVR#ovrFovStencil_VisibleArea FovStencil_VisibleArea}</td><td>{@link OVR#ovrFovStencil_BorderLine FovStencil_BorderLine}</td></tr><tr><td>{@link OVR#ovrFovStencil_VisibleRectangle FovStencil_VisibleRectangle}</td></tr></table></li>
 * <li>{@code StencilFlags} &ndash; one or more of:<br><table><tr><td>{@link OVR#ovrFovStencilFlag_MeshOriginAtBottomLeft FovStencilFlag_MeshOriginAtBottomLeft}</td></tr></table></li>
 * <li>{@code FovPort} &ndash; typically FOV obtained from {@link OVR#ovr_GetRenderDesc GetRenderDesc}</li>
 * <li>{@code HmdToEyeRotation} &ndash; typically {@code HmdToEyePose.Orientation} obtained from {@link OVR#ovr_GetRenderDesc GetRenderDesc}. Note: Currently unsupported, always treated as identity.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrFovStencilDesc {
 *     ovrFovStencilType StencilType;
 *     uint32_t StencilFlags;
 *     ovrEyeType Eye;
 *     {@link OVRFovPort ovrFovPort} FovPort;
 *     {@link OVRQuatf ovrQuatf} HmdToEyeRotation;
 * }</code></pre>
 */
@NativeType("struct ovrFovStencilDesc")
public class OVRFovStencilDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STENCILTYPE,
        STENCILFLAGS,
        EYE,
        FOVPORT,
        HMDTOEYEROTATION;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, POINTER_SIZE,
            __member(4),
            __member(4),
            __member(4),
            __member(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF),
            __member(OVRQuatf.SIZEOF, OVRQuatf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STENCILTYPE = layout.offsetof(0);
        STENCILFLAGS = layout.offsetof(1);
        EYE = layout.offsetof(2);
        FOVPORT = layout.offsetof(3);
        HMDTOEYEROTATION = layout.offsetof(4);
    }

    /**
     * Creates a {@code OVRFovStencilDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRFovStencilDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code StencilType} field. */
    @NativeType("ovrFovStencilType")
    public int StencilType() { return nStencilType(address()); }
    /** Returns the value of the {@code StencilFlags} field. */
    @NativeType("uint32_t")
    public int StencilFlags() { return nStencilFlags(address()); }
    /** Returns the value of the {@code Eye} field. */
    @NativeType("ovrEyeType")
    public int Eye() { return nEye(address()); }
    /** Returns a {@link OVRFovPort} view of the {@code FovPort} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort FovPort() { return nFovPort(address()); }
    /** Returns a {@link OVRQuatf} view of the {@code HmdToEyeRotation} field. */
    @NativeType("ovrQuatf")
    public OVRQuatf HmdToEyeRotation() { return nHmdToEyeRotation(address()); }

    /** Sets the specified value to the {@code StencilType} field. */
    public OVRFovStencilDesc StencilType(@NativeType("ovrFovStencilType") int value) { nStencilType(address(), value); return this; }
    /** Sets the specified value to the {@code StencilFlags} field. */
    public OVRFovStencilDesc StencilFlags(@NativeType("uint32_t") int value) { nStencilFlags(address(), value); return this; }
    /** Sets the specified value to the {@code Eye} field. */
    public OVRFovStencilDesc Eye(@NativeType("ovrEyeType") int value) { nEye(address(), value); return this; }
    /** Copies the specified {@link OVRFovPort} to the {@code FovPort} field. */
    public OVRFovStencilDesc FovPort(@NativeType("ovrFovPort") OVRFovPort value) { nFovPort(address(), value); return this; }
    /** Passes the {@code FovPort} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRFovStencilDesc FovPort(java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(FovPort()); return this; }
    /** Copies the specified {@link OVRQuatf} to the {@code HmdToEyeRotation} field. */
    public OVRFovStencilDesc HmdToEyeRotation(@NativeType("ovrQuatf") OVRQuatf value) { nHmdToEyeRotation(address(), value); return this; }
    /** Passes the {@code HmdToEyeRotation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRFovStencilDesc HmdToEyeRotation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(HmdToEyeRotation()); return this; }

    /** Initializes this struct with the specified values. */
    public OVRFovStencilDesc set(
        int StencilType,
        int StencilFlags,
        int Eye,
        OVRFovPort FovPort,
        OVRQuatf HmdToEyeRotation
    ) {
        StencilType(StencilType);
        StencilFlags(StencilFlags);
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
    public OVRFovStencilDesc set(OVRFovStencilDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRFovStencilDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRFovStencilDesc malloc() {
        return wrap(OVRFovStencilDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRFovStencilDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRFovStencilDesc calloc() {
        return wrap(OVRFovStencilDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRFovStencilDesc} instance allocated with {@link BufferUtils}. */
    public static OVRFovStencilDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRFovStencilDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRFovStencilDesc} instance for the specified memory address. */
    public static OVRFovStencilDesc create(long address) {
        return wrap(OVRFovStencilDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRFovStencilDesc createSafe(long address) {
        return address == NULL ? null : wrap(OVRFovStencilDesc.class, address);
    }

    /**
     * Returns a new {@link OVRFovStencilDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRFovStencilDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRFovStencilDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRFovStencilDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRFovStencilDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRFovStencilDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRFovStencilDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRFovStencilDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRFovStencilDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRFovStencilDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRFovStencilDesc mallocStack(MemoryStack stack) {
        return wrap(OVRFovStencilDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRFovStencilDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRFovStencilDesc callocStack(MemoryStack stack) {
        return wrap(OVRFovStencilDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRFovStencilDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilDesc.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRFovStencilDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilDesc.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRFovStencilDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilDesc.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRFovStencilDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilDesc.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #StencilType}. */
    public static int nStencilType(long struct) { return UNSAFE.getInt(null, struct + OVRFovStencilDesc.STENCILTYPE); }
    /** Unsafe version of {@link #StencilFlags}. */
    public static int nStencilFlags(long struct) { return UNSAFE.getInt(null, struct + OVRFovStencilDesc.STENCILFLAGS); }
    /** Unsafe version of {@link #Eye}. */
    public static int nEye(long struct) { return UNSAFE.getInt(null, struct + OVRFovStencilDesc.EYE); }
    /** Unsafe version of {@link #FovPort}. */
    public static OVRFovPort nFovPort(long struct) { return OVRFovPort.create(struct + OVRFovStencilDesc.FOVPORT); }
    /** Unsafe version of {@link #HmdToEyeRotation}. */
    public static OVRQuatf nHmdToEyeRotation(long struct) { return OVRQuatf.create(struct + OVRFovStencilDesc.HMDTOEYEROTATION); }

    /** Unsafe version of {@link #StencilType(int) StencilType}. */
    public static void nStencilType(long struct, int value) { UNSAFE.putInt(null, struct + OVRFovStencilDesc.STENCILTYPE, value); }
    /** Unsafe version of {@link #StencilFlags(int) StencilFlags}. */
    public static void nStencilFlags(long struct, int value) { UNSAFE.putInt(null, struct + OVRFovStencilDesc.STENCILFLAGS, value); }
    /** Unsafe version of {@link #Eye(int) Eye}. */
    public static void nEye(long struct, int value) { UNSAFE.putInt(null, struct + OVRFovStencilDesc.EYE, value); }
    /** Unsafe version of {@link #FovPort(OVRFovPort) FovPort}. */
    public static void nFovPort(long struct, OVRFovPort value) { memCopy(value.address(), struct + OVRFovStencilDesc.FOVPORT, OVRFovPort.SIZEOF); }
    /** Unsafe version of {@link #HmdToEyeRotation(OVRQuatf) HmdToEyeRotation}. */
    public static void nHmdToEyeRotation(long struct, OVRQuatf value) { memCopy(value.address(), struct + OVRFovStencilDesc.HMDTOEYEROTATION, OVRQuatf.SIZEOF); }

    // -----------------------------------

    /** An array of {@link OVRFovStencilDesc} structs. */
    public static class Buffer extends StructBuffer<OVRFovStencilDesc, Buffer> implements NativeResource {

        private static final OVRFovStencilDesc ELEMENT_FACTORY = OVRFovStencilDesc.create(-1L);

        /**
         * Creates a new {@code OVRFovStencilDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRFovStencilDesc#SIZEOF}, and its mark will be undefined.
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
        protected OVRFovStencilDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code StencilType} field. */
        @NativeType("ovrFovStencilType")
        public int StencilType() { return OVRFovStencilDesc.nStencilType(address()); }
        /** Returns the value of the {@code StencilFlags} field. */
        @NativeType("uint32_t")
        public int StencilFlags() { return OVRFovStencilDesc.nStencilFlags(address()); }
        /** Returns the value of the {@code Eye} field. */
        @NativeType("ovrEyeType")
        public int Eye() { return OVRFovStencilDesc.nEye(address()); }
        /** Returns a {@link OVRFovPort} view of the {@code FovPort} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort FovPort() { return OVRFovStencilDesc.nFovPort(address()); }
        /** Returns a {@link OVRQuatf} view of the {@code HmdToEyeRotation} field. */
        @NativeType("ovrQuatf")
        public OVRQuatf HmdToEyeRotation() { return OVRFovStencilDesc.nHmdToEyeRotation(address()); }

        /** Sets the specified value to the {@code StencilType} field. */
        public OVRFovStencilDesc.Buffer StencilType(@NativeType("ovrFovStencilType") int value) { OVRFovStencilDesc.nStencilType(address(), value); return this; }
        /** Sets the specified value to the {@code StencilFlags} field. */
        public OVRFovStencilDesc.Buffer StencilFlags(@NativeType("uint32_t") int value) { OVRFovStencilDesc.nStencilFlags(address(), value); return this; }
        /** Sets the specified value to the {@code Eye} field. */
        public OVRFovStencilDesc.Buffer Eye(@NativeType("ovrEyeType") int value) { OVRFovStencilDesc.nEye(address(), value); return this; }
        /** Copies the specified {@link OVRFovPort} to the {@code FovPort} field. */
        public OVRFovStencilDesc.Buffer FovPort(@NativeType("ovrFovPort") OVRFovPort value) { OVRFovStencilDesc.nFovPort(address(), value); return this; }
        /** Passes the {@code FovPort} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRFovStencilDesc.Buffer FovPort(java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(FovPort()); return this; }
        /** Copies the specified {@link OVRQuatf} to the {@code HmdToEyeRotation} field. */
        public OVRFovStencilDesc.Buffer HmdToEyeRotation(@NativeType("ovrQuatf") OVRQuatf value) { OVRFovStencilDesc.nHmdToEyeRotation(address(), value); return this; }
        /** Passes the {@code HmdToEyeRotation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRFovStencilDesc.Buffer HmdToEyeRotation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(HmdToEyeRotation()); return this; }

    }

}