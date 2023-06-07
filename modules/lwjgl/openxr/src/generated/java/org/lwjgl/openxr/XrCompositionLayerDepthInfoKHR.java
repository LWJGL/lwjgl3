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
 * Depth map layer info.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The window space depth values {@code minDepth} and {@code maxDepth} are akin to the parameters of {@code glDepthRange} that specify the mapping from normalized device coordinates into window space.</p>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>A reversed mapping of depth, such that points closer to the view have a window space depth that is greater than points further away can be achieved by making nearZ &gt; farZ.</p>
 * </div>
 * 
 * <p>{@link XrCompositionLayerDepthInfoKHR} contains the information needed to associate depth with the color information in a projection layer. When submitting depth images along with projection layers, add the {@link XrCompositionLayerDepthInfoKHR} to the {@code next} chain for all {@link XrCompositionLayerProjectionView} structures in the given layer.</p>
 * 
 * <p>The homogeneous transform from view space z to window space depth is given by the following matrix, where a = minDepth, b = maxDepth, n = nearZ, and f = farZ.</p>
 * 
 * <p>Homogeneous values are constructed from real values by appending a w component with value 1.0.</p>
 * 
 * <p>General homogeneous values are projected back to real space by dividing by the w component.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerDepthInfoKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRCompositionLayerDepth#XR_TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code subImage} <b>must</b> be a valid {@link XrSwapchainSubImage} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}, {@link XrCompositionLayerProjection}, {@link XrCompositionLayerProjectionView}, {@link XrFrameEndInfo}, {@link XrSwapchainSubImage}, {@link XR10#xrEndFrame EndFrame}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerDepthInfoKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} {@link #subImage};
 *     float {@link #minDepth};
 *     float {@link #maxDepth};
 *     float {@link #nearZ};
 *     float {@link #farZ};
 * }</code></pre>
 */
public class XrCompositionLayerDepthInfoKHR extends Struct<XrCompositionLayerDepthInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUBIMAGE,
        MINDEPTH,
        MAXDEPTH,
        NEARZ,
        FARZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
        SUBIMAGE = layout.offsetof(2);
        MINDEPTH = layout.offsetof(3);
        MAXDEPTH = layout.offsetof(4);
        NEARZ = layout.offsetof(5);
        FARZ = layout.offsetof(6);
    }

    protected XrCompositionLayerDepthInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerDepthInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerDepthInfoKHR(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerDepthInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerDepthInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** identifies the depth image {@link XrSwapchainSubImage} to be associated with the color swapchain. The swapchain <b>must</b> have been created with a {@code faceCount} of 1. */
    public XrSwapchainSubImage subImage() { return nsubImage(address()); }
    /** {@code minDepth} and {@code maxDepth} are the window space depths that correspond to the near and far frustum planes, respectively. {@code minDepth} must be less than {@code maxDepth}. {@code minDepth} and {@code maxDepth} must be in the range [0, 1]. */
    public float minDepth() { return nminDepth(address()); }
    /** see {@code minDepth} */
    public float maxDepth() { return nmaxDepth(address()); }
    /** {@code nearZ} and {@code farZ} are the positive distances in meters to the near and far frustum planes, respectively. {@code nearZ} and {@code farZ} <b>must</b> not be equal. {@code nearZ} and {@code farZ} <b>must</b> be in the range (0, +infinity]. */
    public float nearZ() { return nnearZ(address()); }
    /** see {@code nearZ} */
    public float farZ() { return nfarZ(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerDepthInfoKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRCompositionLayerDepth#XR_TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR} value to the {@link #type} field. */
    public XrCompositionLayerDepthInfoKHR type$Default() { return type(KHRCompositionLayerDepth.XR_TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerDepthInfoKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@link #subImage} field. */
    public XrCompositionLayerDepthInfoKHR subImage(XrSwapchainSubImage value) { nsubImage(address(), value); return this; }
    /** Passes the {@link #subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerDepthInfoKHR subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
    /** Sets the specified value to the {@link #minDepth} field. */
    public XrCompositionLayerDepthInfoKHR minDepth(float value) { nminDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #maxDepth} field. */
    public XrCompositionLayerDepthInfoKHR maxDepth(float value) { nmaxDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #nearZ} field. */
    public XrCompositionLayerDepthInfoKHR nearZ(float value) { nnearZ(address(), value); return this; }
    /** Sets the specified value to the {@link #farZ} field. */
    public XrCompositionLayerDepthInfoKHR farZ(float value) { nfarZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerDepthInfoKHR set(
        int type,
        long next,
        XrSwapchainSubImage subImage,
        float minDepth,
        float maxDepth,
        float nearZ,
        float farZ
    ) {
        type(type);
        next(next);
        subImage(subImage);
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
    public XrCompositionLayerDepthInfoKHR set(XrCompositionLayerDepthInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerDepthInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerDepthInfoKHR malloc() {
        return new XrCompositionLayerDepthInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerDepthInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerDepthInfoKHR calloc() {
        return new XrCompositionLayerDepthInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerDepthInfoKHR} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerDepthInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerDepthInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerDepthInfoKHR} instance for the specified memory address. */
    public static XrCompositionLayerDepthInfoKHR create(long address) {
        return new XrCompositionLayerDepthInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerDepthInfoKHR createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerDepthInfoKHR(address, null);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerDepthInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerDepthInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerDepthInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerDepthInfoKHR malloc(MemoryStack stack) {
        return new XrCompositionLayerDepthInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerDepthInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerDepthInfoKHR calloc(MemoryStack stack) {
        return new XrCompositionLayerDepthInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerDepthInfoKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerDepthInfoKHR.NEXT); }
    /** Unsafe version of {@link #subImage}. */
    public static XrSwapchainSubImage nsubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerDepthInfoKHR.SUBIMAGE); }
    /** Unsafe version of {@link #minDepth}. */
    public static float nminDepth(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerDepthInfoKHR.MINDEPTH); }
    /** Unsafe version of {@link #maxDepth}. */
    public static float nmaxDepth(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerDepthInfoKHR.MAXDEPTH); }
    /** Unsafe version of {@link #nearZ}. */
    public static float nnearZ(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerDepthInfoKHR.NEARZ); }
    /** Unsafe version of {@link #farZ}. */
    public static float nfarZ(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerDepthInfoKHR.FARZ); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerDepthInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerDepthInfoKHR.NEXT, value); }
    /** Unsafe version of {@link #subImage(XrSwapchainSubImage) subImage}. */
    public static void nsubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerDepthInfoKHR.SUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #minDepth(float) minDepth}. */
    public static void nminDepth(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerDepthInfoKHR.MINDEPTH, value); }
    /** Unsafe version of {@link #maxDepth(float) maxDepth}. */
    public static void nmaxDepth(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerDepthInfoKHR.MAXDEPTH, value); }
    /** Unsafe version of {@link #nearZ(float) nearZ}. */
    public static void nnearZ(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerDepthInfoKHR.NEARZ, value); }
    /** Unsafe version of {@link #farZ(float) farZ}. */
    public static void nfarZ(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerDepthInfoKHR.FARZ, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        XrSwapchainSubImage.validate(struct + XrCompositionLayerDepthInfoKHR.SUBIMAGE);
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerDepthInfoKHR} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerDepthInfoKHR, Buffer> implements NativeResource {

        private static final XrCompositionLayerDepthInfoKHR ELEMENT_FACTORY = XrCompositionLayerDepthInfoKHR.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerDepthInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerDepthInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerDepthInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerDepthInfoKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerDepthInfoKHR.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthInfoKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerDepthInfoKHR.nnext(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@link XrCompositionLayerDepthInfoKHR#subImage} field. */
        public XrSwapchainSubImage subImage() { return XrCompositionLayerDepthInfoKHR.nsubImage(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthInfoKHR#minDepth} field. */
        public float minDepth() { return XrCompositionLayerDepthInfoKHR.nminDepth(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthInfoKHR#maxDepth} field. */
        public float maxDepth() { return XrCompositionLayerDepthInfoKHR.nmaxDepth(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthInfoKHR#nearZ} field. */
        public float nearZ() { return XrCompositionLayerDepthInfoKHR.nnearZ(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthInfoKHR#farZ} field. */
        public float farZ() { return XrCompositionLayerDepthInfoKHR.nfarZ(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerDepthInfoKHR#type} field. */
        public XrCompositionLayerDepthInfoKHR.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerDepthInfoKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRCompositionLayerDepth#XR_TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR} value to the {@link XrCompositionLayerDepthInfoKHR#type} field. */
        public XrCompositionLayerDepthInfoKHR.Buffer type$Default() { return type(KHRCompositionLayerDepth.XR_TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR); }
        /** Sets the specified value to the {@link XrCompositionLayerDepthInfoKHR#next} field. */
        public XrCompositionLayerDepthInfoKHR.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerDepthInfoKHR.nnext(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@link XrCompositionLayerDepthInfoKHR#subImage} field. */
        public XrCompositionLayerDepthInfoKHR.Buffer subImage(XrSwapchainSubImage value) { XrCompositionLayerDepthInfoKHR.nsubImage(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerDepthInfoKHR#subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerDepthInfoKHR.Buffer subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerDepthInfoKHR#minDepth} field. */
        public XrCompositionLayerDepthInfoKHR.Buffer minDepth(float value) { XrCompositionLayerDepthInfoKHR.nminDepth(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerDepthInfoKHR#maxDepth} field. */
        public XrCompositionLayerDepthInfoKHR.Buffer maxDepth(float value) { XrCompositionLayerDepthInfoKHR.nmaxDepth(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerDepthInfoKHR#nearZ} field. */
        public XrCompositionLayerDepthInfoKHR.Buffer nearZ(float value) { XrCompositionLayerDepthInfoKHR.nnearZ(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerDepthInfoKHR#farZ} field. */
        public XrCompositionLayerDepthInfoKHR.Buffer farZ(float value) { XrCompositionLayerDepthInfoKHR.nfarZ(address(), value); return this; }

    }

}