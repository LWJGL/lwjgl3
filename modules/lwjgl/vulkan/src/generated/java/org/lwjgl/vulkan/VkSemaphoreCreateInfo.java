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
 * Structure specifying parameters of a newly created semaphore.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkExportSemaphoreCreateInfo}, {@link VkExportSemaphoreWin32HandleInfoKHR}, or {@link VkSemaphoreTypeCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateSemaphore CreateSemaphore}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphoreCreateFlags {@link #flags};
 * }</code></pre>
 */
public class VkSemaphoreCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

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
        FLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSemaphoreCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreCreateInfo(ByteBuffer container) {
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
    @NativeType("VkSemaphoreCreateFlags")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSemaphoreCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO} value to the {@link #sType} field. */
    public VkSemaphoreCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSemaphoreCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExportSemaphoreCreateInfo} value to the {@code pNext} chain. */
    public VkSemaphoreCreateInfo pNext(VkExportSemaphoreCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportSemaphoreCreateInfoKHR} value to the {@code pNext} chain. */
    public VkSemaphoreCreateInfo pNext(VkExportSemaphoreCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportSemaphoreWin32HandleInfoKHR} value to the {@code pNext} chain. */
    public VkSemaphoreCreateInfo pNext(VkExportSemaphoreWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSemaphoreTypeCreateInfo} value to the {@code pNext} chain. */
    public VkSemaphoreCreateInfo pNext(VkSemaphoreTypeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSemaphoreTypeCreateInfoKHR} value to the {@code pNext} chain. */
    public VkSemaphoreCreateInfo pNext(VkSemaphoreTypeCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkSemaphoreCreateInfo flags(@NativeType("VkSemaphoreCreateFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreCreateInfo set(
        int sType,
        long pNext,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreCreateInfo set(VkSemaphoreCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreCreateInfo malloc() {
        return wrap(VkSemaphoreCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreCreateInfo calloc() {
        return wrap(VkSemaphoreCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreCreateInfo} instance for the specified memory address. */
    public static VkSemaphoreCreateInfo create(long address) {
        return wrap(VkSemaphoreCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSemaphoreCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreCreateInfo malloc(MemoryStack stack) {
        return wrap(VkSemaphoreCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreCreateInfo calloc(MemoryStack stack) {
        return wrap(VkSemaphoreCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreCreateInfo.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreCreateInfo.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreCreateInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreCreateInfo ELEMENT_FACTORY = VkSemaphoreCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSemaphoreCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkSemaphoreCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkSemaphoreCreateInfo#flags} field. */
        @NativeType("VkSemaphoreCreateFlags")
        public int flags() { return VkSemaphoreCreateInfo.nflags(address()); }

        /** Sets the specified value to the {@link VkSemaphoreCreateInfo#sType} field. */
        public VkSemaphoreCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO} value to the {@link VkSemaphoreCreateInfo#sType} field. */
        public VkSemaphoreCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkSemaphoreCreateInfo#pNext} field. */
        public VkSemaphoreCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExportSemaphoreCreateInfo} value to the {@code pNext} chain. */
        public VkSemaphoreCreateInfo.Buffer pNext(VkExportSemaphoreCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportSemaphoreCreateInfoKHR} value to the {@code pNext} chain. */
        public VkSemaphoreCreateInfo.Buffer pNext(VkExportSemaphoreCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportSemaphoreWin32HandleInfoKHR} value to the {@code pNext} chain. */
        public VkSemaphoreCreateInfo.Buffer pNext(VkExportSemaphoreWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSemaphoreTypeCreateInfo} value to the {@code pNext} chain. */
        public VkSemaphoreCreateInfo.Buffer pNext(VkSemaphoreTypeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSemaphoreTypeCreateInfoKHR} value to the {@code pNext} chain. */
        public VkSemaphoreCreateInfo.Buffer pNext(VkSemaphoreTypeCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkSemaphoreCreateInfo#flags} field. */
        public VkSemaphoreCreateInfo.Buffer flags(@NativeType("VkSemaphoreCreateFlags") int value) { VkSemaphoreCreateInfo.nflags(address(), value); return this; }

    }

}