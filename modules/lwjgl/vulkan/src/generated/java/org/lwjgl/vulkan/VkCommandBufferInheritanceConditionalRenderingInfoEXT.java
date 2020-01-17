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
 * Structure specifying command buffer inheritance info.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, the behavior is as if {@code conditionalRenderingEnable} is {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-inheritedConditionalRendering">inherited conditional rendering</a> feature is not enabled, {@code conditionalRenderingEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure</li>
 * <li>{@code conditionalRenderingEnable} &ndash; specifies whether the command buffer <b>can</b> be executed while conditional rendering is active in the primary command buffer. If this is {@link VK10#VK_TRUE TRUE}, then this command buffer <b>can</b> be executed whether the primary command buffer has active conditional rendering or not. If this is {@link VK10#VK_FALSE FALSE}, then the primary command buffer <b>must</b> not have conditional rendering active.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferInheritanceConditionalRenderingInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 conditionalRenderingEnable;
 * }</code></pre>
 */
public class VkCommandBufferInheritanceConditionalRenderingInfoEXT extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code conditionalRenderingEnable} field. */
    @NativeType("VkBool32")
    public boolean conditionalRenderingEnable() { return nconditionalRenderingEnable(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code conditionalRenderingEnable} field. */
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
        return wrap(VkCommandBufferInheritanceConditionalRenderingInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT calloc() {
        return wrap(VkCommandBufferInheritanceConditionalRenderingInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferInheritanceConditionalRenderingInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance for the specified memory address. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT create(long address) {
        return wrap(VkCommandBufferInheritanceConditionalRenderingInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferInheritanceConditionalRenderingInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceConditionalRenderingInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceConditionalRenderingInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceConditionalRenderingInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceConditionalRenderingInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceConditionalRenderingInfoEXT.npNext(address()); }
        /** Returns the value of the {@code conditionalRenderingEnable} field. */
        @NativeType("VkBool32")
        public boolean conditionalRenderingEnable() { return VkCommandBufferInheritanceConditionalRenderingInfoEXT.nconditionalRenderingEnable(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceConditionalRenderingInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceConditionalRenderingInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code conditionalRenderingEnable} field. */
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT.Buffer conditionalRenderingEnable(@NativeType("VkBool32") boolean value) { VkCommandBufferInheritanceConditionalRenderingInfoEXT.nconditionalRenderingEnable(address(), value ? 1 : 0); return this; }

    }

}