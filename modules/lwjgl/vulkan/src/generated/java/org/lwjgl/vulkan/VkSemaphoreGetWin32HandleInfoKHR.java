/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing a Win32 handle semaphore export operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBits} for a description of the properties of the defined external semaphore handle types.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportSemaphoreCreateInfo}{@code ::handleTypes} when the {@code semaphore}’s current payload was created</li>
 * <li>If {@code handleType} is defined as an NT handle, {@link KHRExternalSemaphoreWin32#vkGetSemaphoreWin32HandleKHR GetSemaphoreWin32HandleKHR} <b>must</b> be called no more than once for each valid unique combination of {@code semaphore} and {@code handleType}</li>
 * <li>{@code semaphore} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-importing">Importing Semaphore Payloads</a> unless that imported payload’s handle type was included in {@link VkExternalSemaphoreProperties}{@code ::exportFromImportedHandleTypes} for {@code handleType}</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, as defined below in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, there <b>must</b> be no queue waiting on {@code semaphore}</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution</li>
 * <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalSemaphoreWin32#VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalSemaphoreWin32#vkGetSemaphoreWin32HandleKHR GetSemaphoreWin32HandleKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreGetWin32HandleInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphore {@link #semaphore};
 *     VkExternalSemaphoreHandleTypeFlagBits {@link #handleType};
 * }</code></pre>
 */
public class VkSemaphoreGetWin32HandleInfoKHR extends Struct<VkSemaphoreGetWin32HandleInfoKHR> implements NativeResource {

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

    protected VkSemaphoreGetWin32HandleInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSemaphoreGetWin32HandleInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSemaphoreGetWin32HandleInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkSemaphoreGetWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreGetWin32HandleInfoKHR(ByteBuffer container) {
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
    /** the semaphore from which state will be exported. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** a {@code VkExternalSemaphoreHandleTypeFlagBits} value specifying the type of handle requested. */
    @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSemaphoreGetWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalSemaphoreWin32#VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR} value to the {@link #sType} field. */
    public VkSemaphoreGetWin32HandleInfoKHR sType$Default() { return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSemaphoreGetWin32HandleInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphore} field. */
    public VkSemaphoreGetWin32HandleInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkSemaphoreGetWin32HandleInfoKHR handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreGetWin32HandleInfoKHR set(
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
    public VkSemaphoreGetWin32HandleInfoKHR set(VkSemaphoreGetWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreGetWin32HandleInfoKHR malloc() {
        return new VkSemaphoreGetWin32HandleInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreGetWin32HandleInfoKHR calloc() {
        return new VkSemaphoreGetWin32HandleInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreGetWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreGetWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreGetWin32HandleInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreGetWin32HandleInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreGetWin32HandleInfoKHR create(long address) {
        return new VkSemaphoreGetWin32HandleInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSemaphoreGetWin32HandleInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkSemaphoreGetWin32HandleInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSemaphoreGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetWin32HandleInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetWin32HandleInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreGetWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetWin32HandleInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSemaphoreGetWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetWin32HandleInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSemaphoreGetWin32HandleInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetWin32HandleInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetWin32HandleInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetWin32HandleInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetWin32HandleInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetWin32HandleInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetWin32HandleInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetWin32HandleInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSemaphoreGetWin32HandleInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSemaphoreGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreGetWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreGetWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSemaphoreGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreGetWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreGetWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSemaphoreGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetWin32HandleInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreGetWin32HandleInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSemaphoreGetWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreGetWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return memGetLong(struct + VkSemaphoreGetWin32HandleInfoKHR.SEMAPHORE); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkSemaphoreGetWin32HandleInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSemaphoreGetWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreGetWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { memPutLong(struct + VkSemaphoreGetWin32HandleInfoKHR.SEMAPHORE, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkSemaphoreGetWin32HandleInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreGetWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreGetWin32HandleInfoKHR, Buffer> implements NativeResource {

        private static final VkSemaphoreGetWin32HandleInfoKHR ELEMENT_FACTORY = VkSemaphoreGetWin32HandleInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreGetWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreGetWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkSemaphoreGetWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSemaphoreGetWin32HandleInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreGetWin32HandleInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkSemaphoreGetWin32HandleInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreGetWin32HandleInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkSemaphoreGetWin32HandleInfoKHR#semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkSemaphoreGetWin32HandleInfoKHR.nsemaphore(address()); }
        /** @return the value of the {@link VkSemaphoreGetWin32HandleInfoKHR#handleType} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
        public int handleType() { return VkSemaphoreGetWin32HandleInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@link VkSemaphoreGetWin32HandleInfoKHR#sType} field. */
        public VkSemaphoreGetWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreGetWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalSemaphoreWin32#VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR} value to the {@link VkSemaphoreGetWin32HandleInfoKHR#sType} field. */
        public VkSemaphoreGetWin32HandleInfoKHR.Buffer sType$Default() { return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR); }
        /** Sets the specified value to the {@link VkSemaphoreGetWin32HandleInfoKHR#pNext} field. */
        public VkSemaphoreGetWin32HandleInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreGetWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreGetWin32HandleInfoKHR#semaphore} field. */
        public VkSemaphoreGetWin32HandleInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreGetWin32HandleInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreGetWin32HandleInfoKHR#handleType} field. */
        public VkSemaphoreGetWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkSemaphoreGetWin32HandleInfoKHR.nhandleType(address(), value); return this; }

    }

}