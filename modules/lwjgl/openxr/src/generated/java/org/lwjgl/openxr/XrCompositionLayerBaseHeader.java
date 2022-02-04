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
 * Composition layer base header.
 * 
 * <h5>Description</h5>
 * 
 * <p>All composition layer structures begin with the elements described in the {@link XrCompositionLayerBaseHeader}. The {@link XrCompositionLayerBaseHeader} structure is not intended to be directly used, but forms a basis for defining current and future structures containing composition layer information. The {@link XrFrameEndInfo} structure contains an array of pointers to these polymorphic header structures. All composition layer type pointers <b>must</b> be type-castable as an {@link XrCompositionLayerBaseHeader} pointer.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be one of the following XrStructureType values: {@link KHRCompositionLayerCube#XR_TYPE_COMPOSITION_LAYER_CUBE_KHR TYPE_COMPOSITION_LAYER_CUBE_KHR}, {@link KHRCompositionLayerCylinder#XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR TYPE_COMPOSITION_LAYER_CYLINDER_KHR}, {@link KHRCompositionLayerEquirect2#XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR}, {@link KHRCompositionLayerEquirect#XR_TYPE_COMPOSITION_LAYER_EQUIRECT_KHR TYPE_COMPOSITION_LAYER_EQUIRECT_KHR}, {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION TYPE_COMPOSITION_LAYER_PROJECTION}, {@link XR10#XR_TYPE_COMPOSITION_LAYER_QUAD TYPE_COMPOSITION_LAYER_QUAD}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrCompositionLayerAlphaBlendFB}, {@link XrCompositionLayerColorScaleBiasKHR}, {@link XrCompositionLayerImageLayoutFB}, {@link XrCompositionLayerPassthroughFB}, {@link XrCompositionLayerSecureContentFB}</li>
 * <li>{@code layerFlags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerFlagBits} values</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFrameEndInfo}, {@link XrSecondaryViewConfigurationLayerInfoMSFT}, {@link XrSwapchainSubImage}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerBaseHeader {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerFlags {@link #layerFlags};
 *     XrSpace {@link #space};
 * }</code></pre>
 */
public class XrCompositionLayerBaseHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS,
        SPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrCompositionLayerBaseHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerBaseHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrCompositionLayerFlagBits} describing flags to apply to the layer. */
    @NativeType("XrCompositionLayerFlags")
    public long layerFlags() { return nlayerFlags(address()); }
    /** the {@code XrSpace} in which the layer will be kept stable over time. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerBaseHeader type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerBaseHeader next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrCompositionLayerAlphaBlendFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerAlphaBlendFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerColorScaleBiasKHR} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerColorScaleBiasKHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerImageLayoutFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerImageLayoutFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerPassthroughFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerPassthroughFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerSecureContentFB} value to the {@code next} chain. */
    public XrCompositionLayerBaseHeader next(XrCompositionLayerSecureContentFB value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #layerFlags} field. */
    public XrCompositionLayerBaseHeader layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrCompositionLayerBaseHeader space(XrSpace value) { nspace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerBaseHeader set(
        int type,
        long next,
        long layerFlags,
        XrSpace space
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerBaseHeader set(XrCompositionLayerBaseHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerBaseHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerBaseHeader malloc() {
        return wrap(XrCompositionLayerBaseHeader.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerBaseHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerBaseHeader calloc() {
        return wrap(XrCompositionLayerBaseHeader.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerBaseHeader} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerBaseHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerBaseHeader.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerBaseHeader} instance for the specified memory address. */
    public static XrCompositionLayerBaseHeader create(long address) {
        return wrap(XrCompositionLayerBaseHeader.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerBaseHeader createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerBaseHeader.class, address);
    }

    /** Upcasts the specified {@code XrCompositionLayerProjection} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerProjection value) {
        return wrap(XrCompositionLayerBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerQuad} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerQuad value) {
        return wrap(XrCompositionLayerBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerCubeKHR} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerCubeKHR value) {
        return wrap(XrCompositionLayerBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerCylinderKHR} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerCylinderKHR value) {
        return wrap(XrCompositionLayerBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerEquirectKHR} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerEquirectKHR value) {
        return wrap(XrCompositionLayerBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerEquirect2KHR} instance to {@code XrCompositionLayerBaseHeader}. */
    public static XrCompositionLayerBaseHeader create(XrCompositionLayerEquirect2KHR value) {
        return wrap(XrCompositionLayerBaseHeader.class, value);
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerBaseHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerBaseHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Upcasts the specified {@code XrCompositionLayerProjection.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerProjection.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerQuad.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerQuad.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerCubeKHR.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerCubeKHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerCylinderKHR.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerCylinderKHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerEquirectKHR.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerEquirectKHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrCompositionLayerEquirect2KHR.Buffer} instance to {@code XrCompositionLayerBaseHeader.Buffer}. */
    public static XrCompositionLayerBaseHeader.Buffer create(XrCompositionLayerEquirect2KHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrCompositionLayerBaseHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerBaseHeader malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerBaseHeader.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerBaseHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerBaseHeader calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerBaseHeader.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerBaseHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerBaseHeader.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerBaseHeader.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerBaseHeader.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerBaseHeader.SPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerBaseHeader.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerBaseHeader.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerBaseHeader.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerBaseHeader.SPACE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerBaseHeader.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerBaseHeader} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerBaseHeader, Buffer> implements NativeResource {

        private static final XrCompositionLayerBaseHeader ELEMENT_FACTORY = XrCompositionLayerBaseHeader.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerBaseHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerBaseHeader#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerBaseHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerBaseHeader#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerBaseHeader.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerBaseHeader#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerBaseHeader.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerBaseHeader#layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerBaseHeader.nlayerFlags(address()); }
        /** @return the value of the {@link XrCompositionLayerBaseHeader#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerBaseHeader.nspace(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerBaseHeader#type} field. */
        public XrCompositionLayerBaseHeader.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerBaseHeader.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerBaseHeader#next} field. */
        public XrCompositionLayerBaseHeader.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerBaseHeader.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrCompositionLayerAlphaBlendFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerAlphaBlendFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerColorScaleBiasKHR} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerColorScaleBiasKHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerImageLayoutFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerImageLayoutFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerPassthroughFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerPassthroughFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerSecureContentFB} value to the {@code next} chain. */
        public XrCompositionLayerBaseHeader.Buffer next(XrCompositionLayerSecureContentFB value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrCompositionLayerBaseHeader#layerFlags} field. */
        public XrCompositionLayerBaseHeader.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerBaseHeader.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerBaseHeader#space} field. */
        public XrCompositionLayerBaseHeader.Buffer space(XrSpace value) { XrCompositionLayerBaseHeader.nspace(address(), value); return this; }

    }

}