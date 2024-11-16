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
 * Structure describing a Win32 handle fence export operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalFenceHandleTypeFlagBits} for a description of the properties of the defined external fence handle types.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportFenceCreateInfo}{@code ::handleTypes} when the {@code fence}’s current payload was created</li>
 * <li>If {@code handleType} is defined as an NT handle, {@link KHRExternalFenceWin32#vkGetFenceWin32HandleKHR GetFenceWin32HandleKHR} <b>must</b> be called no more than once for each valid unique combination of {@code fence} and {@code handleType}</li>
 * <li>{@code fence} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fences-importing">Importing Fence Payloads</a> unless that imported payload’s handle type was included in {@link VkExternalFenceProperties}{@code ::exportFromImportedHandleTypes} for {@code handleType}</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code fence} <b>must</b> be signaled, or have an associated <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fences-signaling">fence signal operation</a> pending execution</li>
 * <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalFenceWin32#VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalFenceWin32#vkGetFenceWin32HandleKHR GetFenceWin32HandleKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFenceGetWin32HandleInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFence {@link #fence};
 *     VkExternalFenceHandleTypeFlagBits {@link #handleType};
 * }</code></pre>
 */
public class VkFenceGetWin32HandleInfoKHR extends Struct<VkFenceGetWin32HandleInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FENCE,
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
        FENCE = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    protected VkFenceGetWin32HandleInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFenceGetWin32HandleInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkFenceGetWin32HandleInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkFenceGetWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFenceGetWin32HandleInfoKHR(ByteBuffer container) {
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
    /** the fence from which state will be exported. */
    @NativeType("VkFence")
    public long fence() { return nfence(address()); }
    /** a {@code VkExternalFenceHandleTypeFlagBits} value specifying the type of handle requested. */
    @NativeType("VkExternalFenceHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFenceGetWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalFenceWin32#VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR} value to the {@link #sType} field. */
    public VkFenceGetWin32HandleInfoKHR sType$Default() { return sType(KHRExternalFenceWin32.VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFenceGetWin32HandleInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fence} field. */
    public VkFenceGetWin32HandleInfoKHR fence(@NativeType("VkFence") long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkFenceGetWin32HandleInfoKHR handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFenceGetWin32HandleInfoKHR set(
        int sType,
        long pNext,
        long fence,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        fence(fence);
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
    public VkFenceGetWin32HandleInfoKHR set(VkFenceGetWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFenceGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFenceGetWin32HandleInfoKHR malloc() {
        return new VkFenceGetWin32HandleInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFenceGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFenceGetWin32HandleInfoKHR calloc() {
        return new VkFenceGetWin32HandleInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFenceGetWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFenceGetWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFenceGetWin32HandleInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkFenceGetWin32HandleInfoKHR} instance for the specified memory address. */
    public static VkFenceGetWin32HandleInfoKHR create(long address) {
        return new VkFenceGetWin32HandleInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFenceGetWin32HandleInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkFenceGetWin32HandleInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkFenceGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFenceGetWin32HandleInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFenceGetWin32HandleInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFenceGetWin32HandleInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFenceGetWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFenceGetWin32HandleInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFenceGetWin32HandleInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFenceGetWin32HandleInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFenceGetWin32HandleInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFenceGetWin32HandleInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFenceGetWin32HandleInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFenceGetWin32HandleInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFenceGetWin32HandleInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFenceGetWin32HandleInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFenceGetWin32HandleInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFenceGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFenceGetWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkFenceGetWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFenceGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFenceGetWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkFenceGetWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFenceGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFenceGetWin32HandleInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFenceGetWin32HandleInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFenceGetWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFenceGetWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return memGetLong(struct + VkFenceGetWin32HandleInfoKHR.FENCE); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkFenceGetWin32HandleInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFenceGetWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFenceGetWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { memPutLong(struct + VkFenceGetWin32HandleInfoKHR.FENCE, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkFenceGetWin32HandleInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkFenceGetWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkFenceGetWin32HandleInfoKHR, Buffer> implements NativeResource {

        private static final VkFenceGetWin32HandleInfoKHR ELEMENT_FACTORY = VkFenceGetWin32HandleInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkFenceGetWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFenceGetWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFenceGetWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFenceGetWin32HandleInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFenceGetWin32HandleInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkFenceGetWin32HandleInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFenceGetWin32HandleInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkFenceGetWin32HandleInfoKHR#fence} field. */
        @NativeType("VkFence")
        public long fence() { return VkFenceGetWin32HandleInfoKHR.nfence(address()); }
        /** @return the value of the {@link VkFenceGetWin32HandleInfoKHR#handleType} field. */
        @NativeType("VkExternalFenceHandleTypeFlagBits")
        public int handleType() { return VkFenceGetWin32HandleInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@link VkFenceGetWin32HandleInfoKHR#sType} field. */
        public VkFenceGetWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFenceGetWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalFenceWin32#VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR} value to the {@link VkFenceGetWin32HandleInfoKHR#sType} field. */
        public VkFenceGetWin32HandleInfoKHR.Buffer sType$Default() { return sType(KHRExternalFenceWin32.VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR); }
        /** Sets the specified value to the {@link VkFenceGetWin32HandleInfoKHR#pNext} field. */
        public VkFenceGetWin32HandleInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkFenceGetWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkFenceGetWin32HandleInfoKHR#fence} field. */
        public VkFenceGetWin32HandleInfoKHR.Buffer fence(@NativeType("VkFence") long value) { VkFenceGetWin32HandleInfoKHR.nfence(address(), value); return this; }
        /** Sets the specified value to the {@link VkFenceGetWin32HandleInfoKHR#handleType} field. */
        public VkFenceGetWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) { VkFenceGetWin32HandleInfoKHR.nhandleType(address(), value); return this; }

    }

}