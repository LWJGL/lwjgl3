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
 * Structure specifying command buffer inheritance information.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, the behavior is as if {@code conditionalRenderingEnable} is {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-inheritedConditionalRendering">{@code inheritedConditionalRendering}</a> feature is not enabled, {@code conditionalRenderingEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferInheritanceConditionalRenderingInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #conditionalRenderingEnable};
 * }</code></pre>
 */
public class VkCommandBufferInheritanceConditionalRenderingInfoEXT extends Struct<VkCommandBufferInheritanceConditionalRenderingInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONDITIONALRENDERINGENABLE;

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
        CONDITIONALRENDERINGENABLE = layout.offsetof(2);
    }

    protected VkCommandBufferInheritanceConditionalRenderingInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferInheritanceConditionalRenderingInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** specifies whether the command buffer <b>can</b> be executed while conditional rendering is active in the primary command buffer. If this is {@link VK10#VK_TRUE TRUE}, then this command buffer <b>can</b> be executed whether the primary command buffer has active conditional rendering or not. If this is {@link VK10#VK_FALSE FALSE}, then the primary command buffer <b>must</b> not have conditional rendering active. */
    @NativeType("VkBool32")
    public boolean conditionalRenderingEnable() { return nconditionalRenderingEnable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT} value to the {@link #sType} field. */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sType$Default() { return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #conditionalRenderingEnable} field. */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT conditionalRenderingEnable(@NativeType("VkBool32") boolean value) { nconditionalRenderingEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT set(
        int sType,
        long pNext,
        boolean conditionalRenderingEnable
    ) {
        sType(sType);
        pNext(pNext);
        conditionalRenderingEnable(conditionalRenderingEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT set(VkCommandBufferInheritanceConditionalRenderingInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT malloc() {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT calloc() {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance for the specified memory address. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT create(long address) {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferInheritanceConditionalRenderingInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceConditionalRenderingInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceConditionalRenderingInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceConditionalRenderingInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceConditionalRenderingInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceConditionalRenderingInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceConditionalRenderingInfoEXT.PNEXT); }
    /** Unsafe version of {@link #conditionalRenderingEnable}. */
    public static int nconditionalRenderingEnable(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceConditionalRenderingInfoEXT.CONDITIONALRENDERINGENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceConditionalRenderingInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceConditionalRenderingInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #conditionalRenderingEnable(boolean) conditionalRenderingEnable}. */
    public static void nconditionalRenderingEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceConditionalRenderingInfoEXT.CONDITIONALRENDERINGENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceConditionalRenderingInfoEXT, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceConditionalRenderingInfoEXT ELEMENT_FACTORY = VkCommandBufferInheritanceConditionalRenderingInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandBufferInheritanceConditionalRenderingInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceConditionalRenderingInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceConditionalRenderingInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#conditionalRenderingEnable} field. */
        @NativeType("VkBool32")
        public boolean conditionalRenderingEnable() { return VkCommandBufferInheritanceConditionalRenderingInfoEXT.nconditionalRenderingEnable(address()) != 0; }

        /** Sets the specified value to the {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#sType} field. */
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceConditionalRenderingInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT} value to the {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#sType} field. */
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer sType$Default() { return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT); }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#pNext} field. */
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceConditionalRenderingInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#conditionalRenderingEnable} field. */
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer conditionalRenderingEnable(@NativeType("VkBool32") boolean value) { VkCommandBufferInheritanceConditionalRenderingInfoEXT.nconditionalRenderingEnable(address(), value ? 1 : 0); return this; }

    }

}