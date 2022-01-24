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
 * defines color scale and bias for layer textures.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrCompositionLayerColorScaleBiasKHR} contains the information needed to scale and bias the color of layer textures.</p>
 * 
 * <p>The {@link XrCompositionLayerColorScaleBiasKHR} structure <b>can</b> be applied by applications to composition layers by adding an instance of the struct to the {@link XrCompositionLayerBaseHeader}{@code ::next} list.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRCompositionLayerColorScaleBias XR_KHR_composition_layer_color_scale_bias} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerColorScaleBiasKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRCompositionLayerColorScaleBias#XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrColor4f}, {@link XrCompositionLayerBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerColorScaleBiasKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     {@link XrColor4f XrColor4f} {@link #colorScale};
 *     {@link XrColor4f XrColor4f} {@link #colorBias};
 * }</code></pre>
 */
public class XrCompositionLayerColorScaleBiasKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COLORSCALE,
        COLORBIAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrColor4f.SIZEOF, XrColor4f.ALIGNOF),
            __member(XrColor4f.SIZEOF, XrColor4f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COLORSCALE = layout.offsetof(2);
        COLORBIAS = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrCompositionLayerColorScaleBiasKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerColorScaleBiasKHR(ByteBuffer container) {
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
    /** an {@link XrColor4f} which will modulate the color sourced from the images. */
    public XrColor4f colorScale() { return ncolorScale(address()); }
    /** an {@link XrColor4f} which will offset the color sourced from the images. */
    public XrColor4f colorBias() { return ncolorBias(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerColorScaleBiasKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRCompositionLayerColorScaleBias#XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR} value to the {@link #type} field. */
    public XrCompositionLayerColorScaleBiasKHR type$Default() { return type(KHRCompositionLayerColorScaleBias.XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerColorScaleBiasKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrColor4f} to the {@link #colorScale} field. */
    public XrCompositionLayerColorScaleBiasKHR colorScale(XrColor4f value) { ncolorScale(address(), value); return this; }
    /** Passes the {@link #colorScale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerColorScaleBiasKHR colorScale(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(colorScale()); return this; }
    /** Copies the specified {@link XrColor4f} to the {@link #colorBias} field. */
    public XrCompositionLayerColorScaleBiasKHR colorBias(XrColor4f value) { ncolorBias(address(), value); return this; }
    /** Passes the {@link #colorBias} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerColorScaleBiasKHR colorBias(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(colorBias()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerColorScaleBiasKHR set(
        int type,
        long next,
        XrColor4f colorScale,
        XrColor4f colorBias
    ) {
        type(type);
        next(next);
        colorScale(colorScale);
        colorBias(colorBias);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerColorScaleBiasKHR set(XrCompositionLayerColorScaleBiasKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerColorScaleBiasKHR malloc() {
        return wrap(XrCompositionLayerColorScaleBiasKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerColorScaleBiasKHR calloc() {
        return wrap(XrCompositionLayerColorScaleBiasKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerColorScaleBiasKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerColorScaleBiasKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance for the specified memory address. */
    public static XrCompositionLayerColorScaleBiasKHR create(long address) {
        return wrap(XrCompositionLayerColorScaleBiasKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerColorScaleBiasKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerColorScaleBiasKHR.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerColorScaleBiasKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerColorScaleBiasKHR malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerColorScaleBiasKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerColorScaleBiasKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerColorScaleBiasKHR calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerColorScaleBiasKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerColorScaleBiasKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerColorScaleBiasKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerColorScaleBiasKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerColorScaleBiasKHR.NEXT); }
    /** Unsafe version of {@link #colorScale}. */
    public static XrColor4f ncolorScale(long struct) { return XrColor4f.create(struct + XrCompositionLayerColorScaleBiasKHR.COLORSCALE); }
    /** Unsafe version of {@link #colorBias}. */
    public static XrColor4f ncolorBias(long struct) { return XrColor4f.create(struct + XrCompositionLayerColorScaleBiasKHR.COLORBIAS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerColorScaleBiasKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerColorScaleBiasKHR.NEXT, value); }
    /** Unsafe version of {@link #colorScale(XrColor4f) colorScale}. */
    public static void ncolorScale(long struct, XrColor4f value) { memCopy(value.address(), struct + XrCompositionLayerColorScaleBiasKHR.COLORSCALE, XrColor4f.SIZEOF); }
    /** Unsafe version of {@link #colorBias(XrColor4f) colorBias}. */
    public static void ncolorBias(long struct, XrColor4f value) { memCopy(value.address(), struct + XrCompositionLayerColorScaleBiasKHR.COLORBIAS, XrColor4f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerColorScaleBiasKHR} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerColorScaleBiasKHR, Buffer> implements NativeResource {

        private static final XrCompositionLayerColorScaleBiasKHR ELEMENT_FACTORY = XrCompositionLayerColorScaleBiasKHR.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerColorScaleBiasKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerColorScaleBiasKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerColorScaleBiasKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerColorScaleBiasKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerColorScaleBiasKHR.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerColorScaleBiasKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerColorScaleBiasKHR.nnext(address()); }
        /** @return a {@link XrColor4f} view of the {@link XrCompositionLayerColorScaleBiasKHR#colorScale} field. */
        public XrColor4f colorScale() { return XrCompositionLayerColorScaleBiasKHR.ncolorScale(address()); }
        /** @return a {@link XrColor4f} view of the {@link XrCompositionLayerColorScaleBiasKHR#colorBias} field. */
        public XrColor4f colorBias() { return XrCompositionLayerColorScaleBiasKHR.ncolorBias(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerColorScaleBiasKHR#type} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerColorScaleBiasKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRCompositionLayerColorScaleBias#XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR} value to the {@link XrCompositionLayerColorScaleBiasKHR#type} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer type$Default() { return type(KHRCompositionLayerColorScaleBias.XR_TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR); }
        /** Sets the specified value to the {@link XrCompositionLayerColorScaleBiasKHR#next} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerColorScaleBiasKHR.nnext(address(), value); return this; }
        /** Copies the specified {@link XrColor4f} to the {@link XrCompositionLayerColorScaleBiasKHR#colorScale} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer colorScale(XrColor4f value) { XrCompositionLayerColorScaleBiasKHR.ncolorScale(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerColorScaleBiasKHR#colorScale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer colorScale(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(colorScale()); return this; }
        /** Copies the specified {@link XrColor4f} to the {@link XrCompositionLayerColorScaleBiasKHR#colorBias} field. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer colorBias(XrColor4f value) { XrCompositionLayerColorScaleBiasKHR.ncolorBias(address(), value); return this; }
        /** Passes the {@link XrCompositionLayerColorScaleBiasKHR#colorBias} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerColorScaleBiasKHR.Buffer colorBias(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(colorBias()); return this; }

    }

}