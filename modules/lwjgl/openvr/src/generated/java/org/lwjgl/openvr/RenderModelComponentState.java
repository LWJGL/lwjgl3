/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes state information about a render-model component, including transforms and other dynamic properties.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct RenderModel_ComponentState_t {
 *     {@link HmdMatrix34 HmdMatrix34_t} {@link #mTrackingToComponentRenderModel};
 *     {@link HmdMatrix34 HmdMatrix34_t} {@link #mTrackingToComponentLocal};
 *     VRComponentProperties uProperties;
 * }</code></pre>
 */
@NativeType("struct RenderModel_ComponentState_t")
public class RenderModelComponentState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTRACKINGTOCOMPONENTRENDERMODEL,
        MTRACKINGTOCOMPONENTLOCAL,
        UPROPERTIES;

    static {
        Layout layout = __struct(
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF),
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTRACKINGTOCOMPONENTRENDERMODEL = layout.offsetof(0);
        MTRACKINGTOCOMPONENTLOCAL = layout.offsetof(1);
        UPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code RenderModelComponentState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModelComponentState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Transform required when drawing the component render model */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mTrackingToComponentRenderModel() { return nmTrackingToComponentRenderModel(address()); }
    /** Transform available for attaching to a local component coordinate system (-Z out from surface ) */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mTrackingToComponentLocal() { return nmTrackingToComponentLocal(address()); }
    /** @return the value of the {@code uProperties} field. */
    @NativeType("VRComponentProperties")
    public int uProperties() { return nuProperties(address()); }

    // -----------------------------------

    /** Returns a new {@code RenderModelComponentState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RenderModelComponentState malloc() {
        return wrap(RenderModelComponentState.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code RenderModelComponentState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RenderModelComponentState calloc() {
        return wrap(RenderModelComponentState.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code RenderModelComponentState} instance allocated with {@link BufferUtils}. */
    public static RenderModelComponentState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(RenderModelComponentState.class, memAddress(container), container);
    }

    /** Returns a new {@code RenderModelComponentState} instance for the specified memory address. */
    public static RenderModelComponentState create(long address) {
        return wrap(RenderModelComponentState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelComponentState createSafe(long address) {
        return address == NULL ? null : wrap(RenderModelComponentState.class, address);
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelComponentState.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelComponentState.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelComponentState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link RenderModelComponentState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RenderModelComponentState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelComponentState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RenderModelComponentState mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RenderModelComponentState callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RenderModelComponentState mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RenderModelComponentState callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RenderModelComponentState.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RenderModelComponentState.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RenderModelComponentState.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RenderModelComponentState.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code RenderModelComponentState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelComponentState malloc(MemoryStack stack) {
        return wrap(RenderModelComponentState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code RenderModelComponentState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelComponentState calloc(MemoryStack stack) {
        return wrap(RenderModelComponentState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModelComponentState.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelComponentState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModelComponentState.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTrackingToComponentRenderModel}. */
    public static HmdMatrix34 nmTrackingToComponentRenderModel(long struct) { return HmdMatrix34.create(struct + RenderModelComponentState.MTRACKINGTOCOMPONENTRENDERMODEL); }
    /** Unsafe version of {@link #mTrackingToComponentLocal}. */
    public static HmdMatrix34 nmTrackingToComponentLocal(long struct) { return HmdMatrix34.create(struct + RenderModelComponentState.MTRACKINGTOCOMPONENTLOCAL); }
    /** Unsafe version of {@link #uProperties}. */
    public static int nuProperties(long struct) { return UNSAFE.getInt(null, struct + RenderModelComponentState.UPROPERTIES); }

    // -----------------------------------

    /** An array of {@link RenderModelComponentState} structs. */
    public static class Buffer extends StructBuffer<RenderModelComponentState, Buffer> implements NativeResource {

        private static final RenderModelComponentState ELEMENT_FACTORY = RenderModelComponentState.create(-1L);

        /**
         * Creates a new {@code RenderModelComponentState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModelComponentState#SIZEOF}, and its mark will be undefined.
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
        protected RenderModelComponentState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link HmdMatrix34} view of the {@link RenderModelComponentState#mTrackingToComponentRenderModel} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mTrackingToComponentRenderModel() { return RenderModelComponentState.nmTrackingToComponentRenderModel(address()); }
        /** @return a {@link HmdMatrix34} view of the {@link RenderModelComponentState#mTrackingToComponentLocal} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mTrackingToComponentLocal() { return RenderModelComponentState.nmTrackingToComponentLocal(address()); }
        /** @return the value of the {@code uProperties} field. */
        @NativeType("VRComponentProperties")
        public int uProperties() { return RenderModelComponentState.nuProperties(address()); }

    }

}