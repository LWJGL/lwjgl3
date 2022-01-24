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
 * Submit an array of {@link XrSecondaryViewConfigurationLayerInfoMSFT}, one for each secondary view configuration.
 * 
 * <h5>Description</h5>
 * 
 * <p>The view configuration type in each {@link XrSecondaryViewConfigurationLayerInfoMSFT} must be one of the view configurations enabled when calling {@link XR10#xrBeginSession BeginSession} in {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT}, or else the runtime <b>must</b> return error {@link MSFTSecondaryViewConfiguration#XR_ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT}.</p>
 * 
 * <p>The view configuration type in each {@link XrSecondaryViewConfigurationLayerInfoMSFT} must not be the primary view configuration in this session, or else the runtime <b>must</b> return error {@link XR10#XR_ERROR_LAYER_INVALID ERROR_LAYER_INVALID}. The primary view configuration layers continue to be submitted through {@link XrFrameEndInfo} directly.</p>
 * 
 * <p>If the view configuration is not active, as indicated in {@link XrSecondaryViewConfigurationFrameStateMSFT}, the composition layers submitted to this view configuration <b>may</b> be ignored by the runtime. Applications <b>should</b> avoid rendering into secondary views when the view configuration is inactive.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using {@link XrSecondaryViewConfigurationFrameEndInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code viewConfigurationLayersInfo} <b>must</b> be a pointer to an array of {@code viewConfigurationCount} valid {@link XrSecondaryViewConfigurationLayerInfoMSFT} structures</li>
 * <li>The {@code viewConfigurationCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSecondaryViewConfigurationLayerInfoMSFT}, {@link XR10#xrEndFrame EndFrame}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSecondaryViewConfigurationFrameEndInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #viewConfigurationCount};
 *     {@link XrSecondaryViewConfigurationLayerInfoMSFT XrSecondaryViewConfigurationLayerInfoMSFT} const * {@link #viewConfigurationLayersInfo};
 * }</code></pre>
 */
public class XrSecondaryViewConfigurationFrameEndInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONCOUNT,
        VIEWCONFIGURATIONLAYERSINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONCOUNT = layout.offsetof(2);
        VIEWCONFIGURATIONLAYERSINFO = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationFrameEndInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationFrameEndInfoMSFT(ByteBuffer container) {
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
    /** the number of elements in {@code viewConfigurationLayersInfo}. */
    @NativeType("uint32_t")
    public int viewConfigurationCount() { return nviewConfigurationCount(address()); }
    /** an array of {@link XrSecondaryViewConfigurationLayerInfoMSFT}, containing composition layers to be submitted for the specified active view configuration. */
    @NativeType("XrSecondaryViewConfigurationLayerInfoMSFT const *")
    public XrSecondaryViewConfigurationLayerInfoMSFT.Buffer viewConfigurationLayersInfo() { return nviewConfigurationLayersInfo(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSecondaryViewConfigurationFrameEndInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT} value to the {@link #type} field. */
    public XrSecondaryViewConfigurationFrameEndInfoMSFT type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSecondaryViewConfigurationFrameEndInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} to the {@link #viewConfigurationLayersInfo} field. */
    public XrSecondaryViewConfigurationFrameEndInfoMSFT viewConfigurationLayersInfo(@NativeType("XrSecondaryViewConfigurationLayerInfoMSFT const *") XrSecondaryViewConfigurationLayerInfoMSFT.Buffer value) { nviewConfigurationLayersInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationFrameEndInfoMSFT set(
        int type,
        long next,
        XrSecondaryViewConfigurationLayerInfoMSFT.Buffer viewConfigurationLayersInfo
    ) {
        type(type);
        next(next);
        viewConfigurationLayersInfo(viewConfigurationLayersInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationFrameEndInfoMSFT set(XrSecondaryViewConfigurationFrameEndInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationFrameEndInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT malloc() {
        return wrap(XrSecondaryViewConfigurationFrameEndInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameEndInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT calloc() {
        return wrap(XrSecondaryViewConfigurationFrameEndInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameEndInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSecondaryViewConfigurationFrameEndInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameEndInfoMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT create(long address) {
        return wrap(XrSecondaryViewConfigurationFrameEndInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSecondaryViewConfigurationFrameEndInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationFrameEndInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationFrameEndInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationFrameEndInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationFrameEndInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationCount}. */
    public static int nviewConfigurationCount(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.VIEWCONFIGURATIONCOUNT); }
    /** Unsafe version of {@link #viewConfigurationLayersInfo}. */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer nviewConfigurationLayersInfo(long struct) { return XrSecondaryViewConfigurationLayerInfoMSFT.create(memGetAddress(struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.VIEWCONFIGURATIONLAYERSINFO), nviewConfigurationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.NEXT, value); }
    /** Sets the specified value to the {@code viewConfigurationCount} field of the specified {@code struct}. */
    public static void nviewConfigurationCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.VIEWCONFIGURATIONCOUNT, value); }
    /** Unsafe version of {@link #viewConfigurationLayersInfo(XrSecondaryViewConfigurationLayerInfoMSFT.Buffer) viewConfigurationLayersInfo}. */
    public static void nviewConfigurationLayersInfo(long struct, XrSecondaryViewConfigurationLayerInfoMSFT.Buffer value) { memPutAddress(struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.VIEWCONFIGURATIONLAYERSINFO, value.address()); nviewConfigurationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int viewConfigurationCount = nviewConfigurationCount(struct);
        long viewConfigurationLayersInfo = memGetAddress(struct + XrSecondaryViewConfigurationFrameEndInfoMSFT.VIEWCONFIGURATIONLAYERSINFO);
        check(viewConfigurationLayersInfo);
        validate(viewConfigurationLayersInfo, viewConfigurationCount, XrSecondaryViewConfigurationLayerInfoMSFT.SIZEOF, XrSecondaryViewConfigurationLayerInfoMSFT::validate);
    }

    // -----------------------------------

    /** An array of {@link XrSecondaryViewConfigurationFrameEndInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationFrameEndInfoMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationFrameEndInfoMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationFrameEndInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSecondaryViewConfigurationFrameEndInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationFrameEndInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSecondaryViewConfigurationFrameEndInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#viewConfigurationCount} field. */
        @NativeType("uint32_t")
        public int viewConfigurationCount() { return XrSecondaryViewConfigurationFrameEndInfoMSFT.nviewConfigurationCount(address()); }
        /** @return a {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} view of the struct array pointed to by the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#viewConfigurationLayersInfo} field. */
        @NativeType("XrSecondaryViewConfigurationLayerInfoMSFT const *")
        public XrSecondaryViewConfigurationLayerInfoMSFT.Buffer viewConfigurationLayersInfo() { return XrSecondaryViewConfigurationFrameEndInfoMSFT.nviewConfigurationLayersInfo(address()); }

        /** Sets the specified value to the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#type} field. */
        public XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationFrameEndInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT} value to the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#type} field. */
        public XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#next} field. */
        public XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSecondaryViewConfigurationFrameEndInfoMSFT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} to the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT#viewConfigurationLayersInfo} field. */
        public XrSecondaryViewConfigurationFrameEndInfoMSFT.Buffer viewConfigurationLayersInfo(@NativeType("XrSecondaryViewConfigurationLayerInfoMSFT const *") XrSecondaryViewConfigurationLayerInfoMSFT.Buffer value) { XrSecondaryViewConfigurationFrameEndInfoMSFT.nviewConfigurationLayersInfo(address(), value); return this; }

    }

}