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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure containing information about the semaphore wait condition.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>All of the elements of {@code pSemaphores} <b>must</b> reference a semaphore that was created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSemaphoreWaitFlagBits} values</li>
 * <li>{@code pSemaphores} <b>must</b> be a valid pointer to an array of {@code semaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>{@code pValues} <b>must</b> be a valid pointer to an array of {@code semaphoreCount} {@code uint64_t} values</li>
 * <li>{@code semaphoreCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK12#vkWaitSemaphores WaitSemaphores}, {@link KHRTimelineSemaphore#vkWaitSemaphoresKHR WaitSemaphoresKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreWaitInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphoreWaitFlags {@link #flags};
 *     uint32_t {@link #semaphoreCount};
 *     VkSemaphore const * {@link #pSemaphores};
 *     uint64_t const * {@link #pValues};
 * }</code></pre>
 */
public class VkSemaphoreWaitInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SEMAPHORECOUNT,
        PSEMAPHORES,
        PVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SEMAPHORECOUNT = layout.offsetof(3);
        PSEMAPHORES = layout.offsetof(4);
        PVALUES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkSemaphoreWaitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreWaitInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkSemaphoreWaitFlagBits} specifying additional parameters for the semaphore wait operation. */
    @NativeType("VkSemaphoreWaitFlags")
    public int flags() { return nflags(address()); }
    /** the number of semaphores to wait on. */
    @NativeType("uint32_t")
    public int semaphoreCount() { return nsemaphoreCount(address()); }
    /** a pointer to an array of {@code semaphoreCount} semaphore handles to wait on. */
    @NativeType("VkSemaphore const *")
    public LongBuffer pSemaphores() { return npSemaphores(address()); }
    /** a pointer to an array of {@code semaphoreCount} timeline semaphore values. */
    @NativeType("uint64_t const *")
    public LongBuffer pValues() { return npValues(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSemaphoreWaitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO} value to the {@link #sType} field. */
    public VkSemaphoreWaitInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSemaphoreWaitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkSemaphoreWaitInfo flags(@NativeType("VkSemaphoreWaitFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphoreCount} field. */
    public VkSemaphoreWaitInfo semaphoreCount(@NativeType("uint32_t") int value) { nsemaphoreCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pSemaphores} field. */
    public VkSemaphoreWaitInfo pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) { npSemaphores(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pValues} field. */
    public VkSemaphoreWaitInfo pValues(@NativeType("uint64_t const *") LongBuffer value) { npValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreWaitInfo set(
        int sType,
        long pNext,
        int flags,
        int semaphoreCount,
        LongBuffer pSemaphores,
        LongBuffer pValues
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        semaphoreCount(semaphoreCount);
        pSemaphores(pSemaphores);
        pValues(pValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreWaitInfo set(VkSemaphoreWaitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreWaitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreWaitInfo malloc() {
        return wrap(VkSemaphoreWaitInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreWaitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreWaitInfo calloc() {
        return wrap(VkSemaphoreWaitInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreWaitInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreWaitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreWaitInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreWaitInfo} instance for the specified memory address. */
    public static VkSemaphoreWaitInfo create(long address) {
        return wrap(VkSemaphoreWaitInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreWaitInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreWaitInfo.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreWaitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreWaitInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreWaitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreWaitInfo malloc(MemoryStack stack) {
        return wrap(VkSemaphoreWaitInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreWaitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreWaitInfo calloc(MemoryStack stack) {
        return wrap(VkSemaphoreWaitInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreWaitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreWaitInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreWaitInfo.FLAGS); }
    /** Unsafe version of {@link #semaphoreCount}. */
    public static int nsemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreWaitInfo.SEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSemaphores() pSemaphores}. */
    public static LongBuffer npSemaphores(long struct) { return memLongBuffer(memGetAddress(struct + VkSemaphoreWaitInfo.PSEMAPHORES), nsemaphoreCount(struct)); }
    /** Unsafe version of {@link #pValues() pValues}. */
    public static LongBuffer npValues(long struct) { return memLongBuffer(memGetAddress(struct + VkSemaphoreWaitInfo.PVALUES), nsemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreWaitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreWaitInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreWaitInfo.FLAGS, value); }
    /** Sets the specified value to the {@code semaphoreCount} field of the specified {@code struct}. */
    public static void nsemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreWaitInfo.SEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pSemaphores(LongBuffer) pSemaphores}. */
    public static void npSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkSemaphoreWaitInfo.PSEMAPHORES, memAddress(value)); }
    /** Unsafe version of {@link #pValues(LongBuffer) pValues}. */
    public static void npValues(long struct, LongBuffer value) { memPutAddress(struct + VkSemaphoreWaitInfo.PVALUES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSemaphoreWaitInfo.PSEMAPHORES));
        check(memGetAddress(struct + VkSemaphoreWaitInfo.PVALUES));
    }

    // -----------------------------------

    /** An array of {@link VkSemaphoreWaitInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreWaitInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreWaitInfo ELEMENT_FACTORY = VkSemaphoreWaitInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreWaitInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreWaitInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreWaitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSemaphoreWaitInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreWaitInfo.nsType(address()); }
        /** @return the value of the {@link VkSemaphoreWaitInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreWaitInfo.npNext(address()); }
        /** @return the value of the {@link VkSemaphoreWaitInfo#flags} field. */
        @NativeType("VkSemaphoreWaitFlags")
        public int flags() { return VkSemaphoreWaitInfo.nflags(address()); }
        /** @return the value of the {@link VkSemaphoreWaitInfo#semaphoreCount} field. */
        @NativeType("uint32_t")
        public int semaphoreCount() { return VkSemaphoreWaitInfo.nsemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkSemaphoreWaitInfo#pSemaphores} field. */
        @NativeType("VkSemaphore const *")
        public LongBuffer pSemaphores() { return VkSemaphoreWaitInfo.npSemaphores(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkSemaphoreWaitInfo#pValues} field. */
        @NativeType("uint64_t const *")
        public LongBuffer pValues() { return VkSemaphoreWaitInfo.npValues(address()); }

        /** Sets the specified value to the {@link VkSemaphoreWaitInfo#sType} field. */
        public VkSemaphoreWaitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreWaitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO} value to the {@link VkSemaphoreWaitInfo#sType} field. */
        public VkSemaphoreWaitInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO); }
        /** Sets the specified value to the {@link VkSemaphoreWaitInfo#pNext} field. */
        public VkSemaphoreWaitInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreWaitInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreWaitInfo#flags} field. */
        public VkSemaphoreWaitInfo.Buffer flags(@NativeType("VkSemaphoreWaitFlags") int value) { VkSemaphoreWaitInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreWaitInfo#semaphoreCount} field. */
        public VkSemaphoreWaitInfo.Buffer semaphoreCount(@NativeType("uint32_t") int value) { VkSemaphoreWaitInfo.nsemaphoreCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkSemaphoreWaitInfo#pSemaphores} field. */
        public VkSemaphoreWaitInfo.Buffer pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) { VkSemaphoreWaitInfo.npSemaphores(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkSemaphoreWaitInfo#pValues} field. */
        public VkSemaphoreWaitInfo.Buffer pValues(@NativeType("uint64_t const *") LongBuffer value) { VkSemaphoreWaitInfo.npValues(address(), value); return this; }

    }

}