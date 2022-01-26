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
 * Structure describing advanced blending features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #advancedBlendCoherentOperations};
 * }</code></pre>
 */
public class VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADVANCEDBLENDCOHERENTOPERATIONS;

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
        ADVANCEDBLENDCOHERENTOPERATIONS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(ByteBuffer container) {
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
    /** specifies whether blending using <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-blend-advanced">advanced blend operations</a> is guaranteed to execute atomically and in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-primitive-order">primitive order</a>. If this is {@link VK10#VK_TRUE TRUE}, {@link EXTBlendOperationAdvanced#VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT} is treated the same as {@link VK10#VK_ACCESS_COLOR_ATTACHMENT_READ_BIT ACCESS_COLOR_ATTACHMENT_READ_BIT}, and advanced blending needs no additional synchronization over basic blending. If this is {@link VK10#VK_FALSE FALSE}, then memory dependencies are required to guarantee order between two advanced blending operations that occur on the same sample. */
    @NativeType("VkBool32")
    public boolean advancedBlendCoherentOperations() { return nadvancedBlendCoherentOperations(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT sType$Default() { return sType(EXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #advancedBlendCoherentOperations} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT advancedBlendCoherentOperations(@NativeType("VkBool32") boolean value) { nadvancedBlendCoherentOperations(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT set(
        int sType,
        long pNext,
        boolean advancedBlendCoherentOperations
    ) {
        sType(sType);
        pNext(pNext);
        advancedBlendCoherentOperations(advancedBlendCoherentOperations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT set(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #advancedBlendCoherentOperations}. */
    public static int nadvancedBlendCoherentOperations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.ADVANCEDBLENDCOHERENTOPERATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #advancedBlendCoherentOperations(boolean) advancedBlendCoherentOperations}. */
    public static void nadvancedBlendCoherentOperations(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.ADVANCEDBLENDCOHERENTOPERATIONS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#advancedBlendCoherentOperations} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendCoherentOperations() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nadvancedBlendCoherentOperations(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#sType} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT} value to the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#sType} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer sType$Default() { return sType(EXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#advancedBlendCoherentOperations} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer advancedBlendCoherentOperations(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nadvancedBlendCoherentOperations(address(), value ? 1 : 0); return this; }

    }

}