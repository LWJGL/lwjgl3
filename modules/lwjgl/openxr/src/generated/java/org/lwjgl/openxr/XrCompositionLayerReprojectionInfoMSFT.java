/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The information to help reprojection of a projection layer.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTCompositionLayerReprojection XR_MSFT_composition_layer_reprojection} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerReprojectionInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTCompositionLayerReprojection#XR_TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code reprojectionMode} <b>must</b> be a valid {@code XrReprojectionModeMSFT} value</li>
 * </ul>
 * 
 * <p>When the application chained this structure when calling {@link XR10#xrEndFrame EndFrame}, the {@code reprojectionMode} <b>must</b> be one of the supported {@code XrReprojectionModeMSFT} returned by {@link MSFTCompositionLayerReprojection#xrEnumerateReprojectionModesMSFT EnumerateReprojectionModesMSFT} function for the corresponding {@code XrViewConfigurationType}. Otherwise, the runtime <b>must</b> return error {@link MSFTCompositionLayerReprojection#XR_ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT} on the {@link XR10#xrEndFrame EndFrame} function.</p>
 * 
 * <p>The runtime <b>must</b> only use the given information for the corresponding frame in {@link XR10#xrEndFrame EndFrame} function, and it <b>must</b> not affect other frames.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerProjection}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerReprojectionInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrReprojectionModeMSFT {@link #reprojectionMode};
 * }</code></pre>
 */
public class XrCompositionLayerReprojectionInfoMSFT extends Struct<XrCompositionLayerReprojectionInfoMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REPROJECTIONMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REPROJECTIONMODE = layout.offsetof(2);
    }

    protected XrCompositionLayerReprojectionInfoMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerReprojectionInfoMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerReprojectionInfoMSFT(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerReprojectionInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerReprojectionInfoMSFT(ByteBuffer container) {
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
    /** an {@code XrReprojectionModeMSFT} enum providing a hint to the reprojection mode to the corresponding projection layer. */
    @NativeType("XrReprojectionModeMSFT")
    public int reprojectionMode() { return nreprojectionMode(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerReprojectionInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTCompositionLayerReprojection#XR_TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT} value to the {@link #type} field. */
    public XrCompositionLayerReprojectionInfoMSFT type$Default() { return type(MSFTCompositionLayerReprojection.XR_TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerReprojectionInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #reprojectionMode} field. */
    public XrCompositionLayerReprojectionInfoMSFT reprojectionMode(@NativeType("XrReprojectionModeMSFT") int value) { nreprojectionMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerReprojectionInfoMSFT set(
        int type,
        long next,
        int reprojectionMode
    ) {
        type(type);
        next(next);
        reprojectionMode(reprojectionMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerReprojectionInfoMSFT set(XrCompositionLayerReprojectionInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerReprojectionInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerReprojectionInfoMSFT malloc() {
        return new XrCompositionLayerReprojectionInfoMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerReprojectionInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerReprojectionInfoMSFT calloc() {
        return new XrCompositionLayerReprojectionInfoMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerReprojectionInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerReprojectionInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerReprojectionInfoMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerReprojectionInfoMSFT} instance for the specified memory address. */
    public static XrCompositionLayerReprojectionInfoMSFT create(long address) {
        return new XrCompositionLayerReprojectionInfoMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerReprojectionInfoMSFT createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerReprojectionInfoMSFT(address, null);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionInfoMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionInfoMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerReprojectionInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionInfoMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerReprojectionInfoMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerReprojectionInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerReprojectionInfoMSFT malloc(MemoryStack stack) {
        return new XrCompositionLayerReprojectionInfoMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerReprojectionInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerReprojectionInfoMSFT calloc(MemoryStack stack) {
        return new XrCompositionLayerReprojectionInfoMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerReprojectionInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerReprojectionInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerReprojectionInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerReprojectionInfoMSFT.NEXT); }
    /** Unsafe version of {@link #reprojectionMode}. */
    public static int nreprojectionMode(long struct) { return memGetInt(struct + XrCompositionLayerReprojectionInfoMSFT.REPROJECTIONMODE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerReprojectionInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerReprojectionInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #reprojectionMode(int) reprojectionMode}. */
    public static void nreprojectionMode(long struct, int value) { memPutInt(struct + XrCompositionLayerReprojectionInfoMSFT.REPROJECTIONMODE, value); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerReprojectionInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerReprojectionInfoMSFT, Buffer> implements NativeResource {

        private static final XrCompositionLayerReprojectionInfoMSFT ELEMENT_FACTORY = XrCompositionLayerReprojectionInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerReprojectionInfoMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerReprojectionInfoMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrCompositionLayerReprojectionInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerReprojectionInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerReprojectionInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerReprojectionInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerReprojectionInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerReprojectionInfoMSFT#reprojectionMode} field. */
        @NativeType("XrReprojectionModeMSFT")
        public int reprojectionMode() { return XrCompositionLayerReprojectionInfoMSFT.nreprojectionMode(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerReprojectionInfoMSFT#type} field. */
        public XrCompositionLayerReprojectionInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerReprojectionInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTCompositionLayerReprojection#XR_TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT} value to the {@link XrCompositionLayerReprojectionInfoMSFT#type} field. */
        public XrCompositionLayerReprojectionInfoMSFT.Buffer type$Default() { return type(MSFTCompositionLayerReprojection.XR_TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT); }
        /** Sets the specified value to the {@link XrCompositionLayerReprojectionInfoMSFT#next} field. */
        public XrCompositionLayerReprojectionInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerReprojectionInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerReprojectionInfoMSFT#reprojectionMode} field. */
        public XrCompositionLayerReprojectionInfoMSFT.Buffer reprojectionMode(@NativeType("XrReprojectionModeMSFT") int value) { XrCompositionLayerReprojectionInfoMSFT.nreprojectionMode(address(), value); return this; }

    }

}