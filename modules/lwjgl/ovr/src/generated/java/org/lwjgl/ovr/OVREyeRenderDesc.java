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
 * rendering information for each eye. Computed by either {@link OVR#ovr_GetRenderDesc GetRenderDesc} based on the specified FOV. Note that the rendering viewport is not
 * included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Eye} &ndash; the eye index this instance corresponds to. One of:<br><table><tr><td>{@link OVR#ovrEye_Left Eye_Left}</td><td>{@link OVR#ovrEye_Right Eye_Right}</td></tr></table></li>
 * <li>{@code Fov} &ndash; the field of view</li>
 * <li>{@code DistortedViewport} &ndash; distortion viewport</li>
 * <li>{@code PixelsPerTanAngleAtCenter} &ndash; wow many display pixels will fit in tan(angle) = 1</li>
 * <li>{@code HmdToEyePose} &ndash; transform of eye from the HMD center, in meters</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrEyeRenderDesc {
 *     ovrEyeType Eye;
 *     {@link OVRFovPort ovrFovPort} Fov;
 *     {@link OVRRecti ovrRecti} DistortedViewport;
 *     {@link OVRVector2f ovrVector2f} PixelsPerTanAngleAtCenter;
 *     {@link OVRPosef ovrPosef} HmdToEyePose;
 * }</code></pre>
 */
@NativeType("struct ovrEyeRenderDesc")
public class OVREyeRenderDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EYE,
        FOV,
        DISTORTEDVIEWPORT,
        PIXELSPERTANANGLEATCENTER,
        HMDTOEYEPOSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF),
            __member(OVRRecti.SIZEOF, OVRRecti.ALIGNOF),
            __member(OVRVector2f.SIZEOF, OVRVector2f.ALIGNOF),
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EYE = layout.offsetof(0);
        FOV = layout.offsetof(1);
        DISTORTEDVIEWPORT = layout.offsetof(2);
        PIXELSPERTANANGLEATCENTER = layout.offsetof(3);
        HMDTOEYEPOSE = layout.offsetof(4);
    }

    /**
     * Creates a {@code OVREyeRenderDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVREyeRenderDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code Eye} field. */
    @NativeType("ovrEyeType")
    public int Eye() { return nEye(address()); }
    /** Returns a {@link OVRFovPort} view of the {@code Fov} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort Fov() { return nFov(address()); }
    /** Returns a {@link OVRRecti} view of the {@code DistortedViewport} field. */
    @NativeType("ovrRecti")
    public OVRRecti DistortedViewport() { return nDistortedViewport(address()); }
    /** Returns a {@link OVRVector2f} view of the {@code PixelsPerTanAngleAtCenter} field. */
    @NativeType("ovrVector2f")
    public OVRVector2f PixelsPerTanAngleAtCenter() { return nPixelsPerTanAngleAtCenter(address()); }
    /** Returns a {@link OVRPosef} view of the {@code HmdToEyePose} field. */
    @NativeType("ovrPosef")
    public OVRPosef HmdToEyePose() { return nHmdToEyePose(address()); }

    // -----------------------------------

    /** Returns a new {@code OVREyeRenderDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVREyeRenderDesc malloc() {
        return wrap(OVREyeRenderDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVREyeRenderDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVREyeRenderDesc calloc() {
        return wrap(OVREyeRenderDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVREyeRenderDesc} instance allocated with {@link BufferUtils}. */
    public static OVREyeRenderDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVREyeRenderDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code OVREyeRenderDesc} instance for the specified memory address. */
    public static OVREyeRenderDesc create(long address) {
        return wrap(OVREyeRenderDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVREyeRenderDesc createSafe(long address) {
        return address == NULL ? null : wrap(OVREyeRenderDesc.class, address);
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVREyeRenderDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVREyeRenderDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVREyeRenderDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVREyeRenderDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVREyeRenderDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVREyeRenderDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVREyeRenderDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVREyeRenderDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVREyeRenderDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVREyeRenderDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVREyeRenderDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVREyeRenderDesc mallocStack(MemoryStack stack) {
        return wrap(OVREyeRenderDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVREyeRenderDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVREyeRenderDesc callocStack(MemoryStack stack) {
        return wrap(OVREyeRenderDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVREyeRenderDesc.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVREyeRenderDesc.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVREyeRenderDesc.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVREyeRenderDesc.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Eye}. */
    public static int nEye(long struct) { return UNSAFE.getInt(null, struct + OVREyeRenderDesc.EYE); }
    /** Unsafe version of {@link #Fov}. */
    public static OVRFovPort nFov(long struct) { return OVRFovPort.create(struct + OVREyeRenderDesc.FOV); }
    /** Unsafe version of {@link #DistortedViewport}. */
    public static OVRRecti nDistortedViewport(long struct) { return OVRRecti.create(struct + OVREyeRenderDesc.DISTORTEDVIEWPORT); }
    /** Unsafe version of {@link #PixelsPerTanAngleAtCenter}. */
    public static OVRVector2f nPixelsPerTanAngleAtCenter(long struct) { return OVRVector2f.create(struct + OVREyeRenderDesc.PIXELSPERTANANGLEATCENTER); }
    /** Unsafe version of {@link #HmdToEyePose}. */
    public static OVRPosef nHmdToEyePose(long struct) { return OVRPosef.create(struct + OVREyeRenderDesc.HMDTOEYEPOSE); }

    // -----------------------------------

    /** An array of {@link OVREyeRenderDesc} structs. */
    public static class Buffer extends StructBuffer<OVREyeRenderDesc, Buffer> implements NativeResource {

        private static final OVREyeRenderDesc ELEMENT_FACTORY = OVREyeRenderDesc.create(-1L);

        /**
         * Creates a new {@code OVREyeRenderDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVREyeRenderDesc#SIZEOF}, and its mark will be undefined.
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
        protected OVREyeRenderDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code Eye} field. */
        @NativeType("ovrEyeType")
        public int Eye() { return OVREyeRenderDesc.nEye(address()); }
        /** Returns a {@link OVRFovPort} view of the {@code Fov} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort Fov() { return OVREyeRenderDesc.nFov(address()); }
        /** Returns a {@link OVRRecti} view of the {@code DistortedViewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti DistortedViewport() { return OVREyeRenderDesc.nDistortedViewport(address()); }
        /** Returns a {@link OVRVector2f} view of the {@code PixelsPerTanAngleAtCenter} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f PixelsPerTanAngleAtCenter() { return OVREyeRenderDesc.nPixelsPerTanAngleAtCenter(address()); }
        /** Returns a {@link OVRPosef} view of the {@code HmdToEyePose} field. */
        @NativeType("ovrPosef")
        public OVRPosef HmdToEyePose() { return OVREyeRenderDesc.nHmdToEyePose(address()); }

    }

}