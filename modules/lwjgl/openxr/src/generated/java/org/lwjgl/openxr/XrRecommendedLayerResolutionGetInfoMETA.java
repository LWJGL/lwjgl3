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
 * The structure provided by the application to the runtime, describing the information required for a recommendation to be made.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code predictedDisplayTime} is older than the predicted display time returned from most recent {@link XR10#xrWaitFrame WaitFrame} then, the runtime <b>must</b> return {@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METARecommendedLayerResolution XR_META_recommended_layer_resolution} extension <b>must</b> be enabled prior to using {@link XrRecommendedLayerResolutionGetInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METARecommendedLayerResolution#XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code layer} <b>must</b> be a pointer to a valid {@link XrCompositionLayerBaseHeader}-based structure. See also: {@link XrCompositionLayerCubeKHR}, {@link XrCompositionLayerCylinderKHR}, {@link XrCompositionLayerEquirect2KHR}, {@link XrCompositionLayerEquirectKHR}, {@link XrCompositionLayerPassthroughFB}, {@link XrCompositionLayerPassthroughHTC}, {@link XrCompositionLayerProjection}, {@link XrCompositionLayerQuad}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}, {@link METARecommendedLayerResolution#xrGetRecommendedLayerResolutionMETA GetRecommendedLayerResolutionMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRecommendedLayerResolutionGetInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     {@link XrCompositionLayerBaseHeader XrCompositionLayerBaseHeader} const * {@link #layer};
 *     XrTime {@link #predictedDisplayTime};
 * }</code></pre>
 */
public class XrRecommendedLayerResolutionGetInfoMETA extends Struct<XrRecommendedLayerResolutionGetInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYER,
        PREDICTEDDISPLAYTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYER = layout.offsetof(2);
        PREDICTEDDISPLAYTIME = layout.offsetof(3);
    }

    protected XrRecommendedLayerResolutionGetInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRecommendedLayerResolutionGetInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrRecommendedLayerResolutionGetInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrRecommendedLayerResolutionGetInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRecommendedLayerResolutionGetInfoMETA(ByteBuffer container) {
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
    /** a pointer to a structure based on {@link XrCompositionLayerBaseHeader}, describing the layer for which the application wants a runtime-recommended swapchain resolution. Layers with multiple views <b>may</b> scale the views to match the scaled swapchain resolution. */
    @NativeType("XrCompositionLayerBaseHeader const *")
    public XrCompositionLayerBaseHeader layer() { return nlayer(address()); }
    /** the {@code XrTime} that the application intends to submit the layer for. */
    @NativeType("XrTime")
    public long predictedDisplayTime() { return npredictedDisplayTime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrRecommendedLayerResolutionGetInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METARecommendedLayerResolution#XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META} value to the {@link #type} field. */
    public XrRecommendedLayerResolutionGetInfoMETA type$Default() { return type(METARecommendedLayerResolution.XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrRecommendedLayerResolutionGetInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrCompositionLayerBaseHeader} to the {@link #layer} field. */
    public XrRecommendedLayerResolutionGetInfoMETA layer(@NativeType("XrCompositionLayerBaseHeader const *") XrCompositionLayerBaseHeader value) { nlayer(address(), value); return this; }
    /** Sets the specified value to the {@link #predictedDisplayTime} field. */
    public XrRecommendedLayerResolutionGetInfoMETA predictedDisplayTime(@NativeType("XrTime") long value) { npredictedDisplayTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRecommendedLayerResolutionGetInfoMETA set(
        int type,
        long next,
        XrCompositionLayerBaseHeader layer,
        long predictedDisplayTime
    ) {
        type(type);
        next(next);
        layer(layer);
        predictedDisplayTime(predictedDisplayTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRecommendedLayerResolutionGetInfoMETA set(XrRecommendedLayerResolutionGetInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRecommendedLayerResolutionGetInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRecommendedLayerResolutionGetInfoMETA malloc() {
        return new XrRecommendedLayerResolutionGetInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRecommendedLayerResolutionGetInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRecommendedLayerResolutionGetInfoMETA calloc() {
        return new XrRecommendedLayerResolutionGetInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRecommendedLayerResolutionGetInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrRecommendedLayerResolutionGetInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRecommendedLayerResolutionGetInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrRecommendedLayerResolutionGetInfoMETA} instance for the specified memory address. */
    public static XrRecommendedLayerResolutionGetInfoMETA create(long address) {
        return new XrRecommendedLayerResolutionGetInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRecommendedLayerResolutionGetInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrRecommendedLayerResolutionGetInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionGetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionGetInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionGetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionGetInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionGetInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionGetInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRecommendedLayerResolutionGetInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionGetInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRecommendedLayerResolutionGetInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRecommendedLayerResolutionGetInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRecommendedLayerResolutionGetInfoMETA malloc(MemoryStack stack) {
        return new XrRecommendedLayerResolutionGetInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRecommendedLayerResolutionGetInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRecommendedLayerResolutionGetInfoMETA calloc(MemoryStack stack) {
        return new XrRecommendedLayerResolutionGetInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionGetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionGetInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRecommendedLayerResolutionGetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRecommendedLayerResolutionGetInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrRecommendedLayerResolutionGetInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRecommendedLayerResolutionGetInfoMETA.NEXT); }
    /** Unsafe version of {@link #layer}. */
    public static XrCompositionLayerBaseHeader nlayer(long struct) { return XrCompositionLayerBaseHeader.create(memGetAddress(struct + XrRecommendedLayerResolutionGetInfoMETA.LAYER)); }
    /** Unsafe version of {@link #predictedDisplayTime}. */
    public static long npredictedDisplayTime(long struct) { return UNSAFE.getLong(null, struct + XrRecommendedLayerResolutionGetInfoMETA.PREDICTEDDISPLAYTIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrRecommendedLayerResolutionGetInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRecommendedLayerResolutionGetInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #layer(XrCompositionLayerBaseHeader) layer}. */
    public static void nlayer(long struct, XrCompositionLayerBaseHeader value) { memPutAddress(struct + XrRecommendedLayerResolutionGetInfoMETA.LAYER, value.address()); }
    /** Unsafe version of {@link #predictedDisplayTime(long) predictedDisplayTime}. */
    public static void npredictedDisplayTime(long struct, long value) { UNSAFE.putLong(null, struct + XrRecommendedLayerResolutionGetInfoMETA.PREDICTEDDISPLAYTIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long layer = memGetAddress(struct + XrRecommendedLayerResolutionGetInfoMETA.LAYER);
        check(layer);
        XrCompositionLayerBaseHeader.validate(layer);
    }

    // -----------------------------------

    /** An array of {@link XrRecommendedLayerResolutionGetInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrRecommendedLayerResolutionGetInfoMETA, Buffer> implements NativeResource {

        private static final XrRecommendedLayerResolutionGetInfoMETA ELEMENT_FACTORY = XrRecommendedLayerResolutionGetInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrRecommendedLayerResolutionGetInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRecommendedLayerResolutionGetInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRecommendedLayerResolutionGetInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrRecommendedLayerResolutionGetInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRecommendedLayerResolutionGetInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrRecommendedLayerResolutionGetInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrRecommendedLayerResolutionGetInfoMETA.nnext(address()); }
        /** @return a {@link XrCompositionLayerBaseHeader} view of the struct pointed to by the {@link XrRecommendedLayerResolutionGetInfoMETA#layer} field. */
        @NativeType("XrCompositionLayerBaseHeader const *")
        public XrCompositionLayerBaseHeader layer() { return XrRecommendedLayerResolutionGetInfoMETA.nlayer(address()); }
        /** @return the value of the {@link XrRecommendedLayerResolutionGetInfoMETA#predictedDisplayTime} field. */
        @NativeType("XrTime")
        public long predictedDisplayTime() { return XrRecommendedLayerResolutionGetInfoMETA.npredictedDisplayTime(address()); }

        /** Sets the specified value to the {@link XrRecommendedLayerResolutionGetInfoMETA#type} field. */
        public XrRecommendedLayerResolutionGetInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrRecommendedLayerResolutionGetInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METARecommendedLayerResolution#XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META} value to the {@link XrRecommendedLayerResolutionGetInfoMETA#type} field. */
        public XrRecommendedLayerResolutionGetInfoMETA.Buffer type$Default() { return type(METARecommendedLayerResolution.XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META); }
        /** Sets the specified value to the {@link XrRecommendedLayerResolutionGetInfoMETA#next} field. */
        public XrRecommendedLayerResolutionGetInfoMETA.Buffer next(@NativeType("void const *") long value) { XrRecommendedLayerResolutionGetInfoMETA.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrCompositionLayerBaseHeader} to the {@link XrRecommendedLayerResolutionGetInfoMETA#layer} field. */
        public XrRecommendedLayerResolutionGetInfoMETA.Buffer layer(@NativeType("XrCompositionLayerBaseHeader const *") XrCompositionLayerBaseHeader value) { XrRecommendedLayerResolutionGetInfoMETA.nlayer(address(), value); return this; }
        /** Sets the specified value to the {@link XrRecommendedLayerResolutionGetInfoMETA#predictedDisplayTime} field. */
        public XrRecommendedLayerResolutionGetInfoMETA.Buffer predictedDisplayTime(@NativeType("XrTime") long value) { XrRecommendedLayerResolutionGetInfoMETA.npredictedDisplayTime(address(), value); return this; }

    }

}