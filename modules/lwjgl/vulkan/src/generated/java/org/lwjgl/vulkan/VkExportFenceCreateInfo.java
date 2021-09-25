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
 * Structure specifying handle types that can be exported from a fence.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The bits in {@code handleTypes} <b>must</b> be supported and compatible, as reported by {@link VkExternalFenceProperties}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO}</li>
 * <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalFenceHandleTypeFlagBits} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportFenceCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkExternalFenceHandleTypeFlags {@link #handleTypes};
 * }</code></pre>
 */
public class VkExportFenceCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPES;

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
        HANDLETYPES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkExportFenceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportFenceCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkExternalFenceHandleTypeFlagBits} specifying one or more fence handle types the application <b>can</b> export from the resulting fence. The application <b>can</b> request multiple handle types for the same fence. */
    @NativeType("VkExternalFenceHandleTypeFlags")
    public int handleTypes() { return nhandleTypes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportFenceCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO} value to the {@link #sType} field. */
    public VkExportFenceCreateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportFenceCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #handleTypes} field. */
    public VkExportFenceCreateInfo handleTypes(@NativeType("VkExternalFenceHandleTypeFlags") int value) { nhandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportFenceCreateInfo set(
        int sType,
        long pNext,
        int handleTypes
    ) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportFenceCreateInfo set(VkExportFenceCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportFenceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportFenceCreateInfo malloc() {
        return wrap(VkExportFenceCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExportFenceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportFenceCreateInfo calloc() {
        return wrap(VkExportFenceCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExportFenceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkExportFenceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExportFenceCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExportFenceCreateInfo} instance for the specified memory address. */
    public static VkExportFenceCreateInfo create(long address) {
        return wrap(VkExportFenceCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportFenceCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkExportFenceCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkExportFenceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportFenceCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportFenceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportFenceCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportFenceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportFenceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExportFenceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportFenceCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportFenceCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportFenceCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportFenceCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportFenceCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportFenceCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportFenceCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportFenceCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportFenceCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportFenceCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExportFenceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportFenceCreateInfo malloc(MemoryStack stack) {
        return wrap(VkExportFenceCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExportFenceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportFenceCreateInfo calloc(MemoryStack stack) {
        return wrap(VkExportFenceCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportFenceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportFenceCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportFenceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportFenceCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportFenceCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportFenceCreateInfo.PNEXT); }
    /** Unsafe version of {@link #handleTypes}. */
    public static int nhandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExportFenceCreateInfo.HANDLETYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportFenceCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportFenceCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #handleTypes(int) handleTypes}. */
    public static void nhandleTypes(long struct, int value) { UNSAFE.putInt(null, struct + VkExportFenceCreateInfo.HANDLETYPES, value); }

    // -----------------------------------

    /** An array of {@link VkExportFenceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkExportFenceCreateInfo, Buffer> implements NativeResource {

        private static final VkExportFenceCreateInfo ELEMENT_FACTORY = VkExportFenceCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkExportFenceCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportFenceCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkExportFenceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportFenceCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportFenceCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkExportFenceCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportFenceCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkExportFenceCreateInfo#handleTypes} field. */
        @NativeType("VkExternalFenceHandleTypeFlags")
        public int handleTypes() { return VkExportFenceCreateInfo.nhandleTypes(address()); }

        /** Sets the specified value to the {@link VkExportFenceCreateInfo#sType} field. */
        public VkExportFenceCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkExportFenceCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO} value to the {@link VkExportFenceCreateInfo#sType} field. */
        public VkExportFenceCreateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkExportFenceCreateInfo#pNext} field. */
        public VkExportFenceCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkExportFenceCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportFenceCreateInfo#handleTypes} field. */
        public VkExportFenceCreateInfo.Buffer handleTypes(@NativeType("VkExternalFenceHandleTypeFlags") int value) { VkExportFenceCreateInfo.nhandleTypes(address(), value); return this; }

    }

}