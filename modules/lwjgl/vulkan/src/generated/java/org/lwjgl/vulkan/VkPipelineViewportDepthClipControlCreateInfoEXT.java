/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created pipeline depth clip control state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipControl">depthClipControl</a> is not enabled, {@code negativeOneToOne} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDepthClipControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineViewportDepthClipControlCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #negativeOneToOne};
 * }</code></pre>
 */
public class VkPipelineViewportDepthClipControlCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NEGATIVEONETOONE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NEGATIVEONETOONE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportDepthClipControlCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** sets the <code>z<sub>m</sub></code> in the <em>view volume</em> to <code>-w<sub>c</sub></code> */
    @NativeType("VkBool32")
    public boolean negativeOneToOne() { return nnegativeOneToOne(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClipControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT sType$Default() { return sType(EXTDepthClipControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #negativeOneToOne} field. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT negativeOneToOne(@NativeType("VkBool32") boolean value) { nnegativeOneToOne(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT set(
        int sType,
        long pNext,
        boolean negativeOneToOne
    ) {
        sType(sType);
        pNext(pNext);
        negativeOneToOne(negativeOneToOne);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportDepthClipControlCreateInfoEXT set(VkPipelineViewportDepthClipControlCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT malloc() {
        return wrap(VkPipelineViewportDepthClipControlCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT calloc() {
        return wrap(VkPipelineViewportDepthClipControlCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineViewportDepthClipControlCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT create(long address) {
        return wrap(VkPipelineViewportDepthClipControlCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportDepthClipControlCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineViewportDepthClipControlCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineViewportDepthClipControlCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineViewportDepthClipControlCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportDepthClipControlCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportDepthClipControlCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #negativeOneToOne}. */
    public static int nnegativeOneToOne(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportDepthClipControlCreateInfoEXT.NEGATIVEONETOONE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportDepthClipControlCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportDepthClipControlCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #negativeOneToOne(boolean) negativeOneToOne}. */
    public static void nnegativeOneToOne(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportDepthClipControlCreateInfoEXT.NEGATIVEONETOONE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportDepthClipControlCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportDepthClipControlCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineViewportDepthClipControlCreateInfoEXT ELEMENT_FACTORY = VkPipelineViewportDepthClipControlCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportDepthClipControlCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineViewportDepthClipControlCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineViewportDepthClipControlCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportDepthClipControlCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineViewportDepthClipControlCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportDepthClipControlCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineViewportDepthClipControlCreateInfoEXT#negativeOneToOne} field. */
        @NativeType("VkBool32")
        public boolean negativeOneToOne() { return VkPipelineViewportDepthClipControlCreateInfoEXT.nnegativeOneToOne(address()) != 0; }

        /** Sets the specified value to the {@link VkPipelineViewportDepthClipControlCreateInfoEXT#sType} field. */
        public VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportDepthClipControlCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClipControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT} value to the {@link VkPipelineViewportDepthClipControlCreateInfoEXT#sType} field. */
        public VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer sType$Default() { return sType(EXTDepthClipControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineViewportDepthClipControlCreateInfoEXT#pNext} field. */
        public VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportDepthClipControlCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineViewportDepthClipControlCreateInfoEXT#negativeOneToOne} field. */
        public VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer negativeOneToOne(@NativeType("VkBool32") boolean value) { VkPipelineViewportDepthClipControlCreateInfoEXT.nnegativeOneToOne(address(), value ? 1 : 0); return this; }

    }

}