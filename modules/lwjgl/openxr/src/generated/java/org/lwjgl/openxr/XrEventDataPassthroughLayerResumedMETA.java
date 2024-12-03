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
 * An event that is triggered after a passthrough layer is resumed by client.
 * 
 * <h5>Description</h5>
 * 
 * <p>Runtimes <b>must</b> queue the event exactly once when first presenting passthrough after an app successfully calls one of the following:</p>
 * 
 * <ul>
 * <li>{@link FBPassthrough#xrPassthroughLayerResumeFB PassthroughLayerResumeFB}</li>
 * <li>{@link FBPassthrough#xrCreatePassthroughLayerFB CreatePassthroughLayerFB} with flag {@link FBPassthrough#XR_PASSTHROUGH_IS_RUNNING_AT_CREATION_BIT_FB PASSTHROUGH_IS_RUNNING_AT_CREATION_BIT_FB} set</li>
 * </ul>
 * 
 * <p>The passthrough layer state is reset when the app calls {@link FBPassthrough#xrPassthroughLayerPauseFB PassthroughLayerPauseFB}.</p>
 * 
 * <p>Runtimes <b>must</b> queue the event again, if {@link FBPassthrough#xrPassthroughLayerPauseFB PassthroughLayerPauseFB} is followed by {@link FBPassthrough#xrPassthroughLayerResumeFB PassthroughLayerResumeFB}. During the transition from paused to resumed state, the event is queued exactly once when passthrough has been presented for the first time. If the passthrough feature is not active during the transition, for example because it has been paused using {@link FBPassthrough#xrPassthroughPauseFB PassthroughPauseFB}, the event is queued when passthrough becomes active.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPassthroughLayerResumedEvent XR_META_passthrough_layer_resumed_event} extension <b>must</b> be enabled prior to using {@link XrEventDataPassthroughLayerResumedMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAPassthroughLayerResumedEvent#XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrEventDataBaseHeader}, {@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataPassthroughLayerResumedMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPassthroughLayerFB {@link #layer};
 * }</code></pre>
 */
public class XrEventDataPassthroughLayerResumedMETA extends Struct<XrEventDataPassthroughLayerResumedMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYER = layout.offsetof(2);
    }

    protected XrEventDataPassthroughLayerResumedMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataPassthroughLayerResumedMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataPassthroughLayerResumedMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataPassthroughLayerResumedMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataPassthroughLayerResumedMETA(ByteBuffer container) {
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
    /** an {@code XrPassthroughLayerFB} for which the event has been triggered. */
    @NativeType("XrPassthroughLayerFB")
    public long layer() { return nlayer(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataPassthroughLayerResumedMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughLayerResumedEvent#XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META} value to the {@link #type} field. */
    public XrEventDataPassthroughLayerResumedMETA type$Default() { return type(METAPassthroughLayerResumedEvent.XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataPassthroughLayerResumedMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataPassthroughLayerResumedMETA set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataPassthroughLayerResumedMETA set(XrEventDataPassthroughLayerResumedMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataPassthroughLayerResumedMETA malloc() {
        return new XrEventDataPassthroughLayerResumedMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataPassthroughLayerResumedMETA calloc() {
        return new XrEventDataPassthroughLayerResumedMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataPassthroughLayerResumedMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataPassthroughLayerResumedMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance for the specified memory address. */
    public static XrEventDataPassthroughLayerResumedMETA create(long address) {
        return new XrEventDataPassthroughLayerResumedMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataPassthroughLayerResumedMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataPassthroughLayerResumedMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataPassthroughLayerResumedMETA}. */
    public static XrEventDataPassthroughLayerResumedMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataPassthroughLayerResumedMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataPassthroughLayerResumedMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataPassthroughLayerResumedMETA.Buffer}. */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataPassthroughLayerResumedMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataPassthroughLayerResumedMETA malloc(MemoryStack stack) {
        return new XrEventDataPassthroughLayerResumedMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataPassthroughLayerResumedMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataPassthroughLayerResumedMETA calloc(MemoryStack stack) {
        return new XrEventDataPassthroughLayerResumedMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPassthroughLayerResumedMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataPassthroughLayerResumedMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataPassthroughLayerResumedMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataPassthroughLayerResumedMETA.NEXT); }
    /** Unsafe version of {@link #layer}. */
    public static long nlayer(long struct) { return memGetAddress(struct + XrEventDataPassthroughLayerResumedMETA.LAYER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataPassthroughLayerResumedMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataPassthroughLayerResumedMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataPassthroughLayerResumedMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataPassthroughLayerResumedMETA, Buffer> implements NativeResource {

        private static final XrEventDataPassthroughLayerResumedMETA ELEMENT_FACTORY = XrEventDataPassthroughLayerResumedMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataPassthroughLayerResumedMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataPassthroughLayerResumedMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataPassthroughLayerResumedMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataPassthroughLayerResumedMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataPassthroughLayerResumedMETA.ntype(address()); }
        /** @return the value of the {@link XrEventDataPassthroughLayerResumedMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataPassthroughLayerResumedMETA.nnext(address()); }
        /** @return the value of the {@link XrEventDataPassthroughLayerResumedMETA#layer} field. */
        @NativeType("XrPassthroughLayerFB")
        public long layer() { return XrEventDataPassthroughLayerResumedMETA.nlayer(address()); }

        /** Sets the specified value to the {@link XrEventDataPassthroughLayerResumedMETA#type} field. */
        public XrEventDataPassthroughLayerResumedMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataPassthroughLayerResumedMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughLayerResumedEvent#XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META} value to the {@link XrEventDataPassthroughLayerResumedMETA#type} field. */
        public XrEventDataPassthroughLayerResumedMETA.Buffer type$Default() { return type(METAPassthroughLayerResumedEvent.XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META); }
        /** Sets the specified value to the {@link XrEventDataPassthroughLayerResumedMETA#next} field. */
        public XrEventDataPassthroughLayerResumedMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataPassthroughLayerResumedMETA.nnext(address(), value); return this; }

    }

}