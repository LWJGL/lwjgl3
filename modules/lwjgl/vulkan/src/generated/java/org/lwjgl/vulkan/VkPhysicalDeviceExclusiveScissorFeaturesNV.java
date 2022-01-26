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
 * Structure describing exclusive scissor features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-exclusive-scissor">Exclusive Scissor Test</a> for more information.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVScissorExclusive#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExclusiveScissorFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #exclusiveScissor};
 * }</code></pre>
 */
public class VkPhysicalDeviceExclusiveScissorFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXCLUSIVESCISSOR;

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
        EXCLUSIVESCISSOR = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExclusiveScissorFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExclusiveScissorFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports the exclusive scissor test. */
    @NativeType("VkBool32")
    public boolean exclusiveScissor() { return nexclusiveScissor(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceExclusiveScissorFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVScissorExclusive#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceExclusiveScissorFeaturesNV sType$Default() { return sType(NVScissorExclusive.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceExclusiveScissorFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #exclusiveScissor} field. */
    public VkPhysicalDeviceExclusiveScissorFeaturesNV exclusiveScissor(@NativeType("VkBool32") boolean value) { nexclusiveScissor(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExclusiveScissorFeaturesNV set(
        int sType,
        long pNext,
        boolean exclusiveScissor
    ) {
        sType(sType);
        pNext(pNext);
        exclusiveScissor(exclusiveScissor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExclusiveScissorFeaturesNV set(VkPhysicalDeviceExclusiveScissorFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExclusiveScissorFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceExclusiveScissorFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExclusiveScissorFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceExclusiveScissorFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExclusiveScissorFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceExclusiveScissorFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExclusiveScissorFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceExclusiveScissorFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceExclusiveScissorFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExclusiveScissorFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExclusiveScissorFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExclusiveScissorFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExclusiveScissorFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceExclusiveScissorFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExclusiveScissorFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExclusiveScissorFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExclusiveScissorFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExclusiveScissorFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExclusiveScissorFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #exclusiveScissor}. */
    public static int nexclusiveScissor(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExclusiveScissorFeaturesNV.EXCLUSIVESCISSOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExclusiveScissorFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExclusiveScissorFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #exclusiveScissor(boolean) exclusiveScissor}. */
    public static void nexclusiveScissor(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExclusiveScissorFeaturesNV.EXCLUSIVESCISSOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExclusiveScissorFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExclusiveScissorFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceExclusiveScissorFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExclusiveScissorFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceExclusiveScissorFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceExclusiveScissorFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExclusiveScissorFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExclusiveScissorFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExclusiveScissorFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExclusiveScissorFeaturesNV#exclusiveScissor} field. */
        @NativeType("VkBool32")
        public boolean exclusiveScissor() { return VkPhysicalDeviceExclusiveScissorFeaturesNV.nexclusiveScissor(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceExclusiveScissorFeaturesNV#sType} field. */
        public VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExclusiveScissorFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVScissorExclusive#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV} value to the {@link VkPhysicalDeviceExclusiveScissorFeaturesNV#sType} field. */
        public VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer sType$Default() { return sType(NVScissorExclusive.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceExclusiveScissorFeaturesNV#pNext} field. */
        public VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExclusiveScissorFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExclusiveScissorFeaturesNV#exclusiveScissor} field. */
        public VkPhysicalDeviceExclusiveScissorFeaturesNV.Buffer exclusiveScissor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExclusiveScissorFeaturesNV.nexclusiveScissor(address(), value ? 1 : 0); return this; }

    }

}