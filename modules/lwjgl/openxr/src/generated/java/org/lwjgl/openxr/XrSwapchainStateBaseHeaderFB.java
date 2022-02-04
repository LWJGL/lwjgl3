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
 * Base header for swapchain update state.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSwapchainStateBaseHeaderFB} is a base structure that can be overridden by a specific stext:XrSwapchainState* child structure.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSwapchainUpdateState XR_FB_swapchain_update_state} extension <b>must</b> be enabled prior to using {@link XrSwapchainStateBaseHeaderFB}</li>
 * <li>{@code type} <b>must</b> be one of the following XrStructureType values: {@link FBFoveation#XR_TYPE_SWAPCHAIN_STATE_FOVEATION_FB TYPE_SWAPCHAIN_STATE_FOVEATION_FB}, {@link FBSwapchainUpdateStateOpenGLES#XR_TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB}, {@link FBSwapchainUpdateStateVulkan#XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBSwapchainUpdateState#xrGetSwapchainStateFB GetSwapchainStateFB}, {@link FBSwapchainUpdateState#xrUpdateSwapchainFB UpdateSwapchainFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainStateBaseHeaderFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 * }</code></pre>
 */
public class XrSwapchainStateBaseHeaderFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSwapchainStateBaseHeaderFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainStateBaseHeaderFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainStateBaseHeaderFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainStateBaseHeaderFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainStateBaseHeaderFB set(
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
    public XrSwapchainStateBaseHeaderFB set(XrSwapchainStateBaseHeaderFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainStateBaseHeaderFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainStateBaseHeaderFB malloc() {
        return wrap(XrSwapchainStateBaseHeaderFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainStateBaseHeaderFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainStateBaseHeaderFB calloc() {
        return wrap(XrSwapchainStateBaseHeaderFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainStateBaseHeaderFB} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainStateBaseHeaderFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainStateBaseHeaderFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainStateBaseHeaderFB} instance for the specified memory address. */
    public static XrSwapchainStateBaseHeaderFB create(long address) {
        return wrap(XrSwapchainStateBaseHeaderFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainStateBaseHeaderFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainStateBaseHeaderFB.class, address);
    }

    /** Upcasts the specified {@code XrSwapchainStateFoveationFB} instance to {@code XrSwapchainStateBaseHeaderFB}. */
    public static XrSwapchainStateBaseHeaderFB create(XrSwapchainStateFoveationFB value) {
        return wrap(XrSwapchainStateBaseHeaderFB.class, value);
    }

    /** Upcasts the specified {@code XrSwapchainStateSamplerOpenGLESFB} instance to {@code XrSwapchainStateBaseHeaderFB}. */
    public static XrSwapchainStateBaseHeaderFB create(XrSwapchainStateSamplerOpenGLESFB value) {
        return wrap(XrSwapchainStateBaseHeaderFB.class, value);
    }

    /** Upcasts the specified {@code XrSwapchainStateSamplerVulkanFB} instance to {@code XrSwapchainStateBaseHeaderFB}. */
    public static XrSwapchainStateBaseHeaderFB create(XrSwapchainStateSamplerVulkanFB value) {
        return wrap(XrSwapchainStateBaseHeaderFB.class, value);
    }

    /**
     * Returns a new {@link XrSwapchainStateBaseHeaderFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateBaseHeaderFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateBaseHeaderFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateBaseHeaderFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateBaseHeaderFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateBaseHeaderFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainStateBaseHeaderFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateBaseHeaderFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainStateBaseHeaderFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Upcasts the specified {@code XrSwapchainStateFoveationFB.Buffer} instance to {@code XrSwapchainStateBaseHeaderFB.Buffer}. */
    public static XrSwapchainStateBaseHeaderFB.Buffer create(XrSwapchainStateFoveationFB.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrSwapchainStateSamplerOpenGLESFB.Buffer} instance to {@code XrSwapchainStateBaseHeaderFB.Buffer}. */
    public static XrSwapchainStateBaseHeaderFB.Buffer create(XrSwapchainStateSamplerOpenGLESFB.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrSwapchainStateSamplerVulkanFB.Buffer} instance to {@code XrSwapchainStateBaseHeaderFB.Buffer}. */
    public static XrSwapchainStateBaseHeaderFB.Buffer create(XrSwapchainStateSamplerVulkanFB.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrSwapchainStateBaseHeaderFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainStateBaseHeaderFB malloc(MemoryStack stack) {
        return wrap(XrSwapchainStateBaseHeaderFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainStateBaseHeaderFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainStateBaseHeaderFB calloc(MemoryStack stack) {
        return wrap(XrSwapchainStateBaseHeaderFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainStateBaseHeaderFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateBaseHeaderFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateBaseHeaderFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateBaseHeaderFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainStateBaseHeaderFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainStateBaseHeaderFB.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainStateBaseHeaderFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainStateBaseHeaderFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainStateBaseHeaderFB} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainStateBaseHeaderFB, Buffer> implements NativeResource {

        private static final XrSwapchainStateBaseHeaderFB ELEMENT_FACTORY = XrSwapchainStateBaseHeaderFB.create(-1L);

        /**
         * Creates a new {@code XrSwapchainStateBaseHeaderFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainStateBaseHeaderFB#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainStateBaseHeaderFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainStateBaseHeaderFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainStateBaseHeaderFB.ntype(address()); }
        /** @return the value of the {@link XrSwapchainStateBaseHeaderFB#next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainStateBaseHeaderFB.nnext(address()); }

        /** Sets the specified value to the {@link XrSwapchainStateBaseHeaderFB#type} field. */
        public XrSwapchainStateBaseHeaderFB.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainStateBaseHeaderFB.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainStateBaseHeaderFB#next} field. */
        public XrSwapchainStateBaseHeaderFB.Buffer next(@NativeType("void *") long value) { XrSwapchainStateBaseHeaderFB.nnext(address(), value); return this; }

    }

}