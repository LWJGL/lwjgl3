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
 * Structure describing a Win32 handle semaphore export operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalMemoryHandleTypeFlagBits} for a description of the properties of the defined external memory handle types.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportMemoryAllocateInfo}{@code ::handleTypes} when {@code memory} was created</li>
 * <li>If {@code handleType} is defined as an NT handle, {@link KHRExternalMemoryWin32#vkGetMemoryWin32HandleKHR GetMemoryWin32HandleKHR} <b>must</b> be called no more than once for each valid unique combination of {@code memory} and {@code handleType}</li>
 * <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalMemoryWin32#vkGetMemoryWin32HandleKHR GetMemoryWin32HandleKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryGetWin32HandleInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceMemory {@link #memory};
 *     VkExternalMemoryHandleTypeFlagBits {@link #handleType};
 * }</code></pre>
 */
public class VkMemoryGetWin32HandleInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY,
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
        MEMORY = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkMemoryGetWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryGetWin32HandleInfoKHR(ByteBuffer container) {
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
    /** the memory object from which the handle will be exported. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the type of handle requested. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryGetWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR} value to the {@link #sType} field. */
    public VkMemoryGetWin32HandleInfoKHR sType$Default() { return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryGetWin32HandleInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkMemoryGetWin32HandleInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkMemoryGetWin32HandleInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryGetWin32HandleInfoKHR set(
        int sType,
        long pNext,
        long memory,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);
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
    public VkMemoryGetWin32HandleInfoKHR set(VkMemoryGetWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryGetWin32HandleInfoKHR malloc() {
        return wrap(VkMemoryGetWin32HandleInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryGetWin32HandleInfoKHR calloc() {
        return wrap(VkMemoryGetWin32HandleInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryGetWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryGetWin32HandleInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance for the specified memory address. */
    public static VkMemoryGetWin32HandleInfoKHR create(long address) {
        return wrap(VkMemoryGetWin32HandleInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryGetWin32HandleInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryGetWin32HandleInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryGetWin32HandleInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetWin32HandleInfoKHR malloc(MemoryStack stack) {
        return wrap(VkMemoryGetWin32HandleInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetWin32HandleInfoKHR calloc(MemoryStack stack) {
        return wrap(VkMemoryGetWin32HandleInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryGetWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryGetWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkMemoryGetWin32HandleInfoKHR.MEMORY); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryGetWin32HandleInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryGetWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryGetWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryGetWin32HandleInfoKHR.MEMORY, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryGetWin32HandleInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryGetWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryGetWin32HandleInfoKHR, Buffer> implements NativeResource {

        private static final VkMemoryGetWin32HandleInfoKHR ELEMENT_FACTORY = VkMemoryGetWin32HandleInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryGetWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryGetWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryGetWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryGetWin32HandleInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryGetWin32HandleInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkMemoryGetWin32HandleInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryGetWin32HandleInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkMemoryGetWin32HandleInfoKHR#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryGetWin32HandleInfoKHR.nmemory(address()); }
        /** @return the value of the {@link VkMemoryGetWin32HandleInfoKHR#handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkMemoryGetWin32HandleInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@link VkMemoryGetWin32HandleInfoKHR#sType} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryGetWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR} value to the {@link VkMemoryGetWin32HandleInfoKHR#sType} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer sType$Default() { return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR); }
        /** Sets the specified value to the {@link VkMemoryGetWin32HandleInfoKHR#pNext} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryGetWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryGetWin32HandleInfoKHR#memory} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryGetWin32HandleInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryGetWin32HandleInfoKHR#handleType} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkMemoryGetWin32HandleInfoKHR.nhandleType(address(), value); return this; }

    }

}