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
 * specifies processing options for composition layers.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrCompositionLayerSettingsFB} contains additional flags to indicate which processing steps to perform on a composition layer.</p>
 * 
 * <p>If both {@link FBCompositionLayerSettings#XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB} and {@link FBCompositionLayerSettings#XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB} are set, {@link FBCompositionLayerSettings#XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB} will take precedence.</p>
 * 
 * <p>If both {@link FBCompositionLayerSettings#XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB} and {@link FBCompositionLayerSettings#XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB} are set, {@link FBCompositionLayerSettings#XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB} will take precedence.</p>
 * 
 * <p>To specify the additional flags, create an {@link XrCompositionLayerSettingsFB} structure and pass it via the {@link XrCompositionLayerBaseHeader} structure’s {@code next} parameter.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBCompositionLayerSettings XR_FB_composition_layer_settings} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerSettingsFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBCompositionLayerSettings#XR_TYPE_COMPOSITION_LAYER_SETTINGS_FB TYPE_COMPOSITION_LAYER_SETTINGS_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code layerFlags} <b>must</b> be a valid combination of {@code XrCompositionLayerSettingsFlagBitsFB} values</li>
 * <li>{@code layerFlags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerSettingsFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerSettingsFlagsFB layerFlags;
 * }</code></pre>
 */
public class XrCompositionLayerSettingsFB extends Struct<XrCompositionLayerSettingsFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
    }

    protected XrCompositionLayerSettingsFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerSettingsFB create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerSettingsFB(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerSettingsFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerSettingsFB(ByteBuffer container) {
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
    /** @return the value of the {@code layerFlags} field. */
    @NativeType("XrCompositionLayerSettingsFlagsFB")
    public long layerFlags() { return nlayerFlags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerSettingsFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBCompositionLayerSettings#XR_TYPE_COMPOSITION_LAYER_SETTINGS_FB TYPE_COMPOSITION_LAYER_SETTINGS_FB} value to the {@link #type} field. */
    public XrCompositionLayerSettingsFB type$Default() { return type(FBCompositionLayerSettings.XR_TYPE_COMPOSITION_LAYER_SETTINGS_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerSettingsFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerSettingsFB layerFlags(@NativeType("XrCompositionLayerSettingsFlagsFB") long value) { nlayerFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerSettingsFB set(
        int type,
        long next,
        long layerFlags
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerSettingsFB set(XrCompositionLayerSettingsFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerSettingsFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerSettingsFB malloc() {
        return new XrCompositionLayerSettingsFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerSettingsFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerSettingsFB calloc() {
        return new XrCompositionLayerSettingsFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerSettingsFB} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerSettingsFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerSettingsFB(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerSettingsFB} instance for the specified memory address. */
    public static XrCompositionLayerSettingsFB create(long address) {
        return new XrCompositionLayerSettingsFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerSettingsFB createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerSettingsFB(address, null);
    }

    /**
     * Returns a new {@link XrCompositionLayerSettingsFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSettingsFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSettingsFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSettingsFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSettingsFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSettingsFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerSettingsFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSettingsFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerSettingsFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerSettingsFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerSettingsFB malloc(MemoryStack stack) {
        return new XrCompositionLayerSettingsFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerSettingsFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerSettingsFB calloc(MemoryStack stack) {
        return new XrCompositionLayerSettingsFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerSettingsFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSettingsFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSettingsFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSettingsFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerSettingsFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerSettingsFB.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerSettingsFB.LAYERFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerSettingsFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerSettingsFB.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerSettingsFB.LAYERFLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerSettingsFB} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerSettingsFB, Buffer> implements NativeResource {

        private static final XrCompositionLayerSettingsFB ELEMENT_FACTORY = XrCompositionLayerSettingsFB.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerSettingsFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerSettingsFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerSettingsFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerSettingsFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerSettingsFB.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerSettingsFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerSettingsFB.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerSettingsFlagsFB")
        public long layerFlags() { return XrCompositionLayerSettingsFB.nlayerFlags(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerSettingsFB#type} field. */
        public XrCompositionLayerSettingsFB.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerSettingsFB.ntype(address(), value); return this; }
        /** Sets the {@link FBCompositionLayerSettings#XR_TYPE_COMPOSITION_LAYER_SETTINGS_FB TYPE_COMPOSITION_LAYER_SETTINGS_FB} value to the {@link XrCompositionLayerSettingsFB#type} field. */
        public XrCompositionLayerSettingsFB.Buffer type$Default() { return type(FBCompositionLayerSettings.XR_TYPE_COMPOSITION_LAYER_SETTINGS_FB); }
        /** Sets the specified value to the {@link XrCompositionLayerSettingsFB#next} field. */
        public XrCompositionLayerSettingsFB.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerSettingsFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerSettingsFB.Buffer layerFlags(@NativeType("XrCompositionLayerSettingsFlagsFB") long value) { XrCompositionLayerSettingsFB.nlayerFlags(address(), value); return this; }

    }

}