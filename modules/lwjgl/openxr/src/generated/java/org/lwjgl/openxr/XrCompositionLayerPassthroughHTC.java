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
 * A composition layer for passthrough.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>can</b> create an {@link XrCompositionLayerPassthroughHTC} structure with the created {@code passthrough} and the corresponding information. A pointer to {@link XrCompositionLayerPassthroughHTC} <b>may</b> be submitted in {@link XR10#xrEndFrame EndFrame} as a pointer to the base structure {@link XrCompositionLayerBaseHeader}, in the desired layer order, to request the runtime to composite a passthrough layer into the final frame output.</p>
 * 
 * <p>If the passthrough form specified to {@link HTCPassthrough#xrCreatePassthroughHTC CreatePassthroughHTC} is {@link HTCPassthrough#XR_PASSTHROUGH_FORM_PROJECTED_HTC PASSTHROUGH_FORM_PROJECTED_HTC}, {@link XrPassthroughMeshTransformInfoHTC} <b>must</b> appear in the {@code next} chain. If they are absent, the runtime <b>must</b> return error {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerPassthroughHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrPassthroughMeshTransformInfoHTC}</li>
 * <li>{@code layerFlags} <b>must</b> be a valid combination of {@code XrCompositionLayerFlagBits} values</li>
 * <li>{@code layerFlags} <b>must</b> not be 0</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughHTC} handle</li>
 * <li>{@code color} <b>must</b> be a valid {@link XrPassthroughColorHTC} structure</li>
 * <li>Both of {@code passthrough} and {@code space} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}, {@link XrPassthroughColorHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerPassthroughHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerFlags {@link #layerFlags};
 *     XrSpace {@link #space};
 *     XrPassthroughHTC {@link #passthrough};
 *     {@link XrPassthroughColorHTC XrPassthroughColorHTC} {@link #color};
 * }</code></pre>
 */
public class XrCompositionLayerPassthroughHTC extends Struct<XrCompositionLayerPassthroughHTC> implements NativeResource {

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
        PASSTHROUGH,
        COLOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPassthroughColorHTC.SIZEOF, XrPassthroughColorHTC.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        PASSTHROUGH = layout.offsetof(4);
        COLOR = layout.offsetof(5);
    }

    protected XrCompositionLayerPassthroughHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerPassthroughHTC create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerPassthroughHTC(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerPassthroughHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerPassthroughHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain, such as {@link XrPassthroughMeshTransformInfoHTC}. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrCompositionLayerFlagBits} describing flags to apply to the layer. */
    @NativeType("XrCompositionLayerFlags")
    public long layerFlags() { return nlayerFlags(address()); }
    /** the {@code XrSpace} that specifies the layer’s space - <b>must</b> be {@link XR10#XR_NULL_HANDLE NULL_HANDLE}. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the {@code XrPassthroughHTC} previously created by {@link HTCPassthrough#xrCreatePassthroughHTC CreatePassthroughHTC}. */
    @NativeType("XrPassthroughHTC")
    public long passthrough() { return npassthrough(address()); }
    /** the {@link XrPassthroughColorHTC} describing the color information with the alpha value of the passthrough layer. */
    public XrPassthroughColorHTC color() { return ncolor(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerPassthroughHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC} value to the {@link #type} field. */
    public XrCompositionLayerPassthroughHTC type$Default() { return type(HTCPassthrough.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerPassthroughHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrPassthroughMeshTransformInfoHTC} value to the {@code next} chain. */
    public XrCompositionLayerPassthroughHTC next(XrPassthroughMeshTransformInfoHTC value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #layerFlags} field. */
    public XrCompositionLayerPassthroughHTC layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrCompositionLayerPassthroughHTC space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@link #passthrough} field. */
    public XrCompositionLayerPassthroughHTC passthrough(XrPassthroughHTC value) { npassthrough(address(), value); return this; }
    /** Copies the specified {@link XrPassthroughColorHTC} to the {@link #color} field. */
    public XrCompositionLayerPassthroughHTC color(XrPassthroughColorHTC value) { ncolor(address(), value); return this; }
    /** Passes the {@link #color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerPassthroughHTC color(java.util.function.Consumer<XrPassthroughColorHTC> consumer) { consumer.accept(color()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerPassthroughHTC set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        XrPassthroughHTC passthrough,
        XrPassthroughColorHTC color
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        passthrough(passthrough);
        color(color);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerPassthroughHTC set(XrCompositionLayerPassthroughHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughHTC malloc() {
        return new XrCompositionLayerPassthroughHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughHTC calloc() {
        return new XrCompositionLayerPassthroughHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerPassthroughHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerPassthroughHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughHTC} instance for the specified memory address. */
    public static XrCompositionLayerPassthroughHTC create(long address) {
        return new XrCompositionLayerPassthroughHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerPassthroughHTC createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerPassthroughHTC(address, null);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerPassthroughHTC}. */
    public static XrCompositionLayerPassthroughHTC create(XrCompositionLayerBaseHeader value) {
        return new XrCompositionLayerPassthroughHTC(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerPassthroughHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerPassthroughHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerPassthroughHTC.Buffer}. */
    public static XrCompositionLayerPassthroughHTC.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return new XrCompositionLayerPassthroughHTC.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughHTC malloc(MemoryStack stack) {
        return new XrCompositionLayerPassthroughHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughHTC calloc(MemoryStack stack) {
        return new XrCompositionLayerPassthroughHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerPassthroughHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughHTC.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerPassthroughHTC.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughHTC.SPACE); }
    /** Unsafe version of {@link #passthrough}. */
    public static long npassthrough(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughHTC.PASSTHROUGH); }
    /** Unsafe version of {@link #color}. */
    public static XrPassthroughColorHTC ncolor(long struct) { return XrPassthroughColorHTC.create(struct + XrCompositionLayerPassthroughHTC.COLOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerPassthroughHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerPassthroughHTC.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerPassthroughHTC.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerPassthroughHTC.SPACE, value.address()); }
    /** Unsafe version of {@link #passthrough(XrPassthroughHTC) passthrough}. */
    public static void npassthrough(long struct, XrPassthroughHTC value) { memPutAddress(struct + XrCompositionLayerPassthroughHTC.PASSTHROUGH, value.address()); }
    /** Unsafe version of {@link #color(XrPassthroughColorHTC) color}. */
    public static void ncolor(long struct, XrPassthroughColorHTC value) { memCopy(value.address(), struct + XrCompositionLayerPassthroughHTC.COLOR, XrPassthroughColorHTC.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerPassthroughHTC.SPACE));
        check(memGetAddress(struct + XrCompositionLayerPassthroughHTC.PASSTHROUGH));
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerPassthroughHTC} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerPassthroughHTC, Buffer> implements NativeResource {

        private static final XrCompositionLayerPassthroughHTC ELEMENT_FACTORY = XrCompositionLayerPassthroughHTC.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerPassthroughHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerPassthroughHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerPassthroughHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerPassthroughHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerPassthroughHTC.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerPassthroughHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerPassthroughHTC.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerPassthroughHTC#layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerPassthroughHTC.nlayerFlags(address()); }
        /** @return the value of the {@link XrCompositionLayerPassthroughHTC#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerPassthroughHTC.nspace(address()); }
        /** @return the value of the {@link XrCompositionLayerPassthroughHTC#passthrough} field. */
        @NativeType("XrPassthroughHTC")
        public long passthrough() { return XrCompositionLayerPassthroughHTC.npassthrough(address()); }
        /** @return a {@link XrPassthroughColorHTC} view of the {@link XrCompositionLayerPassthroughHTC#color} field. */
        public XrPassthroughColorHTC color() { return XrCompositionLayerPassthroughHTC.ncolor(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerPassthroughHTC#type} field. */
        public XrCompositionLayerPassthroughHTC.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerPassthroughHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC} value to the {@link XrCompositionLayerPassthroughHTC#type} field. */
        public XrCompositionLayerPassthroughHTC.Buffer type$Default() { return type(HTCPassthrough.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC); }
        /** Sets the specified value to the {@link XrCompositionLayerPassthroughHTC#next} field. */
        public XrCompositionLayerPassthroughHTC.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerPassthroughHTC.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrPassthroughMeshTransformInfoHTC} value to the {@code next} chain. */
        public XrCompositionLayerPassthroughHTC.Buffer next(XrPassthroughMeshTransformInfoHTC value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrCompositionLayerPassthroughHTC#layerFlags} field. */
        public XrCompositionLayerPassthroughHTC.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerPassthroughHTC.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerPassthroughHTC#space} field. */
        public XrCompositionLayerPassthroughHTC.Buffer space(XrSpace value) { XrCompositionLayerPassthroughHTC.nspace(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerPassthroughHTC#passthrough} field. */
        public XrCompositionLayerPassthroughHTC.Buffer passthrough(XrPassthroughHTC value) { XrCompositionLayerPassthroughHTC.npassthrough(address(), value); return this; }
        /** Copies the specified {@link XrPassthroughColorHTC} to the {@link XrCompositionLayerPassthroughHTC#color} field. */
        public XrCompositionLayerPassthroughHTC.Buffer color(XrPassthroughColorHTC value) { XrCompositionLayerPassthroughHTC.ncolor(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerPassthroughHTC#color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerPassthroughHTC.Buffer color(java.util.function.Consumer<XrPassthroughColorHTC> consumer) { consumer.accept(color()); return this; }

    }

}