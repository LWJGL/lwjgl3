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
 * Structure specifying the allocation parameters for command buffer object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
 * <li>{@code level} <b>must</b> be a valid {@code VkCommandBufferLevel} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkAllocateCommandBuffers AllocateCommandBuffers}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferAllocateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkCommandPool {@link #commandPool};
 *     VkCommandBufferLevel {@link #level};
 *     uint32_t {@link #commandBufferCount};
 * }</code></pre>
 */
public class VkCommandBufferAllocateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMMANDPOOL,
        LEVEL,
        COMMANDBUFFERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMMANDPOOL = layout.offsetof(2);
        LEVEL = layout.offsetof(3);
        COMMANDBUFFERCOUNT = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkCommandBufferAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferAllocateInfo(ByteBuffer container) {
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
    /** the command pool from which the command buffers are allocated. */
    @NativeType("VkCommandPool")
    public long commandPool() { return ncommandPool(address()); }
    /** a {@code VkCommandBufferLevel} value specifying the command buffer level. */
    @NativeType("VkCommandBufferLevel")
    public int level() { return nlevel(address()); }
    /** the number of command buffers to allocate from the pool. */
    @NativeType("uint32_t")
    public int commandBufferCount() { return ncommandBufferCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO} value to the {@link #sType} field. */
    public VkCommandBufferAllocateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #commandPool} field. */
    public VkCommandBufferAllocateInfo commandPool(@NativeType("VkCommandPool") long value) { ncommandPool(address(), value); return this; }
    /** Sets the specified value to the {@link #level} field. */
    public VkCommandBufferAllocateInfo level(@NativeType("VkCommandBufferLevel") int value) { nlevel(address(), value); return this; }
    /** Sets the specified value to the {@link #commandBufferCount} field. */
    public VkCommandBufferAllocateInfo commandBufferCount(@NativeType("uint32_t") int value) { ncommandBufferCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferAllocateInfo set(
        int sType,
        long pNext,
        long commandPool,
        int level,
        int commandBufferCount
    ) {
        sType(sType);
        pNext(pNext);
        commandPool(commandPool);
        level(level);
        commandBufferCount(commandBufferCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferAllocateInfo set(VkCommandBufferAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferAllocateInfo malloc() {
        return wrap(VkCommandBufferAllocateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferAllocateInfo calloc() {
        return wrap(VkCommandBufferAllocateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferAllocateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferAllocateInfo} instance for the specified memory address. */
    public static VkCommandBufferAllocateInfo create(long address) {
        return wrap(VkCommandBufferAllocateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferAllocateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferAllocateInfo.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferAllocateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCommandBufferAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferAllocateInfo malloc(MemoryStack stack) {
        return wrap(VkCommandBufferAllocateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferAllocateInfo calloc(MemoryStack stack) {
        return wrap(VkCommandBufferAllocateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #commandPool}. */
    public static long ncommandPool(long struct) { return UNSAFE.getLong(null, struct + VkCommandBufferAllocateInfo.COMMANDPOOL); }
    /** Unsafe version of {@link #level}. */
    public static int nlevel(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferAllocateInfo.LEVEL); }
    /** Unsafe version of {@link #commandBufferCount}. */
    public static int ncommandBufferCount(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferAllocateInfo.COMMANDBUFFERCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferAllocateInfo.PNEXT, value); }
    /** Unsafe version of {@link #commandPool(long) commandPool}. */
    public static void ncommandPool(long struct, long value) { UNSAFE.putLong(null, struct + VkCommandBufferAllocateInfo.COMMANDPOOL, value); }
    /** Unsafe version of {@link #level(int) level}. */
    public static void nlevel(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferAllocateInfo.LEVEL, value); }
    /** Unsafe version of {@link #commandBufferCount(int) commandBufferCount}. */
    public static void ncommandBufferCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferAllocateInfo.COMMANDBUFFERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferAllocateInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferAllocateInfo ELEMENT_FACTORY = VkCommandBufferAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferAllocateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferAllocateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferAllocateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferAllocateInfo.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferAllocateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferAllocateInfo.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferAllocateInfo#commandPool} field. */
        @NativeType("VkCommandPool")
        public long commandPool() { return VkCommandBufferAllocateInfo.ncommandPool(address()); }
        /** @return the value of the {@link VkCommandBufferAllocateInfo#level} field. */
        @NativeType("VkCommandBufferLevel")
        public int level() { return VkCommandBufferAllocateInfo.nlevel(address()); }
        /** @return the value of the {@link VkCommandBufferAllocateInfo#commandBufferCount} field. */
        @NativeType("uint32_t")
        public int commandBufferCount() { return VkCommandBufferAllocateInfo.ncommandBufferCount(address()); }

        /** Sets the specified value to the {@link VkCommandBufferAllocateInfo#sType} field. */
        public VkCommandBufferAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO} value to the {@link VkCommandBufferAllocateInfo#sType} field. */
        public VkCommandBufferAllocateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO); }
        /** Sets the specified value to the {@link VkCommandBufferAllocateInfo#pNext} field. */
        public VkCommandBufferAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferAllocateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferAllocateInfo#commandPool} field. */
        public VkCommandBufferAllocateInfo.Buffer commandPool(@NativeType("VkCommandPool") long value) { VkCommandBufferAllocateInfo.ncommandPool(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferAllocateInfo#level} field. */
        public VkCommandBufferAllocateInfo.Buffer level(@NativeType("VkCommandBufferLevel") int value) { VkCommandBufferAllocateInfo.nlevel(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferAllocateInfo#commandBufferCount} field. */
        public VkCommandBufferAllocateInfo.Buffer commandBufferCount(@NativeType("uint32_t") int value) { VkCommandBufferAllocateInfo.ncommandBufferCount(address(), value); return this; }

    }

}