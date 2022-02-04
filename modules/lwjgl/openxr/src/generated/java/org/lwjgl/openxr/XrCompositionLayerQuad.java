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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Quad composition layer.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrCompositionLayerQuad} layer is useful for user interface elements or 2D content rendered into the virtual world. The layer’s {@link XrSwapchainSubImage}::swapchain image is applied to a quad in the virtual world space. Only front face of the quad surface is visible; the back face is not visible and <b>must</b> not be drawn by the runtime. A quad layer has no thickness; it is a two-dimensional object positioned and oriented in 3D space. The position of a quad refers to the center of the quad within the given {@code XrSpace}. The orientation of the quad refers to the orientation of the normal vector from the front face. The size of a quad refers to the quad’s size in the <code>x-y</code> plane of the given {@code XrSpace}’s coordinate system. A quad with a position of {0,0,0}, rotation of {0,0,0,1} (no rotation), and a size of {1,1} refers to a 1 meter x 1 meter quad centered at {0,0,0} with its front face normal vector coinciding with the +z axis.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_COMPOSITION_LAYER_QUAD TYPE_COMPOSITION_LAYER_QUAD}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>{@code eyeVisibility} <b>must</b> be a valid {@code XrEyeVisibility} value</li>
 * <li>{@code subImage} <b>must</b> be a valid {@link XrSwapchainSubImage} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}, {@link XrExtent2Df}, {@link XrPosef}, {@link XrSwapchainSubImage}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerQuad {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerFlags {@link #layerFlags};
 *     XrSpace {@link #space};
 *     XrEyeVisibility {@link #eyeVisibility};
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} {@link #subImage};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     {@link XrExtent2Df XrExtent2Df} {@link #size};
 * }</code></pre>
 */
public class XrCompositionLayerQuad extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS,
        SPACE,
        EYEVISIBILITY,
        SUBIMAGE,
        POSE,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        EYEVISIBILITY = layout.offsetof(4);
        SUBIMAGE = layout.offsetof(5);
        POSE = layout.offsetof(6);
        SIZE = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrCompositionLayerQuad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerQuad(ByteBuffer container) {
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
    /** a bitmask of {@code XrCompositionLayerFlagBits} describing flags to apply to the layer. */
    @NativeType("XrCompositionLayerFlags")
    public long layerFlags() { return nlayerFlags(address()); }
    /** the {@code XrSpace} in which the {@code pose} of the quad layer is evaluated over time. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the {@code XrEyeVisibility} for this layer. */
    @NativeType("XrEyeVisibility")
    public int eyeVisibility() { return neyeVisibility(address()); }
    /** the image layer {@link XrSwapchainSubImage} to use. */
    public XrSwapchainSubImage subImage() { return nsubImage(address()); }
    /** an {@link XrPosef} defining the position and orientation of the quad in the reference frame of the {@code space}. */
    public XrPosef pose() { return npose(address()); }
    /** the width and height of the quad in meters. */
    public XrExtent2Df size() { return nsize(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerQuad type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_COMPOSITION_LAYER_QUAD TYPE_COMPOSITION_LAYER_QUAD} value to the {@link #type} field. */
    public XrCompositionLayerQuad type$Default() { return type(XR10.XR_TYPE_COMPOSITION_LAYER_QUAD); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerQuad next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #layerFlags} field. */
    public XrCompositionLayerQuad layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrCompositionLayerQuad space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@link #eyeVisibility} field. */
    public XrCompositionLayerQuad eyeVisibility(@NativeType("XrEyeVisibility") int value) { neyeVisibility(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@link #subImage} field. */
    public XrCompositionLayerQuad subImage(XrSwapchainSubImage value) { nsubImage(address(), value); return this; }
    /** Passes the {@link #subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerQuad subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrCompositionLayerQuad pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerQuad pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@link #size} field. */
    public XrCompositionLayerQuad size(XrExtent2Df value) { nsize(address(), value); return this; }
    /** Passes the {@link #size} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerQuad size(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(size()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerQuad set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        int eyeVisibility,
        XrSwapchainSubImage subImage,
        XrPosef pose,
        XrExtent2Df size
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        eyeVisibility(eyeVisibility);
        subImage(subImage);
        pose(pose);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerQuad set(XrCompositionLayerQuad src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerQuad} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerQuad malloc() {
        return wrap(XrCompositionLayerQuad.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerQuad} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerQuad calloc() {
        return wrap(XrCompositionLayerQuad.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerQuad} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerQuad create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerQuad.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerQuad} instance for the specified memory address. */
    public static XrCompositionLayerQuad create(long address) {
        return wrap(XrCompositionLayerQuad.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerQuad createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerQuad.class, address);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerQuad}. */
    public static XrCompositionLayerQuad create(XrCompositionLayerBaseHeader value) {
        return wrap(XrCompositionLayerQuad.class, value);
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerQuad.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerQuad.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerQuad.Buffer}. */
    public static XrCompositionLayerQuad.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrCompositionLayerQuad} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerQuad malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerQuad.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerQuad} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerQuad calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerQuad.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerQuad.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerQuad.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerQuad.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerQuad.SPACE); }
    /** Unsafe version of {@link #eyeVisibility}. */
    public static int neyeVisibility(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerQuad.EYEVISIBILITY); }
    /** Unsafe version of {@link #subImage}. */
    public static XrSwapchainSubImage nsubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerQuad.SUBIMAGE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrCompositionLayerQuad.POSE); }
    /** Unsafe version of {@link #size}. */
    public static XrExtent2Df nsize(long struct) { return XrExtent2Df.create(struct + XrCompositionLayerQuad.SIZE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerQuad.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerQuad.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerQuad.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerQuad.SPACE, value.address()); }
    /** Unsafe version of {@link #eyeVisibility(int) eyeVisibility}. */
    public static void neyeVisibility(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerQuad.EYEVISIBILITY, value); }
    /** Unsafe version of {@link #subImage(XrSwapchainSubImage) subImage}. */
    public static void nsubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerQuad.SUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerQuad.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #size(XrExtent2Df) size}. */
    public static void nsize(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrCompositionLayerQuad.SIZE, XrExtent2Df.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerQuad.SPACE));
        XrSwapchainSubImage.validate(struct + XrCompositionLayerQuad.SUBIMAGE);
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerQuad} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerQuad, Buffer> implements NativeResource {

        private static final XrCompositionLayerQuad ELEMENT_FACTORY = XrCompositionLayerQuad.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerQuad.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerQuad#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerQuad getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerQuad#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerQuad.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerQuad#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerQuad.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerQuad#layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerQuad.nlayerFlags(address()); }
        /** @return the value of the {@link XrCompositionLayerQuad#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerQuad.nspace(address()); }
        /** @return the value of the {@link XrCompositionLayerQuad#eyeVisibility} field. */
        @NativeType("XrEyeVisibility")
        public int eyeVisibility() { return XrCompositionLayerQuad.neyeVisibility(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@link XrCompositionLayerQuad#subImage} field. */
        public XrSwapchainSubImage subImage() { return XrCompositionLayerQuad.nsubImage(address()); }
        /** @return a {@link XrPosef} view of the {@link XrCompositionLayerQuad#pose} field. */
        public XrPosef pose() { return XrCompositionLayerQuad.npose(address()); }
        /** @return a {@link XrExtent2Df} view of the {@link XrCompositionLayerQuad#size} field. */
        public XrExtent2Df size() { return XrCompositionLayerQuad.nsize(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerQuad#type} field. */
        public XrCompositionLayerQuad.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerQuad.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_COMPOSITION_LAYER_QUAD TYPE_COMPOSITION_LAYER_QUAD} value to the {@link XrCompositionLayerQuad#type} field. */
        public XrCompositionLayerQuad.Buffer type$Default() { return type(XR10.XR_TYPE_COMPOSITION_LAYER_QUAD); }
        /** Sets the specified value to the {@link XrCompositionLayerQuad#next} field. */
        public XrCompositionLayerQuad.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerQuad.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerQuad#layerFlags} field. */
        public XrCompositionLayerQuad.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerQuad.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerQuad#space} field. */
        public XrCompositionLayerQuad.Buffer space(XrSpace value) { XrCompositionLayerQuad.nspace(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerQuad#eyeVisibility} field. */
        public XrCompositionLayerQuad.Buffer eyeVisibility(@NativeType("XrEyeVisibility") int value) { XrCompositionLayerQuad.neyeVisibility(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@link XrCompositionLayerQuad#subImage} field. */
        public XrCompositionLayerQuad.Buffer subImage(XrSwapchainSubImage value) { XrCompositionLayerQuad.nsubImage(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerQuad#subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerQuad.Buffer subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrCompositionLayerQuad#pose} field. */
        public XrCompositionLayerQuad.Buffer pose(XrPosef value) { XrCompositionLayerQuad.npose(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerQuad#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerQuad.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@link XrCompositionLayerQuad#size} field. */
        public XrCompositionLayerQuad.Buffer size(XrExtent2Df value) { XrCompositionLayerQuad.nsize(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerQuad#size} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerQuad.Buffer size(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(size()); return this; }

    }

}