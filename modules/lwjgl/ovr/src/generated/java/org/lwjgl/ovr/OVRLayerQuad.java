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
 * Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both {@link OVR#ovrLayerType_Quad LayerType_Quad}. This type of layer
 * represents a single object placed in the world and not a stereo view of the world itself.
 * 
 * <p>A typical use of {@link OVR#ovrLayerType_Quad LayerType_Quad} is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
 * as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
 * fidelity of the GUI.</p>
 * 
 * <p>Quad layers are visible from both sides; they are not back-face culled.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrLayerQuad {
 *     {@link OVRLayerHeader ovrLayerHeader} {@link #Header};
 *     ovrTextureSwapChain {@link #ColorTexture};
 *     {@link OVRRecti ovrRecti} {@link #Viewport};
 *     {@link OVRPosef ovrPosef} {@link #QuadPoseCenter};
 *     {@link OVRVector2f ovrVector2f} {@link #QuadSize};
 * }</code></pre>
 */
@NativeType("struct ovrLayerQuad")
public class OVRLayerQuad extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        COLORTEXTURE,
        VIEWPORT,
        QUADPOSECENTER,
        QUADSIZE;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF, true),
            __member(POINTER_SIZE),
            __member(OVRRecti.SIZEOF, OVRRecti.ALIGNOF),
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
            __member(OVRVector2f.SIZEOF, OVRVector2f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        COLORTEXTURE = layout.offsetof(1);
        VIEWPORT = layout.offsetof(2);
        QUADPOSECENTER = layout.offsetof(3);
        QUADSIZE = layout.offsetof(4);
    }

    /**
     * Creates a {@code OVRLayerQuad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerQuad(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code Header.Type} must be {@link OVR#ovrLayerType_Quad LayerType_Quad} */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** contains a single image, never with any stereo view */
    @NativeType("ovrTextureSwapChain")
    public long ColorTexture() { return nColorTexture(address()); }
    /** specifies the ColorTexture sub-rect UV coordinates */
    @NativeType("ovrRecti")
    public OVRRecti Viewport() { return nViewport(address()); }
    /**
     * specifies the orientation and position of the center point of a Quad layer type.
     * 
     * <p>The supplied direction is the vector perpendicular to the quad. The position is in real-world meters (not the application's virtual world, the physical
     * world the user is in) and is relative to the "zero" position set by {@link OVR#ovr_RecenterTrackingOrigin RecenterTrackingOrigin} unless the {@link OVR#ovrLayerFlag_HeadLocked LayerFlag_HeadLocked} flag is
     * used.</p>
     */
    @NativeType("ovrPosef")
    public OVRPosef QuadPoseCenter() { return nQuadPoseCenter(address()); }
    /** width and height (respectively) of the quad in meters */
    @NativeType("ovrVector2f")
    public OVRVector2f QuadSize() { return nQuadSize(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@link #Header} field. */
    public OVRLayerQuad Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Passes the {@link #Header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerQuad Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
    /** Sets the specified value to the {@link #ColorTexture} field. */
    public OVRLayerQuad ColorTexture(@NativeType("ovrTextureSwapChain") long value) { nColorTexture(address(), value); return this; }
    /** Copies the specified {@link OVRRecti} to the {@link #Viewport} field. */
    public OVRLayerQuad Viewport(@NativeType("ovrRecti") OVRRecti value) { nViewport(address(), value); return this; }
    /** Passes the {@link #Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerQuad Viewport(java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport()); return this; }
    /** Copies the specified {@link OVRPosef} to the {@link #QuadPoseCenter} field. */
    public OVRLayerQuad QuadPoseCenter(@NativeType("ovrPosef") OVRPosef value) { nQuadPoseCenter(address(), value); return this; }
    /** Passes the {@link #QuadPoseCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerQuad QuadPoseCenter(java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(QuadPoseCenter()); return this; }
    /** Copies the specified {@link OVRVector2f} to the {@link #QuadSize} field. */
    public OVRLayerQuad QuadSize(@NativeType("ovrVector2f") OVRVector2f value) { nQuadSize(address(), value); return this; }
    /** Passes the {@link #QuadSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerQuad QuadSize(java.util.function.Consumer<OVRVector2f> consumer) { consumer.accept(QuadSize()); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerQuad set(
        OVRLayerHeader Header,
        long ColorTexture,
        OVRRecti Viewport,
        OVRPosef QuadPoseCenter,
        OVRVector2f QuadSize
    ) {
        Header(Header);
        ColorTexture(ColorTexture);
        Viewport(Viewport);
        QuadPoseCenter(QuadPoseCenter);
        QuadSize(QuadSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerQuad set(OVRLayerQuad src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerQuad} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerQuad malloc() {
        return wrap(OVRLayerQuad.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRLayerQuad} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerQuad calloc() {
        return wrap(OVRLayerQuad.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRLayerQuad} instance allocated with {@link BufferUtils}. */
    public static OVRLayerQuad create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRLayerQuad.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerQuad} instance for the specified memory address. */
    public static OVRLayerQuad create(long address) {
        return wrap(OVRLayerQuad.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerQuad createSafe(long address) {
        return address == NULL ? null : wrap(OVRLayerQuad.class, address);
    }

    /**
     * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerQuad.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerQuad.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerQuad.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRLayerQuad.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerQuad.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerQuad.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerQuad mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerQuad callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerQuad mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerQuad callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerQuad.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerQuad.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerQuad.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerQuad.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerQuad} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerQuad malloc(MemoryStack stack) {
        return wrap(OVRLayerQuad.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRLayerQuad} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerQuad calloc(MemoryStack stack) {
        return wrap(OVRLayerQuad.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerQuad.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerQuad.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerQuad.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerQuad.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerQuad.HEADER); }
    /** Unsafe version of {@link #ColorTexture}. */
    public static long nColorTexture(long struct) { return memGetAddress(struct + OVRLayerQuad.COLORTEXTURE); }
    /** Unsafe version of {@link #Viewport}. */
    public static OVRRecti nViewport(long struct) { return OVRRecti.create(struct + OVRLayerQuad.VIEWPORT); }
    /** Unsafe version of {@link #QuadPoseCenter}. */
    public static OVRPosef nQuadPoseCenter(long struct) { return OVRPosef.create(struct + OVRLayerQuad.QUADPOSECENTER); }
    /** Unsafe version of {@link #QuadSize}. */
    public static OVRVector2f nQuadSize(long struct) { return OVRVector2f.create(struct + OVRLayerQuad.QUADSIZE); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerQuad.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #ColorTexture(long) ColorTexture}. */
    public static void nColorTexture(long struct, long value) { memPutAddress(struct + OVRLayerQuad.COLORTEXTURE, check(value)); }
    /** Unsafe version of {@link #Viewport(OVRRecti) Viewport}. */
    public static void nViewport(long struct, OVRRecti value) { memCopy(value.address(), struct + OVRLayerQuad.VIEWPORT, OVRRecti.SIZEOF); }
    /** Unsafe version of {@link #QuadPoseCenter(OVRPosef) QuadPoseCenter}. */
    public static void nQuadPoseCenter(long struct, OVRPosef value) { memCopy(value.address(), struct + OVRLayerQuad.QUADPOSECENTER, OVRPosef.SIZEOF); }
    /** Unsafe version of {@link #QuadSize(OVRVector2f) QuadSize}. */
    public static void nQuadSize(long struct, OVRVector2f value) { memCopy(value.address(), struct + OVRLayerQuad.QUADSIZE, OVRVector2f.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerQuad.COLORTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link OVRLayerQuad} structs. */
    public static class Buffer extends StructBuffer<OVRLayerQuad, Buffer> implements NativeResource {

        private static final OVRLayerQuad ELEMENT_FACTORY = OVRLayerQuad.create(-1L);

        /**
         * Creates a new {@code OVRLayerQuad.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerQuad#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerQuad getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRLayerHeader} view of the {@link OVRLayerQuad#Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerQuad.nHeader(address()); }
        /** @return the value of the {@link OVRLayerQuad#ColorTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long ColorTexture() { return OVRLayerQuad.nColorTexture(address()); }
        /** @return a {@link OVRRecti} view of the {@link OVRLayerQuad#Viewport} field. */
        @NativeType("ovrRecti")
        public OVRRecti Viewport() { return OVRLayerQuad.nViewport(address()); }
        /** @return a {@link OVRPosef} view of the {@link OVRLayerQuad#QuadPoseCenter} field. */
        @NativeType("ovrPosef")
        public OVRPosef QuadPoseCenter() { return OVRLayerQuad.nQuadPoseCenter(address()); }
        /** @return a {@link OVRVector2f} view of the {@link OVRLayerQuad#QuadSize} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f QuadSize() { return OVRLayerQuad.nQuadSize(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@link OVRLayerQuad#Header} field. */
        public OVRLayerQuad.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerQuad.nHeader(address(), value); return this; }
        /** Passes the {@link OVRLayerQuad#Header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerQuad.Buffer Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
        /** Sets the specified value to the {@link OVRLayerQuad#ColorTexture} field. */
        public OVRLayerQuad.Buffer ColorTexture(@NativeType("ovrTextureSwapChain") long value) { OVRLayerQuad.nColorTexture(address(), value); return this; }
        /** Copies the specified {@link OVRRecti} to the {@link OVRLayerQuad#Viewport} field. */
        public OVRLayerQuad.Buffer Viewport(@NativeType("ovrRecti") OVRRecti value) { OVRLayerQuad.nViewport(address(), value); return this; }
        /** Passes the {@link OVRLayerQuad#Viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerQuad.Buffer Viewport(java.util.function.Consumer<OVRRecti> consumer) { consumer.accept(Viewport()); return this; }
        /** Copies the specified {@link OVRPosef} to the {@link OVRLayerQuad#QuadPoseCenter} field. */
        public OVRLayerQuad.Buffer QuadPoseCenter(@NativeType("ovrPosef") OVRPosef value) { OVRLayerQuad.nQuadPoseCenter(address(), value); return this; }
        /** Passes the {@link OVRLayerQuad#QuadPoseCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerQuad.Buffer QuadPoseCenter(java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(QuadPoseCenter()); return this; }
        /** Copies the specified {@link OVRVector2f} to the {@link OVRLayerQuad#QuadSize} field. */
        public OVRLayerQuad.Buffer QuadSize(@NativeType("ovrVector2f") OVRVector2f value) { OVRLayerQuad.nQuadSize(address(), value); return this; }
        /** Passes the {@link OVRLayerQuad#QuadSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerQuad.Buffer QuadSize(java.util.function.Consumer<OVRVector2f> consumer) { consumer.accept(QuadSize()); return this; }

    }

}