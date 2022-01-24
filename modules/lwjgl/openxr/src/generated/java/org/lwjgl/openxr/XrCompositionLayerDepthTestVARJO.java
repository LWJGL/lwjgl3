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
 * The structure to be passed when submitting layers to enable depth testing.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link VARJOCompositionLayerDepthTest XR_VARJO_composition_layer_depth_test} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerDepthTestVARJO}</li>
 * <li>{@code type} <b>must</b> be {@link VARJOCompositionLayerDepthTest#XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrEndFrame EndFrame}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerDepthTestVARJO {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     float {@link #depthTestRangeNearZ};
 *     float {@link #depthTestRangeFarZ};
 * }</code></pre>
 */
public class XrCompositionLayerDepthTestVARJO extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DEPTHTESTRANGENEARZ,
        DEPTHTESTRANGEFARZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DEPTHTESTRANGENEARZ = layout.offsetof(2);
        DEPTHTESTRANGEFARZ = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrCompositionLayerDepthTestVARJO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerDepthTestVARJO(ByteBuffer container) {
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
    /** in a non-negative distance in meters that specifies the lower bound of the range where depth testing should be performed. Must be less than {@code depthTestRangeFarZ}. Value of zero means that there is no lower bound. */
    public float depthTestRangeNearZ() { return ndepthTestRangeNearZ(address()); }
    /** a positive distance in meters that specifies the upper bound of the range where depth testing should be performed. Must be greater than {@code depthTestRangeNearZ}. Value of floating point positive infinity means that there is no upper bound. */
    public float depthTestRangeFarZ() { return ndepthTestRangeFarZ(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerDepthTestVARJO type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VARJOCompositionLayerDepthTest#XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO} value to the {@link #type} field. */
    public XrCompositionLayerDepthTestVARJO type$Default() { return type(VARJOCompositionLayerDepthTest.XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerDepthTestVARJO next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #depthTestRangeNearZ} field. */
    public XrCompositionLayerDepthTestVARJO depthTestRangeNearZ(float value) { ndepthTestRangeNearZ(address(), value); return this; }
    /** Sets the specified value to the {@link #depthTestRangeFarZ} field. */
    public XrCompositionLayerDepthTestVARJO depthTestRangeFarZ(float value) { ndepthTestRangeFarZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerDepthTestVARJO set(
        int type,
        long next,
        float depthTestRangeNearZ,
        float depthTestRangeFarZ
    ) {
        type(type);
        next(next);
        depthTestRangeNearZ(depthTestRangeNearZ);
        depthTestRangeFarZ(depthTestRangeFarZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerDepthTestVARJO set(XrCompositionLayerDepthTestVARJO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerDepthTestVARJO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerDepthTestVARJO malloc() {
        return wrap(XrCompositionLayerDepthTestVARJO.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerDepthTestVARJO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerDepthTestVARJO calloc() {
        return wrap(XrCompositionLayerDepthTestVARJO.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerDepthTestVARJO} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerDepthTestVARJO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerDepthTestVARJO.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerDepthTestVARJO} instance for the specified memory address. */
    public static XrCompositionLayerDepthTestVARJO create(long address) {
        return wrap(XrCompositionLayerDepthTestVARJO.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerDepthTestVARJO createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerDepthTestVARJO.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestVARJO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestVARJO.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestVARJO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestVARJO.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestVARJO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestVARJO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerDepthTestVARJO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestVARJO.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerDepthTestVARJO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerDepthTestVARJO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerDepthTestVARJO malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerDepthTestVARJO.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerDepthTestVARJO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerDepthTestVARJO calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerDepthTestVARJO.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestVARJO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestVARJO.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestVARJO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestVARJO.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerDepthTestVARJO.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerDepthTestVARJO.NEXT); }
    /** Unsafe version of {@link #depthTestRangeNearZ}. */
    public static float ndepthTestRangeNearZ(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerDepthTestVARJO.DEPTHTESTRANGENEARZ); }
    /** Unsafe version of {@link #depthTestRangeFarZ}. */
    public static float ndepthTestRangeFarZ(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerDepthTestVARJO.DEPTHTESTRANGEFARZ); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerDepthTestVARJO.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerDepthTestVARJO.NEXT, value); }
    /** Unsafe version of {@link #depthTestRangeNearZ(float) depthTestRangeNearZ}. */
    public static void ndepthTestRangeNearZ(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerDepthTestVARJO.DEPTHTESTRANGENEARZ, value); }
    /** Unsafe version of {@link #depthTestRangeFarZ(float) depthTestRangeFarZ}. */
    public static void ndepthTestRangeFarZ(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerDepthTestVARJO.DEPTHTESTRANGEFARZ, value); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerDepthTestVARJO} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerDepthTestVARJO, Buffer> implements NativeResource {

        private static final XrCompositionLayerDepthTestVARJO ELEMENT_FACTORY = XrCompositionLayerDepthTestVARJO.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerDepthTestVARJO.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerDepthTestVARJO#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerDepthTestVARJO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerDepthTestVARJO#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerDepthTestVARJO.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthTestVARJO#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerDepthTestVARJO.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthTestVARJO#depthTestRangeNearZ} field. */
        public float depthTestRangeNearZ() { return XrCompositionLayerDepthTestVARJO.ndepthTestRangeNearZ(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthTestVARJO#depthTestRangeFarZ} field. */
        public float depthTestRangeFarZ() { return XrCompositionLayerDepthTestVARJO.ndepthTestRangeFarZ(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerDepthTestVARJO#type} field. */
        public XrCompositionLayerDepthTestVARJO.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerDepthTestVARJO.ntype(address(), value); return this; }
        /** Sets the {@link VARJOCompositionLayerDepthTest#XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO} value to the {@link XrCompositionLayerDepthTestVARJO#type} field. */
        public XrCompositionLayerDepthTestVARJO.Buffer type$Default() { return type(VARJOCompositionLayerDepthTest.XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO); }
        /** Sets the specified value to the {@link XrCompositionLayerDepthTestVARJO#next} field. */
        public XrCompositionLayerDepthTestVARJO.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerDepthTestVARJO.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerDepthTestVARJO#depthTestRangeNearZ} field. */
        public XrCompositionLayerDepthTestVARJO.Buffer depthTestRangeNearZ(float value) { XrCompositionLayerDepthTestVARJO.ndepthTestRangeNearZ(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerDepthTestVARJO#depthTestRangeFarZ} field. */
        public XrCompositionLayerDepthTestVARJO.Buffer depthTestRangeFarZ(float value) { XrCompositionLayerDepthTestVARJO.ndepthTestRangeFarZ(address(), value); return this; }

    }

}