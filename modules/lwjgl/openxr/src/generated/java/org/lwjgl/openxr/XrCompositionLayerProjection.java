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
 * Composition layer for projection.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Because a runtime may reproject the layer over time, a projection layer should specify an {@code XrSpace} in which to maximize stability of the layer content. For example, a projection layer containing world-locked content should use an {@code XrSpace} which is also world-locked, such as the {@code LOCAL} or {@code STAGE} reference spaces. In the case that the projection layer should be head-locked, such as a heads up display, the {@code VIEW} reference space would provide the highest quality layer reprojection.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION TYPE_COMPOSITION_LAYER_PROJECTION}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrCompositionLayerDepthTestVARJO}, {@link XrCompositionLayerReprojectionInfoMSFT}, {@link XrCompositionLayerReprojectionPlaneOverrideMSFT}</li>
 * <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>{@code views} <b>must</b> be a pointer to an array of {@code viewCount} valid {@link XrCompositionLayerProjectionView} structures</li>
 * <li>The {@code viewCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}, {@link XrCompositionLayerProjectionView}, {@link XrSwapchainSubImage}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerProjection {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerFlags {@link #layerFlags};
 *     XrSpace {@link #space};
 *     uint32_t {@link #viewCount};
 *     {@link XrCompositionLayerProjectionView XrCompositionLayerProjectionView} const * {@link #views};
 * }</code></pre>
 */
public class XrCompositionLayerProjection extends Struct implements NativeResource {

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
        VIEWCOUNT,
        VIEWS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        VIEWCOUNT = layout.offsetof(4);
        VIEWS = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrCompositionLayerProjection} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerProjection(ByteBuffer container) {
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
    /** the {@code XrSpace} in which the {@code pose} of each {@link XrCompositionLayerProjectionView} is evaluated over time by the compositor. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the count of views in the {@code views} array. This <b>must</b> be equal to the number of view poses returned by {@link XR10#xrLocateViews LocateViews}. */
    @NativeType("uint32_t")
    public int viewCount() { return nviewCount(address()); }
    /** the array of type {@link XrCompositionLayerProjectionView} containing each projection layer view. */
    @NativeType("XrCompositionLayerProjectionView const *")
    public XrCompositionLayerProjectionView.Buffer views() { return nviews(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerProjection type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION TYPE_COMPOSITION_LAYER_PROJECTION} value to the {@link #type} field. */
    public XrCompositionLayerProjection type$Default() { return type(XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerProjection next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrCompositionLayerDepthTestVARJO} value to the {@code next} chain. */
    public XrCompositionLayerProjection next(XrCompositionLayerDepthTestVARJO value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerReprojectionInfoMSFT} value to the {@code next} chain. */
    public XrCompositionLayerProjection next(XrCompositionLayerReprojectionInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerReprojectionPlaneOverrideMSFT} value to the {@code next} chain. */
    public XrCompositionLayerProjection next(XrCompositionLayerReprojectionPlaneOverrideMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #layerFlags} field. */
    public XrCompositionLayerProjection layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrCompositionLayerProjection space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the address of the specified {@link XrCompositionLayerProjectionView.Buffer} to the {@link #views} field. */
    public XrCompositionLayerProjection views(@NativeType("XrCompositionLayerProjectionView const *") XrCompositionLayerProjectionView.Buffer value) { nviews(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerProjection set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        XrCompositionLayerProjectionView.Buffer views
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        views(views);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerProjection set(XrCompositionLayerProjection src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerProjection} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerProjection malloc() {
        return wrap(XrCompositionLayerProjection.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerProjection} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerProjection calloc() {
        return wrap(XrCompositionLayerProjection.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerProjection} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerProjection create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerProjection.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerProjection} instance for the specified memory address. */
    public static XrCompositionLayerProjection create(long address) {
        return wrap(XrCompositionLayerProjection.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerProjection createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerProjection.class, address);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerProjection}. */
    public static XrCompositionLayerProjection create(XrCompositionLayerBaseHeader value) {
        return wrap(XrCompositionLayerProjection.class, value);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerProjection.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerProjection.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerProjection.Buffer}. */
    public static XrCompositionLayerProjection.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrCompositionLayerProjection} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerProjection malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerProjection.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerProjection} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerProjection calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerProjection.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerProjection.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerProjection.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerProjection.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerProjection.SPACE); }
    /** Unsafe version of {@link #viewCount}. */
    public static int nviewCount(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerProjection.VIEWCOUNT); }
    /** Unsafe version of {@link #views}. */
    public static XrCompositionLayerProjectionView.Buffer nviews(long struct) { return XrCompositionLayerProjectionView.create(memGetAddress(struct + XrCompositionLayerProjection.VIEWS), nviewCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerProjection.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerProjection.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerProjection.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerProjection.SPACE, value.address()); }
    /** Sets the specified value to the {@code viewCount} field of the specified {@code struct}. */
    public static void nviewCount(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerProjection.VIEWCOUNT, value); }
    /** Unsafe version of {@link #views(XrCompositionLayerProjectionView.Buffer) views}. */
    public static void nviews(long struct, XrCompositionLayerProjectionView.Buffer value) { memPutAddress(struct + XrCompositionLayerProjection.VIEWS, value.address()); nviewCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerProjection.SPACE));
        int viewCount = nviewCount(struct);
        long views = memGetAddress(struct + XrCompositionLayerProjection.VIEWS);
        check(views);
        validate(views, viewCount, XrCompositionLayerProjectionView.SIZEOF, XrCompositionLayerProjectionView::validate);
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerProjection} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerProjection, Buffer> implements NativeResource {

        private static final XrCompositionLayerProjection ELEMENT_FACTORY = XrCompositionLayerProjection.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerProjection.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerProjection#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerProjection getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerProjection#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerProjection.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerProjection#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerProjection.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerProjection#layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerProjection.nlayerFlags(address()); }
        /** @return the value of the {@link XrCompositionLayerProjection#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerProjection.nspace(address()); }
        /** @return the value of the {@link XrCompositionLayerProjection#viewCount} field. */
        @NativeType("uint32_t")
        public int viewCount() { return XrCompositionLayerProjection.nviewCount(address()); }
        /** @return a {@link XrCompositionLayerProjectionView.Buffer} view of the struct array pointed to by the {@link XrCompositionLayerProjection#views} field. */
        @NativeType("XrCompositionLayerProjectionView const *")
        public XrCompositionLayerProjectionView.Buffer views() { return XrCompositionLayerProjection.nviews(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerProjection#type} field. */
        public XrCompositionLayerProjection.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerProjection.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION TYPE_COMPOSITION_LAYER_PROJECTION} value to the {@link XrCompositionLayerProjection#type} field. */
        public XrCompositionLayerProjection.Buffer type$Default() { return type(XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION); }
        /** Sets the specified value to the {@link XrCompositionLayerProjection#next} field. */
        public XrCompositionLayerProjection.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerProjection.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrCompositionLayerDepthTestVARJO} value to the {@code next} chain. */
        public XrCompositionLayerProjection.Buffer next(XrCompositionLayerDepthTestVARJO value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerReprojectionInfoMSFT} value to the {@code next} chain. */
        public XrCompositionLayerProjection.Buffer next(XrCompositionLayerReprojectionInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerReprojectionPlaneOverrideMSFT} value to the {@code next} chain. */
        public XrCompositionLayerProjection.Buffer next(XrCompositionLayerReprojectionPlaneOverrideMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrCompositionLayerProjection#layerFlags} field. */
        public XrCompositionLayerProjection.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerProjection.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerProjection#space} field. */
        public XrCompositionLayerProjection.Buffer space(XrSpace value) { XrCompositionLayerProjection.nspace(address(), value); return this; }
        /** Sets the address of the specified {@link XrCompositionLayerProjectionView.Buffer} to the {@link XrCompositionLayerProjection#views} field. */
        public XrCompositionLayerProjection.Buffer views(@NativeType("XrCompositionLayerProjectionView const *") XrCompositionLayerProjectionView.Buffer value) { XrCompositionLayerProjection.nviews(address(), value); return this; }

    }

}