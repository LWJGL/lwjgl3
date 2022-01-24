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
 * Projection layer element.
 * 
 * <h5>Description</h5>
 * 
 * <p>The count and order of view poses submitted with {@link XrCompositionLayerProjection} <b>must</b> be the same order as that returned by {@link XR10#xrLocateViews LocateViews}. The {@link XrCompositionLayerProjectionView}{@code ::pose} and {@link XrCompositionLayerProjectionView}{@code ::fov} <b>should</b> almost always derive from {@link XrView}{@code ::pose} and {@link XrView}{@code ::fov} as found in the {@link XR10#xrLocateViews LocateViews}{@code ::views} array. However, applications <b>may</b> submit an {@link XrCompositionLayerProjectionView} which has a different view or FOV than that from {@link XR10#xrLocateViews LocateViews}. In this case, the runtime will map the view and FOV to the system display appropriately. In the case that two submitted views within a single layer overlap, they <b>must</b> be composited in view array order.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW TYPE_COMPOSITION_LAYER_PROJECTION_VIEW}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrCompositionLayerDepthInfoKHR}, {@link XrCompositionLayerSpaceWarpInfoFB}</li>
 * <li>{@code subImage} <b>must</b> be a valid {@link XrSwapchainSubImage} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerProjection}, {@link XrFovf}, {@link XrPosef}, {@link XrSwapchainSubImage}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerProjectionView {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     {@link XrFovf XrFovf} {@link #fov};
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} {@link #subImage};
 * }</code></pre>
 */
public class XrCompositionLayerProjectionView extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        POSE,
        FOV,
        SUBIMAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrFovf.SIZEOF, XrFovf.ALIGNOF),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        POSE = layout.offsetof(2);
        FOV = layout.offsetof(3);
        SUBIMAGE = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrCompositionLayerProjectionView} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerProjectionView(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@link XrPosef} defining the location and orientation of this projection element in the {@code space} of the corresponding {@link XrCompositionLayerProjectionView}. */
    public XrPosef pose() { return npose(address()); }
    /** the {@link XrFovf} for this projection element. */
    public XrFovf fov() { return nfov(address()); }
    /** the image layer {@link XrSwapchainSubImage} to use. */
    public XrSwapchainSubImage subImage() { return nsubImage(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerProjectionView type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW TYPE_COMPOSITION_LAYER_PROJECTION_VIEW} value to the {@link #type} field. */
    public XrCompositionLayerProjectionView type$Default() { return type(XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerProjectionView next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrCompositionLayerDepthInfoKHR} value to the {@code next} chain. */
    public XrCompositionLayerProjectionView next(XrCompositionLayerDepthInfoKHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerSpaceWarpInfoFB} value to the {@code next} chain. */
    public XrCompositionLayerProjectionView next(XrCompositionLayerSpaceWarpInfoFB value) { return this.next(value.next(this.next()).address()); }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrCompositionLayerProjectionView pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerProjectionView pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrFovf} to the {@link #fov} field. */
    public XrCompositionLayerProjectionView fov(XrFovf value) { nfov(address(), value); return this; }
    /** Passes the {@link #fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerProjectionView fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@link #subImage} field. */
    public XrCompositionLayerProjectionView subImage(XrSwapchainSubImage value) { nsubImage(address(), value); return this; }
    /** Passes the {@link #subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerProjectionView subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerProjectionView set(
        int type,
        long next,
        XrPosef pose,
        XrFovf fov,
        XrSwapchainSubImage subImage
    ) {
        type(type);
        next(next);
        pose(pose);
        fov(fov);
        subImage(subImage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerProjectionView set(XrCompositionLayerProjectionView src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerProjectionView} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerProjectionView malloc() {
        return wrap(XrCompositionLayerProjectionView.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerProjectionView} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerProjectionView calloc() {
        return wrap(XrCompositionLayerProjectionView.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerProjectionView} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerProjectionView create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerProjectionView.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerProjectionView} instance for the specified memory address. */
    public static XrCompositionLayerProjectionView create(long address) {
        return wrap(XrCompositionLayerProjectionView.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerProjectionView createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerProjectionView.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjectionView.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjectionView.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjectionView.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjectionView.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjectionView.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjectionView.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerProjectionView.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjectionView.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerProjectionView.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerProjectionView} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerProjectionView malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerProjectionView.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerProjectionView} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerProjectionView calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerProjectionView.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerProjectionView.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjectionView.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjectionView.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjectionView.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerProjectionView.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerProjectionView.NEXT); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrCompositionLayerProjectionView.POSE); }
    /** Unsafe version of {@link #fov}. */
    public static XrFovf nfov(long struct) { return XrFovf.create(struct + XrCompositionLayerProjectionView.FOV); }
    /** Unsafe version of {@link #subImage}. */
    public static XrSwapchainSubImage nsubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerProjectionView.SUBIMAGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerProjectionView.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerProjectionView.NEXT, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerProjectionView.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #fov(XrFovf) fov}. */
    public static void nfov(long struct, XrFovf value) { memCopy(value.address(), struct + XrCompositionLayerProjectionView.FOV, XrFovf.SIZEOF); }
    /** Unsafe version of {@link #subImage(XrSwapchainSubImage) subImage}. */
    public static void nsubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerProjectionView.SUBIMAGE, XrSwapchainSubImage.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        XrSwapchainSubImage.validate(struct + XrCompositionLayerProjectionView.SUBIMAGE);
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerProjectionView} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerProjectionView, Buffer> implements NativeResource {

        private static final XrCompositionLayerProjectionView ELEMENT_FACTORY = XrCompositionLayerProjectionView.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerProjectionView.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerProjectionView#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerProjectionView getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerProjectionView#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerProjectionView.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerProjectionView#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerProjectionView.nnext(address()); }
        /** @return a {@link XrPosef} view of the {@link XrCompositionLayerProjectionView#pose} field. */
        public XrPosef pose() { return XrCompositionLayerProjectionView.npose(address()); }
        /** @return a {@link XrFovf} view of the {@link XrCompositionLayerProjectionView#fov} field. */
        public XrFovf fov() { return XrCompositionLayerProjectionView.nfov(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@link XrCompositionLayerProjectionView#subImage} field. */
        public XrSwapchainSubImage subImage() { return XrCompositionLayerProjectionView.nsubImage(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerProjectionView#type} field. */
        public XrCompositionLayerProjectionView.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerProjectionView.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW TYPE_COMPOSITION_LAYER_PROJECTION_VIEW} value to the {@link XrCompositionLayerProjectionView#type} field. */
        public XrCompositionLayerProjectionView.Buffer type$Default() { return type(XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW); }
        /** Sets the specified value to the {@link XrCompositionLayerProjectionView#next} field. */
        public XrCompositionLayerProjectionView.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerProjectionView.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrCompositionLayerDepthInfoKHR} value to the {@code next} chain. */
        public XrCompositionLayerProjectionView.Buffer next(XrCompositionLayerDepthInfoKHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerSpaceWarpInfoFB} value to the {@code next} chain. */
        public XrCompositionLayerProjectionView.Buffer next(XrCompositionLayerSpaceWarpInfoFB value) { return this.next(value.next(this.next()).address()); }
        /** Copies the specified {@link XrPosef} to the {@link XrCompositionLayerProjectionView#pose} field. */
        public XrCompositionLayerProjectionView.Buffer pose(XrPosef value) { XrCompositionLayerProjectionView.npose(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerProjectionView#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerProjectionView.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrFovf} to the {@link XrCompositionLayerProjectionView#fov} field. */
        public XrCompositionLayerProjectionView.Buffer fov(XrFovf value) { XrCompositionLayerProjectionView.nfov(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerProjectionView#fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerProjectionView.Buffer fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@link XrCompositionLayerProjectionView#subImage} field. */
        public XrCompositionLayerProjectionView.Buffer subImage(XrSwapchainSubImage value) { XrCompositionLayerProjectionView.nsubImage(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerProjectionView#subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerProjectionView.Buffer subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }

    }

}