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
 * Structure specifying depth clipping state.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDepthClipEnable#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRasterizationDepthClipStateCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineRasterizationDepthClipStateCreateFlagsEXT {@link #flags};
 *     VkBool32 {@link #depthClipEnable};
 * }</code></pre>
 */
public class VkPipelineRasterizationDepthClipStateCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DEPTHCLIPENABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEPTHCLIPENABLE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPipelineRasterizationDepthClipStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** controls whether depth clipping is enabled as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-clipping">Primitive Clipping</a>. */
    @NativeType("VkBool32")
    public boolean depthClipEnable() { return ndepthClipEnable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClipEnable#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sType$Default() { return sType(EXTDepthClipEnable.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT flags(@NativeType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #depthClipEnable} field. */
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT depthClipEnable(@NativeType("VkBool32") boolean value) { ndepthClipEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        boolean depthClipEnable
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        depthClipEnable(depthClipEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT set(VkPipelineRasterizationDepthClipStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationDepthClipStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT malloc() {
        return wrap(VkPipelineRasterizationDepthClipStateCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationDepthClipStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT calloc() {
        return wrap(VkPipelineRasterizationDepthClipStateCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationDepthClipStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRasterizationDepthClipStateCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationDepthClipStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT create(long address) {
        return wrap(VkPipelineRasterizationDepthClipStateCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRasterizationDepthClipStateCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationDepthClipStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationDepthClipStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationDepthClipStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationDepthClipStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineRasterizationDepthClipStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationDepthClipStateCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRasterizationDepthClipStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationDepthClipStateCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationDepthClipStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationDepthClipStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationDepthClipStateCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #depthClipEnable}. */
    public static int ndepthClipEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationDepthClipStateCreateInfoEXT.DEPTHCLIPENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationDepthClipStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationDepthClipStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationDepthClipStateCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #depthClipEnable(boolean) depthClipEnable}. */
    public static void ndepthClipEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationDepthClipStateCreateInfoEXT.DEPTHCLIPENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationDepthClipStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationDepthClipStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationDepthClipStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRasterizationDepthClipStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#flags} field. */
        @NativeType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT")
        public int flags() { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#depthClipEnable} field. */
        @NativeType("VkBool32")
        public boolean depthClipEnable() { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.ndepthClipEnable(address()) != 0; }

        /** Sets the specified value to the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClipEnable#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT} value to the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTDepthClipEnable.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#pNext} field. */
        public VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#flags} field. */
        public VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer flags(@NativeType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT#depthClipEnable} field. */
        public VkPipelineRasterizationDepthClipStateCreateInfoEXT.Buffer depthClipEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.ndepthClipEnable(address(), value ? 1 : 0); return this; }

    }

}