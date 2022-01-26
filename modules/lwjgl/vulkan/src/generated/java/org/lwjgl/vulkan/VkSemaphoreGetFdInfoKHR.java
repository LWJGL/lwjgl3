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
 * Structure describing a POSIX FD semaphore export operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The properties of the file descriptor returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBits} for a description of the properties of the defined external semaphore handle types.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportSemaphoreCreateInfo}{@code ::handleTypes} when {@code semaphore}’s current payload was created</li>
 * <li>{@code semaphore} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-importing">Importing Semaphore Payloads</a> unless that imported payload’s handle type was included in {@link VkExternalSemaphoreProperties}{@code ::exportFromImportedHandleTypes} for {@code handleType}</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, as defined below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, there <b>must</b> be no queue waiting on {@code semaphore}</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution</li>
 * <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> have been created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_BINARY SEMAPHORE_TYPE_BINARY}</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> have an associated semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalSemaphoreFd#VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalSemaphoreFd#vkGetSemaphoreFdKHR GetSemaphoreFdKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreGetFdInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphore {@link #semaphore};
 *     VkExternalSemaphoreHandleTypeFlagBits {@link #handleType};
 * }</code></pre>
 */
public class VkSemaphoreGetFdInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORE,
        HANDLETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkSemaphoreGetFdInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreGetFdInfoKHR(ByteBuffer container) {
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
    /** the semaphore from which state will be exported. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** a {@code VkExternalSemaphoreHandleTypeFlagBits} value specifying the type of handle requested. */
    @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSemaphoreGetFdInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalSemaphoreFd#VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR} value to the {@link #sType} field. */
    public VkSemaphoreGetFdInfoKHR sType$Default() { return sType(KHRExternalSemaphoreFd.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSemaphoreGetFdInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphore} field. */
    public VkSemaphoreGetFdInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkSemaphoreGetFdInfoKHR handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreGetFdInfoKHR set(
        int sType,
        long pNext,
        long semaphore,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreGetFdInfoKHR set(VkSemaphoreGetFdInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreGetFdInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreGetFdInfoKHR malloc() {
        return wrap(VkSemaphoreGetFdInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreGetFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreGetFdInfoKHR calloc() {
        return wrap(VkSemaphoreGetFdInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreGetFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreGetFdInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreGetFdInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreGetFdInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreGetFdInfoKHR create(long address) {
        return wrap(VkSemaphoreGetFdInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreGetFdInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreGetFdInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreGetFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetFdInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreGetFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetFdInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreGetFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetFdInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreGetFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetFdInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreGetFdInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetFdInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetFdInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetFdInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetFdInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetFdInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetFdInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetFdInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetFdInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSemaphoreGetFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreGetFdInfoKHR malloc(MemoryStack stack) {
        return wrap(VkSemaphoreGetFdInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreGetFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreGetFdInfoKHR calloc(MemoryStack stack) {
        return wrap(VkSemaphoreGetFdInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreGetFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetFdInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreGetFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetFdInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreGetFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreGetFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreGetFdInfoKHR.SEMAPHORE); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreGetFdInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreGetFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreGetFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreGetFdInfoKHR.SEMAPHORE, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreGetFdInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreGetFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreGetFdInfoKHR, Buffer> implements NativeResource {

        private static final VkSemaphoreGetFdInfoKHR ELEMENT_FACTORY = VkSemaphoreGetFdInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreGetFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreGetFdInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreGetFdInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSemaphoreGetFdInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreGetFdInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkSemaphoreGetFdInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreGetFdInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkSemaphoreGetFdInfoKHR#semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkSemaphoreGetFdInfoKHR.nsemaphore(address()); }
        /** @return the value of the {@link VkSemaphoreGetFdInfoKHR#handleType} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
        public int handleType() { return VkSemaphoreGetFdInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@link VkSemaphoreGetFdInfoKHR#sType} field. */
        public VkSemaphoreGetFdInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreGetFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalSemaphoreFd#VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR} value to the {@link VkSemaphoreGetFdInfoKHR#sType} field. */
        public VkSemaphoreGetFdInfoKHR.Buffer sType$Default() { return sType(KHRExternalSemaphoreFd.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR); }
        /** Sets the specified value to the {@link VkSemaphoreGetFdInfoKHR#pNext} field. */
        public VkSemaphoreGetFdInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreGetFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreGetFdInfoKHR#semaphore} field. */
        public VkSemaphoreGetFdInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreGetFdInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreGetFdInfoKHR#handleType} field. */
        public VkSemaphoreGetFdInfoKHR.Buffer handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkSemaphoreGetFdInfoKHR.nhandleType(address(), value); return this; }

    }

}