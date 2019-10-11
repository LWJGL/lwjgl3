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
 * <li>All of the elements of {@code pSemaphores} <b>must</b> reference a semaphore that was created with a {@code VkSemaphoreTypeKHR} of {@link KHRTimelineSemaphore#VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRTimelineSemaphore#VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSemaphoreWaitFlagBitsKHR} values</li>
 * <li>{@code pSemaphores} <b>must</b> be a valid pointer to an array of {@code semaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>{@code pValues} <b>must</b> be a valid pointer to an array of {@code semaphoreCount} {@code uint64_t} values</li>
 * <li>{@code semaphoreCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRTimelineSemaphore#vkWaitSemaphoresKHR WaitSemaphoresKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkSemaphoreWaitFlagBitsKHR} specifying additional parameters for the semaphore wait operation.</li>
 * <li>{@code semaphoreCount} &ndash; the number of semaphores to wait on.</li>
 * <li>{@code pSemaphores} &ndash; a pointer to an array of {@code semaphoreCount} semaphore handles to wait on.</li>
 * <li>{@code pValues} &ndash; a pointer to an array of {@code semaphoreCount} timeline semaphore values.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreWaitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphoreWaitFlagsKHR flags;
 *     uint32_t semaphoreCount;
 *     VkSemaphore const * pSemaphores;
 *     uint64_t const * pValues;
 * }</code></pre>
 */
public class VkSemaphoreWaitInfoKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkSemaphoreWaitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreWaitInfoKHR(ByteBuffer container) {
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
    @NativeType("VkSemaphoreWaitFlagsKHR")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code semaphoreCount} field. */
    @NativeType("uint32_t")
    public int semaphoreCount() { return nsemaphoreCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSemaphores} field. */
    @NativeType("VkSemaphore const *")
    public LongBuffer pSemaphores() { return npSemaphores(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pValues} field. */
    @NativeType("uint64_t const *")
    public LongBuffer pValues() { return npValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSemaphoreWaitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSemaphoreWaitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkSemaphoreWaitInfoKHR flags(@NativeType("VkSemaphoreWaitFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code semaphoreCount} field. */
    public VkSemaphoreWaitInfoKHR semaphoreCount(@NativeType("uint32_t") int value) { nsemaphoreCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSemaphores} field. */
    public VkSemaphoreWaitInfoKHR pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) { npSemaphores(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pValues} field. */
    public VkSemaphoreWaitInfoKHR pValues(@NativeType("uint64_t const *") LongBuffer value) { npValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreWaitInfoKHR set(
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
    public VkSemaphoreWaitInfoKHR set(VkSemaphoreWaitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreWaitInfoKHR malloc() {
        return wrap(VkSemaphoreWaitInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreWaitInfoKHR calloc() {
        return wrap(VkSemaphoreWaitInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreWaitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreWaitInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreWaitInfoKHR create(long address) {
        return wrap(VkSemaphoreWaitInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreWaitInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreWaitInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreWaitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreWaitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSemaphoreWaitInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSemaphoreWaitInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreWaitInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkSemaphoreWaitInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreWaitInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkSemaphoreWaitInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreWaitInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreWaitInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreWaitInfoKHR.FLAGS); }
    /** Unsafe version of {@link #semaphoreCount}. */
    public static int nsemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreWaitInfoKHR.SEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSemaphores() pSemaphores}. */
    public static LongBuffer npSemaphores(long struct) { return memLongBuffer(memGetAddress(struct + VkSemaphoreWaitInfoKHR.PSEMAPHORES), nsemaphoreCount(struct)); }
    /** Unsafe version of {@link #pValues() pValues}. */
    public static LongBuffer npValues(long struct) { return memLongBuffer(memGetAddress(struct + VkSemaphoreWaitInfoKHR.PVALUES), nsemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreWaitInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreWaitInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreWaitInfoKHR.FLAGS, value); }
    /** Sets the specified value to the {@code semaphoreCount} field of the specified {@code struct}. */
    public static void nsemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreWaitInfoKHR.SEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pSemaphores(LongBuffer) pSemaphores}. */
    public static void npSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkSemaphoreWaitInfoKHR.PSEMAPHORES, memAddress(value)); }
    /** Unsafe version of {@link #pValues(LongBuffer) pValues}. */
    public static void npValues(long struct, LongBuffer value) { memPutAddress(struct + VkSemaphoreWaitInfoKHR.PVALUES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSemaphoreWaitInfoKHR.PSEMAPHORES));
        check(memGetAddress(struct + VkSemaphoreWaitInfoKHR.PVALUES));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkSemaphoreWaitInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreWaitInfoKHR, Buffer> implements NativeResource {

        private static final VkSemaphoreWaitInfoKHR ELEMENT_FACTORY = VkSemaphoreWaitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreWaitInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreWaitInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreWaitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreWaitInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreWaitInfoKHR.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkSemaphoreWaitFlagsKHR")
        public int flags() { return VkSemaphoreWaitInfoKHR.nflags(address()); }
        /** Returns the value of the {@code semaphoreCount} field. */
        @NativeType("uint32_t")
        public int semaphoreCount() { return VkSemaphoreWaitInfoKHR.nsemaphoreCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSemaphores} field. */
        @NativeType("VkSemaphore const *")
        public LongBuffer pSemaphores() { return VkSemaphoreWaitInfoKHR.npSemaphores(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pValues} field. */
        @NativeType("uint64_t const *")
        public LongBuffer pValues() { return VkSemaphoreWaitInfoKHR.npValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSemaphoreWaitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreWaitInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSemaphoreWaitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreWaitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkSemaphoreWaitInfoKHR.Buffer flags(@NativeType("VkSemaphoreWaitFlagsKHR") int value) { VkSemaphoreWaitInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code semaphoreCount} field. */
        public VkSemaphoreWaitInfoKHR.Buffer semaphoreCount(@NativeType("uint32_t") int value) { VkSemaphoreWaitInfoKHR.nsemaphoreCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSemaphores} field. */
        public VkSemaphoreWaitInfoKHR.Buffer pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) { VkSemaphoreWaitInfoKHR.npSemaphores(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pValues} field. */
        public VkSemaphoreWaitInfoKHR.Buffer pValues(@NativeType("uint64_t const *") LongBuffer value) { VkSemaphoreWaitInfoKHR.npValues(address(), value); return this; }

    }

}