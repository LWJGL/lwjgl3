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
 * Structure specifying the type of a newly created semaphore.
 * 
 * <h5>Description</h5>
 * 
 * <p>To create a semaphore of a specific type, add a {@link VkSemaphoreTypeCreateInfo} structure to the {@link VkSemaphoreCreateInfo}{@code ::pNext} chain.</p>
 * 
 * <p>If no {@link VkSemaphoreTypeCreateInfo} structure is included in the {@code pNext} chain of {@link VkSemaphoreCreateInfo}, then the created semaphore will have a default {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_BINARY SEMAPHORE_TYPE_BINARY}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-timelineSemaphore">{@code timelineSemaphore}</a> feature is not enabled, {@code semaphoreType} <b>must</b> not equal {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE}</li>
 * <li>If {@code semaphoreType} is {@link VK12#VK_SEMAPHORE_TYPE_BINARY SEMAPHORE_TYPE_BINARY}, {@code initialValue} <b>must</b> be zero</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO}</li>
 * <li>{@code semaphoreType} <b>must</b> be a valid {@code VkSemaphoreType} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreTypeCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphoreType {@link #semaphoreType};
 *     uint64_t {@link #initialValue};
 * }</code></pre>
 */
public class VkSemaphoreTypeCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORETYPE,
        INITIALVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORETYPE = layout.offsetof(2);
        INITIALVALUE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkSemaphoreTypeCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreTypeCreateInfo(ByteBuffer container) {
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
    /** a {@code VkSemaphoreType} value specifying the type of the semaphore. */
    @NativeType("VkSemaphoreType")
    public int semaphoreType() { return nsemaphoreType(address()); }
    /** the initial payload value if {@code semaphoreType} is {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE}. */
    @NativeType("uint64_t")
    public long initialValue() { return ninitialValue(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSemaphoreTypeCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO} value to the {@link #sType} field. */
    public VkSemaphoreTypeCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSemaphoreTypeCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphoreType} field. */
    public VkSemaphoreTypeCreateInfo semaphoreType(@NativeType("VkSemaphoreType") int value) { nsemaphoreType(address(), value); return this; }
    /** Sets the specified value to the {@link #initialValue} field. */
    public VkSemaphoreTypeCreateInfo initialValue(@NativeType("uint64_t") long value) { ninitialValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreTypeCreateInfo set(
        int sType,
        long pNext,
        int semaphoreType,
        long initialValue
    ) {
        sType(sType);
        pNext(pNext);
        semaphoreType(semaphoreType);
        initialValue(initialValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreTypeCreateInfo set(VkSemaphoreTypeCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreTypeCreateInfo malloc() {
        return wrap(VkSemaphoreTypeCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreTypeCreateInfo calloc() {
        return wrap(VkSemaphoreTypeCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreTypeCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreTypeCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfo} instance for the specified memory address. */
    public static VkSemaphoreTypeCreateInfo create(long address) {
        return wrap(VkSemaphoreTypeCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreTypeCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreTypeCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreTypeCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreTypeCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreTypeCreateInfo malloc(MemoryStack stack) {
        return wrap(VkSemaphoreTypeCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreTypeCreateInfo calloc(MemoryStack stack) {
        return wrap(VkSemaphoreTypeCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreTypeCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreTypeCreateInfo.PNEXT); }
    /** Unsafe version of {@link #semaphoreType}. */
    public static int nsemaphoreType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreTypeCreateInfo.SEMAPHORETYPE); }
    /** Unsafe version of {@link #initialValue}. */
    public static long ninitialValue(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreTypeCreateInfo.INITIALVALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreTypeCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreTypeCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #semaphoreType(int) semaphoreType}. */
    public static void nsemaphoreType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreTypeCreateInfo.SEMAPHORETYPE, value); }
    /** Unsafe version of {@link #initialValue(long) initialValue}. */
    public static void ninitialValue(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreTypeCreateInfo.INITIALVALUE, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreTypeCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreTypeCreateInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreTypeCreateInfo ELEMENT_FACTORY = VkSemaphoreTypeCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreTypeCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreTypeCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreTypeCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSemaphoreTypeCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreTypeCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkSemaphoreTypeCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreTypeCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkSemaphoreTypeCreateInfo#semaphoreType} field. */
        @NativeType("VkSemaphoreType")
        public int semaphoreType() { return VkSemaphoreTypeCreateInfo.nsemaphoreType(address()); }
        /** @return the value of the {@link VkSemaphoreTypeCreateInfo#initialValue} field. */
        @NativeType("uint64_t")
        public long initialValue() { return VkSemaphoreTypeCreateInfo.ninitialValue(address()); }

        /** Sets the specified value to the {@link VkSemaphoreTypeCreateInfo#sType} field. */
        public VkSemaphoreTypeCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreTypeCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO} value to the {@link VkSemaphoreTypeCreateInfo#sType} field. */
        public VkSemaphoreTypeCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkSemaphoreTypeCreateInfo#pNext} field. */
        public VkSemaphoreTypeCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreTypeCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreTypeCreateInfo#semaphoreType} field. */
        public VkSemaphoreTypeCreateInfo.Buffer semaphoreType(@NativeType("VkSemaphoreType") int value) { VkSemaphoreTypeCreateInfo.nsemaphoreType(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreTypeCreateInfo#initialValue} field. */
        public VkSemaphoreTypeCreateInfo.Buffer initialValue(@NativeType("uint64_t") long value) { VkSemaphoreTypeCreateInfo.ninitialValue(address(), value); return this; }

    }

}