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
 * Structure containing information about a semaphore signal operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code semaphore} <b>must</b> have been created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE}</li>
 * <li>{@code value} <b>must</b> have a value greater than the current value of the semaphore</li>
 * <li>{@code value} <b>must</b> be less than the value of any pending semaphore signal operations</li>
 * <li>{@code value} <b>must</b> have a value which does not differ from the current value of the semaphore or the value of any outstanding semaphore wait or signal operation on {@code semaphore} by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK12#vkSignalSemaphore SignalSemaphore}, {@link KHRTimelineSemaphore#vkSignalSemaphoreKHR SignalSemaphoreKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreSignalInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphore {@link #semaphore};
 *     uint64_t {@link #value};
 * }</code></pre>
 */
public class VkSemaphoreSignalInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORE,
        VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        VALUE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkSemaphoreSignalInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreSignalInfo(ByteBuffer container) {
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
    /** the handle of the semaphore to signal. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** the value to signal. */
    @NativeType("uint64_t")
    public long value() { return nvalue(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSemaphoreSignalInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO} value to the {@link #sType} field. */
    public VkSemaphoreSignalInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSemaphoreSignalInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphore} field. */
    public VkSemaphoreSignalInfo semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@link #value} field. */
    public VkSemaphoreSignalInfo value(@NativeType("uint64_t") long value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreSignalInfo set(
        int sType,
        long pNext,
        long semaphore,
        long value
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreSignalInfo set(VkSemaphoreSignalInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreSignalInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSignalInfo malloc() {
        return wrap(VkSemaphoreSignalInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreSignalInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSignalInfo calloc() {
        return wrap(VkSemaphoreSignalInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreSignalInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreSignalInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreSignalInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreSignalInfo} instance for the specified memory address. */
    public static VkSemaphoreSignalInfo create(long address) {
        return wrap(VkSemaphoreSignalInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSignalInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreSignalInfo.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreSignalInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSignalInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreSignalInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSignalInfo malloc(MemoryStack stack) {
        return wrap(VkSemaphoreSignalInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreSignalInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSignalInfo calloc(MemoryStack stack) {
        return wrap(VkSemaphoreSignalInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreSignalInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreSignalInfo.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreSignalInfo.SEMAPHORE); }
    /** Unsafe version of {@link #value}. */
    public static long nvalue(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreSignalInfo.VALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreSignalInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreSignalInfo.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreSignalInfo.SEMAPHORE, value); }
    /** Unsafe version of {@link #value(long) value}. */
    public static void nvalue(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreSignalInfo.VALUE, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreSignalInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreSignalInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreSignalInfo ELEMENT_FACTORY = VkSemaphoreSignalInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreSignalInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreSignalInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreSignalInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSemaphoreSignalInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreSignalInfo.nsType(address()); }
        /** @return the value of the {@link VkSemaphoreSignalInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreSignalInfo.npNext(address()); }
        /** @return the value of the {@link VkSemaphoreSignalInfo#semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkSemaphoreSignalInfo.nsemaphore(address()); }
        /** @return the value of the {@link VkSemaphoreSignalInfo#value} field. */
        @NativeType("uint64_t")
        public long value() { return VkSemaphoreSignalInfo.nvalue(address()); }

        /** Sets the specified value to the {@link VkSemaphoreSignalInfo#sType} field. */
        public VkSemaphoreSignalInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreSignalInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO} value to the {@link VkSemaphoreSignalInfo#sType} field. */
        public VkSemaphoreSignalInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO); }
        /** Sets the specified value to the {@link VkSemaphoreSignalInfo#pNext} field. */
        public VkSemaphoreSignalInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreSignalInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreSignalInfo#semaphore} field. */
        public VkSemaphoreSignalInfo.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreSignalInfo.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreSignalInfo#value} field. */
        public VkSemaphoreSignalInfo.Buffer value(@NativeType("uint64_t") long value) { VkSemaphoreSignalInfo.nvalue(address(), value); return this; }

    }

}