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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Composition Layer Space Warp structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return error {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code nearZ} == {@code farZ}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpaceWarp XR_FB_space_warp} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerSpaceWarpInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpaceWarp#XR_TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code layerFlags} <b>must</b> be 0</li>
 * <li>{@code motionVectorSubImage} <b>must</b> be a valid {@link XrSwapchainSubImage} structure</li>
 * <li>{@code depthSubImage} <b>must</b> be a valid {@link XrSwapchainSubImage} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}, {@link XrCompositionLayerProjection}, {@link XrCompositionLayerProjectionView}, {@link XrFrameEndInfo}, {@link XrPosef}, {@link XrSwapchainSubImage}, {@link XR10#xrEndFrame EndFrame}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerSpaceWarpInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerSpaceWarpInfoFlagsFB {@link #layerFlags};
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} {@link #motionVectorSubImage};
 *     {@link XrPosef XrPosef} {@link #appSpaceDeltaPose};
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} {@link #depthSubImage};
 *     float {@link #minDepth};
 *     float {@link #maxDepth};
 *     float {@link #nearZ};
 *     float {@link #farZ};
 * }</code></pre>
 */
public class XrCompositionLayerSpaceWarpInfoFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS,
        MOTIONVECTORSUBIMAGE,
        APPSPACEDELTAPOSE,
        DEPTHSUBIMAGE,
        MINDEPTH,
        MAXDEPTH,
        NEARZ,
        FARZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        MOTIONVECTORSUBIMAGE = layout.offsetof(3);
        APPSPACEDELTAPOSE = layout.offsetof(4);
        DEPTHSUBIMAGE = layout.offsetof(5);
        MINDEPTH = layout.offsetof(6);
        MAXDEPTH = layout.offsetof(7);
        NEARZ = layout.offsetof(8);
        FARZ = layout.offsetof(9);
    }

    /**
     * Creates a {@code XrCompositionLayerSpaceWarpInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerSpaceWarpInfoFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrCompositionLayerSpaceWarpInfoFlagsFB}. */
    @NativeType("XrCompositionLayerSpaceWarpInfoFlagsFB")
    public long layerFlags() { return nlayerFlags(address()); }
    /** identifies the motion vector image {@link XrSwapchainSubImage} to be associated with the submitted layer {@link XrCompositionLayerProjection}. */
    public XrSwapchainSubImage motionVectorSubImage() { return nmotionVectorSubImage(address()); }
    /** the incremental application-applied transform, if any, since the previous frame that affects the view. When artificial locomotion (scripted movement, teleportation, etc.) happens, the application might transform the whole {@link XrCompositionLayerProjection}::space from one application space pose to another pose between frames. The pose should be identity when there is no {@link XrCompositionLayerProjection}::space transformation in application. */
    public XrPosef appSpaceDeltaPose() { return nappSpaceDeltaPose(address()); }
    /** identifies the depth image {@link XrSwapchainSubImage} to be associated with motionVectorSubImage. The swapchain should be created with {@link XR10#XR_SWAPCHAIN_USAGE_SAMPLED_BIT SWAPCHAIN_USAGE_SAMPLED_BIT} | {@link XR10#XR_SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}. */
    public XrSwapchainSubImage depthSubImage() { return ndepthSubImage(address()); }
    /** {@code minDepth} and {@code maxDepth} are the range of depth values the {@code depthSwapchain} could have, in the range of <code>[0.0,1.0]</code>. This is akin to min and max values of OpenGL’s {@code glDepthRange}, but with the requirement here that <code>maxDepth ≥ minDepth</code>. */
    public float minDepth() { return nminDepth(address()); }
    /** see {@code minDepth} */
    public float maxDepth() { return nmaxDepth(address()); }
    /** the positive distance in meters of the {@code minDepth} value in the depth swapchain. Applications <b>may</b> use a {@code nearZ} that is greater than {@code farZ} to indicate depth values are reversed. {@code nearZ} can be infinite. */
    public float nearZ() { return nnearZ(address()); }
    /** the positive distance in meters of the {@code maxDepth} value in the depth swapchain. {@code farZ} can be infinite. */
    public float farZ() { return nfarZ(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerSpaceWarpInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpaceWarp#XR_TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB} value to the {@link #type} field. */
    public XrCompositionLayerSpaceWarpInfoFB type$Default() { return type(FBSpaceWarp.XR_TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerSpaceWarpInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #layerFlags} field. */
    public XrCompositionLayerSpaceWarpInfoFB layerFlags(@NativeType("XrCompositionLayerSpaceWarpInfoFlagsFB") long value) { nlayerFlags(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@link #motionVectorSubImage} field. */
    public XrCompositionLayerSpaceWarpInfoFB motionVectorSubImage(XrSwapchainSubImage value) { nmotionVectorSubImage(address(), value); return this; }
    /** Passes the {@link #motionVectorSubImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerSpaceWarpInfoFB motionVectorSubImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(motionVectorSubImage()); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #appSpaceDeltaPose} field. */
    public XrCompositionLayerSpaceWarpInfoFB appSpaceDeltaPose(XrPosef value) { nappSpaceDeltaPose(address(), value); return this; }
    /** Passes the {@link #appSpaceDeltaPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerSpaceWarpInfoFB appSpaceDeltaPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(appSpaceDeltaPose()); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@link #depthSubImage} field. */
    public XrCompositionLayerSpaceWarpInfoFB depthSubImage(XrSwapchainSubImage value) { ndepthSubImage(address(), value); return this; }
    /** Passes the {@link #depthSubImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerSpaceWarpInfoFB depthSubImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(depthSubImage()); return this; }
    /** Sets the specified value to the {@link #minDepth} field. */
    public XrCompositionLayerSpaceWarpInfoFB minDepth(float value) { nminDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #maxDepth} field. */
    public XrCompositionLayerSpaceWarpInfoFB maxDepth(float value) { nmaxDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #nearZ} field. */
    public XrCompositionLayerSpaceWarpInfoFB nearZ(float value) { nnearZ(address(), value); return this; }
    /** Sets the specified value to the {@link #farZ} field. */
    public XrCompositionLayerSpaceWarpInfoFB farZ(float value) { nfarZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerSpaceWarpInfoFB set(
        int type,
        long next,
        long layerFlags,
        XrSwapchainSubImage motionVectorSubImage,
        XrPosef appSpaceDeltaPose,
        XrSwapchainSubImage depthSubImage,
        float minDepth,
        float maxDepth,
        float nearZ,
        float farZ
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        motionVectorSubImage(motionVectorSubImage);
        appSpaceDeltaPose(appSpaceDeltaPose);
        depthSubImage(depthSubImage);
        minDepth(minDepth);
        maxDepth(maxDepth);
        nearZ(nearZ);
        farZ(farZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerSpaceWarpInfoFB set(XrCompositionLayerSpaceWarpInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerSpaceWarpInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerSpaceWarpInfoFB malloc() {
        return wrap(XrCompositionLayerSpaceWarpInfoFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerSpaceWarpInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerSpaceWarpInfoFB calloc() {
        return wrap(XrCompositionLayerSpaceWarpInfoFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerSpaceWarpInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerSpaceWarpInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerSpaceWarpInfoFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerSpaceWarpInfoFB} instance for the specified memory address. */
    public static XrCompositionLayerSpaceWarpInfoFB create(long address) {
        return wrap(XrCompositionLayerSpaceWarpInfoFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerSpaceWarpInfoFB createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerSpaceWarpInfoFB.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerSpaceWarpInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSpaceWarpInfoFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSpaceWarpInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSpaceWarpInfoFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSpaceWarpInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSpaceWarpInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerSpaceWarpInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSpaceWarpInfoFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerSpaceWarpInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerSpaceWarpInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerSpaceWarpInfoFB malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerSpaceWarpInfoFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerSpaceWarpInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerSpaceWarpInfoFB calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerSpaceWarpInfoFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerSpaceWarpInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSpaceWarpInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSpaceWarpInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSpaceWarpInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerSpaceWarpInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerSpaceWarpInfoFB.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerSpaceWarpInfoFB.LAYERFLAGS); }
    /** Unsafe version of {@link #motionVectorSubImage}. */
    public static XrSwapchainSubImage nmotionVectorSubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerSpaceWarpInfoFB.MOTIONVECTORSUBIMAGE); }
    /** Unsafe version of {@link #appSpaceDeltaPose}. */
    public static XrPosef nappSpaceDeltaPose(long struct) { return XrPosef.create(struct + XrCompositionLayerSpaceWarpInfoFB.APPSPACEDELTAPOSE); }
    /** Unsafe version of {@link #depthSubImage}. */
    public static XrSwapchainSubImage ndepthSubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerSpaceWarpInfoFB.DEPTHSUBIMAGE); }
    /** Unsafe version of {@link #minDepth}. */
    public static float nminDepth(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerSpaceWarpInfoFB.MINDEPTH); }
    /** Unsafe version of {@link #maxDepth}. */
    public static float nmaxDepth(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerSpaceWarpInfoFB.MAXDEPTH); }
    /** Unsafe version of {@link #nearZ}. */
    public static float nnearZ(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerSpaceWarpInfoFB.NEARZ); }
    /** Unsafe version of {@link #farZ}. */
    public static float nfarZ(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerSpaceWarpInfoFB.FARZ); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerSpaceWarpInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerSpaceWarpInfoFB.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerSpaceWarpInfoFB.LAYERFLAGS, value); }
    /** Unsafe version of {@link #motionVectorSubImage(XrSwapchainSubImage) motionVectorSubImage}. */
    public static void nmotionVectorSubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerSpaceWarpInfoFB.MOTIONVECTORSUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #appSpaceDeltaPose(XrPosef) appSpaceDeltaPose}. */
    public static void nappSpaceDeltaPose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerSpaceWarpInfoFB.APPSPACEDELTAPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #depthSubImage(XrSwapchainSubImage) depthSubImage}. */
    public static void ndepthSubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerSpaceWarpInfoFB.DEPTHSUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #minDepth(float) minDepth}. */
    public static void nminDepth(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerSpaceWarpInfoFB.MINDEPTH, value); }
    /** Unsafe version of {@link #maxDepth(float) maxDepth}. */
    public static void nmaxDepth(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerSpaceWarpInfoFB.MAXDEPTH, value); }
    /** Unsafe version of {@link #nearZ(float) nearZ}. */
    public static void nnearZ(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerSpaceWarpInfoFB.NEARZ, value); }
    /** Unsafe version of {@link #farZ(float) farZ}. */
    public static void nfarZ(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerSpaceWarpInfoFB.FARZ, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        XrSwapchainSubImage.validate(struct + XrCompositionLayerSpaceWarpInfoFB.MOTIONVECTORSUBIMAGE);
        XrSwapchainSubImage.validate(struct + XrCompositionLayerSpaceWarpInfoFB.DEPTHSUBIMAGE);
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerSpaceWarpInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerSpaceWarpInfoFB, Buffer> implements NativeResource {

        private static final XrCompositionLayerSpaceWarpInfoFB ELEMENT_FACTORY = XrCompositionLayerSpaceWarpInfoFB.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerSpaceWarpInfoFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerSpaceWarpInfoFB#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerSpaceWarpInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerSpaceWarpInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerSpaceWarpInfoFB.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerSpaceWarpInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerSpaceWarpInfoFB.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerSpaceWarpInfoFB#layerFlags} field. */
        @NativeType("XrCompositionLayerSpaceWarpInfoFlagsFB")
        public long layerFlags() { return XrCompositionLayerSpaceWarpInfoFB.nlayerFlags(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@link XrCompositionLayerSpaceWarpInfoFB#motionVectorSubImage} field. */
        public XrSwapchainSubImage motionVectorSubImage() { return XrCompositionLayerSpaceWarpInfoFB.nmotionVectorSubImage(address()); }
        /** @return a {@link XrPosef} view of the {@link XrCompositionLayerSpaceWarpInfoFB#appSpaceDeltaPose} field. */
        public XrPosef appSpaceDeltaPose() { return XrCompositionLayerSpaceWarpInfoFB.nappSpaceDeltaPose(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@link XrCompositionLayerSpaceWarpInfoFB#depthSubImage} field. */
        public XrSwapchainSubImage depthSubImage() { return XrCompositionLayerSpaceWarpInfoFB.ndepthSubImage(address()); }
        /** @return the value of the {@link XrCompositionLayerSpaceWarpInfoFB#minDepth} field. */
        public float minDepth() { return XrCompositionLayerSpaceWarpInfoFB.nminDepth(address()); }
        /** @return the value of the {@link XrCompositionLayerSpaceWarpInfoFB#maxDepth} field. */
        public float maxDepth() { return XrCompositionLayerSpaceWarpInfoFB.nmaxDepth(address()); }
        /** @return the value of the {@link XrCompositionLayerSpaceWarpInfoFB#nearZ} field. */
        public float nearZ() { return XrCompositionLayerSpaceWarpInfoFB.nnearZ(address()); }
        /** @return the value of the {@link XrCompositionLayerSpaceWarpInfoFB#farZ} field. */
        public float farZ() { return XrCompositionLayerSpaceWarpInfoFB.nfarZ(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerSpaceWarpInfoFB#type} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerSpaceWarpInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpaceWarp#XR_TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB} value to the {@link XrCompositionLayerSpaceWarpInfoFB#type} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer type$Default() { return type(FBSpaceWarp.XR_TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB); }
        /** Sets the specified value to the {@link XrCompositionLayerSpaceWarpInfoFB#next} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerSpaceWarpInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerSpaceWarpInfoFB#layerFlags} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer layerFlags(@NativeType("XrCompositionLayerSpaceWarpInfoFlagsFB") long value) { XrCompositionLayerSpaceWarpInfoFB.nlayerFlags(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@link XrCompositionLayerSpaceWarpInfoFB#motionVectorSubImage} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer motionVectorSubImage(XrSwapchainSubImage value) { XrCompositionLayerSpaceWarpInfoFB.nmotionVectorSubImage(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerSpaceWarpInfoFB#motionVectorSubImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer motionVectorSubImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(motionVectorSubImage()); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrCompositionLayerSpaceWarpInfoFB#appSpaceDeltaPose} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer appSpaceDeltaPose(XrPosef value) { XrCompositionLayerSpaceWarpInfoFB.nappSpaceDeltaPose(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerSpaceWarpInfoFB#appSpaceDeltaPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer appSpaceDeltaPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(appSpaceDeltaPose()); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@link XrCompositionLayerSpaceWarpInfoFB#depthSubImage} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer depthSubImage(XrSwapchainSubImage value) { XrCompositionLayerSpaceWarpInfoFB.ndepthSubImage(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerSpaceWarpInfoFB#depthSubImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer depthSubImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(depthSubImage()); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerSpaceWarpInfoFB#minDepth} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer minDepth(float value) { XrCompositionLayerSpaceWarpInfoFB.nminDepth(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerSpaceWarpInfoFB#maxDepth} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer maxDepth(float value) { XrCompositionLayerSpaceWarpInfoFB.nmaxDepth(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerSpaceWarpInfoFB#nearZ} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer nearZ(float value) { XrCompositionLayerSpaceWarpInfoFB.nnearZ(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerSpaceWarpInfoFB#farZ} field. */
        public XrCompositionLayerSpaceWarpInfoFB.Buffer farZ(float value) { XrCompositionLayerSpaceWarpInfoFB.nfarZ(address(), value); return this; }

    }

}