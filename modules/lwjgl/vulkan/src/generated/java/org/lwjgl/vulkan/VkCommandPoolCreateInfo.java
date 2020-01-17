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
 * Structure specifying parameters of a newly created command pool.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandPoolCreateFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateCommandPool CreateCommandPool}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkCommandPoolCreateFlagBits} indicating usage behavior for the pool and command buffers allocated from it.</li>
 * <li>{@code queueFamilyIndex} &ndash; designates a queue family as described in section <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-queueprops">Queue Family Properties</a>. All command buffers allocated from this command pool <b>must</b> be submitted on queues from the same queue family.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandPoolCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCommandPoolCreateFlags flags;
 *     uint32_t queueFamilyIndex;
 * }</code></pre>
 */
public class VkCommandPoolCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        QUEUEFAMILYINDEX;

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
        QUEUEFAMILYINDEX = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkCommandPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandPoolCreateInfo(ByteBuffer container) {
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
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkCommandPoolCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code queueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandPoolCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandPoolCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkCommandPoolCreateInfo flags(@NativeType("VkCommandPoolCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndex} field. */
    public VkCommandPoolCreateInfo queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandPoolCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int queueFamilyIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queueFamilyIndex(queueFamilyIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandPoolCreateInfo set(VkCommandPoolCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandPoolCreateInfo malloc() {
        return wrap(VkCommandPoolCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandPoolCreateInfo calloc() {
        return wrap(VkCommandPoolCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandPoolCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandPoolCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandPoolCreateInfo} instance for the specified memory address. */
    public static VkCommandPoolCreateInfo create(long address) {
        return wrap(VkCommandPoolCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandPoolCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandPoolCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandPoolCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandPoolCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkCommandPoolCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkCommandPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkCommandPoolCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkCommandPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandPoolCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkCommandPoolCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandPoolCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkCommandPoolCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandPoolCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandPoolCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkCommandPoolCreateInfo.FLAGS); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkCommandPoolCreateInfo.QUEUEFAMILYINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandPoolCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandPoolCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandPoolCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandPoolCreateInfo.QUEUEFAMILYINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkCommandPoolCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandPoolCreateInfo, Buffer> implements NativeResource {

        private static final VkCommandPoolCreateInfo ELEMENT_FACTORY = VkCommandPoolCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandPoolCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandPoolCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandPoolCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkCommandPoolCreateFlags")
        public int flags() { return VkCommandPoolCreateInfo.nflags(address()); }
        /** Returns the value of the {@code queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkCommandPoolCreateInfo.nqueueFamilyIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandPoolCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandPoolCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandPoolCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandPoolCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkCommandPoolCreateInfo.Buffer flags(@NativeType("VkCommandPoolCreateFlags") int value) { VkCommandPoolCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndex} field. */
        public VkCommandPoolCreateInfo.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkCommandPoolCreateInfo.nqueueFamilyIndex(address(), value); return this; }

    }

}