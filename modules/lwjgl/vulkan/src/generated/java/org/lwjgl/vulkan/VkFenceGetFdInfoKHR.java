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
 * Structure describing a POSIX FD fence export operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The properties of the file descriptor returned depend on the value of {@code handleType}. See {@code VkExternalFenceHandleTypeFlagBits} for a description of the properties of the defined external fence handle types.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportFenceCreateInfo}{@code ::handleTypes} when {@code fence}’s current payload was created</li>
 * <li>If {@code handleType} refers to a handle type with copy payload transference semantics, {@code fence} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fences-signaling">fence signal operation</a> pending execution</li>
 * <li>{@code fence} <b>must</b> not currently have its payload replaced by an imported payload as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fences-importing">Importing Fence Payloads</a> unless that imported payload’s handle type was included in {@link VkExternalFenceProperties}{@code ::exportFromImportedHandleTypes} for {@code handleType}</li>
 * <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalFenceFd#VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalFenceFd#vkGetFenceFdKHR GetFenceFdKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFenceGetFdInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFence {@link #fence};
 *     VkExternalFenceHandleTypeFlagBits {@link #handleType};
 * }</code></pre>
 */
public class VkFenceGetFdInfoKHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkFenceGetFdInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFenceGetFdInfoKHR(ByteBuffer container) {
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
    /** the fence from which state will be exported. */
    @NativeType("VkFence")
    public long fence() { return nfence(address()); }
    /** a {@code VkExternalFenceHandleTypeFlagBits} value specifying the type of handle requested. */
    @NativeType("VkExternalFenceHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFenceGetFdInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalFenceFd#VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR} value to the {@link #sType} field. */
    public VkFenceGetFdInfoKHR sType$Default() { return sType(KHRExternalFenceFd.VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFenceGetFdInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fence} field. */
    public VkFenceGetFdInfoKHR fence(@NativeType("VkFence") long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkFenceGetFdInfoKHR handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFenceGetFdInfoKHR set(
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
    public VkFenceGetFdInfoKHR set(VkFenceGetFdInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFenceGetFdInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFenceGetFdInfoKHR malloc() {
        return wrap(VkFenceGetFdInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFenceGetFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFenceGetFdInfoKHR calloc() {
        return wrap(VkFenceGetFdInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFenceGetFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFenceGetFdInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFenceGetFdInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFenceGetFdInfoKHR} instance for the specified memory address. */
    public static VkFenceGetFdInfoKHR create(long address) {
        return wrap(VkFenceGetFdInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFenceGetFdInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkFenceGetFdInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFenceGetFdInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFenceGetFdInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFenceGetFdInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFenceGetFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFenceGetFdInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFenceGetFdInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFenceGetFdInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFenceGetFdInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFenceGetFdInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFenceGetFdInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFenceGetFdInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFenceGetFdInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFenceGetFdInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFenceGetFdInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFenceGetFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFenceGetFdInfoKHR malloc(MemoryStack stack) {
        return wrap(VkFenceGetFdInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFenceGetFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFenceGetFdInfoKHR calloc(MemoryStack stack) {
        return wrap(VkFenceGetFdInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFenceGetFdInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFenceGetFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFenceGetFdInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFenceGetFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFenceGetFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return UNSAFE.getLong(null, struct + VkFenceGetFdInfoKHR.FENCE); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkFenceGetFdInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFenceGetFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFenceGetFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { UNSAFE.putLong(null, struct + VkFenceGetFdInfoKHR.FENCE, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkFenceGetFdInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkFenceGetFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkFenceGetFdInfoKHR, Buffer> implements NativeResource {

        private static final VkFenceGetFdInfoKHR ELEMENT_FACTORY = VkFenceGetFdInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkFenceGetFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFenceGetFdInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkFenceGetFdInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFenceGetFdInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFenceGetFdInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkFenceGetFdInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFenceGetFdInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkFenceGetFdInfoKHR#fence} field. */
        @NativeType("VkFence")
        public long fence() { return VkFenceGetFdInfoKHR.nfence(address()); }
        /** @return the value of the {@link VkFenceGetFdInfoKHR#handleType} field. */
        @NativeType("VkExternalFenceHandleTypeFlagBits")
        public int handleType() { return VkFenceGetFdInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@link VkFenceGetFdInfoKHR#sType} field. */
        public VkFenceGetFdInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFenceGetFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalFenceFd#VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR} value to the {@link VkFenceGetFdInfoKHR#sType} field. */
        public VkFenceGetFdInfoKHR.Buffer sType$Default() { return sType(KHRExternalFenceFd.VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR); }
        /** Sets the specified value to the {@link VkFenceGetFdInfoKHR#pNext} field. */
        public VkFenceGetFdInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkFenceGetFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkFenceGetFdInfoKHR#fence} field. */
        public VkFenceGetFdInfoKHR.Buffer fence(@NativeType("VkFence") long value) { VkFenceGetFdInfoKHR.nfence(address(), value); return this; }
        /** Sets the specified value to the {@link VkFenceGetFdInfoKHR#handleType} field. */
        public VkFenceGetFdInfoKHR.Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) { VkFenceGetFdInfoKHR.nhandleType(address(), value); return this; }

    }

}